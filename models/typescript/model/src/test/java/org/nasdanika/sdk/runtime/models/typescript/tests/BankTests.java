package org.nasdanika.sdk.runtime.models.typescript.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.typescript.Accessor;
import org.nasdanika.sdk.runtime.models.typescript.AccessorKind;
import org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Constructor;
import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumMember;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.FunctionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Import;
import org.nasdanika.sdk.runtime.models.typescript.ImportBinding;
import org.nasdanika.sdk.runtime.models.typescript.ImportKind;
import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.IntersectionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.LiteralKind;
import org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Method;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.OpaqueMember;
import org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Package;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveType;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Property;
import org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.TypeLiteralReference;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;
import org.nasdanika.sdk.runtime.models.typescript.UnionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.VariableKind;
import org.nasdanika.sdk.runtime.models.typescript.Visibility;
import org.nasdanika.sdk.runtime.models.typescript.generator.Generator;
import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.GenericVolume;
import org.nasdanika.sdk.runtime.volume.Volume;

/**
 * Builds a bank package - Bank, Customer, Account, Statement, Transaction -
 * programmatically, exercising every construct the model can express, and
 * generates it with the {@link Generator}.
 * <p>
 * The generated package is written to <code>model/target/bank</code>. It is a
 * real npm package: run <code>npm install</code> and <code>npm run build</code>
 * there and <code>tsc</code> type checks the generator's output. The hand
 * written <code>test-project</code> in the repository root is the same language
 * surface written by hand, with a readme explaining what each construct means.
 */
public class BankTests {

	private static final TypescriptFactory FACTORY = TypescriptFactory.eINSTANCE;

	private static final Path OUTPUT_DIR = Path.of("target", "bank");

	@Test
	public void testGenerateBankPackage() throws Exception {
		Package bankPackage = buildBankPackage();

		// The package is written to disk so it can actually be compiled. Only src
		// is wiped. node_modules and dist are left in place, so an `npm install`
		// done here to verify the output survives the next build.
		deleteRecursively(OUTPUT_DIR.resolve("src"));
		Files.createDirectories(OUTPUT_DIR);
		GenericVolume<String> volume = textVolume(OUTPUT_DIR);
		new Generator().generate(bankPackage, volume);

		// Read back through the volume. The package root may also hold what npm
		// put there, so only the generated files at the root are picked up.
		Map<String, String> generated = new LinkedHashMap<>();
		generated.put("package.json", volume.content("package.json"));
		generated.put("tsconfig.json", volume.content("tsconfig.json"));
		readTree(volume, "src", generated);

		// --- Package layout -------------------------------------------------
		assertThat(generated).containsOnlyKeys(
				"package.json",
				"tsconfig.json",
				"src/index.ts",
				"src/config.ts",
				"src/polyfills.ts",
				"src/model/common.ts",
				"src/model/bank.ts",
				"src/model/legacy.ts",
				"src/service/accounts.ts",
				// A declarationOnly module lands as .d.ts rather than .ts
				"src/types/ambient.d.ts");

		String packageJson = generated.get("package.json");
		assertThat(packageJson).contains("\"name\": \"@nasdanika-demo/bank\"");
		assertThat(packageJson).contains("\"type\": \"module\"");
		assertThat(packageJson).contains("\"decimal.js\": \"^10.4.3\"");
		assertThat(packageJson).contains("\"main\": \"./dist/index.js\"");

		// --- Import management ----------------------------------------------
		String accounts = generated.get("src/service/accounts.ts");

		// A relative specifier carries the .js extension NodeNext requires, even
		// though the file being imported is a .ts.
		assertThat(accounts).contains("from \"../model/bank.js\"");

		// AbstractAccount is the superclass of CheckingAccount, so it is evaluated at
		// runtime; TransactionKind and Currency are read inside code blocks. None of
		// the three may be imported as a type.
		assertThat(accounts).contains("import { AbstractAccount, TransactionKind } from \"../model/bank.js\";");
		assertThat(accounts).contains("import { Currency } from \"../model/common.js\";");

		// Everything used only in a type position is erasable, and the same specifier
		// therefore yields two statements rather than one value import.
		assertThat(accounts).contains(
				"import type { Account, Transaction, Customer, Statement } from \"../model/bank.js\";");
		assertThat(accounts).contains(
				"import type { Money, Repository, Page, Result } from \"../model/common.js\";");

		// The same simple name from two modules: the first keeps it, the second is
		// aliased rather than silently shadowing it.
		assertThat(accounts).contains("import type { Transaction as Transaction$2 } from \"../model/legacy.js\";");
		assertThat(accounts).contains("original?: Transaction;");
		assertThat(accounts).contains("legacy?: Transaction$2;");

		// A type from a package rather than from this model resolves to a bare
		// specifier, and that package appears in package.json dependencies.
		assertThat(accounts).contains("import type { Decimal } from \"decimal.js\";");

		// Authored imports survive as written. The resolver cannot infer a side effect
		// import, because by definition nothing references anything in it.
		assertThat(accounts).contains("import \"../polyfills.js\";");
		assertThat(accounts).contains("import * as legacyModel from \"../model/legacy.js\";");
		assertThat(accounts).contains("import bankDefaults, { REGION } from \"../config.js\";");

		// --- Declarations ---------------------------------------------------
		String common = generated.get("src/model/common.ts");
		assertThat(common).contains("export interface Identifiable<ID extends string | number = string> {");
		assertThat(common).contains("readonly id: ID;");
		assertThat(common).contains("export type Result<T, E = Error> = { ok: true; value: T } | { ok: false; error: E };");
		assertThat(common).contains("export type Predicate<T> = (value: T, index?: number) => boolean;");
		assertThat(common).contains("export type DeepReadonly<T> = { readonly [K in keyof T]: DeepReadonly<T[K]> };");
		assertThat(common).contains("[key: string]: T;");
		assertThat(common).contains("export declare const VERSION: string;");
		assertThat(common).contains("findById(id: ID): Promise<T | undefined>;");
		assertThat(common).contains("export enum Currency {");
		assertThat(common).contains("USD = \"USD\",");
		// An enum member with no value takes the next implicit ordinal.
		assertThat(common).contains("export enum StatementFormat {");
		assertThat(common).contains("  PDF,");

		String bank = generated.get("src/model/bank.ts");
		assertThat(bank).contains("export interface Statement extends Identifiable {");
		assertThat(bank).contains("period: \"monthly\" | \"quarterly\";");
		assertThat(bank).contains("transactions: Transaction[];");
		assertThat(bank).contains("REVERSAL = \"reversal\",");
		assertThat(bank).contains("export abstract class AbstractAccount implements Account {");
		assertThat(bank).contains("static readonly MINIMUM_BALANCE: number = 0;");
		assertThat(bank).contains("protected readonly ledger: Transaction[] = [];");
		assertThat(bank).contains("private cachedBalance?: Money;");
		assertThat(bank).contains("...history: Transaction[]");
		assertThat(bank).contains("get balance(): Money {");
		assertThat(bank).contains("set balance(value: Money) {");
		assertThat(bank).contains("abstract describe(): string;");
		assertThat(bank).contains("async post(transaction: Transaction): Promise<void> {");
		assertThat(bank).contains("*entries(): IterableIterator<Transaction> {");

		assertThat(accounts).contains("export class CheckingAccount extends AbstractAccount implements Account {");
		assertThat(accounts).contains("export class AccountService implements Repository<Account> {");
		assertThat(accounts).contains("latestStatement<A extends Account>(account: A): Statement | undefined {");
		assertThat(accounts).contains("export async function transfer(request: TransferRequest): Promise<Result<Transaction>> {");
		assertThat(accounts).contains("export function* iterate<T>(items: T[]): Generator<T> {");
		assertThat(accounts).contains("export const formatMoney = (amount: Money, locale: string = \"en-US\"): string => {");
		assertThat(accounts).contains("export let auditCursor: string | null = null;");
		assertThat(accounts).contains("export const DEFAULT_CURRENCY = Currency.USD;");
		assertThat(accounts).contains("export type AuditedAccount = Account & { auditedAt: string };");
		assertThat(accounts).contains("async findAll(page: number = 0): Promise<Page<Account>> {");

		// JSDoc comes from core model documentation.
		assertThat(accounts).contains("* Moves money between two accounts.");

		// --- .d.ts and footers ----------------------------------------------
		String ambient = generated.get("src/types/ambient.d.ts");
		// A .d.ts is an ambient context already, so `declare` is not repeated, and a
		// declaration file carries no bodies.
		assertThat(ambient).contains("export interface BankConfig {");
		assertThat(ambient).contains("validate(): boolean;");
		assertThat(ambient).doesNotContain("declare ");
		assertThat(ambient).doesNotContain("return true;");

		String index = generated.get("src/index.ts");
		assertThat(index).contains("export * from \"./model/common.js\";");

		// --- On disk -------------------------------------------------------
		assertThat(OUTPUT_DIR.resolve("src/model/bank.ts")).exists();
		assertThat(OUTPUT_DIR.resolve("src/types/ambient.d.ts")).exists();
		assertThat(OUTPUT_DIR.resolve("package.json")).exists();
	}

