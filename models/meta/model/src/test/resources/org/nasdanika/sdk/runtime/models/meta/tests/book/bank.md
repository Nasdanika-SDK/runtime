# bank

The words a bank uses with its customers, and what they mean here.

Kept by the business and reviewed as a pull request, like the code it is generated into.

## CurrencyCode

An ISO 4217 currency code, such as USD or CAD.

## Amount

An amount in the currency of its account, a decimal string so that no cent is lost.

## ProductCategory

The kind of product, which decides what an account can do.

One of: CHECKING, SAVINGS, CREDIT_CARD.

## Direction

Whether a transaction takes money out of an account or puts it in.

One of: DEBIT, CREDIT.

## Product

What the bank sells: an offer with terms, under which accounts are opened.

| Term | Type | Meaning |
|---|---|---|
| code (identifies) | string | Identifies the product in the catalog. |
| name | string | The name customers see, such as "Everyday Checking". |
| category | ProductCategory | What kind of product it is. |
| currencies | CurrencyCode, many | The currencies accounts of this product can be held in. |

## Customer

A party the bank has a relationship with, through at least one account.

| Term | Type | Meaning |
|---|---|---|
| customerNumber (identifies) | string | Identifies the customer, and is printed on statements. |
| party | Party | Who the customer is. Defined by the party vocabulary, not here. |
| since | date | When the relationship started. |
| accounts | Account, many | The accounts the customer holds, alone or jointly. |
| contractLanguage | string | In Quebec, consumer contracts are in French unless the customer asks otherwise. |

## Account

An arrangement under a product, in one currency, through which money moves.

| Term | Type | Meaning |
|---|---|---|
| accountNumber (identifies) | string | Identifies the account, and is printed on cheques and statements. |
| product | Product | The product the account was opened under, which sets its terms. |
| holders | Customer, many | The customers who own the account: one, or several for a joint account. |
| currency | CurrencyCode | The currency the account is held in, one of its product's. |
| transactions | Transaction, many | Every transaction posted to the account, addressed by its identifier. |
| statements | Statement, many | The statements issued for the account, oldest first. |
| balance | Amount | The sum of posted transactions, computed rather than stored. |

## Transaction

A movement of money posted to an account.

| Term | Type | Meaning |
|---|---|---|
| transactionId (identifies) | string | Identifies the transaction within its account. |
| postedAt | dateTime | When the transaction was posted, which may be after it was made. |
| amount | Amount | How much money moved, never negative: the direction says which way. |
| direction | Direction | Whether the money left the account or came in. |
| description | string | What the customer sees on a statement, such as the merchant's name. |

## Statement

The record of an account over a period, as sent to its holders.

| Term | Type | Meaning |
|---|---|---|
| periodStart | date | The first day the statement covers. |
| periodEnd | date | The last day the statement covers. |
| openingBalance | Amount | The balance at the start of the first day. |
| closingBalance | Amount | The balance at the end of the last day. |
| transactions | Transaction, many | The transactions posted in the period, in the order posted. |
