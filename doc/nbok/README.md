# Nasdanika Body of Knowledge

What every book of the Nasdanika Body of Knowledge (NBOK) shares. Today that is one file:

| Path | What it is |
|---|---|
| `nbok-appendix.adoc` | The NBOK appendix: what NBOK holds, how its repositories are laid out, how it is published and read, and why it can be trusted. Every book of NBOK ends with it, word for word |

## Using it

- **In the runtime**, a book includes the file by its path. The SDK book:
  `include::../../../../../nbok/nbok-appendix.adoc[]` from `book.adoc`.
- **In another repository**, such as `field-notes` or `stories`, the build unpacks
  `org.nasdanika.sdk.runtime.doc:nbok` of the runtime release it is built with, and the book includes
  `nbok/nbok-appendix.adoc` from where it was unpacked. Pinning the release pins the appendix, so a
  book carries the appendix of the release it was built with.

The appendix uses the attributes `runtime-repo`, `runtime-site` and `runtime-version`, and defines
the first two when a book has not. It must not refer to anything that one book has and another does
not, such as a chapter.

`mvn install` from this directory puts the jar in the local Maven repository, which is enough for
local builds of the other repositories.