	/**
	 * Relative specifier arithmetic, which is the part of import management that is
	 * easiest to get subtly wrong.
	 */
	@Test
	public void testRelativeSpecifiers() {
		Package tsPackage = FACTORY.createPackage();
		tsPackage.setPackageName("@test/specifiers");

		Module from = module(tsPackage, "model/bank");
		Module sibling = module(tsPackage, "model/common");
		Module root = module(tsPackage, "index");
		Module deep = module(tsPackage, "service/internal/ledger");

		InterfaceDeclaration user = iface(from, "User");
		property(user, "a", named(iface(sibling, "Common")));
		property(user, "b", named(iface(root, "Root")));
		property(user, "c", named(iface(deep, "Ledger")));

		String generated = new Generator().generate(from);
		assertThat(generated).contains("from \"./common.js\";");
		assertThat(generated).contains("from \"../index.js\";");
		assertThat(generated).contains("from \"../service/internal/ledger.js\";");
	}

	/**
	 * A module in another package resolves to that package's bare specifier.
	 */
	@Test
	public void testCrossPackageSpecifiers() {
		Package provider = FACTORY.createPackage();
		provider.setPackageName("@test/provider");
		Module providerIndex = module(provider, "index");
		Module providerDeep = module(provider, "model/types");
		InterfaceDeclaration exported = iface(providerIndex, "Exported");
		InterfaceDeclaration deep = iface(providerDeep, "Deep");

		Package consumer = FACTORY.createPackage();
		consumer.setPackageName("@test/consumer");
		Module consumerModule = module(consumer, "index");
		InterfaceDeclaration user = iface(consumerModule, "User");
		property(user, "a", named(exported));
		property(user, "b", named(deep));

		String generated = new Generator().generate(consumerModule);
		assertThat(generated).contains("import type { Exported } from \"@test/provider\";");
		assertThat(generated).contains("import type { Deep } from \"@test/provider/model/types.js\";");
	}

	// ------------------------------------------------------------------------
	// The model
	// ------------------------------------------------------------------------

	private Package buildBankPackage() {
		Package tsPackage = FACTORY.createPackage();
		tsPackage.setName("bank");
		tsPackage.setPackageName("@nasdanika-demo/bank");
		tsPackage.setVersion("1.0.0");
		tsPackage.setDescription("Demo bank package generated from the Nasdanika TypeScript model");
		tsPackage.setLicense("EPL-2.0");
		tsPackage.setModuleType("module");
		// A specifier may carry its version; those which do not get the generator's
		// default.
		tsPackage.getDependencies().add("decimal.js@^10.4.3");

		Module common = commonModule(tsPackage);
		Module legacy = legacyModule(tsPackage);
		Module polyfills = polyfillsModule(tsPackage);
		Module config = configModule(tsPackage);
		Module bank = bankModule(tsPackage, common);
		accountsModule(tsPackage, common, bank, legacy, polyfills, config);
		ambientModule(tsPackage, common);
		indexModule(tsPackage);
		return tsPackage;
	}

