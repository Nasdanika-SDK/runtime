package org.example.telemetry;

import java.util.List;

import org.nasdanika.sdk.runtime.common.telemetry.PublishingOpenTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.context.Scope;

/**
 * One OpenTelemetry instance per unit of work, made current for its duration, watched live.
 */
public final class UnitOfWork {

	private UnitOfWork() {
	}

	// tag::unit-of-work[]
	public static void main(String[] args) throws InterruptedException {
		SpanTree tree = new SpanTree(System.out);
		try (var openTelemetry = new PublishingOpenTelemetry(OpenTelemetry.noop())) { // <1>
			openTelemetry.subscribe(tree);                                        // <2>
			try (Scope scope = Telemetry.makeCurrent(openTelemetry)) {            // <3>
				Cataloging.catalog(List.of("Domain-Driven Design", " ", "Design Patterns"));
			}
		}                                                                       // <4>
		tree.await();                                                           // <5>
	}
	// end::unit-of-work[]

}
