package org.nasdanika.sdk.runtime.groovy.dsl

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature

import io.opentelemetry.api.common.AttributeKey

/**
 * Telemetry of DSL loading. Spans and log records carry locations, never loaded values: the script
 * URI ({@link org.nasdanika.sdk.runtime.common.telemetry.Telemetry#RESOURCE_URI}), the script line
 * ({@link #LINE}), and metamodel identities - types and features.
 *
 * <ul>
 *   <li>{@code Loading <Type>} - an element was created and configured. {@link #TYPE} is the
 *       instantiated class, {@link #SUPERSEDED} the less specific classes it was selected over.</li>
 *   <li>{@code Setting <feature>} - a feature call, with {@link #FEATURE}, {@link #FEATURE_CLASS} and
 *       {@link #FEATURE_KIND}. A containment's {@code Loading} spans nest in it. {@link #DEFERRED} is
 *       set when a reference selector is resolved after the script.</li>
 *   <li>{@code Resolving references} - deferred references, with a {@code Resolving <feature>} span
 *       each, carrying the line the reference was authored on.</li>
 * </ul>
 */
final class DslTelemetry {

	/** The instantiated or selected class, as {@code <nsURI>#<name>} - a form the DSL accepts back. */
	public static final AttributeKey<String> TYPE = AttributeKey.stringKey('nasdanika.dsl.type')

	/** Classes superseded by {@link #TYPE} because it is more specific, as {@code <nsURI>#<name>}. */
	public static final AttributeKey<List<String>> SUPERSEDED = AttributeKey.stringArrayKey('nasdanika.dsl.type.superseded')

	public static final AttributeKey<String> FEATURE = AttributeKey.stringKey('nasdanika.dsl.feature')

	/** The class declaring {@link #FEATURE}, as {@code <nsURI>#<name>}. */
	public static final AttributeKey<String> FEATURE_CLASS = AttributeKey.stringKey('nasdanika.dsl.feature.class')

	/** {@code attribute}, {@code containment} or {@code reference}. */
	public static final AttributeKey<String> FEATURE_KIND = AttributeKey.stringKey('nasdanika.dsl.feature.kind')

	/** A reference selector deferred until the script has been evaluated. */
	public static final AttributeKey<Boolean> DEFERRED = AttributeKey.booleanKey('nasdanika.dsl.deferred')

	/** Number of deferred references. */
	public static final AttributeKey<Long> REFERENCES = AttributeKey.longKey('nasdanika.dsl.references')

	/** URI of the element a copy was made from. */
	public static final AttributeKey<String> PROTOTYPE_URI = AttributeKey.stringKey('nasdanika.dsl.prototype.uri')

	/** URI of a resource loaded by a script. */
	public static final AttributeKey<String> TARGET_URI = AttributeKey.stringKey('nasdanika.dsl.target.uri')

	/** URI a global element was registered under. */
	public static final AttributeKey<String> GLOBAL_URI = AttributeKey.stringKey('nasdanika.dsl.global.uri')

	/** 1-based script line, the OpenTelemetry semantic convention key. */
	public static final AttributeKey<Long> LINE = AttributeKey.longKey('code.line.number')

	/** Log record event of a global registration. */
	public static final String GLOBAL_EVENT = 'nasdanika.dsl.global'

	private DslTelemetry() {}

	/** {@code <nsURI>#<name>}, the URI form of a type name. */
	static String id(EClassifier eClassifier) {
		"${eClassifier.EPackage?.nsURI}#${eClassifier.name}"
	}

	static List<String> ids(List<? extends EClassifier> eClassifiers) {
		eClassifiers.collect { id(it) }
	}

	static String kind(EStructuralFeature feature) {
		if (feature instanceof EAttribute) {
			return 'attribute'
		}
		((EReference) feature).containment ? 'containment' : 'reference'
	}

}
