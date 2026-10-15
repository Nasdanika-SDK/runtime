package org.nasdanika.sdk.runtime.common;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.junit.jupiter.api.Test;

/**
 * How to declare what an object adapts to, and how requests are matched. Each nested class is a
 * small, self-contained example.
 */
class TestAdaptable {

	interface Writable {}

	interface Volume extends Writable {}

	record Disk(String name) implements Volume {}

	record Partition(int index) {}

	static final Type VOLUMES = new TypeToken<Supplier<Volume>>() {}.getType();

	static final Type WRITABLES = new TypeToken<Supplier<Writable>>() {}.getType();

	static final Type ANY_WRITABLES = new TypeToken<Supplier<? extends Writable>>() {}.getType();

	// --- Fields: what an object holds ---

	/**
	 * Two suppliers, told apart by their type arguments.
	 */
	static class Drive implements Adaptable {

		@Adapter
		private final Supplier<Volume> volumes = () -> new Disk("C");

		@Adapter
		private final Supplier<Writable> writables = () -> new Disk("W");

	}

	@Test
	void fieldAdaptersAreMatchedWithTypeArguments() {
		Drive drive = new Drive();
		Supplier<Volume> volumes = drive.adaptTo(VOLUMES);
		assertThat(volumes.get()).isEqualTo(new Disk("C"));

		Supplier<Writable> writables = drive.adaptTo(WRITABLES);
		assertThat(writables.get()).isEqualTo(new Disk("W"));

		// A wildcard request is answered by both; the most specific declaration, Supplier<Volume>, comes first
		Supplier<? extends Writable> any = drive.adaptTo(ANY_WRITABLES);
		assertThat(any.get()).isEqualTo(new Disk("C"));

		assertThat(drive.<Object>adaptTo(new TypeToken<Supplier<String>>() {}.getType())).isNull();
	}

	// --- The object itself ---

	/**
	 * Adapts to what it implements, generic supertypes included.
	 */
	static class VolumeSupplier implements Supplier<Volume>, Adaptable {

		@Override
		public Volume get() {
			return new Disk("D");
		}

	}

	@Test
	void objectAdaptsToItsOwnGenericSupertypes() {
		VolumeSupplier supplier = new VolumeSupplier();
		assertThat(supplier.<Object>adaptTo(VOLUMES)).isSameAs(supplier);
		assertThat(supplier.<Object>adaptTo(ANY_WRITABLES)).isSameAs(supplier);
		assertThat(supplier.<Object>adaptTo(WRITABLES)).as("Supplier<Volume> is not a Supplier<Writable>").isNull();
		assertThat(supplier.<Object>adaptTo(Supplier.class)).isSameAs(supplier);
	}

	// --- Methods: what an object computes, with context ---

	static class PartitionedDrive implements Adaptable {

		private final int partitions;

		PartitionedDrive(int partitions) {
			this.partitions = partitions;
		}

		/**
		 * Context is matched to the parameters: adaptTo(Partition.class, 1). Returns null to decline.
		 */
		@Adapter
		public Partition partition(int index) {
			return index < partitions ? new Partition(index) : null;
		}

		/**
		 * No parameters: answers a request without context.
		 */
		@Adapter
		public List<Partition> partitions() {
			return java.util.stream.IntStream.range(0, partitions).mapToObj(Partition::new).toList();
		}

	}

	@Test
	void methodAdaptersTakeContext() {
		PartitionedDrive drive = new PartitionedDrive(2);
		assertThat(drive.<Partition>adaptTo(Partition.class, 1)).isEqualTo(new Partition(1));
		assertThat(drive.<Partition>adaptTo(Partition.class, 5)).as("declined").isNull();
		assertThat(drive.<Partition>adaptTo(Partition.class, "1")).as("a String is not an int").isNull();
		assertThat(drive.<Partition>adaptTo(Partition.class, (Object) null)).as("null cannot be an int").isNull();
		assertThat(drive.<Partition>adaptTo(Partition.class)).as("no context, no partition").isNull();

		List<Partition> partitions = drive.adaptTo(new TypeToken<List<Partition>>() {}.getType());
		assertThat(partitions).containsExactly(new Partition(0), new Partition(1));
	}

