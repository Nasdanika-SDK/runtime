# File Model

> **Sketch.** The model source is [`file.xcore`](file.xcore). The design, and the reasoning
> behind each decision, is in [reactive-file-system.md](../../reactive-file-system.md). Module path
> `models/file`, nsURI `https://runtime.sdk.nasdanika.org/models/file`.

Files and directories as a model. The API that agents, the CLI, the reflective viewer and queries
use over any file system the runtime can reach: a local directory, a zip, an in-memory sandbox, a
Git repository over the GitHub API, or a model presented as files.

## Why a model

* **Operations are tools.** A reflectively invocable operation has a name, parameters, types and
  documentation, which is everything a tool declaration needs. `TextFile.view`, `replace` and
  `insert` are an agent's file tools, and a specialized file type adds tools by subclassing:
  `JsonFile.query`, `XcoreFile.validate`, `DrawioFile.pages`.
* **A file system becomes queryable and viewable.** XPath and Cypher run over a repository; the
  reflective viewer shows a directory.
* **Snapshots serialize.** A tree can be detached and saved as JSON or binary: a test fixture, a
  sandbox base in one file, the before and after states of an agent run next to its recorded
  session.

## The name

`file`, singular, in line with the other models (`kind`, `change`, `tool`, `example`):

* It names what the model is about. `filesystem` overclaims: the file system is the backend,
  which is the `volume` SPI; this model is files and directories over it.
* It reads well in every identity the runtime derives from a path: `models/file`,
  `https://runtime.sdk.nasdanika.org/models/file`, `org.nasdanika.sdk.runtime.models.file`,
  `FilePackage`, `FileFactory`. `filesystem` gives `FilesystemPackage`, with its awkward casing.
* The JDK uses the same word for the same job: `java.nio.file`.
* Rejected: `fs` (opaque), `vfs` (Commons VFS), `resource` (EMF's `Resource`), `storage` (says
  where, not what).

The one cost is the class name `File`, next to `java.io.File`. The runtime is JDK-first and uses
`java.nio.file.Path` where it needs the JDK's type, so the two rarely meet in one compilation unit,
and when they do, one is written qualified.

## Layers

| Layer | Module | What | Who uses it |
|---|---|---|---|
| `Volume` | `volume` (JDK only) | The backend SPI: string paths, `stat`, `list`, `content`, optional capabilities, change reports | Implementers: NIO, memory, Git over REST, zip, the model volume. The HTTP handler reads it directly |
| `Content` | `volume` (JDK only) | The state of a file: re-readable, lazy bytes | Both layers |
| This model | `models/file` | `File`, `Directory`, `TextFile`, specialized types, views, operations | Agents, the CLI, the viewer, queries, the reactive runner |

## Classes

| Class | What it adds |
|---|---|
| `Entry` | Name; derived `path`, `hash`, `modified`, `live`; `snapshot()`, `delete()`, `moveTo()` |
| `Directory` | Lazy `children`; paged `list`, `find`, `glob`, `grep`; `createFile`, `createDirectory` |
| `File` | `content` (the one state), `contentType`, derived `size`; `openStream()`, `writeTo()` |
| `TextFile` | `charset`, `lineSeparator`; the `text` view; `lineCount`, `view`, `replace`, `insert`, `grep` |
| `ArchiveFile` | `open()`: a zip or jar as a directory |
| `Link` | `target`. In the model volume, non-containment references are links |
| `Match` | A search result line |

## Content: one state

Eclipse's `IFile` has the right symmetry: a file has content, and you get and set it
(`getContents()`, `setContents(InputStream)`). This model keeps the symmetry and changes the type.
An `InputStream` is one-shot and has unclear ownership, so the state is a
[`Content`](Content.java): a source you can open streams from repeatedly, like Guava's
`ByteSource` and the JDK HTTP client's `BodyPublishers.ofInputStream(Supplier)`.

* **Getting content does no I/O.** Opening it does.
* **Setting content assigns.** Bytes move when something reads the content: the commit of a unit
  of work, the HTTP handler, a hash. Copying a file inside an overlay records a reference, and with
  a Git blob id as `hash()`, a commit reuses the blob without uploading anything.
* **Errors surface at commit**, inside the transaction, not at assignment. Callers used to
  `Files.write` should know.
* **Consumers push when they can.** `writeTo(OutputStream)` for an HTTP response, a local file, a
  digest or an upload body; `openStream()` only when an input stream is required;
  `publisher()` as a `Flow.Publisher<ByteBuffer>` for the JDK HTTP client.

### Content from a writer

`Content.ofWriter(out -> ...)` turns a closure that writes to an output stream into content, and
runs it only when the content is read ([`WriterContent`](WriterContent.java)):

* **Push needs no conversion.** `writeTo` calls the writer on the consumer's stream: no pipe, no
  thread. This is JAX-RS's `StreamingOutput`.
