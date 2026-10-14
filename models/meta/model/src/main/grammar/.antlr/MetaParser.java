// Generated from c:/Users/pavel/nasdanika/models/meta/model/src/main/grammar/Meta.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MetaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, PACKAGE=21, NAMESPACE=22, PREFIX=23, VERSION=24, 
		IMPORT=25, ANNOTATION=26, AS=27, ABSTRACT=28, CLASS=29, EXTENDS=30, TYPE=31, 
		WRAPS=32, ENUM=33, OP=34, THROWS=35, CONTAINS=36, REFERS=37, OPPOSITE=38, 
		KEYS=39, DERIVED=40, READONLY=41, UNORDERED=42, UNIQUE=43, ID=44, TRUE=45, 
		FALSE=46, STRING_TYPE=47, NUMBER_TYPE=48, BOOLEAN_TYPE=49, BIGINT_TYPE=50, 
		DATE_TYPE=51, TIME_TYPE=52, DATE_TIME_TYPE=53, DURATION_TYPE=54, BINARY_TYPE=55, 
		ANY_TYPE=56, NULL_TYPE=57, VOID_TYPE=58, ELLIPSIS=59, IDENTIFIER=60, INTEGER=61, 
		DECIMAL=62, TEXT_BLOCK=63, STRING=64, OPAQUE=65, DOC_COMMENT=66, BLOCK_COMMENT=67, 
		LINE_COMMENT=68, WHITESPACE=69;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_packageClause = 2, 
		RULE_importDeclaration = 3, RULE_annotationDeclaration = 4, RULE_annotation = 5, 
		RULE_annotationDetail = 6, RULE_objectLiteral = 7, RULE_property = 8, 
		RULE_value = 9, RULE_reference = 10, RULE_referenceSegment = 11, RULE_classifierDeclaration = 12, 
		RULE_classDeclaration = 13, RULE_member = 14, RULE_dataTypeDeclaration = 15, 
		RULE_sourceType = 16, RULE_enumDeclaration = 17, RULE_enumLiteral = 18, 
		RULE_featureDeclaration = 19, RULE_referenceKind = 20, RULE_featureModifier = 21, 
		RULE_operationDeclaration = 22, RULE_parameter = 23, RULE_typeParameters = 24, 
		RULE_typeParameter = 25, RULE_typeReference = 26, RULE_unionMember = 27, 
		RULE_typeArguments = 28, RULE_primitiveType = 29, RULE_multiplicity = 30, 
		RULE_qualifiedTypeName = 31, RULE_qualifiedName = 32, RULE_typeName = 33, 
		RULE_name = 34, RULE_literal = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "packageClause", "importDeclaration", 
			"annotationDeclaration", "annotation", "annotationDetail", "objectLiteral", 
			"property", "value", "reference", "referenceSegment", "classifierDeclaration", 
			"classDeclaration", "member", "dataTypeDeclaration", "sourceType", "enumDeclaration", 
			"enumLiteral", "featureDeclaration", "referenceKind", "featureModifier", 
			"operationDeclaration", "parameter", "typeParameters", "typeParameter", 
			"typeReference", "unionMember", "typeArguments", "primitiveType", "multiplicity", 
			"qualifiedTypeName", "qualifiedName", "typeName", "name", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'('", "','", "')'", "'='", "'{'", "'}'", "':'", "'['", 
			"']'", "'.'", "';'", "'<'", "'>'", "'|'", "'*'", "'?'", "'+'", "'..'", 
			"'-'", "'package'", "'namespace'", "'prefix'", "'version'", "'import'", 
			"'annotation'", "'as'", "'abstract'", "'class'", "'extends'", "'type'", 
			"'wraps'", "'enum'", "'op'", "'throws'", "'contains'", "'refers'", "'opposite'", 
			"'keys'", "'derived'", "'readonly'", "'unordered'", "'unique'", "'id'", 
			"'true'", "'false'", "'string'", "'number'", "'boolean'", "'bigint'", 
			"'date'", "'time'", "'dateTime'", "'duration'", "'binary'", "'any'", 
			"'null'", "'void'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "PACKAGE", "NAMESPACE", 
			"PREFIX", "VERSION", "IMPORT", "ANNOTATION", "AS", "ABSTRACT", "CLASS", 
			"EXTENDS", "TYPE", "WRAPS", "ENUM", "OP", "THROWS", "CONTAINS", "REFERS", 
			"OPPOSITE", "KEYS", "DERIVED", "READONLY", "UNORDERED", "UNIQUE", "ID", 
			"TRUE", "FALSE", "STRING_TYPE", "NUMBER_TYPE", "BOOLEAN_TYPE", "BIGINT_TYPE", 
			"DATE_TYPE", "TIME_TYPE", "DATE_TIME_TYPE", "DURATION_TYPE", "BINARY_TYPE", 
			"ANY_TYPE", "NULL_TYPE", "VOID_TYPE", "ELLIPSIS", "IDENTIFIER", "INTEGER", 
			"DECIMAL", "TEXT_BLOCK", "STRING", "OPAQUE", "DOC_COMMENT", "BLOCK_COMMENT", 
			"LINE_COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Meta.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MetaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MetaParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<AnnotationDeclarationContext> annotationDeclaration() {
			return getRuleContexts(AnnotationDeclarationContext.class);
		}
		public AnnotationDeclarationContext annotationDeclaration(int i) {
			return getRuleContext(AnnotationDeclarationContext.class,i);
		}
		public List<ClassifierDeclarationContext> classifierDeclaration() {
			return getRuleContexts(ClassifierDeclarationContext.class);
		}
		public ClassifierDeclarationContext classifierDeclaration(int i) {
			return getRuleContext(ClassifierDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			packageDeclaration();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT || _la==ANNOTATION) {
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
					{
					setState(73);
					importDeclaration();
					}
					break;
				case ANNOTATION:
					{
					setState(74);
					annotationDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11542724610L) != 0)) {
				{
				{
				setState(80);
				classifierDeclaration();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(MetaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<PackageClauseContext> packageClause() {
			return getRuleContexts(PackageClauseContext.class);
		}
		public PackageClauseContext packageClause(int i) {
			return getRuleContext(PackageClauseContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(88);
				annotation();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(PACKAGE);
			setState(95);
			qualifiedName();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) {
				{
				{
				setState(96);
				packageClause();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageClauseContext extends ParserRuleContext {
		public PackageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageClause; }
	 
		public PackageClauseContext() { }
		public void copyFrom(PackageClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PackagePrefixContext extends PackageClauseContext {
		public TerminalNode PREFIX() { return getToken(MetaParser.PREFIX, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PackagePrefixContext(PackageClauseContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PackageNamespaceContext extends PackageClauseContext {
		public TerminalNode NAMESPACE() { return getToken(MetaParser.NAMESPACE, 0); }
		public TerminalNode STRING() { return getToken(MetaParser.STRING, 0); }
		public PackageNamespaceContext(PackageClauseContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PackageVersionContext extends PackageClauseContext {
		public TerminalNode VERSION() { return getToken(MetaParser.VERSION, 0); }
		public TerminalNode STRING() { return getToken(MetaParser.STRING, 0); }
		public PackageVersionContext(PackageClauseContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PackageQuotedPrefixContext extends PackageClauseContext {
		public TerminalNode PREFIX() { return getToken(MetaParser.PREFIX, 0); }
		public TerminalNode STRING() { return getToken(MetaParser.STRING, 0); }
		public PackageQuotedPrefixContext(PackageClauseContext ctx) { copyFrom(ctx); }
	}

	public final PackageClauseContext packageClause() throws RecognitionException {
		PackageClauseContext _localctx = new PackageClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageClause);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new PackageNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(NAMESPACE);
				setState(103);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new PackagePrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(PREFIX);
				setState(105);
				name();
				}
				break;
			case 3:
				_localctx = new PackageQuotedPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(PREFIX);
				setState(107);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new PackageVersionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(VERSION);
				setState(109);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MetaParser.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(MetaParser.STRING, 0); }
		public TerminalNode AS() { return getToken(MetaParser.AS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IMPORT);
			setState(113);
			match(STRING);
			setState(114);
			match(AS);
			setState(115);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationDeclarationContext extends ParserRuleContext {
		public TerminalNode ANNOTATION() { return getToken(MetaParser.ANNOTATION, 0); }
		public TerminalNode STRING() { return getToken(MetaParser.STRING, 0); }
		public TerminalNode AS() { return getToken(MetaParser.AS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AnnotationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDeclaration; }
	}

	public final AnnotationDeclarationContext annotationDeclaration() throws RecognitionException {
		AnnotationDeclarationContext _localctx = new AnnotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_annotationDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ANNOTATION);
			setState(118);
			match(STRING);
			setState(119);
			match(AS);
			setState(120);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	 
		public AnnotationContext() { }
		public void copyFrom(AnnotationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainAnnotationContext extends AnnotationContext {
		public TerminalNode STRING() { return getToken(MetaParser.STRING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationDetailContext> annotationDetail() {
			return getRuleContexts(AnnotationDetailContext.class);
		}
		public AnnotationDetailContext annotationDetail(int i) {
			return getRuleContext(AnnotationDetailContext.class,i);
		}
		public PlainAnnotationContext(AnnotationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FacetContext extends AnnotationContext {
		public QualifiedTypeNameContext qualifiedTypeName() {
			return getRuleContext(QualifiedTypeNameContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public FacetContext(AnnotationContext ctx) { copyFrom(ctx); }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_annotation);
		int _la;
		try {
			int _alt;
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new FacetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__0);
				setState(123);
				qualifiedTypeName();
				setState(124);
				objectLiteral();
				}
				break;
			case 2:
				_localctx = new PlainAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__0);
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(127);
					match(STRING);
					}
					break;
				case NAMESPACE:
				case PREFIX:
				case VERSION:
				case AS:
				case TYPE:
				case WRAPS:
				case THROWS:
				case OPPOSITE:
				case KEYS:
				case DERIVED:
				case READONLY:
				case UNORDERED:
				case UNIQUE:
				case ID:
				case STRING_TYPE:
				case NUMBER_TYPE:
				case BOOLEAN_TYPE:
				case BIGINT_TYPE:
				case DATE_TYPE:
				case TIME_TYPE:
				case DATE_TIME_TYPE:
				case DURATION_TYPE:
				case BINARY_TYPE:
				case ANY_TYPE:
				case NULL_TYPE:
				case VOID_TYPE:
				case IDENTIFIER:
					{
					setState(128);
					qualifiedName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(131);
					match(T__1);
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 4810338149927L) != 0)) {
						{
						setState(132);
						annotationDetail();
						setState(137);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(133);
								match(T__2);
								setState(134);
								annotationDetail();
								}
								} 
							}
							setState(139);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__2) {
							{
							setState(140);
							match(T__2);
							}
						}

						}
					}

					setState(145);
					match(T__3);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationDetailContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MetaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MetaParser.STRING, i);
		}
		public TerminalNode TEXT_BLOCK() { return getToken(MetaParser.TEXT_BLOCK, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AnnotationDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDetail; }
	}

	public final AnnotationDetailContext annotationDetail() throws RecognitionException {
		AnnotationDetailContext _localctx = new AnnotationDetailContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_annotationDetail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
			case PREFIX:
			case VERSION:
			case AS:
			case TYPE:
			case WRAPS:
			case THROWS:
			case OPPOSITE:
			case KEYS:
			case DERIVED:
			case READONLY:
			case UNORDERED:
			case UNIQUE:
			case ID:
			case STRING_TYPE:
			case NUMBER_TYPE:
			case BOOLEAN_TYPE:
			case BIGINT_TYPE:
			case DATE_TYPE:
			case TIME_TYPE:
			case DATE_TIME_TYPE:
			case DURATION_TYPE:
			case BINARY_TYPE:
			case ANY_TYPE:
			case NULL_TYPE:
			case VOID_TYPE:
			case IDENTIFIER:
				{
				setState(150);
				name();
				}
				break;
			case STRING:
				{
				setState(151);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(154);
			match(T__4);
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==TEXT_BLOCK || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__5);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 4810338149927L) != 0)) {
				{
				{
				setState(158);
				property();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(159);
					match(T__2);
					}
				}

				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MetaParser.STRING, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
			case PREFIX:
			case VERSION:
			case AS:
			case TYPE:
			case WRAPS:
			case THROWS:
			case OPPOSITE:
			case KEYS:
			case DERIVED:
			case READONLY:
			case UNORDERED:
			case UNIQUE:
			case ID:
			case STRING_TYPE:
			case NUMBER_TYPE:
			case BOOLEAN_TYPE:
			case BIGINT_TYPE:
			case DATE_TYPE:
			case TIME_TYPE:
			case DATE_TIME_TYPE:
			case DURATION_TYPE:
			case BINARY_TYPE:
			case ANY_TYPE:
			case NULL_TYPE:
			case VOID_TYPE:
			case IDENTIFIER:
				{
				setState(169);
				name();
				}
				break;
			case STRING:
				{
				setState(170);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(173);
			match(T__7);
			setState(174);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListValueContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ListValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedObjectValueContext extends ValueContext {
		public QualifiedTypeNameContext qualifiedTypeName() {
			return getRuleContext(QualifiedTypeNameContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TypedObjectValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectValueContext extends ValueContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullValueContext extends ValueContext {
		public TerminalNode NULL_TYPE() { return getToken(MetaParser.NULL_TYPE, 0); }
		public NullValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralValueContext extends ValueContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralValueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceValueContext extends ValueContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferenceValueContext(ValueContext ctx) { copyFrom(ctx); }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				literal();
				}
				break;
			case 2:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(NULL_TYPE);
				}
				break;
			case 3:
				_localctx = new ListValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(T__8);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 567453549393821705L) != 0)) {
					{
					{
					setState(179);
					value();
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(180);
						match(T__2);
						}
					}

					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new TypedObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				qualifiedTypeName();
				setState(190);
				objectLiteral();
				}
				break;
			case 5:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				objectLiteral();
				}
				break;
			case 6:
				_localctx = new ReferenceValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				reference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceContext extends ParserRuleContext {
		public List<ReferenceSegmentContext> referenceSegment() {
			return getRuleContexts(ReferenceSegmentContext.class);
		}
		public ReferenceSegmentContext referenceSegment(int i) {
			return getRuleContext(ReferenceSegmentContext.class,i);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			referenceSegment();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(197);
				match(T__10);
				setState(198);
				referenceSegment();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceSegmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MetaParser.IDENTIFIER, 0); }
		public TerminalNode NAMESPACE() { return getToken(MetaParser.NAMESPACE, 0); }
		public TerminalNode PREFIX() { return getToken(MetaParser.PREFIX, 0); }
		public TerminalNode VERSION() { return getToken(MetaParser.VERSION, 0); }
		public TerminalNode AS() { return getToken(MetaParser.AS, 0); }
		public TerminalNode WRAPS() { return getToken(MetaParser.WRAPS, 0); }
		public TerminalNode THROWS() { return getToken(MetaParser.THROWS, 0); }
		public TerminalNode OPPOSITE() { return getToken(MetaParser.OPPOSITE, 0); }
		public TerminalNode KEYS() { return getToken(MetaParser.KEYS, 0); }
		public TerminalNode DERIVED() { return getToken(MetaParser.DERIVED, 0); }
		public TerminalNode READONLY() { return getToken(MetaParser.READONLY, 0); }
		public TerminalNode UNORDERED() { return getToken(MetaParser.UNORDERED, 0); }
		public TerminalNode UNIQUE() { return getToken(MetaParser.UNIQUE, 0); }
		public TerminalNode ID() { return getToken(MetaParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(MetaParser.TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(MetaParser.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(MetaParser.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(MetaParser.BOOLEAN_TYPE, 0); }
		public TerminalNode BIGINT_TYPE() { return getToken(MetaParser.BIGINT_TYPE, 0); }
		public TerminalNode DATE_TYPE() { return getToken(MetaParser.DATE_TYPE, 0); }
		public TerminalNode TIME_TYPE() { return getToken(MetaParser.TIME_TYPE, 0); }
		public TerminalNode DATE_TIME_TYPE() { return getToken(MetaParser.DATE_TIME_TYPE, 0); }
		public TerminalNode DURATION_TYPE() { return getToken(MetaParser.DURATION_TYPE, 0); }
		public TerminalNode BINARY_TYPE() { return getToken(MetaParser.BINARY_TYPE, 0); }
		public TerminalNode ANY_TYPE() { return getToken(MetaParser.ANY_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(MetaParser.VOID_TYPE, 0); }
		public ReferenceSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceSegment; }
	}

	public final ReferenceSegmentContext referenceSegment() throws RecognitionException {
		ReferenceSegmentContext _localctx = new ReferenceSegmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_referenceSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1585161281806008320L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassifierDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public DataTypeDeclarationContext dataTypeDeclaration() {
			return getRuleContext(DataTypeDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassifierDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classifierDeclaration; }
	}

	public final ClassifierDeclarationContext classifierDeclaration() throws RecognitionException {
		ClassifierDeclarationContext _localctx = new ClassifierDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classifierDeclaration);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				dataTypeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MetaParser.CLASS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode ABSTRACT() { return getToken(MetaParser.ABSTRACT, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(MetaParser.EXTENDS, 0); }
		public List<TypeReferenceContext> typeReference() {
			return getRuleContexts(TypeReferenceContext.class);
		}
		public TypeReferenceContext typeReference(int i) {
			return getRuleContext(TypeReferenceContext.class,i);
		}
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(211);
				annotation();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(217);
				match(ABSTRACT);
				}
			}

			setState(220);
			match(CLASS);
			setState(221);
			typeName();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(222);
				typeParameters();
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(225);
				match(EXTENDS);
				setState(226);
				typeReference();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(227);
					match(T__2);
					setState(228);
					typeReference();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(236);
			match(T__5);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729275827620675590L) != 0) || _la==OPAQUE) {
				{
				{
				setState(237);
				member();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(238);
					match(T__11);
					}
				}

				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberContext extends ParserRuleContext {
		public FeatureDeclarationContext featureDeclaration() {
			return getRuleContext(FeatureDeclarationContext.class,0);
		}
		public OperationDeclarationContext operationDeclaration() {
			return getRuleContext(OperationDeclarationContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_member);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				featureDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				operationDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MetaParser.TYPE, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode AS() { return getToken(MetaParser.AS, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode WRAPS() { return getToken(MetaParser.WRAPS, 0); }
		public SourceTypeContext sourceType() {
			return getRuleContext(SourceTypeContext.class,0);
		}
		public DataTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeDeclaration; }
	}

	public final DataTypeDeclarationContext dataTypeDeclaration() throws RecognitionException {
		DataTypeDeclarationContext _localctx = new DataTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dataTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(252);
				annotation();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(TYPE);
			setState(259);
			typeName();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(260);
				typeParameters();
				}
			}

			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(263);
				match(AS);
				setState(264);
				primitiveType();
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WRAPS) {
				{
				setState(267);
				match(WRAPS);
				setState(268);
				sourceType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<SourceTypeContext> sourceType() {
			return getRuleContexts(SourceTypeContext.class);
		}
		public SourceTypeContext sourceType(int i) {
			return getRuleContext(SourceTypeContext.class,i);
		}
		public TerminalNode STRING() { return getToken(MetaParser.STRING, 0); }
		public SourceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceType; }
	}

	public final SourceTypeContext sourceType() throws RecognitionException {
		SourceTypeContext _localctx = new SourceTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sourceType);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
			case PREFIX:
			case VERSION:
			case AS:
			case TYPE:
			case WRAPS:
			case THROWS:
			case OPPOSITE:
			case KEYS:
			case DERIVED:
			case READONLY:
			case UNORDERED:
			case UNIQUE:
			case ID:
			case STRING_TYPE:
			case NUMBER_TYPE:
			case BOOLEAN_TYPE:
			case BIGINT_TYPE:
			case DATE_TYPE:
			case TIME_TYPE:
			case DATE_TIME_TYPE:
			case DURATION_TYPE:
			case BINARY_TYPE:
			case ANY_TYPE:
			case NULL_TYPE:
			case VOID_TYPE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				qualifiedName();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(272);
					match(T__12);
					setState(273);
					sourceType();
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(274);
						match(T__2);
						setState(275);
						sourceType();
						}
						}
						setState(280);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(281);
					match(T__13);
					}
				}

				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(285);
					match(T__8);
					setState(286);
					match(T__9);
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(MetaParser.ENUM, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<EnumLiteralContext> enumLiteral() {
			return getRuleContexts(EnumLiteralContext.class);
		}
		public EnumLiteralContext enumLiteral(int i) {
			return getRuleContext(EnumLiteralContext.class,i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(295);
				annotation();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(ENUM);
			setState(302);
			typeName();
			setState(303);
			match(T__5);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729276469881864194L) != 0)) {
				{
				setState(304);
				enumLiteral();
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(305);
						match(T__2);
						setState(306);
						enumLiteral();
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(312);
					match(T__2);
					}
				}

				}
			}

			setState(317);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumLiteralContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode AS() { return getToken(MetaParser.AS, 0); }
		public TerminalNode STRING() { return getToken(MetaParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(MetaParser.INTEGER, 0); }
		public EnumLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumLiteral; }
	}

	public final EnumLiteralContext enumLiteral() throws RecognitionException {
		EnumLiteralContext _localctx = new EnumLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(319);
				annotation();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			name();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(326);
				match(AS);
				setState(327);
				match(STRING);
				}
			}

			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(330);
				match(T__4);
				setState(331);
				match(INTEGER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureDeclarationContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<FeatureModifierContext> featureModifier() {
			return getRuleContexts(FeatureModifierContext.class);
		}
		public FeatureModifierContext featureModifier(int i) {
			return getRuleContext(FeatureModifierContext.class,i);
		}
		public ReferenceKindContext referenceKind() {
			return getRuleContext(ReferenceKindContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public TerminalNode OPPOSITE() { return getToken(MetaParser.OPPOSITE, 0); }
		public TerminalNode KEYS() { return getToken(MetaParser.KEYS, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FeatureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureDeclaration; }
	}

	public final FeatureDeclarationContext featureDeclaration() throws RecognitionException {
		FeatureDeclarationContext _localctx = new FeatureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_featureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(334);
				annotation();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34084860461056L) != 0)) {
				{
				{
				setState(340);
				featureModifier();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS || _la==REFERS) {
				{
				setState(346);
				referenceKind();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34084860461056L) != 0)) {
					{
					{
					setState(347);
					featureModifier();
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(355);
			typeReference();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(356);
				multiplicity();
				}
			}

			setState(359);
			name();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPPOSITE) {
				{
				setState(360);
				match(OPPOSITE);
				setState(361);
				name();
				}
			}

			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYS) {
				{
				setState(364);
				match(KEYS);
				setState(365);
				name();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(366);
					match(T__2);
					setState(367);
					name();
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(375);
				match(T__4);
				setState(376);
				literal();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceKindContext extends ParserRuleContext {
		public TerminalNode CONTAINS() { return getToken(MetaParser.CONTAINS, 0); }
		public TerminalNode REFERS() { return getToken(MetaParser.REFERS, 0); }
		public ReferenceKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceKind; }
	}

	public final ReferenceKindContext referenceKind() throws RecognitionException {
		ReferenceKindContext _localctx = new ReferenceKindContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_referenceKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !(_la==CONTAINS || _la==REFERS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureModifierContext extends ParserRuleContext {
		public TerminalNode DERIVED() { return getToken(MetaParser.DERIVED, 0); }
		public TerminalNode READONLY() { return getToken(MetaParser.READONLY, 0); }
		public TerminalNode UNORDERED() { return getToken(MetaParser.UNORDERED, 0); }
		public TerminalNode UNIQUE() { return getToken(MetaParser.UNIQUE, 0); }
		public TerminalNode ID() { return getToken(MetaParser.ID, 0); }
		public FeatureModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureModifier; }
	}

	public final FeatureModifierContext featureModifier() throws RecognitionException {
		FeatureModifierContext _localctx = new FeatureModifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_featureModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34084860461056L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationDeclarationContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(MetaParser.OP, 0); }
		public List<TypeReferenceContext> typeReference() {
			return getRuleContexts(TypeReferenceContext.class);
		}
		public TypeReferenceContext typeReference(int i) {
			return getRuleContext(TypeReferenceContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode THROWS() { return getToken(MetaParser.THROWS, 0); }
		public OperationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationDeclaration; }
	}

	public final OperationDeclarationContext operationDeclaration() throws RecognitionException {
		OperationDeclarationContext _localctx = new OperationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(383);
				annotation();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(OP);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(390);
				typeParameters();
				}
			}

			setState(393);
			typeReference();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(394);
				multiplicity();
				}
			}

			setState(397);
			name();
			setState(398);
			match(T__1);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729254713561448454L) != 0) || _la==OPAQUE) {
				{
				setState(399);
				parameter();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(400);
					match(T__2);
					setState(401);
					parameter();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(409);
			match(T__3);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(410);
				match(THROWS);
				setState(411);
				typeReference();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(412);
					match(T__2);
					setState(413);
					typeReference();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode UNORDERED() { return getToken(MetaParser.UNORDERED, 0); }
		public TerminalNode UNIQUE() { return getToken(MetaParser.UNIQUE, 0); }
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(MetaParser.ELLIPSIS, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(421);
				annotation();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNORDERED) {
				{
				setState(427);
				match(UNORDERED);
				}
			}

			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(430);
				match(UNIQUE);
				}
			}

			setState(433);
			typeReference();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(434);
				multiplicity();
				}
			}

			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(437);
				match(ELLIPSIS);
				}
			}

			setState(440);
			name();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(441);
				match(T__4);
				setState(442);
				literal();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T__12);
			setState(446);
			typeParameter();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(447);
				match(T__2);
				setState(448);
				typeParameter();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(MetaParser.EXTENDS, 0); }
		public List<TypeReferenceContext> typeReference() {
			return getRuleContexts(TypeReferenceContext.class);
		}
		public TypeReferenceContext typeReference(int i) {
			return getRuleContext(TypeReferenceContext.class,i);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(456);
				annotation();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
			typeName();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(463);
				match(EXTENDS);
				setState(464);
				typeReference();
				}
			}

			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(467);
				match(T__4);
				setState(468);
				typeReference();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeReferenceContext extends ParserRuleContext {
		public List<UnionMemberContext> unionMember() {
			return getRuleContexts(UnionMemberContext.class);
		}
		public UnionMemberContext unionMember(int i) {
			return getRuleContext(UnionMemberContext.class,i);
		}
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			unionMember();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(472);
				match(T__14);
				setState(473);
				unionMember();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionMemberContext extends ParserRuleContext {
		public UnionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMember; }
	 
		public UnionMemberContext() { }
		public void copyFrom(UnionMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeReferenceContext extends UnionMemberContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PrimitiveTypeReferenceContext(UnionMemberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassifierReferenceContext extends UnionMemberContext {
		public QualifiedTypeNameContext qualifiedTypeName() {
			return getRuleContext(QualifiedTypeNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassifierReferenceContext(UnionMemberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpaqueTypeReferenceContext extends UnionMemberContext {
		public TerminalNode OPAQUE() { return getToken(MetaParser.OPAQUE, 0); }
		public OpaqueTypeReferenceContext(UnionMemberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedTypeReferenceContext extends UnionMemberContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public ParenthesizedTypeReferenceContext(UnionMemberContext ctx) { copyFrom(ctx); }
	}

	public final UnionMemberContext unionMember() throws RecognitionException {
		UnionMemberContext _localctx = new UnionMemberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unionMember);
		int _la;
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_TYPE:
			case NUMBER_TYPE:
			case BOOLEAN_TYPE:
			case BIGINT_TYPE:
			case DATE_TYPE:
			case TIME_TYPE:
			case DATE_TIME_TYPE:
			case DURATION_TYPE:
			case BINARY_TYPE:
			case ANY_TYPE:
			case NULL_TYPE:
			case VOID_TYPE:
				_localctx = new PrimitiveTypeReferenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				_localctx = new ClassifierReferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				qualifiedTypeName();
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(481);
					typeArguments();
					}
				}

				}
				break;
			case OPAQUE:
				_localctx = new OpaqueTypeReferenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(OPAQUE);
				}
				break;
			case T__1:
				_localctx = new ParenthesizedTypeReferenceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				match(T__1);
				setState(486);
				typeReference();
				setState(487);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeReferenceContext> typeReference() {
			return getRuleContexts(TypeReferenceContext.class);
		}
		public TypeReferenceContext typeReference(int i) {
			return getRuleContext(TypeReferenceContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(T__12);
			setState(492);
			typeReference();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(493);
				match(T__2);
				setState(494);
				typeReference();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(MetaParser.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(MetaParser.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(MetaParser.BOOLEAN_TYPE, 0); }
		public TerminalNode BIGINT_TYPE() { return getToken(MetaParser.BIGINT_TYPE, 0); }
		public TerminalNode DATE_TYPE() { return getToken(MetaParser.DATE_TYPE, 0); }
		public TerminalNode TIME_TYPE() { return getToken(MetaParser.TIME_TYPE, 0); }
		public TerminalNode DATE_TIME_TYPE() { return getToken(MetaParser.DATE_TIME_TYPE, 0); }
		public TerminalNode DURATION_TYPE() { return getToken(MetaParser.DURATION_TYPE, 0); }
		public TerminalNode BINARY_TYPE() { return getToken(MetaParser.BINARY_TYPE, 0); }
		public TerminalNode ANY_TYPE() { return getToken(MetaParser.ANY_TYPE, 0); }
		public TerminalNode NULL_TYPE() { return getToken(MetaParser.NULL_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(MetaParser.VOID_TYPE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815068160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicityContext extends ParserRuleContext {
		public MultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicity; }
	 
		public MultiplicityContext() { }
		public void copyFrom(MultiplicityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeMultiplicityContext extends MultiplicityContext {
		public Token lower;
		public Token upper;
		public Token unbounded;
		public List<TerminalNode> INTEGER() { return getTokens(MetaParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(MetaParser.INTEGER, i);
		}
		public RangeMultiplicityContext(MultiplicityContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShorthandMultiplicityContext extends MultiplicityContext {
		public ShorthandMultiplicityContext(MultiplicityContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExactMultiplicityContext extends MultiplicityContext {
		public Token lower;
		public TerminalNode INTEGER() { return getToken(MetaParser.INTEGER, 0); }
		public ExactMultiplicityContext(MultiplicityContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyMultiplicityContext extends MultiplicityContext {
		public ManyMultiplicityContext(MultiplicityContext ctx) { copyFrom(ctx); }
	}

	public final MultiplicityContext multiplicity() throws RecognitionException {
		MultiplicityContext _localctx = new MultiplicityContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_multiplicity);
		int _la;
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new ManyMultiplicityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(T__8);
				setState(505);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new ShorthandMultiplicityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(T__8);
				setState(507);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ExactMultiplicityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(T__8);
				setState(510);
				((ExactMultiplicityContext)_localctx).lower = match(INTEGER);
				setState(511);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new RangeMultiplicityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				match(T__8);
				setState(513);
				((RangeMultiplicityContext)_localctx).lower = match(INTEGER);
				setState(514);
				match(T__18);
				setState(517);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
					{
					setState(515);
					((RangeMultiplicityContext)_localctx).upper = match(INTEGER);
					}
					break;
				case T__15:
					{
					setState(516);
					((RangeMultiplicityContext)_localctx).unbounded = match(T__15);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(519);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedTypeNameContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public QualifiedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedTypeName; }
	}

	public final QualifiedTypeNameContext qualifiedTypeName() throws RecognitionException {
		QualifiedTypeNameContext _localctx = new QualifiedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_qualifiedTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			typeName();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(523);
				match(T__10);
				setState(524);
				typeName();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			name();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(531);
				match(T__10);
				setState(532);
				name();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MetaParser.IDENTIFIER, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MetaParser.IDENTIFIER, 0); }
		public TerminalNode NAMESPACE() { return getToken(MetaParser.NAMESPACE, 0); }
		public TerminalNode PREFIX() { return getToken(MetaParser.PREFIX, 0); }
		public TerminalNode VERSION() { return getToken(MetaParser.VERSION, 0); }
		public TerminalNode AS() { return getToken(MetaParser.AS, 0); }
		public TerminalNode WRAPS() { return getToken(MetaParser.WRAPS, 0); }
		public TerminalNode THROWS() { return getToken(MetaParser.THROWS, 0); }
		public TerminalNode OPPOSITE() { return getToken(MetaParser.OPPOSITE, 0); }
		public TerminalNode KEYS() { return getToken(MetaParser.KEYS, 0); }
		public TerminalNode DERIVED() { return getToken(MetaParser.DERIVED, 0); }
		public TerminalNode READONLY() { return getToken(MetaParser.READONLY, 0); }
		public TerminalNode UNORDERED() { return getToken(MetaParser.UNORDERED, 0); }
		public TerminalNode UNIQUE() { return getToken(MetaParser.UNIQUE, 0); }
		public TerminalNode ID() { return getToken(MetaParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(MetaParser.TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(MetaParser.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(MetaParser.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(MetaParser.BOOLEAN_TYPE, 0); }
		public TerminalNode BIGINT_TYPE() { return getToken(MetaParser.BIGINT_TYPE, 0); }
		public TerminalNode DATE_TYPE() { return getToken(MetaParser.DATE_TYPE, 0); }
		public TerminalNode TIME_TYPE() { return getToken(MetaParser.TIME_TYPE, 0); }
		public TerminalNode DATE_TIME_TYPE() { return getToken(MetaParser.DATE_TIME_TYPE, 0); }
		public TerminalNode DURATION_TYPE() { return getToken(MetaParser.DURATION_TYPE, 0); }
		public TerminalNode BINARY_TYPE() { return getToken(MetaParser.BINARY_TYPE, 0); }
		public TerminalNode ANY_TYPE() { return getToken(MetaParser.ANY_TYPE, 0); }
		public TerminalNode NULL_TYPE() { return getToken(MetaParser.NULL_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(MetaParser.VOID_TYPE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729276469881864192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MetaParser.STRING, 0); }
		public TerminalNode TEXT_BLOCK() { return getToken(MetaParser.TEXT_BLOCK, 0); }
		public TerminalNode INTEGER() { return getToken(MetaParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(MetaParser.DECIMAL, 0); }
		public TerminalNode TRUE() { return getToken(MetaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MetaParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal);
		int _la;
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(STRING);
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(TEXT_BLOCK);
				}
				break;
			case T__19:
			case INTEGER:
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(544);
					match(T__19);
					}
				}

				setState(547);
				_la = _input.LA(1);
				if ( !(_la==INTEGER || _la==DECIMAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(549);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001E\u0229\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000L\b\u0000\n\u0000"+
		"\f\u0000O\t\u0000\u0001\u0000\u0005\u0000R\b\u0000\n\u0000\f\u0000U\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001Z\b\u0001\n\u0001"+
		"\f\u0001]\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001b\b\u0001"+
		"\n\u0001\f\u0001e\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002o\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0082\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0088\b\u0005\n\u0005\f\u0005\u008b\t\u0005\u0001\u0005\u0003\u0005\u008e"+
		"\b\u0005\u0003\u0005\u0090\b\u0005\u0001\u0005\u0003\u0005\u0093\b\u0005"+
		"\u0003\u0005\u0095\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0099\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00a1\b\u0007\u0005\u0007\u00a3\b\u0007\n\u0007\f\u0007"+
		"\u00a6\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00ac\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00b6\b\t\u0005\t\u00b8\b\t\n\t\f\t\u00bb\t\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c3\b\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00c8\b\n\n\n\f\n\u00cb\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00d2\b\f\u0001\r\u0005\r\u00d5\b\r\n\r\f\r\u00d8\t\r"+
		"\u0001\r\u0003\r\u00db\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e0\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00e6\b\r\n\r\f\r\u00e9\t\r\u0003\r"+
		"\u00eb\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f0\b\r\u0005\r\u00f2\b\r"+
		"\n\r\f\r\u00f5\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00fb\b\u000e\u0001\u000f\u0005\u000f\u00fe\b\u000f\n\u000f\f\u000f\u0101"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0106\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u010a\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u010e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0115\b\u0010\n\u0010\f\u0010\u0118\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u011c\b\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0120\b\u0010\n\u0010\f\u0010\u0123\t\u0010\u0001\u0010\u0003\u0010"+
		"\u0126\b\u0010\u0001\u0011\u0005\u0011\u0129\b\u0011\n\u0011\f\u0011\u012c"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0134\b\u0011\n\u0011\f\u0011\u0137\t\u0011\u0001\u0011"+
		"\u0003\u0011\u013a\b\u0011\u0003\u0011\u013c\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0005\u0012\u0141\b\u0012\n\u0012\f\u0012\u0144\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0149\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u014d\b\u0012\u0001\u0013\u0005\u0013\u0150\b"+
		"\u0013\n\u0013\f\u0013\u0153\t\u0013\u0001\u0013\u0005\u0013\u0156\b\u0013"+
		"\n\u0013\f\u0013\u0159\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u015d"+
		"\b\u0013\n\u0013\f\u0013\u0160\t\u0013\u0003\u0013\u0162\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0166\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u016b\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0171\b\u0013\n\u0013\f\u0013\u0174\t\u0013\u0003\u0013"+
		"\u0176\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u017a\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0005\u0016\u0181"+
		"\b\u0016\n\u0016\f\u0016\u0184\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0188\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u018c\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0193"+
		"\b\u0016\n\u0016\f\u0016\u0196\t\u0016\u0003\u0016\u0198\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u019f"+
		"\b\u0016\n\u0016\f\u0016\u01a2\t\u0016\u0003\u0016\u01a4\b\u0016\u0001"+
		"\u0017\u0005\u0017\u01a7\b\u0017\n\u0017\f\u0017\u01aa\t\u0017\u0001\u0017"+
		"\u0003\u0017\u01ad\b\u0017\u0001\u0017\u0003\u0017\u01b0\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01b4\b\u0017\u0001\u0017\u0003\u0017\u01b7"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01bc\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01c2\b\u0018"+
		"\n\u0018\f\u0018\u01c5\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0005"+
		"\u0019\u01ca\b\u0019\n\u0019\f\u0019\u01cd\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01d2\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u01d6\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01db\b"+
		"\u001a\n\u001a\f\u001a\u01de\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u01e3\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01ea\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u01f0\b\u001c\n\u001c\f\u001c\u01f3\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0206"+
		"\b\u001e\u0001\u001e\u0003\u001e\u0209\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u020e\b\u001f\n\u001f\f\u001f\u0211\t\u001f\u0001"+
		" \u0001 \u0001 \u0005 \u0216\b \n \f \u0219\t \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0003#\u0222\b#\u0001#\u0001#\u0001#\u0003#\u0227"+
		"\b#\u0001#\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\b\u0001"+
		"\u0000?@\b\u0000\u0016\u0018\u001b\u001b\u001f ##&,/8::<<\u0001\u0000"+
		"$%\u0001\u0000(,\u0001\u0000/:\u0001\u0000\u0010\u0012\u0007\u0000\u0016"+
		"\u0018\u001b\u001b\u001f ##&,/:<<\u0001\u0000=>\u0262\u0000H\u0001\u0000"+
		"\u0000\u0000\u0002[\u0001\u0000\u0000\u0000\u0004n\u0001\u0000\u0000\u0000"+
		"\u0006p\u0001\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\n\u0094\u0001"+
		"\u0000\u0000\u0000\f\u0098\u0001\u0000\u0000\u0000\u000e\u009d\u0001\u0000"+
		"\u0000\u0000\u0010\u00ab\u0001\u0000\u0000\u0000\u0012\u00c2\u0001\u0000"+
		"\u0000\u0000\u0014\u00c4\u0001\u0000\u0000\u0000\u0016\u00cc\u0001\u0000"+
		"\u0000\u0000\u0018\u00d1\u0001\u0000\u0000\u0000\u001a\u00d6\u0001\u0000"+
		"\u0000\u0000\u001c\u00fa\u0001\u0000\u0000\u0000\u001e\u00ff\u0001\u0000"+
		"\u0000\u0000 \u0125\u0001\u0000\u0000\u0000\"\u012a\u0001\u0000\u0000"+
		"\u0000$\u0142\u0001\u0000\u0000\u0000&\u0151\u0001\u0000\u0000\u0000("+
		"\u017b\u0001\u0000\u0000\u0000*\u017d\u0001\u0000\u0000\u0000,\u0182\u0001"+
		"\u0000\u0000\u0000.\u01a8\u0001\u0000\u0000\u00000\u01bd\u0001\u0000\u0000"+
		"\u00002\u01cb\u0001\u0000\u0000\u00004\u01d7\u0001\u0000\u0000\u00006"+
		"\u01e9\u0001\u0000\u0000\u00008\u01eb\u0001\u0000\u0000\u0000:\u01f6\u0001"+
		"\u0000\u0000\u0000<\u0208\u0001\u0000\u0000\u0000>\u020a\u0001\u0000\u0000"+
		"\u0000@\u0212\u0001\u0000\u0000\u0000B\u021a\u0001\u0000\u0000\u0000D"+
		"\u021c\u0001\u0000\u0000\u0000F\u0226\u0001\u0000\u0000\u0000HM\u0003"+
		"\u0002\u0001\u0000IL\u0003\u0006\u0003\u0000JL\u0003\b\u0004\u0000KI\u0001"+
		"\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NS\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PR\u0003\u0018\f\u0000QP\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005"+
		"\u0000\u0000\u0001W\u0001\u0001\u0000\u0000\u0000XZ\u0003\n\u0005\u0000"+
		"YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^_\u0005\u0015\u0000\u0000_c\u0003@ \u0000`b\u0003\u0004\u0002"+
		"\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0003\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000fg\u0005\u0016\u0000\u0000go\u0005@\u0000\u0000"+
		"hi\u0005\u0017\u0000\u0000io\u0003D\"\u0000jk\u0005\u0017\u0000\u0000"+
		"ko\u0005@\u0000\u0000lm\u0005\u0018\u0000\u0000mo\u0005@\u0000\u0000n"+
		"f\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000o\u0005\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0019\u0000\u0000qr\u0005@\u0000\u0000rs\u0005\u001b\u0000\u0000st\u0003"+
		"B!\u0000t\u0007\u0001\u0000\u0000\u0000uv\u0005\u001a\u0000\u0000vw\u0005"+
		"@\u0000\u0000wx\u0005\u001b\u0000\u0000xy\u0003D\"\u0000y\t\u0001\u0000"+
		"\u0000\u0000z{\u0005\u0001\u0000\u0000{|\u0003>\u001f\u0000|}\u0003\u000e"+
		"\u0007\u0000}\u0095\u0001\u0000\u0000\u0000~\u0081\u0005\u0001\u0000\u0000"+
		"\u007f\u0082\u0005@\u0000\u0000\u0080\u0082\u0003@ \u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0092"+
		"\u0001\u0000\u0000\u0000\u0083\u008f\u0005\u0002\u0000\u0000\u0084\u0089"+
		"\u0003\f\u0006\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0088\u0003"+
		"\f\u0006\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u008e\u0005\u0003\u0000\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000"+
		"\u0000\u0000\u008f\u0084\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0005\u0004"+
		"\u0000\u0000\u0092\u0083\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094z\u0001\u0000\u0000"+
		"\u0000\u0094~\u0001\u0000\u0000\u0000\u0095\u000b\u0001\u0000\u0000\u0000"+
		"\u0096\u0099\u0003D\"\u0000\u0097\u0099\u0005@\u0000\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0005\u0000\u0000\u009b\u009c"+
		"\u0007\u0000\u0000\u0000\u009c\r\u0001\u0000\u0000\u0000\u009d\u00a4\u0005"+
		"\u0006\u0000\u0000\u009e\u00a0\u0003\u0010\b\u0000\u009f\u00a1\u0005\u0003"+
		"\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u009e\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0007"+
		"\u0000\u0000\u00a8\u000f\u0001\u0000\u0000\u0000\u00a9\u00ac\u0003D\""+
		"\u0000\u00aa\u00ac\u0005@\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005\b\u0000\u0000\u00ae\u00af\u0003\u0012\t\u0000\u00af"+
		"\u0011\u0001\u0000\u0000\u0000\u00b0\u00c3\u0003F#\u0000\u00b1\u00c3\u0005"+
		"9\u0000\u0000\u00b2\u00b9\u0005\t\u0000\u0000\u00b3\u00b5\u0003\u0012"+
		"\t\u0000\u00b4\u00b6\u0005\u0003\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bc\u00c3\u0005\n\u0000\u0000\u00bd\u00be\u0003>\u001f\u0000"+
		"\u00be\u00bf\u0003\u000e\u0007\u0000\u00bf\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c3\u0003\u000e\u0007\u0000\u00c1\u00c3\u0003\u0014\n\u0000\u00c2"+
		"\u00b0\u0001\u0000\u0000\u0000\u00c2\u00b1\u0001\u0000\u0000\u0000\u00c2"+
		"\u00b2\u0001\u0000\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u0013\u0001\u0000\u0000\u0000\u00c4\u00c9\u0003\u0016\u000b\u0000\u00c5"+
		"\u00c6\u0005\u000b\u0000\u0000\u00c6\u00c8\u0003\u0016\u000b\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u0015\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0007\u0001\u0000\u0000\u00cd\u0017\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d2\u0003\u001a\r\u0000\u00cf\u00d2\u0003\u001e\u000f\u0000\u00d0\u00d2"+
		"\u0003\"\u0011\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u0019\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0003\n\u0005\u0000\u00d4\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00db\u0005\u001c"+
		"\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u001d"+
		"\u0000\u0000\u00dd\u00df\u0003B!\u0000\u00de\u00e0\u00030\u0018\u0000"+
		"\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00ea\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u001e\u0000\u0000"+
		"\u00e2\u00e7\u00034\u001a\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4"+
		"\u00e6\u00034\u001a\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e1\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00f3"+
		"\u0005\u0006\u0000\u0000\u00ed\u00ef\u0003\u001c\u000e\u0000\u00ee\u00f0"+
		"\u0005\f\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		"\u0007\u0000\u0000\u00f7\u001b\u0001\u0000\u0000\u0000\u00f8\u00fb\u0003"+
		"&\u0013\u0000\u00f9\u00fb\u0003,\u0016\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u001d\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\u0003\n\u0005\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u001f\u0000\u0000"+
		"\u0103\u0105\u0003B!\u0000\u0104\u0106\u00030\u0018\u0000\u0105\u0104"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0109"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u001b\u0000\u0000\u0108\u010a"+
		"\u0003:\u001d\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		" \u0000\u0000\u010c\u010e\u0003 \u0010\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u001f\u0001\u0000\u0000"+
		"\u0000\u010f\u011b\u0003@ \u0000\u0110\u0111\u0005\r\u0000\u0000\u0111"+
		"\u0116\u0003 \u0010\u0000\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u0115"+
		"\u0003 \u0010\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0118\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005\u000e\u0000\u0000\u011a\u011c\u0001"+
		"\u0000\u0000\u0000\u011b\u0110\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u0121\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"\t\u0000\u0000\u011e\u0120\u0005\n\u0000\u0000\u011f\u011d\u0001\u0000"+
		"\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0126\u0001\u0000"+
		"\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0126\u0005@\u0000"+
		"\u0000\u0125\u010f\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000"+
		"\u0000\u0126!\u0001\u0000\u0000\u0000\u0127\u0129\u0003\n\u0005\u0000"+
		"\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0005!\u0000\u0000\u012e\u012f\u0003B!\u0000\u012f\u013b"+
		"\u0005\u0006\u0000\u0000\u0130\u0135\u0003$\u0012\u0000\u0131\u0132\u0005"+
		"\u0003\u0000\u0000\u0132\u0134\u0003$\u0012\u0000\u0133\u0131\u0001\u0000"+
		"\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013a\u0005\u0003"+
		"\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0130\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0005\u0007\u0000\u0000\u013e#\u0001\u0000\u0000"+
		"\u0000\u013f\u0141\u0003\n\u0005\u0000\u0140\u013f\u0001\u0000\u0000\u0000"+
		"\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148\u0003D\"\u0000\u0146"+
		"\u0147\u0005\u001b\u0000\u0000\u0147\u0149\u0005@\u0000\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014c"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0005\u0000\u0000\u014b\u014d"+
		"\u0005=\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d%\u0001\u0000\u0000\u0000\u014e\u0150\u0003\n"+
		"\u0005\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0157\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0154\u0156\u0003*\u0015\u0000\u0155\u0154\u0001\u0000\u0000"+
		"\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0161\u0001\u0000\u0000"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015e\u0003(\u0014\u0000"+
		"\u015b\u015d\u0003*\u0015\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d"+
		"\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0161\u015a\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"\u0165\u00034\u001a\u0000\u0164\u0166\u0003<\u001e\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001"+
		"\u0000\u0000\u0000\u0167\u016a\u0003D\"\u0000\u0168\u0169\u0005&\u0000"+
		"\u0000\u0169\u016b\u0003D\"\u0000\u016a\u0168\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0175\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0005\'\u0000\u0000\u016d\u0172\u0003D\"\u0000\u016e\u016f"+
		"\u0005\u0003\u0000\u0000\u016f\u0171\u0003D\"\u0000\u0170\u016e\u0001"+
		"\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0176\u0001"+
		"\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u016c\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0179\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0005\u0005\u0000\u0000\u0178\u017a\u0003"+
		"F#\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000"+
		"\u0000\u017a\'\u0001\u0000\u0000\u0000\u017b\u017c\u0007\u0002\u0000\u0000"+
		"\u017c)\u0001\u0000\u0000\u0000\u017d\u017e\u0007\u0003\u0000\u0000\u017e"+
		"+\u0001\u0000\u0000\u0000\u017f\u0181\u0003\n\u0005\u0000\u0180\u017f"+
		"\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0185"+
		"\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0187"+
		"\u0005\"\u0000\u0000\u0186\u0188\u00030\u0018\u0000\u0187\u0186\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189\u018b\u00034\u001a\u0000\u018a\u018c\u0003<\u001e"+
		"\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0003D\"\u0000"+
		"\u018e\u0197\u0005\u0002\u0000\u0000\u018f\u0194\u0003.\u0017\u0000\u0190"+
		"\u0191\u0005\u0003\u0000\u0000\u0191\u0193\u0003.\u0017\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0198"+
		"\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u018f"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199\u01a3\u0005\u0004\u0000\u0000\u019a\u019b"+
		"\u0005#\u0000\u0000\u019b\u01a0\u00034\u001a\u0000\u019c\u019d\u0005\u0003"+
		"\u0000\u0000\u019d\u019f\u00034\u001a\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u019a\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4-\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a7\u0003\n\u0005\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7"+
		"\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ad\u0005*\u0000\u0000\u01ac\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b0\u0005+\u0000\u0000\u01af\u01ae\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b3\u00034\u001a\u0000\u01b2\u01b4\u0003<\u001e"+
		"\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b7\u0005;\u0000\u0000"+
		"\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01bb\u0003D\"\u0000\u01b9"+
		"\u01ba\u0005\u0005\u0000\u0000\u01ba\u01bc\u0003F#\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc/\u0001\u0000"+
		"\u0000\u0000\u01bd\u01be\u0005\r\u0000\u0000\u01be\u01c3\u00032\u0019"+
		"\u0000\u01bf\u01c0\u0005\u0003\u0000\u0000\u01c0\u01c2\u00032\u0019\u0000"+
		"\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0005\u000e\u0000\u0000\u01c71\u0001\u0000\u0000\u0000\u01c8"+
		"\u01ca\u0003\n\u0005\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01ce\u01d1\u0003B!\u0000\u01cf\u01d0\u0005\u001e"+
		"\u0000\u0000\u01d0\u01d2\u00034\u001a\u0000\u01d1\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0005\u0005\u0000\u0000\u01d4\u01d6\u00034\u001a\u0000"+
		"\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d63\u0001\u0000\u0000\u0000\u01d7\u01dc\u00036\u001b\u0000\u01d8\u01d9"+
		"\u0005\u000f\u0000\u0000\u01d9\u01db\u00036\u001b\u0000\u01da\u01d8\u0001"+
		"\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd5\u0001\u0000"+
		"\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01ea\u0003:\u001d"+
		"\u0000\u01e0\u01e2\u0003>\u001f\u0000\u01e1\u01e3\u00038\u001c\u0000\u01e2"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3"+
		"\u01ea\u0001\u0000\u0000\u0000\u01e4\u01ea\u0005A\u0000\u0000\u01e5\u01e6"+
		"\u0005\u0002\u0000\u0000\u01e6\u01e7\u00034\u001a\u0000\u01e7\u01e8\u0005"+
		"\u0004\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9\u01df\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e0\u0001\u0000\u0000\u0000\u01e9\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e5\u0001\u0000\u0000\u0000\u01ea7\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0005\r\u0000\u0000\u01ec\u01f1\u00034\u001a"+
		"\u0000\u01ed\u01ee\u0005\u0003\u0000\u0000\u01ee\u01f0\u00034\u001a\u0000"+
		"\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0005\u000e\u0000\u0000\u01f59\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0007\u0004\u0000\u0000\u01f7;\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0005\t\u0000\u0000\u01f9\u0209\u0005\n\u0000\u0000\u01fa\u01fb\u0005"+
		"\t\u0000\u0000\u01fb\u01fc\u0007\u0005\u0000\u0000\u01fc\u0209\u0005\n"+
		"\u0000\u0000\u01fd\u01fe\u0005\t\u0000\u0000\u01fe\u01ff\u0005=\u0000"+
		"\u0000\u01ff\u0209\u0005\n\u0000\u0000\u0200\u0201\u0005\t\u0000\u0000"+
		"\u0201\u0202\u0005=\u0000\u0000\u0202\u0205\u0005\u0013\u0000\u0000\u0203"+
		"\u0206\u0005=\u0000\u0000\u0204\u0206\u0005\u0010\u0000\u0000\u0205\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0001\u0000\u0000\u0000\u0207\u0209\u0005\n\u0000\u0000\u0208\u01f8\u0001"+
		"\u0000\u0000\u0000\u0208\u01fa\u0001\u0000\u0000\u0000\u0208\u01fd\u0001"+
		"\u0000\u0000\u0000\u0208\u0200\u0001\u0000\u0000\u0000\u0209=\u0001\u0000"+
		"\u0000\u0000\u020a\u020f\u0003B!\u0000\u020b\u020c\u0005\u000b\u0000\u0000"+
		"\u020c\u020e\u0003B!\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0211"+
		"\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0001\u0000\u0000\u0000\u0210?\u0001\u0000\u0000\u0000\u0211\u020f\u0001"+
		"\u0000\u0000\u0000\u0212\u0217\u0003D\"\u0000\u0213\u0214\u0005\u000b"+
		"\u0000\u0000\u0214\u0216\u0003D\"\u0000\u0215\u0213\u0001\u0000\u0000"+
		"\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218A\u0001\u0000\u0000\u0000"+
		"\u0219\u0217\u0001\u0000\u0000\u0000\u021a\u021b\u0005<\u0000\u0000\u021b"+
		"C\u0001\u0000\u0000\u0000\u021c\u021d\u0007\u0006\u0000\u0000\u021dE\u0001"+
		"\u0000\u0000\u0000\u021e\u0227\u0005@\u0000\u0000\u021f\u0227\u0005?\u0000"+
		"\u0000\u0220\u0222\u0005\u0014\u0000\u0000\u0221\u0220\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000"+
		"\u0000\u0223\u0227\u0007\u0007\u0000\u0000\u0224\u0227\u0005-\u0000\u0000"+
		"\u0225\u0227\u0005.\u0000\u0000\u0226\u021e\u0001\u0000\u0000\u0000\u0226"+
		"\u021f\u0001\u0000\u0000\u0000\u0226\u0221\u0001\u0000\u0000\u0000\u0226"+
		"\u0224\u0001\u0000\u0000\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227"+
		"G\u0001\u0000\u0000\u0000PKMS[cn\u0081\u0089\u008d\u008f\u0092\u0094\u0098"+
		"\u00a0\u00a4\u00ab\u00b5\u00b9\u00c2\u00c9\u00d1\u00d6\u00da\u00df\u00e7"+
		"\u00ea\u00ef\u00f3\u00fa\u00ff\u0105\u0109\u010d\u0116\u011b\u0121\u0125"+
		"\u012a\u0135\u0139\u013b\u0142\u0148\u014c\u0151\u0157\u015e\u0161\u0165"+
		"\u016a\u0172\u0175\u0179\u0182\u0187\u018b\u0194\u0197\u01a0\u01a3\u01a8"+
		"\u01ac\u01af\u01b3\u01b6\u01bb\u01c3\u01cb\u01d1\u01d5\u01dc\u01e2\u01e9"+
		"\u01f1\u0205\u0208\u020f\u0217\u0221\u0226";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}