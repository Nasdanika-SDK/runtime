# Vocabulary

This project is a business vocabulary in Nasdanika Meta's text syntax.

- The vocabulary is in `src/main/meta/*.nmeta`, one package per file.
- Validate with `mvn -q test`. Problems are printed as `file:line:column: severity: message`.
  Fix every error before finishing; report warnings.
- Every class, data type, enumeration and feature has a `/** ... */` definition written for
  business readers.
- Use the `nasdanika-meta` skill for the syntax and conventions.
