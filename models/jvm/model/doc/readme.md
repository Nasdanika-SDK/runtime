
```drawio-resource
../jvm.drawio
```

An [Ecore](https://www.eclipse.org/modeling/emf/) model of what a Java virtual machine can name:
layers, class loaders, modules, packages, types, methods, fields and parameters.

It is a spine rather than a complete picture, and that is the design. Source information, bytecode,
and runtime observations all attach to these elements rather than restating them: a [Java source
model](https://java.models.nasdanika.org/) adds positions and generic signatures, 
a bytecode model adds instructions and constant pools,
[telemetry](https://telemetry.models.nasdanika.org/) attaches measurements, and all of them point at the same nodes.

## Why

**Everything below is already available and almost nobody asks for it.** `ModuleLayer.boot()` gives
the running module graph, `Configuration` reports what resolution actually produced, and reflection
has exposed types and members since 1997. The information was never the problem. Getting an answer
meant writing a program, which means only questions worth writing a program for ever got asked, and
that is a small set. A typed model with a query language over it drops the cost of a question to the
cost of typing it.

**There is a gap between what you declared and what is running, and nothing reports it.** A
dependency tree describes what could be on the path, including test scope, optional dependencies and
things nothing ever loads. The resolved module graph is shorter and truer. The clearest instance:

```
MATCH (m:Module)-[:reads]->(other)
WHERE NOT (m)-[:requires]->(other)
RETURN m.name, other.name
```

Modules that read something they never asked for. Usually correct and by design, because
`requires transitive` propagates readability and, more interestingly, because **service binding
pulls a provider into the resolved graph that no dependency declaration mentions**. That fact is
absent from every POM by construction, since it is a property of resolution rather than of the
build, so no dependency tool can report it.

**Non-modular code is as visible as modular code.** The module system is one feature here rather
than the reason for existing. Classpath code lives in a class loader's unnamed module, which is a
value with packages and types inside it, not an absence. This model is useful on an application that
has never heard of JPMS.

## Identity: the decision everything else rests on

Elements are named the way the JVM names them: **binary names and method descriptors**.
`com.foo.Bar`, `[I`, `baz(Ljava/lang/String;)I`.

That is not a local convention. It is the form in the constant pool, in stack traces, in `jdeps`
output, in JFR events, and in every profiler and coverage tool, and OpenTelemetry's
`code.namespace` and `code.function` carry its two halves. So a build scan, a coverage report, a
profiler trace and a distributed span all name the same method identically, and independently
produced models merge on the [NxCore](https://nxcore.models.nasdanika.org/) URI scheme with no
translation step. The recommended URI forms:

| Element | URI |
|---|---|
| Module | `jvm:module/<module name>` |
| Package | `jvm:package/<binary package name>` |
| Type | `jvm:type/<binary name>` |
| Method | `jvm:method/<owner binary name>#<name><descriptor>` |
| Field | `jvm:field/<owner binary name>#<name>:<descriptor>` |
| Parameter | `jvm:parameter/<owner method tail>#<index>` |

The payoff is that joining static structure to runtime observation is mechanical rather than a
project, which is what makes the telemetry and coverage stories below possible at all. JaCoCo is the
worked example: its XML report already keys classes by VM name and methods by name plus descriptor,
so coverage merges onto these elements with no mapping layer and no per-project configuration.

## Scope

| | |
|---|---|
| **In** | Layers, class loaders, modules and their directives, packages, types, methods, fields, parameters, resolved readability, access flags, class file version |
| **Erased** | No generics. Identity is by descriptor and descriptors are erased. Generic signatures live in the models above, and are recoverable from the `Signature` attribute by a bytecode reader as well as from source |
| **Out** | Source positions, instructions, constant pools, annotations |
| **Projected, not extended** | [Meta](https://meta.models.nasdanika.org/). See below |

**Annotations are the most likely first addition** and are deliberately absent from the first cut.
They are among the most query-valuable things in a JVM estate ("every method marked deprecated",
"every type carrying a given framework annotation"), and they are also a self-contained increment
that can be added without disturbing anything here. Left out to keep the first version to one day.

## Relation to Meta, and why this does not extend it

The [Meta model](https://java.models.nasdanika.org/) covers packages, classes, features and operations, loads from
Java among other formats, and states that it is "deliberately not a superset of any of its sources",
with whatever does not fit dropped by design or carried in an annotation. That is a published
language, and a published language is a projection target rather than a base class.

The concrete test: bridge methods, synthetic accessors, access flags and overloads that differ only
in erased parameter types are first-class JVM realities that Meta has said it will not grow to hold.
Extending Meta would shape a model whose entire value is fidelity to the JVM's own reference scheme
by one that is deliberately lossy about it.

So this model sits on NxCore, and **projects** to Meta, which gives Meta the Java source it already
advertises and gives anyone comparing a Java type with an Ecore class or a JSON Schema type the
route they expect.

## Model overview

| Area | Types |
|---|---|
| Root | `JavaVirtualMachine`: `live`, VM name, version, vendor, specification version; contains modules, layers, class loaders |
| Runtime structure | `Layer` (`boot`, parents, modules), `ClassLoader` (parent, unnamed module) |
| Modules | `Module` (`named`, version, modifiers, main class, `uses`, **`reads`** as resolved readability), `Requires` with `RequiresModifier`, `Exports` and `Opens` with targets, `Provides` with service and providers |
| Types | `Package`, `Type` (`TypeKind`, `AccessLevel`, binary name, descriptor, supertype, interfaces, component type, class file version) |
| Members | `Member` abstract, `Method` (covers constructors as `<init>` and static initializers as `<clinit>`), `Field`, `Parameter` |
| Enumerations | `TypeKind`, `AccessLevel`, `ModuleModifier`, `RequiresModifier`, `DirectiveModifier` |
| Reused, not redefined | NxCore `ModelElement`, `NamedElement` |

Three shape decisions worth knowing before reading the xcore:

* **Modules are contained by the root, not by a layer.** A named module belongs to a layer and an
  unnamed module belongs to a class loader, and one containment cannot express both, so layers and
  loaders reference modules instead.
* **Constructors are methods.** In the JVM a constructor is a method named `<init>` and a static
  initializer is `<clinit>`; the descriptor distinguishes overloads and the identity scheme works
  uniformly. Reflection separates them, bytecode does not, and this model follows bytecode because
  that is where its identity comes from.
* **Access flags are booleans, not a packed integer.** openCypher 9 has no bitwise operators, so a
  flags int would be unqueryable from the query surface this model exists to feed. Mutually
  exclusive choices, such as access level and type kind, are enumerations instead.

## Loading

**A live loader comes first**, before any build-time scanner. It walks `ModuleLayer.boot()` and its
parents, reads each `ModuleDescriptor`, takes resolved readability from the `Configuration`, and
reflects over loaded types. It is smaller than a static scan (no jar traversal, no ASM, no
multi-release decision) and it is what produces a real graph to query.

A build-time class-file scanner using [ASM](https://asm.ow2.io/) follows, and adds what a running VM
cannot show: types that were never loaded. Note that a scanner needs a metamodel of neither ASM nor
the class file format; it populates this model directly. A bytecode model is a separate thing,
needed only to reason about instructions.

Two things the scanner must handle deliberately, both noted in the assessment:

* **Multi-release jars.** A jar with `META-INF/versions/N/` holds different class files, and possibly
  different module descriptors, per Java release. A scan must record which release it modelled or it
  silently describes a configuration nobody runs. This is also a real instance of the occupancy design
  - one thing being at multiple coordinates in a multi-dimensional space with delta transitions between them.
* **Automatic modules**, whose names come from `Automatic-Module-Name` or the filename rather than
  from a descriptor.

Loaders are expected to be slow and produce large models. A moderate application yields thousands of
types and tens of thousands of members, which makes this a useful stress case for anything querying
it.

## Applications

**Ask a running process what it is.** The structural question has no observability signal: logs,
metrics, traces and profiles all describe behaviour over time, and none describes composition. This
model plus a query language is that missing view.

**Deployed versus running.** The difference between a dependency tree and a resolved module graph,
computed rather than argued.

**Estate reports that are currently expensive.** Which class file versions are present across an
estate, which modules are automatic, which packages are opened for deep reflection and to whom.

**Version questions with an answer.** With layers, which version of a module a given piece of code
actually reads. On a classpath this is genuinely unanswerable.

**A join point for telemetry.** Because identity is the JVM's own, a stack trace, a JFR event, a
profiler's hot list and an OpenTelemetry span resolve to model elements without a mapping. Combined
with the [telemetry model](https://telemetry.models.nasdanika.org/), a slow span resolves to a method, in a module,
from an artifact, owned by a team. Static analysis cannot see reflective calls and runtime cannot
see what was never exercised, so the union is a call graph with evidence rather than inference.

**Coverage that knows what runs.** The [coverage model](https://coverage.models.nasdanika.org/)
sits on this spine, with JaCoCo results collected from pipeline builds and attached to types and
members. Because a live loader also records what was actually loaded and executed, two lists become
available that a coverage tool alone cannot produce: **covered but never loaded**, which is tests
for code that does not run, and **loaded but not covered**, which is the real risk list ranked by
production usage. Aggregate counters attach to JVM elements; line-level detail stays in the coverage
model, which is where it belongs since this model carries no source information.

This consumes the same reports a coverage dashboard does and answers different questions. It does
not attempt any of what such tools actually sell: no IDE integration, no issue tracker, no rules
engine, no new-code quality gate.

**Test material.** A real JVM graph is a better corpus for a query engine than anything hand
authored: realistic size, deep containment, heavy cross-referencing, and many instances of few
classes. Coverage adds the dimension that varies between builds, which is what makes semantic diff
demonstrable.

## Documentation, and a licensing constraint

Element documentation is intended to be generated, and there is a constraint that applies to every
element here. Java SE specifications sit under Oracle's terms, and OpenJDK Javadoc lives in source
under GPLv2 with Classpath Exception; neither is compatible with publishing derived documentation
text under EPL-2.0.

This does not block generated documentation, because concepts are not copyrightable and expression
is. It does mean an assistant asked to describe `requires transitive` may reproduce Javadoc it
memorised. **Generate original prose, never paste, and check output for verbatim overlap with the
official text before publishing.**

## Relation to other Nasdanika work

Base classes come from [NxCore](https://nxcore.models.nasdanika.org/). 
Above it sit a Java source model and a bytecode model, both adding to these elements rather
than restating them, and a [Maven model](https://maven.models.nasdanika.org/) maps artifacts to the modules they provide.
The [coverage model](https://coverage.models.nasdanika.org/) moves onto this spine as the first instance
of a general pattern: measurements produced by an external tool, keyed by element URI, merged onto
structure. The [telemetry model](https://telemetry.models.nasdanika.org/) is the second instance of the same pattern,
which means the attachment mechanism is built once and each further source is close to free. It
projects to [Meta](https://meta.models.nasdanika.org/) and is the intended second data source for the
[Cypher](https://cypher.models.nasdanika.org/) engine.
