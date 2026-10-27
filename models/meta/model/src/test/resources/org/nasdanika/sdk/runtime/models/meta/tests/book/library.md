# library

The words a library uses, and what they mean here.

## Person

Someone who wrote, edited or translated a book.

| Term | Type | Meaning |
|---|---|---|
| name (identifies) | string | The name as printed on the title page. |

## Format

How a book is published.

One of: HARDCOVER, PAPERBACK, EBOOK.

## Book

A published work, identified by its ISBN.

| Term | Type | Meaning |
|---|---|---|
| isbn (identifies) | string | International Standard Book Number, 13 digits. |
| title | string | The title as printed, subtitle excluded. |
| published | date | The date of the first edition. |
| authors | Person, many | The people credited as authors, in the order printed. |