	/**
	 * Reusable vocabulary: the generic types the rest of the package builds on.
	 */
	private Module commonModule(Package tsPackage) {
		Module module = module(tsPackage, "model/common");
		module.setHeader("// Generated by the Nasdanika TypeScript model. Do not edit.");
		module.setDocumentation("Shared vocabulary for the bank package.");

		// export enum Currency { USD = "USD", ... }
		EnumDeclaration currency = FACTORY.createEnumDeclaration();
		currency.setName("Currency");
		currency.setExported(true);
		currency.setDocumentation("ISO 4217 currency codes this demo cares about.");
		for (String code : List.of("USD", "EUR", "GBP")) {
			currency.getMembers().add(enumMember(code, "\"" + code + "\""));
		}
		module.getDeclarations().add(currency);

		// export enum StatementFormat { PDF, CSV, JSON }
		// No values: TypeScript assigns implicit ordinals. Only a numeric enum may
		// do this - a member of a string enum has to carry its own initializer.
		EnumDeclaration statementFormat = FACTORY.createEnumDeclaration();
		statementFormat.setName("StatementFormat");
		statementFormat.setExported(true);
		for (String format : List.of("PDF", "CSV", "JSON")) {
			statementFormat.getMembers().add(enumMember(format, null));
		}
		module.getDeclarations().add(statementFormat);

		// export interface Money { readonly amount: number; readonly currency: Currency }
		InterfaceDeclaration money = iface(module, "Money");
		money.setDocumentation("An amount in a currency. Never a bare number.");
		property(money, "amount", primitive(PrimitiveType.NUMBER)).setReadonly(true);
		property(money, "currency", named(currency)).setReadonly(true);

		// export interface Identifiable<ID extends string | number = string>
		InterfaceDeclaration identifiable = iface(module, "Identifiable");
		TypeParameter idParameter = typeParameter("ID");
		idParameter.setConstraint(union(primitive(PrimitiveType.STRING), primitive(PrimitiveType.NUMBER)));
		idParameter.setDefault(primitive(PrimitiveType.STRING));
		identifiable.getTypeParameters().add(idParameter);
		property(identifiable, "id", typeParameterReference("ID")).setReadonly(true);

		// export interface Page<T> { items: T[]; total: number; next?: string }
		InterfaceDeclaration page = iface(module, "Page");
		page.getTypeParameters().add(typeParameter("T"));
		property(page, "items", array(typeParameterReference("T")));
		property(page, "total", primitive(PrimitiveType.NUMBER));
		property(page, "next", primitive(PrimitiveType.STRING)).setOptional(true);

		// export type Result<T, E = Error> = { ok: true; value: T } | { ok: false; error: E }
		TypeAliasDeclaration result = FACTORY.createTypeAliasDeclaration();
		result.setName("Result");
		result.setExported(true);
		result.setDocumentation("Success or failure, without exceptions.");
		result.getTypeParameters().add(typeParameter("T"));
		TypeParameter errorParameter = typeParameter("E");
		errorParameter.setDefault(global("Error"));
		result.getTypeParameters().add(errorParameter);

		TypeLiteralReference ok = FACTORY.createTypeLiteralReference();
		ok.getMembers().add(propertyMember("ok", literal(LiteralKind.BOOLEAN, "true")));
		ok.getMembers().add(propertyMember("value", typeParameterReference("T")));
		TypeLiteralReference failure = FACTORY.createTypeLiteralReference();
		failure.getMembers().add(propertyMember("ok", literal(LiteralKind.BOOLEAN, "false")));
		failure.getMembers().add(propertyMember("error", typeParameterReference("E")));
		result.setType(union(ok, failure));
		module.getDeclarations().add(result);

		// export type Predicate<T> = (value: T, index?: number) => boolean
		TypeAliasDeclaration predicate = FACTORY.createTypeAliasDeclaration();
		predicate.setName("Predicate");
		predicate.setExported(true);
		predicate.getTypeParameters().add(typeParameter("T"));
		FunctionTypeReference predicateType = FACTORY.createFunctionTypeReference();
		predicateType.setName("predicate");
		predicateType.getParameters().add(parameter("value", typeParameterReference("T")));
		Parameter index = parameter("index", primitive(PrimitiveType.NUMBER));
		index.setOptional(true);
		predicateType.getParameters().add(index);
		predicateType.setReturnType(primitive(PrimitiveType.BOOLEAN));
		predicate.setType(predicateType);
		module.getDeclarations().add(predicate);

		// export type DeepReadonly<T> = { readonly [K in keyof T]: ... }
		// A mapped type is not worth a class, so it goes through the escape hatch.
		TypeAliasDeclaration deepReadonly = FACTORY.createTypeAliasDeclaration();
		deepReadonly.setName("DeepReadonly");
		deepReadonly.setExported(true);
		deepReadonly.setDocumentation("Mapped type, emitted verbatim through OpaqueTypeReference.");
		deepReadonly.getTypeParameters().add(typeParameter("T"));
		OpaqueTypeReference mapped = FACTORY.createOpaqueTypeReference();
		mapped.setName("mapped");
		mapped.setText("{ readonly [K in keyof T]: DeepReadonly<T[K]> }");
		deepReadonly.setType(mapped);
		module.getDeclarations().add(deepReadonly);

		// export interface Registry<T> { [key: string]: T }
		// An index signature is an OpaqueMember rather than a class per exotic form.
		InterfaceDeclaration registry = iface(module, "Registry");
		registry.getTypeParameters().add(typeParameter("T"));
		OpaqueMember indexSignature = FACTORY.createOpaqueMember();
		indexSignature.setName("indexSignature");
		indexSignature.setText("[key: string]: T;");
		registry.getMembers().add(indexSignature);

		// export interface Repository<T extends Identifiable<ID>, ID extends ... = string>
		InterfaceDeclaration repository = iface(module, "Repository");
		repository.setDocumentation("Read side of a collection of entities.");
		TypeParameter entity = typeParameter("T");
		NamedTypeReference identifiableOfId = named(identifiable);
		identifiableOfId.getTypeArguments().add(typeParameterReference("ID"));
		entity.setConstraint(identifiableOfId);
		repository.getTypeParameters().add(entity);
		TypeParameter repositoryId = typeParameter("ID");
		repositoryId.setConstraint(union(primitive(PrimitiveType.STRING), primitive(PrimitiveType.NUMBER)));
		repositoryId.setDefault(primitive(PrimitiveType.STRING));
		repository.getTypeParameters().add(repositoryId);

		Method findById = method(repository, "findById");
		findById.getParameters().add(parameter("id", typeParameterReference("ID")));
		findById.setReturnType(generic("Promise",
				union(typeParameterReference("T"), primitive(PrimitiveType.UNDEFINED))));

		Method findAll = method(repository, "findAll");
		Parameter pageNumber = parameter("page", primitive(PrimitiveType.NUMBER));
		pageNumber.setOptional(true);
		findAll.getParameters().add(pageNumber);
		NamedTypeReference pageOfT = named(page);
		pageOfT.getTypeArguments().add(typeParameterReference("T"));
		findAll.setReturnType(generic("Promise", pageOfT));

		// export declare const VERSION: string
		VariableDeclaration version = FACTORY.createVariableDeclaration();
		version.setName("VERSION");
		version.setExported(true);
		version.setAmbient(true);
		version.setVariableKind(VariableKind.CONST);
		version.setType(primitive(PrimitiveType.STRING));
		version.setDocumentation("Supplied by the build, declared here so consumers can see it.");
		module.getDeclarations().add(version);

		return module;
	}

