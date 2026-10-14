// ---------------------------------------------------------------------------
// The Ecore runtime: the half of the story TypeScript cannot tell.
//
// The generated interfaces in ./model.js are erased at compile time. This file
// is what exists at run time: a registry of metamodels, a bootstrap that turns
// a generated `descriptor` back into live EClass objects, and one reflective
// loader that materializes EMF JSON for ANY metamodel.
//
// There are deliberately no generated implementations. Every instance carries
// $eClass, so one loader driven by the metamodel does what a per class emitter
// would do, in a fraction of the code and with nothing to regenerate.
//
// Hand written. Not generated - do not run the generator over it.
// ---------------------------------------------------------------------------

import type {
  EAttribute,
  EClass,
  EClassifier,
  EDataType,
  EEnum,
  ENamedElement,
  EPackage,
  EReference,
  EStructuralFeature,
} from "./model.js";

// ---------------------------------------------------------------------------
// Shapes
// ---------------------------------------------------------------------------

/** Anything the loader produced: a plain object carrying its metaclass. */
export interface EObjectLike {
  readonly $eClass: EClass<unknown>;
  readonly [feature: string]: unknown;
}

type Mutable<T> = { -readonly [K in keyof T]: T[K] };

/** JSON as it arrives: parsed, unvalidated. */
type Json = Record<string, unknown>;

/** Set on loaded objects, non-enumerably, so JSON.stringify does not cycle. */
const CONTAINER = "$eContainer";
const CONTAINING_FEATURE = "$eContainingFeature";

export class EcoreError extends Error {
  constructor(message: string) {
    super(message);
    this.name = "EcoreError";
  }
}

// ---------------------------------------------------------------------------
// Registry
// ---------------------------------------------------------------------------

/**
 * Metamodels by namespace URI. A cross package reference in EMF JSON is
 * `<nsURI>#//<ClassifierName>`, so the registry is what makes a package's types
 * reachable from another package's data.
 */
export class EPackageRegistry {
  private readonly byNsURI = new Map<string, EPackage>();

  register(ePackage: EPackage): this {
    const nsURI = ePackage.nsURI;
    if (!nsURI) {
      throw new EcoreError("Cannot register an EPackage with no nsURI");
    }
    this.byNsURI.set(nsURI, ePackage);
    return this;
  }

  getEPackage(nsURI: string): EPackage | undefined {
    return this.byNsURI.get(nsURI);
  }

  get nsURIs(): string[] {
    return [...this.byNsURI.keys()];
  }

  /**
   * Resolves `<nsURI>#//<Name>`, or a bare `//<Name>` against a package the
   * caller supplies.
   */
  getEClassifier(uri: string, context?: EPackage): EClassifier | undefined {
    const hash = uri.indexOf("#");
    let ePackage: EPackage | undefined;
    let fragment: string;
    if (hash === -1) {
      ePackage = context;
      fragment = uri;
    } else {
      ePackage = this.getEPackage(uri.substring(0, hash)) ?? context;
      fragment = uri.substring(hash + 1);
    }
    if (!ePackage) {
      return undefined;
    }
    const name = fragment.startsWith("//") ? fragment.substring(2) : fragment;
    return ePackage.eClassifiers.find((c) => c.name === name);
  }

  getEClass<T = unknown>(uri: string, context?: EPackage): EClass<T> | undefined {
    const classifier = this.getEClassifier(uri, context);
    return isEClass(classifier) ? (classifier as EClass<T>) : undefined;
  }
}

/** The registry `load` uses when none is supplied. */
export const registry = new EPackageRegistry();

// ---------------------------------------------------------------------------
// Metamodel bootstrap
// ---------------------------------------------------------------------------

/**
 * Turns a generated `descriptor` - an EPackage serialized as EMF JSON - into
 * live objects.
 *
 * This one function knows Ecore's shape statically instead of loading it
 * reflectively, and that is the whole bootstrap. Everything above it is
 * reflective; below it there is nothing to stand on, because the metamodel that
 * would describe the descriptor is the thing being built.
 *
 * Call it once per package, at module load:
 *
 * ```ts
 * import { descriptor } from "@nasdanika/family/package.js";
 * export const FamilyPackage = loadEPackage(descriptor);
 * ```
 */
