```drawio-resource
../meta.drawio
```

[TOC levels=6]

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of typed domain models - packages, classes, features, operations and the type references between them - positioned on the [Nasdanika model tower](https://nasdanika.com/models.html) directly above [nxcore](https://nxcore.models.nasdanika.org/).

About twenty classifiers. It is **loaded from** Ecore, Java, XML Schema, JSON Schema, JDBC metadata, Draw.io, Markdown and Excel, and **projected to** TypeScript, JSON Schema, Ecore and documentation.
It is deliberately not a superset of any of its sources: whatever does not fit is dropped by design or carried in an `Annotation`, and the loaders decide which.

It is a [Published Language](https://martinfowler.com/bliki/PublishedLanguage.html) in the Domain-Driven Design sense - a documented shared vocabulary that bounded contexts translate into and out of - with the part Evans could not have in 2003, which is that the vocabulary is machine checkable because the types and the documentation are generated from it.

## Why

### Every format describes the same thing, slightly differently

A class with named, typed, multi-valued features is one of the most stable ideas in computing, and every ecosystem has reinvented its own spelling of it.
The differences are real but small, and almost all of them are about the host language rather than about the domain.

The cost is not the spelling. It is that a bank's customer definition lives in nine formats at once - a DDL script, a JSON Schema, a COBOL copybook, an XSD from a partner, a Java class, a Confluence table, three spreadsheets - and nothing relates them.
Each is a projection of a domain model that has never been written down. This model is the place to write it down once, and project.

### Documentation is an afterthought in most of them

This deserves care, because it is not uniformly true.

| Source | Documentation it carries |
|---|---|
| Ecore | one string, in a GenModel annotation detail |
| Java | nothing reflective - Javadoc lives in source comments, not in the type model |
| JDBC | `REMARKS`, one string per table or column, frequently empty |
| JSON Schema | `title` plus a `description` string |
| Protobuf | source comments, and only when descriptors are built to retain them |
| XML Schema | `xs:annotation/xs:documentation` - repeatable, language tagged, markup permitted |
| OpenAPI | `description` as CommonMark, plus `externalDocs` |
| OWL / RDFS | `rdfs:comment`, `skos:definition`, extensible, language tagged |
| **meta**, through nxcore | `documentation`, `docRef`, `docFormat`, `docContents`, `docSections` |

XML Schema, OpenAPI and OWL do respectably. The honest claim is narrower and more useful than "nobody supports documentation": **none of them treat documentation as structure.**

A single string cannot be divided into sections, cannot point at a resource that lives elsewhere, cannot declare its own format, and cannot say who owns it.
The nxcore shape does all four - and because the [role](https://role.models.nasdanika.org/) floor extends `Section` and `Content` with `Undergoer`, every section of a document can answer *whose is this*.
A definition with an owner is a different artifact from a definition without one, especially when it is wrong.

### Publishing, with diagrams, is the deliverable

A model that cannot be read by the people who own the vocabulary is a private notation.
Every model in the tower generates its own site: one page per element, its documentation, its neighbours, and a generated diagram of the neighbourhood.
A domain model published that way is a glossary that cannot drift from the types, because both come from one source.

That is the artifact a business stakeholder opens. Nobody has to hear the word "metamodel".

### Agents need structure, and the incumbent is a spreadsheet

The reason this matters more in 2026 than it did in 2016 is that something new is asking for the vocabulary.

An assistant reasoning over a bank's estate has to know what a Customer is, what an Account is, and how they relate.
Today that context gets assembled by hand, per project, from whatever prose can be found.
An agent given a declared, versioned, owned model answers from it and cites it; an agent given a DDL script and a wiki export infers,
and inference is not a chain of custody.

And the competitor is not another modeling tool. It is **a spreadsheet and a Confluence table** - which win because they are free,
everyone can already use them, and they never ask anyone to adopt anything.
This model treats them as the input rather than the enemy: Excel is a first-class authoring surface, so the vocabulary can be captured
where it already lives and projected from there.

## Authoring surfaces

One model, several front doors, chosen per audience rather than per author:

| Surface | For |
|---|---|
| [Excel](https://github.com/Nasdanika-Models/excel) | Business analysts and SMEs. The format the vocabulary is already in. |
| [Draw.io](https://drawio.models.nasdanika.org/) | Anyone who thinks in boxes and lines. The diagram is the source, not a picture of it. |
| Markdown | Definition-first authoring, where the prose matters more than the shape. |
| JSON and YAML | Machine authored, and the loaders' own output. |
| [Groovy DSL](https://docs.nasdanika.org/core/groovy/index.html) | Programmatic construction with prototypes. |
| Ecore, XSD, JSON Schema, JDBC | Not authoring at all - harvesting what already exists. |

The last row matters most. Most of a domain model is already written down somewhere; asking people to retype it is how modeling projects die.

## Generation targets

| Target | Produces |
|---|---|
| TypeScript | npm packages of interfaces plus runtime type information - see the [TypeScript model](https://typescript.models.nasdanika.org/) |
| Documentation | a site per package, one page per element, with generated diagrams |
| JSON Schema | validation, and tool schemas for agents |
| Ecore | a dynamic EPackage, so every existing EMF tool works on a model authored here without generating Java |
| [SQL](https://sql.models.nasdanika.org/ast/index.html) DDL, [Java](https://java.models.nasdanika.org/index.html), [Python](https://python.models.nasdanika.org/index.html) | on demand - the projection is the easy part once the model exists |

The Ecore target is the quiet one and possibly the most useful: it means a metamodel authored in a spreadsheet can be validated, compared, diagrammed and serialized to EMF JSON by tooling that already exists.

## Specializations per target

A projection sometimes needs to say something the neutral model should not carry. `JavaClass extends Class` adds a package name and a superclass; a persistence projection adds a table name; a TypeScript projection adds nothing at all.

Those live in sub-models, not in annotations, when they are structural enough to deserve types - and in `Annotation`s when they are not.
The neutral model stays neutral either way, which is what lets one vocabulary serve nine projections.

## Tower position

Directly on [nxcore](https://nxcore.models.nasdanika.org/), and nothing higher. What it needs from below is identity, documentation as structure, markers, and situation - all nxcore - and it needs nothing from the floors above.

That position is deliberate and load bearing. This model is the runtime foundation of every generated package: a browser application should not drag the governance floor in order to render a customer list, and an agent should not pay for lifecycle vocabulary in its context window on every call.

### Provenance, by construction

Every element carries nested markers, so a `Class` knows it came from a particular sheet of a particular spreadsheet at a particular commit, and a `Feature` knows which XSD element or which JDBC column produced it.
When two sources disagree about what a Customer is - and they will - the model shows both and says where each came from.

### Situated: metamodel product lines

Classes and features are situated, so a metamodel occupies a region in a coordinate space: jurisdiction, language, tier, audience.

One banking metamodel therefore carries the Canadian and the United States variants together, with the features that differ marked by the coordinate they apply in.
Generating for a coordinate emits what applies there and nothing else.
That is a product line rather than a fork - the shared ninety percent stays shared, and the differences are visible as data instead of buried in the diff between two repositories.

The coordinate is a filter on the source and a receipt on the output. It is never a property of the generated artifact's contents, which is how one model stays one model.

### Shadowing at higher floors

The base model is deliberately thin. Richer variants extend it *and* the aspect mixins from the floors above:

```
meta.Class                                                    // portable, ships to browsers
sor.RecordLayout    extends meta.Class                        // physical storage
java.JavaClass      extends meta.Class                        // source language specifics
estate.ManagedClass extends meta.Class, Workable, Governed    // stewardship
```

Same object rather than a side table, so nothing needs joining, and the weight is paid only by consumers who take the specialization.

The sharper form of the same move is **re-declaration under the same name**, which the [role](https://role.models.nasdanika.org/) floor already does:

```
class Content extends nxcore.Content, Undergoer {}    // content with roles: author, editor
class Section extends nxcore.Section, Undergoer {}    // sections too
```

Empty bodies, same simple names, one cheap class per element per floor.
What it buys is that **on this floor and above, `Content` means the one with roles**, and a consumer never has to know that documentation arrives from nxcore and roles from the role floor.
The name is the whole point: the derived class is a subtype, so nothing is hidden and every existing `Content` reference stays true, but the floor has decided what the word means locally.

This convention pays for itself twice over in projections: it gives a flattening projection a **named class to cut the supertype chain at**.
What that buys is worth stating concretely, because it is the difference between a schema and a domain model.

**A subject matter expert can talk for half an hour about the lifecycle of a merchant attribute on a credit card transaction.**
When it is populated and by which system.
What its values meant before the 2019 migration.
Which downstream report breaks when it is null.
Who to ask when it looks wrong.
Which of the three systems that write it is authoritative on a Tuesday.

None of that is written down. It is not in the DDL, which has a column name and a type.
It is not in Confluence, which has a page from 2021 whose author has left.
It is not available to an agent in any form. It lives in one person's memory and leaves when they do.

With ownership from [role](https://role.models.nasdanika.org/), stages from [lifecycle](https://lifecycle.models.nasdanika.org/), normative statements from [requirements](https://requirements.models.nasdanika.org/) and remediation from [work](https://work.models.nasdanika.org/) attached to the same `Feature`, there is somewhere for all of it to go.
And the loop is short enough to actually run:

> Set up the meeting. Capture the transcript. Ask an agent to update the spreadsheet. Publish.

The attribute gains an owner, a lifecycle stage, and a paragraph that says what it means.
The next person to ask gets the answer from the model rather than from the expert's memory - and so does the next agent.

### Flattening, and the member clashes it forces

Inheritance is how the model is authored. It is not always how the model is consumed.
A TypeScript interface, a JSON Schema for a tool call, and a prompt summary handed to an agent all read better as a **flat** class: every inherited feature and operation inlined, so nothing has to walk the supertypes to learn what an object has.

That is a **model-to-model transformation in this model**, not a trick inside each emitter.
The input is a `Package`, the output is a `Package` whose `Class`es declare everything they had inherited, and every copied `Feature` carries a nested marker back to the class that declared it. So the flattening is testable by diffing, reusable by every projection, and auditable, which a template expansion inside a generator is none of.

Flattening is where composition stops being free.
Ecore rejects duplicate feature names across a class's full inherited set, so no single well-formed `.ecore` contains the problem.
This model does, because composition across independently authored sources is its job: a higher-floor class extending a base class *and* aspect mixins, or a class loaded from Java and enriched from an XSD, can end up with two features named `source` and different types.
Three consequences, and only the first is cosmetic:

- **Most same-name encounters are not clashes.** A feature reached twice through a diamond is one feature, which the mixin arrangement produces constantly since the aspects and the base both descend from nxcore, and an operation redeclared with the same signature is an override. Dedupe by feature identity, not by name, and keep the most derived override.
- **Same name, genuinely different declarations, is a clash and must be resolved by renaming**, deterministically, with the most derived declaration keeping the name and the rename recorded on the feature. A rename that exists only in emitted output is a silent divergence from the model.
- **The renaming has to happen here rather than downstream**, because TypeScript refuses an interface extending two interfaces that declare a member incompatibly, and a strict tool schema has no room for the `allOf` composition that would otherwise carry it. One resolution, computed once, consumed by every target.

Flattening is also what lets a projection **cut the supertype chain** at a re-declared class, which is where the token economy actually comes from.
Once `Content` declares the documentation it inherited from nxcore and the roles it inherited from `Undergoer`, a consumer can be shown one `Content` and told neither: nothing is lost except the attribution, and the attribution is still in the model, on the marker.
An agent should not pay for the base classes that vocabulary hangs.

A projection can compact further by dropping features a consumer does not need, and there are two quite different reasons to drop one.
A model may **not track** something the metamodel supports, which is an editorial decision about the model, durable and worth recording as an `Annotation` on the `Feature`: `INCLUDE`, `EXCLUDE`, `INCLUDE_IF_SET`, defaulting to `INCLUDE`.
Or a particular dataset may simply not populate it, which is a measurement rather than a decision.

The boundary between those two is worth marking, because it is easy to breach and expensive to find afterwards.
**The cut and the policy are functions of the schema; population is a function of the contents.**
The first two produce a legal `Package` that anything may generate from.
The third produces a summary of one afternoon's data, and the moment it is materialized as a `Package` somebody will emit TypeScript from it.

What the cut must not do is erase distinctions.
`Man` and `Woman` still extend `Person`, and a graph projection carries every retained supertype as a label, so `Person` and `Woman` are both true of the same object.
Removing an ancestor's *name* is recoverable by widening the cut; replacing a class by its ancestor removes a distinction and is not recoverable by anything, which is also how a generated write path loses the concrete class it needed to instantiate.

## Instances, and the type as a reference

`Object` is **purely reflective**, which is the whole difference from EMF's
`EObject`.
No generated interface per class, no implementation class, no factory.
An object knows its type by reference and answers about itself through a dozen of operations: `get` whole or by range,
`set`, `add`, `remove`, `unset`, `size`, `invoke`, its container and containment feature, and its
incoming references filtered, paged and counted.

An agent gets an interaction surface that can be taught in a paragraph rather than a package.

**The obvious runtime is dynamic EMF behind this interface.** This model already projects to a
dynamic `EPackage`, so EMF does resources, serialization, change recording and proxy resolution
while callers see a small set of operations.

The rule that keeps the surface small: **an operation belongs here only if a consumer cannot compute
it from the others plus the type without loading data it did not ask for.
** Contents are derivable from the type's containment references plus `get`, so there is no contents operation, and a caller
wanting contents wants the data anyway. Adapters and notification belong to an implementation.
The one deliberate concession is `isResolved`, because references cross resources by URI and something
has to represent "not here yet" before a caller reads a feature and gets a surprise.

The second clause of that rule admits `size` and range `get`, and it is narrow on purpose.
"This would be faster as a primitive" is not a reason.
"This cannot be answered without fetching a thousand objects in order to count them" is.

**Range `get` is what makes a large model usable over a wire**, and it replaces rather than joins an
indexed `get`, since `get(f, i, 1)` is the indexed case and a one-element convenience belongs in a
utility. `count` is a maximum and a short final page is not an error. One caveat that belongs with
it: offset paging assumes a stable order, this model makes order optional through `ordered` on
`TypedElement`, and paging a live source can repeat or skip.
That is the ordinary offset-versus-cursor problem, and it is solved by paging against a snapshot rather than by adding cursors here.

### Incoming references get the same treatment, and are read only

An object cannot see its own referrers without something maintaining a reverse index, which is why
this is on the surface rather than in a utility.
Three operations, mirroring the feature side: filtered retrieval, a paged form, and a count.

**Filtered by reference**, because the alternative is fetching every referrer and discarding most of
them.
That is the pushdown problem from the graph provider contract arriving one layer down, and
filtering by reference is both the minimal predicate every implementation can honour and exactly
what a Cypher pattern like `<-[:owns]-` needs.
An empty array means all; the single-reference and no-argument flavours are conveniences and live in a utility, since the array form subsumes them.

**Read only, deliberately.** Incoming references are derived. They change when the referring
object's feature changes, and a mutator here would be a second way to make the same edit with
different provenance, which is how two views of one fact stop agreeing.

**The count returns -1 when the question cannot be answered**, and that is the load-bearing detail.
A lazily loaded or remote model may have no way to know who points at an object without loading
everything.
Returning zero would be indistinguishable from "nobody references this".
So -1 means "no idea", matching the convention the graph provider's cardinality estimate uses,
and the count doubles as the capability check at no extra cost.

None of this is an agent's surface, though the capability is.
An agent reaches it through `<-[...]-` in a query. 
**This is the substrate; a query language is the presentation**, which is the same split
the tool model makes between what can be called and how it is offered.

**`size` also retires a separate `isSet`.** Under multiplicity semantics, `size == 0` and "not set"
are the same statement for both cardinalities, so carrying both operations would be carrying two
vocabularies for one fact.
EMF arrives at the same place from the other direction, since `eIsSet` on a many-valued feature is already
defined as "the list is not empty".
Nothing is lost, because this model has no `unsettable` flag and therefore no third state to distinguish.

And `size` is the runtime counterpart to `lowerBound` and `upperBound` on `TypedElement`, which is
what makes multiplicity validation reflective: a check is `size` between the bounds, rather than
fetching everything to count it.

### Type is a reference, so objects can be classified later

This is the part with no equivalent in EMF or in any class-based language, and it is not a
curiosity. **It is the shape elicitation actually has.**

Somebody describes a domain loosely.
A thing gets named before anyone knows what kind of thing it is.
Refinement proceeds by dividing: a `Storage` becomes block storage or blob storage, a `Person` becomes a `Man`.
An agent proposes a classification and a person corrects it.
A spreadsheet row is clearly *something* before it is clearly anything.

Before classification there is nowhere typed to put data, so elicited values land in `Annotation`
and **classification promotes what fits into features, leaving the rest where it was.

Three operations look alike and are not, and conflating them is how data gets lost quietly:

| | Example | Safety |
|---|---|---|
| **Specialization**, to a subtype | Person to Man | Always safe. Every feature in scope stays in scope |
| **Generalization**, to a supertype | Man to Person | Loses a distinction, which the flattening rules above already say is unrecoverable |
| **Reclassification**, to an unrelated type | Person to Company | Arbitrary. Feature names may coincide while meaning does not |

**The rule: values are never silently dropped.**
A value whose feature falls out of scope moves to an `Annotation`, keeping its feature name and the
type it was declared on, so the object carries a record of what it used to be able to say.
Classification is wrong often enough that this is not hypothetical.

`Object.getIdentities()` is **intrinsic and independent of any identifying `Attribute`**, which matters more than
it first appears.
A type-derived identity would not survive retyping, and identity is what a cross-resource reference cites and what a provenance marker anchors to.

Provenance comes from nxcore: a marker records who classified an object and when.
When an agent proposes and a human confirms, that distinction is worth keeping, because a model full of unreviewed
machine guesses and a model full of confirmed facts look identical without it.

### What this makes possible

A **vocabulary as a model**. `Measure` is a `Class`, each measure is an `Object`, dimensions are
classes and their permitted values are instances.
One source then serves a generated glossary with definitions, owners and history for people, and a lookup tool for an agent, in place of the flat
list of terms that usually occupies a system prompt and is a type system with the types erased.

A **reflective viewer** over anything this model describes, with no generated code, which is what
the TypeScript projection needs anyway once runtime type information has to exist for dispatch.

**Querying instances and their types in one statement**, because `type` is an edge like any other.

## Federated, in version control, Maven or NPM

There is no server and no central repository. 
A model is files in Git or published to Maven Central or NPM.  
Packages reference each other by URI, so a team owns its own vocabulary and points at somebody else's without either of them coordinating a release.
[Maven URI Handler](https://docs.nasdanika.org/core/maven/index.html#uri-handler) loads transparently from Maven repositories,[GitLabURIHandler](https://github.com/Nasdanika-Models/gitlab/blob/main/model/src/main/java/org/nasdanika/models/gitlab/util/GitLabURIHandler.java) from GitLab,
and GitHubURIHandler from GitHub. 

What that gives, which a catalog cannot:

- **Branching.** A proposed change to what a Customer is, on a branch, reviewed as a pull request, with the diff showing exactly which features moved.
- **History.** Not an audit log bolted on, but the same history the code has, with the same tools.
- **Ownership at the edges.** Nobody administers the whole graph. Business units publish their own packages and cross-reference by namespace.
- **Immutable snapshots.** A published version is what it was; "what did this mean in Q3" is an install rather than an archaeology project.

## Model overview

| Area | Classifiers |
|---|---|
| Base | `ModelElement` (on nxcore `NamedElement`), `Annotation` |
| Structure | `Package`, `Classifier`, `Class`, `DataType`, `Enum`, `EnumLiteral` |
| Members | `TypedElement`, `Feature`, `Attribute`, `Reference`, `Operation`, `Parameter` |
| Types | `TypeParameter`, `TypeReference`, `ClassifierReference`, `TypeParameterReference`, `PrimitiveTypeReference`, `UnionTypeReference`, `OpaqueTypeReference`, `PrimitiveKind` |
| Instances | `Object`, `IncomingReference` |

`Attribute.identifying` marks the attribute that gives an instance its identity, which is how a reference cites a target and, incidentally, how a DDD entity is distinguished from a value object.
`Reference.containment` separates the tree edges from the graph edges.
`Reference.opposite` and `keys` carry bidirectionality and target identity.

Metacircular by construction: a `Package` containing `Class`es describes `Package` and `Class`, so a runtime bootstraps from this model alone and needs
no foreign metamodel.

## What is deliberately not modeled

The governing rule is that **if a class-based type system cannot express it, it is not a class here.**
That keeps this at twenty classifiers rather than Ecore's fifty-three, of which a runtime loader uses seven.

So: no `volatile`, `transient`, `unsettable` or `resolveProxies` - EMF implementation concerns with no meaning in a browser.
No feature maps, no generic type algebra, no factories.
No subpackages, because neither TypeScript modules nor npm packages need the nesting.
No `interface` flag, because whether a `Class` becomes an interface, a type alias or a class is a decision for the projection rather than a property of the model.

Everything else arrives through `Annotation`, `OpaqueTypeReference` or a sub-model.
Loaders record what they cannot map rather than dropping it silently, so a round trip to the source stays possible even though this model is a projection.

## Landscape

| Camp | Examples | What it leaves undone |
|---|---|---|
| Industry data models | IBM Industry Models, Oracle FSDF, Teradata FSLDM | Content you license rather than a vocabulary you own; thousands of entities, and a poor implementation record |
| Standards | FIBO, BIAN, ISO 20022, ACORD | Genuinely good content, delivered as OWL files, PDFs and spreadsheets with no tooling. **Sources for this model, not rivals.** |
| Data catalogs | Collibra, Alation, Atlan | Organized around where data lives; business semantics stay thin, and the graph is centralized and rented |
| Semantic layers | dbt, Cube, AtScale, LookML | Analytics only - metrics, dimensions and joins, with no ownership, lifecycle or governance composition |
| Ontology platforms | Palantir Foundry | Has the whole thing and keeps it - the ontology does not leave the platform |
| Modeling tools | Sparx EA, erwin, MagicDraw | Desktop era, weak federation, and the output is a document |
| **The actual incumbent** | Excel and Confluence | Drifts within weeks, cannot be queried, and is invisible to an agent |

What is different here is not the class-and-feature part, which everybody has. It is four things none of the above combine:

**Composition.** Ownership, lifecycle, governance and work attach by inheritance from the floors below.
A catalog has ownership; it has no governance metamodel that composes with an architecture metamodel that composes with a work metamodel.

**Federation without a server.** URI references across repositories, in Git, Maven repositories, NPM - with no administrator of the whole.

**Documentation as structure, with owners.** Sections rather than a string, and sections that answer whose they are.

**Portability.** The model reaches a browser and an agent's context window as a typed npm package, without a JVM and without a platform. It is the ontology you can take with you.

## Resources

* [`meta.xcore`](meta.xcore) - the model source
* [nxcore](https://nxcore.models.nasdanika.org/) - identity, documentation, markers, situation
* [TypeScript model](https://typescript.models.nasdanika.org/) - the first projection
* [System of Records](https://sor.models.nasdanika.org/) - the physical data estate, a specialization of this vocabulary
* [Excel model](https://excel.models.nasdanika.org/), [SQL model](https://sql.models.nasdanika.org/) and [SQL AST model](https://sql.models.nasdanika.org/ast/index.html) - authoring surfaces and harvesting
* [Nasdanika model tower](https://nasdanika.com/models.html)
