package org.nasdanika.sdk.runtime.models.meta.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;
import org.nasdanika.sdk.runtime.models.meta.Annotation;
import org.nasdanika.sdk.runtime.models.meta.Attribute;
import org.nasdanika.sdk.runtime.models.meta.Class;
import org.nasdanika.sdk.runtime.models.meta.ClassifierReference;
import org.nasdanika.sdk.runtime.models.meta.DataType;
import org.nasdanika.sdk.runtime.models.meta.Enum;
import org.nasdanika.sdk.runtime.models.meta.IntersectionTypeReference;
import org.nasdanika.sdk.runtime.models.meta.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Operation;
import org.nasdanika.sdk.runtime.models.meta.Package;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveKind;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Reference;
import org.nasdanika.sdk.runtime.models.meta.TypeParameterReference;
import org.nasdanika.sdk.runtime.models.meta.UnionTypeReference;
import org.nasdanika.sdk.runtime.models.meta.WildcardTypeReference;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaDiagnostic;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaReader;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaResource;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaResourceFactory;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaWriter;

/**
 * The text syntax: what the reader makes of each construct of the grammar, what the writer makes
 * of the result, and what is reported when the text is wrong.
 */
public class MetaTests {

	/**
	 * The example in the header of Meta.g4, with the Error it throws declared.
	 */
	private static final String SHOP = """
			/** Orders placed in the shop. Documentation is Markdown. */
			package shop namespace "https://example.org/shop" prefix "shop" version "1.0.0"

			import "https://example.org/party" as party
			import "https://example.org/role" as role
			import "https://runtime.sdk.nasdanika.org/models/occupancy" as occupancy
			annotation "urn:org.nasdanika" as Nasdanika

			type Instant as dateTime wraps java.time.Instant

			enum Status { DRAFT, PLACED as "placed" = 1, SHIPPED as "shipped" = 2 }

			abstract class Entity { id string code }

			@Nasdanika(icon = "bi-cart")
			@role.Assignment { role: owner, party: "sales-team" }
			class Order extends Entity {
			    @occupancy.Presence { jurisdiction: "CA", from: "2027-01-01" }
			    string provinceCode
			    Instant placedAt
			    Status status = "DRAFT"
			    refers party.Customer customer
			    contains OrderLine[*] lines opposite order
			    derived readonly number total
			    op number discount(number rate = "0.1", string... codes) throws Error
			}

			class OrderLine {
			    refers Order order opposite lines
			    string | number sku
			    `Record<string, unknown>` extras
			}

			class Error { string message }
			""";

