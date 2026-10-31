# The Meta text syntax

A `.nmeta` file is one Meta package, UTF-8. This reference covers every construct. Each
example is valid on its own once it has a `package` line.

## Package, imports and annotation aliases

```nmeta
/**
 * The words a bank uses with its customers, and what they mean here.
 * Documentation is Markdown.
 */
package bank namespace "https://example.org/vocabulary/bank" prefix "bank" version "2026.10.0"

import "https://example.org/vocabulary/party" as party
annotation "urn:org.nasdanika" as Nasdanika
```

- `package` comes first. The name is required; `namespace` is the package's identity, what
  other packages import. `prefix` and `version` are optional.
- `import "<namespace>" as alias` makes `alias.Name` a reference to the class `Name` of that
  package. A namespace is a name, not an address: nothing is downloaded. The build resolves it
  to a file in the project when one has that namespace; otherwise the reference keeps the
  namespace and the name, and nothing is checked.
- `annotation "<source>" as Alias` lets `@Alias(key = "value")` stand for an annotation with that
  source. `@"<source>"(key = "value")` writes the source in place.
- Imports and annotation aliases come after the package line and before the classifiers.

## Documentation

`/** ... */` immediately before an element is its documentation, in Markdown. Leading `*` on
each line are stripped, as in Javadoc. It goes before the element's annotations. `//` and
`/* */` comments are ignored and are not kept when a file is written back.

## Data types

```nmeta
/** An ISO 4217 currency code, such as USD or CAD. */
type CurrencyCode as string wraps java.util.Currency

/** An amount, a decimal string so that no cent is lost. */
type Amount as string wraps java.math.BigDecimal

/** A moment in time. */
type Instant as dateTime
```

`as` is the primitive kind the value is exchanged as; `wraps` records the type it stands for in
a source language, as provenance only.

## Primitive kinds

`string`, `number`, `boolean`, `bigint`, `date`, `time`, `dateTime`, `duration`, `binary`,
`any`, `null`, `void`.

## Enumerations

```nmeta
/** Whether money leaves an account or comes in. */
enum Direction {
    DEBIT,
    CREDIT
}

/** The kind of product. */
enum ProductCategory {
    CHECKING,
    SAVINGS,
    CREDIT_CARD as "credit-card" = 5,
    LOAN
}
```

`as "..."` is the literal's serialized value; `= n` its ordinal. Without an ordinal, a literal's
ordinal is one more than the previous one's, starting at 0 (`LOAN` is 6 above).

## Classes

```nmeta
/** Something with an identity in every system. */
abstract class Entity {
    /** Identifies the entity. */
    id string[1] code
}

/** A person known to the bank. */
class Person extends Entity {
    /** The name on the person's identity documents. */
    string[1] legalName
}
```

`abstract` classes have no instances of their own. `extends` takes one or more supertypes,
separated by commas.

## Features

A feature is a type, a multiplicity, then a name. With `contains` or `refers` it is a reference;
otherwise it is an attribute.

```nmeta
/** A product the bank sells. */
class Product {
    /** Identifies the product in the catalog. */
    id string[1] code
}

/** A movement of money. */
class Transaction {
    /** Identifies the transaction within its account. */
    id string[1] transactionId
}

/** A customer of the bank. */
class Customer {
    /** The accounts the customer holds. */
    refers Account[*] accounts opposite holders
}

/** An account. */
class Account {
    /** Identifies the account. */
    id string[1] accountNumber

    /** The product the account was opened under. */
    refers Product[1] product

    /** The customers who own the account. */
    refers Customer[+] holders opposite accounts

    /** The transactions posted to the account. */
    contains Transaction[*] transactions keys transactionId

    /** Tags, each once, in no particular order. */
    unordered unique string[*] tags

    /** The language of the contract. */
    string contractLanguage = "fr"

    /** The number of holders who must sign. */
    number signatures = 1

    /** The sum of posted transactions, computed rather than stored. */
    derived readonly number balance
}
```

- `contains`: the target is part of this object (containment). `refers`: a plain reference.
- `opposite name`: the reference at the other end, which must name this one back.
- `keys a, b`: the attributes of the target that identify it within this reference's list.
- `id`: the attribute identifies its object. Attributes only.
- Modifiers, before the type: `derived`, `readonly`, `unordered`, `unique`, `id`.
- `= literal`: the default value. Strings are quoted, numbers and `true`/`false` are not.
  The default of an enumeration attribute is the literal's name in quotes.