	/**
	 * Exists so that the service module has two different types called Transaction
	 * to import, which is what forces an alias.
	 */
	private Module legacyModule(Package tsPackage) {
		Module module = module(tsPackage, "model/legacy");
		module.setDocumentation("Shapes from the system being replaced.");

		InterfaceDeclaration transaction = iface(module, "Transaction");
		transaction.setDocumentation("The mainframe record layout, kept for the migration window.");
		property(transaction, "id", primitive(PrimitiveType.STRING));
		property(transaction, "amt", primitive(PrimitiveType.NUMBER));
		property(transaction, "ccy", primitive(PrimitiveType.STRING));

		VariableDeclaration layoutVersion = FACTORY.createVariableDeclaration();
		layoutVersion.setName("LEGACY_LAYOUT_VERSION");
		layoutVersion.setExported(true);
		layoutVersion.setVariableKind(VariableKind.CONST);
		layoutVersion.setType(primitive(PrimitiveType.STRING));
		layoutVersion.setInitializer(code("\"v3\""));
		module.getDeclarations().add(layoutVersion);

		return module;
	}

	/**
	 * A module with no declarations at all: everything it does is in its footer.
	 */
	private Module polyfillsModule(Package tsPackage) {
		Module module = module(tsPackage, "polyfills");
		module.setHeader("// Imported for side effects only.");
		module.setFooter("export {};");
		return module;
	}

	/**
	 * Supplies the default and named bindings the authored imports below use.
	 */
	private Module configModule(Package tsPackage) {
		Module module = module(tsPackage, "config");
		VariableDeclaration region = FACTORY.createVariableDeclaration();
		region.setName("REGION");
		region.setExported(true);
		region.setVariableKind(VariableKind.CONST);
		region.setType(primitive(PrimitiveType.STRING));
		region.setInitializer(code("\"us-east-1\""));
		module.getDeclarations().add(region);
		module.setFooter("export default { region: REGION };");
		return module;
	}

