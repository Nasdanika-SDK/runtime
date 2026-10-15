package org.nasdanika.sdk.runtime.common;

import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Set;

import io.leangen.geantyref.GenericTypeReflector;

/**
 * Generic type matching, shared by everything that matches on declared types rather than on
 * classes: capability factories, adaptation, command wiring.
 *
 * <p>
 * Runtime objects carry no type arguments, so what is matched is always a declared type: a class's
 * generic supertypes, a type argument a subclass fixes, a member's generic signature. Types built
 * by the JDK (reflection, {@link TypeToken}) and by other implementations are equal when they
 * describe the same type, so either may be used as a map key.
 */
public final class Types {

	private Types() {
		// Utility
	}

	/**
	 * Whether a value of type {@code source} may be used where {@code target} is required, by Java's
	 * rules for generics: {@code Supplier<Volume>} satisfies {@code Supplier<? extends Writable>}
	 * and a raw {@code Supplier}, but not {@code Supplier<Writable>}.
	 *
	 * <p>
	 * With one deliberate difference: a raw type does not satisfy a parameterized one. Java allows
	 * that as an unchecked conversion, and here it would let something declared as a raw
	 * {@code Supplier} answer for {@code Supplier<Volume>}, about which it has said nothing. A
	 * target whose type arguments are all {@code ?} is the exception, because raw to
	 * {@code Supplier<?>} is safe and Java allows it without a warning.
	 *
	 * @param target Required type
	 * @param source Declared type of the candidate
	 */
	public static boolean isAssignable(Type target, Type source) {
		if (!GenericTypeReflector.isSuperType(target, source)) {
			return false;
		}
		if (target instanceof ParameterizedType parameterizedTarget && !isUnboundedWildcards(parameterizedTarget)) {
			return GenericTypeReflector.getExactSuperType(source, erase(target)) instanceof ParameterizedType;
		}
		return true;
	}

