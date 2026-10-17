# Telemetry model exporters

> Directory `models/telemetry/exporters` · Maven `org.nasdanika.sdk.runtime.models.telemetry:exporters` ·
> Java module `org.nasdanika.sdk.runtime.models.telemetry.exporters` ·
> Part of the [Nasdanika SDK Runtime](https://github.com/Nasdanika-SDK/runtime)

OpenTelemetry SDK exporters that write spans, log records and metrics into the
[telemetry model](../../model/doc/readme.md), so that the telemetry of a unit of work is saved as
models, next to the models it describes.

## Why a separate module

Instrumented code, the runtime's included, depends on the OpenTelemetry API only. The SDK is needed
by one place: the assembly that runs a unit of work and decides where its telemetry goes. The
exporters depend on the SDK, so they live in their own module, and the telemetry model and
everything instrumented stay free of it.

## The exporters

| Class | Exports |
|---|---|
| `ModelSpanExporter` | Spans to `TracesData`. Also the sink of recorded model changes |
| `ModelLogRecordExporter` | Log records to `LogsData`, or into the spans they were emitted in |
| `ModelMetricExporter` | Metrics to `MetricsData` |
| `TelemetryConverter` | SDK data to the model, field by field as the OTLP exporters convert it: ids as lowercase hex, times as UNIX epoch nanoseconds |

Each exporter works in one of two modes:

* **To a consumer.** Each export is a new data root, handed to the consumer.
* **To an EMF resource.** All exports go to one data root in the resource, grouped as in OTLP by
  resource and instrumentation scope; exporting to a loaded resource appends to it. The resource is
  saved on `flush()` and `shutdown()`. The save runs outside the current OpenTelemetry instance, so
  saving telemetry is not itself traced.

The span exporter nests spans in their parents and resolves span references before it saves. The
log record exporter, given the span exporter, adds log records emitted in a sampled span to that
span, waiting for the span to be exported if necessary; log records without a span go to the logs.
The span exporter is also a sink of changes recorded with `Changes.record`: each change description
is set on the span it was recorded in. A metric exporter with a periodic reader accumulates a
metric per collection, a time series of cumulative points by default.

## Using it

The SDK owns the exporters, and the exporters own the telemetry resources: closing the SDK exports
what is pending and saves them.

```java
NasdanikaResourceSet telemetry = NasdanikaResourceSet.createAndConfigure();
ModelSpanExporter spans = new ModelSpanExporter(telemetry.createResource(uri("traces.yml")));
ModelLogRecordExporter logs = new ModelLogRecordExporter(telemetry.createResource(uri("logs.yml")), spans);
ModelMetricExporter metrics = new ModelMetricExporter(telemetry.createResource(uri("metrics.yml")));

try (OpenTelemetrySdk openTelemetry = OpenTelemetrySdk.builder()
        .setPropagators(Telemetry.w3cPropagators())
        .setTracerProvider(SdkTracerProvider.builder()
                .addSpanProcessor(BatchSpanProcessor.builder(spans).build())
                .build())
        .setLoggerProvider(SdkLoggerProvider.builder()
                .addLogRecordProcessor(BatchLogRecordProcessor.builder(logs).build())
                .build())
        .setMeterProvider(SdkMeterProvider.builder()
                .registerMetricReader(PeriodicMetricReader.builder(metrics).build())
                .build())
        .build();
        Scope telemetryScope = Telemetry.makeCurrent(openTelemetry);
        Scope changesScope = Changes.makeCurrent(spans)) {

    // The unit of work: everything it does reports to openTelemetry
}
```

The telemetry resources are created before the instance is made current, so that saving them is
not traced. The format follows the extension: `yml` or `json` to read, `xmi` to interchange, `ebin`
and `egz` for size.

The command line launcher of the runtime does exactly this for every launch, in a directory per
launch under `<home>/telemetry`, in the format of the `nsdk.telemetry.format` system property or the
`NSDK_TELEMETRY_FORMAT` environment variable.

## Dependencies

```xml
<dependency>
    <groupId>org.nasdanika.sdk.runtime.models.telemetry</groupId>
    <artifactId>exporters</artifactId>
</dependency>
<dependency>
    <groupId>io.opentelemetry</groupId>
    <artifactId>opentelemetry-sdk</artifactId>
</dependency>
```

Versions come from the runtime's BOM.

## Further reading

The Nasdanika SDK Runtime book, chapter "Telemetry as a model".
