# Core model

> Directory `models/core` · Maven `org.nasdanika.sdk.runtime.models:core` · Java module `org.nasdanika.sdk.runtime.models.core` ·
> Packages `https://runtime.sdk.nasdanika.org/models/core` and `https://runtime.sdk.nasdanika.org/models/core/kind` ·
> Part of the [Nasdanika SDK Runtime](https://github.com/Nasdanika-SDK/runtime)

The foundation the other models of the runtime extend: model elements that are **named, documented,
identifiable, referrable, and know where they came from**.

## Why a core

Every model needs the same few things. Elements have to be identified, named and documented, they
have to know where they came from, and whatever refers to them has to be findable. Written once,
these are a foundation. Written in every model, they are a source of small, incompatible
differences: one model calls it `description`, the next `doc`, and no tool works on both.

The value of a shared core grows with the number of models that extend it:

* **One generator for many models.** A documentation generator that knows `NamedElement`,
  `Documented` and `Marked` documents any model built on them, including models written after it.
* **One UI for many models.** The polymorphic UI's views of the core model show names, icons,
  documentation and provenance for any element, whatever its class.
* **Merging across teams.** Alias URIs let independently maintained models be assembled into one.
* **Traceability by default.** Markers are there to be filled by loaders, importers and agents
  recording where an element, or a change, came from.

A model gets all of it by extending `NamedElement`, as the
[Meta](../../meta/model/src/docs/asciidoc/index.adoc), [JVM](../../jvm/model/src/docs/asciidoc/index.adoc)
and [TypeScript](../../react/model/src/docs/asciidoc/index.adoc) models of the runtime do (each
documented in a Nasdanika Zephyr Book). The HTML model takes
only what it needs: its elements are `Marked`.

## The element hierarchy

```
Referrable
    |
StringIdentity        Documented        Marked
        \                 |                /
         +----------- ModelElement -------+      id, documentation, markers, icon, uris
                          |
                     NamedElement                + name
```

| Type | Provides |
|---|---|
| `Referrable` | `getReferrers(EReference)`: the objects in the element's containment tree, resource or resource set that reference it through a given reference. Inverse navigation without opposite references |
| `StringIdentity` | `id`: a stable, human-readable identifier for URIs and cross-references. A name is for people and may change; an id is for references and should not |
| `Documented` | Documentation, inline or by reference, with contents and sections (below) |
| `Marked` | Markers: where the element, or one of its features, came from (below) |
| `ModelElement` | All of the above, plus an `icon` (a URL if it contains a slash, a CSS class such as `fas fa-book` otherwise) and `uris` |
| `NamedElement` | A `name` |

`ModelElement.uris` are alias URIs, absolute or opaque, such as `actors://john-smith`. They are
merge anchors: several teams may maintain elements with the same URI, for example
`myorg://capabilities/developer-productivity`, and when their models are assembled, those
elements are one logical element.

An opposite reference is the right choice when both directions are part of a model's meaning, and
it has a cost: both ends must be in memory and kept consistent, which fails across resources loaded
on demand. `getReferrers` costs a walk of what is loaded, and nothing when it is not called.

## Documentation

`Documented` lets documentation be as short or as long as it needs to be, and be written where it
belongs:

* `documentation`: inline, in Markdown unless `docFormat` says otherwise.
* `docRef`: a documentation resource, resolved relative to the element's resource, with its format
  derived from the extension unless `docFormat` is set.
* `docContents`: contents rendered after the documentation, each inline (`content`) or by
  reference (`contentRef`), with a `contentType`.
* `docSections`: a tree of sections, each with a `title`, an `id`, contents and child sections.

Most formats carry documentation as one string. A string cannot be divided into sections, point to
a resource elsewhere, or declare its format. Here documentation is structure, so a sentence inline
and a chapter in a Markdown file next to the model are assembled into one site.

## Provenance: markers

A marker records where an element, or one feature of it, came from:

| Feature | Meaning |
|---|---|
| `location` | The source, typically the URI of the file the element was loaded from |
| `position` | A position in the source: a line, a cell, a page |
| `feature` | The feature the marker is about, for a marker of one attribute or reference |
| `date` | The date of the source, for example its modification time |
| `comment` | A free-form comment |
| `digest` | A digest of the source: a hash of a file, or of a model |
| `children` | Child markers, for a value computed from other values that have markers of their own |

`GitMarker` adds where the source is in version control: its `path` in the repository, the
`remotes`, the `branch`, the `head` commit and the `headRefs` on it. With the position, that is
enough to build a permalink to the exact line in the exact commit.

Markers make whatever is generated from models traceable: every element of a generated page can
point back to the file, the line and the version it came from, and a derived value can be traced
through its inputs.

## Evaluators

An evaluator is a documented, marked expression or script, evaluated against bindings and coerced
to a result type: a rule, a derived property, a filter, kept in the model with everything else.
The evaluator itself is bound as `self`.

| Evaluator | Source | Status |
|---|---|---|
| `ScriptEvaluator` | A script in any JSR-223 language, inline (`script`) or by reference (`scriptRef`, resolved against the element's resource). The `language` names the engine; a referenced script without one selects the engine by extension | Available |
| `GroovyEvaluator` | A Groovy script, inline or by reference | Planned |
| `SpelEvaluator` | A Spring Expression Language expression | Planned |
| `XPathEvaluator` | An XPath expression over the model | Planned |

The planned evaluators are declared, so models can contain them today, and throw
`UnsupportedOperationException` when evaluated. Their implementations are to be loaded as Java
services, which keeps the core module free of the engines' dependencies.

```java
ScriptEvaluator classic = CoreFactory.eINSTANCE.createScriptEvaluator();
classic.setLanguage("groovy");
classic.setScript("book.year < 1980 && book.authors.size() == 1");
Boolean result = classic.evaluate(Boolean.class, Map.of("book", book));
```

## Using it

Import the runtime's BOM and depend on the module:

```xml
<dependency>
    <groupId>org.nasdanika.sdk.runtime.models</groupId>
    <artifactId>core</artifactId>
</dependency>
```

Extend it in Xcore:

```
import org.nasdanika.sdk.runtime.models.core.NamedElement

class Book extends NamedElement {
    int year
}
```

The packages are contributed as Java services (`CoreEPackageProvider`, `KindEPackageProvider`), so a
resource set created with `NasdanikaResourceSet.createAndConfigure()` knows them.

## What comes next

* **Kinds** (Sketch). The `kind` package is reserved for kinds: types whose instances configure
  other elements, with the changes they carry recorded. It holds a placeholder interface today.
* **Time** (Planned). Temporal points that may be exact, relative to another point with a
  duration, or bounded by others, and named periods with a start and an end: the base for anything
  with a lifespan, such as releases, roles and incidents.
* **Facets** (Planned). Extension-specific configuration of an element, such as geometry for a
  diagram or weights for prioritization, contained by the element.
* **Git markers when loading** (Planned). Discovering the repository of a loaded resource and
  marking each element with its commit, path and line.

## Further reading

The Nasdanika SDK Runtime book, chapter "The core model", and chapter "Models: EMF without Eclipse"
for defining models in Xcore and contributing them.