export function loadEPackage(
  descriptor: unknown,
  target: EPackageRegistry = registry,
): EPackage {
  const json = asObject(descriptor, "EPackage descriptor");

  const ePackage = {
    name: str(json["name"]),
    nsURI: str(json["nsURI"]),
    nsPrefix: str(json["nsPrefix"]),
    eClassifiers: [] as EClassifier[],
    eSubpackages: [] as EPackage[],
  } as unknown as Mutable<EPackage>;

  // Registered before the classifiers are wired, so that a package whose
  // classifiers refer to each other by `<own nsURI>#//Name` resolves.
  target.register(ePackage as EPackage);

  const classifiers = array(json["eClassifiers"]);
  // Two passes, for the same reason the generator needs two: a supertype or an
  // eType may be declared after the classifier that refers to it.
  for (const entry of classifiers) {
    (ePackage.eClassifiers as EClassifier[]).push(createEClassifier(asObject(entry, "EClassifier")));
  }
  classifiers.forEach((entry, index) => {
    populateEClassifier(
      asObject(entry, "EClassifier"),
      ePackage.eClassifiers[index]!,
      ePackage as EPackage,
      target,
    );
  });

  return ePackage as EPackage;
}

/**
 * After every package including Ecore itself is registered, this stamps the
 * $eClass of every metamodel object - so an EClass reports the EClass metaclass
 * as its own metaclass, which is the runtime half of the metacircularity.
 *
 * Optional: a loaded package works without it. Only reflection over the
 * metamodel itself needs it.
 */
export function stampMetamodel(target: EPackageRegistry = registry): void {
  const ecore = target.getEPackage(ECORE_NS_URI);
  if (!ecore) {
    return;
  }
  const metaclass = (name: string) => target.getEClass(name, ecore);
  const stamp = (object: unknown, name: string) => {
    const eClass = metaclass(name);
    if (eClass && isObject(object)) {
      Object.defineProperty(object, "$eClass", {
        value: eClass,
        enumerable: false,
        configurable: true,
      });
    }
  };
  for (const nsURI of target.nsURIs) {
    const ePackage = target.getEPackage(nsURI)!;
    stamp(ePackage, "EPackage");
    for (const classifier of ePackage.eClassifiers) {
      if (isEClass(classifier)) {
        stamp(classifier, "EClass");
        for (const feature of classifier.eStructuralFeatures) {
          stamp(feature, isEReference(feature) ? "EReference" : "EAttribute");
        }
      } else if (isEEnum(classifier)) {
        stamp(classifier, "EEnum");
        for (const literal of classifier.eLiterals) {
          stamp(literal, "EEnumLiteral");
        }
      } else {
        stamp(classifier, "EDataType");
      }
    }
  }
}

export const ECORE_NS_URI = "http://www.eclipse.org/emf/2002/Ecore";

const ECLASS_URI = `${ECORE_NS_URI}#//EClass`;
const EENUM_URI = `${ECORE_NS_URI}#//EEnum`;
const EREFERENCE_URI = `${ECORE_NS_URI}#//EReference`;

function createEClassifier(json: Json): EClassifier {
  const kind = str(json["eClass"]);
  const name = str(json["name"]);
  if (kind === ECLASS_URI) {
    return {
      name,
      abstract: bool(json["abstract"]),
      interface: bool(json["interface"]),
      eSuperTypes: [] as EClass[],
      eStructuralFeatures: [] as EStructuralFeature[],
      eTypeParameters: [],
      eOperations: [],
      eGenericSuperTypes: [],
    } as unknown as EClassifier;
  }
  if (kind === EENUM_URI) {
    return {
      name,
      eLiterals: array(json["eLiterals"]).map((entry) => {
        const literal = asObject(entry, "EEnumLiteral");
        return {
          name: str(literal["name"]),
          value: num(literal["value"]) ?? 0,
          // EMF omits `literal` when it equals the name.
          literal: str(literal["literal"]) ?? str(literal["name"]),
        };
      }),
      eTypeParameters: [],
    } as unknown as EClassifier;
  }
  return {
    name,
    instanceClassName: str(json["instanceClassName"]),
    serializable: bool(json["serializable"]) ?? true,
    eTypeParameters: [],
  } as unknown as EClassifier;
}

