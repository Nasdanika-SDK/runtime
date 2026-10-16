package org.nasdanika.sdk.runtime.cli;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.nasdanika.sdk.runtime.common.Adapters;
import org.nasdanika.sdk.runtime.common.NasdanikaException;
import org.nasdanika.sdk.runtime.common.Types;

/**
 * Matching and injection of {@link Parent} and {@link SubCommand} members: the factories match
 * classes before commands exist, {@link WiringExecutionStrategy} injects before a command executes.
 *
 * <p>
 * Members are found once per class, on the class and its superclasses. They must be accessible to
 * this module: in a package opened to it, as picocli needs command packages to be anyway.
 */
public final class CommandWiring {

	private CommandWiring() {
		// Utility
	}

	/**
	 * How many values a member takes.
	 */
	private enum Arity { SINGLE, LIST, SET, ARRAY }

	/**
	 * @param type Field type or the method's parameter type, as seen from the class it was found for
	 * @param accepts What a sub-command must adapt to: the element type of a many-valued member, the type of a single-valued one
	 */
	private record Member(AccessibleObject accessor, String name, Type type, Arity arity, Type accepts) {

		void set(Object target, Object value) {
			try {
				if (accessor instanceof Field field) {
					field.set(target, value);
				} else {
					((Method) accessor).invoke(target, value);
				}
			} catch (InvocationTargetException e) {
				throw new NasdanikaException("Injection through " + accessor + " failed: " + e.getCause(), e.getCause());
			} catch (IllegalAccessException e) {
				throw new NasdanikaException("Cannot inject through " + accessor, e);
			}
		}

	}

	private static final class Members extends ClassValue<List<Member>> {

		private final Class<? extends Annotation> annotation;

		Members(Class<? extends Annotation> annotation) {
			this.annotation = annotation;
		}

		@Override
		protected List<Member> computeValue(Class<?> type) {
			return scan(type, annotation);
		}

	}

	private static final Members PARENTS = new Members(Parent.class);

	private static final Members SUB_COMMANDS = new Members(SubCommand.class);

	/**
	 * Whether a command or mix-in class takes a parent of a class: whether the parent class is
	 * adaptable to the type of any of its {@link Parent} members.
	 */
	public static boolean acceptsParent(Class<?> type, Class<?> parentType) {
		for (Member member: PARENTS.get(type)) {
			if (Adapters.isAdaptable(parentType, member.type())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Whether a command class takes a sub-command of a class: whether the sub-command class is
	 * adaptable to what any of its {@link SubCommand} members accepts.
	 */
	public static boolean acceptsSubCommand(Class<?> type, Class<?> subCommandType) {
		for (Member member: SUB_COMMANDS.get(type)) {
			if (Adapters.isAdaptable(subCommandType, member.accepts())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Injects the parent, adapted, into the first {@link Parent} member it can be adapted to, most
	 * specific first. Nothing to do for a target without parent members.
	 *
	 * @throws IllegalStateException if the target has parent members and the parent provides none of them
	 */
	public static void injectParent(Object target, Object parent) {
		if (target == null) {
			return;
		}
		List<Member> members = PARENTS.get(target.getClass());
		if (members.isEmpty()) {
			return;
		}
		for (Member member: members) {
			Object value = Adapters.adapt(parent, member.type());
			if (value != null) {
				member.set(target, value);
				return;
			}
		}
		throw new IllegalStateException(target.getClass().getName() + " needs its parent as one of "
				+ members.stream().map(m -> m.type().getTypeName()).toList()
				+ ", and " + (parent == null ? "there is no parent" : parent.getClass().getName() + " provides none of them"));
	}

	/**
	 * Injects sub-commands, adapted, into every {@link SubCommand} member: those adaptable to what
	 * it accepts, all of them into a many-valued member, the first into a single-valued one.
	 */
	public static void injectSubCommands(Object target, Collection<?> subCommands) {
		if (target == null) {
			return;
		}
		for (Member member: SUB_COMMANDS.get(target.getClass())) {
			List<Object> values = new ArrayList<>();
			for (Object subCommand: subCommands) {
				Object value = Adapters.adapt(subCommand, member.accepts());
				if (value != null) {
					values.add(value);
				}
			}
			switch (member.arity()) {
			case SINGLE -> {
				if (!values.isEmpty()) {
					member.set(target, values.get(0));
				}
			}
			case LIST -> member.set(target, values);
			case SET -> member.set(target, new LinkedHashSet<>(values));
			case ARRAY -> {
				Object array = Array.newInstance(Types.erase(member.accepts()), values.size());
				for (int i = 0; i < values.size(); ++i) {
					Array.set(array, i, values.get(i));
				}
				member.set(target, array);
			}
			}
		}
	}

	// --- Implementation ---

	private static List<Member> scan(Class<?> type, Class<? extends Annotation> annotation) {
		List<Member> members = new ArrayList<>();
		Set<String> seen = new HashSet<>();
		for (Class<?> declaringClass = type; declaringClass != null; declaringClass = declaringClass.getSuperclass()) {
			for (Field field: declaringClass.getDeclaredFields()) {
				if (field.isAnnotationPresent(annotation) && seen.add(field.getName())) {
					if (Modifier.isStatic(field.getModifiers())) {
						throw new IllegalArgumentException("@" + annotation.getSimpleName() + " field must not be static: " + field);
					}
					accessible(field);
					members.add(member(field, field.getName(), Types.getFieldType(field, type)));
				}
			}
			for (Method method: declaringClass.getDeclaredMethods()) {
				if (method.isAnnotationPresent(annotation)
						&& !method.isBridge()
						&& seen.add(method.getName() + Arrays.toString(method.getParameterTypes()))) {
					if (method.getParameterCount() != 1 || Modifier.isStatic(method.getModifiers())) {
						throw new IllegalArgumentException("@" + annotation.getSimpleName() + " method must be an instance method taking one parameter: " + method);
					}
					accessible(method);
					members.add(member(method, method.getName(), Types.getParameterTypes(method, type)[0]));
				}
			}
		}
		members.sort(ORDER);
		return List.copyOf(members);
	}

	private static Member member(AccessibleObject accessor, String name, Type type) {
		Type boxed = Types.box(type);
		Class<?> rawType = Types.erase(boxed);
		if (rawType.isArray()) {
			Type component = boxed instanceof GenericArrayType arrayType ? arrayType.getGenericComponentType() : rawType.getComponentType();
			return new Member(accessor, name, boxed, Arity.ARRAY, Types.box(component));
		}
		if (Iterable.class.isAssignableFrom(rawType)) {
			Arity arity = rawType.isAssignableFrom(ArrayList.class) ? Arity.LIST : rawType.isAssignableFrom(LinkedHashSet.class) ? Arity.SET : null;
			if (arity != null) {
				Type element = Types.getElementType(boxed, Iterable.class.getTypeParameters()[0]);
				return new Member(accessor, name, boxed, arity, element == null ? Object.class : element);
			}
		}
		return new Member(accessor, name, boxed, Arity.SINGLE, boxed);
	}

	private static void accessible(AccessibleObject member) {
		if (!member.trySetAccessible()) {
			throw new IllegalStateException("Cannot access " + member + ": open its package to " + CommandWiring.class.getModule().getName());
		}
	}

	/**
	 * Most specific first, so that of alternative parent members the most specific is tried first.
	 */
	private static final Comparator<Member> ORDER = Comparator
			.comparingInt((Member m) -> -Types.specificity(m.type()))
			.thenComparing(Member::name);

}
