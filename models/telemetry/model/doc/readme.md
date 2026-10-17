# Telemetry model

> Directory `models/telemetry/model` · Maven `org.nasdanika.sdk.runtime.models.telemetry:model` ·
> Java module `org.nasdanika.sdk.runtime.models.telemetry` ·
> Packages `https://runtime.sdk.nasdanika.org/models/telemetry`, `.../traces`, `.../logs` and `.../metrics` ·
> Part of the [Nasdanika SDK Runtime](https://github.com/Nasdanika-SDK/runtime)

[OpenTelemetry](https://opentelemetry.io/) signals as EMF models: traces, log records and metrics,
kept beside the models they describe, in the same formats and the same repositories, rather than
shipped to a backend and forgotten on its schedule. The
[exporters](../../exporters/doc/readme.md) fill it from the OpenTelemetry SDK.

## Every signal is precious

This model uses telemetry the opposite way from the mainstream. Mainstream observability collects
enormous volumes cheaply, samples them, keeps them for days or weeks, and routinely drowns in its
own signals. Here collection is deliberate and retention is indefinite: every signal is precious,
and its price is paid knowingly, in exchange for being able to explain, years later, what happened.

Storage and compute are cheap at this scale. What is expensive is not being able to answer, two
years later: *in the course of the work named "Correct the year", the attribute `year` of the book
"Domain-Driven Design" changed to 2004*, with the work, the object and the attribute all model
elements you can navigate to, and the record stored next to the model in Git.

Operational telemetry answers "is it healthy right now". This model answers "who did what to
what, and why does it look the way it does". The two are complementary, and the same instrumented
code feeds both: one exporter streams to an operational backend, sampled and forgotten; the other
writes to the model, and it is kept.

The discipline that keeps this affordable is choosing what is a unit of work worth keeping: a
command that changes models, a release, an agent run, a migration. Every request a server
handles is operational telemetry and belongs in an operational backend.

## Faithful to OpenTelemetry, navigable as a graph

The model follows OpenTelemetry's own data model, OTLP, so that nothing is lost on the way in:

| Package | Contents |
|---|---|
| `telemetry` | `Resource` (the entity that produced the signals), `InstrumentationScope`, and typed attribute values: `KeyValue` and `AnyValue` |
| `traces` | `TracesData`, `ResourceSpans`, `ScopeSpans`, `Span`, `SpanEvent`, `SpanLink`, `SpanStatus`, `SpanReference`, and the change recording classes `ChangeDescription`, `FeatureChange` and `ResourceChange` |
| `logs` | `LogsData`, `ResourceLogs`, `ScopeLogs`, `LogRecord`, `SeverityNumber` |
| `metrics` | `MetricsData`, `ResourceMetrics`, `ScopeMetrics`, `Gauge`, `Sum`, `Histogram`, `ExponentialHistogram`, `Summary`, their data points, and `Exemplar` |

On top of OTLP, it adds what makes telemetry a graph rather than a stream of records:

* **Spans nest.** A span contains its children within an instrumentation scope, so a trace reads as
  a tree. Across scopes, spans reference their parent by id.
* **Log records live in their spans.** A log record emitted in a span is contained by the span, not
  stored in a separate stream to be joined later.
* **Changes live in their spans.** A span contains the description of the model changes recorded
  while it was current.
* **References resolve.** Span links and the change classes reference spans as objects, not only by
  id, and every span knows what references it. An exemplar references the span that produced a
  measurement.

Spans are keyed by trace and span id, so their URIs are stable and readable.

## Recording changes

Change recording is EMF's, extended so that recorded changes know their spans.
`Changes.record(target, body)` records the changes the body makes to a resource set, a resource or
an object, and hands the description to the sink current in the OpenTelemetry context; the span
exporter is such a sink, and puts each description into the span it was recorded in.

```java
try (OpenTelemetrySdk openTelemetry = ...;                  // SDK with the model exporters
        Scope telemetryScope = Telemetry.makeCurrent(openTelemetry);
        Scope changesScope = Changes.makeCurrent(spanExporter)) {

    Telemetry.inSpan(tracer, "Correct the year", null, span -> Changes.record(models, () -> {
        book.setYear(2004);
        resource.save(null);
        return null;
    }));
}
```

The stored description is turned forward and detached from the model:

* Objects added in the body are copied into the description, as objects to attach.
* Objects removed in the body are moved into the description, so their state when they were removed
  is kept for audit.
* Other objects are referenced by proxies with their URIs, so the description can be saved in its
  own resource and still resolves to the model wherever the model is saved.

Nothing is recorded without a current sink or outside a sampled span, so the same code runs
unchanged in a unit of work that does not record.

## What it is for

* **Audit and compliance.** Every change to an element during an audit period, who made it, and in
  the course of what work, is a query instead of an archaeology project.
* **Agents.** An agent's run is a trace whose spans are its tool calls, and the changes it made to
  models are in the spans that made them. Reviewing an agent's work means reading that trace, and
  reverting it means applying the changes in reverse.
* **Evidence.** Telemetry kept with the build or the release it describes is evidence of what ran:
  a command line launch saves its telemetry as models in a directory per launch.
* **Teaching.** Trace versus span versus metric is easier to show than to define. A small trace,
  saved as a model, can be browsed, diagrammed and walked through element by element.

## Landscape

* **Observability platforms** are built for the firehose: high-cardinality ingestion, sampling,
  short retention, health-now questions. This model is not a competitor and would be a poor one. It
  is for the small fraction of signals worth keeping, with the same instrumentation and a different
  exporter.
* **LLM and agent observability tools** keep session-scoped traces of prompts and tool calls, which
  refer to names in someone else's service. Here a span lands next to the models the agent worked
  on, and its changes are in it.
* **OpenTelemetry itself** says how signals travel; collectors and backends say where they go.
  Neither says what signals mean against a model of the system. This model is a destination that
  stays faithful to OpenTelemetry at its boundary.
* **Audit logs and W3C PROV.** Audit logs have the retention instinct but no types and no joins.
  PROV has the right concepts, activity, agent and entity, as a separate vocabulary to adopt. Here
  provenance is part of the same models.
* **The status quo** is grep over log archives, a wiki page titled "why did this change", and the
  person who remembers. The claim of this model is that the person who remembers can be a query.

## Status

**Available:** the four packages, change recording with `Changes`, the
[exporters](../../exporters/doc/readme.md), and the command line launcher saving the telemetry of
every launch as models.

**Planned:**

* **Queries.** Questions about traces asked in a query language rather than in Java loops.
* **Replay.** Spans carry timing and nesting, so an execution can be played back over a diagram of
  the system that ran it, with model changes appearing where they happened.
* **Resolution of attributes.** Semantic-convention attributes, such as a code function or a URL,
  resolved to the model elements they name and recorded as markers.
* **Higher floors.** Spans as work, resources as actors, metrics as accounting entries: models for
  work, roles and accounting will connect to telemetry on their own floors, so that this model stays
  faithful to OpenTelemetry.

## Using it

Import the runtime's BOM and depend on the module:

```xml
<dependency>
    <groupId>org.nasdanika.sdk.runtime.models.telemetry</groupId>
    <artifactId>model</artifactId>
</dependency>
```

The four packages are contributed as Java services, so a resource set created with
`NasdanikaResourceSet.createAndConfigure()` loads telemetry in any format the runtime reads:
`yml` and `json` to read, `xmi` to interchange, `ebin` and `egz` for size.

## Further reading

The Nasdanika SDK Runtime book, chapters "Telemetry in the runtime", "Watching work live" and
"Telemetry as a model".
