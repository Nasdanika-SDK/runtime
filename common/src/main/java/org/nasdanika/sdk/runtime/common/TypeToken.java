package org.nasdanika.sdk.runtime.common;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Captures a generic type, which a class literal cannot: {@code new TypeToken<Supplier<Volume>>() {}}.
 * The anonymous subclass records its type argument, and reflection reads it back.
 *
 * <p>
 * Created inside a generic method as {@code new TypeToken<T>() {}}, it captures the type variable
 * {@code T} rather than what {@code T} stands for at the call site, because erasure leaves nothing
 * else to capture. Such a type is not {@link Types#isGround(Type) ground}, and requirements refuse it.
 *
 * @param <T> The captured type
 */
public abstract class TypeToken<T> {

	private final Type type;

	protected TypeToken() {
		if (getClass().getGenericSuperclass() instanceof ParameterizedType superclass && superclass.getRawType() == TypeToken.class) {
			type = superclass.getActualTypeArguments()[0];
		} else {
			throw new IllegalStateException("Create a TypeToken as a direct anonymous subclass with a type argument: new TypeToken<Supplier<Volume>>() {}");
		}
	}

	public Type getType() {
		return type;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof TypeToken<?> other && type.equals(other.type);
	}

	@Override
	public int hashCode() {
		return type.hashCode();
	}

	@Override
	public String toString() {
		return type.getTypeName();
	}

}
