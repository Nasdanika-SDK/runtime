# Draw.io Playwright

Draw.io documents rendered with draw.io's own viewer, in a browser driven by
[Playwright](https://playwright.dev/java/): pages as PNG and SVG images with the page embedded, so
draw.io opens them for editing, pages after a program has clicked their shapes, and videos of pages
shown in sequence.

```
org.nasdanika.sdk.runtime:drawio-playwright        Java module org.nasdanika.sdk.runtime.drawio.playwright
```

It is a module of its own so that the [Draw.io API](../drawio) stays light: Playwright and a browser
come only with this one.

The manual is the chapter "Rendering in a browser" of the Draw.io Zephyr Book, in
[`../drawio/src/docs/asciidoc`](../drawio/src/docs/asciidoc). Its listings are included from the
tests in
[`src/test/java/org/nasdanika/sdk/runtime/drawio/playwright/tests`](src/test/java/org/nasdanika/sdk/runtime/drawio/playwright/tests).