## Multiplicity

| Written | Bounds | Meaning |
|---|---|---|
| `string name` | 0..1 | Optional, single-valued |
| `string[?] name` | 0..1 | Optional, said explicitly |
| `string[1] name` | 1..1 | Required |
| `string[*] names`, `string[] names` | 0..* | Any number |
| `string[+] names` | 1..* | At least one |
| `string[3] names` | 3..3 | Exactly three |
| `string[2..5] names`, `string[2..*] names` | 2..5, 2..* | A range |

## Operations

```nmeta
/** Raised when an amount is not valid. */
class InvalidAmount {
    /** What was wrong. */
    string[1] reason
}

/** An account. */
class Account {
    /** The balance at the end of a day. */
    op number balanceAt(date day)

    /** The fees for a set of services, with a discount rate. */
    op number fees(number rate = 0.1, string... services) throws InvalidAmount
}
```

Signatures only: Meta has no operation bodies. A parameter with `...` is variadic and must be
the last. `throws` lists declared or imported classes.

## Type expressions

```nmeta
/** Something stored. */
abstract class Entity {
    /** Identifies it. */
    id string[1] code
}

/** Stores entities of one kind by key. */
class Repository<T extends Entity, K = string> {
    /** Finds an entity by its key. */
    op T find(K key)

    /** All entities, of the kind or a subkind. */
    op Repository<? extends T, K> all()
}

/** Values of mixed types. */
class Record {
    /** A code or a number. */
    string | number reference

    /** Whatever the source system sends. */
    `Record<string, unknown>` extras
}
```

- Type parameters: `<T>`, with a bound `<T extends A>` or several `<T extends A & B>`, and a
  default `<K = string>`.
- Type arguments: `Repository<Account, string>`.
- Wildcards, as type arguments only: `?`, `? extends T`, `? super T`.
- Union `A | B`; intersection `A & B`, binding tighter than `|`; parentheses group.
- Text in backticks is an opaque type, for what nothing else expresses.

## Annotations

```nmeta
annotation "urn:org.nasdanika" as Nasdanika

/** A book. */
@Nasdanika(icon = "bi-book")
@"https://example.org/catalog/schema"(table = "BOOKS")
class Book {
    /** The title as printed. */
    @Nasdanika(
        label = "Title",
        note = """
            Shown on the catalog card.
            Subtitle excluded.
            """
    )
    string title
}
```

An annotation is a source and string details. Detail values are strings or text blocks.

## Text blocks

As in Java: `"""`, then the content from the next line, closed by `"""`. Incidental
indentation is stripped. A word right after the opening quotes is a language tag (`"""json`).
Text blocks are accepted wherever a string is.

## Facets

```nmeta
import "https://runtime.sdk.nasdanika.org/models/occupancy" as occupancy

/** A customer. */
class Customer {
    /** In Quebec, consumer contracts are in French unless the customer asks otherwise. */
    @occupancy.Presence { jurisdiction: "CA-QC" }
    string contractLanguage = "fr"
}
```

`@Type { property: value }` is a typed facet, with a class, usually imported, as its type.
Values are strings, numbers, `true`/`false`, `null`, lists in `[ ]`, nested objects
(`{ ... }` or `Type { ... }`), and names of enumeration literals or elements. Commas between
properties and between list items are optional.

When the facet's type is available, its properties are checked against it. When it is not, the
build warns that the facet is not checked; that is expected until the model that defines it is
on the build path.

## Names and keywords

Words such as `type`, `version`, `id`, `namespace` and the primitive kinds are keywords only
where the syntax needs them, so they can be feature, parameter and literal names. Type names are
plain identifiers. Any name can be escaped with a leading `^`, which is not part of the name:
`class ^class`.

## What the build reports

Errors: syntax errors; an unknown type, import alias or annotation alias; a type that an
available imported package does not have; duplicate classifiers, features or literals; an
`opposite` or `keys` that does not exist; `id` on a reference; `opposite` or `keys` on an
attribute; a variadic parameter that is not the last; an upper bound below the lower bound.

Warnings: a facet type that is not available; a facet property that its type does not have.
