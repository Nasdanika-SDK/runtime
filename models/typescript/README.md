# TypeScript model

A model of the TypeScript declaration surface, and a generator that writes npm packages from it.
What the model is for, and why it is a model rather than a template, is in
[`model/doc/readme.md`](model/doc/readme.md).

Part of the [Nasdanika SDK Runtime](https://github.com/Nasdanika-SDK/runtime). Documentation home:
`https://runtime.sdk.nasdanika.org/models/typescript`.

## Layout

| Path | What it is |
|---|---|
| [`model/`](model) | The Xcore model, the generator, and the tests. Maven `org.nasdanika.sdk.runtime.models.typescript:model`, Java module `org.nasdanika.sdk.runtime.models.typescript` |
| [`model/src/main/resources/.../typescript.xcore`](model/src/main/resources/org/nasdanika/sdk/runtime/models/typescript/typescript.xcore) | The model itself |
| [`model/src/main/java/.../generator/Generator.java`](model/src/main/java/org/nasdanika/sdk/runtime/models/typescript/generator/Generator.java) | Model to TypeScript sources, including import management, written to a volume of text |
| [`model/src/test/java/.../BankTests.java`](model/src/test/java/org/nasdanika/sdk/runtime/models/typescript/tests/BankTests.java) | Builds a sample package programmatically, exercising every construct the model can express, and generates it |
| [`model/doc/readme.md`](model/doc/readme.md) | What the model is for and where it sits among the runtime's models |
| [`ecore/`](ecore) | `EcoreGenerator`: an `EPackage` to a TypeScript package model. Not part of the build yet: it still uses the previous generation's packages and is to be migrated |

## Building

```bash
# The model, the generator and the tests. Generates a demo npm package into model/target/bank.
mvn clean test

# Compile what the generator produced. --verbatimModuleSyntax is the strict check:
# it makes a wrong type or value import decision a compile error.
cd model/target/bank
npm install
npx tsc --noEmit --verbatimModuleSyntax --isolatedModules
npm run build
```

The test wipes only the generated `src` directory, so an `npm install` done in
`model/target/bank` survives the next test run, but not `mvn clean`. The Maven build does not
depend on Node, so compiling the generated package is a separate step.
