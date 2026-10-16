package org.nasdanika.sdk.runtime.cli;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.nasdanika.sdk.runtime.common.Adapters;

/**
 * What a command accepts as sub-commands. On a field, or on a method taking one parameter; the
 * field's or the parameter's generic type is what is accepted.
 *
 * <pre>
 * &#64;SubCommand
 * private List&lt;Exporter&gt; exporters;     // every sub-command adaptable to Exporter
 *
 * &#64;SubCommand
 * private JsonCommand json;               // the first sub-command adaptable to JsonCommand
 * </pre>
 *
 * A member typed as an array, a {@code List}, {@code Collection}, {@code Iterable} or {@code Set}
 * takes many sub-commands, and its element type is what is accepted; any other member takes one.
 *
 * <ul>
 * <li><b>Matching</b>, before the sub-command exists: a sub-command is created under this command
 * when its class is {@link Adapters#isAdaptable(Class, java.lang.reflect.Type, java.lang.reflect.Type...)
 * adaptable} to what any member accepts.</li>
 * <li><b>Injection</b>, after parsing and before execution, by {@link WiringExecutionStrategy}: every
 * member gets the sub-commands adaptable to what it accepts - all of them for a many-valued member,
 * an empty one if there are none, the first for a single-valued member. Sub-commands not on the
 * command line have not had their options parsed.</li>
 * </ul>
 */
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Documented
public @interface SubCommand {

}
