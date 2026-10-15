package org.nasdanika.sdk.runtime.common;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

class TestTypes {

	interface Writable {}

	interface Volume extends Writable {}

	static class VolumeSupplier implements Supplier<Volume> {

		@Override
		public Volume get() {
			return null;
		}

	}

	static abstract class Middle<X> implements Supplier<X> {}

	static abstract class ThroughMiddle extends Middle<Volume> {}

	static <T> Type listOf() {
		return new TypeToken<List<T>>() {}.getType();
	}

	@Test
	void assignabilityFollowsJavaRules() {
		Type volumes = new TypeToken<Supplier<Volume>>() {}.getType();
		assertThat(Types.isAssignable(new TypeToken<Supplier<? extends Writable>>() {}.getType(), volumes)).isTrue();
		assertThat(Types.isAssignable(new TypeToken<Supplier<Writable>>() {}.getType(), volumes)).isFalse();
		assertThat(Types.isAssignable(Supplier.class, volumes)).isTrue();
		assertThat(Types.isAssignable(Object.class, volumes)).isTrue();
		assertThat(Types.isAssignable(new TypeToken<Collection<? extends CharSequence>>() {}.getType(), new TypeToken<ArrayList<String>>() {}.getType())).isTrue();
	}

	@Test
	void classesAreMatchedByTheirGenericSupertypes() {
		Type volumes = new TypeToken<Supplier<Volume>>() {}.getType();
		assertThat(Types.isAssignable(volumes, VolumeSupplier.class)).isTrue();
		assertThat(Types.isAssignable(volumes, ThroughMiddle.class)).isTrue();
		assertThat(Types.isAssignable(new TypeToken<Supplier<Writable>>() {}.getType(), ThroughMiddle.class)).isFalse();
	}

	@Test
	void rawDoesNotSatisfyParameterized() {
		// Java allows these as unchecked conversions
		assertThat(Types.isAssignable(new TypeToken<Supplier<Volume>>() {}.getType(), Supplier.class)).isFalse();
		assertThat(Types.isAssignable(new TypeToken<List<String>>() {}.getType(), ArrayList.class)).isFalse();
		// ... except where every type argument is ?, which Java allows without a warning
		assertThat(Types.isAssignable(new TypeToken<Supplier<?>>() {}.getType(), Supplier.class)).isTrue();
		assertThat(Types.isAssignable(new TypeToken<List<?>>() {}.getType(), ArrayList.class)).isTrue();
	}

	@Test
	void typeArgumentsResolveThroughIntermediateClasses() {
		assertThat(Types.getTypeArgument(ThroughMiddle.class, Supplier.class.getTypeParameters()[0])).isEqualTo(Volume.class);
		assertThat(Types.getTypeArgument(Middle.class, Supplier.class.getTypeParameters()[0])).isNull();
	}

	@Test
	void groundTypes() {
		assertThat(Types.isGround(Supplier.class)).isTrue();
		assertThat(Types.isGround(new TypeToken<Supplier<? super Volume>>() {}.getType())).isTrue();
		assertThat(Types.isGround(new TypeToken<Supplier<Volume>[]>() {}.getType())).isTrue();
		assertThat(Types.isGround(Supplier.class.getTypeParameters()[0])).isFalse();
		assertThat(Types.isGround(listOf())).isFalse();
		assertThat(Types.isGround(null)).isFalse();
	}

}
