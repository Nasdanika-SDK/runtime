
```drawio-resource
../react.drawio
```

[TOC levels=6]

# Nasdanika React Model

An [Ecore](https://www.eclipse.org/modeling/emf/) micro-model of JSX and the React component shape,
defined in [`react.xcore`](react.xcore). It extends the
[TypeScript model](../typescript/typescript.xcore) and is a **transformation target**, not something
you author directly.

## Where it sits

```
Draw.io (ui + bootstrap shape library)
        |
        v
   ui model  ------------------------------> Alpine / HTML static site
        |                                     (existing generation, unchanged)
        | NSML
        v
  react model
        |
        | NSML
        v
typescript model  --------------------------> .tsx source
```

The [UI model](../ui/Ui.xcore) is the authoring model: framework neutral vocabulary, dialect neutral
bindings, and `Element extends Workable, GovernedElement` so every drawn element carries work and
governance. [Bootstrap](../ui/Bootstrap.xcore) extends it with Bootstrap 5.3 vocabulary. React does
**not** extend it.

That distinction is the design. Bootstrap is vocabulary: a `bootstrap.Card` is still a `ui.Container`,
and a Bootstrap document is still a valid UI document. React is a rendering technology. If React
classes extended UI classes, a drawn interface would become React shaped at authoring time and the one
drawing, several renderers property would be lost. The UI to React mapping therefore lives in a
transformation rather than in inheritance.

## Why the model exists

The TypeScript model covers the declaration surface and leaves bodies as opaque `CodeBlock` text. It
has no JSX, on purpose. Generating React through it alone would put every component body into opaque
text and throw away the three things the code model layer exists for:

* **Import management** for the components used inside JSX, which is the hardest part of emitting
  TypeScript correctly and the reason the code models are models at all.
* **Provenance**: nested markers from a Draw.io shape, through the `ui` element, to the JSX element it
  produced.
* **Structure**: a generated interface that can be diffed, analysed and reported on rather than
  compared as text.

`typescript.CodeBlock` carries a `references` list precisely so that a structured body could be
substituted later. `JsxBlock` is that substitution.

## Model overview

| Area | Types |
|------|-------|
| Base | `ReactElement`, `TsxModule` |
| Components | `ComponentDeclaration` (extends `typescript.FunctionDeclaration`), `JsxBlock` |
| Hooks | `Hook`, `StateHook`, `EffectHook`, `MemoHook`, `ContextHook`, `RefHook`, `OpaqueHook` |
| Context | `ContextDeclaration`, `ContextProvider` |
| JSX | `JsxNode`, `JsxContainer`, `JsxElement`, `JsxFragment`, `JsxText`, `JsxExpression`, `JsxConditional`, `JsxIterator`, `OpaqueJsx` |
| Attributes | `JsxAttribute`, `LiteralAttribute`, `ExpressionAttribute`, `EventAttribute`, `SpreadAttribute` |

`JsxElement.componentType` is the load bearing feature: the emitter walks it to decide which components
must be imported, from which specifier, and whether the import can be type only.

## How UI concepts map

| UI model | React model | Note |
|---|---|---|
| `Component` | `ComponentDeclaration` | Clean fit: a named reusable tree becomes a function component |
| `Include` | `JsxElement` with `componentType` | `arguments` become attributes |
| `Slot` | `children`, or a render prop | Named slots become props holding nodes |
| `Container` / children | `JsxContainer.children` | Visual nesting is DOM nesting |
| `Fragment` | `JsxFragment` | Both render nothing of their own |
| `ValueBinding` | `ExpressionAttribute` | `target` becomes the JSX attribute name |
| `EventBinding` | `EventAttribute` | `event` becomes `on<Event>` |
| `Iterator` | `JsxIterator` | `key` already exists in the UI model and is what React requires |
| `Conditional` | `JsxConditional` | Short circuit, or a ternary when `otherwise` is set |
| `DataContext` | `StateHook` or `ContextProvider` | See below: the one place the mapping is not local |
| `styleClasses` | `LiteralAttribute` `className` | |
| `attributes` | `LiteralAttribute` | `data-bs-*` and ARIA pass through unchanged |

**`DataContext` is the sharp edge.** In Alpine, `x-data` establishes a scope on any element. React has
no element level equivalent: data scope is component state or a context provider. The transformation
must hoist a `DataContext` to the nearest enclosing `Component`, emitting a `StateHook`, or wrap it in
a `ContextProvider` when the scope is consumed below by more than a subtree. A `DataContext` on a bare
element inside no component is an error the transformation should report rather than paper over.

## Bootstrap in React

Bootstrap 5 is CSS plus vanilla JavaScript, not a React component library, so generation emits
`className` markup and supplies React implementations for the handful of components that need
behaviour: modal, offcanvas, dropdown, collapse, toast, tooltip.

The `bootstrap` model earns its keep here. It models the **semantics** (`Modal` has a title, size,
centered, scrollable) rather than the markup, so the same drawn model renders through the Alpine and
HTML stack today and through React components tomorrow without being re-authored. No React Bootstrap
wrapper library is used: one less dependency to outlive, and a wrapper would not supply the generic
components this ecosystem actually needs.

## What is deliberately not modeled

Hook semantics, suspense, transitions, server components, error boundaries as a concept, and routing.
They arrive as `OpaqueHook` and `OpaqueJsx`, both of which carry a `references` list so that opaque
text does not silently defeat import management.

This is the same bargain the [TypeScript](../typescript/typescript.xcore) and
[Python](https://python.models.nasdanika.org/) models make, and it is why this model is about thirty
classes rather than chasing a framework that moves quarterly.

## Write only

There is no loader. Parsing TSX means the TypeScript compiler API, which is TypeScript rather than
Java. If reverse engineering is ever wanted it belongs on the TypeScript side, emitting this model as
JSON. The omission is a decision, not a gap.

## Tower position

Branches off nxcore through the TypeScript model, and nothing higher. Ownership, documentation, work
and governance come from the UI model, whose `Element` already extends `Workable` and
`GovernedElement`, and reach generated code through nested markers back to the UI elements rather than
by making every JSX attribute a governed object. The artifact points at its cause, and the cause is the
thing with an owner.
