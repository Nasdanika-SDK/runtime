package org.nasdanika.sdk.runtime.models.typescript.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumMember;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Package;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveType;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Property;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;
import org.nasdanika.sdk.runtime.models.typescript.generator.Generator;

/**
 * Import management, for the TypeScript and React Models book: a module whose imports are
 * computed from the references in it, compared with a reviewed file.
 */
public class ImportManagementTests {

	private static final TypescriptFactory TS = TypescriptFactory.eINSTANCE;

	private static final Path EXPECTED = Path.of(
			"src/test/resources/org/nasdanika/sdk/runtime/models/typescript/tests/book");

	@Test
	public void imports() throws IOException {
		// tag::package[]
		Package bank = TS.createPackage();
		bank.setName("bank");
		bank.setPackageName("@example/bank");
		bank.setVersion("1.0.0");
		bank.getDependencies().add("decimal.js@^10.4.3");                  // <1>

		Module common = module(bank, "model/common");
		EnumDeclaration currency = TS.createEnumDeclaration();
		currency.setName("Currency");
		currency.setExported(true);
		currency.getMembers().add(member("USD"));
		currency.getMembers().add(member("EUR"));
		common.getDeclarations().add(currency);
		InterfaceDeclaration money = type(common, "Money");
		property(money, "amount", external("Decimal", "decimal.js"));      // <2>
		property(money, "currency", named(currency));

		Module model = module(bank, "model/bank");
		InterfaceDeclaration account = type(model, "Account");
		property(account, "id", primitive(PrimitiveType.STRING));
		property(account, "balance", named(money));
		ClassDeclaration base = TS.createClassDeclaration();
		base.setName("AbstractAccount");
		base.setExported(true);
		base.setAbstract(true);
		base.getInterfaces().add(named(account));
		model.getDeclarations().add(base);

		Module legacy = module(bank, "model/legacy");
		InterfaceDeclaration legacyAccount = type(legacy, "Account");         // <3>
		property(legacyAccount, "number", primitive(PrimitiveType.STRING));
		// end::package[]

		// tag::service[]
		Module service = module(bank, "service/accounts");
		FunctionDeclaration open = TS.createFunctionDeclaration();
		open.setName("open");
		open.setExported(true);
		Parameter id = TS.createParameter();
		id.setName("id");
		id.setType(primitive(PrimitiveType.STRING));
		open.getParameters().add(id);
		open.setReturnType(named(account));                                // <1>
		CodeBlock body = TS.createCodeBlock();
		body.setText("""
				const opened = new CheckingAccount();
				console.log(`Opened ${id} in ${Currency.USD}`);
				return opened;""");
		body.getReferences().add(named(currency));                         // <2>
		open.setBody(body);
		service.getDeclarations().add(open);

		ClassDeclaration checking = TS.createClassDeclaration();
		checking.setName("CheckingAccount");
		checking.setExported(true);
		checking.setSuperClass(named(base));                               // <3>
		Property migrated = TS.createProperty();
		migrated.setName("migratedFrom");
		migrated.setOptional(true);
		migrated.setType(named(legacyAccount));                            // <4>
		checking.getMembers().add(migrated);
		service.getDeclarations().add(checking);

		String generated = new Generator().generate(service);
		// end::service[]

		// The actual output, to review a changed expectation against
		Path actual = Path.of("target", "book-actual", "accounts.ts");
		Files.createDirectories(actual.getParent());
		Files.writeString(actual, generated);
		assertThat(generated.replace("\r\n", "\n"))
			.isEqualTo(Files.readString(EXPECTED.resolve("accounts.ts")).replace("\r\n", "\n"));
		assertThat(new Generator().generatePackageJson(bank)).contains("\"decimal.js\": \"^10.4.3\"");
	}

	private static Module module(Package tsPackage, String path) {
		Module ret = TS.createModule();
		ret.setName(path.substring(path.lastIndexOf('/') + 1));
		ret.setPath(path);
		tsPackage.getModules().add(ret);
		return ret;
	}

	private static InterfaceDeclaration type(Module module, String name) {
		InterfaceDeclaration ret = TS.createInterfaceDeclaration();
		ret.setName(name);
		ret.setExported(true);
		module.getDeclarations().add(ret);
		return ret;
	}

	private static void property(InterfaceDeclaration owner, String name, TypeReference type) {
		Property ret = TS.createProperty();
		ret.setName(name);
		ret.setType(type);
		owner.getMembers().add(ret);
	}

	private static EnumMember member(String name) {
		EnumMember ret = TS.createEnumMember();
		ret.setName(name);
		ret.setValue(name);
		return ret;
	}

	private static PrimitiveTypeReference primitive(PrimitiveType type) {
		PrimitiveTypeReference ret = TS.createPrimitiveTypeReference();
		ret.setName(type.getLiteral());
		ret.setPrimitiveType(type);
		return ret;
	}

	/**
	 * A reference to a declaration of the model: the import resolver follows the target.
	 */
	private static NamedTypeReference named(Declaration target) {
		NamedTypeReference ret = TS.createNamedTypeReference();
		ret.setName(target.getName());
		ret.setTarget(target);
		return ret;
	}

	/**
	 * A type of a package the model does not own, named by its module specifier.
	 */
	private static NamedTypeReference external(String name, String moduleSpecifier) {
		NamedTypeReference ret = TS.createNamedTypeReference();
		ret.setName(name);
		ret.setQualifiedName(name);
		ret.setModuleSpecifier(moduleSpecifier);
		return ret;
	}

}
