// Generated from C:/Users/hazem/OneDrive/Desktop/4/compiler_test/CompilerProject/src/antler/AngularParser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WS=3, At=4, BACKTICK=5, Component=6, 
		Selector=7, Standalone=8, Imports=9, Template=10, Styles=11, OpenBracket=12, 
		CloseBracket=13, OpenParen=14, CloseParen=15, OpenBrace=16, CloseBrace=17, 
		SemiColon=18, Comma=19, Assign=20, QuestionMark=21, QuestionMarkDot=22, 
		Colon=23, Ellipsis=24, Dot=25, PlusPlus=26, MinusMinus=27, Plus=28, Minus=29, 
		BitNot=30, Not=31, Multiply=32, Divide=33, Modulus=34, NullCoalesce=35, 
		Hashtag=36, RightShiftArithmetic=37, LeftShiftArithmetic=38, RightShiftLogical=39, 
		LessThan=40, MoreThan=41, LessThanEquals=42, GreaterThanEquals=43, Equals_=44, 
		NotEquals=45, IdentityEquals=46, IdentityNotEquals=47, BitAnd=48, BitXOr=49, 
		BitOr=50, And=51, Or=52, MultiplyAssign=53, DivideAssign=54, ModulusAssign=55, 
		PlusAssign=56, MinusAssign=57, LeftShiftArithmeticAssign=58, RightShiftArithmeticAssign=59, 
		RightShiftLogicalAssign=60, BitAndAssign=61, BitXorAssign=62, BitOrAssign=63, 
		NullishCoalescingAssign=64, ARROW=65, SinglQuat=66, ReactCreatElement=67, 
		Break=68, Do=69, Instanceof=70, Typeof=71, Case=72, Else=73, ElseIf=74, 
		New=75, Var=76, Let=77, Catch=78, Finally=79, Return=80, Void=81, Continue=82, 
		For=83, Switch=84, While=85, Debugger=86, Function_=87, This=88, With=89, 
		Default=90, If=91, Throw=92, Delete=93, In=94, Try=95, As=96, From=97, 
		Of=98, NullLiteral=99, BooleanLiteral=100, StringLiteral=101, Src=102, 
		Class=103, Enum=104, Extends=105, Super=106, Const=107, Export=108, Import=109, 
		Implements=110, StrictLet=111, Private=112, Public=113, Interface=114, 
		Package=115, Protected=116, Static=117, Map=118, UseRef=119, UseState=120, 
		UseEffect=121, Ws=122, DecimalLiteral=123, Identifier=124, TagName=125, 
		ID=126, Number=127, NgIfDirective=128, NgForDirective=129, NgModule=130, 
		Injectable=131, Pipe=132, OPEN_MUSTACHE=133, CLOSE_MUSTACHE=134, CLOSE_TAG=135, 
		ObjectLiteral=136;
	public static final int
		RULE_program = 0, RULE_eos = 1, RULE_importStatement = 2, RULE_importFromBlock = 3, 
		RULE_moduleItems = 4, RULE_statment = 5, RULE_expressionStatement = 6, 
		RULE_returnStatement = 7, RULE_functionDeclaration = 8, RULE_exportStatement = 9, 
		RULE_variableStatement = 10, RULE_varModifier = 11, RULE_variableDeclaration = 12, 
		RULE_assignable = 13, RULE_singleExpression = 14, RULE_functionCall = 15, 
		RULE_directive = 16, RULE_ifStatement = 17, RULE_statementBlock = 18, 
		RULE_componentDeclaration = 19, RULE_componentAttributes = 20, RULE_selectorDeclaration = 21, 
		RULE_standaloneDeclaration = 22, RULE_importsDeclaration = 23, RULE_templateDeclaration = 24, 
		RULE_stylesDeclaration = 25, RULE_classDeclaration = 26, RULE_classBody = 27, 
		RULE_templateStatement = 28, RULE_htmlElements = 29, RULE_htmlElement = 30, 
		RULE_htmlContent = 31, RULE_htmlAttribute = 32, RULE_mustacheExpression = 33, 
		RULE_htmlAttributeValue = 34, RULE_arrayLiteral = 35, RULE_objectLiteral = 36, 
		RULE_propertyAssignment = 37, RULE_literal = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "eos", "importStatement", "importFromBlock", "moduleItems", 
			"statment", "expressionStatement", "returnStatement", "functionDeclaration", 
			"exportStatement", "variableStatement", "varModifier", "variableDeclaration", 
			"assignable", "singleExpression", "functionCall", "directive", "ifStatement", 
			"statementBlock", "componentDeclaration", "componentAttributes", "selectorDeclaration", 
			"standaloneDeclaration", "importsDeclaration", "templateDeclaration", 
			"stylesDeclaration", "classDeclaration", "classBody", "templateStatement", 
			"htmlElements", "htmlElement", "htmlContent", "htmlAttribute", "mustacheExpression", 
			"htmlAttributeValue", "arrayLiteral", "objectLiteral", "propertyAssignment", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'@'", "'`'", "'Component'", "'selector'", "'standalone'", 
			"'imports'", "'template'", "'styles'", "'['", "']'", "'('", "')'", "'{'", 
			"'}'", "';'", "','", "'='", "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", 
			"'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'??'", "'#'", 
			"'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", 
			"'??='", "'=>'", "'''", "'React.createElement'", "'break'", "'do'", "'instanceof'", 
			"'typeof'", "'case'", "'else'", "'else if'", "'new'", "'var'", null, 
			"'catch'", "'finally'", "'return'", "'void'", "'continue'", "'for'", 
			"'switch'", "'while'", "'debugger'", "'function'", "'this'", "'with'", 
			"'default'", "'if'", "'throw'", "'delete'", "'in'", "'try'", "'as'", 
			"'from'", "'of'", "'null'", null, null, "'src'", "'class'", "'enum'", 
			"'extends'", "'super'", "'const'", "'export'", "'import'", "'implements'", 
			null, "'private'", "'public'", "'interface'", "'package'", "'protected'", 
			"'static'", "'map'", "'useRef'", "'useState'", "'useEffect'", null, null, 
			null, null, null, null, "'*ngIf'", "'*ngFor'", "'NgModule'", "'Injectable'", 
			"'Pipe'", "'{{'", "'}}'", "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WS", "At", "BACKTICK", 
			"Component", "Selector", "Standalone", "Imports", "Template", "Styles", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "QuestionMarkDot", 
			"Colon", "Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", 
			"BitNot", "Not", "Multiply", "Divide", "Modulus", "NullCoalesce", "Hashtag", 
			"RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", "LessThan", 
			"MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", 
			"IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", 
			"Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"NullishCoalescingAssign", "ARROW", "SinglQuat", "ReactCreatElement", 
			"Break", "Do", "Instanceof", "Typeof", "Case", "Else", "ElseIf", "New", 
			"Var", "Let", "Catch", "Finally", "Return", "Void", "Continue", "For", 
			"Switch", "While", "Debugger", "Function_", "This", "With", "Default", 
			"If", "Throw", "Delete", "In", "Try", "As", "From", "Of", "NullLiteral", 
			"BooleanLiteral", "StringLiteral", "Src", "Class", "Enum", "Extends", 
			"Super", "Const", "Export", "Import", "Implements", "StrictLet", "Private", 
			"Public", "Interface", "Package", "Protected", "Static", "Map", "UseRef", 
			"UseState", "UseEffect", "Ws", "DecimalLiteral", "Identifier", "TagName", 
			"ID", "Number", "NgIfDirective", "NgForDirective", "NgModule", "Injectable", 
			"Pipe", "OPEN_MUSTACHE", "CLOSE_MUSTACHE", "CLOSE_TAG", "ObjectLiteral"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			importStatement();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==At || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 6442452995L) != 0)) {
				{
				{
				setState(79);
				statment();
				}
				}
				setState(84);
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
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(85);
				match(SemiColon);
				}
				break;
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
	public static class ImportStatementContext extends ParserRuleContext {
		public List<TerminalNode> Import() { return getTokens(AngularParser.Import); }
		public TerminalNode Import(int i) {
			return getToken(AngularParser.Import, i);
		}
		public List<ImportFromBlockContext> importFromBlock() {
			return getRuleContexts(ImportFromBlockContext.class);
		}
		public ImportFromBlockContext importFromBlock(int i) {
			return getRuleContext(ImportFromBlockContext.class,i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(88);
				match(Import);
				setState(89);
				importFromBlock();
				}
				}
				setState(94);
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
	public static class ImportFromBlockContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ModuleItemsContext moduleItems() {
			return getRuleContext(ModuleItemsContext.class,0);
		}
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importFromBlock);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(StringLiteral);
				setState(96);
				eos();
				}
				break;
			case OpenBrace:
			case From:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(97);
					match(Identifier);
					}
					break;
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace || _la==Identifier) {
					{
					setState(100);
					moduleItems();
					}
				}

				setState(103);
				match(From);
				setState(104);
				match(StringLiteral);
				setState(105);
				eos();
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
	public static class ModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleItemsContext moduleItems() throws RecognitionException {
		ModuleItemsContext _localctx = new ModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(108);
				match(Identifier);
				setState(109);
				match(Comma);
				}
			}

			setState(112);
			match(OpenBrace);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(113);
				match(Identifier);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(114);
					match(Comma);
					}
				}

				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(CloseBrace);
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
	public static class StatmentContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statment);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				componentDeclaration();
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			singleExpression(0);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(130);
				match(Comma);
				setState(131);
				singleExpression(0);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			eos();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(AngularParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(Return);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(140);
				singleExpression(0);
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						match(Comma);
						setState(142);
						singleExpression(0);
						}
						} 
					}
					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			}
			setState(150);
			eos();
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(AngularParser.Function_, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(152);
				match(Export);
				}
			}

			setState(155);
			match(Function_);
			setState(156);
			match(Identifier);
			setState(157);
			match(OpenParen);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511713792L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 870813212870657L) != 0)) {
				{
				{
				setState(158);
				singleExpression(0);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(164);
				match(Comma);
				setState(165);
				singleExpression(0);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(CloseParen);
			setState(172);
			match(OpenBrace);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==At || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 6442452995L) != 0)) {
				{
				{
				setState(173);
				statment();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(CloseBrace);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(180);
				exportStatement();
				}
				break;
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
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(Export);
			setState(184);
			match(Identifier);
			setState(185);
			eos();
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
	public static class VariableStatementContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			varModifier();
			setState(188);
			variableDeclaration();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(189);
				match(Comma);
				setState(190);
				variableDeclaration();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			eos();
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
	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(AngularParser.Var, 0); }
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public TerminalNode Const() { return getToken(AngularParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varModifier);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(198);
					match(Export);
					}
				}

				setState(201);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(202);
					match(Export);
					}
				}

				setState(205);
				match(Let);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(206);
					match(Export);
					}
				}

				setState(209);
				match(Const);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			assignable();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(213);
				match(Assign);
				setState(214);
				singleExpression(0);
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
	public static class AssignableContext extends ParserRuleContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode ObjectLiteral() { return getToken(AngularParser.ObjectLiteral, 0); }
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignable);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				arrayLiteral();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(Identifier);
				}
				break;
			case ObjectLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(ObjectLiteral);
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
	public static class SingleExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Plus() { return getToken(AngularParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(AngularParser.Minus, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(223);
				literal();
				}
				break;
			case 2:
				{
				setState(224);
				arrayLiteral();
				}
				break;
			case 3:
				{
				setState(225);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(226);
				functionCall();
				}
				break;
			case 5:
				{
				setState(227);
				directive();
				}
				break;
			case 6:
				{
				setState(228);
				ifStatement();
				}
				break;
			case 7:
				{
				setState(229);
				returnStatement();
				}
				break;
			case 8:
				{
				setState(230);
				htmlElements();
				}
				break;
			case 9:
				{
				setState(231);
				match(Identifier);
				}
				break;
			case 10:
				{
				setState(232);
				match(OpenParen);
				setState(233);
				singleExpression(0);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(234);
					match(Comma);
					setState(235);
					singleExpression(0);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(CloseParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(245);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(246);
						match(Dot);
						setState(247);
						singleExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(248);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(249);
						match(Plus);
						setState(250);
						singleExpression(4);
						}
						break;
					case 3:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(251);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(252);
						match(Minus);
						setState(253);
						singleExpression(3);
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(Identifier);
			setState(260);
			match(OpenParen);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511713792L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 870813212870657L) != 0)) {
				{
				setState(261);
				singleExpression(0);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(262);
					match(Comma);
					setState(263);
					singleExpression(0);
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(271);
			match(CloseParen);
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
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode NgIfDirective() { return getToken(AngularParser.NgIfDirective, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode NgForDirective() { return getToken(AngularParser.NgForDirective, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_directive);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NgIfDirective:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(NgIfDirective);
				setState(274);
				match(Assign);
				setState(275);
				singleExpression(0);
				}
				break;
			case NgForDirective:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(NgForDirective);
				setState(277);
				match(Assign);
				setState(278);
				singleExpression(0);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<StatementBlockContext> statementBlock() {
			return getRuleContexts(StatementBlockContext.class);
		}
		public StatementBlockContext statementBlock(int i) {
			return getRuleContext(StatementBlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(If);
			setState(282);
			match(OpenParen);
			setState(283);
			singleExpression(0);
			setState(284);
			match(CloseParen);
			setState(285);
			statementBlock();
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(286);
				match(Else);
				setState(287);
				statementBlock();
				}
				break;
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
	public static class StatementBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(OpenBrace);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==At || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 6442452995L) != 0)) {
				{
				{
				setState(291);
				statment();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(CloseBrace);
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
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(AngularParser.At, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ComponentAttributesContext componentAttributes() {
			return getRuleContext(ComponentAttributesContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(At);
			setState(300);
			match(Component);
			setState(301);
			match(OpenParen);
			setState(302);
			componentAttributes();
			setState(303);
			match(CloseParen);
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
	public static class ComponentAttributesContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public SelectorDeclarationContext selectorDeclaration() {
			return getRuleContext(SelectorDeclarationContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public StandaloneDeclarationContext standaloneDeclaration() {
			return getRuleContext(StandaloneDeclarationContext.class,0);
		}
		public ImportsDeclarationContext importsDeclaration() {
			return getRuleContext(ImportsDeclarationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public StylesDeclarationContext stylesDeclaration() {
			return getRuleContext(StylesDeclarationContext.class,0);
		}
		public ComponentAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentAttributesContext componentAttributes() throws RecognitionException {
		ComponentAttributesContext _localctx = new ComponentAttributesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_componentAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(OpenBrace);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Selector) {
				{
				setState(306);
				selectorDeclaration();
				}
			}

			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(309);
				match(Comma);
				}
				break;
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Standalone) {
				{
				setState(312);
				standaloneDeclaration();
				}
			}

			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(315);
				match(Comma);
				}
				break;
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Imports) {
				{
				setState(318);
				importsDeclaration();
				}
			}

			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(321);
				match(Comma);
				}
				break;
			}
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(324);
				templateDeclaration();
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(327);
				match(Comma);
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Styles) {
				{
				setState(330);
				stylesDeclaration();
				}
			}

			setState(333);
			match(CloseBrace);
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
	public static class SelectorDeclarationContext extends ParserRuleContext {
		public TerminalNode Selector() { return getToken(AngularParser.Selector, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public SelectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorDeclarationContext selectorDeclaration() throws RecognitionException {
		SelectorDeclarationContext _localctx = new SelectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(Selector);
			setState(336);
			match(Colon);
			setState(337);
			match(StringLiteral);
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
	public static class StandaloneDeclarationContext extends ParserRuleContext {
		public TerminalNode Standalone() { return getToken(AngularParser.Standalone, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public StandaloneDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandaloneDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandaloneDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandaloneDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneDeclarationContext standaloneDeclaration() throws RecognitionException {
		StandaloneDeclarationContext _localctx = new StandaloneDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_standaloneDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(Standalone);
			setState(340);
			match(Colon);
			setState(341);
			match(BooleanLiteral);
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
	public static class ImportsDeclarationContext extends ParserRuleContext {
		public TerminalNode Imports() { return getToken(AngularParser.Imports, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ImportsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsDeclarationContext importsDeclaration() throws RecognitionException {
		ImportsDeclarationContext _localctx = new ImportsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_importsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(Imports);
			setState(344);
			match(Colon);
			setState(345);
			arrayLiteral();
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
	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(AngularParser.Template, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(Template);
			setState(348);
			match(Colon);
			setState(349);
			match(BACKTICK);
			setState(350);
			htmlElements();
			setState(351);
			match(BACKTICK);
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
	public static class StylesDeclarationContext extends ParserRuleContext {
		public TerminalNode Styles() { return getToken(AngularParser.Styles, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public StylesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesDeclarationContext stylesDeclaration() throws RecognitionException {
		StylesDeclarationContext _localctx = new StylesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stylesDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(Styles);
			setState(354);
			match(Colon);
			setState(355);
			arrayLiteral();
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
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(357);
				match(Export);
				}
			}

			setState(360);
			match(Class);
			setState(361);
			match(Identifier);
			setState(362);
			match(OpenBrace);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 6442452995L) != 0)) {
				{
				{
				setState(363);
				classBody();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(CloseBrace);
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
	public static class ClassBodyContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_classBody);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				functionDeclaration();
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
	public static class TemplateStatementContext extends ParserRuleContext {
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TemplateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStatementContext templateStatement() throws RecognitionException {
		TemplateStatementContext _localctx = new TemplateStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_templateStatement);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				htmlElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				singleExpression(0);
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
	public static class HtmlElementsContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(379);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(382); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> MoreThan() { return getTokens(AngularParser.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(AngularParser.MoreThan, i);
		}
		public TerminalNode CLOSE_TAG() { return getToken(AngularParser.CLOSE_TAG, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_htmlElement);
		int _la;
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(LessThan);
				setState(385);
				match(Identifier);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(386);
					htmlAttribute();
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				match(MoreThan);
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(393);
					htmlContent();
					}
					break;
				}
				setState(396);
				match(CLOSE_TAG);
				setState(397);
				match(Identifier);
				setState(398);
				match(MoreThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(LessThan);
				setState(400);
				match(Identifier);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(401);
					htmlAttribute();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(407);
				match(Divide);
				setState(408);
				match(MoreThan);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<MustacheExpressionContext> mustacheExpression() {
			return getRuleContexts(MustacheExpressionContext.class);
		}
		public MustacheExpressionContext mustacheExpression(int i) {
			return getRuleContext(MustacheExpressionContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511713792L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 9878012467611649L) != 0)) {
				{
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(411);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(412);
					mustacheExpression();
					}
					break;
				case 3:
					{
					setState(413);
					singleExpression(0);
					}
					break;
				}
				}
				setState(418);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(Identifier);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(420);
				match(Assign);
				setState(421);
				htmlAttributeValue();
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
	public static class MustacheExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_MUSTACHE() { return getToken(AngularParser.OPEN_MUSTACHE, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CLOSE_MUSTACHE() { return getToken(AngularParser.CLOSE_MUSTACHE, 0); }
		public MustacheExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustacheExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMustacheExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMustacheExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMustacheExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MustacheExpressionContext mustacheExpression() throws RecognitionException {
		MustacheExpressionContext _localctx = new MustacheExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mustacheExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(OPEN_MUSTACHE);
			setState(425);
			singleExpression(0);
			setState(426);
			match(CLOSE_MUSTACHE);
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
	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public MustacheExpressionContext mustacheExpression() {
			return getRuleContext(MustacheExpressionContext.class,0);
		}
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_htmlAttributeValue);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(StringLiteral);
				}
				break;
			case OPEN_MUSTACHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				mustacheExpression();
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(OpenBracket);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511713792L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 870813212870657L) != 0)) {
				{
				setState(433);
				singleExpression(0);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(434);
					match(Comma);
					setState(435);
					singleExpression(0);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(443);
			match(CloseBracket);
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
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(OpenBrace);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511713792L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 870813212870657L) != 0)) {
				{
				setState(446);
				propertyAssignment();
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(447);
					match(Comma);
					setState(448);
					propertyAssignment();
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(456);
			match(CloseBrace);
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
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			singleExpression(0);
			setState(459);
			match(Colon);
			setState(460);
			singleExpression(0);
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
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 16777223L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0088\u01d1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000"+
		"\u0001\u0000\u0005\u0000Q\b\u0000\n\u0000\f\u0000T\t\u0000\u0001\u0001"+
		"\u0003\u0001W\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002[\b\u0002\n\u0002"+
		"\f\u0002^\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003c\b\u0003"+
		"\u0001\u0003\u0003\u0003f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003k\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004o\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004t\b\u0004\u0005\u0004v\b\u0004"+
		"\n\u0004\f\u0004y\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0080\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0085\b\u0006\n\u0006\f\u0006\u0088\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0090"+
		"\b\u0007\n\u0007\f\u0007\u0093\t\u0007\u0003\u0007\u0095\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0003\b\u009a\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00a0\b\b\n\b\f\b\u00a3\t\b\u0001\b\u0001\b\u0005\b\u00a7\b"+
		"\b\n\b\f\b\u00aa\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00af\b\b\n\b\f\b"+
		"\u00b2\t\b\u0001\b\u0001\b\u0003\b\u00b6\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c0\b\n\n\n\f\n\u00c3\t\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0003\u000b\u00c8\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00cc\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d0"+
		"\b\u000b\u0001\u000b\u0003\u000b\u00d3\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u00d8\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00dd\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00ed\b\u000e\n\u000e\f\u000e\u00f0\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00f4\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00ff\b\u000e\n\u000e\f\u000e\u0102\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0109\b\u000f"+
		"\n\u000f\f\u000f\u010c\t\u000f\u0003\u000f\u010e\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0118\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0121\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0125\b\u0012\n\u0012\f\u0012\u0128\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0134\b\u0014"+
		"\u0001\u0014\u0003\u0014\u0137\b\u0014\u0001\u0014\u0003\u0014\u013a\b"+
		"\u0014\u0001\u0014\u0003\u0014\u013d\b\u0014\u0001\u0014\u0003\u0014\u0140"+
		"\b\u0014\u0001\u0014\u0003\u0014\u0143\b\u0014\u0001\u0014\u0003\u0014"+
		"\u0146\b\u0014\u0001\u0014\u0003\u0014\u0149\b\u0014\u0001\u0014\u0003"+
		"\u0014\u014c\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0003\u001a\u0167\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u016d\b\u001a\n\u001a\f\u001a"+
		"\u0170\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0176\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u017a\b\u001c\u0001"+
		"\u001d\u0004\u001d\u017d\b\u001d\u000b\u001d\f\u001d\u017e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u0184\b\u001e\n\u001e\f\u001e\u0187"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u018b\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0193\b\u001e\n\u001e\f\u001e\u0196\t\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u019a\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u019f"+
		"\b\u001f\n\u001f\f\u001f\u01a2\t\u001f\u0001 \u0001 \u0001 \u0003 \u01a7"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u01af\b\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0005#\u01b5\b#\n#\f#\u01b8\t#\u0003#\u01ba\b#"+
		"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u01c2\b$\n$\f$\u01c5"+
		"\t$\u0003$\u01c7\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0000\u0001\u001c\'\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJL\u0000"+
		"\u0001\u0002\u0000ce{{\u01f2\u0000N\u0001\u0000\u0000\u0000\u0002V\u0001"+
		"\u0000\u0000\u0000\u0004\\\u0001\u0000\u0000\u0000\u0006j\u0001\u0000"+
		"\u0000\u0000\bn\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000"+
		"\f\u0081\u0001\u0000\u0000\u0000\u000e\u008b\u0001\u0000\u0000\u0000\u0010"+
		"\u0099\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000\u0014"+
		"\u00bb\u0001\u0000\u0000\u0000\u0016\u00d2\u0001\u0000\u0000\u0000\u0018"+
		"\u00d4\u0001\u0000\u0000\u0000\u001a\u00dc\u0001\u0000\u0000\u0000\u001c"+
		"\u00f3\u0001\u0000\u0000\u0000\u001e\u0103\u0001\u0000\u0000\u0000 \u0117"+
		"\u0001\u0000\u0000\u0000\"\u0119\u0001\u0000\u0000\u0000$\u0122\u0001"+
		"\u0000\u0000\u0000&\u012b\u0001\u0000\u0000\u0000(\u0131\u0001\u0000\u0000"+
		"\u0000*\u014f\u0001\u0000\u0000\u0000,\u0153\u0001\u0000\u0000\u0000."+
		"\u0157\u0001\u0000\u0000\u00000\u015b\u0001\u0000\u0000\u00002\u0161\u0001"+
		"\u0000\u0000\u00004\u0166\u0001\u0000\u0000\u00006\u0175\u0001\u0000\u0000"+
		"\u00008\u0179\u0001\u0000\u0000\u0000:\u017c\u0001\u0000\u0000\u0000<"+
		"\u0199\u0001\u0000\u0000\u0000>\u01a0\u0001\u0000\u0000\u0000@\u01a3\u0001"+
		"\u0000\u0000\u0000B\u01a8\u0001\u0000\u0000\u0000D\u01ae\u0001\u0000\u0000"+
		"\u0000F\u01b0\u0001\u0000\u0000\u0000H\u01bd\u0001\u0000\u0000\u0000J"+
		"\u01ca\u0001\u0000\u0000\u0000L\u01ce\u0001\u0000\u0000\u0000NR\u0003"+
		"\u0004\u0002\u0000OQ\u0003\n\u0005\u0000PO\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\u0001\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UW\u0005\u0012"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0003"+
		"\u0001\u0000\u0000\u0000XY\u0005m\u0000\u0000Y[\u0003\u0006\u0003\u0000"+
		"ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\u0005\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_`\u0005e\u0000\u0000`k\u0003\u0002\u0001\u0000ac\u0005"+
		"|\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001"+
		"\u0000\u0000\u0000df\u0003\b\u0004\u0000ed\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005a\u0000\u0000hi\u0005"+
		"e\u0000\u0000ik\u0003\u0002\u0001\u0000j_\u0001\u0000\u0000\u0000jb\u0001"+
		"\u0000\u0000\u0000k\u0007\u0001\u0000\u0000\u0000lm\u0005|\u0000\u0000"+
		"mo\u0005\u0013\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pw\u0005\u0010\u0000\u0000qs\u0005|\u0000"+
		"\u0000rt\u0005\u0013\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tv\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u0011\u0000"+
		"\u0000{\t\u0001\u0000\u0000\u0000|\u0080\u0003\u0014\n\u0000}\u0080\u0003"+
		"\u0010\b\u0000~\u0080\u0003&\u0013\u0000\u007f|\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u000b"+
		"\u0001\u0000\u0000\u0000\u0081\u0086\u0003\u001c\u000e\u0000\u0082\u0083"+
		"\u0005\u0013\u0000\u0000\u0083\u0085\u0003\u001c\u000e\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0003\u0002\u0001\u0000\u008a\r\u0001\u0000\u0000\u0000\u008b\u0094\u0005"+
		"P\u0000\u0000\u008c\u0091\u0003\u001c\u000e\u0000\u008d\u008e\u0005\u0013"+
		"\u0000\u0000\u008e\u0090\u0003\u001c\u000e\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u008c\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0003\u0002\u0001\u0000\u0097\u000f\u0001\u0000"+
		"\u0000\u0000\u0098\u009a\u0005l\u0000\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005W\u0000\u0000\u009c\u009d\u0005|\u0000\u0000\u009d"+
		"\u00a1\u0005\u000e\u0000\u0000\u009e\u00a0\u0003\u001c\u000e\u0000\u009f"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0013\u0000\u0000\u00a5\u00a7\u0003\u001c\u000e\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u000f\u0000\u0000\u00ac\u00b0\u0005\u0010\u0000\u0000\u00ad"+
		"\u00af\u0003\n\u0005\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005\u0011\u0000\u0000\u00b4\u00b6"+
		"\u0003\u0012\t\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u0011\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"l\u0000\u0000\u00b8\u00b9\u0005|\u0000\u0000\u00b9\u00ba\u0003\u0002\u0001"+
		"\u0000\u00ba\u0013\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u0016\u000b"+
		"\u0000\u00bc\u00c1\u0003\u0018\f\u0000\u00bd\u00be\u0005\u0013\u0000\u0000"+
		"\u00be\u00c0\u0003\u0018\f\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\u0002\u0001\u0000\u00c5"+
		"\u0015\u0001\u0000\u0000\u0000\u00c6\u00c8\u0005l\u0000\u0000\u00c7\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00d3\u0005L\u0000\u0000\u00ca\u00cc\u0005"+
		"l\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d3\u0005M\u0000"+
		"\u0000\u00ce\u00d0\u0005l\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d3\u0005k\u0000\u0000\u00d2\u00c7\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d3"+
		"\u0017\u0001\u0000\u0000\u0000\u00d4\u00d7\u0003\u001a\r\u0000\u00d5\u00d6"+
		"\u0005\u0014\u0000\u0000\u00d6\u00d8\u0003\u001c\u000e\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u0019"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dd\u0003F#\u0000\u00da\u00dd\u0005|"+
		"\u0000\u0000\u00db\u00dd\u0005\u0088\u0000\u0000\u00dc\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u001b\u0001\u0000\u0000\u0000\u00de\u00df\u0006\u000e"+
		"\uffff\uffff\u0000\u00df\u00f4\u0003L&\u0000\u00e0\u00f4\u0003F#\u0000"+
		"\u00e1\u00f4\u0003H$\u0000\u00e2\u00f4\u0003\u001e\u000f\u0000\u00e3\u00f4"+
		"\u0003 \u0010\u0000\u00e4\u00f4\u0003\"\u0011\u0000\u00e5\u00f4\u0003"+
		"\u000e\u0007\u0000\u00e6\u00f4\u0003:\u001d\u0000\u00e7\u00f4\u0005|\u0000"+
		"\u0000\u00e8\u00e9\u0005\u000e\u0000\u0000\u00e9\u00ee\u0003\u001c\u000e"+
		"\u0000\u00ea\u00eb\u0005\u0013\u0000\u0000\u00eb\u00ed\u0003\u001c\u000e"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0005\u000f\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f3\u00de\u0001\u0000\u0000\u0000\u00f3\u00e0\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e1\u0001\u0000\u0000\u0000\u00f3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e3\u0001\u0000\u0000\u0000\u00f3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e5\u0001\u0000\u0000\u0000\u00f3\u00e6\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e7\u0001\u0000\u0000\u0000\u00f3\u00e8\u0001\u0000\u0000"+
		"\u0000\u00f4\u0100\u0001\u0000\u0000\u0000\u00f5\u00f6\n\u0004\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0019\u0000\u0000\u00f7\u00ff\u0003\u001c\u000e\u0005"+
		"\u00f8\u00f9\n\u0003\u0000\u0000\u00f9\u00fa\u0005\u001c\u0000\u0000\u00fa"+
		"\u00ff\u0003\u001c\u000e\u0004\u00fb\u00fc\n\u0002\u0000\u0000\u00fc\u00fd"+
		"\u0005\u001d\u0000\u0000\u00fd\u00ff\u0003\u001c\u000e\u0003\u00fe\u00f5"+
		"\u0001\u0000\u0000\u0000\u00fe\u00f8\u0001\u0000\u0000\u0000\u00fe\u00fb"+
		"\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u001d"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0005|\u0000\u0000\u0104\u010d\u0005\u000e\u0000\u0000\u0105\u010a\u0003"+
		"\u001c\u000e\u0000\u0106\u0107\u0005\u0013\u0000\u0000\u0107\u0109\u0003"+
		"\u001c\u000e\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010c\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010d\u0105\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"\u000f\u0000\u0000\u0110\u001f\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"\u0080\u0000\u0000\u0112\u0113\u0005\u0014\u0000\u0000\u0113\u0118\u0003"+
		"\u001c\u000e\u0000\u0114\u0115\u0005\u0081\u0000\u0000\u0115\u0116\u0005"+
		"\u0014\u0000\u0000\u0116\u0118\u0003\u001c\u000e\u0000\u0117\u0111\u0001"+
		"\u0000\u0000\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0118!\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0005[\u0000\u0000\u011a\u011b\u0005\u000e\u0000"+
		"\u0000\u011b\u011c\u0003\u001c\u000e\u0000\u011c\u011d\u0005\u000f\u0000"+
		"\u0000\u011d\u0120\u0003$\u0012\u0000\u011e\u011f\u0005I\u0000\u0000\u011f"+
		"\u0121\u0003$\u0012\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121#\u0001\u0000\u0000\u0000\u0122\u0126\u0005"+
		"\u0010\u0000\u0000\u0123\u0125\u0003\n\u0005\u0000\u0124\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0011"+
		"\u0000\u0000\u012a%\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0004\u0000"+
		"\u0000\u012c\u012d\u0005\u0006\u0000\u0000\u012d\u012e\u0005\u000e\u0000"+
		"\u0000\u012e\u012f\u0003(\u0014\u0000\u012f\u0130\u0005\u000f\u0000\u0000"+
		"\u0130\'\u0001\u0000\u0000\u0000\u0131\u0133\u0005\u0010\u0000\u0000\u0132"+
		"\u0134\u0003*\u0015\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0137"+
		"\u0005\u0013\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u013a"+
		"\u0003,\u0016\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001"+
		"\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u013d\u0005"+
		"\u0013\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013c\u013d\u0001"+
		"\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u0140\u0003"+
		".\u0017\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0143\u0005\u0013"+
		"\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0146\u00030\u0018"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0149\u0005\u0013\u0000"+
		"\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000"+
		"\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u014c\u00032\u0019\u0000"+
		"\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u0011\u0000\u0000"+
		"\u014e)\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0007\u0000\u0000\u0150"+
		"\u0151\u0005\u0017\u0000\u0000\u0151\u0152\u0005e\u0000\u0000\u0152+\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0005\b\u0000\u0000\u0154\u0155\u0005\u0017"+
		"\u0000\u0000\u0155\u0156\u0005d\u0000\u0000\u0156-\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0005\t\u0000\u0000\u0158\u0159\u0005\u0017\u0000\u0000\u0159"+
		"\u015a\u0003F#\u0000\u015a/\u0001\u0000\u0000\u0000\u015b\u015c\u0005"+
		"\n\u0000\u0000\u015c\u015d\u0005\u0017\u0000\u0000\u015d\u015e\u0005\u0005"+
		"\u0000\u0000\u015e\u015f\u0003:\u001d\u0000\u015f\u0160\u0005\u0005\u0000"+
		"\u0000\u01601\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u000b\u0000\u0000"+
		"\u0162\u0163\u0005\u0017\u0000\u0000\u0163\u0164\u0003F#\u0000\u01643"+
		"\u0001\u0000\u0000\u0000\u0165\u0167\u0005l\u0000\u0000\u0166\u0165\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0005g\u0000\u0000\u0169\u016a\u0005|\u0000"+
		"\u0000\u016a\u016e\u0005\u0010\u0000\u0000\u016b\u016d\u00036\u001b\u0000"+
		"\u016c\u016b\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000"+
		"\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000"+
		"\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0005\u0011\u0000\u0000\u01725\u0001\u0000\u0000\u0000\u0173"+
		"\u0176\u0003\u0014\n\u0000\u0174\u0176\u0003\u0010\b\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u01767\u0001"+
		"\u0000\u0000\u0000\u0177\u017a\u0003:\u001d\u0000\u0178\u017a\u0003\u001c"+
		"\u000e\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000"+
		"\u0000\u0000\u017a9\u0001\u0000\u0000\u0000\u017b\u017d\u0003<\u001e\u0000"+
		"\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000"+
		"\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f;\u0001\u0000\u0000\u0000\u0180\u0181\u0005(\u0000\u0000\u0181\u0185"+
		"\u0005|\u0000\u0000\u0182\u0184\u0003@ \u0000\u0183\u0182\u0001\u0000"+
		"\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018a\u0005)\u0000"+
		"\u0000\u0189\u018b\u0003>\u001f\u0000\u018a\u0189\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0005\u0087\u0000\u0000\u018d\u018e\u0005|\u0000\u0000\u018e"+
		"\u019a\u0005)\u0000\u0000\u018f\u0190\u0005(\u0000\u0000\u0190\u0194\u0005"+
		"|\u0000\u0000\u0191\u0193\u0003@ \u0000\u0192\u0191\u0001\u0000\u0000"+
		"\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u0198\u0005!\u0000\u0000"+
		"\u0198\u019a\u0005)\u0000\u0000\u0199\u0180\u0001\u0000\u0000\u0000\u0199"+
		"\u018f\u0001\u0000\u0000\u0000\u019a=\u0001\u0000\u0000\u0000\u019b\u019f"+
		"\u0003<\u001e\u0000\u019c\u019f\u0003B!\u0000\u019d\u019f\u0003\u001c"+
		"\u000e\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a1?\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a6\u0005|\u0000\u0000\u01a4\u01a5\u0005\u0014\u0000\u0000"+
		"\u01a5\u01a7\u0003D\"\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a7A\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0005\u0085\u0000\u0000\u01a9\u01aa\u0003\u001c\u000e\u0000\u01aa\u01ab"+
		"\u0005\u0086\u0000\u0000\u01abC\u0001\u0000\u0000\u0000\u01ac\u01af\u0005"+
		"e\u0000\u0000\u01ad\u01af\u0003B!\u0000\u01ae\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01afE\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b9\u0005\f\u0000\u0000\u01b1\u01b6\u0003\u001c\u000e\u0000\u01b2"+
		"\u01b3\u0005\u0013\u0000\u0000\u01b3\u01b5\u0003\u001c\u000e\u0000\u01b4"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7"+
		"\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\r\u0000\u0000\u01bcG"+
		"\u0001\u0000\u0000\u0000\u01bd\u01c6\u0005\u0010\u0000\u0000\u01be\u01c3"+
		"\u0003J%\u0000\u01bf\u01c0\u0005\u0013\u0000\u0000\u01c0\u01c2\u0003J"+
		"%\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01be\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\u0011\u0000"+
		"\u0000\u01c9I\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003\u001c\u000e\u0000"+
		"\u01cb\u01cc\u0005\u0017\u0000\u0000\u01cc\u01cd\u0003\u001c\u000e\u0000"+
		"\u01cdK\u0001\u0000\u0000\u0000\u01ce\u01cf\u0007\u0000\u0000\u0000\u01cf"+
		"M\u0001\u0000\u0000\u0000<RV\\bejnsw\u007f\u0086\u0091\u0094\u0099\u00a1"+
		"\u00a8\u00b0\u00b5\u00c1\u00c7\u00cb\u00cf\u00d2\u00d7\u00dc\u00ee\u00f3"+
		"\u00fe\u0100\u010a\u010d\u0117\u0120\u0126\u0133\u0136\u0139\u013c\u013f"+
		"\u0142\u0145\u0148\u014b\u0166\u016e\u0175\u0179\u017e\u0185\u018a\u0194"+
		"\u0199\u019e\u01a0\u01a6\u01ae\u01b6\u01b9\u01c3\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}