function populateEClassifier(
  json: Json,
  classifier: EClassifier,
  ePackage: EPackage,
  target: EPackageRegistry,
): void {
  if (!isEClass(classifier)) {
    return;
  }
  const eClass = classifier as unknown as Mutable<EClass<unknown>>;

  for (const entry of array(json["eSuperTypes"])) {
    const superType = target.getEClass(refOf(entry) ?? "", ePackage);
    if (superType) {
      (eClass.eSuperTypes as EClass[]).push(superType);
    }
  }

  for (const entry of array(json["eStructuralFeatures"])) {
    const featureJson = asObject(entry, "EStructuralFeature");
    const reference = str(featureJson["eClass"]) === EREFERENCE_URI;
    const upperBound = num(featureJson["upperBound"]) ?? 1;
    const feature = {
      name: str(featureJson["name"]),
      lowerBound: num(featureJson["lowerBound"]) ?? 0,
      upperBound,
      changeable: bool(featureJson["changeable"]) ?? true,
      derived: bool(featureJson["derived"]) ?? false,
      transient: bool(featureJson["transient"]) ?? false,
      defaultValueLiteral: str(featureJson["defaultValueLiteral"]),
      ...(reference
        ? {
            containment: bool(featureJson["containment"]) ?? false,
            eKeys: [] as EAttribute[],
          }
        : { iD: bool(featureJson["iD"]) ?? false }),
      // Resolved below, once every classifier exists.
      eType: undefined as EClassifier | undefined,
      $isReference: reference,
    } as unknown as EStructuralFeature;
    (eClass.eStructuralFeatures as EStructuralFeature[]).push(feature);

    const eTypeRef = refOf(featureJson["eType"]);
    if (eTypeRef) {
      (feature as unknown as Mutable<{ eType?: EClassifier }>).eType = target.getEClassifier(
        eTypeRef,
        ePackage,
      );
    }
  }
}

// ---------------------------------------------------------------------------
// Instance loading
// ---------------------------------------------------------------------------

export interface LoadOptions {
  /** Metamodels to resolve `eClass` against. Defaults to the global registry. */
  registry?: EPackageRegistry;
  /**
   * Called for a `$ref` that does not resolve inside this document - a cross
   * document reference. Return the target, or undefined to leave the feature
   * unset.
   */
  resolveExternal?: (ref: string, feature: EStructuralFeature) => unknown;
  /**
   * Throw when a `$ref` cannot be resolved. Off by default: a partially loaded
   * graph is usually more useful than none, and unresolved references are
   * reported through {@link LoadResult.unresolved}.
   */
  strictReferences?: boolean;
}

export interface LoadResult<T> {
  root: T;
  /** Every `$ref` which did not resolve, in encounter order. */
  unresolved: string[];
}

/**
 * Loads EMF JSON into plain objects carrying $eClass.
 *
 * Containment is materialized as nested objects. Non containment references
 * arrive in the JSON as `{ "$ref": "..." }` and are resolved into the real
 * objects afterwards, which is why the generated interfaces type them as their
 * target rather than as a reference - after loading, the graph matches.
 */
export function load<T = EObjectLike>(json: unknown, options: LoadOptions = {}): T {
  return loadWithDiagnostics<T>(json, options).root;
}

export function loadWithDiagnostics<T = EObjectLike>(
  json: unknown,
  options: LoadOptions = {},
): LoadResult<T> {
  const target = options.registry ?? registry;
  const pending: PendingReference[] = [];
  const byId = new Map<string, EObjectLike>();
  const root = createObject(asObject(json, "instance"), target, pending, byId);

  const unresolved: string[] = [];
  for (const reference of pending) {
    const resolved =
      resolveReference(root, reference.ref, byId) ??
      options.resolveExternal?.(reference.ref, reference.feature);
    if (resolved === undefined) {
      unresolved.push(reference.ref);
      if (options.strictReferences) {
        throw new EcoreError(
          `Could not resolve ${reference.ref} for feature ${reference.feature.name}`,
        );
      }
      continue;
    }
    if (reference.index === undefined) {
      (reference.owner as Record<string, unknown>)[reference.feature.name!] = resolved;
    } else {
      const list = (reference.owner as Record<string, unknown>)[reference.feature.name!] as unknown[];
      list[reference.index] = resolved;
    }
  }

  // Many valued features holding unresolved entries would otherwise keep holes.
  for (const reference of pending) {
    if (reference.index !== undefined) {
      const list = (reference.owner as Record<string, unknown>)[reference.feature.name!] as unknown[];
      const compacted = list.filter((entry) => entry !== undefined);
      if (compacted.length !== list.length) {
        (reference.owner as Record<string, unknown>)[reference.feature.name!] = compacted;
      }
    }
  }

  return { root: root as T, unresolved };
}

