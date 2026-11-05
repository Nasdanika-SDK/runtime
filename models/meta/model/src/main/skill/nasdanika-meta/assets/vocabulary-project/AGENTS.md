# Vocabulary

This project is a business vocabulary in Nasdanika Meta's text syntax.

- The vocabulary is in `src/main/meta/*.nmeta`, one package per file.
- Validate with `mvn -q test`. Problems are printed as `file:line:column: severity: message`.
  Fix every error before finishing; report warnings.
- A vocabulary without errors gets a glossary in `target/glossary/<file>.md`, generated: change
  the `.nmeta` file, not the glossary.
- Every class, data type, enumeration and feature has a `/** ... */` definition written for
  business readers.
- After a change, read the rules back to the people who own the words as plain statements, the
  ones you guessed first, and point them to the glossary.
- Use the `nasdanika-meta` skill for the syntax and conventions.
