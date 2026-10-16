package org.example.cli;

import java.util.List;

import picocli.CommandLine.Option;

// tag::mixin[]
/**
 * An option contributed to commands that ask for it with @MixIns, or that a mix-in declares it
 * wants with a @Parent member.
 */
public class LimitMixIn {

	@Option(names = "--limit", description = "At most this many items")
	private Integer limit;

	public <T> List<T> apply(List<T> items) {
		return limit == null || items.size() <= limit ? items : items.subList(0, limit);
	}

}
// end::mixin[]
