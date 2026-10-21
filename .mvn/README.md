# .mvn

This directory marks the root of the runtime's multi-module build. Maven sets
`maven.multiModuleProjectDirectory` to the nearest ancestor that has a `.mvn` directory, so a module
built from its own directory (`cd drawio && mvn verify`) still resolves paths relative to the
repository root. The Nasdanika Zephyr Books profile in the parent pom uses it to find `doc/zephyr`.
