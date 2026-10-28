package org.nasdanika.sdk.runtime.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.SequencedCollection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.junit.jupiter.api.Test;

class TestLineage {

	interface A {}

	interface B extends A {}

	interface X extends A {}

	interface C extends X {}

	/**
	 * Paths of different lengths to A: breadth-first would put A before X.
	 */
	static class D implements B, C {}

	interface I {}

	interface J extends I {}

	/**
	 * Declared order (I before J) contradicts inheritance (J before I).
	 */
	interface K extends I, J {}

	@SuppressWarnings("serial")
	static class Names extends ArrayList<String> {}

	@Test
	void everyTypeComesBeforeItsSupertypes() {
		assertThat(Util.lineage(D.class)).containsExactly(D.class, B.class, C.class, X.class, A.class, Object.class);
	}

	@Test
	void inheritanceWinsOverContradictingDeclaredOrder() {
		assertThat(Util.lineage(K.class)).containsExactly(K.class, J.class, I.class, Object.class);
	}

	@Test
	void jdkClasses() {
		List<Class<?>> lineage = Util.lineage(ArrayList.class);
		assertThat(lineage).startsWith(ArrayList.class, AbstractList.class, AbstractCollection.class).endsWith(Object.class);
		assertThat(lineage).contains(List.class, RandomAccess.class, Cloneable.class, Serializable.class);
		for (int i = 0; i < lineage.size(); ++i) {
			for (int j = i + 1; j < lineage.size(); ++j) {
				assertThat(lineage.get(i).isAssignableFrom(lineage.get(j))).as(lineage.get(j) + " after " + lineage.get(i)).isFalse();
			}
		}
		assertThat(Util.lineage(Object.class)).containsExactly(Object.class);
		assertThat(Util.lineage(int.class)).containsExactly(int.class);
		assertThat(Util.lineage((Class<?>) null)).isEmpty();
	}

	@Test
	void genericTypesKeepTheirArguments() {
		assertThat(Util.genericLineage(new TypeToken<List<String>>() {}.getType())).containsExactly(
				new TypeToken<List<String>>() {}.getType(),
				new TypeToken<SequencedCollection<String>>() {}.getType(),
				new TypeToken<Collection<String>>() {}.getType(),
				new TypeToken<Iterable<String>>() {}.getType(),
				Object.class);
	}

	@Test
	void classesFixingTypeArguments() {
		List<Type> lineage = Util.genericLineage(Names.class);
		assertThat(lineage).startsWith(
				Names.class,
				new TypeToken<ArrayList<String>>() {}.getType(),
				new TypeToken<AbstractList<String>>() {}.getType());
		assertThat(lineage).contains(new TypeToken<List<String>>() {}.getType(), RandomAccess.class).endsWith(Object.class);
		assertThat(lineage.indexOf(new TypeToken<List<String>>() {}.getType()))
				.isLessThan(lineage.indexOf(new TypeToken<Collection<String>>() {}.getType()));
	}

	@Test
	void rawTypesHaveRawSupertypes() {
		assertThat(Util.genericLineage(List.class)).containsExactly(List.class, SequencedCollection.class, Collection.class, Iterable.class, Object.class);
	}

	@Test
	void eClasses() {
		EClass a = eClass("A");
		EClass b = eClass("B", a);
		EClass x = eClass("X", a);
		EClass c = eClass("C", x);
		EClass d = eClass("D", b, c);
		assertThat(Util.lineage(d)).containsExactly(d, b, c, x, a);

		EClass i = eClass("I");
		EClass j = eClass("J", i);
		EClass k = eClass("K", i, j);
		assertThat(Util.lineage(k)).containsExactly(k, j, i);
	}

	@Test
	void cyclesAreRejected() {
		EClass a = eClass("A");
		EClass b = eClass("B", a);
		a.getESuperTypes().add(b);
		assertThatThrownBy(() -> Util.lineage(b)).isInstanceOf(IllegalArgumentException.class);
	}

	private static EClass eClass(String name, EClass... supertypes) {
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(name);
		eClass.getESuperTypes().addAll(List.of(supertypes));
		return eClass;
	}

}
