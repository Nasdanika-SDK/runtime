
```drawio-resource
../typescript.drawio
```

[TOC levels=6]

# Nasdanika TypeScript Model

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of the TypeScript **declaration surface**,
defined in [`typescript.xcore`](typescript.xcore) and positioned on the
[Nasdanika model tower](https://nasdanika.com/models.html). About thirty classes covering packages,
modules, imports, declarations, members and type references - enough to emit an npm package that compiles
clean under `strict` and `NodeNext`, and no more than that.

It is a **transformation target**, not something you author directly. Nothing loads TypeScript into it;
things are transformed into it, and it is written out.

## What it is for

The tower publishes models as Maven artifacts, which means every consumer needs a JVM. That is a real
adoption tax, and it is why most Nasdanika demonstrations begin by asking for Java. This model is how the
same models - and, more interestingly, the *data* loaded into them - reach consumers that do not have a JVM
and never will: browsers, Node tooling, and React applications.

The shape of the work is one pipeline, repeated per source:

```
  MS Excel        SQL / JDBC metadata      Maven POMs        Jira        Draw.io
      |                    |                   |               |            |
      +--------------------+---------+---------+---------------+------------+
                                     |
                                     | loaders, clients, snapshotting
                                     v
                            Ecore model + instance data
                        (typed, documented, marked, owned)
                                     |
                                     | Transformation
                                     v
                              TypeScript model
                                     |
                                     | emitter, with import management
                                     v
                     npm package: .ts / .d.ts + package.json
                                     |
                                     v
                    JavaScript / React application, in a browser
```

Everything to the left of the TypeScript model already exists and is in use. What was missing is the last
two steps, and they are the reason this model was written.

### The sources

The tower's position has always been that most of what is worth modeling already exists somewhere else, and
that the job is to load and snapshot it rather than to ask people to type it in again. Every one of those
loaders is now also a data source for a publishable npm package.

| Source | Model | What arrives on the JavaScript side |
|---|---|---|
| MS Excel | [Excel](https://github.com/Nasdanika-Models/excel) | Sheets, rows and columns loaded into a domain model - the spreadsheet that was the system of record becomes a typed module |
| SQL / JDBC metadata | [SQL](https://github.com/Nasdanika-Models/sql) | Ecore classes generated from `DatabaseMetaData` and result-set metadata, plus the rows loaded through them: a schema and its reference data as types and constants |
| Maven | [Maven](https://maven.models.nasdanika.org/) | Modules, coordinates, dependencies, plugins, developers - a federated dependency graph a browser can traverse |
| Jira | [Jira](https://jira.models.nasdanika.org/) | Issues, projects and releases, captured as a dated snapshot rather than re-queried |
| Git / GitLab | [Git](https://github.com/Nasdanika-Models/git), [GitLab](https://gitlab.models.nasdanika.org/) | Repositories, projects, commits, branch-scoped views of the estate |
| Draw.io | [Draw.io](https://drawio.models.nasdanika.org/) | Diagrams authored by people, as data, with the diagram still the authoring surface |
| Copybooks, datasets | [System of Records](https://sor.models.nasdanika.org/) | Record layouts and fields, including the structural facts a spreadsheet cannot hold |
| Any tower model | all of the above | The vocabulary itself - Ecore classes as TypeScript interfaces |

The list is open by construction. Anything with a Nasdanika loader is a candidate, because the
transformation is written against Ecore rather than against the source format.

### The output: data as a versioned module

The payload is not a REST endpoint and not a JSON blob fetched at runtime. It is an **npm package**, and that
choice carries most of the value.

**Types and data ship together.** One generation pass emits the interfaces and the data that satisfies them.
A consumer writes `import { projects } from "@acme/portfolio"` and `tsc` checks every field access against
the schema the data actually has. There is no drift between a hand-written type declaration and the payload,
because neither was hand written.

**Versions are the snapshot mechanism.** `2026.9.0` is the estate as of that release; `2026.6.0` is the
estate a quarter earlier. Both are immutable, both are installable, and both can sit on disk at once. "How
far has this drifted since the last audit" becomes a diff of two packages rather than a survey. Prereleases
and snapshot builds behave exactly as the ecosystem already expects, so nobody has to learn a new idea to
use them.

**Distribution is somebody else's problem, already solved.** Registries, scopes, private registries,
integrity hashes, provenance attestation, lockfiles, offline installs and air-gapped mirrors all exist and
are operated by people whose job that is. The tower does not need a data distribution platform. It needs to
emit packages.

**Consumption needs no backend.** A React application that imports its reference data has no API to stand
up, no auth to broker, no CORS, no rate limit, and no reason for anything to leave the machine. That last
point is not a footnote: a model viewer that runs entirely client-side, opening files from local disk
through the File System Access API with nothing uploaded, turns the privacy positioning from a paragraph
people have to believe into an artifact they can click. In regulated environments that is worth more than
any diagram.

**Provenance survives the trip.** Every emitted module carries nested markers back to the elements it was
generated from, so a constant in a browser bundle can still answer which spreadsheet cell, which JDBC column
or which Jira issue produced it, in which commit.

The read-only stance carries across. In the browser it is **viewer and analyzer first**; authoring stays on
Draw.io, Markdown and the DSL. That is a feature rather than a limitation, and it keeps the security surface
at zero.

## Why a model rather than a template

Emitting `.d.ts` from Ecore with a template is two hundred lines and a day's work. If that were the only
consumer, a template would win. Four things carry the model instead.

### 1. Import management

This is the killer feature, exactly as it is for the [Python model](https://github.com/Nasdanika-Models/python),
and TypeScript is the harder case. An emitter has to get all of the following right, per reference, every
time:

* **Named, default and namespace** imports, which are three different statements with three different local
  binding rules.
* **`import type` versus value import**, which decides whether the import is erased at compile time. Get it
  wrong across generated packages and a cross-package cycle stops compiling, or a package that needed only
  its parent floor's *types* drags in that floor's runtime.
* **Relative versus bare** specifiers, which is the difference between a file in this package and a
  dependency that has to appear in `package.json`.
* **The `NodeNext` extension rule**, under which a relative ESM specifier carries a `.js` extension even in
  `.ts` source.

Hand-written emitters get this wrong repeatedly, and the tower makes it worse, because generated packages
reference each other across floors. `Module.imports` is therefore normally **computed at save time** from
the `TypeReference`s reachable in the module rather than authored: `NamedTypeReference.target` points at the
declaration, the resolver walks declaration to module to package, and decides the specifier and the
type-only flag from what it finds. Authored imports stay available for what the resolver cannot see -
side-effect imports, and types referenced only inside opaque text.

That capability alone would justify the model.

### 2. Five consumers, not one

Ecore to TypeScript is the first consumer, not the only one. [React](https://react.models.nasdanika.org/),
[a2ui](https://a2ui.models.nasdanika.org/), [MCP](https://mcp.models.nasdanika.org/) tool definitions,
[agent](https://agent.models.nasdanika.org/) tool schemas, and resume and CV generation in the pull stack all
emit TypeScript. The model is therefore built as a good general TypeScript target rather than an Ecore-shaped
one.

### 3. Generation becomes a model-to-model transformation

Source model to TypeScript model to text, rather than source model to text. The intermediate result is an
object graph that can be validated, queried, diffed and reported on before a character is written, and the
transformation is expressible in NSML rather than in a templating language.

### 4. Generated code is markable

Because `TypeScriptElement` extends [nxcore](https://nxcore.models.nasdanika.org/) `ModelElement`, every
module, declaration and member carries nested markers back to the source elements it came from. That is the
receipts theme applied to code, and it is the mechanism the tower placement below depends on.

## Scope: the declaration surface, not the type algebra

Modeling all of TypeScript would be several hundred classes and would still trail a language that ships
type-system features quarterly. The model covers what a generator needs in order to write a declaration, and
stops, with three explicit escape hatches:

* **`OpaqueTypeReference`** - conditional types, mapped types, template literal types, `keyof` and `typeof`
  gymnastics.
* **`OpaqueMember`** - index signatures, call signatures, overload sets, awkward decorators.
* **`CodeBlock`** - function and method bodies, initializers, default values. The same bargain the Python
  model makes.

All three carry a `references` list, and that detail is what makes the escape hatches safe: opaque text still
declares the named types used inside it, so an opaque block does not silently defeat import management. A
naive escape hatch would break the one feature the model exists for.

## Write only

There is no loader, and probably never will be. Parsing TypeScript means the TypeScript compiler API, which
is TypeScript rather than Java, and a second-rate Java parser for a language this size is not a project worth
starting. If reverse engineering is ever wanted, it belongs on the TypeScript side, emitting this model as
JSON. The omission is a decision, not a gap.

## Model overview

| Area | Types |
|------|-------|
| Base | `TypeScriptElement`, extending nxcore `ModelElement` |
| Packaging | `Package`, `Module` |
| Imports | `Import`, `ImportBinding`, `ImportKind` |
| Type references | `TypeReference`, `PrimitiveTypeReference`, `NamedTypeReference`, `ArrayTypeReference`, `UnionTypeReference`, `IntersectionTypeReference`, `LiteralTypeReference`, `TypeLiteralReference`, `FunctionTypeReference`, `OpaqueTypeReference` |
| Declarations | `Declaration`, `InterfaceDeclaration`, `ClassDeclaration`, `TypeAliasDeclaration`, `EnumDeclaration`, `EnumMember`, `FunctionDeclaration`, `VariableDeclaration` |
| Signatures | `Callable`, `Parameter`, `TypeParameter`, `CodeBlock` |
| Members | `Member`, `Property`, `Method`, `Constructor`, `Accessor`, `OpaqueMember` |
| Enumerations | `ImportKind`, `PrimitiveType`, `LiteralKind`, `VariableKind`, `Visibility`, `AccessorKind` |

`Package` is deliberately thin - scoped name, version, description, license, module type and dependency
specifiers, which is enough to write `package.json` and lay out files, and not an estate model. It is here
only because a generator that emits modules but not the package around them leaves the last mile to a
script, and that script is where drift starts.

`Callable` is a supertype rather than four duplicated feature sets, so an emitter writes one signature
routine and reuses it for functions, methods, constructors and accessors.

## One source, many audiences

Generated output often has to vary by coordinate: jurisdiction, language, tier, audience, role. Ontario is
country Canada and language French; a partner edition of a catalog is a different tier from the internal
one.

None of that machinery belongs in this model, and none of it needs inventing, because the tower already has
it. [Occupancy](https://nasdanika.com/stories/2026/occupancy.html) supplies region, extent, coordinate and
dimension. [Seal](https://seal.models.nasdanika.org/)'s variant conditions are stage-scoped variant
selection. [Decision binding](https://binding.decision.models.nasdanika.org/) makes a generation target a
binding of variation points. [IAM](https://iam.models.nasdanika.org/) filters what a given role may see,
which is the same operation as filtering what gets generated for an audience.

What matters is keeping apart three roles that are easy to collapse into one:

| Role | Where it lives |
|---|---|
| The filter - which elements apply in which region | The **source** model, as occupancy |
| The request - generate for this coordinate | The **transformation** invocation: NSML, or a CLI argument |
| The receipt - which coordinate produced this artifact | The **output**, on `Module`, alongside markers |

**Only the receipt belongs here.** `Module` records the point in the coordinate space that the generation
run occupied, and stops there. Individual declarations are not situated: the coordinate is a property of the
run, and runs produce modules. If `typescript.xcore` ever knows about Ontario, the TypeScript model is
wrong.

**Coordinates multiply, and the cross-product is not a release plan.** Three jurisdictions by two languages
by three tiers is eighteen package sets nobody asked for. The coordinate-free generic packages are the
published default; coordinate-specific variants are generated on demand at build time, for consumers who
actually exist.

## Where React fits

The [React model](https://react.models.nasdanika.org/) extends this one. This model covers declarations and
leaves bodies as opaque `CodeBlock` text, and it has no JSX on purpose. Generating React through it alone
would put every component body into opaque text and throw away structure, provenance and - again - import
management for the components used inside the markup. `CodeBlock.references` exists precisely so that a
structured body can be substituted later; `react.JsxBlock` is that substitution.

The full authoring path is Draw.io to the [UI model](https://ui.models.nasdanika.org/) to the React model to
this model to `.tsx`, with the UI model supplying ownership, work and governance at the top and markers
carrying it down to the emitted attribute.

Interface and data therefore arrive by the same road. The application is generated from a drawn UI; the data
it renders is generated from the spreadsheet, database or tracker that holds it; both are npm packages; both
point back at their causes.

## Tower position

Branches off [nxcore](https://nxcore.models.nasdanika.org/), and nothing higher. The model's own dependencies
are documentation and markers, both nxcore, plus occupancy on `Module`. It needs nothing from
[architecture](https://architecture.models.nasdanika.org/), so by the lowest-position rule it does not sit on
architecture.

**Ownership arrives through markers, not through supertypes.** A generated `Module` points at the source
elements it was derived from, and those elements are already `Workable`, owned, governed and staged on the
floors above. Documentation generation walks marker to source element to owner, and the owner it renders is
the owner of the **model** - which is the thing that actually has one. Making every `EnumMember` transitively
accountable and sealed would produce an enormous object graph for a code generation pass, and would attach
ownership to the artifact rather than to its cause.

If a **TypeScript estate** model is ever wanted - per-module owners asserted independently, dead code
detection, npm supply chain, package provenance - that is a separate model branching off architecture or
threat, on the [Maven model](https://maven.models.nasdanika.org/)'s pattern. The two are not the same thing.
This model describes what to emit; an estate model describes what exists and who answers for it.

**On the language-model family.** There is now Python, the parser-neutral SQL AST and TypeScript, with the
presentation family next door. That is enough to notice a pattern and not enough to generalize from. A shared
source floor - naming, module and file structure, dependencies, opaque blocks, and an import management
contract - would let NSML transformations target "a language" generically, which is attractive, and is also
the classic universal-AST trap, which fits no language well. TypeScript is built standalone now; the shared
base gets revisited if a third language arrives, and stays thin if it does.

## Landscape

**JavaScript models constantly.** Zod, Valibot, ArkType and TypeBox give runtime schemas and static types
from one declaration. Prisma and Drizzle model data with generated types. tRPC and GraphQL codegen give typed
contracts. MobX-State-Tree has shipped a runtime type system with observable model trees, snapshots and
patches for a decade, which is a substantial slice of what EMF sells. XState covers statecharts; Automerge
and Yjs cover shared graph state. The ecosystem is not short of modeling. It simply does not call it that.

**What it does not have is composition between vocabularies.** All of the above are per-application and
per-library. Zod is a schema language, not an architecture metamodel. Nobody publishes a governance
vocabulary on npm that composes by inheritance with an architecture vocabulary that composes with a work
vocabulary. That is what the tower is - the floors, not the Ecore.

That distinction decides the framing. "EMF for JavaScript" has been tried twice: ecore.js died in 2018 and
CrossEcore in 2021, and the LionWeb TypeScript packages are interchange-focused and small. CrossEcore is the
control experiment - a competent generator with a real runtime and OCL support, and almost nobody came. What
has not been tried is a library of composable domain vocabularies, in TypeScript, carrying real data from
real systems. So the npm-facing documentation opens with what the modules are *for*, shows a TypeScript
snippet, and mentions Ecore roughly never. A JavaScript developer who has to learn what an `EPackage` is
before the first useful line has already closed the tab.

**What is different now is agents.** Better tooling and better bundlers are not the reason; those were good
enough in 2021. The reason to have a typed domain vocabulary, with the organization's own data in it, sitting
in a browser in 2026 is that an agent writes code against it and `tsc` rejects the mistakes. Typed data with
provenance is a far better substrate for an assistant than a JSON file and a prompt.

## Status

New, and deliberately narrow. The spine and its data projections, not a cross-product of variants; write-only,
with no compiler-API round trip planned; viewer-first in the browser. The generation and documentation this
model produces are useful on the Maven side regardless of whether an npm audience materializes, which is what
makes publishing to npm a cheap experiment rather than a second product to maintain.

## Resources

* [`typescript.xcore`](typescript.xcore) - the model source
* [Generator](https://github.com/Nasdanika-Models/typescript/blob/main/model/src/main/java/org/nasdanika/models/typescript/generator/Generator.java) - model to sources, and where import management lives
* [BankTests](https://github.com/Nasdanika-Models/typescript/blob/main/model/src/test/java/org/nasdanika/models/typescript/tests/BankTests.java) - a bank package built programmatically and generated, exercising every construct
* [TypeScript tour](https://github.com/Nasdanika-Models/typescript/tree/main/test-project) - the same language surface written by hand, with an introduction to TypeScript and npm for readers coming from Java
* [React model](https://react.models.nasdanika.org/) - JSX and components, extending this model
* [UI model](https://ui.models.nasdanika.org/) - the framework-neutral authoring model
* [Python model](https://github.com/Nasdanika-Models/python) - the sibling code model, where import management was first worked out
* [SQL model](https://github.com/Nasdanika-Models/sql) - Ecore generation from JDBC metadata, and data loading
* [Excel model](https://github.com/Nasdanika-Models/excel), [Maven model](https://maven.models.nasdanika.org/), [Jira model](https://jira.models.nasdanika.org/) - data sources
* [nxcore](https://nxcore.models.nasdanika.org/) - documentation, markers and time
* [Nasdanika model tower](https://nasdanika.com/models.html)
