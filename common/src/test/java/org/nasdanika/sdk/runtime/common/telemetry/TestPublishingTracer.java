package org.nasdanika.sdk.runtime.common.telemetry;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Flow;

import org.junit.jupiter.api.Test;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.Scope;

class TestPublishingTracer {

	static final AttributeKey<Long> WORKED = AttributeKey.longKey("progress.worked");
	static final AttributeKey<Long> TOTAL = AttributeKey.longKey("progress.total");

	static final class Collector implements Flow.Subscriber<SpanEvent> {

		final List<SpanEvent> events = Collections.synchronizedList(new ArrayList<>());
		boolean completed;

		@Override
		public void onSubscribe(Flow.Subscription subscription) {
			subscription.request(Long.MAX_VALUE);
		}

		@Override
		public void onNext(SpanEvent item) {
			events.add(item);
		}

		@Override
		public void onError(Throwable throwable) {
			throw new AssertionError(throwable);
		}

		@Override
		public void onComplete() {
			completed = true;
		}

		List<String> describe() {
			return events.stream().map(e -> switch (e) {
				case SpanEvent.Started s -> "start " + s.name();
				case SpanEvent.EventAdded a -> a.span().getName() + " " + a.name() + " " + a.attributes().get(WORKED) + "/" + a.attributes().get(TOTAL);
				case SpanEvent.AttributeSet a -> a.span().getName() + " " + a.key() + "=" + a.value();
				case SpanEvent.StatusSet s -> s.span().getName() + " " + s.code();
				case SpanEvent.ExceptionRecorded x -> x.span().getName() + " exception " + x.exception().getMessage();
				case SpanEvent.Renamed r -> "renamed " + r.name();
				case SpanEvent.Ended d -> "end " + d.span().getName();
			}).toList();
		}

	}

	/**
	 * No SDK: the delegate is the no-op tracer, and progress is still reported.
	 */
	@Test
	void progressWithoutAnSdk() {
		try (PublishingTracer tracer = new PublishingTracer(TracerProvider.noop().get("test"), "test", Runnable::run, 16)) {
			Collector collector = new Collector();
			tracer.subscribe(collector);
			assertThat(tracer.isEnabled()).isTrue();

			Span span = tracer.spanBuilder("import").setAttribute("files", 2L).startSpan();
			try (Scope scope = span.makeCurrent()) {
				for (long i = 1; i <= 2; ++i) {
					span.addEvent("progress", Attributes.of(WORKED, i, TOTAL, 2L));
				}
				Span.current().setStatus(StatusCode.OK);
			} finally {
				span.end();
			}
			span.addEvent("after end");
			tracer.close();

			assertThat(collector.describe()).containsExactly(
					"start import",
					"import progress 1/2",
					"import progress 2/2",
					"import OK",
					"end import");
			assertThat(((SpanEvent.Started) collector.events.get(0)).attributes().get(AttributeKey.longKey("files"))).isEqualTo(2L);
			assertThat(collector.completed).isTrue();
		}
	}

	@Test
	void followingOneOperation() {
		try (PublishingTracerProvider provider = new PublishingTracerProvider(TracerProvider.noop(), Runnable::run, 16)) {
			PublishingTracer tracer = provider.get("scope");
			Tracer other = provider.get("other scope");
			Collector all = new Collector();
			provider.subscribe(all);

			Span unrelated = tracer.spanBuilder("unrelated").startSpan();
			Span operation = tracer.spanBuilder("operation").startSpan();
			Collector within = new Collector();
			tracer.within((PublishingSpan) operation).subscribe(within);
			try (Scope scope = operation.makeCurrent()) {
				Span step = other.spanBuilder("step").startSpan(); // A child through the context, from another tracer of the provider
				assertThat(((PublishingSpan) step).getParent()).isSameAs(operation);
				step.recordException(new IllegalStateException("oops"));
				step.end();
			}
			unrelated.end();
			operation.end();

			assertThat(within.describe()).containsExactly("start step", "step exception oops", "end step", "end operation");
			assertThat(all.describe()).contains("start unrelated", "end unrelated");
		}
	}

	@Test
	void openTelemetryWrapper() {
		try (PublishingOpenTelemetry openTelemetry = new PublishingOpenTelemetry(io.opentelemetry.api.OpenTelemetry.noop())) {
			assertThat(openTelemetry.getTracer("x")).isInstanceOf(PublishingTracer.class);
			assertThat(openTelemetry.getTracer("x")).isSameAs(openTelemetry.getTracer("x"));
		}
	}

}
