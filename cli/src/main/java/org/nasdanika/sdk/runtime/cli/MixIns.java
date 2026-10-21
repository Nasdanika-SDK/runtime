package org.nasdanika.sdk.runtime.cli;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * What contributed mix-ins a command accepts.
 *
 * <ul>
 * <li><b>On a field, or on a method taking one parameter</b>: the member's generic type is what is
 * accepted, as for {@link SubCommand}. A member typed as an array, a {@code List}, {@code Collection},
 * {@code Iterable} or {@code Set} takes many mix-ins, and its element type is what is accepted; any
 * other member takes one. A mix-in is added to the command when its class is
 * {@link org.nasdanika.sdk.runtime.common.Adapters#isAdaptable(Class, java.lang.reflect.Type, java.lang.reflect.Type...) adaptable}
 * to what a member accepts, and is injected into the member after parsing, by
 * {@link WiringExecutionStrategy}, with its options parsed.
 *
 * <pre>
 * &#64;MixIns
 * private List&lt;Formatter&lt;? super String&gt;&gt; formatters;
 * </pre>
 *
 * </li>
 * <li><b>On a command class</b>, listing types: a mix-in is added when its class is adaptable to
 * one of them. Classes cannot carry type arguments, so this form matches raw types only, and nothing
 * is injected: the command finds its mix-ins through picocli, {@code spec.mixins()}.</li>
 * </ul>
 */
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
@Documented
public @interface MixIns {

	/**
	 * On a command class, the types of mix-ins to add to it. Ignored on a member, whose type says it.
	 */
	Class<?>[] value() default {};

}
