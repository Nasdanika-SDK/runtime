// Generated from Meta.g4 by ANTLR 4.13.2
package org.nasdanika.sdk.runtime.models.meta.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MetaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, PACKAGE=22, NAMESPACE=23, PREFIX=24, 
		VERSION=25, IMPORT=26, ANNOTATION=27, AS=28, ABSTRACT=29, CLASS=30, EXTENDS=31, 
		SUPER=32, TYPE=33, WRAPS=34, ENUM=35, OP=36, THROWS=37, CONTAINS=38, REFERS=39, 
		OPPOSITE=40, KEYS=41, DERIVED=42, READONLY=43, UNORDERED=44, UNIQUE=45, 
		ID=46, TRUE=47, FALSE=48, STRING_TYPE=49, NUMBER_TYPE=50, BOOLEAN_TYPE=51, 
		BIGINT_TYPE=52, DATE_TYPE=53, TIME_TYPE=54, DATE_TIME_TYPE=55, DURATION_TYPE=56, 
		BINARY_TYPE=57, ANY_TYPE=58, NULL_TYPE=59, VOID_TYPE=60, ELLIPSIS=61, 
		IDENTIFIER=62, INTEGER=63, DECIMAL=64, TEXT_BLOCK=65, STRING=66, OPAQUE=67, 
		DOC_COMMENT=68, BLOCK_COMMENT=69, LINE_COMMENT=70, WHITESPACE=71;
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
		RULE_intersectionMember = 28, RULE_typeArguments = 29, RULE_typeArgument = 30, 
		RULE_primitiveType = 31, RULE_multiplicity = 32, RULE_qualifiedTypeName = 33, 
		RULE_qualifiedName = 34, RULE_typeName = 35, RULE_name = 36, RULE_literal = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "packageClause", "importDeclaration", 
			"annotationDeclaration", "annotation", "annotationDetail", "objectLiteral", 
			"property", "value", "reference", "referenceSegment", "classifierDeclaration", 
			"classDeclaration", "member", "dataTypeDeclaration", "sourceType", "enumDeclaration", 
			"enumLiteral", "featureDeclaration", "referenceKind", "featureModifier", 
			"operationDeclaration", "parameter", "typeParameters", "typeParameter", 
			"typeReference", "unionMember", "intersectionMember", "typeArguments", 
			"typeArgument", "primitiveType", "multiplicity", "qualifiedTypeName", 
			"qualifiedName", "typeName", "name", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'('", "','", "')'", "'='", "'{'", "'}'", "':'", "'['", 
			"']'", "'.'", "';'", "'<'", "'>'", "'|'", "'&'", "'?'", "'*'", "'+'", 
			"'..'", "'-'", "'package'", "'namespace'", "'prefix'", "'version'", "'import'", 
			"'annotation'", "'as'", "'abstract'", "'class'", "'extends'", "'super'", 
			"'type'", "'wraps'", "'enum'", "'op'", "'throws'", "'contains'", "'refers'", 
			"'opposite'", "'keys'", "'derived'", "'readonly'", "'unordered'", "'unique'", 
			"'id'", "'true'", "'false'", "'string'", "'number'", "'boolean'", "'bigint'", 
			"'date'", "'time'", "'dateTime'", "'duration'", "'binary'", "'any'", 
			"'null'", "'void'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "PACKAGE", 
			"NAMESPACE", "PREFIX", "VERSION", "IMPORT", "ANNOTATION", "AS", "ABSTRACT", 
			"CLASS", "EXTENDS", "SUPER", "TYPE", "WRAPS", "ENUM", "OP", "THROWS", 
			"CONTAINS", "REFERS", "OPPOSITE", "KEYS", "DERIVED", "READONLY", "UNORDERED", 
			"UNIQUE", "ID", "TRUE", "FALSE", "STRING_TYPE", "NUMBER_TYPE", "BOOLEAN_TYPE", 
			"BIGINT_TYPE", "DATE_TYPE", "TIME_TYPE", "DATE_TIME_TYPE", "DURATION_TYPE", 
			"BINARY_TYPE", "ANY_TYPE", "NULL_TYPE", "VOID_TYPE", "ELLIPSIS", "IDENTIFIER", 
			"INTEGER", "DECIMAL", "TEXT_BLOCK", "STRING", "OPAQUE", "DOC_COMMENT", 
			"BLOCK_COMMENT", "LINE_COMMENT", "WHITESPACE"
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
			setState(76);
			packageDeclaration();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT || _la==ANNOTATION) {
				{
				setState(79);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
					{
					setState(77);
					importDeclaration();
					}
					break;
				case ANNOTATION:
					{
					setState(78);
					annotationDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 44560285698L) != 0)) {
				{
				{
				setState(84);
				classifierDeclaration();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(92);
				annotation();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(PACKAGE);
			setState(99);
			qualifiedName();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				{
				setState(100);
				packageClause();
				}
				}
				setState(105);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new PackageNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(NAMESPACE);
				setState(107);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new PackagePrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(PREFIX);
				setState(109);
				name();
				}
				break;
			case 3:
				_localctx = new PackageQuotedPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(PREFIX);
				setState(111);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new PackageVersionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(VERSION);
				setState(113);
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
			setState(116);
			match(IMPORT);
			setState(117);
			match(STRING);
			setState(118);
			match(AS);
			setState(119);
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
			setState(121);
			match(ANNOTATION);
			setState(122);
			match(STRING);
			setState(123);
			match(AS);
			setState(124);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new FacetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__0);
				setState(127);
				qualifiedTypeName();
				setState(128);
				objectLiteral();
				}
				break;
			case 2:
				_localctx = new PlainAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__0);
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(131);
					match(STRING);
					}
					break;
				case NAMESPACE:
				case PREFIX:
				case VERSION:
				case AS:
				case SUPER:
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
					setState(132);
					qualifiedName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(135);
					match(T__1);
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 9620676300327L) != 0)) {
						{
						setState(136);
						annotationDetail();
						setState(141);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(137);
								match(T__2);
								setState(138);
								annotationDetail();
								}
								} 
							}
							setState(143);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						}
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__2) {
							{
							setState(144);
							match(T__2);
							}
						}

						}
					}

					setState(149);
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
			case PREFIX:
			case VERSION:
			case AS:
			case SUPER:
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
				setState(154);
				name();
				}
				break;
			case STRING:
				{
				setState(155);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
			match(T__4);
			setState(159);
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
			setState(161);
			match(T__5);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 9620676300327L) != 0)) {
				{
				{
				setState(162);
				property();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(163);
					match(T__2);
					}
				}

				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
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
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
			case PREFIX:
			case VERSION:
			case AS:
			case SUPER:
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
				setState(173);
				name();
				}
				break;
			case STRING:
				{
				setState(174);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(177);
			match(T__7);
			setState(178);
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				literal();
				}
				break;
			case 2:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(NULL_TYPE);
				}
				break;
			case 3:
				_localctx = new ListValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__8);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 2269814197637251081L) != 0)) {
					{
					{
					setState(183);
					value();
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(184);
						match(T__2);
						}
					}

					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new TypedObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				qualifiedTypeName();
				setState(194);
				objectLiteral();
				}
				break;
			case 5:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				objectLiteral();
				}
				break;
			case 6:
				_localctx = new ReferenceValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
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
			setState(200);
			referenceSegment();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(201);
				match(T__10);
				setState(202);
				referenceSegment();
				}
				}
				setState(207);
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
		public TerminalNode SUPER() { return getToken(MetaParser.SUPER, 0); }
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
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6340645131191844864L) != 0)) ) {
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				dataTypeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
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
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(215);
				annotation();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(221);
				match(ABSTRACT);
				}
			}

			setState(224);
			match(CLASS);
			setState(225);
			typeName();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(226);
				typeParameters();
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(229);
				match(EXTENDS);
				setState(230);
				typeReference();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(231);
					match(T__2);
					setState(232);
					typeReference();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(240);
			match(T__5);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6917103310482702342L) != 0) || _la==OPAQUE) {
				{
				{
				setState(241);
				member();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(242);
					match(T__11);
					}
				}

				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
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
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				featureDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(256);
				annotation();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(TYPE);
			setState(263);
			typeName();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(264);
				typeParameters();
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(267);
				match(AS);
				setState(268);
				primitiveType();
				}
			}

			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WRAPS) {
				{
				setState(271);
				match(WRAPS);
				setState(272);
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
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
			case PREFIX:
			case VERSION:
			case AS:
			case SUPER:
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
				setState(275);
				qualifiedName();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(276);
					match(T__12);
					setState(277);
					sourceType();
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(278);
						match(T__2);
						setState(279);
						sourceType();
						}
						}
						setState(284);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(285);
					match(T__13);
					}
				}

				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(289);
					match(T__8);
					setState(290);
					match(T__9);
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
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
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(299);
				annotation();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(ENUM);
			setState(306);
			typeName();
			setState(307);
			match(T__5);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6917105883495268354L) != 0)) {
				{
				setState(308);
				enumLiteral();
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(309);
						match(T__2);
						setState(310);
						enumLiteral();
						}
						} 
					}
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(316);
					match(T__2);
					}
				}

				}
			}

			setState(321);
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
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(323);
				annotation();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			name();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(330);
				match(AS);
				setState(331);
				match(STRING);
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(334);
				match(T__4);
				setState(335);
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
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(338);
				annotation();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339441844224L) != 0)) {
				{
				{
				setState(344);
				featureModifier();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS || _la==REFERS) {
				{
				setState(350);
				referenceKind();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339441844224L) != 0)) {
					{
					{
					setState(351);
					featureModifier();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(359);
			typeReference();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(360);
				multiplicity();
				}
			}

			setState(363);
			name();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPPOSITE) {
				{
				setState(364);
				match(OPPOSITE);
				setState(365);
				name();
				}
			}

			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYS) {
				{
				setState(368);
				match(KEYS);
				setState(369);
				name();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(370);
					match(T__2);
					setState(371);
					name();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(379);
				match(T__4);
				setState(380);
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
			setState(383);
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
			setState(385);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339441844224L) != 0)) ) {
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
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(387);
				annotation();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			match(OP);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(394);
				typeParameters();
				}
			}

			setState(397);
			typeReference();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(398);
				multiplicity();
				}
			}

			setState(401);
			name();
			setState(402);
			match(T__1);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6917018854245793798L) != 0) || _la==OPAQUE) {
				{
				setState(403);
				parameter();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(404);
					match(T__2);
					setState(405);
					parameter();
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(413);
			match(T__3);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(414);
				match(THROWS);
				setState(415);
				typeReference();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(416);
					match(T__2);
					setState(417);
					typeReference();
					}
					}
					setState(422);
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
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(425);
				annotation();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNORDERED) {
				{
				setState(431);
				match(UNORDERED);
				}
			}

			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(434);
				match(UNIQUE);
				}
			}

			setState(437);
			typeReference();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(438);
				multiplicity();
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(441);
				match(ELLIPSIS);
				}
			}

			setState(444);
			name();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(445);
				match(T__4);
				setState(446);
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
			setState(449);
			match(T__12);
			setState(450);
			typeParameter();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(451);
				match(T__2);
				setState(452);
				typeParameter();
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
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
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(460);
				annotation();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			typeName();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(467);
				match(EXTENDS);
				setState(468);
				typeReference();
				}
			}

			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(471);
				match(T__4);
				setState(472);
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
			setState(475);
			unionMember();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(476);
				match(T__14);
				setState(477);
				unionMember();
				}
				}
				setState(482);
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
		public List<IntersectionMemberContext> intersectionMember() {
			return getRuleContexts(IntersectionMemberContext.class);
		}
		public IntersectionMemberContext intersectionMember(int i) {
			return getRuleContext(IntersectionMemberContext.class,i);
		}
		public UnionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMember; }
	}

	public final UnionMemberContext unionMember() throws RecognitionException {
		UnionMemberContext _localctx = new UnionMemberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unionMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			intersectionMember();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(484);
				match(T__15);
				setState(485);
				intersectionMember();
				}
				}
				setState(490);
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
	public static class IntersectionMemberContext extends ParserRuleContext {
		public IntersectionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionMember; }
	 
		public IntersectionMemberContext() { }
		public void copyFrom(IntersectionMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeReferenceContext extends IntersectionMemberContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PrimitiveTypeReferenceContext(IntersectionMemberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassifierReferenceContext extends IntersectionMemberContext {
		public QualifiedTypeNameContext qualifiedTypeName() {
			return getRuleContext(QualifiedTypeNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassifierReferenceContext(IntersectionMemberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpaqueTypeReferenceContext extends IntersectionMemberContext {
		public TerminalNode OPAQUE() { return getToken(MetaParser.OPAQUE, 0); }
		public OpaqueTypeReferenceContext(IntersectionMemberContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedTypeReferenceContext extends IntersectionMemberContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public ParenthesizedTypeReferenceContext(IntersectionMemberContext ctx) { copyFrom(ctx); }
	}

	public final IntersectionMemberContext intersectionMember() throws RecognitionException {
		IntersectionMemberContext _localctx = new IntersectionMemberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_intersectionMember);
		int _la;
		try {
			setState(501);
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
				setState(491);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				_localctx = new ClassifierReferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				qualifiedTypeName();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(493);
					typeArguments();
					}
				}

				}
				break;
			case OPAQUE:
				_localctx = new OpaqueTypeReferenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				match(OPAQUE);
				}
				break;
			case T__1:
				_localctx = new ParenthesizedTypeReferenceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(497);
				match(T__1);
				setState(498);
				typeReference();
				setState(499);
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
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(T__12);
			setState(504);
			typeArgument();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(505);
				match(T__2);
				setState(506);
				typeArgument();
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
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
	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
	 
		public TypeArgumentContext() { }
		public void copyFrom(TypeArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WildcardTypeReferenceContext extends TypeArgumentContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(MetaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(MetaParser.SUPER, 0); }
		public WildcardTypeReferenceContext(TypeArgumentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentReferenceContext extends TypeArgumentContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TypeArgumentReferenceContext(TypeArgumentContext ctx) { copyFrom(ctx); }
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeArgument);
		int _la;
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
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
			case OPAQUE:
				_localctx = new TypeArgumentReferenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				typeReference();
				}
				break;
			case T__16:
				_localctx = new WildcardTypeReferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(T__16);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(516);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(517);
					typeReference();
					}
				}

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
		enterRule(_localctx, 62, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305280059260272640L) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_multiplicity);
		int _la;
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				_localctx = new ManyMultiplicityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(T__8);
				setState(525);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new ShorthandMultiplicityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(T__8);
				setState(527);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(528);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ExactMultiplicityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				match(T__8);
				setState(530);
				((ExactMultiplicityContext)_localctx).lower = match(INTEGER);
				setState(531);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new RangeMultiplicityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				match(T__8);
				setState(533);
				((RangeMultiplicityContext)_localctx).lower = match(INTEGER);
				setState(534);
				match(T__19);
				setState(537);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
					{
					setState(535);
					((RangeMultiplicityContext)_localctx).upper = match(INTEGER);
					}
					break;
				case T__17:
					{
					setState(536);
					((RangeMultiplicityContext)_localctx).unbounded = match(T__17);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(539);
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
		enterRule(_localctx, 66, RULE_qualifiedTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			typeName();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(543);
				match(T__10);
				setState(544);
				typeName();
				}
				}
				setState(549);
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
		enterRule(_localctx, 68, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			name();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(551);
				match(T__10);
				setState(552);
				name();
				}
				}
				setState(557);
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
		enterRule(_localctx, 70, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
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
		public TerminalNode SUPER() { return getToken(MetaParser.SUPER, 0); }
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
		enterRule(_localctx, 72, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6917105883495268352L) != 0)) ) {
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
		enterRule(_localctx, 74, RULE_literal);
		int _la;
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(STRING);
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(TEXT_BLOCK);
				}
				break;
			case T__20:
			case INTEGER:
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(564);
					match(T__20);
					}
				}

				setState(567);
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
				setState(568);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(569);
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
		"\u0004\u0001G\u023d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0005\u0000"+
		"V\b\u0000\n\u0000\f\u0000Y\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0005\u0001^\b\u0001\n\u0001\f\u0001a\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001f\b\u0001\n\u0001\f\u0001i\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002s\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0086\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u008c\b\u0005\n\u0005\f\u0005\u008f"+
		"\t\u0005\u0001\u0005\u0003\u0005\u0092\b\u0005\u0003\u0005\u0094\b\u0005"+
		"\u0001\u0005\u0003\u0005\u0097\b\u0005\u0003\u0005\u0099\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u009d\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a5\b\u0007\u0005"+
		"\u0007\u00a7\b\u0007\n\u0007\f\u0007\u00aa\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0003\b\u00b0\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ba\b\t\u0005\t\u00bc\b\t\n\t\f\t"+
		"\u00bf\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c7"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00cc\b\n\n\n\f\n\u00cf\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00d6\b\f\u0001\r\u0005"+
		"\r\u00d9\b\r\n\r\f\r\u00dc\t\r\u0001\r\u0003\r\u00df\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00e4\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ea"+
		"\b\r\n\r\f\r\u00ed\t\r\u0003\r\u00ef\b\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00f4\b\r\u0005\r\u00f6\b\r\n\r\f\r\u00f9\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00ff\b\u000e\u0001\u000f\u0005\u000f\u0102"+
		"\b\u000f\n\u000f\f\u000f\u0105\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u010a\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010e\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0112\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0119\b\u0010\n"+
		"\u0010\f\u0010\u011c\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0120"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0124\b\u0010\n\u0010\f\u0010"+
		"\u0127\t\u0010\u0001\u0010\u0003\u0010\u012a\b\u0010\u0001\u0011\u0005"+
		"\u0011\u012d\b\u0011\n\u0011\f\u0011\u0130\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0138\b\u0011"+
		"\n\u0011\f\u0011\u013b\t\u0011\u0001\u0011\u0003\u0011\u013e\b\u0011\u0003"+
		"\u0011\u0140\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0005\u0012\u0145"+
		"\b\u0012\n\u0012\f\u0012\u0148\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u014d\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0151\b"+
		"\u0012\u0001\u0013\u0005\u0013\u0154\b\u0013\n\u0013\f\u0013\u0157\t\u0013"+
		"\u0001\u0013\u0005\u0013\u015a\b\u0013\n\u0013\f\u0013\u015d\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0161\b\u0013\n\u0013\f\u0013\u0164\t\u0013"+
		"\u0003\u0013\u0166\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u016a\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u016f\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0175\b\u0013\n"+
		"\u0013\f\u0013\u0178\t\u0013\u0003\u0013\u017a\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u017e\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0005\u0016\u0185\b\u0016\n\u0016\f\u0016\u0188\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u018c\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0190\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0197\b\u0016\n\u0016\f\u0016\u019a\t\u0016\u0003"+
		"\u0016\u019c\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u01a3\b\u0016\n\u0016\f\u0016\u01a6\t\u0016\u0003\u0016"+
		"\u01a8\b\u0016\u0001\u0017\u0005\u0017\u01ab\b\u0017\n\u0017\f\u0017\u01ae"+
		"\t\u0017\u0001\u0017\u0003\u0017\u01b1\b\u0017\u0001\u0017\u0003\u0017"+
		"\u01b4\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01b8\b\u0017\u0001"+
		"\u0017\u0003\u0017\u01bb\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01c0\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u01c6\b\u0018\n\u0018\f\u0018\u01c9\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0005\u0019\u01ce\b\u0019\n\u0019\f\u0019\u01d1\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01d6\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u01da\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u01df\b\u001a\n\u001a\f\u001a\u01e2\t\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u01e7\b\u001b\n\u001b\f\u001b\u01ea\t\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01ef\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01f6\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01fc\b\u001d\n"+
		"\u001d\f\u001d\u01ff\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0207\b\u001e\u0003\u001e\u0209"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u021a\b \u0001"+
		" \u0003 \u021d\b \u0001!\u0001!\u0001!\u0005!\u0222\b!\n!\f!\u0225\t!"+
		"\u0001\"\u0001\"\u0001\"\u0005\"\u022a\b\"\n\"\f\"\u022d\t\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u0236\b%\u0001%\u0001%\u0001"+
		"%\u0003%\u023b\b%\u0001%\u0000\u0000&\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJ\u0000\t\u0001\u0000AB\b\u0000\u0017\u0019\u001c\u001c \"%%(.1:<<>>"+
		"\u0001\u0000&\'\u0001\u0000*.\u0001\u0000\u001f \u0001\u00001<\u0001\u0000"+
		"\u0011\u0013\u0007\u0000\u0017\u0019\u001c\u001c \"%%(.1<>>\u0001\u0000"+
		"?@\u0277\u0000L\u0001\u0000\u0000\u0000\u0002_\u0001\u0000\u0000\u0000"+
		"\u0004r\u0001\u0000\u0000\u0000\u0006t\u0001\u0000\u0000\u0000\by\u0001"+
		"\u0000\u0000\u0000\n\u0098\u0001\u0000\u0000\u0000\f\u009c\u0001\u0000"+
		"\u0000\u0000\u000e\u00a1\u0001\u0000\u0000\u0000\u0010\u00af\u0001\u0000"+
		"\u0000\u0000\u0012\u00c6\u0001\u0000\u0000\u0000\u0014\u00c8\u0001\u0000"+
		"\u0000\u0000\u0016\u00d0\u0001\u0000\u0000\u0000\u0018\u00d5\u0001\u0000"+
		"\u0000\u0000\u001a\u00da\u0001\u0000\u0000\u0000\u001c\u00fe\u0001\u0000"+
		"\u0000\u0000\u001e\u0103\u0001\u0000\u0000\u0000 \u0129\u0001\u0000\u0000"+
		"\u0000\"\u012e\u0001\u0000\u0000\u0000$\u0146\u0001\u0000\u0000\u0000"+
		"&\u0155\u0001\u0000\u0000\u0000(\u017f\u0001\u0000\u0000\u0000*\u0181"+
		"\u0001\u0000\u0000\u0000,\u0186\u0001\u0000\u0000\u0000.\u01ac\u0001\u0000"+
		"\u0000\u00000\u01c1\u0001\u0000\u0000\u00002\u01cf\u0001\u0000\u0000\u0000"+
		"4\u01db\u0001\u0000\u0000\u00006\u01e3\u0001\u0000\u0000\u00008\u01f5"+
		"\u0001\u0000\u0000\u0000:\u01f7\u0001\u0000\u0000\u0000<\u0208\u0001\u0000"+
		"\u0000\u0000>\u020a\u0001\u0000\u0000\u0000@\u021c\u0001\u0000\u0000\u0000"+
		"B\u021e\u0001\u0000\u0000\u0000D\u0226\u0001\u0000\u0000\u0000F\u022e"+
		"\u0001\u0000\u0000\u0000H\u0230\u0001\u0000\u0000\u0000J\u023a\u0001\u0000"+
		"\u0000\u0000LQ\u0003\u0002\u0001\u0000MP\u0003\u0006\u0003\u0000NP\u0003"+
		"\b\u0004\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RW\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TV\u0003\u0018\f\u0000"+
		"UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0000\u0000\u0001[\u0001\u0001\u0000\u0000\u0000"+
		"\\^\u0003\n\u0005\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u0016\u0000\u0000cg\u0003"+
		"D\"\u0000df\u0003\u0004\u0002\u0000ed\u0001\u0000\u0000\u0000fi\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"h\u0003\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0017"+
		"\u0000\u0000ks\u0005B\u0000\u0000lm\u0005\u0018\u0000\u0000ms\u0003H$"+
		"\u0000no\u0005\u0018\u0000\u0000os\u0005B\u0000\u0000pq\u0005\u0019\u0000"+
		"\u0000qs\u0005B\u0000\u0000rj\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000"+
		"\u0000rn\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000s\u0005\u0001"+
		"\u0000\u0000\u0000tu\u0005\u001a\u0000\u0000uv\u0005B\u0000\u0000vw\u0005"+
		"\u001c\u0000\u0000wx\u0003F#\u0000x\u0007\u0001\u0000\u0000\u0000yz\u0005"+
		"\u001b\u0000\u0000z{\u0005B\u0000\u0000{|\u0005\u001c\u0000\u0000|}\u0003"+
		"H$\u0000}\t\u0001\u0000\u0000\u0000~\u007f\u0005\u0001\u0000\u0000\u007f"+
		"\u0080\u0003B!\u0000\u0080\u0081\u0003\u000e\u0007\u0000\u0081\u0099\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0005\u0001\u0000\u0000\u0083\u0086\u0005"+
		"B\u0000\u0000\u0084\u0086\u0003D\"\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0096\u0001\u0000\u0000"+
		"\u0000\u0087\u0093\u0005\u0002\u0000\u0000\u0088\u008d\u0003\f\u0006\u0000"+
		"\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008c\u0003\f\u0006\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0005\u0003\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093"+
		"\u0088\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0005\u0004\u0000\u0000\u0096"+
		"\u0087\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0099\u0001\u0000\u0000\u0000\u0098~\u0001\u0000\u0000\u0000\u0098\u0082"+
		"\u0001\u0000\u0000\u0000\u0099\u000b\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0003H$\u0000\u009b\u009d\u0005B\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u0005\u0000\u0000\u009f\u00a0\u0007\u0000"+
		"\u0000\u0000\u00a0\r\u0001\u0000\u0000\u0000\u00a1\u00a8\u0005\u0006\u0000"+
		"\u0000\u00a2\u00a4\u0003\u0010\b\u0000\u00a3\u00a5\u0005\u0003\u0000\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0007\u0000\u0000"+
		"\u00ac\u000f\u0001\u0000\u0000\u0000\u00ad\u00b0\u0003H$\u0000\u00ae\u00b0"+
		"\u0005B\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\b\u0000\u0000\u00b2\u00b3\u0003\u0012\t\u0000\u00b3\u0011\u0001\u0000"+
		"\u0000\u0000\u00b4\u00c7\u0003J%\u0000\u00b5\u00c7\u0005;\u0000\u0000"+
		"\u00b6\u00bd\u0005\t\u0000\u0000\u00b7\u00b9\u0003\u0012\t\u0000\u00b8"+
		"\u00ba\u0005\u0003\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b7\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c7\u0005\n\u0000\u0000\u00c1\u00c2\u0003B!\u0000\u00c2\u00c3\u0003"+
		"\u000e\u0007\u0000\u00c3\u00c7\u0001\u0000\u0000\u0000\u00c4\u00c7\u0003"+
		"\u000e\u0007\u0000\u00c5\u00c7\u0003\u0014\n\u0000\u00c6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00b5\u0001\u0000\u0000\u0000\u00c6\u00b6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u0013\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cd\u0003\u0016\u000b\u0000\u00c9\u00ca\u0005\u000b"+
		"\u0000\u0000\u00ca\u00cc\u0003\u0016\u000b\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u0015\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0007\u0001"+
		"\u0000\u0000\u00d1\u0017\u0001\u0000\u0000\u0000\u00d2\u00d6\u0003\u001a"+
		"\r\u0000\u00d3\u00d6\u0003\u001e\u000f\u0000\u00d4\u00d6\u0003\"\u0011"+
		"\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u0019\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d9\u0003\n\u0005\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00df\u0005\u001d\u0000\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u001e\u0000\u0000"+
		"\u00e1\u00e3\u0003F#\u0000\u00e2\u00e4\u00030\u0018\u0000\u00e3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00ee"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u001f\u0000\u0000\u00e6\u00eb"+
		"\u00034\u001a\u0000\u00e7\u00e8\u0005\u0003\u0000\u0000\u00e8\u00ea\u0003"+
		"4\u001a\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f7\u0005\u0006"+
		"\u0000\u0000\u00f1\u00f3\u0003\u001c\u000e\u0000\u00f2\u00f4\u0005\f\u0000"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0007\u0000"+
		"\u0000\u00fb\u001b\u0001\u0000\u0000\u0000\u00fc\u00ff\u0003&\u0013\u0000"+
		"\u00fd\u00ff\u0003,\u0016\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u001d\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u0003\n\u0005\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0005!\u0000\u0000\u0107\u0109\u0003"+
		"F#\u0000\u0108\u010a\u00030\u0018\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0005\u001c\u0000\u0000\u010c\u010e\u0003>\u001f\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u0110\u0005\"\u0000\u0000\u0110"+
		"\u0112\u0003 \u0010\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0001\u0000\u0000\u0000\u0112\u001f\u0001\u0000\u0000\u0000\u0113\u011f"+
		"\u0003D\"\u0000\u0114\u0115\u0005\r\u0000\u0000\u0115\u011a\u0003 \u0010"+
		"\u0000\u0116\u0117\u0005\u0003\u0000\u0000\u0117\u0119\u0003 \u0010\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0005\u000e\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000"+
		"\u011f\u0114\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\u0125\u0001\u0000\u0000\u0000\u0121\u0122\u0005\t\u0000\u0000\u0122"+
		"\u0124\u0005\n\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u012a\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u012a\u0005B\u0000\u0000\u0129\u0113\u0001"+
		"\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a!\u0001\u0000"+
		"\u0000\u0000\u012b\u012d\u0003\n\u0005\u0000\u012c\u012b\u0001\u0000\u0000"+
		"\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005#\u0000\u0000"+
		"\u0132\u0133\u0003F#\u0000\u0133\u013f\u0005\u0006\u0000\u0000\u0134\u0139"+
		"\u0003$\u0012\u0000\u0135\u0136\u0005\u0003\u0000\u0000\u0136\u0138\u0003"+
		"$\u0012\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013c\u013e\u0005\u0003\u0000\u0000\u013d\u013c\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000"+
		"\u0000\u0000\u013f\u0134\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0007"+
		"\u0000\u0000\u0142#\u0001\u0000\u0000\u0000\u0143\u0145\u0003\n\u0005"+
		"\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0149\u014c\u0003H$\u0000\u014a\u014b\u0005\u001c\u0000\u0000\u014b"+
		"\u014d\u0005B\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0005\u0005\u0000\u0000\u014f\u0151\u0005?\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151%\u0001\u0000"+
		"\u0000\u0000\u0152\u0154\u0003\n\u0005\u0000\u0153\u0152\u0001\u0000\u0000"+
		"\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u015b\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015a\u0003*\u0015\u0000"+
		"\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u0165\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000"+
		"\u015e\u0162\u0003(\u0014\u0000\u015f\u0161\u0003*\u0015\u0000\u0160\u015f"+
		"\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0166"+
		"\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u015e"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u00034\u001a\u0000\u0168\u016a\u0003"+
		"@ \u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016e\u0003H$\u0000\u016c"+
		"\u016d\u0005(\u0000\u0000\u016d\u016f\u0003H$\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0179\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0005)\u0000\u0000\u0171\u0176\u0003H$"+
		"\u0000\u0172\u0173\u0005\u0003\u0000\u0000\u0173\u0175\u0003H$\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176"+
		"\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177"+
		"\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179"+
		"\u0170\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a"+
		"\u017d\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0005\u0000\u0000\u017c"+
		"\u017e\u0003J%\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001"+
		"\u0000\u0000\u0000\u017e\'\u0001\u0000\u0000\u0000\u017f\u0180\u0007\u0002"+
		"\u0000\u0000\u0180)\u0001\u0000\u0000\u0000\u0181\u0182\u0007\u0003\u0000"+
		"\u0000\u0182+\u0001\u0000\u0000\u0000\u0183\u0185\u0003\n\u0005\u0000"+
		"\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000\u0000\u0000"+
		"\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0189\u018b\u0005$\u0000\u0000\u018a\u018c\u00030\u0018\u0000\u018b\u018a"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d\u018f\u00034\u001a\u0000\u018e\u0190\u0003"+
		"@ \u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0003H$\u0000\u0192"+
		"\u019b\u0005\u0002\u0000\u0000\u0193\u0198\u0003.\u0017\u0000\u0194\u0195"+
		"\u0005\u0003\u0000\u0000\u0195\u0197\u0003.\u0017\u0000\u0196\u0194\u0001"+
		"\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019c\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u0193\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019d\u01a7\u0005\u0004\u0000\u0000\u019e\u019f\u0005"+
		"%\u0000\u0000\u019f\u01a4\u00034\u001a\u0000\u01a0\u01a1\u0005\u0003\u0000"+
		"\u0000\u01a1\u01a3\u00034\u001a\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u019e\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8-\u0001\u0000\u0000\u0000\u01a9"+
		"\u01ab\u0003\n\u0005\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac"+
		"\u0001\u0000\u0000\u0000\u01af\u01b1\u0005,\u0000\u0000\u01b0\u01af\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b4\u0005-\u0000\u0000\u01b3\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b7\u00034\u001a\u0000\u01b6\u01b8\u0003@ \u0000"+
		"\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01bb\u0005=\u0000\u0000\u01ba"+
		"\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bf\u0003H$\u0000\u01bd\u01be\u0005"+
		"\u0005\u0000\u0000\u01be\u01c0\u0003J%\u0000\u01bf\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0/\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0005\r\u0000\u0000\u01c2\u01c7\u00032\u0019\u0000\u01c3"+
		"\u01c4\u0005\u0003\u0000\u0000\u01c4\u01c6\u00032\u0019\u0000\u01c5\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01ca"+
		"\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0005\u000e\u0000\u0000\u01cb1\u0001\u0000\u0000\u0000\u01cc\u01ce\u0003"+
		"\n\u0005\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d5\u0003F#\u0000\u01d3\u01d4\u0005\u001f\u0000\u0000"+
		"\u01d4\u01d6\u00034\u001a\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0005\u0005\u0000\u0000\u01d8\u01da\u00034\u001a\u0000\u01d9\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da3\u0001"+
		"\u0000\u0000\u0000\u01db\u01e0\u00036\u001b\u0000\u01dc\u01dd\u0005\u000f"+
		"\u0000\u0000\u01dd\u01df\u00036\u001b\u0000\u01de\u01dc\u0001\u0000\u0000"+
		"\u0000\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e15\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e8\u00038\u001c\u0000\u01e4"+
		"\u01e5\u0005\u0010\u0000\u0000\u01e5\u01e7\u00038\u001c\u0000\u01e6\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e97\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01f6\u0003"+
		">\u001f\u0000\u01ec\u01ee\u0003B!\u0000\u01ed\u01ef\u0003:\u001d\u0000"+
		"\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f6\u0001\u0000\u0000\u0000\u01f0\u01f6\u0005C\u0000\u0000\u01f1"+
		"\u01f2\u0005\u0002\u0000\u0000\u01f2\u01f3\u00034\u001a\u0000\u01f3\u01f4"+
		"\u0005\u0004\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01eb"+
		"\u0001\u0000\u0000\u0000\u01f5\u01ec\u0001\u0000\u0000\u0000\u01f5\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f1\u0001\u0000\u0000\u0000\u01f69\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f8\u0005\r\u0000\u0000\u01f8\u01fd\u0003<"+
		"\u001e\u0000\u01f9\u01fa\u0005\u0003\u0000\u0000\u01fa\u01fc\u0003<\u001e"+
		"\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0005\u000e\u0000\u0000\u0201;\u0001\u0000\u0000\u0000"+
		"\u0202\u0209\u00034\u001a\u0000\u0203\u0206\u0005\u0011\u0000\u0000\u0204"+
		"\u0205\u0007\u0004\u0000\u0000\u0205\u0207\u00034\u001a\u0000\u0206\u0204"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0209"+
		"\u0001\u0000\u0000\u0000\u0208\u0202\u0001\u0000\u0000\u0000\u0208\u0203"+
		"\u0001\u0000\u0000\u0000\u0209=\u0001\u0000\u0000\u0000\u020a\u020b\u0007"+
		"\u0005\u0000\u0000\u020b?\u0001\u0000\u0000\u0000\u020c\u020d\u0005\t"+
		"\u0000\u0000\u020d\u021d\u0005\n\u0000\u0000\u020e\u020f\u0005\t\u0000"+
		"\u0000\u020f\u0210\u0007\u0006\u0000\u0000\u0210\u021d\u0005\n\u0000\u0000"+
		"\u0211\u0212\u0005\t\u0000\u0000\u0212\u0213\u0005?\u0000\u0000\u0213"+
		"\u021d\u0005\n\u0000\u0000\u0214\u0215\u0005\t\u0000\u0000\u0215\u0216"+
		"\u0005?\u0000\u0000\u0216\u0219\u0005\u0014\u0000\u0000\u0217\u021a\u0005"+
		"?\u0000\u0000\u0218\u021a\u0005\u0012\u0000\u0000\u0219\u0217\u0001\u0000"+
		"\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000"+
		"\u0000\u0000\u021b\u021d\u0005\n\u0000\u0000\u021c\u020c\u0001\u0000\u0000"+
		"\u0000\u021c\u020e\u0001\u0000\u0000\u0000\u021c\u0211\u0001\u0000\u0000"+
		"\u0000\u021c\u0214\u0001\u0000\u0000\u0000\u021dA\u0001\u0000\u0000\u0000"+
		"\u021e\u0223\u0003F#\u0000\u021f\u0220\u0005\u000b\u0000\u0000\u0220\u0222"+
		"\u0003F#\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000"+
		"\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000"+
		"\u0000\u0000\u0224C\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000"+
		"\u0000\u0226\u022b\u0003H$\u0000\u0227\u0228\u0005\u000b\u0000\u0000\u0228"+
		"\u022a\u0003H$\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u022a\u022d\u0001"+
		"\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022c\u0001"+
		"\u0000\u0000\u0000\u022cE\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000"+
		"\u0000\u0000\u022e\u022f\u0005>\u0000\u0000\u022fG\u0001\u0000\u0000\u0000"+
		"\u0230\u0231\u0007\u0007\u0000\u0000\u0231I\u0001\u0000\u0000\u0000\u0232"+
		"\u023b\u0005B\u0000\u0000\u0233\u023b\u0005A\u0000\u0000\u0234\u0236\u0005"+
		"\u0015\u0000\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u023b\u0007"+
		"\b\u0000\u0000\u0238\u023b\u0005/\u0000\u0000\u0239\u023b\u00050\u0000"+
		"\u0000\u023a\u0232\u0001\u0000\u0000\u0000\u023a\u0233\u0001\u0000\u0000"+
		"\u0000\u023a\u0235\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000"+
		"\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023bK\u0001\u0000\u0000\u0000"+
		"SOQW_gr\u0085\u008d\u0091\u0093\u0096\u0098\u009c\u00a4\u00a8\u00af\u00b9"+
		"\u00bd\u00c6\u00cd\u00d5\u00da\u00de\u00e3\u00eb\u00ee\u00f3\u00f7\u00fe"+
		"\u0103\u0109\u010d\u0111\u011a\u011f\u0125\u0129\u012e\u0139\u013d\u013f"+
		"\u0146\u014c\u0150\u0155\u015b\u0162\u0165\u0169\u016e\u0176\u0179\u017d"+
		"\u0186\u018b\u018f\u0198\u019b\u01a4\u01a7\u01ac\u01b0\u01b3\u01b7\u01ba"+
		"\u01bf\u01c7\u01cf\u01d5\u01d9\u01e0\u01e8\u01ee\u01f5\u01fd\u0206\u0208"+
		"\u0219\u021c\u0223\u022b\u0235\u023a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}