	/**
	 * The domain: Bank, Customer, Account, Statement, Transaction.
	 */
	private Module bankModule(Package tsPackage, Module common) {
		Module module = module(tsPackage, "model/bank");
		module.setDocumentation("The bank domain.");

		InterfaceDeclaration identifiable = declaration(common, "Identifiable");
		InterfaceDeclaration money = declaration(common, "Money");
		EnumDeclaration currency = declaration(common, "Currency");
		EnumDeclaration statementFormat = declaration(common, "StatementFormat");

		// export enum TransactionKind { DEBIT = "debit", CREDIT = "credit", REVERSAL }
		EnumDeclaration kind = FACTORY.createEnumDeclaration();
		kind.setName("TransactionKind");
		kind.setExported(true);
		kind.getMembers().add(enumMember("DEBIT", "\"debit\""));
		kind.getMembers().add(enumMember("CREDIT", "\"credit\""));
		kind.getMembers().add(enumMember("REVERSAL", "\"reversal\""));
		module.getDeclarations().add(kind);

		InterfaceDeclaration transaction = iface(module, "Transaction");
		transaction.getSuperTypes().add(named(identifiable));
		transaction.setDocumentation("A single movement of money against an account.");
		property(transaction, "kind", named(kind));
		property(transaction, "amount", named(money));
		property(transaction, "postedAt", primitive(PrimitiveType.STRING));
		property(transaction, "memo", primitive(PrimitiveType.STRING)).setOptional(true);

		InterfaceDeclaration statement = iface(module, "Statement");
		statement.getSuperTypes().add(named(identifiable));
		statement.setDocumentation("A period's transactions, with opening and closing balances.");
		// A union of string literal types, which is how TypeScript spells an
		// enumeration it does not want to exist at runtime.
		property(statement, "period", union(
				literal(LiteralKind.STRING, "monthly"),
				literal(LiteralKind.STRING, "quarterly")));
		property(statement, "format", named(statementFormat));
		property(statement, "opening", named(money));
		property(statement, "closing", named(money));
		property(statement, "transactions", array(named(transaction)));

		InterfaceDeclaration account = iface(module, "Account");
		account.getSuperTypes().add(named(identifiable));
		account.setDocumentation("An account held by a customer at a bank.");
		property(account, "number", primitive(PrimitiveType.STRING));
		property(account, "currency", named(currency));
		property(account, "statements", array(named(statement)));

		InterfaceDeclaration customer = iface(module, "Customer");
		customer.getSuperTypes().add(named(identifiable));
		customer.setDocumentation("A person or organization the bank holds accounts for.");
		property(customer, "name", primitive(PrimitiveType.STRING));
		property(customer, "email", primitive(PrimitiveType.STRING)).setOptional(true);
		property(customer, "accounts", array(named(account)));

		InterfaceDeclaration bank = iface(module, "Bank");
		bank.getSuperTypes().add(named(identifiable));
		bank.setDocumentation("The institution itself.");
		property(bank, "name", primitive(PrimitiveType.STRING));
		property(bank, "bic", primitive(PrimitiveType.STRING));
		property(bank, "customers", array(named(customer)));

		// export abstract class AbstractAccount implements Account
		ClassDeclaration abstractAccount = FACTORY.createClassDeclaration();
		abstractAccount.setName("AbstractAccount");
		abstractAccount.setExported(true);
		abstractAccount.setAbstract(true);
		abstractAccount.setDocumentation("Everything an account implementation shares.");
		abstractAccount.getInterfaces().add(named(account));
		module.getDeclarations().add(abstractAccount);

		Property minimum = propertyMember("MINIMUM_BALANCE", primitive(PrimitiveType.NUMBER));
		minimum.setStatic(true);
		minimum.setReadonly(true);
		minimum.setInitializer(code("0"));
		abstractAccount.getMembers().add(minimum);

		Property ledger = propertyMember("ledger", array(named(transaction)));
		ledger.setVisibility(Visibility.PROTECTED);
		ledger.setReadonly(true);
		ledger.setInitializer(code("[]"));
		abstractAccount.getMembers().add(ledger);

		Property cached = propertyMember("cachedBalance", named(money));
		cached.setVisibility(Visibility.PRIVATE);
		cached.setOptional(true);
		abstractAccount.getMembers().add(cached);

		// The Account members this class satisfies.
		Property id = propertyMember("id", primitive(PrimitiveType.STRING));
		id.setReadonly(true);
		abstractAccount.getMembers().add(id);
		Property number = propertyMember("number", primitive(PrimitiveType.STRING));
		number.setReadonly(true);
		abstractAccount.getMembers().add(number);
		Property accountCurrency = propertyMember("currency", named(currency));
		accountCurrency.setReadonly(true);
		abstractAccount.getMembers().add(accountCurrency);
		abstractAccount.getMembers().add(propertyMember("statements", array(named(statement))));

		// A constructor with a rest parameter.
		Constructor constructor = FACTORY.createConstructor();
		constructor.setName("constructor");
		constructor.getParameters().add(parameter("id", primitive(PrimitiveType.STRING)));
		constructor.getParameters().add(parameter("number", primitive(PrimitiveType.STRING)));
		constructor.getParameters().add(parameter("currency", named(currency)));
		Parameter history = parameter("history", array(named(transaction)));
		history.setRest(true);
		constructor.getParameters().add(history);
		constructor.setBody(code("""
				this.id = id;
				this.number = number;
				this.currency = currency;
				this.statements = [];
				this.ledger.push(...history);
				"""));
		abstractAccount.getMembers().add(constructor);

		// get balance() / set balance()
		Accessor getter = FACTORY.createAccessor();
		getter.setName("balance");
		getter.setAccessorKind(AccessorKind.GET);
		getter.setReturnType(named(money));
		getter.setDocumentation("Sum of the ledger, memoized.");
		getter.setBody(code("""
				if (this.cachedBalance === undefined) {
				  const total = this.ledger.reduce((sum, t) => sum + t.amount.amount, 0);
				  this.cachedBalance = { amount: total, currency: this.currency };
				}
				return this.cachedBalance;
				"""));
		abstractAccount.getMembers().add(getter);

		Accessor setter = FACTORY.createAccessor();
		setter.setName("balance");
		setter.setAccessorKind(AccessorKind.SET);
		setter.getParameters().add(parameter("value", named(money)));
		setter.setBody(code("this.cachedBalance = value;"));
		abstractAccount.getMembers().add(setter);

		// abstract describe(): string
		Method describe = FACTORY.createMethod();
		describe.setName("describe");
		describe.setAbstract(true);
		describe.setReturnType(primitive(PrimitiveType.STRING));
		describe.setDocumentation("Implemented by each concrete account type.");
		abstractAccount.getMembers().add(describe);

		// async post(transaction: Transaction): Promise<void>
		Method post = FACTORY.createMethod();
		post.setName("post");
		post.setAsync(true);
		post.getParameters().add(parameter("transaction", named(transaction)));
		post.setReturnType(generic("Promise", primitive(PrimitiveType.VOID)));
		post.setBody(code("""
				this.ledger.push(transaction);
				this.cachedBalance = undefined;
				await Promise.resolve();
				"""));
		abstractAccount.getMembers().add(post);

		// *entries(): IterableIterator<Transaction>
		Method entries = FACTORY.createMethod();
		entries.setName("entries");
		entries.setGenerator(true);
		entries.setReturnType(generic("IterableIterator", named(transaction)));
		entries.setBody(code("yield* this.ledger;"));
		abstractAccount.getMembers().add(entries);

		// A member form with no class of its own.
		OpaqueMember toStringMember = FACTORY.createOpaqueMember();
		toStringMember.setName("toString");
		toStringMember.setText("toString(): string { return `${this.number} (${this.currency})`; }");
		abstractAccount.getMembers().add(toStringMember);

		return module;
	}

