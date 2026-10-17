# Nasdanika SDK Runtime: More Structure with Less Effort

The book about the runtime: why it exists, its key capabilities, and how they work at a high level.
It is written in AsciiDoc, built with the runtime, and published on Leanpub as PDF and EPUB.

## Layout

```
doc/                     Documentation parent: deploy, javadoc and sources are skipped
  book/
    examples/            One Maven module per topic, compiled and tested with the runtime
      start/             Chapter 5: a first model, saving and loading, watching telemetry
      library/           Chapters 6 and 19: the library model in Xcore, used by most examples
      generics/          Chapter 7: types, type tokens, adapters
      flow/              Chapter 8: flows, the pump, transformations
      capability/        Chapter 9: requirements, factories, loaders, the CSV case study
      telemetry/         Chapters 10 and 11: spans, units of work, live span trees
      recording/         Chapter 12: telemetry and recorded changes saved as models
      volume/            Chapters 13 and 14: volumes, content, HTTP, WebDAV
      cli/               Chapters 15 and 16: commands, groups, mix-ins, wiring
      dsl/               Chapters 18 and 19: the Groovy DSL, evaluators
      meta/              Chapter 20: a vocabulary in Meta and two projections
      jvm/               Chapter 21: a JVM snapshot
      web/               Chapter 22: a Bootstrap site generated from a model
      ui/                Chapters 22 and 23: React from Java without npm, polymorphic UI
    manuscript/
      src/docs/asciidoc/ book.adoc, front/, chapters/, appendices/, images/, diagrams/
      src/docs/themes/   nasdanika-theme.yml, the PDF theme (7 x 9.25 in)
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

The book is a Leanpub "Bring Your Own Book" title: Leanpub hosts and sells the files, and does
not build them.

1. Build with `mvn verify -Dbook.editor-notes=false` from `doc/book/manuscript`.
2. Upload `target/book/nasdanika-sdk-runtime-<version>.pdf` and `.epub` as a new release, and a
   sample if wanted.
3. Keep the minimum price at zero with a suggested price, so the book is free and readers can pay.

A release of the book follows a release of the runtime and carries its version (`revnumber`).
The single-page HTML is the edition to give a coding assistant.

## Open decisions

- **The license of the text.** The runtime is EPL-2.0; a book is usually licensed separately, for
  example CC BY 4.0 or CC BY-NC-ND 4.0. The colophon has an editor's note until this is decided.
- **Central coordinates.** The getting-started chapter assumes the runtime is on Maven Central;
  until it is, readers build it first.
