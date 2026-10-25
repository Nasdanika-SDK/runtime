# File model

> Directory `models/file/model` · Maven `org.nasdanika.sdk.runtime.models.file:model` ·
> Java module `org.nasdanika.sdk.runtime.models.file` · Package `https://runtime.sdk.nasdanika.org/models/file` ·
> Part of the [Nasdanika SDK Runtime](https://github.com/Nasdanika-SDK/runtime) · **Sketch**: the model and its
> generated code are here; the behavior of its operations is being attached

Files and directories as a model: the API that agents, the command line, the polymorphic UI and
queries use over any file system the runtime can reach, such as a local directory, a zip, an
in-memory sandbox, a Git repository over the GitHub API, or a model presented as files.

## Why a model

* **Operations are tools.** A reflectively invocable operation has a name, parameters, types and
  documentation, which is everything a tool declaration needs. `TextFile.view`, `replace` and
  `insert` are an agent's file tools, and a specialized file type adds tools by subclassing:
  `JsonFile.query`, `XcoreFile.validate`, `DrawioFile.pages`.
* **A file system becomes queryable and viewable.** Queries run over a repository; the polymorphic
  UI shows a directory.
* **Snapshots serialize.** A tree can be detached and saved as JSON or binary: a test fixture, a
  sandbox base in one file, the before and after states of an agent run next to its recorded
  session.

## The name

`file`, singular, in line with the other models:

* It names what the model is about. `filesystem` overclaims: the file system is the backend, which
  is the `Volume` interface of the `volume` module; this model is files and directories over it.
* It reads well in every identity the runtime derives from a path: `models/file`,
  `https://runtime.sdk.nasdanika.org/models/file`, `org.nasdanika.sdk.runtime.models.file`,
  `FilePackage`, `FileFactory`.
* The JDK uses the same word for the same job: `java.nio.file`.

The one cost is the class name `File`, next to `java.io.File`. The runtime uses
`java.nio.file.Path` where it needs the JDK's type, so the two rarely meet in one compilation unit.

## Layers

| Layer | Module | What | Who uses it |
|---|---|---|---|
| `Volume` | `volume` (JDK only) | The backend interface: string paths, `stat`, `list`, `content`, optional capabilities, change reports | Implementers: directories, memory, Git over REST, zip, the model volume. The HTTP and WebDAV handlers read it directly |
| `Content` | `volume` (JDK only) | The state of a file: re-readable, lazy bytes | Both layers |
| This model | `models/file` | `File`, `Directory`, `TextFile`, specialized types, views, operations | Agents, the command line, the viewer, queries |

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

Eclipse's `IFile` has the right symmetry: a file has content, and you get and set it. This model
keeps the symmetry and changes the type. An `InputStream` is one-shot and has unclear ownership, so
the state is a `Content` of the `volume` module: a source you can open streams from repeatedly, like
Guava's `ByteSource` and the JDK HTTP client's `BodyPublishers.ofInputStream(Supplier)`.

* **Getting content does no I/O.** Opening it does.
* **Setting content assigns.** Bytes move when something reads the content: the commit of a unit of
  work, the HTTP handler, a hash. Copying a file inside an overlay records a reference, and with a
  Git blob id as its hash, a commit reuses the blob without uploading anything.
* **Errors surface at commit**, inside the transaction, not at assignment. Callers used to
  `Files.write` should know.
* **Consumers push when they can**: `writeTo(OutputStream)` for an HTTP response, a local file, a
  digest or an upload body, and `openStream()` only when an input stream is required.

`Content.ofWriter(out -> ...)` turns a closure that writes to an output stream into content and runs
it only when the content is read: directly on the consumer's stream when pushed, through a lazy pipe
on a virtual thread when pulled. Each read runs the writer again, so the content is repeatable as
long as the writer is. `Content`, its writer and the volumes over directories are available in the
`volume` module.

## Views: typed states over the one state

A `View<S>` decodes the content on `get` and assigns lazily encoded content on `set`, through a
`Codec<S>`. Two views of one file cannot diverge, because neither holds state.

| View | `get` | `set` |
|---|---|---|
| Bytes (`File.content`) | `Content` | `Content` |
| Text (`TextFile.text`) | `String`, decoded with `charset` | `CharSequence`, encoded when read |
| JSON, in a specialized type | The parsed value | Serialized when read |
| Model, any file loaded as a resource | The resource's contents | `Content.ofWriter(resource::save)`: saved when read, not when assigned |

## Live and snapshot instances

* **Live** instances are bound to a volume. Children load on first access, content comes from the
  backend, and assigned content waits for the unit of work.
* **Snapshot** instances are detached. Children and content live in the model and serialize.
  `Entry.snapshot()` makes one; a zip loaded through its resource factory is one.

One generated class serves both. "Dynamic instance" is avoided on purpose: in EMF it means an object
without generated classes.

## How behavior is attached

| Mechanism | Used for |
|---|---|
| Invocation delegates, declared with `@Delegate` on operations | Every operation, routed to the backend for live instances and to the model's content for snapshots |
| Setting delegates, declared with `@Delegate` on derived attributes | `path`, `hash`, `modified`, `live`, `size`, `text` |
| A root base class with dynamic feature delegation | `Directory.children` and `File.content`: generated getters call `eDynamicGet`, so the base class loads children on first access and keeps them as a real containment list, and serves content from the backend until content is assigned |

The delegate annotations are in the model; the delegates themselves are the work in progress.

## Classification

A file's class is decided by its **content type**, through EMF's content handler registry, which
EMF already uses to choose resource factories. Modules contribute `FileType` services mapping a
content type to a class, a MIME type and a text flag.

1. The extension first: on a remote backend, inspecting content means fetching it.
2. Content only when the extension is ambiguous: an `.xml` file's root element and namespace, a
   `.json` file's `$schema`.
3. Text or binary: from the file type, or Git's heuristic for unclaimed types (binary if a NUL byte
   appears in the first 8,000 bytes).
