# bank

Version 2026.10.0.

The words a bank uses with its customers, and what they mean here.

Kept by the business and reviewed as a pull request, like the code it is generated into.

## CurrencyCode

An ISO 4217 currency code, such as USD or CAD.

Written as text.

## Amount

An amount in the currency of its account, a decimal string so that no cent is lost.

Written as text.

## ProductCategory

The kind of product, which decides what an account can do.

One of:

- **CHECKING**
- **SAVINGS**
- **CREDIT_CARD**

## Direction

Whether a transaction takes money out of an account or puts it in.

One of:

- **DEBIT**
- **CREDIT**

## Product

What the bank sells: an offer with terms, under which accounts are opened.

| Term | Type | Rule | Meaning |
|---|---|---|---|
| code | text | required, identifies it | Identifies the product in the catalog. |
| name | text | required | The name customers see, such as "Everyday Checking". |
| category | ProductCategory | required | What kind of product it is. |
| currencies | CurrencyCode | at least one | The currencies accounts of this product can be held in. |

## Customer

A party the bank has a relationship with, through at least one account.

| Term | Type | Rule | Meaning |
|---|---|---|---|
| customerNumber | text | required, identifies it | Identifies the customer, and is printed on statements. |
| party | Party (from party) | required | Who the customer is. Defined by the party vocabulary, not here. |
| since | date | optional | When the relationship started. |
| accounts | Account | any number, the other side of Account.holders | The accounts the customer holds, alone or jointly. |
| contractLanguage | text | optional, fr by default | In Quebec, consumer contracts are in French unless the customer asks otherwise. |

## Account

An arrangement under a product, in one currency, through which money moves.

| Term | Type | Rule | Meaning |
|---|---|---|---|
| accountNumber | text | required, identifies it | Identifies the account, and is printed on cheques and statements. |
| product | Product | required | The product the account was opened under, which sets its terms. |
| holders | Customer | at least one, the other side of Customer.accounts | The customers who own the account: one, or several for a joint account. |
| currency | CurrencyCode | required | The currency the account is held in, one of its product's. |
| transactions | Transaction | any number, part of it | Every transaction posted to the account, addressed by its identifier. |
| statements | Statement | any number, part of it | The statements issued for the account, oldest first. |
| balance | Amount | computed | The sum of posted transactions, computed rather than stored. |

What it can do:

- **balanceAt**(day): The balance at the end of a day, from the transactions posted until then.

## Transaction

A movement of money posted to an account.

| Term | Type | Rule | Meaning |
|---|---|---|---|
| transactionId | text | required, identifies it | Identifies the transaction within its account. |
| postedAt | date and time | required | When the transaction was posted, which may be after it was made. |
| amount | Amount | required | How much money moved, never negative: the direction says which way. |
| direction | Direction | required | Whether the money left the account or came in. |
| description | text | optional | What the customer sees on a statement, such as the merchant's name. |

## Statement

The record of an account over a period, as sent to its holders.

| Term | Type | Rule | Meaning |
|---|---|---|---|
| periodStart | date | required | The first day the statement covers. |
| periodEnd | date | required | The last day the statement covers. |
| openingBalance | Amount | required | The balance at the start of the first day. |
| closingBalance | Amount | required | The balance at the end of the last day. |
| transactions | Transaction | any number | The transactions posted in the period, in the order posted. |
