/*
 * Textual syntax for the Nasdanika Meta model: metamodels written the way Xcore
 * writes Ecore models, parsed by the ANTLR runtime alone (no Xtext, no Eclipse).
 *
 * One file is one Meta Package:
 *
 *   /** Orders placed in the shop. Documentation is Markdown. *\/
 *   package shop namespace "https://example.org/shop" prefix "shop" version "1.0.0"
 *
 *   import "https://example.org/party" as party
 *   import "https://runtime.sdk.nasdanika.org/models/role" as role
 *   import "https://runtime.sdk.nasdanika.org/models/occupancy" as occupancy
 *   annotation "urn:org.nasdanika" as Nasdanika
 *
 *   type Instant as dateTime wraps java.time.Instant
 *
 *   enum Status { DRAFT, PLACED as "placed" = 1, SHIPPED as "shipped" = 2 }
 *
 *   abstract class Entity { id string code }
 *
 *   @Nasdanika(icon = "bi-cart")
 *   @role.Assignment { role: owner, party: "sales-team" }
 *   class Order extends Entity {
 *       @occupancy.Presence { jurisdiction: "CA", from: "2027-01-01" }
 *       string provinceCode
 *       Instant placedAt
 *       Status status = "DRAFT"
 *       refers party.Customer customer
 *       contains OrderLine[*] lines opposite order
 *       derived readonly number total
 *       op number discount(number rate = "0.1", string... codes) throws Error
 *   }
 *
 *   class OrderLine {
 *       refers Order order opposite lines
 *       string | number sku
 *       `Record<string, unknown>` extras
 *   }
 *
 * How the syntax maps to Meta:
 *
 *   - package: Package.name, namespace, prefix, version.
 *   - import "<namespace URI>" as alias: a qualified type name alias.Name becomes a
 *     ClassifierReference with that namespace and classifierName Name.
 *   - annotation "<source URI>" as Alias, then @Alias(key = "value") or
 *     @"<source URI>"(...): an Annotation with that source and details. Detail
 *     values are strings or text blocks.
 *   - @Type { property: value, ... }: a typed FACET. Type is a class, usually from an
 *     imported package (role.Assignment, occupancy.Presence); the builder resolves it,
 *     validates the object literal against it, and attaches the resulting object to
 *     the element as a facet (a containment relationship), so roles, occupancy and any
 *     other model's facets are data, not strings. Unknown facet types are warnings
 *     until the model that defines them is available. Values are literals, text
 *     blocks, lists in [ ], nested object literals (typed as Type { } or untyped as
 *     { }, the type then coming from the property), and references: a qualified name
 *     resolved against the property's type (an enum literal, an element in this file,
 *     an element of an imported package). Commas between properties and list items
 *     are optional. Aliases are file scoped, so a facet before the package line may
 *     use an alias imported after it.
 *   - Text blocks follow Java text block rules: three double quotes open and close
 *     them, the content starts on the line after the opening quotes, and incidental
 *     indentation is stripped. A word right after the opening quotes is a language
 *     tag, as in a Markdown code fence (json, yaml, cypher), telling the loader how to
 *     read the content. Text blocks are the escape hatch for definitions in formats
 *     that have no Meta model.
 *   - Documentation comments (/** ... *\/) go to the HIDDEN channel, not to the
 *     parser; they are the only tokens there, since other comments and whitespace are
 *     skipped. A builder takes the documentation comment immediately left of an
 *     element's first token (BufferedTokenStream.getHiddenTokensToLeft) as its Markdown
 *     documentation, so a documentation comment is never a syntax error wherever it
 *     appears. (A combined grammar cannot declare a custom channel.)
 *   - class: Class, with abstract, type parameters, supertypes, features, operations.
 *   - A feature with `contains` or `refers` is a Reference (containment for
 *     `contains`); any other feature is an Attribute. Modifiers: derived, readonly,
 *     unordered (ordered = false), unique, id (Attribute.identifying). A reference may
 *     name its opposite and its keys. `= literal` is the verbatim default value.
 *   - Multiplicity follows the type, as in Xcore: none is [0..1], [] and [*] are
 *     [0..*], [?] is [0..1], [+] is [1..*], [n] is [n..n], [n..m] with m a number or *.
 *   - Types: the Meta primitive kinds as lowercase keywords (string, number, boolean,
 *     bigint, date, time, dateTime, duration, binary, any, null, void), classifier
 *     names with optional type arguments, type parameter names (resolved by the
 *     builder against the enclosing scope), unions with |, intersections with &
 *     (binding tighter than |, as in TypeScript, so A & B | C is (A & B) | C),
 *     wildcards ?, ? extends T and ? super T as type arguments only
 *     (WildcardTypeReference), and `opaque text` in backticks for anything else
 *     (OpaqueTypeReference). A type parameter with several bounds is written
 *     <T extends A & B> and its bound is an IntersectionTypeReference.
 *   - type Name as <primitive kind> wraps <source type>: DataType with its
 *     representation and sourceType.
 *   - enum: Enum, literals with an optional serialized value (as "value") and ordinal.
 *   - op: Operation signature. Meta carries no bodies, so neither does the syntax.
 *     A parameter with ... is variadic.
 *
 * Keywords that commonly occur as names (namespace, prefix, version, as, wraps,
 * throws, opposite, keys, super, the modifiers, id, type, and the primitive kinds) are
 * reserved only where they are keywords: they are accepted as feature, operation,
 * parameter and literal names. Type names are plain identifiers; any identifier may
 * be escaped with a leading ^, as in Xcore, and the builder strips the ^.
 */
