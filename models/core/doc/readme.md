NxCore is the foundation of the [Nasdanika model tower](https://nasdanika.com/models.html) - a set of small,
reusable building blocks which higher-level models (product management, architecture, organization, ...) extend
instead of re-inventing.

What NxCore provides in one sentence: **model elements which are named, documented, identifiable, referrable,
positioned in time, and which know where they came from**.

```drawio-resource
../nxcore.drawio
```

## Identity and references

| Type | Provides |
| --- | --- |
| `Referrable` | `getReferrers(EReference)` - finds all objects in the containment root/resource/resource set which reference this object through a given reference. Inverse navigation without maintaining opposite references. |
| `StringIdentity` | A `String` `id` - a stable, human-readable identifier used in URIs, action locations and cross-references. |

`ModelElement` also carries `uris` - alias URIs resolved relative to the parent URIs.
They can be absolute or
opaque, e.g. `actors://john-smith`, and act as **merge anchors**: several teams may independently maintain
elements with the same URI - for example `myorg://capabilities/developer-productivity` - and when their models
are assembled into a single model those elements are merged into one logical element.

## Documentation

`Documented` gives every element a rich documentation story instead of a single string:

* `documentation` - inline documentation, markdown by default.
* `docRef` - a documentation resource URI resolved relative to the element's resource URI; the format is derived
  from the extension when `docFormat` is not set.
* `docContents` - a list of `Content` (inline `content`, `contentRef`, `contentType`) rendered after the own
  documentation.
* `docSections` - a tree of `Section`s (a `SectionReference` with `title` and `id`, plus nested `children` and
  `contents`) rendered after `docContents`.

This is what allows documentation to be authored where it belongs - inline for short notes, in separate
markdown/HTML resources for long-form content - and still be assembled into a single documentation site.

## Provenance - markers

`Marked` elements carry a list of `Marker`s recording **where the element (or a particular feature of it) came
from**:

| Feature | Meaning |
| --- | --- |
| `location` | Resource location - typically the URI of the file the element was loaded from. |
| `position` | Position within the resource, e.g. a line number. |
| `feature` | Feature name for feature-level markers - the marker points at a single attribute/reference, not the whole element. |
| `date` | Timestamp of the source, e.g. the resource modification time. |
| `comment` | Free-form comment. |
| `digest` | Optional source hash/digest - a SHA for a text file, or a Merkle tree hash for models. It may exclude some features and may be computed over graphs including non-containment references, not only over containment trees. |
| `children` | Child markers. When a feature is computed from two other features, the markers of those features are recorded as children of the resulting marker. |

Markers make generated documentation and analysis results traceable: every element on a generated site can point
back to the file, line, and version it was derived from, and derived values can be traced through their inputs
via nested markers.

### Git markers

`GitMarker` extends `Marker` with the origin of the source in version control:

| Feature | Meaning |
| --- | --- |
| `path` | Path of the source within the repository working tree. |
| `remotes` | Map of remote names to URLs - the repository the element originated from. |
| `branch` | Short branch name. |
| `head` | Commit SHA of `HEAD`. |
| `headRefs` | Refs pointing at the head commit other than `HEAD` itself, e.g. branches and tags. |

Together `remotes` + `branch` + `head` + `path` + `position` identify an exact source line in an exact commit -
enough to build a permalink back to the source, e.g. a GitHub blob URL.

Git markers are populated automatically when loading models: `DslMarker` discovers the Git repository containing
the loaded resource, builds a marker template from the repository state, and attaches a copy of it - with the
line number and, where applicable, the feature name - to every `Marked` element as it is created.

## Time dimension

Time is modelled as a graph of `Temporal` points rather than as plain timestamps, so that partially known and
relative time can be expressed:

* `instant` - an exact point in time, when known.
* `base` + `duration` - a point defined relative to another `Temporal`, e.g. "two weeks after the release".
* `lowerBounds` / `upperBounds` - other `Temporal`s constraining this one when the exact instant is not known,
  e.g. "after the design review and before the launch".

`Period` combines a contained `start` and `end` `Temporal` with an optional `duration`, and `NamedPeriod` makes a
named, documented, marked model element out of it - the base type for anything with a lifespan: initiatives,
engagements, releases, roles, incidents.

## The element hierarchy

```
StringIdentity, Documented, Marked
        |
   ModelElement      (id, documentation, markers, uris, icon)
        |
   NamedElement      (+ name)
        |
   NamedPeriod       (+ start, end, duration)
```

`ModelElement` adds an `icon` on top of identity, documentation and markers - treated as a URL if it contains a
`/` and as a CSS class otherwise, e.g. `fas fa-wrench`.
Downstream models in the tower extend `NamedElement` or
`NamedPeriod` and inherit identity, documentation, provenance and time handling, along with the documentation
generation and site rendering built on top of them.

## Evaluators

`Evaluator` is a documented, marked expression or script which can be evaluated against a map of bindings and
coerced to a result type - the model's extension point for computed values and conditions:

* `SpelEvaluator` - a Spring Expression Language `expression`.
* `ScriptEvaluator` - a JSR-223 script; `language` names the engine, and for `scriptRef` the engine may be
  selected by the URI extension.
* `GroovyEvaluator` - a Groovy script.

`ScriptEvaluator` and `GroovyEvaluator` extend `SourceEvaluator`, which carries the source either inline
(`script`) or by reference (`scriptRef`, resolved against the resource URI) - exactly one of the two must be set.
