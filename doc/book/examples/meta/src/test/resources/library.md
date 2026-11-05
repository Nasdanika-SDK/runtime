# library

The words a library uses, and what they mean here.

## Person

Someone who wrote, edited or translated a book.

| Term | Type | Rule | Meaning |
|---|---|---|---|
| name | text | required, identifies it | The name as printed on the title page. |

## Book

A published work, identified by its ISBN.

| Term | Type | Rule | Meaning |
|---|---|---|---|
| isbn | text | required, identifies it | International Standard Book Number, 13 digits. |
| title | text | optional | The title as printed, subtitle excluded. |
| published | date | optional | The date of the first edition. |
| authors | Person | any number | The people credited as authors, in the order printed. |
