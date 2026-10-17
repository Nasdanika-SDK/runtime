
```drawio-resource
../react.drawio
```

# React model

> Directory `models/react/model` · Maven `org.nasdanika.sdk.runtime.models.react:model` ·
> Java module `org.nasdanika.sdk.runtime.models.react` · Package `https://runtime.sdk.nasdanika.org/models/react` ·
> Part of the [Nasdanika SDK Runtime](https://github.com/Nasdanika-SDK/runtime)

A model of React components and JSX, on top of the [TypeScript model](../../../typescript/model/doc/readme.md),
and a generator that writes them. It is a **transformation target**, not something you author
directly: user interfaces are generated from models into it, and it is written out as code a
browser runs.

Two technology models build on it, in sibling modules:

| Module | Models |
|---|---|
| `models/react/bootstrap` | [React Bootstrap](https://react-bootstrap.github.io/) components: layout, content, navigation, overlays and forms |
| `models/react/flow` | [React Flow](https://reactflow.dev/) (`@xyflow/react` 12): flows of nodes and edges, the `ReactFlow` component and its plugins, custom node building blocks and hooks, with a simple layered layout to start from |

## Why a model

The TypeScript model covers the declaration surface and leaves bodies as opaque code blocks, with no
JSX, on purpose. Generating React through it alone would put every component body into opaque text
and lose the three things models of code exist for:

* **Import management** for the components used inside JSX, which is the hardest part of emitting
  TypeScript correctly, and the reason the code models are models at all.
* **Provenance**: markers from a source element to the JSX element it produced.
* **Structure**: a generated interface that can be validated, diffed, analyzed and reported on,
  rather than compared as text.

`CodeBlock` carries a `references` list precisely so that a structured body could be substituted;
`JsxBlock` is that substitution.

## What it models

| Area | Types |
|------|-------|
| Base | `ReactElement`, `TsxModule` |
| Components | `ComponentDeclaration` (a TypeScript function declaration), `JsxBlock` |
| Hooks | `Hook`, `StateHook`, `EffectHook`, `MemoHook`, `ContextHook`, `RefHook`, `OpaqueHook` |
| Context | `ContextDeclaration`, `ContextProvider` |
| JSX | `JsxNode`, `JsxContainer`, `JsxElement`, `JsxFragment`, `JsxText`, `JsxExpression`, `JsxConditional`, `JsxIterator`, `OpaqueJsx` |
| HTML | `Intrinsic`, an element of the HTML model used as a JSX intrinsic, and `JsxContent`, JSX inside an HTML container |
| Component libraries | `LibraryComponent`, `LibraryHook`, `ValueBlock` |
| Attributes | `JsxAttribute`, `LiteralAttribute`, `ExpressionAttribute`, `EventAttribute`, `SpreadAttribute` |

`JsxElement.componentType` is the load-bearing feature: the generator walks it to decide which
components must be imported, from which module, and whether the import can be type-only.

**HTML is shared, not duplicated.** An `Intrinsic` holds an element of the HTML model, interpreted by
the same structure the HTML generator uses, so a page model and a component model mean the same
markup, and HTML produced by a transformation, a Bootstrap layout for example, can be used in a
component as it is. `JsxContent` puts JSX back into HTML containers, so the two trees nest in each
other.

**Component libraries are annotated models.** A library component, such as a React Bootstrap card or
the React Flow canvas, is a class annotated with its component name and module; the generator renders
its features as props reflectively: attributes as values, containments of JSX as children, value
objects as object literals. A component library is therefore annotated Xcore with no generator code,
which is how the React Bootstrap and React Flow models are written.

## The generator

`ReactGenerator` is a TypeScript generator that also writes components with hooks, contexts and JSX,
in one of two syntaxes chosen per module:

* JSX in a `TsxModule`, written to `.tsx` and compiled with the automatic runtime.
* `createElement` calls in any other module: plain JavaScript that a browser runs as it is, with no
  build step.

Imports of React functions, components and contexts are managed. HTML attributes map to React props
(`class` to `className`, `for` to `htmlFor`, `style` to an object), and static form state becomes
uncontrolled defaults.

The tests of the module generate working applications from Java, with no npm and no build step: a
documentation viewer with a navigation tree, Markdown content, search and themes; an interactive
table of the JVM's modules; and a React Flow diagram of module dependencies that the user can
rearrange, highlight and edit.

## Bootstrap, static and interactive

Bootstrap appears twice in the runtime, for two delivery modes. The HTML Bootstrap model describes
Bootstrap semantics for static pages, written as HTML. The React Bootstrap model describes the
components of React Bootstrap for interactive applications. Both model the meaning of a component,
a modal with a title and a size, rather than its markup.

## What is deliberately not modeled

Hook semantics, suspense, transitions, server components, error boundaries as a concept, and
routing. They arrive as `OpaqueHook` and `OpaqueJsx`, which carry a `references` list so that opaque
text does not silently defeat import management. That keeps the model at about thirty classes rather
than chasing a framework that moves every quarter.

## Write only

There is no loader. Parsing TSX means the TypeScript compiler API, which is TypeScript rather than
Java. If reverse engineering is ever wanted, it belongs on the TypeScript side, emitting this model
as JSON. The omission is a decision, not a gap.

## Position among the models

On the TypeScript model, which is on the [core model](../../../core/doc/readme.md), and on the HTML
model for intrinsics. Ownership, documentation and governance of a generated interface belong to the
models it is generated from, and reach the generated code through markers rather than by making
every JSX attribute an owned object: the artifact points at its cause, and the cause is the thing
with an owner.

## Status

**Available:** the React, React Bootstrap and React Flow models, and the generator in both syntaxes.

**Planned:**

* **A UI model**, framework-neutral, authored in Draw.io with a Bootstrap shape library: one drawing,
  several renderers. Its concepts map onto this model in a transformation rather than by
  inheritance, because React is a rendering technology and a drawn interface should not become React
  shaped while it is being drawn.
* **The reflective viewer**: a browser application that renders any model, and live telemetry,
  generated from models with this model and served by the runtime.

## Further reading

The Nasdanika SDK Runtime book, chapter "From models to the web".
