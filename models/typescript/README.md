# Typescript Model

An Ecore micro-model of the TypeScript declaration surface, and a generator which writes
npm packages from it.

See https://typescript.models.nasdanika.org/

## Layout

| Path | What it is |
|---|---|
| [`model/`](model) | The Xcore model, the generator, and the tests |
| [`model/src/main/resources/org/nasdanika/models/typescript/typescript.xcore`](model/src/main/resources/org/nasdanika/models/typescript/typescript.xcore) | The model itself |
| [`model/src/main/java/org/nasdanika/models/typescript/generator/Generator.java`](model/src/main/java/org/nasdanika/models/typescript/generator/Generator.java) | Model to TypeScript sources, including import management |
| [`model/src/test/java/.../BankTests.java`](model/src/test/java/org/nasdanika/models/typescript/tests/BankTests.java) | Builds a bank package - Bank, Customer, Account, Statement, Transaction - programmatically and generates it |
| [`model/doc/readme.md`](model/doc/readme.md) | What the model is for and where it sits on the tower |
| [`ecore/`](ecore) | `EcoreGenerator` - EPackage to a TypeScript package model. Generates Ecore itself, in one pass |
| [`ecore/src/main/resources/.../runtime/runtime.ts`](ecore/src/main/resources/org/nasdanika/models/typescript/ecore/runtime/runtime.ts) | The **hand written** Ecore runtime: registry, metamodel bootstrap, and one reflective loader for EMF JSON. Ships inside the generated `@nasdanika/ecore` |
| [`test-project/`](test-project) | The same language surface written **by hand**, with a readme that teaches TypeScript and npm from scratch |

## Building

```bash
# The model, the generator and the tests. Generates a demo npm package into
# model/target/bank.
mvn -o clean test

# Compile what the generator produced. --verbatimModuleSyntax is the strict
# check: it makes a wrong type/value import decision a compile error.
cd model/target/bank
npm install
npx tsc --noEmit --verbatimModuleSyntax --isolatedModules
npm run build
```

```bash
# Generate npm packages from Ecore and nxcore, then compile them. nxcore imports
# @nasdanika/ecore, so install the generated Ecore package into it first.
cd ecore/target/npm/ecore && npm install && npx tsc
cd ../nxcore && npm install ../ecore && npm install && npx tsc --noEmit

# The runtime, end to end: a metamodel built in Java, generated to TypeScript,
# with instance data written by EMF itself and loaded reflectively.
# The Maven build does not depend on Node, so this step is separate.
cd ../family && npm install ../ecore && npm install && npm test
```

```bash
# The hand written tour: read it, build it, run it.
cd test-project
npm install
npm start
npm test
```

`model/target/bank` is deliberately excluded from `mvn clean`, so an `npm install` done
there to verify the output survives the next build. `BankTests` wipes its own `src`
directory instead.