* **Pull gets a lazy pipe.** `openStream()` returns a stream that does nothing until its first
  read, then starts the writer on a virtual thread writing bounded chunks into a queue. A writer's
  failure is rethrown to the reader; closing the reader early cancels the writer. Spring 6.1's
  `DataBufferUtils.outputStreamPublisher` does the same for publishers.
* **Each read runs the writer again**, so the content is repeatable as long as the writer is.
  Saving a resource and encoding text are; a one-shot writer says so.

## Views: typed states over the one state

A [`View<S>`](View.java) decodes the content on `get` and assigns lazily encoded content on `set`,
through a [`Codec<S>`](Codec.java). Two views of one file cannot diverge, because neither holds
state.

| View | `get` | `set` |
|---|---|---|
| Bytes (`File.content`) | `Content` | `Content` |
| Text (`TextFile.text`) | `String`, decoded with `charset` | `CharSequence`, encoded when read |
| JSON (`JsonFile`, elsewhere) | The parsed value | Serialized when read |
| Model (any file loaded as a resource) | The resource's contents | `Content.ofWriter(resource::save)`: saved when read, not when assigned |

`TextFile.text` is a derived attribute implemented by a setting delegate over the text codec.
Specialized types expose their views the same way when the view deserves a feature, and through
`View.of(file, codec)` when it does not.

## Live and snapshot instances

* **Live** instances are bound to a volume. Children load on first access, content comes from the
  backend, and assigned content waits for the unit of work.
* **Snapshot** instances are detached. Children and content live in the model and serialize.
  `Entry.snapshot()` makes one; a zip loaded through its resource factory is one.

One generated class serves both. "Dynamic instance" is avoided on purpose: in EMF it means an object
without generated classes.

## How behaviour is attached

| Mechanism | Used for |
|---|---|
| Invocation delegates (`@Delegate` on operations) | Every operation, routed to the backend for live instances and to the model's content for snapshots. The same pattern as the inference API |
| Setting delegates (`@Delegate` on derived attributes) | `path`, `hash`, `modified`, `live`, `size`, `text` |
| The root base class (`rootExtendsClass`) with `featureDelegation="Dynamic"` | `Directory.children` and `File.content`: generated getters call `eDynamicGet`, so the base class loads children on first access and keeps them as a real containment list (identity holds, `eContainer` is the parent, snapshots serialize), and serves content from the backend until content is assigned |

`rootExtendsClass` applies to every class in the package; the base class is inert for classes that
are not entries, such as `Match`.

## Classification

A file's class is decided by its **content type**, through EMF's `ContentHandler` registry, which
EMF already uses to choose resource factories. Modules contribute [`FileType`](FileType.java)
services mapping a content type to an EClass, a MIME type and a text flag.

1. The extension first: on a remote backend, inspecting content means fetching the blob.
2. Content only when the extension is ambiguous: an `.xml` file's root element and namespace
   (`RootXMLContentHandlerImpl`), a `.json` file's `$schema`.
3. Text or binary: from the file type, or Git's heuristic for unclaimed types (binary if a NUL byte
   appears in the first 8,000 bytes).
4. The same content type selects the resource factory, through
   `ResourceSet.createResource(URI, String contentType)`, so opening a file as a model always agrees
   with how it was classified.

## Tools

`TextFile.view`, `replace` and `insert`, and `Directory.createFile`, carry a `@ToolBinding`
annotation naming Anthropic's `text_editor_20250728` tool and its command. The Anthropic module
binds them to that schema-less tool, which the model is trained on; the OpenAI module sends them as
function tools whose schemas are derived from the operations. Edits preserve the charset and the
line separator, so an agent's change is a small, reviewable diff.

## Watching

Not in this model. The runtime's EMF support publishes changes for any notifier
(`NotifierPublisher`, `ContentNotifierPublisher`), immediately, with transaction boundaries in the
stream; subscribers queue and coalesce. This model contributes its lazy base class and one custom
notification, "subtree changed", which an unloaded directory publishes when the backend reports
changes beneath it.

## Files in this folder

| File | Destined for |
|---|---|
| [`file.xcore`](file.xcore) | `models/file` |
| [`View.java`](View.java), [`Codec.java`](Codec.java), [`FileType.java`](FileType.java) | `models/file`, package `org.nasdanika.sdk.runtime.models.file` |
| [`Volume.java`](Volume.java), [`Content.java`](Content.java), [`WriterContent.java`](WriterContent.java) | `volume`, package `org.nasdanika.sdk.runtime.volume` |

## Open decisions

* **Snapshot content encoding:** base64 inline below a size threshold, a stored blob reference
  above it, and the threshold.
* **`path`:** derived from the containment chain (as sketched) or stored, which matters for
  snapshots moved between trees.
* **`ArchiveFile`:** whether `open()` returns a live directory over a zip volume only, or also
  supports writing back into the archive.
* **The file type registry:** a plain service (as sketched) or a small model, so the registered
  types are documented and queryable like everything else.