	private static boolean isUnboundedWildcards(ParameterizedType type) {
		for (Type argument: type.getActualTypeArguments()) {
			if (!(argument instanceof WildcardType wildcard)
					|| wildcard.getLowerBounds().length > 0
					|| wildcard.getUpperBounds().length > 1
					|| (wildcard.getUpperBounds().length == 1 && wildcard.getUpperBounds()[0] != Object.class)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * The type argument a subtype fixes for a type parameter of one of its generic supertypes: for
	 * {@code class VolumeSupplier implements Supplier<Volume>}, the argument for {@code T} is
	 * {@code Volume}, however many classes lie in between.
	 *
	 * @param subtype The subtype, e.g. {@code getClass()} or a method's generic return type
	 * @param parameter A type parameter of a supertype, e.g. {@code Supplier.class.getTypeParameters()[0]}
	 * @return The argument, or null when the subtype does not fix it, as when it is generic in it itself
	 */
	public static Type getTypeArgument(Type subtype, TypeVariable<? extends Class<?>> parameter) {
		Type argument = GenericTypeReflector.getTypeParameter(subtype, parameter);
		return argument != null && isGround(argument) ? argument : null;
	}

	/**
	 * What a value taken out of a container is known to be: the type argument for {@code parameter},
	 * like {@link #getTypeArgument(Type, TypeVariable)}, but with a wildcard replaced by its upper
	 * bound. An element of {@code List<? extends Volume>} is a {@code Volume}; of {@code List<?>}
	 * or {@code List<? super Volume>}, an {@code Object}.
	 *
	 * @return The element type, or null when the container does not fix it, as when it is raw
	 */
	public static Type getElementType(Type container, TypeVariable<? extends Class<?>> parameter) {
		Type argument = GenericTypeReflector.getTypeParameter(container, parameter);
		if (argument instanceof WildcardType wildcard) {
			argument = wildcard.getUpperBounds()[0]; // Object for ? and for ? super X
		}
		return argument != null && isGround(argument) ? argument : null;
	}

	/**
	 * Whether a type can be required or provided: no type variables anywhere in it, and not a
	 * wildcard itself. Wildcards are allowed as type arguments. {@code T} or {@code List<T>} means
	 * something only in the scope that declares {@code T}, so it cannot be matched against anything.
	 */
	public static boolean isGround(Type type) {
		if (type instanceof Class) {
			return true;
		}
		if (type instanceof ParameterizedType parameterized) {
			if (parameterized.getOwnerType() != null && !isGround(parameterized.getOwnerType())) {
				return false;
			}
			for (Type argument: parameterized.getActualTypeArguments()) {
				if (argument instanceof WildcardType wildcard) {
					for (Type bound: wildcard.getUpperBounds()) {
						if (!isGround(bound)) {
							return false;
						}
					}
					for (Type bound: wildcard.getLowerBounds()) {
						if (!isGround(bound)) {
							return false;
						}
					}
				} else if (!isGround(argument)) {
					return false;
				}
			}
			return true;
		}
		if (type instanceof GenericArrayType array) {
			return isGround(array.getGenericComponentType());
		}
		return false; // TypeVariable, a top level WildcardType, null, or an implementation we do not know
	}

	/**
	 * The class a type erases to: {@code Supplier} for {@code Supplier<Volume>}.
	 */
	public static Class<?> erase(Type type) {
		return GenericTypeReflector.erase(type);
	}

	/**
	 * A field's type as seen from a subtype of its declaring class: for {@code T value} declared in
	 * {@code Box<T>}, {@code Integer} as seen from {@code class IntBox extends Box<Integer>}. Where the
	 * subtype does not fix the variables, as for a raw {@code Box}, their bounds stand in.
	 */
	public static Type getFieldType(Field field, Type subtype) {
		return ground(GenericTypeReflector.getExactFieldType(field, subtype));
	}

	/**
	 * A method's return type as seen from a subtype of its declaring class. See
	 * {@link #getFieldType(Field, Type)}. A method's own type parameters, as in
	 * {@code <T> T get(Class<T> type)}, are replaced by their bounds.
	 */
	public static Type getReturnType(Method method, Type subtype) {
		return ground(GenericTypeReflector.getExactReturnType(method, subtype));
	}

	/**
	 * A method's parameter types as seen from a subtype of its declaring class. See
	 * {@link #getFieldType(Field, Type)}.
	 */
	public static Type[] getParameterTypes(Method method, Type subtype) {
		Type[] parameterTypes = GenericTypeReflector.getExactParameterTypes(method, subtype);
		for (int i = 0; i < parameterTypes.length; ++i) {
			parameterTypes[i] = ground(parameterTypes[i]);
		}
		return parameterTypes;
	}

	private static Type ground(Type type) {
		return isGround(type) ? type : erase(type);
	}

	/**
	 * The wrapper class for a primitive type, which is what a value of it is once it is an object.
	 * Other types are returned as they are.
	 */
	public static Type box(Type type) {
		return type instanceof Class<?> theClass ? box(theClass) : type;
	}

	public static Class<?> box(Class<?> type) {
		return type.isPrimitive() ? MethodType.methodType(type).wrap().returnType() : type;
	}

	/**
	 * The number of supertypes of what a type erases to, itself included. Strictly greater for a
	 * subtype than for any of its supertypes, so sorting on it puts the most specific first and is
	 * transitive, where pairwise {@code isAssignableFrom} comparisons are not.
	 */
	public static int specificity(Type type) {
		Set<Class<?>> supertypes = new HashSet<>();
		collectSupertypes(erase(type), supertypes);
		return supertypes.size();
	}

	private static void collectSupertypes(Class<?> type, Set<Class<?>> supertypes) {
		if (type != null && supertypes.add(type)) {
			collectSupertypes(type.getSuperclass(), supertypes);
			for (Class<?> i: type.getInterfaces()) {
				collectSupertypes(i, supertypes);
			}
		}
	}

}