grammar Meta;

// --- Structure --------------------------------------------------------------------

compilationUnit
    : packageDeclaration (importDeclaration | annotationDeclaration)* classifierDeclaration* EOF
    ;

packageDeclaration
    : annotation* PACKAGE qualifiedName packageClause*
    ;

packageClause
    : NAMESPACE STRING      # packageNamespace
    | PREFIX name           # packagePrefix
    | PREFIX STRING         # packageQuotedPrefix
    | VERSION STRING        # packageVersion
    ;

/* The alias is a plain identifier because it is the first segment of a qualified type name. */
importDeclaration
    : IMPORT STRING AS typeName
    ;

annotationDeclaration
    : ANNOTATION STRING AS name
    ;

annotation
    : '@' qualifiedTypeName objectLiteral                                                           # facet
    | '@' (STRING | qualifiedName) ('(' (annotationDetail (',' annotationDetail)* ','?)? ')')?    # plainAnnotation
    ;

annotationDetail
    : (name | STRING) '=' (STRING | TEXT_BLOCK)
    ;

// --- Object literals (facets) ----------------------------------------------------

objectLiteral
    : '{' (property ','?)* '}'
    ;

property
    : (name | STRING) ':' value
    ;

value
    : literal                                   # literalValue
    | NULL_TYPE                                 # nullValue
    | '[' (value ','?)* ']'                     # listValue
    | qualifiedTypeName objectLiteral           # typedObjectValue
    | objectLiteral                             # objectValue
    | reference                                 # referenceValue
    ;

/*
 * A qualified name in value position: an enum literal, an element in this file, or an
 * element of an imported package, resolved against the property's type. Like a name,
 * except that null is always the null value.
 */
reference
    : referenceSegment ('.' referenceSegment)*
    ;

referenceSegment
    : IDENTIFIER
    | NAMESPACE | PREFIX | VERSION | AS | WRAPS | THROWS | OPPOSITE | KEYS | SUPER
    | DERIVED | READONLY | UNORDERED | UNIQUE | ID | TYPE
    | STRING_TYPE | NUMBER_TYPE | BOOLEAN_TYPE | BIGINT_TYPE | DATE_TYPE | TIME_TYPE
    | DATE_TIME_TYPE | DURATION_TYPE | BINARY_TYPE | ANY_TYPE | VOID_TYPE
    ;