	/**
	 * The service layer, which is where the interesting imports happen.
	 */
	private Module accountsModule(Package tsPackage, Module common, Module bank, Module legacy, Module polyfills,
			Module config) {
		Module module = module(tsPackage, "service/accounts");
		module.setDocumentation("Operations over accounts.");

		InterfaceDeclaration account = declaration(bank, "Account");
		InterfaceDeclaration customer = declaration(bank, "Customer");
		InterfaceDeclaration statement = declaration(bank, "Statement");
		InterfaceDeclaration transaction = declaration(bank, "Transaction");
		ClassDeclaration abstractAccount = declaration(bank, "AbstractAccount");
		EnumDeclaration transactionKind = declaration(bank, "TransactionKind");
		InterfaceDeclaration money = declaration(common, "Money");
		InterfaceDeclaration page = declaration(common, "Page");
		InterfaceDeclaration repository = declaration(common, "Repository");
		TypeAliasDeclaration result = declaration(common, "Result");
		EnumDeclaration currency = declaration(common, "Currency");
		InterfaceDeclaration legacyTransaction = declaration(legacy, "Transaction");

		// --- Authored imports: what the resolver cannot infer -----------------

		// Nothing references anything in a side effect import, by definition.
		Import sideEffect = FACTORY.createImport();
		sideEffect.setName("polyfills");
		sideEffect.setModuleSpecifier("../" + polyfills.getPath() + ".js");
		module.getImports().add(sideEffect);

		// A namespace import binds one name for the whole module.
		Import namespaceImport = FACTORY.createImport();
		namespaceImport.setName("legacyModel");
		namespaceImport.setModuleSpecifier("../" + legacy.getPath() + ".js");
		namespaceImport.getBindings().add(binding(ImportKind.NAMESPACE, null, "legacyModel"));
		module.getImports().add(namespaceImport);

		// A default binding and a named binding in one statement.
		Import defaultImport = FACTORY.createImport();
		defaultImport.setName("config");
		defaultImport.setModuleSpecifier("../" + config.getPath() + ".js");
		defaultImport.getBindings().add(binding(ImportKind.DEFAULT, null, "bankDefaults"));
		defaultImport.getBindings().add(binding(ImportKind.NAMED, "REGION", null));
		module.getImports().add(defaultImport);

		// --- Declarations ----------------------------------------------------

		// export type AuditedAccount = Account & { auditedAt: string }
		TypeAliasDeclaration audited = FACTORY.createTypeAliasDeclaration();
		audited.setName("AuditedAccount");
		audited.setExported(true);
		IntersectionTypeReference intersection = FACTORY.createIntersectionTypeReference();
		intersection.setName("intersection");
		intersection.getTypes().add(named(account));
		TypeLiteralReference auditFields = FACTORY.createTypeLiteralReference();
		auditFields.setName("auditFields");
		auditFields.getMembers().add(propertyMember("auditedAt", primitive(PrimitiveType.STRING)));
		intersection.getTypes().add(auditFields);
		audited.setType(intersection);
		module.getDeclarations().add(audited);

		// Two types named Transaction, from two modules. Whichever is referenced
		// first keeps the name; the other is aliased.
		InterfaceDeclaration request = iface(module, "TransferRequest");
		request.setDocumentation("What a transfer needs to know.");
		property(request, "from", named(account));
		property(request, "to", named(account));
		property(request, "amount", named(money));
		property(request, "original", named(transaction)).setOptional(true);
		property(request, "legacy", named(legacyTransaction)).setOptional(true);
		// A type from a dependency rather than from this model.
		property(request, "precise", external("Decimal", "decimal.js")).setOptional(true);

		// export class CheckingAccount extends AbstractAccount implements Account
		ClassDeclaration checking = FACTORY.createClassDeclaration();
		checking.setName("CheckingAccount");
		checking.setExported(true);
		checking.setDocumentation("A current account with an overdraft limit.");
		// The extends clause of a class is evaluated at runtime, which is what makes
		// this a value import rather than a type import.
		checking.setSuperClass(named(abstractAccount));
		checking.getInterfaces().add(named(account));
		module.getDeclarations().add(checking);

		Property overdraft = propertyMember("overdraftLimit", primitive(PrimitiveType.NUMBER));
		overdraft.setReadonly(true);
		overdraft.setInitializer(code("500"));
		checking.getMembers().add(overdraft);

		Method describe = FACTORY.createMethod();
		describe.setName("describe");
		describe.setReturnType(primitive(PrimitiveType.STRING));
		describe.setBody(code("return `checking ${this.number} limit ${this.overdraftLimit}`;"));
		checking.getMembers().add(describe);

		// export class AccountService implements Repository<Account>
		ClassDeclaration service = FACTORY.createClassDeclaration();
		service.setName("AccountService");
		service.setExported(true);
		service.setDocumentation("Read side of one customer's accounts.");
		NamedTypeReference repositoryOfAccount = named(repository);
		repositoryOfAccount.getTypeArguments().add(named(account));
		service.getInterfaces().add(repositoryOfAccount);
		module.getDeclarations().add(service);

		Property accounts = propertyMember("accounts", array(named(account)));
		accounts.setVisibility(Visibility.PRIVATE);
		accounts.setReadonly(true);
		service.getMembers().add(accounts);

		Constructor serviceConstructor = FACTORY.createConstructor();
		serviceConstructor.setName("constructor");
		serviceConstructor.getParameters().add(parameter("owner", named(customer)));
		serviceConstructor.setBody(code("this.accounts = owner.accounts;"));
		service.getMembers().add(serviceConstructor);

		Method findById = FACTORY.createMethod();
		findById.setName("findById");
		findById.setAsync(true);
		findById.getParameters().add(parameter("id", primitive(PrimitiveType.STRING)));
		findById.setReturnType(generic("Promise",
				union(named(account), primitive(PrimitiveType.UNDEFINED))));
		findById.setBody(code("return this.accounts.find((a) => a.id === id);"));
		service.getMembers().add(findById);

		Method findAll = FACTORY.createMethod();
		findAll.setName("findAll");
		findAll.setAsync(true);
		Parameter pageNumber = parameter("page", primitive(PrimitiveType.NUMBER));
		pageNumber.setDefaultValue(code("0"));
		findAll.getParameters().add(pageNumber);
		NamedTypeReference pageOfAccount = named(page);
		pageOfAccount.getTypeArguments().add(named(account));
		findAll.setReturnType(generic("Promise", pageOfAccount));
		findAll.setBody(code("""
				const size = 10;
				return {
				  items: this.accounts.slice(page * size, (page + 1) * size),
				  total: this.accounts.length,
				};
				"""));
		service.getMembers().add(findAll);

		// A generic method with a constrained type parameter.
		Method latest = FACTORY.createMethod();
		latest.setName("latestStatement");
		TypeParameter accountType = typeParameter("A");
		accountType.setConstraint(named(account));
		latest.getTypeParameters().add(accountType);
		latest.getParameters().add(parameter("account", typeParameterReference("A")));
		latest.setReturnType(union(named(statement), primitive(PrimitiveType.UNDEFINED)));
		latest.setBody(code("return account.statements.at(-1);"));
		service.getMembers().add(latest);

		// export async function transfer(...): Promise<Result<Transaction>>
		FunctionDeclaration transfer = FACTORY.createFunctionDeclaration();
		transfer.setName("transfer");
		transfer.setExported(true);
		transfer.setAsync(true);
		transfer.setDocumentation("""
				Moves money between two accounts.

				Returns a Result rather than throwing, so the caller has to decide.""");
		transfer.getParameters().add(parameter("request", named(request)));
		NamedTypeReference resultOfTransaction = named(result);
		resultOfTransaction.getTypeArguments().add(named(transaction));
		transfer.setReturnType(generic("Promise", resultOfTransaction));
		CodeBlock transferBody = code("""
				if (request.from.currency !== request.to.currency) {
				  return { ok: false, error: new Error("currency mismatch") };
				}
				const posted: Transaction = {
				  id: `${request.from.id}-${Date.now()}`,
				  kind: TransactionKind.DEBIT,
				  amount: request.amount,
				  postedAt: new Date().toISOString(),
				};
				return { ok: true, value: posted };
				""");
		// The body reads an enum at runtime. Declaring that here is what tells the
		// resolver TransactionKind cannot be imported as a type. Note that the text
		// itself has to spell whatever local name the resolver ends up assigning -
		// the generator does not rewrite opaque source.
		transferBody.getReferences().add(named(transactionKind));
		transfer.setBody(transferBody);
		module.getDeclarations().add(transfer);

		// export function* iterate<T>(items: T[]): Generator<T>
		FunctionDeclaration iterate = FACTORY.createFunctionDeclaration();
		iterate.setName("iterate");
		iterate.setExported(true);
		iterate.setGenerator(true);
		iterate.getTypeParameters().add(typeParameter("T"));
		iterate.getParameters().add(parameter("items", array(typeParameterReference("T"))));
		iterate.setReturnType(generic("Generator", typeParameterReference("T")));
		iterate.setBody(code("yield* items;"));
		module.getDeclarations().add(iterate);

		// export const formatMoney = (amount: Money, locale: string = "en-US"): string => { ... }
		// A VariableDeclaration which is also Callable becomes an arrow function.
		VariableDeclaration formatMoney = FACTORY.createVariableDeclaration();
		formatMoney.setName("formatMoney");
		formatMoney.setExported(true);
		formatMoney.setVariableKind(VariableKind.CONST);
		formatMoney.getParameters().add(parameter("amount", named(money)));
		Parameter locale = parameter("locale", primitive(PrimitiveType.STRING));
		locale.setDefaultValue(code("\"en-US\""));
		formatMoney.getParameters().add(locale);
		formatMoney.setReturnType(primitive(PrimitiveType.STRING));
		formatMoney.setBody(code("""
				const formatter = new Intl.NumberFormat(locale, {
				  style: "currency",
				  currency: amount.currency,
				});
				return formatter.format(amount.amount);
				"""));
		module.getDeclarations().add(formatMoney);

		// export let auditCursor: string | null = null
		VariableDeclaration cursor = FACTORY.createVariableDeclaration();
		cursor.setName("auditCursor");
		cursor.setExported(true);
		cursor.setVariableKind(VariableKind.LET);
		cursor.setType(union(primitive(PrimitiveType.STRING), primitive(PrimitiveType.NULL)));
		cursor.setInitializer(code("null"));
		module.getDeclarations().add(cursor);

		// export const DEFAULT_CURRENCY = Currency.USD
		// A value use of an enum in an initializer rather than in a body.
		VariableDeclaration defaultCurrency = FACTORY.createVariableDeclaration();
		defaultCurrency.setName("DEFAULT_CURRENCY");
		defaultCurrency.setExported(true);
		defaultCurrency.setVariableKind(VariableKind.CONST);
		CodeBlock currencyInitializer = code("Currency.USD");
		currencyInitializer.getReferences().add(named(currency));
		defaultCurrency.setInitializer(currencyInitializer);
		module.getDeclarations().add(defaultCurrency);

		return module;
	}

