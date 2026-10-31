---
name: nasdanika-meta
description: Write, review and change business vocabularies and domain models in Nasdanika Meta's text syntax (.nmeta files), with every term documented, and validate them with the build. Use when the user works on a .nmeta file; asks for a vocabulary, a glossary, business terminology, a data dictionary or a domain model; or wants terms from a glossary, a spreadsheet extract, a document or meeting notes turned into a model.
---

# Nasdanika Meta vocabularies

Meta is a language-neutral type system. A `.nmeta` file is one package of terms: classes,
their attributes and references, enumerations and data types, each with a Markdown definition.
The same file is read by developers in a pull request, projected to glossaries, documentation
and schemas, and read by business owners as a generated document. Write it for both audiences:
precise structure, plain-language definitions.

## Workflow

1. **Find the project.** A vocabulary project has `.nmeta` files under `src/main/meta` and a
   build that validates them (`mvn -q test`). If there is none and the user wants one, copy
   `assets/vocabulary-project/` into the place they choose and tell them what was created.
2. **Read an example before writing.** `examples/bank.nmeta` is the reference for style:
   imports, data types, enumerations, documented classes and features, keys and opposites.
   `examples/party.nmeta` is a package another team owns, imported by namespace.
   `examples/library.nmeta` is a small vocabulary. For the full syntax, read
   `references/syntax.md`.
3. **Ask for what you cannot infer**: the package's namespace URI (it identifies the
   vocabulary, so it belongs to the organization, never invented under someone else's domain),
   and which terms other teams already own and publish.
4. **Draft.** One package per file. Declare every type you use; order does not matter.
5. **Validate and fix until there are no errors.** Run `mvn -q test` in the project. Problems
   are printed one per line:

   ```text
   src/main/meta/bank.nmeta:70:5: error: Unknown type Custmer
   src/main/meta/bank.nmeta:70:5: warning: Facet type occupancy.Presence is not available, its properties are not checked
   ```

   Fix every error at its line and column, then run again. Report warnings to the user rather
   than silencing them: a warning about a facet type that is not available is expected until
   that model is on the build path.
6. **Review** against the checklist below, and summarize what changed in terms of the business:
   terms added, renamed or redefined, and anything you were unsure of.

If there is no build and no Maven, still write valid syntax by following the examples, and say
that the file has not been validated.

## Conventions

- **Every class, data type, enumeration and feature has a documentation comment**, `/** ... */`,
  placed before the element and before its annotations. Define the term for a business reader:
  what it is and what it means here, starting with one sentence that could stand alone in a
  glossary. Not how it is stored, not "the X of the Y".
- **Names.** Classes, data types and enumerations: `UpperCamelCase`, singular (`Account`, not
  `Accounts`). Features and operations: `lowerCamelCase`; plural for many-valued features
  (`accounts`). Enumeration literals: `UPPER_SNAKE_CASE`, with `as "wire-value"` when systems
  exchange a different spelling.
- **Multiplicity says the business rule.** Required is `[1]`, at least one is `[+]`, any number
  is `[*]`; no multiplicity means optional and single-valued.
- **Identity.** Mark the attribute that identifies an entity with `id`. For a contained list,
  name the attribute that identifies an item within it with `keys`.
- **`contains` versus `refers`.** `contains` means the target is part of this object and does
  not exist without it (an account's statements). `refers` points to something with a life of
  its own (an account's product, its holders).
- **Pair two-way relationships** with `opposite` on both ends.
- **Money and identifiers are data types, not numbers.** Declare `type Amount as string wraps
  java.math.BigDecimal` so that no projection turns money into floating point. Codes and
  numbers that are not quantities (account numbers, postal codes) are `string`.
- **Stay language-neutral.** Use Meta's primitive kinds (`string`, `number`, `boolean`,
  `date`, `dateTime`, ...). Source-language types appear only after `wraps`, as provenance.
- **Do not copy terms another team owns.** Import their package by namespace and refer to
  `alias.Name`. If their package is not available, the reference is kept unresolved and the
  file still validates.
- **Derived values** are `derived readonly`. Operations are signatures only: Meta has no bodies.
- **Facets** (`@occupancy.Presence { ... }`, `@role.Assignment { ... }`) record ownership,
  jurisdiction and similar data about an element. Add them only when the user asks.

## Syntax at a glance

```nmeta
/** Documentation of the package, Markdown. */
package bank namespace "https://example.org/vocabulary/bank" prefix "bank" version "1.0.0"

import "https://example.org/vocabulary/party" as party       // party.Party is a class there
annotation "urn:org.nasdanika" as Nasdanika                  // then @Nasdanika(icon = "bi-bank")

/** An amount in its account's currency. */
type Amount as string wraps java.math.BigDecimal

/** The kind of product. */
enum ProductCategory { CHECKING, SAVINGS, CREDIT_CARD as "credit-card" }

/** A party the bank has a relationship with. */
class Customer {
    /** Who the customer is, as the party vocabulary defines it. */
    refers party.Party[1] party

    /** The accounts the customer holds. */
    refers Account[*] accounts opposite holders
}

/** A movement of money posted to an account. */
class Transaction {
    /** Identifies the transaction within its account. */
    id string[1] transactionId
}

/** An arrangement through which money moves. */
@Nasdanika(icon = "bi-bank")
class Account {
    /** Identifies the account. */
    id string[1] accountNumber

    /** The customers who own the account. */
    refers Customer[+] holders opposite accounts

    /** Every transaction posted to the account. */
    contains Transaction[*] transactions keys transactionId

    /** The language of the contract. */
    string contractLanguage = "fr"

    /** The sum of posted transactions. */
    derived readonly Amount balance

    /** The balance at the end of a day. */
    op Amount balanceAt(date day)

    /** The product category. */
    ProductCategory[1] category
}
```

`//` comments are ignored and are not kept when a file is written back; only `/** */`
documentation is part of the model.

## Pitfalls

- A documentation comment must come immediately before the element, before its annotations.
  Elsewhere it is ignored silently.
- Every type must be declared in the file, imported, or a primitive kind. There are no
  predefined classes: `throws Error` needs a declared `Error`.
- Strings are quoted, including default values of enumeration type (`Status status = "DRAFT"`).
  Numbers and `true`/`false` are not.
- The multiplicity follows the type, not the name: `Account[*] accounts`.
- `id` is for attributes only; `opposite` and `keys` are for references only.
- Only the last parameter of an operation can be variadic (`string... codes`).
- Keywords such as `type`, `version` and `id` can be feature names. A type name that is a keyword
  is escaped with `^`, as in `class ^Package`.
