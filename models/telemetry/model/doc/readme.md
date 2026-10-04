
```drawio-resource
../telemetry.drawio
```

[TOC levels=6]

An [Ecore](https://ecore.models.nasdanika.org) micro-model of [OpenTelemetry](https://opentelemetry.io/) signals - traces, spans, logs, and resources - stored beside the models they describe rather than shipped to an observability backend.
It is a balcony off the [work](https://work.models.nasdanika.org) floor of the micro-model tower: a span *is* work (`Span extends AbstractWork`), a resource is an actor working on spans,
and metrics are recorded as [accounting](https://accounting.models.nasdanika.org/) entries on span and resource accounts - monotonic counters as transactions, gauges as assertions.
The model is populated through OpenTelemetry APIs; see [Model-based telemetry as code](https://medium.com/nasdanika/model-based-telemetry-as-code-cd1541478be6) for the original argument.

## Every signal is precious

This model uses telemetry in the opposite way from the mainstream.
Mainstream observability collects enormous volumes cheaply, samples, retains for days or weeks, and routinely drowns in its own signals - the industry's recurring complaint about itself.
Here the volumes are strategic-scale, collection is deliberate, and retention is indefinite: every signal is precious, and the collection and storage price is paid knowingly, in exchange for explainability and troubleshootability years after the fact.
Storage is cheap and compute is cheap at this scale; what is expensive is not being able to answer, two years later, *"Actor A called tool T, and it changed the value of attribute A in object O from X to Y"* - with the actor, the tool, the object, and the attribute all resolvable model elements, and the change record and the span that produced it stored next to the model in Git.

Operational telemetry answers "is it healthy right now"; this model answers "who did what to what, and why does it look the way it does."
The two are complementary, and the same instrumented code can feed both - one exporter streams to the operational backend and is sampled and forgotten, the other loads into the model and is kept.

## Core concepts

* **Span is work.** A span - a named, timed unit of execution with a parent and a status - extends the work model's `AbstractWork`. Span nesting is work nesting; span attribution is a role engagement; a span is transitively staged, governed, access-controlled, and accountable like all work. Spans are facts: like sojourns and ledger entries, they are never rewritten.
* **Resource is an actor.** The OpenTelemetry `Resource` - the entity producing signals, identified by semantic-convention attributes - extends the role model's `Actor`, so "who executed this span" is the same question, with the same typed answer, as "who is responsible for this work."
* **Metrics are accounting.** OpenTelemetry metrics are double-entry accounting that doesn't know it yet: a monotonic counter is a stream of transactions (movements - requests served, tokens consumed), a gauge is an assertion (a statement of fact at an instant - CPU utilization, queue depth), and histograms decompose into both. The loader maps metric streams to entries on span and resource accounts; exemplars become provenance markers from entries to the spans that produced them. There is no separate metric storage in the model - the accounting floor is the metric storage.
* **Logs and events** attach to spans and resources as records, completing the OTel signal set.
* **Resolution by URI.** Semantic-convention attributes resolve to model element URIs at load time and are recorded as nested markers - "from where," never "how." This is what keeps the balcony at the work floor while spans refer to elements anywhere in the tower, including far above it.

Because plans and executions now share one vocabulary, they join: a planned `Work` item's actuals *are* the spans that executed it, its estimate is an assertion, and estimate-vs-actual is a fold over one element's records rather than a reconciliation between a tracker and a metrics system.

## Applications

**Agentic systems.** Agent spans and tool-call spans (the OTel `gen_ai.*` semantic conventions) resolve to elements of the [agent](https://agent.models.nasdanika.org/) and [MCP](https://mcp.models.nasdanika.org) models; token-usage metrics land as transactions on agent accounts.
An agentic system that burns tokens and money becomes attributable at the feature level - which agent spent what, executing which work, changing which elements - with the span as the receipt. Agent frameworks offer callbacks and session dashboards; none offers execution records resolved against a typed model of the system that executed.

**Feature-level change records.** The original model-based telemetry case: EMF change recording captures which attribute of which element changed, before and after values, linked to the span in whose execution the change happened.
A commit stops being "files changed" and becomes "this work, executed by this actor, changed these features" - a longitudinal audit trail at the semantic level, retained as long as the repository.

**Compliance and audit.** Governance evidence wants operational records with provenance; span records with markers and signed sojourns are exactly that shape.
"Show me every change to this element in the audit period, who made it, and in the course of what work" is a query, not an archaeology project.

**Estate analysis during modernization.** Runtime invocation records make dead-process detection a query - zero spans in N months makes retirement the leading disposition, and retirement is the cheapest outcome.
The [BW5 model](https://bw5.models.nasdanika.org/) is the first consumer.

**AI observability literacy.** AI observability and AI literacy are hot topics, and much of the audience is meeting the terminology for the first time - trace versus span versus metric, evaluation versus monitoring, observability versus governance monitoring - usually through vendor glossaries with a product to sell.
A typed model is a teaching instrument the way a glossary is not: every term is a class with definitions, relationships, and generated documentation, and a small synthetic example - one agent run, its tool-call spans, its token metrics - can be browsed, diagrammed, and animated end to end.
This is the same posture as the accounting model's financial-education angle: a thirty-second walk through a synthetic trace teaches what a span *is* better than any definition, and synthetic examples are safe to build and share.

**The observability landscape as data - the organization flavor.** "AI observability" is a label currently covering profoundly different products: Datadog observes *operations* - is the model-backed service healthy right now, latency, errors, cost of LLM calls - while a platform like Lumenova observes *the AI itself as a governance concern* - bias, drift, model risk, regulatory compliance evidence.
Both say "AI observability" on the website; a buyer who cannot tell them apart is the norm, not the exception.
An organization can state its own landscape as instance data on this model and the capability floor: which tools it uses, which signals each collects, which concerns each answers, where they overlap and where nobody is looking.
The typed vocabulary is what makes the distinction statable at all - and "which AI observability do you mean" becomes a question the model answers rather than a meeting derails over.

**Replay - the moving ball.** Because spans carry timing and nesting, resolve to model elements, and sit beside feature-level change records, an execution can be *re-rendered*: play the trace back over a diagram of the system, a moving ball traveling the graph, with attribute changes appearing as they happened.
For agentic systems this is the killer view: watch the agent traverse its tools, see which element changed at each stop, pause on the tool call that made the surprising edit - an execution replayed against the governed model of the system that executed, not a scrolling log.
The same replay is a *verification* instrument: in engine-based modernization, replaying recorded executions of the old runtime and the new engine side by side over the same process diagram makes behavioral parity reviewable by eye and by query (the BW5 modernization case, where the diagram - with its original designer layout - already exists in the model).
Rendering rides the diagram substrate: [Sprotty](https://sprotty.models.nasdanika.org/) for live animated views, embedded Draw.io as an alternative surface, and the Draw.io <-> Sprotty exchange through the shared [diagram model](https://diagram.models.nasdanika.org/) means the authored diagram and the replay view are the same picture.
The volume posture applies here at its sharpest: replay is not for the operational firehose - it is for executions worth watching, which is exactly the every-signal-is-precious contract.

**Dashboards, shared with accounting.** Because metrics are entries, a telemetry dashboard and an account dashboard are the same componentry over the same data - one chart substrate, one AI-assisted construction path over a scoped model, one mental model to learn.
Trends, roll-ups along containment, and period comparisons come from the accounting floor rather than a charting stack of their own.

## Competitive landscape

**Observability platforms** (Datadog, Grafana, Honeycomb, New Relic, Jaeger/Tempo/Prometheus). Built for the firehose: high-cardinality ingestion, sampling, short retention, health-now questions.
This model is not a competitor and would be a terrible one - it is for the small fraction of signals worth keeping forever, resolved against a typed model.
The honest relationship is complementary: same instrumentation, different exporters, different questions.

**LLM/agent observability** (LangSmith, Langfuse, Arize Phoenix, OpenLLMetry/OpenInference). Session-scoped traces of prompts and tool calls, excellent for debugging an agent run, but the trace refers to string names in someone else's SaaS - not to a governed model of the agent, its tools, its risk tier, and the work it was doing
 Here the span lands *in* that model, and the cost lands in its ledger.

**OpenTelemetry itself.** The specification says how signals travel; the collector and backends say where they go.
Neither says what signals *mean* against a model of the system.
This model is a destination that adds meaning - OTel-faithful at the loader boundary (span kind, status, events, links, scope), tower-shaped inside.

**Audit logs and W3C PROV.** Audit logs have the retention instinct but no types and no joins.
PROV has the right concepts (activity, agent, entity - nearly span, actor, element) but is a standalone vocabulary to adopt; here provenance is not a separate system but the same model, with markers carrying the derivation trees.

**The status quo.** As usual, the real competitor: grep over log archives, a wiki page titled "why did this change," and the person who remembers.
The model's claim is that the person who remembers can be a query.

## Model overview

| Area | Types |
|------|-------|
| Tracing | `Trace`, `Span` (extends work `AbstractWork`; kind, status, never rewritten), `SpanLink`, `Event` |
| Identity | `Resource` (extends role `Actor`), `InstrumentationScope` |
| Logs | `LogRecord` (attached to span/resource) |
| Metrics | none - loader maps counters -> accounting transactions, gauges -> assertions; exemplars -> markers to spans |
| Reused, not redefined | work `AbstractWork`/`Workable`; role `Actor`/`Undergoer`; accounting `Account`/`Entry` via inherited `Accountable`; nxcore markers for resolution |

## Relation to other Nasdanika work

The [work model](https://work.models.nasdanika.org) supplies the base: spans are work, so plan and execution share a vocabulary.
The [role model](https://role.models.nasdanika.org) supplies actors;
the [accounting model](https://accounting.models.nasdanika.org/) supplies metric storage and the dashboard substrate; 
[nxcore](https://nxcore.models.nasdanika.org) markers carry resolution from semantic-convention attributes to model element URIs.
The [agent](https://agent.models.nasdanika.org) and [MCP](https://mcp.models.nasdanika.org) models are the flagship resolution targets;
the [governance model](https://governance.models.nasdanika.org) consumes span records as evidence.
Change recording (the [change model](https://change.models.nasdanika.org/)) is the sibling concern: changes say what moved, spans say in the course of what, and the pair is the audit trail.
This model is populated through OpenTelemetry APIs and stays faithful to OTel semantics at that boundary; upper-floor models needing typed joins to spans define them on their own floors (shadow classes), never here.

> Note: `Trace` may not deserve a class - a trace is an ID shared by spans, and reifying it adds a container with no behavior; consider trace-as-attribute with derived groupings. And check whether `LogRecord` volume discipline needs a stated convention like the metrics one - "logs load only when attached to a kept span" is probably the right default, or the every-signal-is-precious posture erodes one log line at a time.*