	/**
	 * A declaration only module: emitted as .d.ts, with no bodies.
	 */
	private Module ambientModule(Package tsPackage, Module common) {
		Module module = module(tsPackage, "types/ambient");
		module.setDeclarationOnly(true);
		module.setDocumentation("Configuration shape, types only.");

		EnumDeclaration currency = declaration(common, "Currency");

		InterfaceDeclaration config = iface(module, "BankConfig");
		property(config, "baseUrl", primitive(PrimitiveType.STRING));
		property(config, "defaultCurrency", named(currency));
		property(config, "timeoutMs", primitive(PrimitiveType.NUMBER)).setOptional(true);

		// The body is dropped, because a declaration file has none.
		Method validate = method(config, "validate");
		validate.setReturnType(primitive(PrimitiveType.BOOLEAN));
		validate.setBody(code("return true;"));

		return module;
	}

	/**
	 * The entry point: nothing but re-exports, which live in the footer because
	 * <code>export *</code> is not a declaration.
	 */
	private Module indexModule(Package tsPackage) {
		Module module = module(tsPackage, "index");
		module.setHeader("// Generated by the Nasdanika TypeScript model. Do not edit.");
		module.setFooter("""
				export * from "./model/common.js";
				export * from "./model/bank.js";
				export * from "./service/accounts.js";
				export type * from "./types/ambient.js";""");
		return module;
	}