classifierDeclaration
    : classDeclaration
    | dataTypeDeclaration
    | enumDeclaration
    ;

classDeclaration
    : annotation* ABSTRACT? CLASS typeName typeParameters? (EXTENDS typeReference (',' typeReference)*)?
      '{' (member ';'?)* '}'
    ;

member
    : featureDeclaration
    | operationDeclaration
    ;

dataTypeDeclaration
    : annotation* TYPE typeName typeParameters? (AS primitiveType)? (WRAPS sourceType)?
    ;

sourceType
    : qualifiedName ('<' sourceType (',' sourceType)* '>')? ('[' ']')*
    | STRING
    ;

enumDeclaration
    : annotation* ENUM typeName '{' (enumLiteral (',' enumLiteral)* ','?)? '}'
    ;

enumLiteral
    : annotation* name (AS STRING)? ('=' INTEGER)?
    ;

// --- Members ----------------------------------------------------------------------

featureDeclaration
    : annotation* featureModifier* (referenceKind featureModifier*)? typeReference multiplicity? name
      (OPPOSITE name)?
      (KEYS name (',' name)*)?
      ('=' literal)?
    ;

referenceKind
    : CONTAINS
    | REFERS
    ;

featureModifier
    : DERIVED
    | READONLY
    | UNORDERED
    | UNIQUE
    | ID
    ;

operationDeclaration
    : annotation* OP typeParameters? typeReference multiplicity? name
      '(' (parameter (',' parameter)*)? ')'
      (THROWS typeReference (',' typeReference)*)?
    ;

parameter
    : annotation* UNORDERED? UNIQUE? typeReference multiplicity? ELLIPSIS? name ('=' literal)?
    ;

// --- Types ------------------------------------------------------------------------

typeParameters
    : '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    : annotation* typeName (EXTENDS typeReference)? ('=' typeReference)?
    ;

/* A single member is that member, not a one-element union; likewise for intersections. */
typeReference
    : unionMember ('|' unionMember)*
    ;

unionMember
    : intersectionMember ('&' intersectionMember)*
    ;

intersectionMember
    : primitiveType                             # primitiveTypeReference
    | qualifiedTypeName typeArguments?          # classifierReference
    | OPAQUE                                    # opaqueTypeReference
    | '(' typeReference ')'                     # parenthesizedTypeReference
    ;

typeArguments
    : '<' typeArgument (',' typeArgument)* '>'
    ;

typeArgument
    : typeReference                             # typeArgumentReference
    | '?' ((EXTENDS | SUPER) typeReference)?    # wildcardTypeReference
    ;

primitiveType
    : STRING_TYPE
    | NUMBER_TYPE
    | BOOLEAN_TYPE
    | BIGINT_TYPE
    | DATE_TYPE
    | TIME_TYPE
    | DATE_TIME_TYPE
    | DURATION_TYPE
    | BINARY_TYPE
    | ANY_TYPE
    | NULL_TYPE
    | VOID_TYPE
    ;

multiplicity
    : '[' ']'                                                   # manyMultiplicity
    | '[' ('*' | '?' | '+') ']'                                 # shorthandMultiplicity
    | '[' lower=INTEGER ']'                                     # exactMultiplicity
    | '[' lower=INTEGER '..' (upper=INTEGER | unbounded='*') ']'  # rangeMultiplicity
    ;

// --- Names and literals -----------------------------------------------------------

/*
 * A qualified type name: a classifier in this package (Name), a classifier in an
 * imported package (alias.Name), or a type parameter in scope (T).
 */
qualifiedTypeName
    : typeName ('.' typeName)*
    ;

qualifiedName
    : name ('.' name)*
    ;

typeName
    : IDENTIFIER
    ;