interface PendingReference {
  owner: EObjectLike;
  feature: EStructuralFeature;
  ref: string;
  /** Set for a many valued feature; the slot to fill. */
  index?: number;
}

/**
 * A `$ref` is either a fragment path from the root, or - when the target has an
 * EMF ID attribute - the bare id. Both occur in data written by EMF, depending
 * on whether the metamodel marks an attribute as an ID or merely uses it as an
 * eKey on the containing reference.
 */
function resolveReference(
  root: EObjectLike,
  ref: string,
  byId: Map<string, EObjectLike>,
): unknown {
  if (ref.startsWith("/")) {
    return resolvePath(root, ref);
  }
  // A cross document reference is left to resolveExternal.
  return ref.includes("#") ? undefined : byId.get(ref);
}

function createObject(
  json: Json,
  target: EPackageRegistry,
  pending: PendingReference[],
  byId: Map<string, EObjectLike>,
): EObjectLike {
  const eClassURI = str(json["eClass"]);
  if (!eClassURI) {
    throw new EcoreError(`No eClass on ${JSON.stringify(json).substring(0, 120)}`);
  }
  const eClass = target.getEClass(eClassURI);
  if (!eClass) {
    throw new EcoreError(
      `Unknown eClass ${eClassURI}. Registered packages: ${target.nsURIs.join(", ") || "none"}`,
    );
  }

  const object = {} as unknown as EObjectLike;
  // Non enumerable: the metaclass is metadata, not data. Left enumerable, a
  // JSON.stringify of any loaded object would walk into the metamodel, which is
  // cyclic through eSuperTypes.
  Object.defineProperty(object, "$eClass", { value: eClass, enumerable: false });
  const writable = object as Record<string, unknown>;

  for (const feature of getEAllStructuralFeatures(eClass)) {
    const name = feature.name;
    if (!name) {
      continue;
    }
    const many = isMany(feature);
    const raw = json[name];

    if (raw === undefined || raw === null) {
      // A many valued feature is always a list, empty at worst, because that is
      // what the generated type promises.
      if (many) {
        writable[name] = [];
      } else {
        // EMF omits an attribute whose value equals its default, and eGet would
        // still answer with that default. Reproducing it here keeps the loaded
        // object faithful to what EMF would report.
        const fallback = defaultValueOf(feature);
        if (fallback !== undefined) {
          writable[name] = fallback;
        }
      }
      continue;
    }

    if (!isEReference(feature)) {
      writable[name] = raw;
      // An EMF ID attribute is how a bare "$ref": "lea" finds its target.
      if (isIdAttribute(feature) && typeof raw === "string") {
        byId.set(raw, object);
      }
      continue;
    }

    if (many) {
      const entries = array(raw);
      const list: unknown[] = new Array(entries.length);
      writable[name] = list;
      entries.forEach((entry, index) => {
        const value = loadReferenceValue(entry, feature, object, target, pending, byId, index);
        if (value !== undefined) {
          list[index] = value;
        }
      });
    } else {
      const value = loadReferenceValue(raw, feature, object, target, pending, byId, undefined);
      if (value !== undefined) {
        writable[name] = value;
      }
    }
  }

  return object;
}

function loadReferenceValue(
  raw: unknown,
  feature: EStructuralFeature,
  owner: EObjectLike,
  target: EPackageRegistry,
  pending: PendingReference[],
  byId: Map<string, EObjectLike>,
  index: number | undefined,
): unknown {
  const entry = asObject(raw, `value of ${feature.name}`);
  const ref = str(entry["$ref"]);
  if (ref !== undefined) {
    // Resolved in a second pass, because the target may not exist yet.
    pending.push({ owner, feature, ref, index });
    return undefined;
  }
  const child = createObject(entry, target, pending, byId);
  setContainment(child, owner, feature);
  return child;
}

function setContainment(child: EObjectLike, parent: EObjectLike, feature: EStructuralFeature): void {
  // Non enumerable, so JSON.stringify of a loaded graph does not recurse into
  // its own parent and the objects still compare as plain data.
  Object.defineProperty(child, CONTAINER, { value: parent, enumerable: false });
  Object.defineProperty(child, CONTAINING_FEATURE, { value: feature, enumerable: false });
}

// ---------------------------------------------------------------------------
// Fragment paths
// ---------------------------------------------------------------------------

