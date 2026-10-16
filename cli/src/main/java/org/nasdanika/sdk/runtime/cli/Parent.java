package org.nasdanika.sdk.runtime.cli;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.nasdanika.sdk.runtime.common.Adapters;

/**
 * What a command needs from its parent - for a mix-in, from the command it is mixed into. On a
 * field, or on a method taking one parameter; the field's or the parameter's generic type is what is
 * asked for.
 *
 * <pre>
 * &#64;Parent
 * private ExecutionSupplier&lt;? extends Collection&lt;? extends EObject&gt;&gt; contents;
 * </pre>
 *
 * <ul>
 * <li><b>Matching</b>, before the command exists: the command is created under a parent whose class
 * is {@link Adapters#isAdaptable(Class, java.lang.reflect.Type, java.lang.reflect.Type...) adaptable}
 * to the type of any of its parent members. Declarations decide, because the parent's options are
 * not parsed yet when the command tree is built.</li>
 * <li><b>Injection</b>, after parsing and before execution, by {@link WiringExecutionStrategy}: the
 * parent is {@link Adapters#adapt(Object, java.lang.reflect.Type, Object...) adapted} to the member
 * types, most specific first, and the first value obtained is injected. One member only: a command
 * has one parent, and several members are alternative ways to take it. A command whose parent
 * provides none of them fails to execute.</li>
 * </ul>
 *
 * Ask with wildcards, {@code ? extends} at every level only read from: they widen what answers.
 * What is expensive to produce, ask for as an {@link ExecutionSupplier}, so that it is produced
 * inside the command's execution span and only if the command runs.
 *
 * <p>
 * Unrelated to picocli's {@link picocli.CommandLine.ParentCommand}, which keeps working as picocli
 * defines it.
 */
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Documented
public @interface Parent {

}
