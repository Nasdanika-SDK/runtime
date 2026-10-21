# Draw.io

Reading, navigating, changing and writing [Draw.io](https://www.drawio.com) diagrams in Java:
documents, pages, layers, nodes and connections, properties and placeholders, selectors and property
paths, links across pages and documents, styles, and diagrams embedded in PNG images.

```
org.nasdanika.sdk.runtime:drawio        Java module org.nasdanika.sdk.runtime.drawio
```

Salvaged from the Draw.io API of Nasdanika core, without graph processing, the Ecore model of
Draw.io documents, semantic mapping or SpEL.

The manual is its Nasdanika Zephyr Book, _Draw.io_, in [`src/docs/asciidoc`](src/docs/asciidoc).
Every listing in it is included from the tests in
[`src/test/java/org/nasdanika/sdk/runtime/drawio/tests/book`](src/test/java/org/nasdanika/sdk/runtime/drawio/tests/book),
and every figure is a PNG with the diagram embedded, which those tests load. `mvn verify` in this
directory renders it to `target/book` as PDF, HTML and EPUB; it is attached to the module's artifact
with the classifier `book`.
