package org.nasdanika.sdk.runtime.common;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Adaptation of any object, through its {@link Adapter} fields and methods, and the check of
 * whether a class could be adapted before there is an instance of it. See {@link Adaptable} for the
 * matching rules.
 *
 * <p>
 * The two answer different questions. {@link #adapt(Object, Type, Object...)} asks an object, which
 * may decline at run time and may override {@link Adaptable#adaptTo(Type, Object...)} to adapt in
 * ways no annotation declares. {@link #isAdaptable(Class, Type, Type...)} reads declarations only:
 * true means an instance can be asked and has a declared way to answer, not that it will. A class
 * whose adaptation is only in an override is not adaptable by this check; an {@link Adapter} method
 * delegating to the override makes it so.
 */
public final class Adapters {

	private Adapters() {
		// Utility
	}

	/**
	 * An adapter field or method, with its types as seen from the class it was found for.
	 *
	 * @param parameterTypes Empty for a field
	 */
	private record Member(AccessibleObject accessor, String name, Type type, Class<?>[] parameterClasses, Type[] parameterTypes, boolean isStatic) {

		/**
		 * Run-time match: context values are instances of the parameter classes.
		 */
		boolean accepts(Object[] context) {
			if (context.length != parameterClasses.length) {
				return false;
			}
			for (int i = 0; i < context.length; ++i) {
				if (context[i] == null ? parameterClasses[i].isPrimitive() : !Types.box(parameterClasses[i]).isInstance(context[i])) {
					return false;
				}
			}
			return true;
		}

		/**
		 * Declaration match: context types are assignable to the generic parameter types. A null
		 * context type stands for a null value.
		 */
		boolean accepts(Type[] contextTypes) {
			if (contextTypes.length != parameterTypes.length) {
				return false;
			}
			for (int i = 0; i < contextTypes.length; ++i) {
				if (contextTypes[i] == null ? parameterClasses[i].isPrimitive() : !Types.isAssignable(Types.box(parameterTypes[i]), Types.box(contextTypes[i]))) {
					return false;
				}
			}
			return true;
		}

		Object get(Object source, Object[] context) {
			Object target = isStatic ? null : source;
			try {
				return accessor instanceof Field field ? field.get(target) : ((Method) accessor).invoke(target, context);
			} catch (InvocationTargetException e) {
				throw new NasdanikaException("Adapter " + accessor + " failed: " + e.getCause(), e.getCause());
			} catch (IllegalAccessException e) {
				throw new NasdanikaException("Cannot access adapter " + accessor, e);
			}
		}

	}

	private static final ClassValue<List<Member>> MEMBERS = new ClassValue<>() {

		@Override
		protected List<Member> computeValue(Class<?> type) {
			return scan(type);
		}

	};

	/**
	 * Adapts an object, which need not implement {@link Adaptable}. One that does is asked, so that
	 * an override of {@link Adaptable#adaptTo(Type, Object...)} applies.
	 *
	 * @param source Object to adapt, null for none
	 * @param type Type to adapt to, possibly generic, e.g. {@code new TypeToken<Supplier<Volume>>() {}.getType()}
	 * @param context Arguments for adapter methods. None for the object itself, adapter fields, and
	 * adapter methods without parameters
	 * @return Instance of the type or null
	 */
	@SuppressWarnings("unchecked")
	public static <T> T adapt(Object source, Type type, Object... context) {
		if (source instanceof Adaptable adaptable) {
			return adaptable.adaptTo(type, context);
		}
		return (T) adaptByDeclarations(source, type, context);
	}

	/**
	 * Whether instances of a class can be adapted to a type, by what the class declares: the class
	 * itself, when there is no context, or an {@link Adapter} field or method. For deciding before
	 * there is an instance, e.g. whether to create a command at all.
	 *
	 * @param type Class whose instances would be adapted
	 * @param target Type to adapt to
	 * @param context Types of the context that will be passed, matched to adapter method parameters by
	 * {@link Types#isAssignable(Type, Type)}. Null for a null value
	 */
	public static boolean isAdaptable(Class<?> type, Type target, Type... context) {
		Type[] theContext = context == null ? new Type[0] : context;
		if (theContext.length == 0 && Types.isAssignable(target, type)) {
			return true;
		}
		for (Member member: MEMBERS.get(type)) {
			if (member.accepts(theContext) && Types.isAssignable(target, member.type())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * What {@link Adaptable#adaptTo(Type, Object...)} does by default: the source itself when it is
	 * of the type and there is no context, otherwise the first non-null value of a matching adapter,
	 * most specific declared type first.
	 */
	static Object adaptByDeclarations(Object source, Type type, Object[] context) {
		if (source == null) {
			return null;
		}
		Object[] theContext = context == null ? new Object[0] : context;
		if (theContext.length == 0 && Types.isAssignable(type, source.getClass())) {
			return source;
		}
		Class<?> erasure = Types.box(Types.erase(type));
		for (Member member: MEMBERS.get(source.getClass())) {
			if (member.accepts(theContext) && Types.isAssignable(type, member.type())) {
				Object value = member.get(source, theContext);
				// The declared type matched; the check guards against a declaration the value contradicts, e.g. through unchecked casts
				if (value != null && erasure.isInstance(value)) {
					return value;
				}
			}
		}
		return null;
	}

	/**
	 * Adapter members of a class, inherited ones included, most derived declaration first. An
	 * override is invoked through the overridden declaration, so it is an adapter whether or not it
	 * repeats the annotation.
	 */
	private static List<Member> scan(Class<?> type) {
		List<Member> members = new ArrayList<>();
		Set<String> seen = new HashSet<>();
		for (Class<?> declaringClass: lineage(type)) {
			for (Field field: declaringClass.getDeclaredFields()) {
				if (field.isAnnotationPresent(Adapter.class) && seen.add(field.getName())) {
					accessible(field);
					members.add(new Member(
							field,
							field.getName(),
							Types.box(Types.getFieldType(field, type)),
							new Class<?>[0],
							new Type[0],
							Modifier.isStatic(field.getModifiers())));
				}
			}
			for (Method method: declaringClass.getDeclaredMethods()) {
				if (method.isAnnotationPresent(Adapter.class)
						&& !method.isBridge()
						&& seen.add(method.getName() + Arrays.toString(method.getParameterTypes()))) {
					if (method.getReturnType() == void.class) {
						throw new IllegalArgumentException("An adapter method must return the adapter: " + method);
					}
					accessible(method);
					members.add(new Member(
							method,
							method.getName(),
							Types.box(Types.getReturnType(method, type)),
							method.getParameterTypes(),
							Types.getParameterTypes(method, type),
							Modifier.isStatic(method.getModifiers())));
				}
			}
		}
		members.sort(ORDER);
		return List.copyOf(members);
	}

	private static void accessible(AccessibleObject member) {
		if (!member.trySetAccessible()) {
			throw new IllegalStateException("Cannot access adapter " + member
					+ ": make it public in an exported package, or open its package to " + Adapters.class.getModule().getName());
		}
	}

	/**
	 * The class, its superclasses, then their interfaces, each once.
	 */
	private static Set<Class<?>> lineage(Class<?> type) {
		Set<Class<?>> lineage = new LinkedHashSet<>();
		for (Class<?> c = type; c != null; c = c.getSuperclass()) {
			lineage.add(c);
		}
		Deque<Class<?>> queue = new ArrayDeque<>(lineage);
		while (!queue.isEmpty()) {
			for (Class<?> i: queue.removeFirst().getInterfaces()) {
				if (lineage.add(i)) {
					queue.addLast(i);
				}
			}
		}
		return lineage;
	}

	private static final Comparator<Member> ORDER = Comparator
			.comparingInt((Member m) -> -Types.specificity(m.type()))
			.thenComparing(m -> m.accessor() instanceof Method) // Fields first: cheaper
			.thenComparing(Member::name)
			.thenComparingInt(m -> m.parameterClasses().length);

}