	// --- Objects that do not implement Adaptable ---

	/**
	 * A plain object: the annotations are enough, Adapters.adapt adapts it.
	 */
	static class Catalog {

		@Adapter
		public final Supplier<Volume> volumes = () -> new Disk("E");

	}

	@Test
	void plainObjectsAdaptThroughAdapters() {
		Supplier<Volume> volumes = Adapters.adapt(new Catalog(), VOLUMES);
		assertThat(volumes.get()).isEqualTo(new Disk("E"));
		assertThat(Adapters.<Object>adapt(null, VOLUMES)).isNull();
	}

	// --- Overriding: adaptation annotations cannot express ---

	static class Library implements Adaptable {

		@Adapter
		private final Supplier<Volume> volumes = () -> new Disk("F");

		@Override
		public <T> T adaptTo(Type type, Object... context) {
			if (type == String.class && context.length == 1 && context[0] instanceof String key) {
				@SuppressWarnings("unchecked")
				T label = (T) ("label:" + key);
				return label;
			}
			return Adaptable.super.adaptTo(type, context); // The declarative adapters
		}

	}

	@Test
	void overrideFallsBackToDeclaredAdapters() {
		Library library = new Library();
		assertThat(library.<String>adaptTo(String.class, "x")).isEqualTo("label:x");
		Supplier<Volume> volumes = library.adaptTo(VOLUMES);
		assertThat(volumes.get()).isEqualTo(new Disk("F"));
		// Adapters.adapt asks an Adaptable, so the override applies, context included
		assertThat(Adapters.<String>adapt(library, String.class, "y")).isEqualTo("label:y");
	}

	// --- Inheritance and generic classes ---

	static class Box<T> implements Adaptable {

		@Adapter
		protected final T content;

		Box(T content) {
			this.content = content;
		}

	}

	static class DiskBox extends Box<Disk> {

		DiskBox(Disk disk) {
			super(disk);
		}

	}

	@Test
	void typeVariablesAreResolvedForTheConcreteClass() {
		// T is Disk as seen from DiskBox
		assertThat(new DiskBox(new Disk("G")).<Volume>adaptTo(Volume.class)).isEqualTo(new Disk("G"));
		// An instance carries no type arguments: for a plain Box, T is only its bound, Object
		assertThat(new Box<>(new Disk("H")).<Volume>adaptTo(Volume.class)).isNull();
	}

	static class Base implements Adaptable {

		@Adapter
		public Volume volume() {
			return new Disk("base");
		}

	}

	static class Derived extends Base {

		@Override
		public Volume volume() { // No annotation: still the adapter, and this implementation is called
			return new Disk("derived");
		}

	}

	@Test
	void overridesOfAdapterMethodsStayAdapters() {
		assertThat(new Derived().<Volume>adaptTo(Volume.class)).isEqualTo(new Disk("derived"));
	}

	// --- Declining and falling through ---

	static class Shelf implements Adaptable {

		@Adapter
		public Volume volume() {
			return null; // Declines
		}

		@Adapter
		public Writable writable() {
			return new Disk("writable");
		}

	}

	@Test
	void decliningAdapterFallsThroughToTheNext() {
		// Volume is more specific and tried first; it declines, so Writable answers
		assertThat(new Shelf().<Writable>adaptTo(Writable.class)).isEqualTo(new Disk("writable"));
		assertThat(new Shelf().<Volume>adaptTo(Volume.class)).isNull();
	}

	// --- Before there is an instance: isAdaptable reads declarations ---