/*
 * Names of packages, features, operations, parameters, literals and aliases: an
 * identifier, or a keyword that is only a keyword elsewhere.
 */
name
    : IDENTIFIER
    | NAMESPACE | PREFIX | VERSION | AS | WRAPS | THROWS | OPPOSITE | KEYS | SUPER
    | DERIVED | READONLY | UNORDERED | UNIQUE | ID | TYPE
    | STRING_TYPE | NUMBER_TYPE | BOOLEAN_TYPE | BIGINT_TYPE | DATE_TYPE | TIME_TYPE
    | DATE_TIME_TYPE | DURATION_TYPE | BINARY_TYPE | ANY_TYPE | NULL_TYPE | VOID_TYPE
    ;

literal
    : STRING
    | TEXT_BLOCK
    | '-'? (INTEGER | DECIMAL)
    | TRUE
    | FALSE
    ;

// --- Lexer ------------------------------------------------------------------------

PACKAGE     : 'package';
NAMESPACE   : 'namespace';
PREFIX      : 'prefix';
VERSION     : 'version';
IMPORT      : 'import';
ANNOTATION  : 'annotation';
AS          : 'as';
ABSTRACT    : 'abstract';
CLASS       : 'class';
EXTENDS     : 'extends';
SUPER       : 'super';
TYPE        : 'type';
WRAPS       : 'wraps';
ENUM        : 'enum';
OP          : 'op';
THROWS      : 'throws';
CONTAINS    : 'contains';
REFERS      : 'refers';
OPPOSITE    : 'opposite';
KEYS        : 'keys';
DERIVED     : 'derived';
READONLY    : 'readonly';
UNORDERED   : 'unordered';
UNIQUE      : 'unique';
ID          : 'id';
TRUE        : 'true';
FALSE       : 'false';

STRING_TYPE     : 'string';
NUMBER_TYPE     : 'number';
BOOLEAN_TYPE    : 'boolean';
BIGINT_TYPE     : 'bigint';
DATE_TYPE       : 'date';
TIME_TYPE       : 'time';
DATE_TIME_TYPE  : 'dateTime';
DURATION_TYPE   : 'duration';
BINARY_TYPE     : 'binary';
ANY_TYPE        : 'any';
NULL_TYPE       : 'null';
VOID_TYPE       : 'void';

ELLIPSIS    : '...';

/* A leading ^ escapes a keyword, as in Xcore; the builder strips it. */
IDENTIFIER
    : '^'? [\p{L}_$] [\p{L}\p{N}_$]*
    ;

INTEGER
    : [0-9]+
    ;

/* Requires a digit after the dot, so that 0..1 lexes as INTEGER '..' INTEGER. */
DECIMAL
    : [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)?
    | [0-9]+ [eE] [+-]? [0-9]+
    ;

/*
 * Before STRING. Three double quotes are a longer match than an empty string, so they
 * open a text block. The content may contain quotes and backslash escapes, including an
 * escaped closing delimiter.
 */
TEXT_BLOCK
    : '"""' ( '\\' . | ~'\\' )*? '"""'
    ;

STRING
    : '"' ( ESCAPE | ~["\\\r\n] )* '"'
    | '\'' ( ESCAPE | ~['\\\r\n] )* '\''
    ;

/* Verbatim type text for OpaqueTypeReference. */
OPAQUE
    : '`' ~'`'* '`'
    ;

fragment ESCAPE
    : '\\' ( ["'\\/bfnrt] | 'u' HEX HEX HEX HEX )
    ;

fragment HEX
    : [0-9a-fA-F]
    ;

/* Before BLOCK_COMMENT: for the same match, the first rule wins. '/**' followed by '/' is an empty block comment. */
DOC_COMMENT
    : '/**' ~'/' .*? '*/' -> channel(HIDDEN)
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

WHITESPACE
    : [ \t\r\n\u000C]+ -> skip
    ;
