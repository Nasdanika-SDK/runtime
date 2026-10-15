package org.nasdanika.sdk.runtime.common;

import java.lang.reflect.Type;

/**
 * Something that can be adapted to a different type.  Can be used to access contextual information.
 *
 * <p>
 * Adaptation is declarative by default: fields and methods annotated with {@link Adapter} say what
 * an object can be adapted to through their generic types, which are matched with type arguments,
 * not only as raw classes:
 *
 * <pre>
 * class Drive implements Adaptable {
 *
 *     &#64;Adapter
 *     private final Supplier&lt;Volume&gt; volumes = ...;           // adaptTo(new TypeToken&lt;Supplier&lt;Volume&gt;&gt;() {}.getType())
 *
 *     &#64;Adapter
 *     public Partition partition(int index) { ... }          // adaptTo(Partition.class, 2)
 *
 * }
 * </pre>
 *
 * <ul>
 * <li>With no context the object itself is returned if it is of the type, by its declared generic
 * supertypes, so a class implementing {@code Supplier<Volume>} adapts to {@code Supplier<Volume>}.
 * Otherwise adapter fields and methods without parameters are tried.</li>
 * <li>With context, adapter methods whose parameters accept the context are tried: as many
 * parameters as context elements, each an instance of its parameter's class, or null for one that
 * is not primitive.</li>
 * <li>Of the adapters whose declared type is assignable to the requested type, the most specific is
 * tried first, and the first non-null value wins. Null means "not this time", so an adapter may
 * decline.</li>
 * <li>Members are found once per class, inherited ones included, and invoked through reflection:
 * they must be public in an exported package, or their package must be open to this module. A
 * member declared {@code T} in a generic class is seen with {@code T} resolved for the concrete
 * class.</li>
 * </ul>
 *
 * <p>
 * Adaptation that annotations cannot express - computed, delegated, cached - goes in an override of
 * {@link #adaptTo(Type, Object...)}, which can fall back to the declarative adapters with
 * {@code Adaptable.super.adaptTo(type, context)}.
 *
 * <p>
 * Objects that do not implement this interface are adapted the same way by
 * {@link Adapters#adapt(Object, Type, Object...)}: implementing it is needed only to override.
 * Whether a class is adaptable before there is an instance is answered by
 * {@link Adapters#isAdaptable(Class, Type, Type...)}.
 *
 * @author Pavel
 */
public interface Adaptable {

	/**
	 * Adapts to requested type.
	 * @param type Type to adapt to, possibly generic, e.g. {@code new TypeToken<Supplier<Volume>>() {}.getType()}.
	 * @param context Arguments for adapter methods. None for this object itself, adapter fields, and adapter methods without parameters.
	 * @return Instance of the type or null.
	 */
	@SuppressWarnings("unchecked")
	default <T> T adaptTo(Type type, Object... context) {
		return (T) Adapters.adaptByDeclarations(this, type, context);
	}

}