/**
 * Resolves an EMF fragment path against a root object. Supported forms, which
 * is what EMF JSON writes for an intra document reference:
 *
 * - `//@members.3` - feature, then index
 * - `//@members[id='lea']` - feature, then the entry whose keys match
 * - `//@family/@members.0` - nested
 * - `//@owner` - a single valued feature
 *
 * An ID based fragment (`#lea`) and a cross document reference are not handled
 * here - supply `resolveExternal` for those.
 */
export function resolvePath(root: EObjectLike, path: string): unknown {
  if (!path.startsWith("/")) {
    return undefined;
  }
  let current: unknown = root;
  for (const segment of path.split("/")) {
    if (segment.length === 0) {
      continue;
    }
    if (!segment.startsWith("@")) {
      return undefined;
    }
    current = step(current, segment.substring(1));
    if (current === undefined) {
      return undefined;
    }
  }
  return current;
}

function step(owner: unknown, segment: string): unknown {
  if (!isObject(owner)) {
    return undefined;
  }
  const keyed = segment.match(/^([^[]+)\[(.+)]$/);
  if (keyed) {
    const list = (owner as Record<string, unknown>)[keyed[1]!];
    if (!Array.isArray(list)) {
      return undefined;
    }
    const predicates = parseKeys(keyed[2]!);
    return list.find(
      (entry) =>
        isObject(entry) &&
        predicates.every(([key, value]) => String((entry as Record<string, unknown>)[key]) === value),
    );
  }
  const dot = segment.lastIndexOf(".");
  if (dot !== -1) {
    const name = segment.substring(0, dot);
    const index = Number.parseInt(segment.substring(dot + 1), 10);
    const list = (owner as Record<string, unknown>)[name];
    if (Array.isArray(list) && Number.isInteger(index)) {
      return list[index];
    }
  }
  return (owner as Record<string, unknown>)[segment];
}

/** `id='lea'` or `a='x',b='y'`. */
function parseKeys(text: string): [string, string][] {
  const ret: [string, string][] = [];
  for (const part of text.split(",")) {
    const match = part.match(/^\s*([^=]+)\s*=\s*'(.*)'\s*$/);
    if (match) {
      ret.push([match[1]!.trim(), match[2]!]);
    }
  }
  return ret;
}

// ---------------------------------------------------------------------------
// Reflection
// ---------------------------------------------------------------------------

/** Own features plus every inherited one, supertypes first, deduplicated. */
export function getEAllStructuralFeatures(eClass: EClass<unknown>): EStructuralFeature[] {
  const ret: EStructuralFeature[] = [];
  const seen = new Set<string>();
  const visit = (current: EClass<unknown>, visited: Set<EClass<unknown>>) => {
    if (visited.has(current)) {
      return;
    }
    visited.add(current);
    for (const superType of current.eSuperTypes ?? []) {
      visit(superType, visited);
    }
    for (const feature of current.eStructuralFeatures ?? []) {
      if (feature.name && !seen.has(feature.name)) {
        seen.add(feature.name);
        ret.push(feature);
      }
    }
  };
  visit(eClass, new Set());
  return ret;
}

export function getEStructuralFeature(
  eClass: EClass<unknown>,
  name: string,
): EStructuralFeature | undefined {
  return getEAllStructuralFeatures(eClass).find((feature) => feature.name === name);
}

/** Every supertype, transitively. */
export function getEAllSuperTypes(eClass: EClass<unknown>): EClass<unknown>[] {
  const ret: EClass<unknown>[] = [];
  const visit = (current: EClass<unknown>) => {
    for (const superType of current.eSuperTypes ?? []) {
      if (!ret.includes(superType)) {
        ret.push(superType);
        visit(superType);
      }
    }
  };
  visit(eClass);
  return ret;
}

export function eClassOf(object: unknown): EClass<unknown> | undefined {
  return isObject(object) ? ((object as EObjectLike).$eClass as EClass<unknown>) : undefined;
}

export function eGet(object: unknown, feature: string): unknown {
  return isObject(object) ? (object as Record<string, unknown>)[feature] : undefined;
}

export function eContainer(object: unknown): EObjectLike | undefined {
  return isObject(object) ? ((object as Record<string, unknown>)[CONTAINER] as EObjectLike) : undefined;
}

export function eContainingFeature(object: unknown): EStructuralFeature | undefined {
  return isObject(object)
    ? ((object as Record<string, unknown>)[CONTAINING_FEATURE] as EStructuralFeature)
    : undefined;
}

/**
 * Whether an object is an instance of an EClass, following supertypes. This is
 * the runtime counterpart of a TypeScript type guard, and it narrows:
 *
 * ```ts
 * if (isInstance<Man>(member, ManEClass)) { ... }
 * ```
 */
export function isInstance<T>(object: unknown, eClass: EClass<T>): object is T & EObjectLike {
  const actual = eClassOf(object);
  if (!actual) {
    return false;
  }
  return actual === (eClass as unknown as EClass<unknown>)
    || getEAllSuperTypes(actual).includes(eClass as unknown as EClass<unknown>);
}

/** Depth first over containment, excluding the object itself. */
export function* eAllContents(object: unknown): Generator<EObjectLike> {
  const eClass = eClassOf(object);
  if (!eClass) {
    return;
  }
  for (const feature of getEAllStructuralFeatures(eClass)) {
    if (!isEReference(feature) || !feature.containment || !feature.name) {
      continue;
    }
    const value = (object as Record<string, unknown>)[feature.name];
    for (const child of Array.isArray(value) ? value : value === undefined ? [] : [value]) {
      if (eClassOf(child)) {
        yield child as EObjectLike;
        yield* eAllContents(child);
      }
    }
  }
}

// ---------------------------------------------------------------------------
// Predicates and coercion
// ---------------------------------------------------------------------------

/**
 * The value EMF would report for an unset single valued attribute.
 *
 * Only the two cases that carry real information are filled: an explicit
 * defaultValueLiteral, and an enum, whose default is its first literal. The
 * Java defaults for the primitives - false, 0 - are deliberately NOT filled;
 * the generated type declares such a feature optional, and inventing a zero
 * would make "unset" and "set to zero" indistinguishable.
 */
export function defaultValueOf(feature: EStructuralFeature): unknown {
  if (isEReference(feature)) {
    return undefined;
  }
  const literal = feature.defaultValueLiteral;
  const eType = feature.eType;
  if (literal !== undefined) {
    if (literal === "true" || literal === "false") {
      return literal === "true";
    }
    const asNumber = Number(literal);
    return literal.trim() !== "" && !Number.isNaN(asNumber) && !isEEnum(eType) ? asNumber : literal;
  }
  if (isEEnum(eType)) {
    const first = eType.eLiterals[0];
    return first?.literal ?? first?.name;
  }
  return undefined;
}

export function isMany(feature: EStructuralFeature): boolean {
  const upperBound = feature.upperBound ?? 1;
  return upperBound > 1 || upperBound === -1;
}

export function isEClass(classifier: unknown): classifier is EClass<unknown> {
  return isObject(classifier) && Array.isArray((classifier as Record<string, unknown>)["eStructuralFeatures"]);
}

export function isEEnum(classifier: unknown): classifier is EEnum {
  return isObject(classifier) && Array.isArray((classifier as Record<string, unknown>)["eLiterals"]);
}

export function isEReference(feature: EStructuralFeature): feature is EReference {
  return (feature as unknown as Record<string, unknown>)["$isReference"] === true;
}

/** An EAttribute marked as the EMF ID of its class. */
export function isIdAttribute(feature: EStructuralFeature): feature is EAttribute {
  return (feature as unknown as Record<string, unknown>)["iD"] === true;
}

export function isEDataType(classifier: unknown): classifier is EDataType {
  return isObject(classifier) && !isEClass(classifier);
}

export function nameOf(element: ENamedElement | undefined): string | undefined {
  return element?.name;
}

function isObject(value: unknown): value is Record<string, unknown> {
  return typeof value === "object" && value !== null;
}

function asObject(value: unknown, what: string): Json {
  if (!isObject(value) || Array.isArray(value)) {
    throw new EcoreError(`Expected an object for ${what}, got ${typeof value}`);
  }
  return value as Json;
}

function array(value: unknown): unknown[] {
  return Array.isArray(value) ? value : value === undefined || value === null ? [] : [value];
}

function str(value: unknown): string | undefined {
  return typeof value === "string" ? value : undefined;
}

function num(value: unknown): number | undefined {
  return typeof value === "number" ? value : undefined;
}

function bool(value: unknown): boolean | undefined {
  return typeof value === "boolean" ? value : undefined;
}

/** The `$ref` out of `{ "eClass": "...", "$ref": "..." }`, or a bare string. */
function refOf(value: unknown): string | undefined {
  if (typeof value === "string") {
    return value;
  }
  return isObject(value) ? str((value as Json)["$ref"]) : undefined;
}
