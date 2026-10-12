package org.nasdanika.sdk.runtime.groovy.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Flow;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingOpenTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingSpan;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingTracerProvider;
import org.nasdanika.sdk.runtime.common.telemetry.SpanEvent;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.groovy.CompiledScriptResourceContentsHandler;
import org.nasdanika.sdk.runtime.groovy.DslResourceContentsHandler;
import org.nasdanika.sdk.runtime.groovy.EPackageResolver;
import org.nasdanika.sdk.runtime.groovy.dsl.DslTelemetry;
import org.nasdanika.sdk.runtime.groovy.dsl.Selection;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.Scope;

/**
 * A refinement model's {@code ModelElement} extends the core {@code ModelElement}. Loaded with both
 * packages, a script gets the refined class for {@code modelElement}, and the superseded core class is
 * recorded on the {@code Loading ModelElement} span.
 */
public class TestSupersessionAndTelemetry {

	private static final String CORE_NS_URI = "urn:test:core";
	private static final String GOVERNANCE_NS_URI = "urn:test:governance";

	private final EPackage corePackage = EcoreFactory.eINSTANCE.createEPackage();
	private final EClass coreModelElement = eClass(corePackage, "ModelElement", false);
	private final EClass container = eClass(corePackage, "Container", false);

	private final EPackage governancePackage = EcoreFactory.eINSTANCE.createEPackage();
	private final EClass governed = eClass(governancePackage, "Governed", true);
	private final EClass governanceModelElement = eClass(governancePackage, "ModelElement", false);

	{
		corePackage.setName("core");
		corePackage.setNsURI(CORE_NS_URI);
		attribute(coreModelElement, "name");
		reference(container, "elements", coreModelElement, true, true);
		reference(container, "primary", coreModelElement, false, false);

		governancePackage.setName("governance");
		governancePackage.setNsURI(GOVERNANCE_NS_URI);
		attribute(governed, "owner");
		governanceModelElement.getESuperTypes().add(coreModelElement);
		governanceModelElement.getESuperTypes().add(governed);
	}

	private static EClass eClass(EPackage ePackage, String name, boolean isAbstract) {
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(name);
		eClass.setAbstract(isAbstract);
		ePackage.getEClassifiers().add(eClass);
		return eClass;
	}

	private static void attribute(EClass eClass, String name) {
		EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
		attribute.setName(name);
		attribute.setEType(EcorePackage.Literals.ESTRING);
		eClass.getEStructuralFeatures().add(attribute);
	}

	private static void reference(EClass eClass, String name, EClass type, boolean containment, boolean many) {
		EReference reference = EcoreFactory.eINSTANCE.createEReference();
		reference.setName(name);
		reference.setEType(type);
		reference.setContainment(containment);
		reference.setUpperBound(many ? -1 : 1);
		eClass.getEStructuralFeatures().add(reference);
	}

	private static EPackageResolver resolver(EPackage... ePackages) {
		return new EPackageResolver(ePackages) {

			@Override
			protected ResourceSet getResourceSet() {
				return null;
			}

		};
	}

	// --- Selection ---

	@Test
	public void testRefinementSupersedes() {
		EPackageResolver resolver = resolver(corePackage, governancePackage);

		Selection<EClass> selection = resolver.selectClass(null, "modelElement");
		assertThat(selection.selected()).isSameAs(governanceModelElement);
		assertThat(selection.superseded()).containsExactly(coreModelElement);

		assertThat(resolver.names()).containsEntry("modelElement", governanceModelElement);

		Selection<EClassifier> classifierSelection = resolver.selectClassifier(null, "ModelElement");
		assertThat(classifierSelection.selected()).isSameAs(governanceModelElement);
		assertThat(classifierSelection.superseded()).containsExactly(coreModelElement);
	}

	@Test
	public void testRefinementSupersedesInBasePackage() {
		EPackageResolver resolver = resolver(corePackage, governancePackage);

		// Inside an element of the core package, the core class is a scoped match, still superseded
		Selection<EClass> inCore = resolver.selectClass(corePackage.getEFactoryInstance().create(container), "modelElement");
		assertThat(inCore.selected()).isSameAs(governanceModelElement);
		assertThat(inCore.superseded()).containsExactly(coreModelElement);

		// Inside an element of the governance package, the refined class is the scoped match
		Selection<EClass> inGovernance = resolver.selectClass(governancePackage.getEFactoryInstance().create(governanceModelElement), "modelElement");
		assertThat(inGovernance.selected()).isSameAs(governanceModelElement);
		assertThat(inGovernance.superseded()).containsExactly(coreModelElement);

		// No match supersedes another
		Selection<EClass> containerSelection = resolver.selectClass(null, "container");
		assertThat(containerSelection.selected()).isSameAs(container);
		assertThat(containerSelection.superseded()).isEmpty();
	}

	@Test
	public void testExplicitNamesSupersedeNothing() {
		EPackageResolver resolver = resolver(corePackage, governancePackage);

		Selection<EClass> byUri = resolver.selectClass(null, CORE_NS_URI + "#ModelElement");
		assertThat(byUri.selected()).isSameAs(coreModelElement);
		assertThat(byUri.superseded()).isEmpty();
	}

