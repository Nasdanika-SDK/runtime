[TOC levels=6]

# Meta

> Directory `models/meta/model` · Maven `org.nasdanika.sdk.runtime.models.meta:model` ·
> Java module `org.nasdanika.sdk.runtime.models.meta` · Package `https://runtime.sdk.nasdanika.org/models/meta` ·
> Part of the [Nasdanika SDK Runtime](https://github.com/Nasdanika-SDK/runtime)

A language-neutral type system: a micro-model of typed domain models, with packages, classes,
features, operations and the type references between them, in about twenty classifiers on the
runtime's [core model](../../../core/doc/readme.md). A vocabulary is written down once in Meta and
projected to whatever its consumers need.

In the terms of Domain-Driven Design, Meta is a
[Published Language](https://martinfowler.com/bliki/PublishedLanguage.html): a documented, shared
vocabulary that bounded contexts translate into and out of. It adds the part that was out of reach
when the term was coined: the vocabulary is machine-checkable, because the types and the
documentation are generated from it.

It is deliberately not a superset of any of its sources. Whatever does not fit is dropped by design
or carried in an `Annotation`, and the loaders decide which.

## Why

### Every format describes the same thing, slightly differently

A class with named, typed, possibly multi-valued features is one of the most stable ideas in
computing, and every ecosystem spells it its own way: Ecore, Java, XML Schema, JSON Schema, a
database schema, TypeScript, a table on a wiki page, a spreadsheet. The differences are real and
small, and most of them are about the host language rather than about the domain.

The cost is not the spelling. It is that one definition, of a customer, an order or a service,
lives in many formats at once and nothing relates them: a DDL script, a JSON Schema, a partner's
XSD, a Java class, a wiki table and a few spreadsheets. Each is a projection of a domain model that
was never written down. Meta is the place to write it down once, and project.

### Documentation is an afterthought in most of them

This deserves care, because it is not uniformly true.

| Source | Documentation it carries |
|---|---|
| Ecore | One string, in a GenModel annotation detail |
| Java | Nothing reflective: Javadoc lives in source comments, not in the type model |
| JDBC | `REMARKS`, one string per table or column, frequently empty |
| JSON Schema | A `title` and a `description` string |
| Protocol Buffers | Source comments, and only when descriptors are built to retain them |
| XML Schema | `xs:annotation/xs:documentation`: repeatable, language-tagged, markup permitted |
| OpenAPI | `description` as CommonMark, plus `externalDocs` |
| OWL and RDFS | `rdfs:comment`, `skos:definition`, extensible and language-tagged |
| **Meta**, through the core model | `documentation`, `docRef`, `docFormat`, `docContents`, `docSections` |

XML Schema, OpenAPI and OWL do respectably. The honest claim is narrower and more useful than
"nobody supports documentation": **none of them treats documentation as structure.** A string
cannot be divided into sections, cannot point to a resource that lives elsewhere, and cannot
declare its own format. Meta elements are core model elements, so their documentation can do all
three, and their markers say where each element came from.

### Publishing, with diagrams, is the deliverable

A model that cannot be read by the people who own the vocabulary is a private notation. A
vocabulary published as a site, with a page per element, its documentation, its neighbors and a
diagram of its neighborhood, is a glossary that cannot drift from the types, because both come from
one source. That is the artifact a business stakeholder opens, and nobody has to hear the word
"metamodel".

### Agents need structure, and the incumbent is a spreadsheet

An assistant reasoning over an organization's systems has to know what a customer is, what an
account is, and how they relate. Today that context is assembled by hand, per project, from
whatever prose can be found. An agent given a declared, versioned, owned vocabulary answers from it
and cites it; an agent given a DDL script and a wiki export infers, and inference is not a chain of
custody.

The competitor is not another modeling tool. It is a spreadsheet and a wiki table, which win
because they are free, everyone can use them, and they never ask anyone to adopt anything. Meta
treats them as inputs rather than as enemies: the vocabulary is captured where it already lives and
projected from there.

## What it models

| Area | Classifiers |
|---|---|
| Base | `ModelElement`, on the core model's `NamedElement`, and `Annotation` |
| Structure | `Package`, `Classifier`, `Class`, `DataType`, `Enum`, `EnumLiteral` |
| Members | `TypedElement`, `Feature`, `Attribute`, `Reference`, `Operation`, `Parameter` |
| Types | `TypeParameter`, `TypeReference`, `ClassifierReference`, `TypeParameterReference`, `PrimitiveTypeReference`, `UnionTypeReference`, `IntersectionTypeReference`, `WildcardTypeReference`, `OpaqueTypeReference`, `PrimitiveKind` |
| Instances | `Object`, `IncomingReference` |

`Attribute.identifying` marks the attributes that identify an instance, which is how a reference
cites a target and, incidentally, how a Domain-Driven Design entity is told from a value object.
`Reference.containment` separates tree edges from graph edges; `opposite` and `keys` carry
bidirectionality and identity within a list. A `Package` is the unit of publication: one package
becomes one Maven artifact or one npm package.

The model is metacircular: a `Package` containing `Class`es describes `Package` and `Class`, so a
runtime can bootstrap from this model alone and needs no foreign metamodel.

## What is deliberately not modeled

The rule is that **what a class-based type system cannot express is not a class here.** That keeps
Meta at about twenty classifiers, against Ecore's fifty-three, of which a runtime loader uses a few.

* No `volatile`, `transient`, `unsettable` or `resolveProxies`: implementation concerns of EMF with
  no meaning in a browser.
* No feature maps, no factories, no generic type algebra. Unions, intersections and wildcards are
  carried, so that a Java or TypeScript signature can be written down without loss, but nothing
  computes subtyping or substitution with them.
* No subpackages, which neither TypeScript modules nor npm packages need. A loader flattens and
  records the original path.
* No interface flag. Whether a `Class` becomes an interface, a type alias or a class is the
  projection's decision, not a property of the model.

Everything else arrives through `Annotation`, `OpaqueTypeReference` or a sub-model. An annotation
is keyed by a source URI naming its owner, the bargain Ecore's `EAnnotation` makes, so two loaders
never collide.

## Sources and targets

A vocabulary comes in through authoring surfaces and harvesters, and goes out through projections.
As of this version, a vocabulary is built in Java or written as YAML, JSON or XMI, which every
runtime model supports; the surfaces and projections below are planned.

| Direction | Formats |
|---|---|
| Authored in | Excel, for the people who already keep the vocabulary there; Draw.io, where the diagram is the source rather than a picture of it; Markdown, where the prose matters most; the Groovy DSL, for programmatic construction |
| Harvested from | Ecore, Java, XML Schema, JSON Schema and database metadata. Most of a domain model is already written down somewhere, and asking people to retype it is how modeling efforts die |
| Projected to | TypeScript packages with runtime type information; JSON Schema, for validation and for the tool schemas of agents; Ecore, as a dynamic package, so that every EMF tool works on a vocabulary without generated Java; documentation sites with diagrams; SQL, Java or Python on demand |

The Ecore projection is the quiet one and possibly the most useful: a vocabulary captured in a
spreadsheet can be validated, compared, diagrammed and serialized by tools that already exist.

### Specializations per target

A projection sometimes needs to say something the neutral model should not carry. A Java projection
adds a package name and a superclass; a persistence projection adds a table name; a TypeScript
projection adds nothing at all. Those live in sub-models, `JavaClass extends Class`, when they are
structural enough to deserve types, and in annotations when they are not. The neutral model stays
neutral either way, which is what lets one vocabulary serve many projections.

### Flattening

Inheritance is how a model is authored. It is not always how it is consumed: a TypeScript
interface, a JSON Schema for a tool call and a summary handed to an agent all read better as a flat
class, with every inherited feature and operation inlined.

Flattening is a model-to-model transformation in Meta, not a trick inside each emitter: the input is
a `Package`, the output is a `Package` whose classes declare everything they inherited, and every
copied feature carries a marker back to the class that declared it. It is testable by diffing,
reusable by every projection, and auditable.

Flattening is also where composition stops being free:

* Most same-name encounters are not clashes. A feature reached twice through a diamond is one
  feature, and an operation redeclared with the same signature is an override. Deduplicate by
  feature identity, not by name.
* The same name with genuinely different declarations is a clash, resolved by renaming,
  deterministically, with the most derived declaration keeping the name and the rename recorded on
  the feature.
* The renaming happens in Meta rather than downstream, because TypeScript refuses an interface that
  extends two interfaces declaring a member incompatibly, and a strict tool schema has no room for
  the composition that would otherwise carry it.

A projection can compact further by dropping features a consumer does not need, and there are two
different reasons to drop one. A model may not track something the metamodel supports, which is an
editorial decision recorded as an annotation on the feature. Or a dataset may not populate it,
which is a measurement. The cut and the policy are functions of the schema; population is a
function of the contents, and must not be materialized as a package somebody will generate from.

What a cut must not do is erase distinctions: removing an ancestor's name is recoverable by widening
the cut, while replacing a class by its ancestor removes a distinction nothing can recover.

## Instances, and the type as a reference

`Object` is the reflective instance of a Meta class: no generated interface, no implementation
class, no factory. It knows its type by reference and answers about itself through a dozen
operations: `get`, whole or by range, `set`, `add`, `remove`, `unset`, `size`, `invoke`, its
container and containment feature, and its incoming references, filtered, paged and counted. An
agent gets an interaction surface that can be taught in a paragraph rather than a package.

The rule that keeps the surface small: **an operation belongs here only if a consumer cannot
compute it from the others and the type without loading data it did not ask for.** Contents are
derivable from the type's containment references and `get`, so there is no contents operation.
`size` and ranged `get` pass the rule, because they answer without fetching every value, and ranged
`get` is what makes a large model usable over a wire. `isResolved` is the one concession, because
references cross resources by URI and something has to represent "not here yet".

### Classified later

Because the type is a reference, an object can exist before it is classified, and be classified
later. That is the shape elicitation has: a thing is named before anyone knows what kind of thing it
is, refinement proceeds by dividing, an agent proposes a classification and a person corrects it.
Before classification, values wait in annotations; classification promotes what fits into features
and leaves the rest where it was.

| Change | Example | Safety |
|---|---|---|
| Specialization, to a subtype | `Person` to `Author` | Safe: every feature in scope stays in scope |
| Generalization, to a supertype | `Author` to `Person` | Loses a distinction |
| Reclassification, to an unrelated type | `Person` to `Publisher` | Arbitrary: names may coincide while meanings do not |

**Values are never silently dropped.** A value whose feature falls out of scope moves to an
annotation, keeping its feature name and the type that declared it. Identity is intrinsic, not
derived from an identifying attribute, so it survives retyping, and a marker records who classified
an object and when, which separates confirmed facts from unreviewed machine guesses.

What this makes possible: a vocabulary as a model whose terms are classes and whose permitted
values are instances, serving a generated glossary for people and a lookup tool for an agent from
one source; a polymorphic UI over anything Meta describes, with no generated code; and queries
over instances and their types in one statement, because the type is an edge like any other.

## Federated by design

There is no server and no central repository. A vocabulary is files in Git, or an artifact
published to Maven Central or npm, and packages reference each other by namespace URI, so a team
owns its vocabulary and refers to another team's without coordinating a release. That gives what a
catalog cannot:

* **Branching.** A proposed change to a term, reviewed as a pull request, with a diff showing
  which features moved.
* **History.** The same history the code has, with the same tools.
* **Ownership at the edges.** Nobody administers the whole graph.
* **Immutable snapshots.** What a term meant last year is an install, not an investigation.

## Tower position

Directly on the core model, and nothing higher. What Meta needs from below is identity,
documentation as structure and markers; it needs nothing from the floors above. That is deliberate:
Meta is the runtime foundation of every generated package, and a browser application should not
drag a governance model in to render a customer list, nor an agent pay for lifecycle vocabulary in
its context window on every call.

Richer variants extend it, and add aspects from higher floors when those exist: `JavaClass extends
Class` for the specifics of a source language, a managed class extending `Class` and the work and
governance aspects for stewardship. A floor can also re-declare a class under the same name, an
empty subclass, to decide what the word means on that floor and above, which also gives a
flattening projection a named class at which to cut the supertype chain.

**Situated vocabularies** (Planned). With the occupancy model, classes and features will be
situated in coordinates such as jurisdiction, language, tier and audience. One vocabulary then
carries its variants together, with the features that differ marked by the coordinates they apply
in, and generating for a coordinate emits what applies there and nothing else: a product line
rather than a fork.

## Landscape

| Camp | Examples | What it leaves undone |
|---|---|---|
| Industry data models | Licensed enterprise data models | Content you license rather than a vocabulary you own; thousands of entities |
| Standards | schema.org, FHIR, FIBO, ISO 20022 | Good content, delivered as OWL files, PDFs and spreadsheets with little tooling. **Sources for Meta, not rivals** |
| Data catalogs | Collibra, Alation, Atlan | Organized around where data lives; business semantics stay thin, and the graph is centralized and rented |
| Semantic layers | dbt, Cube, LookML | Analytics only: metrics, dimensions and joins, with no ownership or lifecycle |
| Ontology platforms | Palantir Foundry | Has the whole thing and keeps it: the ontology does not leave the platform |
| Modeling tools | Sparx EA, erwin, MagicDraw | Desktop era, weak federation, and the output is a document |
| **The actual incumbent** | Spreadsheets and wiki tables | Drift within weeks, cannot be queried, and are invisible to an agent |

What is different here is not the class-and-feature part, which everybody has. It is the
combination of composition with the other models of the runtime, federation without a server,
documentation as structure, and portability: a vocabulary reaches a browser and an agent's context
window as a typed package, without a JVM and without a platform.

## Status

**Available:** the model, with generated code, contributed as a Java service, so a configured
resource set loads and saves vocabularies in every format the runtime supports.

**Sketch:** the operations of `Object` are declared, with no implementation yet. The obvious
implementation is dynamic EMF behind the interface, through the Ecore projection.

**Planned:** the authoring surfaces, harvesters and projections above, flattening, and situated
vocabularies.

## Using it

Import the runtime's BOM and depend on the module:

```xml
<dependency>
    <groupId>org.nasdanika.sdk.runtime.models.meta</groupId>
    <artifactId>model</artifactId>
</dependency>
```

```java
MetaFactory meta = MetaFactory.eINSTANCE;
Package vocabulary = meta.createPackage();
vocabulary.setName("library");
vocabulary.setNamespace("https://example.org/vocabulary/library");
vocabulary.setDocumentation("The words a library uses, and what they mean here.");

Class book = meta.createClass();
book.setName("Book");
book.setDocumentation("A published work, identified by its ISBN.");
vocabulary.getClassifiers().add(book);
```

## Further reading

The Nasdanika SDK Runtime book, chapter "Meta: a language-neutral type system", which builds a
vocabulary and sketches two projections: a glossary and a dynamic Ecore package.