	@Test
	void isAdaptableAnswersFromDeclarations() {
		assertThat(Adapters.isAdaptable(Drive.class, VOLUMES)).isTrue();
		assertThat(Adapters.isAdaptable(Drive.class, new TypeToken<Supplier<String>>() {}.getType())).isFalse();
		assertThat(Adapters.isAdaptable(VolumeSupplier.class, VOLUMES)).as("the class itself").isTrue();
		assertThat(Adapters.isAdaptable(DiskBox.class, Volume.class)).as("T resolved for DiskBox").isTrue();

		// Context is given as types
		assertThat(Adapters.isAdaptable(PartitionedDrive.class, Partition.class, int.class)).isTrue();
		assertThat(Adapters.isAdaptable(PartitionedDrive.class, Partition.class, Integer.class)).isTrue();
		assertThat(Adapters.isAdaptable(PartitionedDrive.class, Partition.class, String.class)).isFalse();
		assertThat(Adapters.isAdaptable(PartitionedDrive.class, Partition.class)).as("no context").isFalse();

		// An override is code, not a declaration: invisible until an @Adapter method delegates to it
		assertThat(Adapters.isAdaptable(Library.class, String.class, String.class)).isFalse();
	}

	// --- Choosing the type to ask for: wildcards ---
	//
	// The rule: the side that provides declares the exact type it has, no wildcards. The side that
	// asks uses "? extends" at every level it only reads from - which is how the JDK declares
	// Collection.addAll(Collection<? extends E>). Each wildcard admits more providers; each exact
	// type argument insists on that type and nothing else, at that level.

	static class ListParent {

		@Adapter
		public List<EObject> contents() {
			return null; // Only the declaration matters to isAdaptable
		}

	}

	static class EListParent {

		@Adapter
		public EList<EObject> contents() {
			return null;
		}

	}

	static class ClassesParent {

		@Adapter
		public List<EClass> classes() {
			return null;
		}

	}

	static class SupplierParent {

		@Adapter
		public Supplier<List<EObject>> contents() {
			return null;
		}

	}

	static class ClassesSupplierParent {

		@Adapter
		public Supplier<EList<EClass>> classes() {
			return null;
		}

	}

	@Test
	void wildcardsWidenWhatAnswers() {
		// Exact: a List<EObject>, or a subtype with the same argument. A List<EClass> is not a List<EObject>
		Type exact = new TypeToken<List<EObject>>() {}.getType();
		assertThat(Adapters.isAdaptable(ListParent.class, exact)).isTrue();
		assertThat(Adapters.isAdaptable(EListParent.class, exact)).isTrue();
		assertThat(Adapters.isAdaptable(ClassesParent.class, exact)).isFalse();

		// What a save command needs to addAll to a resource: any collection of any EObjects
		Type readable = new TypeToken<Collection<? extends EObject>>() {}.getType();
		assertThat(Adapters.isAdaptable(ListParent.class, readable)).isTrue();
		assertThat(Adapters.isAdaptable(EListParent.class, readable)).isTrue();
		assertThat(Adapters.isAdaptable(ClassesParent.class, readable)).isTrue();

		// Nested: the argument of Supplier must match exactly unless it is a wildcard too
		Type exactSupplier = new TypeToken<Supplier<List<EObject>>>() {}.getType();
		assertThat(Adapters.isAdaptable(SupplierParent.class, exactSupplier)).isTrue();
		assertThat(Adapters.isAdaptable(ClassesSupplierParent.class, exactSupplier)).isFalse();

		Type halfOpen = new TypeToken<Supplier<? extends List<EObject>>>() {}.getType();
		assertThat(Adapters.isAdaptable(SupplierParent.class, halfOpen)).isTrue();
		assertThat(Adapters.isAdaptable(ClassesSupplierParent.class, halfOpen)).as("EClass is not EObject one level down").isFalse();

		Type open = new TypeToken<Supplier<? extends Iterable<? extends EObject>>>() {}.getType();
		assertThat(Adapters.isAdaptable(SupplierParent.class, open)).isTrue();
		assertThat(Adapters.isAdaptable(ClassesSupplierParent.class, open)).isTrue();
		assertThat(Adapters.isAdaptable(ListParent.class, open)).as("a list is not a supplier of one").isFalse();
	}

}