	/**
	 * Two refinements of the same class do not compose: neither supersedes the other.
	 */
	@Test
	public void testTwoRefinementsAreAmbiguous() {
		EPackage kindPackage = EcoreFactory.eINSTANCE.createEPackage();
		kindPackage.setName("kind");
		kindPackage.setNsURI("urn:test:kind");
		EClass kindModelElement = eClass(kindPackage, "ModelElement", false);
		kindModelElement.getESuperTypes().add(coreModelElement);

		EPackageResolver resolver = resolver(corePackage, governancePackage, kindPackage);
		assertThatThrownBy(() -> resolver.selectClass(null, "modelElement"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("Ambiguous");
		assertThat(resolver.names()).doesNotContainKey("modelElement");
	}

	// --- Loading with telemetry ---

	private static final String SCRIPT = """
			container {
			    modelElement {
			        name 'confidential-name'
			        owner 'confidential-owner'
			    }
			    primary "elements[name='confidential-name']"
			}
			modelElement {
			    name 'confidential-root'
			}
			null // Contents are the roots, not the last expression
			""";

	private static List<SpanEvent.Started> started(List<SpanEvent> events, String name) {
		return events.stream()
				.filter(SpanEvent.Started.class::isInstance)
				.map(SpanEvent.Started.class::cast)
				.filter(s -> s.name().equals(name))
				.toList();
	}

	private static SpanEvent.Started single(List<SpanEvent> events, String name) {
		List<SpanEvent.Started> named = started(events, name);
		assertThat(named).as(name).hasSize(1);
		return named.getFirst();
	}

	private static SpanEvent.Started atLine(List<SpanEvent> events, String name, long line) {
		List<SpanEvent.Started> named = started(events, name).stream().filter(s -> Long.valueOf(line).equals(s.attributes().get(DslTelemetry.LINE))).toList();
		assertThat(named).as(name + " at line " + line).hasSize(1);
		return named.getFirst();
	}

	private static Object attributeSet(List<SpanEvent> events, PublishingSpan span, AttributeKey<?> key) {
		return events.stream()
				.filter(SpanEvent.AttributeSet.class::isInstance)
				.map(SpanEvent.AttributeSet.class::cast)
				.filter(a -> a.span() == span && a.key().equals(key))
				.map(SpanEvent.AttributeSet::value)
				.findFirst()
				.orElse(null);
	}

	@Test
	public void testLoadingTelemetry() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = new ResourceImpl(URI.createURI("test:governance.groovy"));
		resourceSet.getResources().add(resource);
		DslResourceContentsHandler handler = new DslResourceContentsHandler(
				resource,
				new CompiledScriptResourceContentsHandler(resource),
				corePackage,
				governancePackage);

		List<SpanEvent> events = new CopyOnWriteArrayList<>();
		EObject[] contents;
		try (PublishingOpenTelemetry openTelemetry = new PublishingOpenTelemetry(OpenTelemetry.noop(), new PublishingTracerProvider(TracerProvider.noop(), Runnable::run, 1024));
				Scope scope = Telemetry.makeCurrent(openTelemetry)) {

			openTelemetry.subscribe(new Flow.Subscriber<SpanEvent>() {

				@Override
				public void onSubscribe(Flow.Subscription subscription) {
					subscription.request(Long.MAX_VALUE);
				}

				@Override
				public void onNext(SpanEvent item) {
					events.add(item);
				}

				@Override
				public void onError(Throwable throwable) {
					// Not expected
				}

				@Override
				public void onComplete() {
					// Closed at the end of the test
				}

			});

			contents = handler.load(new ByteArrayInputStream(SCRIPT.getBytes(StandardCharsets.UTF_8)), Map.of());
		}

		// The model: refined elements, the reference resolved after the script
		assertThat(contents).hasSize(2);
		EObject containerElement = contents[0];
		@SuppressWarnings("unchecked")
		EList<EObject> elements = (EList<EObject>) containerElement.eGet(container.getEStructuralFeature("elements"));
		assertThat(elements).singleElement().extracting(EObject::eClass).isSameAs(governanceModelElement);
		assertThat(containerElement.eGet(container.getEStructuralFeature("primary"))).isSameAs(elements.getFirst());
		assertThat(contents[1].eClass()).isSameAs(governanceModelElement);

		String uri = resource.getURI().toString();
		List<String> superseded = List.of(CORE_NS_URI + "#ModelElement");

		// Loading spans: type, superseded types, location
		SpanEvent.Started loadingContainer = single(events, "Loading Container");
		assertThat(loadingContainer.attributes().get(DslTelemetry.TYPE)).isEqualTo(CORE_NS_URI + "#Container");
		assertThat(loadingContainer.attributes().get(DslTelemetry.SUPERSEDED)).isNull();
		assertThat(loadingContainer.attributes().get(DslTelemetry.LINE)).isEqualTo(1L);
		assertThat(loadingContainer.attributes().get(Telemetry.RESOURCE_URI)).isEqualTo(uri);

		assertThat(started(events, "Loading ModelElement")).hasSize(2).allSatisfy(s -> {
			assertThat(s.attributes().get(DslTelemetry.TYPE)).isEqualTo(GOVERNANCE_NS_URI + "#ModelElement");
			assertThat(s.attributes().get(DslTelemetry.SUPERSEDED)).isEqualTo(superseded);
			assertThat(s.attributes().get(Telemetry.RESOURCE_URI)).isEqualTo(uri);
		});
		SpanEvent.Started loadingNested = atLine(events, "Loading ModelElement", 2);
		SpanEvent.Started loadingRoot = atLine(events, "Loading ModelElement", 8);
		assertThat(loadingRoot.span().getParent()).isNotSameAs(loadingContainer.span());

		// Containment nesting: element -> feature -> element
		SpanEvent.Started settingElements = single(events, "Setting elements");
		assertThat(settingElements.attributes().get(DslTelemetry.FEATURE_KIND)).isEqualTo("containment");
		assertThat(settingElements.attributes().get(DslTelemetry.LINE)).isEqualTo(2L);
		assertThat(settingElements.span().getParent()).isSameAs(loadingContainer.span());
		assertThat(loadingNested.span().getParent()).isSameAs(settingElements.span());

		// Attributes
		SpanEvent.Started settingName = atLine(events, "Setting name", 3);
		assertThat(settingName.attributes().get(DslTelemetry.FEATURE_KIND)).isEqualTo("attribute");
		assertThat(settingName.attributes().get(DslTelemetry.FEATURE_CLASS)).isEqualTo(CORE_NS_URI + "#ModelElement");
		assertThat(settingName.span().getParent()).isSameAs(loadingNested.span());
		assertThat(atLine(events, "Setting name", 9).span().getParent()).isSameAs(loadingRoot.span());
		SpanEvent.Started settingOwner = single(events, "Setting owner");
		assertThat(settingOwner.attributes().get(DslTelemetry.FEATURE_CLASS)).isEqualTo(GOVERNANCE_NS_URI + "#Governed");
		assertThat(settingOwner.attributes().get(DslTelemetry.LINE)).isEqualTo(4L);

		// A non-containment reference, resolved after the script with the line it was authored on
		SpanEvent.Started settingPrimary = single(events, "Setting primary");
		assertThat(settingPrimary.attributes().get(DslTelemetry.FEATURE_KIND)).isEqualTo("reference");
		assertThat(settingPrimary.attributes().get(DslTelemetry.LINE)).isEqualTo(6L);
		assertThat(attributeSet(events, settingPrimary.span(), DslTelemetry.DEFERRED)).isEqualTo(true);
		SpanEvent.Started resolvingReferences = single(events, "Resolving references");
		assertThat(resolvingReferences.attributes().get(DslTelemetry.REFERENCES)).isEqualTo(1L);
		SpanEvent.Started resolvingPrimary = single(events, "Resolving primary");
		assertThat(resolvingPrimary.attributes().get(DslTelemetry.LINE)).isEqualTo(6L);
		assertThat(resolvingPrimary.span().getParent()).isSameAs(resolvingReferences.span());

		// Handler spans
		SpanEvent.Started evaluating = single(events, "Evaluating script");
		assertThat(evaluating.attributes().get(Telemetry.RESOURCE_URI)).isEqualTo(uri);
		assertThat(attributeSet(events, evaluating.span(), Telemetry.RESOURCE_CONTENTS)).isEqualTo(2L);
		assertThat(loadingContainer.span().isWithin(evaluating.span())).isTrue();
		assertThat(resolvingReferences.span().getParent()).isSameAs(evaluating.span());
		single(events, "Compiling script");

		// Locations, never values
		assertThat(events).allSatisfy(event -> {
			if (event instanceof SpanEvent.Started s) {
				s.attributes().forEach((k, v) -> assertThat(String.valueOf(v)).as(k.getKey()).doesNotContain("confidential"));
				assertThat(s.name()).doesNotContain("confidential");
			} else if (event instanceof SpanEvent.AttributeSet a) {
				assertThat(String.valueOf(a.value())).as(a.key().getKey()).doesNotContain("confidential");
			}
		});
	}

	@Test
	public void testFailureLine() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = new ResourceImpl(URI.createURI("test:failure.groovy"));
		resourceSet.getResources().add(resource);
		DslResourceContentsHandler handler = new DslResourceContentsHandler(
				resource,
				new CompiledScriptResourceContentsHandler(resource),
				corePackage,
				governancePackage);

		String script = """
				container {
				    primary "elements[name='missing']"
				}
				""";
		assertThatThrownBy(() -> handler.load(new ByteArrayInputStream(script.getBytes(StandardCharsets.UTF_8)), Map.of()))
			.isInstanceOf(IOException.class)
			.hasMessageStartingWith("test:failure.groovy:2: ");
	}

}