	// ------------------------------------------------------------------------
	// Builder helpers
	// ------------------------------------------------------------------------

	private static Module module(Package tsPackage, String path) {
		Module ret = FACTORY.createModule();
		ret.setName(path.substring(path.lastIndexOf('/') + 1));
		ret.setPath(path);
		tsPackage.getModules().add(ret);
		return ret;
	}

	private static InterfaceDeclaration iface(Module module, String name) {
		InterfaceDeclaration ret = FACTORY.createInterfaceDeclaration();
		ret.setName(name);
		ret.setExported(true);
		module.getDeclarations().add(ret);
		return ret;
	}

	@SuppressWarnings("unchecked")
	private static <T extends Declaration> T declaration(Module module, String name) {
		return (T) module.getDeclarations().stream()
				.filter(d -> name.equals(d.getName()))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException(
						"No declaration " + name + " in " + module.getPath()));
	}

	private static Property property(InterfaceDeclaration owner, String name, TypeReference type) {
		Property ret = propertyMember(name, type);
		owner.getMembers().add(ret);
		return ret;
	}

	private static Property propertyMember(String name, TypeReference type) {
		Property ret = FACTORY.createProperty();
		ret.setName(name);
		ret.setType(type);
		return ret;
	}

	private static Method method(InterfaceDeclaration owner, String name) {
		Method ret = FACTORY.createMethod();
		ret.setName(name);
		owner.getMembers().add(ret);
		return ret;
	}

	private static Parameter parameter(String name, TypeReference type) {
		Parameter ret = FACTORY.createParameter();
		ret.setName(name);
		ret.setType(type);
		return ret;
	}

	private static TypeParameter typeParameter(String name) {
		TypeParameter ret = FACTORY.createTypeParameter();
		ret.setName(name);
		return ret;
	}

	private static EnumMember enumMember(String name, String value) {
		EnumMember ret = FACTORY.createEnumMember();
		ret.setName(name);
		ret.setValue(value);
		return ret;
	}

	private static ImportBinding binding(ImportKind kind, String importedName, String alias) {
		ImportBinding ret = FACTORY.createImportBinding();
		ret.setName(alias == null ? importedName : alias);
		ret.setKind(kind);
		ret.setImportedName(importedName);
		ret.setAlias(alias);
		return ret;
	}

	private static CodeBlock code(String text) {
		CodeBlock ret = FACTORY.createCodeBlock();
		ret.setName("body");
		ret.setText(text);
		return ret;
	}

	private static PrimitiveTypeReference primitive(PrimitiveType type) {
		PrimitiveTypeReference ret = FACTORY.createPrimitiveTypeReference();
		ret.setName(type.getLiteral());
		ret.setPrimitiveType(type);
		return ret;
	}

	/**
	 * A reference to a declaration in this model. The target is what the import
	 * resolver follows.
	 */
	private static NamedTypeReference named(Declaration target) {
		NamedTypeReference ret = FACTORY.createNamedTypeReference();
		ret.setName(target.getName());
		ret.setTarget(target);
		return ret;
	}

	/**
	 * A type parameter or an ambient global: a name with no target and no module
	 * specifier, so nothing is imported.
	 */
	private static NamedTypeReference global(String name) {
		NamedTypeReference ret = FACTORY.createNamedTypeReference();
		ret.setName(name);
		ret.setQualifiedName(name);
		return ret;
	}

	private static NamedTypeReference typeParameterReference(String name) {
		return global(name);
	}

	private static NamedTypeReference generic(String name, TypeReference... typeArguments) {
		NamedTypeReference ret = global(name);
		ret.getTypeArguments().addAll(List.of(typeArguments));
		return ret;
	}

	/**
	 * A type from a package this model does not own: named by module specifier
	 * rather than by target.
	 */
	private static NamedTypeReference external(String name, String moduleSpecifier) {
		NamedTypeReference ret = FACTORY.createNamedTypeReference();
		ret.setName(name);
		ret.setQualifiedName(name);
		ret.setModuleSpecifier(moduleSpecifier);
		return ret;
	}

	private static ArrayTypeReference array(TypeReference elementType) {
		ArrayTypeReference ret = FACTORY.createArrayTypeReference();
		ret.setName("array");
		ret.setElementType(elementType);
		return ret;
	}

	private static UnionTypeReference union(TypeReference... types) {
		UnionTypeReference ret = FACTORY.createUnionTypeReference();
		ret.setName("union");
		ret.getTypes().addAll(List.of(types));
		return ret;
	}

	private static LiteralTypeReference literal(LiteralKind kind, String value) {
		LiteralTypeReference ret = FACTORY.createLiteralTypeReference();
		ret.setName("literal");
		ret.setLiteralKind(kind);
		ret.setValue(value);
		return ret;
	}

	/**
	 * A NIO volume adapted to text: the generator writes strings, and reading
	 * back decodes the content.
	 */
	private static GenericVolume<String> textVolume(Path root) {
		return Volume.of(root).adapt(
				content -> {
					try (InputStream in = content.openStream()) {
						return new String(in.readAllBytes(), StandardCharsets.UTF_8);
					} catch (IOException e) {
						throw new UncheckedIOException(e);
					}
				},
				text -> Content.of(text, StandardCharsets.UTF_8));
	}

	private static void readTree(GenericVolume<String> volume, String directory, Map<String, String> sink) throws IOException {
		for (GenericVolume.Entry entry : volume.list(directory)) {
			if (entry.kind() == GenericVolume.Entry.Kind.DIRECTORY) {
				readTree(volume, entry.path(), sink);
			} else {
				sink.put(entry.path(), volume.content(entry.path()));
			}
		}
	}

	private static void deleteRecursively(Path path) throws IOException {
		if (!Files.exists(path)) {
			return;
		}
		try (var walk = Files.walk(path)) {
			walk.sorted(Comparator.reverseOrder()).forEach(p -> {
				try {
					Files.delete(p);
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			});
		}
	}
}
