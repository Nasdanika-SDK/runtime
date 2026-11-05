# Nasdanika Zephyr Books

The look shared by the Nasdanika Zephyr Books: in-depth manuals, one per module, written in
AsciiDoc in the module they document, with listings included from the module's tests.

A module has a Zephyr Book when it has `src/docs/asciidoc/index.adoc`. That file activates the
`zephyr-book` profile of the runtime's parent POM, which, in the `package` phase, after the tests:

- renders `target/book/<artifactId>-<version>-book.pdf` with the PDF theme here;
- renders `target/book/<artifactId>-<version>-book.html`, a single page with this directory's
  stylesheets and every image embedded;
- renders `target/book/<artifactId>-<version>-book.epub` when the module sets
  `zephyr.epub.skip` to `false`, for the books on Leanpub;
- attaches the PDF and the HTML with the classifier `book`, and the test sources with the classifier
  `test-sources`.

Warnings fail the build. The `central` profile sets `zephyr.editor-notes` to `false`, so published
books leave the editor's notes out.

The profile passes these attributes to every book: `revnumber`, `revdate`, `runtime-version`,
`module-name`, `group-id`, `artifact-id`, `testdir`, `testresourcesdir`, `runtime-root` and
`editor-notes`. The EPUB execution also sets `zephyr-epub`, because the EPUB converter needs a
relative `imagesdir`.

## Outside the runtime

This directory is also the module `org.nasdanika.sdk.runtime.doc:zephyr`. Its jar holds `css/`,
`themes/`, `images/` and this README under `zephyr/`, not `tools/`. Books in other repositories, such
as `field-notes` and `stories`, unpack the jar of the runtime release they are built with and point
their own copy of the profile at it. A release pins the look. `mvn install` from this directory is
enough for local builds of those repositories.

## Contents

| Path | What it is |
|---|---|
| `themes/zephyr-theme.yml` | The PDF theme: Zephyr's palette, Noto Sans and M+ 1mn, 189 by 246 mm (7.44 by 9.69 inches) |
| `themes/title-band.svg` | The band of Zephyr blue across the title page |
| `images/nasdanika-logo.png` | The Nasdanika logo, 205 pixels square: top left on the title page's band, at 0.6 inches |
| `css/bootstrap.min.css` | Bootswatch Zephyr 5.3.3, vendored and pinned, with its Google Fonts `@import` removed |
| `css/BOOTSWATCH-LICENSE.txt` | The MIT license of Bootswatch; Bootstrap's MIT notice is in the stylesheet's header |
| `css/zephyr-logo.css` | The logo at 96 pixels as a data URI in `--zb-logo`; generated, do not edit |
| `css/zephyr-bridge.css` | Styles Asciidoctor's HTML through Bootstrap's CSS variables |
| `tools/logo-css/make.py` | Regenerates `css/zephyr-logo.css` from the logo; needs Pillow |

The build concatenates `bootstrap.min.css`, `zephyr-logo.css` and `zephyr-bridge.css` into
`target/zephyr/zephyr.css`, which Asciidoctor embeds. The HTML loads nothing from a CDN: Inter is not loaded, so text falls back
to the system sans serif, and icons are off, so admonitions are labeled with text.

## Rules

- **The theme is pinned.** Once the first book ships, the books do not switch Bootswatch themes, and
  `bootstrap.min.css` changes only for a Bootswatch release that is checked against every book.
- **The full name**, "Nasdanika Zephyr Books", in every title and at the first mention on any page.
  "Zephyr" alone is the Zephyr RTOS or SmartBear's test management.
- **Every module gets the same title page**: the Nasdanika logo at the top left of the blue band, the
  module's name as the title, "A Nasdanika Zephyr Book" as the subtitle, and the version from the
  POM.
- **The brand sits at the top left, as on the web site.** In the PDF that is the title page only, so
  the running headers keep the chapter titles. In the HTML, the logo and "Nasdanika Zephyr Books"
  head the table of contents on wide screens, where it is the page's top left corner, and the header
  on narrow ones.
- **A Zephyr Book stands on its own.** It repeats the why and the how that its readers need, even
  where the SDK book covers them, so that someone who reads only the Zephyr Book can start and finish
  there.
