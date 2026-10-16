package org.example.cli;

import java.util.List;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.cli.MixInCapabilityFactory;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;

// tag::mixin-factory[]
public class LimitMixInFactory extends MixInCapabilityFactory<LimitMixIn> {

	@Override
	protected String getName() {
		return "limit";
	}

	@Override
	protected Class<LimitMixIn> getMixInType() {
		return LimitMixIn.class;
	}

	@Override
	protected Flow.Publisher<LimitMixIn> doCreateMixIn(
			List<CommandLine> commandPath,
			Loader loader,
			Span span,
			Logger logger) {
		return Flows.of(new LimitMixIn());
	}

}
// end::mixin-factory[]