	private static Resource load(String text) throws IOException {
		Resource resource = new MetaResourceFactory().createResource(URI.createURI("test.nmeta"));
		resource.load(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)), null);
		return resource;
	}

	private static Package read(String text) throws IOException {
		return (Package) load(text).getContents().getFirst();
	}

	@Test
	public void shop() throws IOException {
		Resource resource = load(SHOP);
		Package shop = (Package) resource.getContents().getFirst();
		assertThat(shop.getName()).isEqualTo("shop");
		assertThat(shop.getNamespace()).isEqualTo("https://example.org/shop");
		assertThat(shop.getPrefix()).isEqualTo("shop");
		assertThat(shop.getVersion()).isEqualTo("1.0.0");
		assertThat(shop.getDocumentation()).isEqualTo("Orders placed in the shop. Documentation is Markdown.");

		DataType instant = (DataType) shop.getClassifiers().get(0);
		assertThat(instant.getRepresentation()).isEqualTo(PrimitiveKind.DATE_TIME);
		assertThat(instant.getSourceType()).isEqualTo("java.time.Instant");

		Enum status = (Enum) shop.getClassifiers().get(1);
		assertThat(status.getLiterals()).extracting(l -> l.getName() + "/" + l.getValue() + "/" + l.getOrdinal())
			.containsExactly("DRAFT/null/0", "PLACED/placed/1", "SHIPPED/shipped/2");

		Class entity = (Class) shop.getClassifiers().get(2);
		assertThat(entity.isAbstract()).isTrue();
		assertThat(((Attribute) entity.getFeatures().getFirst()).isIdentifying()).isTrue();

		Class order = (Class) shop.getClassifiers().get(3);
		assertThat(((ClassifierReference) order.getSuperTypes().getFirst()).getTarget()).isSameAs(entity);
		assertThat(order.getAnnotations()).hasSize(2);
		Annotation nasdanika = order.getAnnotations().get(0);
		assertThat(nasdanika.getSource()).isEqualTo("urn:org.nasdanika");
		assertThat(nasdanika.getDetails().get("icon")).isEqualTo("bi-cart");
		Annotation assignment = order.getAnnotations().get(1);
		assertThat(assignment.getSource()).isEqualTo("https://example.org/role#Assignment");
		assertThat(assignment.getName()).isEqualTo("Assignment");
		assertThat(assignment.getDetails().get("role")).isEqualTo("owner");
		assertThat(assignment.getDetails().get("party")).isEqualTo("sales-team");

		Attribute statusFeature = (Attribute) order.getFeatures().get(2);
		assertThat(statusFeature.getDefaultValue()).isEqualTo("DRAFT");
		assertThat(((ClassifierReference) statusFeature.getType()).getTarget()).isSameAs(status);

		Reference customer = (Reference) order.getFeatures().get(3);
		assertThat(customer.isContainment()).isFalse();
		ClassifierReference customerType = (ClassifierReference) customer.getType();
		assertThat(customerType.getTarget()).isNull();
		assertThat(customerType.getNamespace()).isEqualTo("https://example.org/party");
		assertThat(customerType.getClassifierName()).isEqualTo("Customer");

		Reference lines = (Reference) order.getFeatures().get(4);
		Class orderLine = (Class) shop.getClassifiers().get(4);
		assertThat(lines.isContainment()).isTrue();
		assertThat(lines.getUpperBound()).isEqualTo(-1);
		assertThat(lines.getOpposite()).isSameAs(orderLine.getFeatures().getFirst());
		assertThat(((Reference) orderLine.getFeatures().getFirst()).getOpposite()).isSameAs(lines);

		Attribute total = (Attribute) order.getFeatures().get(5);
		assertThat(total.isDerived()).isTrue();
		assertThat(total.isReadonly()).isTrue();

		Operation discount = order.getOperations().getFirst();
		assertThat(discount.getParameters()).extracting(p -> p.getName() + "=" + p.getDefaultValue() + (p.isVariadic() ? "..." : ""))
			.containsExactly("rate=0.1", "codes=null...");
		assertThat(((ClassifierReference) discount.getExceptions().getFirst()).getTarget().getName()).isEqualTo("Error");

		assertThat(orderLine.getFeatures().get(1).getType()).isInstanceOf(UnionTypeReference.class);
		assertThat(((OpaqueTypeReference) orderLine.getFeatures().get(2).getType()).getText()).isEqualTo("Record<string, unknown>");

		// The facet types are not available
		assertThat(resource.getErrors()).isEmpty();
		assertThat(resource.getWarnings()).extracting(d -> d.getLine() + ": " + d.getMessage()).containsExactly(
				"16: Facet type role.Assignment is not available, its properties are not checked",
				"18: Facet type occupancy.Presence is not available, its properties are not checked");

		// Provenance
		assertThat(order.getMarkers().getFirst().getLocation()).isEqualTo("test.nmeta");
		assertThat(order.getMarkers().getFirst().getPosition()).isEqualTo("15:1");
	}

	@Test
	public void writtenTextReadsBackTheSame() throws IOException {
		String written = MetaWriter.write(read(SHOP));
		assertThat(MetaWriter.write(read(written))).isEqualTo(written);
		assertThat(written)
			.contains("import \"https://example.org/role\" as role")
			.contains("annotation \"urn:org.nasdanika\" as Nasdanika")
			.contains("@role.Assignment { role: \"owner\", party: \"sales-team\" }")
			.contains("    contains OrderLine[*] lines opposite order\n")
			.contains("    op number discount(number rate = 0.1, string... codes) throws Error\n")
			.contains("    PLACED as \"placed\",\n");
	}

	@Test
	public void types() throws IOException {
		Package types = read("""
				package types
				class Repository<T extends Comparable<T> & Named, K = string> {
				    contains T[*] items
				    refers Map<K, ? extends T> index
				    refers Map<K, ? super T> sink
				    refers Map<K, ?> any
				    A & B | C mixed
				    (A | B) & C grouped
				    op <R> R[+] map(`(item: T) => R` mapper) throws Failure
				}
				class Comparable<T> {}
				class Named {}
				class Map<K, V> {}
				class A {} class B {} class C {} class Failure {}
				""");
		Class repository = (Class) types.getClassifiers().getFirst();
		assertThat(repository.getTypeParameters()).extracting(t -> t.getName()).containsExactly("T", "K");
		IntersectionTypeReference bound = (IntersectionTypeReference) repository.getTypeParameters().getFirst().getBound();
		ClassifierReference comparable = (ClassifierReference) bound.getTypes().getFirst();
		assertThat(((TypeParameterReference) comparable.getTypeArguments().getFirst()).getTarget())
			.isSameAs(repository.getTypeParameters().getFirst());
		assertThat(((PrimitiveTypeReference) repository.getTypeParameters().get(1).getDefault()).getKind()).isEqualTo(PrimitiveKind.STRING);

		ClassifierReference index = (ClassifierReference) repository.getFeatures().get(1).getType();
		assertThat(((WildcardTypeReference) index.getTypeArguments().get(1)).getUpperBound()).isInstanceOf(TypeParameterReference.class);
		ClassifierReference sink = (ClassifierReference) repository.getFeatures().get(2).getType();
		assertThat(((WildcardTypeReference) sink.getTypeArguments().get(1)).getLowerBound()).isInstanceOf(TypeParameterReference.class);

		// & binds tighter than |
		UnionTypeReference mixed = (UnionTypeReference) repository.getFeatures().get(4).getType();
		assertThat(mixed.getTypes().getFirst()).isInstanceOf(IntersectionTypeReference.class);
		IntersectionTypeReference grouped = (IntersectionTypeReference) repository.getFeatures().get(5).getType();
		assertThat(grouped.getTypes().getFirst()).isInstanceOf(UnionTypeReference.class);

		Operation map = repository.getOperations().getFirst();
		assertThat(map.getLowerBound()).isEqualTo(1);
		assertThat(map.getUpperBound()).isEqualTo(-1);
		assertThat(((TypeParameterReference) map.getType()).getTarget()).isSameAs(map.getTypeParameters().getFirst());

		String written = MetaWriter.write(types);
		assertThat(written)
			.contains("class Repository<T extends Comparable<T> & Named, K = string> {")
			.contains("    refers Map<K, ? extends T> index\n")
			.contains("    A & B | C mixed\n")
			.contains("    (A | B) & C grouped\n")
			.contains("    op <R> R[+] map(`(item: T) => R` mapper) throws Failure\n");
		assertThat(MetaWriter.write(read(written))).isEqualTo(written);
	}

	@Test
	public void multiplicities() throws IOException {
		Class type = (Class) read("""
				package m
				class M { string a string[] b string[*] c string[?] d string[+] e string[2] f string[1..3] g string[2..*] h }
				""").getClassifiers().getFirst();
		assertThat(type.getFeatures()).extracting(f -> f.getName() + f.getLowerBound() + ".." + f.getUpperBound()).containsExactly(
				"a0..1", "b0..-1", "c0..-1", "d0..1", "e1..-1", "f2..2", "g1..3", "h2..-1");
	}

	@Test
	public void textBlocksAndDocumentation() throws IOException {
		Package pkg = read("""
				package docs

				/**
				 * A definition.
				 *
				 * - with a list
				 */
				@"https://example.org/schema"(definition = \"""json
				    {
				      "type": "object"
				    }
				    \""", 'single' = 'quoted\\tescape')
				class Documented {
				    /** One line. */
				    string name = \"""
				        line one
				          line two\"""
				}
				""");
		Class documented = (Class) pkg.getClassifiers().getFirst();
		assertThat(documented.getDocumentation()).isEqualTo("A definition.\n\n- with a list");
		Annotation schema = documented.getAnnotations().getFirst();
		assertThat(schema.getSource()).isEqualTo("https://example.org/schema");
		assertThat(schema.getDetails().get("definition")).isEqualTo("{\n  \"type\": \"object\"\n}\n");
		assertThat(schema.getDetails().get("single")).isEqualTo("quoted\tescape");
		Attribute name = (Attribute) documented.getFeatures().getFirst();
		assertThat(name.getDocumentation()).isEqualTo("One line.");
		assertThat(name.getDefaultValue()).isEqualTo("line one\n  line two");

		String written = MetaWriter.write(pkg);
		assertThat(written).contains("""
				/**
				 * A definition.
				 *
				 * - with a list
				 */
				@Schema(definition = "{\\n  \\"type\\": \\"object\\"\\n}\\n", single = "quoted\\tescape")
				class Documented {""");
		assertThat(MetaWriter.write(read(written))).isEqualTo(written);
	}

	@Test
	public void keywordsAsNames() throws IOException {
		Package pkg = read("""
				package keywords
				class ^Type {
				    string type
				    string id
				    string ^class
				    boolean derived
				    op void version(string namespace)
				}
				enum Kind { string, any }
				""");
		Class type = (Class) pkg.getClassifiers().getFirst();
		assertThat(type.getName()).isEqualTo("Type");
		assertThat(type.getFeatures()).extracting(f -> f.getName()).containsExactly("type", "id", "class", "derived");
		String written = MetaWriter.write(pkg);
		assertThat(written).contains("    string ^class\n");
		assertThat(MetaWriter.write(read(written))).isEqualTo(written);
	}

	@Test
	public void facets() throws IOException {
		Resource resource = load("""
				package facets namespace "https://example.org/facets"

				class Assignment {
				    string role
				    string[*] parties
				    Period period
				}

				class Period { date from date to }

				@Assignment {
				    role: owner
				    parties: ["sales", "finance"]
				    period: { from: "2027-01-01", to: null }
				    budget: 1000
				}
				class Order {}
				""");
		Package pkg = (Package) resource.getContents().getFirst();
		Annotation assignment = ((Class) pkg.getClassifiers().get(2)).getAnnotations().getFirst();
		assertThat(assignment.getSource()).isEqualTo("https://example.org/facets#Assignment");
		assertThat(assignment.getDetails().get("role")).isEqualTo("owner");
		assertThat(assignment.getDetails().get("budget")).isEqualTo("1000");

		Annotation parties = assignment.getAnnotations().get(0);
		assertThat(parties.getSource()).isEqualTo(MetaReader.LIST);
		assertThat(parties.getName()).isEqualTo("parties");
		assertThat(parties.getDetails().get("1")).isEqualTo("finance");

		// The type of an untyped object comes from the property
		Annotation period = assignment.getAnnotations().get(1);
		assertThat(period.getSource()).isEqualTo("https://example.org/facets#Period");
		assertThat(period.getDetails().containsKey("to")).isTrue();
		assertThat(period.getDetails().get("to")).isNull();

		// The facet's type is available, so its properties are checked
		assertThat(resource.getWarnings()).extracting(d -> d.getLine() + ": " + d.getMessage())
			.containsExactly("15: Assignment has no feature budget");

		String written = MetaWriter.write(pkg);
		assertThat(written).contains("""
				@Assignment {
				    role: "owner"
				    budget: 1000
				    parties: [ "sales", "finance" ]
				    period: Period { from: "2027-01-01", to: null }
				}
				class Order {}
				""");
		assertThat(MetaWriter.write(read(written))).isEqualTo(written);
	}

	@Test
	public void syntaxErrors() {
		Resource resource = new MetaResourceFactory().createResource(URI.createURI("broken.nmeta"));
		assertThatThrownBy(() -> resource.load(new ByteArrayInputStream("""
				package broken
				class Broken {
				    string[ name
				}
				""".getBytes(StandardCharsets.UTF_8)), null))
			.isInstanceOf(Resource.IOWrappedException.class)
			.hasCauseInstanceOf(MetaDiagnostic.class);
		assertThat(resource.getErrors()).isNotEmpty();
		assertThat(resource.getErrors().getFirst().getLine()).isEqualTo(3);
		assertThat(resource.getErrors().getFirst().getLocation()).isEqualTo("broken.nmeta");
		assertThat(resource.getContents()).isEmpty();
	}

	@Test
	public void resolutionErrors() {
		Resource resource = new MetaResourceFactory().createResource(URI.createURI("unresolved.nmeta"));
		assertThatThrownBy(() -> resource.load(new ByteArrayInputStream("""
				package unresolved
				@Unknown(key = "value")
				class Order {
				    refers Customer customer
				    refers other.Thing thing
				    refers Order parent opposite children
				    contains Order[*] lines keys number
				    id refers Order self
				}
				""".getBytes(StandardCharsets.UTF_8)), null))
			.isInstanceOf(Resource.IOWrappedException.class);
		assertThat(resource.getErrors()).extracting(d -> d.getLine() + ":" + d.getColumn() + ": " + d.getMessage()).containsExactlyInAnyOrder(
				"2:1: Unknown annotation alias Unknown, declare it with annotation \"<source URI>\" as Unknown",
				"4:12: Unknown type Customer",
				"5:12: Unknown import alias other in other.Thing",
				"6:34: Order has no reference children to be the opposite of parent",
				"7:34: Order has no attribute number to be a key of lines",
				"8:5: A reference cannot be id: self");
		// What could be read is kept
		assertThat(resource.getContents()).hasSize(1);
	}

	@Test
	public void namedFragments() throws IOException {
		Resource resource = load(SHOP);
		Package shop = (Package) resource.getContents().getFirst();
		Class order = (Class) shop.getClassifiers().get(3);
		assertThat(resource.getURIFragment(order)).isEqualTo("//Order");
		assertThat(resource.getURIFragment(order.getFeatures().get(4))).isEqualTo("//Order/lines");
		assertThat(resource.getURIFragment(((Enum) shop.getClassifiers().get(1)).getLiterals().get(1))).isEqualTo("//Status/PLACED");
		assertThat(resource.getEObject("//Order/lines")).isSameAs(order.getFeatures().get(4));
		assertThat(resource.getEObject(resource.getURIFragment(order.getOperations().getFirst())))
			.isSameAs(order.getOperations().getFirst());
	}

	@Test
	public void contributedFromTheModulePath() {
		ResourceSet resourceSet = new ResourceSetImpl();
		ResourceSetContributor.configure(resourceSet);
		assertThat(resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().get(MetaResource.EXTENSION))
			.isInstanceOf(MetaResourceFactory.class);
	}

}
