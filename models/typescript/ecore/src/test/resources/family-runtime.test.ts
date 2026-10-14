// ---------------------------------------------------------------------------
// End to end: a metamodel built in Java, generated to TypeScript, and instance
// data written by EMF itself - loaded here by the reflective runtime.
//
// Copied into the generated package by FamilyRuntimeTests. Run with `npm test`
// in ecore/target/npm/family.
// ---------------------------------------------------------------------------

import { readFileSync } from "node:fs";
import { test } from "node:test";
import assert from "node:assert/strict";

import {
  eAllContents,
  eContainer,
  eGet,
  getEAllStructuralFeatures,
  isInstance,
  load,
  loadEPackage,
  loadWithDiagnostics,
  registry,
  stampMetamodel,
  type EObjectLike,
} from "@nasdanika/ecore";
import { descriptor as ecoreDescriptor } from "@nasdanika/ecore/package.js";

import { descriptor as familyDescriptor } from "./package.js";
import type { Family, Man, Member, Woman } from "./model.js";

// Ecore first: the family descriptor's eType references point at it.
loadEPackage(ecoreDescriptor);
const familyPackage = loadEPackage(familyDescriptor);
stampMetamodel();

const ManEClass = registry.getEClass<Man>("//Man", familyPackage)!;
const WomanEClass = registry.getEClass<Woman>("//Woman", familyPackage)!;
const MemberEClass = registry.getEClass<Member>("//Member", familyPackage)!;

const json = JSON.parse(
  readFileSync(new URL("../data/family.json", import.meta.url), "utf8"),
) as unknown;

const { root: family, unresolved } = loadWithDiagnostics<Family>(json);

test("the metamodel loads from the generated descriptor", () => {
  assert.equal(familyPackage.name, "family");
  assert.ok(ManEClass, "Man should be registered");
  // Inherited features are visible through the supertype chain.
  const names = getEAllStructuralFeatures(ManEClass).map((f) => f.name);
  assert.ok(names.includes("id"), `expected id in ${names.join(", ")}`);
  assert.ok(names.includes("children"));
});

test("the metamodel describes itself", () => {
  // Ecore is metacircular at run time too: the EClass describing Man is itself
  // an instance of the EClass metaclass.
  assert.equal(ManEClass.$eClass.name, "EClass");
  assert.equal(ManEClass.$eClass.$eClass.name, "EClass");
  assert.equal(familyPackage.$eClass.name, "EPackage");
});

test("instance data loads with every reference resolved", () => {
  assert.deepEqual(unresolved, []);
  assert.equal(family.$eClass.name, "Family");
  assert.equal(family.name, "Sample family");
  assert.equal(family.members.length, 6);
});

test("containment is materialized, and knows its parent", () => {
  const albert = family.members.find((m) => m.id === "albert")!;
  assert.equal(albert.name, "Albert");
  assert.equal(eContainer(albert), family);
  // Every member is reachable by walking containment.
  assert.equal([...eAllContents(family)].length, 6);
});

test("non containment references are resolved into the real objects", () => {
  const paul = family.members.find((m) => m.id === "paul")!;
  const lea = family.members.find((m) => m.id === "lea")!;

  // The JSON holds {"$ref": "//@members[id='lea']"}; after loading it is the
  // object itself, which is why the generated type says Member and not a ref.
  assert.ok(paul.children.includes(lea), "paul.children should contain lea");
  assert.ok(lea.parents.includes(paul), "lea.parents should contain paul");
  // Identity, not a copy: the graph is shared.
  assert.equal(paul.children.find((c) => c.id === "lea"), lea);
});

test("a forward reference resolves - order in the document does not matter", () => {
  // paul appears before lea, and refers to her; lea refers back.
  const isa = family.members.find((m) => m.id === "isa")!;
  const elias = family.members.find((m) => m.id === "elias")!;
  assert.ok(isa.children.includes(elias));
  assert.ok(elias.parents.includes(isa));
});

test("subtypes are distinguishable at run time", () => {
  const paul = family.members.find((m) => m.id === "paul")!;
  const isa = family.members.find((m) => m.id === "isa")!;

  // isInstance compares EClass identity, so it separates Man from Woman even
  // though the two interfaces are structurally identical.
  assert.ok(isInstance(paul, ManEClass));
  // Kept as a plain boolean on purpose. assert.ok(!isInstance(...)) would narrow
  // paul by EXCLUDING Woman, and since Man and Woman declare no members of their
  // own TypeScript cannot tell them apart structurally - the narrowing collapses
  // to never. A run time check, which is what this is, has no such problem.
  const paulIsWoman: boolean = isInstance(paul, WomanEClass);
  assert.equal(paulIsWoman, false);

  // isInstance follows supertypes.
  assert.ok(isInstance(paul, MemberEClass));

  assert.equal(paul.$eClass.name, "Man");
  assert.equal(isa.$eClass.name, "Woman");
});

test("enums arrive as their literal, which is what the generated enum holds", () => {
  const albert = family.members.find((m) => m.id === "albert")!;
  assert.equal(albert.status, "deceased");

  // Paul is ALIVE, the enum's first literal and therefore its default, so EMF
  // omitted the attribute entirely. The loader fills the default back in, which
  // is what EMF's own eGet would answer.
  const paul = family.members.find((m) => m.id === "paul")!;
  assert.equal(paul.status, "alive");
});

test("a many valued feature is always a list, empty at worst", () => {
  const albert = family.members.find((m) => m.id === "albert")!;
  // Albert has no children in the data; the type promises Member[], not
  // Member[] | undefined.
  assert.deepEqual(albert.children, []);
  assert.ok(Array.isArray(albert.parents));
});

test("reflection works without the generated types", () => {
  const paul = family.members.find((m) => m.id === "paul")! as unknown as EObjectLike;
  assert.equal(eGet(paul, "name"), "Paul");
  assert.equal(load<Family>(json).members.length, 6);
});

test("a loaded object serializes as plain data", () => {
  // $eClass and $eContainer are non enumerable on purpose: the metaclass is
  // metadata, and both of them are cyclic. What is left is the data.
  const albert = family.members.find((m) => m.id === "albert")!;
  const text = JSON.stringify(albert);
  assert.ok(text.includes("Albert"));
  assert.ok(!text.includes("$eClass"), text);
  assert.ok(!text.includes("$eContainer"));
  assert.deepEqual(JSON.parse(text), {
    id: "albert",
    name: "Albert",
    status: "deceased",
    parents: [],
    children: [],
  });

  // A graph with non containment cycles - paul points at lea, lea back at paul -
  // still needs a replacer. Containment alone is a tree; references are not.
  const paul = family.members.find((m) => m.id === "paul")!;
  assert.throws(() => JSON.stringify(paul), /circular/i);
});
