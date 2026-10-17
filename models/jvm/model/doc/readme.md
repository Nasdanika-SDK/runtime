# JVM model

> Directory `models/jvm/model` · Maven `org.nasdanika.sdk.runtime.models.jvm:model` ·
> Java module `org.nasdanika.sdk.runtime.models.jvm` · Package `https://runtime.sdk.nasdanika.org/models/jvm` ·
> Part of the [Nasdanika SDK Runtime](https://github.com/Nasdanika-SDK/runtime)

A model of what a Java virtual machine can name: layers, class loaders, modules, packages, types,
methods, fields and parameters.

It is a spine rather than a complete picture, and that is the design. Source information, bytecode
and runtime observations attach to these elements rather than restating them: a Java source model
adds positions, comments and source-level type text, a bytecode model adds instructions and
constant pools, the [telemetry model](../../../telemetry/model/doc/readme.md) and coverage reports
attach measurements, and all of them point at the same elements.

## Why

**Everything below is already available, and almost nobody asks for it.** `ModuleLayer.boot()`
gives the running module graph, `Configuration` reports what resolution actually produced, and
reflection has exposed types and members since Java 1.1. The information was never the problem.
Getting an answer meant writing a program, so only questions worth a program were ever asked, and
that is a small set. A typed model, saved and queried, lowers the cost of a question to the cost of
asking it.

**There is a gap between what you declared and what is running, and nothing reports it.** A
dependency tree describes what could be on the path, including test scope, optional dependencies
and libraries nothing ever loads. The resolved module graph is shorter and truer. The clearest
instance is modules that read something they never required:

```
MATCH (m:Module)-[:reads]->(other)
WHERE NOT (m)-[:requires]->(other)
RETURN m.name, other.name
```

Usually that is correct and by design: `requires transitive` propagates readability, service
binding pulls providers into the resolved graph that no dependency declaration mentions, and a
module that reads one automatic module reads all of them. It is a property of resolution rather
than of the build, so it is absent from every POM and every bill of materials by construction, and
no dependency tool can report it. A snapshot is **what your assembly became**.

**Non-modular code is as visible as modular code.** Code on the class path lives in a class
loader's unnamed module, which is a value with packages and types in it, not an absence. The model
is useful for an application that has never heard of the module system.

## Identity: the decision everything else rests on

Elements are named the way the JVM names them: **binary names and method descriptors**, such as
`com.example.Bar`, `[I` and `baz(Ljava/lang/String;)I`.

That is not a local convention. It is the form in the constant pool, in stack traces, in `jdeps`
output, in JFR events, and in profilers and coverage tools, and OpenTelemetry's `code.namespace` and
`code.function` attributes carry its two halves. A build scan, a coverage report, a profile and a
span name the same method the same way, and independently produced models merge on URIs with no
translation step:

| Element | URI |
|---|---|
| Module | `jvm:module/<module name>` |
| Package | `jvm:package/<binary package name>` |
| Type | `jvm:type/<binary name>` |
| Method | `jvm:method/<owner binary name>#<name><descriptor>` |
| Field | `jvm:field/<owner binary name>#<name>:<descriptor>` |
| Parameter | `jvm:parameter/<owner method tail>#<index>` |

Joining static structure to runtime observation is then mechanical rather than a project. JaCoCo
is the worked example: its XML report already keys classes by binary name and methods by name and
descriptor, so coverage attaches to these elements with no mapping layer and no per-project
configuration.

## Scope

| | |
|---|---|
| **In** | Layers, class loaders, modules and their directives, packages, types, methods, fields, parameters, resolved readability, access flags, class file version |
| **Generics as data** | Identity is by descriptor, and descriptors are erased. Generic types are carried as the class file's `Signature` attribute, verbatim, on types and members: data rather than identity, since overloads are told apart by erasure. Parsing them into type structure is left to consumers such as the projection to Meta |
| **Out** | Source positions, instructions, constant pools, annotations |
| **Projected, not extended** | [Meta](../../../meta/model/doc/readme.md), see below |

**Annotations are the most likely first addition.** They are among the most query-valuable things
in a JVM estate ("every deprecated method", "every type carrying a given framework annotation"),
and a self-contained increment that disturbs nothing here.

## Relation to Meta, and why this model does not extend it

Meta covers packages, classes, features and operations, loads from Java among other formats, and
is deliberately not a superset of any of its sources: whatever does not fit is dropped by design or
carried in an annotation. That is a published language, and a published language is a projection
target rather than a base class.

The concrete test: bridge methods, synthetic accessors, access flags and overloads that differ only
in erased parameter types are realities of the JVM that Meta will not grow to hold. Extending Meta
would shape a model whose whole value is fidelity to the JVM's own naming by one that is
deliberately lossy about it. So this model sits on the [core model](../../../core/doc/readme.md)
and projects to Meta, which gives anyone comparing a Java type with an Ecore class or a JSON Schema
the route they expect.

## What it models

| Area | Types |
|------|-------|
| Root | `JavaVirtualMachine`: `live`, VM name, version, vendor, specification version; contains modules, layers and class loaders |
| Runtime structure | `Layer` (`boot`, parents, modules), `ClassLoader` (parent, unnamed module) |
| Modules | `Module` (`named`, version, modifiers, main class, `uses`, and `reads` as resolved readability), `Requires` with `RequiresModifier`, `Exports` and `Opens` with targets, `Provides` with the service and its providers |
| Types | `Package`, `Type` (`TypeKind`, `AccessLevel`, binary name, descriptor, signature, supertype, interfaces, component type, class file version) |
| Members | `Member` (access, descriptor, signature), `Method` (constructors as `<init>`, static initializers as `<clinit>`), `Field` (constant value), `Parameter` |
| Enumerations | `TypeKind`, `AccessLevel`, `ModuleModifier`, `RequiresModifier`, `DirectiveModifier` |
| Reused, not redefined | The core model's `ModelElement` and `NamedElement` |

Three decisions worth knowing before reading the Xcore:

* **Modules are contained by the root, not by a layer.** A named module belongs to a layer and an
  unnamed module to a class loader, and one containment cannot express both, so layers and loaders
  reference modules.
* **Constructors are methods.** In the JVM a constructor is a method named `<init>` and a static
  initializer is `<clinit>`; the descriptor distinguishes overloads, and the identity scheme works
  uniformly. Reflection separates them, bytecode does not, and this model follows bytecode because
  that is where its identity comes from.
* **Access flags are booleans, not a packed integer.** A query language without bitwise operators
  could not ask about a flags integer. Mutually exclusive choices, such as access level and type
  kind, are enumerations.

## Loading

**A live loader comes first** (Planned), before any build-time scanner. It walks the boot layer and
its parents, reads each module descriptor, takes resolved readability from the configuration, and
reflects over loaded types. It is smaller than a static scan, with no jar traversal and no
multi-release decision, and it produces a real graph to query. Where reflection does not reach, as
for a field's constant value, it reads the loaded type's own class file through the JDK's class
file API, final since Java 24, without a dependency. The Nasdanika SDK Runtime book shows a minimal
live loader of modules in a page of code.

**A build-time class file scanner follows** (Planned), and adds what a running VM cannot show:
types that were never loaded. It populates this model directly, and must handle two things
deliberately: **multi-release jars**, recording which release it modeled, and **automatic
modules**, whose names come from `Automatic-Module-Name` or the file name rather than from a
descriptor.

Loaders are expected to produce large models: a moderate application yields thousands of types and
tens of thousands of members, which makes the model a useful stress case for anything that queries
it.

## Applications

**Ask a running process what it is.** Logs, metrics, traces and profiles describe behavior over
time; none describes composition. This model is the missing view.

**Deployed versus running.** The difference between a dependency tree and a resolved module graph,
computed rather than argued.

**Reports that are expensive today.** Which class file versions are present, which modules are
automatic, which packages are opened for deep reflection and to whom.

**Version questions with an answer.** With layers, which version of a module a given piece of code
actually reads. On a class path this is genuinely unanswerable.

**A join point for telemetry.** Because identity is the JVM's own, a stack trace, a JFR event, a
profiler's hot list and an OpenTelemetry span resolve to model elements without a mapping. A slow
span resolves to a method, in a module, from an artifact, owned by a team. Static analysis cannot
see reflective calls and the runtime cannot see what was never exercised, so the union is a call
graph with evidence rather than inference.

**Coverage that knows what runs.** With a live loader recording what was loaded and coverage
attached from builds, two lists appear that a coverage tool alone cannot produce: **covered but
never loaded**, tests for code that does not run, and **loaded but not covered**, the real risk
list.

**The JVM as files.** A snapshot presented as a volume and served over HTTP or WebDAV is a running
system that an agent reads with the file tools it already has.

**Test material.** A real JVM graph is a better corpus for a query engine than anything written by
hand: realistic size, deep containment, heavy cross-referencing, and many instances of few classes.

## Documentation, and a licensing constraint

Element documentation is meant to be generated, and a constraint applies to every element here. The
Java SE specifications are under Oracle's terms, and OpenJDK's Javadoc is under GPLv2 with the
Classpath Exception; neither permits publishing derived text under the runtime's license.

That does not block generated documentation, because concepts are not copyrightable and expression
is. It does mean that an assistant asked to describe `requires transitive` may reproduce Javadoc it
memorized. **Generate original prose, never paste, and check output for verbatim overlap with the
official text before publishing.**

## Status

**Available:** the model, with generated code, contributed as a Java service.

**Planned:** the live loader, the class file scanner, annotations, the projection to Meta, and
queries over snapshots.

## Using it

Import the runtime's BOM and depend on the module:

```xml
<dependency>
    <groupId>org.nasdanika.sdk.runtime.models.jvm</groupId>
    <artifactId>model</artifactId>
</dependency>
```

## Further reading

The Nasdanika SDK Runtime book, chapter "The JVM model", which builds a snapshot of a module layer
and asks it which modules read what they never required.
