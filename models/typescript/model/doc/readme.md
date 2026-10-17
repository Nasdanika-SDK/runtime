
```drawio-resource
../typescript.drawio
```

[TOC levels=6]

# TypeScript model

> Directory `models/typescript/model` · Maven `org.nasdanika.sdk.runtime.models.typescript:model` ·
> Java module `org.nasdanika.sdk.runtime.models.typescript` · Package `https://runtime.sdk.nasdanika.org/models/typescript` ·
> Part of the [Nasdanika SDK Runtime](https://github.com/Nasdanika-SDK/runtime)

A model of the TypeScript **declaration surface**, about thirty classes covering packages, modules,
imports, declarations, members and type references: enough to emit an npm package that compiles
clean under `strict` and `NodeNext`, and no more than that.

It is a **transformation target**, not something you author directly. Nothing loads TypeScript into
it; things are transformed into it, and it is written out.

## What it is for

Models published as Maven artifacts need a JVM to be used, and that is a real adoption tax. This
model is how the same models, and more interestingly the *data* loaded into them, reach consumers
that do not have a JVM and never will: browsers, Node tooling and React applications.

The shape of the work is one pipeline, repeated per source:

```
   spreadsheets     database metadata     build files     issue trackers     diagrams
        |                   |                  |                 |               |
        +-------------------+--------+---------+-----------------+---------------+
                                     |
                                     | loaders, snapshots
                                     v
                          EMF model + instance data
                      (typed, documented, marked, owned)
                                     |
                                     | transformation
                                     v
                              TypeScript model
                                     |
                                     | generator, with import management
                                     v
                     npm package: .ts / .d.ts + package.json
                                     |
                                     v
                   JavaScript or React application, in a browser
```

The list of sources is open by construction: anything with a loader is a candidate, because the
transformation is written against EMF rather than against the source format. In the runtime as of
this version, the last two steps, this model and its generator, are available; loaders for the
sources above, and the transformations from models to this one, are planned.

### The output: data as a versioned module

The payload is not a REST endpoint and not a JSON document fetched at run time. It is an **npm
package**, and that choice carries most of the value.

**Types and data ship together.** One generation pass emits the interfaces and the data that
satisfies them. A consumer writes `import { projects } from "@acme/portfolio"`, and `tsc` checks
every field access against the schema the data actually has. Neither the declarations nor the
payload were written by hand, so they cannot drift apart.

**Versions are the snapshot mechanism.** `2026.9.0` is the data as of that release, and `2026.6.0`
is the data a quarter earlier. Both are immutable, both are installable, and both can sit on disk at
once. "How far has this drifted since the last audit" becomes a diff of two packages rather than a
survey.

**Distribution is a solved problem.** Registries, scopes, private registries, integrity hashes,
provenance attestation, lockfiles, offline installs and mirrors all exist and are operated by people
whose job that is. Models do not need a data distribution platform; they need to emit packages.

**Consumption needs no backend.** A React application that imports its reference data has no API to
stand up, no authentication to broker and no reason for anything to leave the machine. A model
viewer that runs entirely in the browser, opening local files with nothing uploaded, turns a privacy
claim into an artifact people can click.

**Provenance survives the trip.** Every generated element can carry markers back to the elements it
was generated from, so a constant in a browser bundle can still answer which spreadsheet cell or
which database column produced it, in which commit.

In the browser, the stance is **viewer and analyzer first**. Authoring stays with the sources.

## Why a model rather than a template

Emitting declarations from EMF with a template is two hundred lines and a day's work. If that were
the only consumer, a template would win. Four things carry the model instead.

### 1. Import management

This is the reason the model exists. A generator has to get all of the following right, per
reference, every time:

* **Named, default and namespace** imports, three different statements with three different local
  binding rules.
* **`import type` versus value import**, which decides whether the import is erased at compile
  time. Get it wrong across generated packages and a cross-package cycle stops compiling, or a
  package that needed only another package's types drags in its runtime.
* **Relative versus bare** specifiers: a file in this package, or a dependency that has to appear in
  `package.json`.
* **The `NodeNext` extension rule**, under which a relative ESM specifier carries a `.js` extension
  even in `.ts` source.

Generators written by hand get this wrong repeatedly. So `Module.imports` is normally **computed at
generation time** from the type references reachable in the module, not authored: a
`NamedTypeReference` points at its declaration, the generator walks from the declaration to its
module and package, and decides the specifier and whether the import can be type-only. Authored
imports remain for what it cannot see: side-effect imports, and types used only inside opaque text.

### 2. Many consumers, not one

Models to TypeScript is the first consumer, not the only one. The
[React model](../../../react/model/doc/readme.md) extends this one, and tool definitions and tool
schemas for agents are TypeScript too. The model is therefore built as a good general TypeScript
target rather than an EMF-shaped one.

### 3. Generation becomes a model-to-model transformation

A source model becomes a TypeScript model and then text, rather than becoming text directly. The
intermediate result is an object graph that can be validated, queried, diffed and reported on
before a character is written.

### 4. Generated code is markable

`TypeScriptElement` extends the [core model](../../../core/doc/readme.md)'s `NamedElement`, so every
module, declaration and member can carry markers back to the source elements it came from, and
documentation.

## Scope: the declaration surface, not the type algebra

Modeling all of TypeScript would take several hundred classes and would still trail a language that
ships type-system features every quarter. The model covers what a generator needs to write a
declaration, and stops, with three explicit escape hatches:

* **`OpaqueTypeReference`**: conditional types, mapped types, template literal types, `keyof` and
  `typeof` constructions.
* **`OpaqueMember`**: index signatures, call signatures, overload sets, awkward decorators.
* **`CodeBlock`**: function and method bodies, initializers, default values.

All three carry a `references` list, and that detail is what makes the escape hatches safe: opaque
text still declares the named types used inside it, so an opaque block does not silently defeat
import management.

## Write only

There is no loader, and probably never will be. Parsing TypeScript means the TypeScript compiler
API, which is TypeScript rather than Java, and a second-rate Java parser for a language this size is
not worth starting. If reverse engineering is ever wanted, it belongs on the TypeScript side,
emitting this model as JSON. The omission is a decision, not a gap.

## What it models

| Area | Types |
|------|-------|
| Base | `TypeScriptElement`, extending the core model's `NamedElement` |
| Packaging | `Package`, `Module` |
| Imports | `Import`, `ImportBinding`, `ImportKind` |
| Type references | `TypeReference`, `PrimitiveTypeReference`, `NamedTypeReference`, `ArrayTypeReference`, `UnionTypeReference`, `IntersectionTypeReference`, `LiteralTypeReference`, `TypeLiteralReference`, `FunctionTypeReference`, `OpaqueTypeReference` |
| Declarations | `Declaration`, `InterfaceDeclaration`, `ClassDeclaration`, `TypeAliasDeclaration`, `EnumDeclaration`, `EnumMember`, `FunctionDeclaration`, `VariableDeclaration` |
| Signatures | `Callable`, `Parameter`, `TypeParameter`, `CodeBlock` |
| Members | `Member`, `Property`, `Method`, `Constructor`, `Accessor`, `OpaqueMember` |
| Enumerations | `ImportKind`, `PrimitiveType`, `LiteralKind`, `VariableKind`, `Visibility`, `AccessorKind` |

`Package` is deliberately thin: a scoped name, version, description, license, module type and
dependencies, enough to write `package.json` and lay out files. It is here because a generator that
emits modules but not the package around them leaves the last mile to a script, and that script is
where drift starts.

`Callable` is a supertype rather than four duplicated feature sets, so a generator writes one
signature routine for functions, methods, constructors and accessors.

## The generator

`Generator` writes a `Package` or a `Module` to a `GenericVolume<String>` with the writable
capability: it knows nothing about where the characters end up. Adapt a directory volume to text to
write files, or use any other volume; missing directories are created through the volume.

## One source, many audiences (Planned)

Generated output often has to vary by coordinate: jurisdiction, language, tier, audience, role.
None of that machinery belongs in this model. Three roles are easy to collapse into one and must be
kept apart:

| Role | Where it lives |
|---|---|
| The filter: which elements apply where | The **source** model |
| The request: generate for this coordinate | The **transformation** invocation |
| The receipt: which coordinate produced this artifact | The **output**, on `Module`, next to markers |

Only the receipt belongs here: `Module` will record the point in the coordinate space that the
generation run occupied, and stop there. And coordinates multiply: three jurisdictions by two
languages by three tiers is eighteen package sets nobody asked for, so generic packages are the
published default, and variants are generated on demand for consumers who actually exist.

## Where React fits

The [React model](../../../react/model/doc/readme.md) extends this one. This model leaves bodies as
opaque `CodeBlock` text and has no JSX on purpose. Generating React through it alone would put every
component body into opaque text and lose structure, provenance and import management for the
components used inside the markup. `CodeBlock.references` exists so that a structured body can be
substituted; the React model's `JsxBlock` is that substitution.

## Position among the models

On the core model, and nothing higher: the model needs documentation and markers, and nothing from
models of architecture, ownership or governance.

**Ownership arrives through markers, not supertypes.** A generated module points at the source
elements it was derived from, and those elements are the ones that are owned and governed.
Documentation generation walks from marker to source element to owner, and the owner it renders is
the owner of the model, which is the thing that actually has one. Making every enum member of
generated code transitively accountable would attach ownership to the artifact rather than to its
cause.

## Landscape

**JavaScript models constantly.** Zod, Valibot, ArkType and TypeBox give runtime schemas and static
types from one declaration. Prisma and Drizzle model data with generated types. tRPC and GraphQL
code generation give typed contracts. MobX-State-Tree has shipped a runtime type system with
observable trees, snapshots and patches for a decade. The ecosystem is not short of modeling. It
simply does not call it that.

**What it does not have is composition between vocabularies.** All of the above are per application
and per library. Nobody publishes vocabularies on npm that compose by inheritance: a governance
vocabulary with an architecture vocabulary with a work vocabulary. "EMF for JavaScript" has been
tried, with ecore.js and CrossEcore, and found few users; what has not been tried is a library of
composable domain vocabularies in TypeScript, carrying real data from real systems. So documentation
for npm users opens with what the modules are for, shows TypeScript, and mentions EMF rarely.

**What is different now is agents.** The reason to have a typed vocabulary, with an organization's
own data in it, in a browser in 2026 is that an agent writes code against it and `tsc` rejects the
mistakes. Typed data with provenance is a far better substrate for an assistant than a JSON file and
a prompt.

## Status

**Available:** the model, and the generator with import management, tested by generating a package
that exercises every construct and compiles under `strict`.

**Planned:** transformations from other models into this one, starting with EMF packages and Meta
vocabularies; coordinates on `Module`; generated documentation for npm users.

## Further reading

* [`typescript.xcore`](../src/main/resources/org/nasdanika/sdk/runtime/models/typescript/typescript.xcore): the model source
* [`Generator`](../src/main/java/org/nasdanika/sdk/runtime/models/typescript/generator/Generator.java): model to sources, and where import management lives
* [`BankTests`](../src/test/java/org/nasdanika/sdk/runtime/models/typescript/tests/BankTests.java): a sample package built programmatically and generated
* The Nasdanika SDK Runtime book, chapter "From models to the web"
