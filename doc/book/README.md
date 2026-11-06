# Nasdanika SDK Runtime: More Structure with Less Effort

The book about the runtime: why it exists, its key capabilities, and how they work at a high level.
It is written in AsciiDoc, built with the runtime, and published on Leanpub as PDF and EPUB.

## License

| What | License |
|---|---|
| The text and figures of the book: `manuscript/src/docs/asciidoc` | [CC BY 4.0](https://creativecommons.org/licenses/by/4.0/), legal code in [`manuscript/LICENSE`](manuscript/LICENSE) |
| The examples, the build files, the PDF theme and the cover generator | EPL-2.0, the license of the runtime ([`LICENSE`](../../LICENSE)) |

Readers may also use the code of the book's listings in their own programs and documentation without
permission and without attribution, as the colophon says. Neither license covers the Nasdanika name
or logo.

## Layout

```
doc/                     Documentation parent: deploy, javadoc and sources are skipped
  book/
    examples/            One Maven module per topic, compiled and tested with the runtime
      start/             Chapter 6: a first model, saving and loading, watching telemetry
      library/           Chapters 7 and 20: the library model in Xcore, used by most examples
      generics/          Chapter 8: types, type tokens, adapters
      flow/              Chapter 9: flows, the pump, transformations
      capability/        Chapter 10: requirements, factories, loaders, the CSV case study
      telemetry/         Chapters 11 and 12: spans, units of work, live span trees
      recording/         Chapter 13: telemetry and recorded changes saved as models
      volume/            Chapters 14 and 15: volumes, content, HTTP, WebDAV
      cli/               Chapters 16 and 17: commands, groups, mix-ins, wiring
      dsl/               Chapters 19 and 20: the Groovy DSL, evaluators
      meta/              Chapter 21: a vocabulary in Meta, in Java and in the text syntax, and two
                         projections
      jvm/               Chapter 22: a JVM snapshot
      web/               Chapter 23: a Bootstrap site generated from a model
      ui/                Chapters 23 and 24: React from Java without npm, polymorphic UI
      diagram/           Chapter 25: a diagram generated, laid out with ELK, saved as Draw.io,
                         checked against the library, and drawn as SVG
    manuscript/
      src/docs/asciidoc/ book.adoc, front/, chapters/, appendices/, back/, images/, diagrams/
      src/docs/themes/   nasdanika-theme.yml, the PDF theme (189 x 246 mm, 7.44 x 9.69 in)
      src/cover/         Cover.java, the cover generator
```

## Building

From the repository root, the book is built with everything else:

```
mvn clean install                            # runtime, examples, book
mvn clean install -Dasciidoctor.skip=true    # everything but the book
```

From `doc/book/manuscript`, the book alone (the examples are read as files, not as Maven dependencies):

```
mvn verify                                   # target/book: PDF, EPUB and single-page HTML
mvn verify -Dbook.editor-notes=false         # without editor's notes, for publication
mvn verify -Dbook.media=prepress             # print layout: mirrored margins, recto chapters
```

From `doc/book/examples`, the examples alone, in the reactor so that modules resolve each other:

```
mvn verify
mvn verify -pl cli -am                       # one example and what it depends on
```

Do not `install` the examples into the local repository on their own: their parent POM is not
installed with them, and later builds fail to resolve it. If that has happened, delete
`~/.m2/repository/org/nasdanika/sdk/runtime/doc`.

## Writing conventions

- **Listings are includes.** Code comes from tagged regions of the examples:
  `include::{examplesdir}/cli/src/main/java/org/example/cli/HelloCommand.java[tag=hello,indent=0]`.
  Callouts are `// <1>` comments in the example source. Never paste code into the manuscript that
  is not compiled somewhere.
- **96 characters per listing line.** That is what fits the PDF page at the code font size. Wrap
  long lines in the example source.
- **Warnings fail the build** (`failIf` WARN): missing tags, broken cross-references, duplicate ids.
  Section ids are generated from titles with no prefix, so an explicit block id must not repeat a
  section title (`[#planes]` next to a "Planes" section fails).
- **AsciiDoc traps.** A backtick next to a double quote is curved-quote syntax; ` -- ` becomes an em
  dash; `->` in monospace becomes an arrow; `{name}` is an attribute even inside backticks. Use
  `+...+` passthrough for such text.
- **Status labels** for anything not available in the release the book describes:
  `[.sketch]#SKETCH#` (designed, partly built) and `[.planned]#PLANNED#` (designed, not built).
- **Editor's notes** record inconsistencies between the runtime and its documentation found while
  writing. They are `IMPORTANT` blocks with `caption="Editor's note"` inside
  `ifdef::editor-notes[]`, shown by default and left out of published editions.
- **Voice.** First person, the author's. No em or en dashes in prose.

## The cover

`src/cover/Cover.java` is a single-file Java program that draws the cover with Java 2D, using the
Noto Sans fonts inside the Asciidoctor PDF jar:

```
cd doc/book/manuscript
java src/cover/Cover.java \
    ~/.m2/repository/org/asciidoctor/asciidoctorj-pdf/2.3.27/asciidoctorj-pdf-2.3.27.jar \
    src/docs/asciidoc/images/nasdanika-sdk-logo.jpg \
    src/docs/asciidoc/images/cover.png
```

## Publishing on Leanpub

The book is a Leanpub "Bring Your Own Book" (Upload) title: Leanpub hosts and sells the files, and
does not build them. So are the Nasdanika Zephyr Books with readers beyond the runtime, today
Groovy DSL and Draw.io, and a Leanpub bundle offers the book together with them. Leanpub's API
cannot upload files to an Upload title, so each release is uploaded by hand. The runtime is
released quarterly; patch releases are uploaded only when they change a book.

For each quarterly release:

1. Build the book with `mvn verify -Dbook.editor-notes=false` from `doc/book/manuscript`. The
   release build renders the Zephyr Books without editor's notes, in each module's `target/book`;
   they are also on Maven Central with the `book` classifier.
2. Upload the book's `target/book/nasdanika-sdk-runtime-<version>.pdf` and `.epub` on its Upload
   page as a new version, and a sample if wanted.
3. Do the same for each Zephyr Book on Leanpub, with its PDF and EPUB.
4. Email each title's readers from its page, with the release notes. In Upload mode this is a
   separate step from the upload.
5. Check that the bundle lists every Zephyr Book on Leanpub, and add a book in the release that
   first publishes it there.
6. Keep the minimum price of every title and of the bundle at zero with a suggested price, so the
   books are free and readers can pay: $19 for the book, $9 for each Zephyr Book, $29 for the
   bundle. After the first quarter, compare what payers paid with the suggestions.
7. Attach the books to the release's GitHub release: the book's PDF, EPUB and single-page HTML,
   and each Zephyr Book's PDF and HTML.
8. Once the Zenodo script exists: reserve the version's DOI before the release build, pass it to
   the build so the books print it, then upload the books and the source archive and publish the
   record.

A release of the book follows a release of the runtime and carries its version (`revnumber`).
The single-page HTML is the whole book in one file. Its markup makes it nearly three times the
size of its text (about 100,000 tokens), so a coding assistant working in the repository should
read the AsciiDoc sources and the examples instead, in the parts it needs.

## Keeping the book in step with the runtime

Releases are tagged, so what a new edition has to catch up with is the diff since the previous
release's tag: `git diff --stat <previous tag> -- . ':!doc'` for the code, then the book against it.
Before each release, check:

- **The modules.** Every module in the reactor (`pom.xml`, `models/pom.xml` and their children) is
  in the module reference (`appendices/a-modules.adoc`), with its Maven coordinates and Java module
  name, and in the module map, dependency graph, repository layout and status lists of the
  at-a-glance chapter.
- **The Zephyr Books.** Every module with `src/docs/asciidoc/index.adoc` is in the preface's list of
  Zephyr Books and named in its module reference entry.
- **The numbers.** The opening of "Built with an AI assistant" gives days and commits since the
  repository was created (29 September 2026, `git rev-list --count HEAD`) and these counts, over
  the files Git tracks:
  - lines of Java: `*.java` outside `src-gen`, `src/test`, `picocli/` (bundled) and `doc/`;
  - lines of tests: `*.java` under `src/test`, outside `doc/`, and test cases: `@Test` in them;
  - lines of Xcore: `*.xcore`, and the Java it generates: `*.java` under `src-gen`;
  - lines of Groovy: `*.groovy`.

  The Xcore and generated Java counts are repeated later in the same chapter.

## Open decisions

- **Central coordinates.** The getting-started chapter assumes the runtime is on Maven Central;
  until it is, readers build it first.