4. The same content type selects the resource factory, so opening a file as a model always agrees
   with how it was classified.

## Tools

`TextFile.view`, `replace` and `insert`, and `Directory.createFile`, carry a tool binding annotation
naming Anthropic's text editor tool and its command, which models are trained on. Inference modules
(Planned) bind them to that tool, or send them as function tools whose schemas are derived from the
operations. Edits preserve the charset and the line separator, so an agent's change is a small,
reviewable diff.

## Watching

Not in this model. The runtime's EMF support is to publish changes of any notifier, with transaction
boundaries in the stream, and subscribers queue and coalesce (Planned). This model contributes its
lazy base class and one custom notification, "subtree changed", which an unloaded directory publishes
when the backend reports changes beneath it.

## Where things are

| What | Where |
|---|---|
| The model | [`file.xcore`](../src/main/resources/org/nasdanika/sdk/runtime/models/file/file.xcore) |
| `View`, `Codec`, `FileType` | This module, package `org.nasdanika.sdk.runtime.models.file` |
| `Volume`, `GenericVolume`, `Content` and the volumes over directories | The `volume` module, package `org.nasdanika.sdk.runtime.volume` |

## Open decisions

* **Snapshot content encoding:** base64 inline below a size threshold, a stored blob reference above
  it, and the threshold.
* **`path`:** derived from the containment chain, or stored, which matters for snapshots moved
  between trees.
* **`ArchiveFile`:** whether `open()` returns a live directory over a zip volume only, or also
  supports writing back into the archive.
* **The file type registry:** a plain service, or a small model, so the registered types are
  documented and queryable like everything else.

## Further reading

The Nasdanika SDK Runtime book, chapter "Volumes and content", for volumes, content and the reactive
file system this model is a layer of.
