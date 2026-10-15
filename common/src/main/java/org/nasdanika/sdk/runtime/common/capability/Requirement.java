package org.nasdanika.sdk.runtime.common.capability;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.nasdanika.sdk.runtime.common.TypeToken;
import org.nasdanika.sdk.runtime.common.Types;

/**
 * A requirement for capabilities of a type, with payloads for the factory to interpret.
 *
 * <p>
 * The type may be generic: {@code Supplier<Volume>} and {@code Supplier<Writable>} are different
 * requirements, and {@code Supplier<? extends Writable>} is satisfied by both. With no payloads
 * this is a plain lookup by type - what {@link java.util.ServiceLoader} does, but generic, lazy and
 * asynchronous. Payloads select and parameterize: a {@link ReflectiveCapabilityFactory.Capability}
 * method serves a requirement when its parameters accept the payloads, in order.
 *
 * <p>
 * A requirement is a cache key within a resolution, so payloads should have value equality, as
 * records do. Types built by the JDK and by other implementations are equal when they describe the
 * same type, so it does not matter how the type was obtained.
 *
 * @param type Required type, {@link Types#isGround(Type) ground}: a class, or a parameterized type
 * such as {@code Supplier<? extends Writable>}
 * @param payload Unmodifiable. May contain nulls
 */
public record Requirement(Type type, List<Object> payload) {

	public Requirement {
		Objects.requireNonNull(type, "type");
		if (!Types.isGround(type)) {
			throw new IllegalArgumentException("A required type must not be or contain a type variable, or be a wildcard: " + type.getTypeName());
		}
		// Not List.copyOf, which rejects nulls, and a null payload is a legitimate argument
		payload = payload == null ? List.of() : Collections.unmodifiableList(new ArrayList<>(payload));
	}

	/**
	 * @param payload Note that {@code of(type, null)} passes a null array, meaning no payloads. For
	 * one null payload write {@code of(type, (Object) null)}
	 */
	public static Requirement of(Type type, Object... payload) {
		return new Requirement(type, payload == null ? null : Arrays.asList(payload));
	}

	/**
	 * For generic types: {@code Requirement.of(new TypeToken<Supplier<Volume>>() {})}.
	 */
	public static Requirement of(TypeToken<?> type, Object... payload) {
		return of(type.getType(), payload);
	}

	@Override
	public String toString() {
		return payload.isEmpty() ? type.getTypeName() : type.getTypeName() + " " + payload;
	}

}
