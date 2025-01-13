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
		MultiLineComment=1, SingleLineComment=2, At=3, BACKTICK=4, Class=5, Export=6, 
		Let=7, Component=8, Selector=9, Standalone=10, Imports=11, Template=12, 
		Styles=13, OpenBracket=14, CloseBracket=15, OpenParen=16, CloseParen=17, 
		OpenBrace=18, CloseBrace=19, SemiColon=20, Comma=21, Assign=22, QuestionMark=23, 
		QuestionMarkDot=24, Colon=25, Ellipsis=26, Dot=27, PlusPlus=28, MinusMinus=29, 
		Plus=30, Minus=31, BitNot=32, Not=33, Multiply=34, Divide=35, Modulus=36, 
		NullCoalesce=37, Hashtag=38, RightShiftArithmetic=39, LeftShiftArithmetic=40, 
		RightShiftLogical=41, LessThan=42, MoreThan=43, LessThanEquals=44, GreaterThanEquals=45, 
		Equals_=46, NotEquals=47, IdentityEquals=48, IdentityNotEquals=49, BitAnd=50, 
		BitXOr=51, BitOr=52, And=53, Or=54, MultiplyAssign=55, DivideAssign=56, 
		ModulusAssign=57, PlusAssign=58, MinusAssign=59, LeftShiftArithmeticAssign=60, 
		RightShiftArithmeticAssign=61, RightShiftLogicalAssign=62, BitAndAssign=63, 
		BitXorAssign=64, BitOrAssign=65, NullishCoalescingAssign=66, ARROW=67, 
		ReactCreatElement=68, Break=69, Do=70, Instanceof=71, Typeof=72, Case=73, 
		Else=74, ElseIf=75, New=76, Var=77, Catch=78, Finally=79, Return=80, Void=81, 
		Continue=82, For=83, Switch=84, While=85, Debugger=86, Function_=87, This=88, 
		With=89, Default=90, If=91, Throw=92, Delete=93, In=94, Try=95, As=96, 
		From=97, Of=98, NullLiteral=99, BooleanLiteral=100, StringLiteral=101, 
		Enum=102, Extends=103, Super=104, Const=105, Import=106, Implements=107, 
		StrictLet=108, Private=109, Public=110, Interface=111, Package=112, Protected=113, 
		Static=114, Map=115, UseRef=116, UseState=117, UseEffect=118, DecimalLiteral=119, 
		Identifier=120, TagName=121, ID=122, Number=123, WS=124, NgIfDirective=125, 
		NgForDirective=126, NgModule=127, Injectable=128, Pipe=129, Qut=130, OPEN_MUSTACHE=131, 
		CLOSE_MUSTACHE=132, CLOSE_TAG=133, HexColor=134, ObjectLiteral=135;
	public static final int
		RULE_program = 0, RULE_eos = 1, RULE_importStatement = 2, RULE_importFromBlock = 3, 
		RULE_moduleItems = 4, RULE_statment = 5, RULE_expressionStatement = 6, 
		RULE_returnStatement = 7, RULE_functionDeclaration = 8, RULE_exportStatement = 9, 
		RULE_variableStatement = 10, RULE_varModifier = 11, RULE_variableDeclaration = 12, 
		RULE_assignable = 13, RULE_singleExpression = 14, RULE_singleExpressionCss = 15, 
		RULE_functionCall = 16, RULE_directive = 17, RULE_ifStatement = 18, RULE_statementBlock = 19, 
		RULE_componentDeclaration = 20, RULE_componentAttributes = 21, RULE_componentAttribute = 22, 
		RULE_selectorDeclaration = 23, RULE_standaloneDeclaration = 24, RULE_importsDeclaration = 25, 
		RULE_templateDeclaration = 26, RULE_stylesDeclaration = 27, RULE_classDeclaration = 28, 
		RULE_classBody = 29, RULE_templateStatement = 30, RULE_htmlElements = 31, 
		RULE_htmlElement = 32, RULE_htmlContent = 33, RULE_htmlAttribute = 34, 
		RULE_mustacheExpression = 35, RULE_htmlAttributeValue = 36, RULE_arrayLiteral = 37, 
		RULE_arrayCss = 38, RULE_objectLiteral = 39, RULE_propertyAssignment = 40, 
		RULE_literal = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "eos", "importStatement", "importFromBlock", "moduleItems", 
			"statment", "expressionStatement", "returnStatement", "functionDeclaration", 
			"exportStatement", "variableStatement", "varModifier", "variableDeclaration", 
			"assignable", "singleExpression", "singleExpressionCss", "functionCall", 
			"directive", "ifStatement", "statementBlock", "componentDeclaration", 
			"componentAttributes", "componentAttribute", "selectorDeclaration", "standaloneDeclaration", 
			"importsDeclaration", "templateDeclaration", "stylesDeclaration", "classDeclaration", 
			"classBody", "templateStatement", "htmlElements", "htmlElement", "htmlContent", 
			"htmlAttribute", "mustacheExpression", "htmlAttributeValue", "arrayLiteral", 
			"arrayCss", "objectLiteral", "propertyAssignment", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'@'", "'`'", "'class'", "'export'", null, "'Component'", 
			"'selector'", "'standalone'", "'imports'", "'template'", "'styles'", 
			"'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'?'", 
			"'?.'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", 
			"'*'", "'/'", "'%'", "'??'", "'#'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", 
			"'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", 
			"'>>>='", "'&='", "'^='", "'|='", "'??='", "'=>'", "'React.createElement'", 
			"'break'", "'do'", "'instanceof'", "'typeof'", "'case'", "'else'", "'else if'", 
			"'new'", "'var'", "'catch'", "'finally'", "'return'", "'void'", "'continue'", 
			"'for'", "'switch'", "'while'", "'debugger'", "'function'", "'this'", 
			"'with'", "'default'", "'if'", "'throw'", "'delete'", "'in'", "'try'", 
			"'as'", "'from'", "'of'", "'null'", null, null, "'enum'", "'extends'", 
			"'super'", "'const'", "'import'", "'implements'", null, "'private'", 
			"'public'", "'interface'", "'package'", "'protected'", "'static'", "'map'", 
			"'useRef'", "'useState'", "'useEffect'", null, null, null, null, null, 
			null, "'*ngIf'", "'*ngFor'", "'NgModule'", "'Injectable'", "'Pipe'", 
			"'\"'", "'{{'", "'}}'", "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "At", "BACKTICK", "Class", 
			"Export", "Let", "Component", "Selector", "Standalone", "Imports", "Template", 
			"Styles", "OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "QuestionMarkDot", 
			"Colon", "Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", 
			"BitNot", "Not", "Multiply", "Divide", "Modulus", "NullCoalesce", "Hashtag", 
			"RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", "LessThan", 
			"MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", 
			"IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", 
			"Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"NullishCoalescingAssign", "ARROW", "ReactCreatElement", "Break", "Do", 
			"Instanceof", "Typeof", "Case", "Else", "ElseIf", "New", "Var", "Catch", 
			"Finally", "Return", "Void", "Continue", "For", "Switch", "While", "Debugger", 
			"Function_", "This", "With", "Default", "If", "Throw", "Delete", "In", 
			"Try", "As", "From", "Of", "NullLiteral", "BooleanLiteral", "StringLiteral", 
			"Enum", "Extends", "Super", "Const", "Import", "Implements", "StrictLet", 
			"Private", "Public", "Interface", "Package", "Protected", "Static", "Map", 
			"UseRef", "UseState", "UseEffect", "DecimalLiteral", "Identifier", "TagName", 
			"ID", "Number", "WS", "NgIfDirective", "NgForDirective", "NgModule", 
			"Injectable", "Pipe", "Qut", "OPEN_MUSTACHE", "CLOSE_MUSTACHE", "CLOSE_TAG", 
			"HexColor", "ObjectLiteral"
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
			setState(84);
			importStatement();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181073128L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 450373432052287497L) != 0)) {
				{
				{
				setState(85);
				statment();
				}
				}
				setState(90);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(91);
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(94);
				match(Import);
				setState(95);
				importFromBlock();
				}
				}
				setState(100);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(StringLiteral);
				setState(102);
				eos();
				}
				break;
			case OpenBrace:
			case From:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(103);
					match(Identifier);
					}
				}

				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(106);
					moduleItems();
					}
				}

				setState(109);
				match(From);
				setState(110);
				match(StringLiteral);
				setState(111);
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
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(OpenBrace);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(115);
					match(Identifier);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(116);
						match(Comma);
						setState(117);
						match(Identifier);
						}
						}
						setState(122);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(125);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(OpenBrace);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Component) {
					{
					setState(127);
					match(Component);
					}
				}

				setState(130);
				match(CloseBrace);
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
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				componentDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				expressionStatement();
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
			setState(140);
			singleExpression(0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(141);
				match(Comma);
				setState(142);
				singleExpression(0);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
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
			setState(150);
			match(Return);
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(151);
				singleExpression(0);
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(152);
						match(Comma);
						setState(153);
						singleExpression(0);
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			}
			setState(161);
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
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(163);
				match(Export);
				}
			}

			setState(166);
			match(Identifier);
			setState(167);
			match(OpenParen);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 20267881954017537L) != 0)) {
				{
				{
				setState(168);
				singleExpression(0);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(174);
				match(Comma);
				setState(175);
				singleExpression(0);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(CloseParen);
			setState(182);
			match(OpenBrace);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181073128L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 450373432052287497L) != 0)) {
				{
				{
				setState(183);
				statment();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(CloseBrace);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(190);
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
			setState(193);
			match(Export);
			setState(194);
			match(Identifier);
			setState(195);
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
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
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
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export || _la==Let || _la==Var || _la==Const) {
				{
				setState(197);
				varModifier();
				}
			}

			setState(200);
			variableDeclaration();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(201);
				match(Comma);
				setState(202);
				variableDeclaration();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(210);
					match(Export);
					}
				}

				setState(213);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(214);
					match(Export);
					}
				}

				setState(217);
				match(Let);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(218);
					match(Export);
					}
				}

				setState(221);
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
			setState(224);
			assignable();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(225);
				match(Assign);
				setState(226);
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
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				arrayLiteral();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(Identifier);
				}
				break;
			case ObjectLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
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
		public MustacheExpressionContext mustacheExpression() {
			return getRuleContext(MustacheExpressionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
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
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Map() { return getToken(AngularParser.Map, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public SingleExpressionCssContext singleExpressionCss() {
			return getRuleContext(SingleExpressionCssContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public TerminalNode Plus() { return getToken(AngularParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(AngularParser.Minus, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode And() { return getToken(AngularParser.And, 0); }
		public TerminalNode QuestionMark() { return getToken(AngularParser.QuestionMark, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode PlusPlus() { return getToken(AngularParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(AngularParser.MinusMinus, 0); }
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(235);
				literal();
				}
				break;
			case 2:
				{
				setState(236);
				arrayLiteral();
				}
				break;
			case 3:
				{
				setState(237);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(238);
				mustacheExpression();
				}
				break;
			case 5:
				{
				setState(239);
				returnStatement();
				}
				break;
			case 6:
				{
				setState(240);
				htmlElements();
				}
				break;
			case 7:
				{
				setState(241);
				match(OpenParen);
				setState(242);
				singleExpression(0);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(243);
					match(Comma);
					setState(244);
					singleExpression(0);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(CloseParen);
				}
				break;
			case 8:
				{
				setState(252);
				match(Identifier);
				}
				break;
			case 9:
				{
				setState(253);
				match(Map);
				}
				break;
			case 10:
				{
				setState(254);
				match(OpenBrace);
				setState(255);
				singleExpression(0);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenParen) {
					{
					setState(256);
					match(OpenParen);
					setState(257);
					match(CloseParen);
					}
				}

				setState(260);
				match(CloseBrace);
				}
				break;
			case 11:
				{
				setState(262);
				match(This);
				}
				break;
			case 12:
				{
				setState(263);
				singleExpressionCss();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(266);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(267);
						match(Dot);
						setState(268);
						singleExpression(20);
						}
						break;
					case 2:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(269);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(270);
						match(Multiply);
						setState(271);
						singleExpression(19);
						}
						break;
					case 3:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(272);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(273);
						match(Divide);
						setState(274);
						singleExpression(18);
						}
						break;
					case 4:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(275);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(276);
						match(Plus);
						setState(277);
						singleExpression(17);
						}
						break;
					case 5:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(278);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(279);
						match(Minus);
						setState(280);
						singleExpression(16);
						}
						break;
					case 6:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(281);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(282);
						match(Colon);
						setState(283);
						singleExpression(15);
						}
						break;
					case 7:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(284);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(285);
						match(And);
						setState(286);
						singleExpression(14);
						}
						break;
					case 8:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(287);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(288);
						match(QuestionMark);
						setState(289);
						singleExpression(0);
						setState(290);
						match(Colon);
						setState(291);
						singleExpression(13);
						}
						break;
					case 9:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(293);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(294);
						match(Assign);
						setState(295);
						singleExpression(12);
						}
						break;
					case 10:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(296);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(297);
						singleExpression(11);
						}
						break;
					case 11:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(298);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(299);
						match(PlusPlus);
						}
						break;
					case 12:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(300);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(301);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	public static class SingleExpressionCssContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public SingleExpressionCssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpressionCss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleExpressionCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleExpressionCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleExpressionCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionCssContext singleExpressionCss() throws RecognitionException {
		SingleExpressionCssContext _localctx = new SingleExpressionCssContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_singleExpressionCss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(307);
				match(Dot);
				}
			}

			setState(310);
			match(Identifier);
			setState(311);
			objectLiteral();
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
		enterRule(_localctx, 32, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(Identifier);
			setState(314);
			match(OpenParen);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 20267881954017537L) != 0)) {
				{
				setState(315);
				singleExpression(0);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(316);
					match(Comma);
					setState(317);
					singleExpression(0);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(325);
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
		enterRule(_localctx, 34, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==NgIfDirective || _la==NgForDirective) ) {
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
		enterRule(_localctx, 36, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(If);
			setState(330);
			match(OpenParen);
			setState(331);
			singleExpression(0);
			setState(332);
			match(CloseParen);
			setState(333);
			statementBlock();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(334);
				match(Else);
				setState(335);
				statementBlock();
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
		enterRule(_localctx, 38, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(OpenBrace);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181073128L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 450373432052287497L) != 0)) {
				{
				{
				setState(339);
				statment();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
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
		enterRule(_localctx, 40, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(At);
			setState(348);
			match(Component);
			setState(349);
			match(OpenParen);
			setState(350);
			componentAttributes();
			setState(351);
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
		public List<ComponentAttributeContext> componentAttribute() {
			return getRuleContexts(ComponentAttributeContext.class);
		}
		public ComponentAttributeContext componentAttribute(int i) {
			return getRuleContext(ComponentAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
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
		enterRule(_localctx, 42, RULE_componentAttributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(OpenBrace);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134233600L) != 0) || _la==Identifier) {
				{
				setState(354);
				componentAttribute();
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(355);
						match(Comma);
						setState(356);
						componentAttribute();
						}
						} 
					}
					setState(361);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(362);
					match(Comma);
					}
				}

				}
			}

			setState(367);
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
	public static class ComponentAttributeContext extends ParserRuleContext {
		public SelectorDeclarationContext selectorDeclaration() {
			return getRuleContext(SelectorDeclarationContext.class,0);
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
		public SingleExpressionCssContext singleExpressionCss() {
			return getRuleContext(SingleExpressionCssContext.class,0);
		}
		public ComponentAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentAttributeContext componentAttribute() throws RecognitionException {
		ComponentAttributeContext _localctx = new ComponentAttributeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_componentAttribute);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Selector:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				selectorDeclaration();
				}
				break;
			case Standalone:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				standaloneDeclaration();
				}
				break;
			case Imports:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				importsDeclaration();
				}
				break;
			case Template:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				templateDeclaration();
				}
				break;
			case Styles:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				stylesDeclaration();
				}
				break;
			case Dot:
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				singleExpressionCss();
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
		enterRule(_localctx, 46, RULE_selectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(Selector);
			setState(378);
			match(Colon);
			setState(379);
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
		enterRule(_localctx, 48, RULE_standaloneDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(Standalone);
			setState(382);
			match(Colon);
			setState(383);
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
		enterRule(_localctx, 50, RULE_importsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(Imports);
			setState(386);
			match(Colon);
			setState(387);
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
		enterRule(_localctx, 52, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(Template);
			setState(390);
			match(Colon);
			setState(391);
			match(BACKTICK);
			setState(392);
			htmlElements();
			setState(393);
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
		enterRule(_localctx, 54, RULE_stylesDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(Styles);
			setState(396);
			match(Colon);
			setState(397);
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
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
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
		enterRule(_localctx, 56, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(399);
				match(Export);
				}
			}

			setState(402);
			match(Class);
			setState(403);
			match(Identifier);
			setState(404);
			classBody();
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
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
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
		enterRule(_localctx, 58, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(OpenBrace);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181073128L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 450373432052287497L) != 0)) {
				{
				setState(409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(407);
					singleExpression(0);
					}
					break;
				case 2:
					{
					setState(408);
					statment();
					}
					break;
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
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
		enterRule(_localctx, 60, RULE_templateStatement);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				htmlElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
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
		enterRule(_localctx, 62, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(420);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(423); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		public List<TerminalNode> WS() { return getTokens(AngularParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AngularParser.WS, i);
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
		enterRule(_localctx, 64, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(LessThan);
				setState(426);
				match(Identifier);
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(428);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(427);
							match(WS);
							}
						}

						setState(430);
						htmlAttribute();
						}
						} 
					}
					setState(435);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(436);
					match(WS);
					}
				}

				setState(439);
				match(MoreThan);
				setState(441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(440);
					htmlContent();
					}
					break;
				}
				setState(443);
				match(CLOSE_TAG);
				setState(444);
				match(Identifier);
				setState(445);
				match(MoreThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(LessThan);
				setState(447);
				match(Identifier);
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(449);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(448);
							match(WS);
							}
						}

						setState(451);
						htmlAttribute();
						}
						} 
					}
					setState(456);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(457);
					match(WS);
					}
				}

				setState(460);
				match(Divide);
				setState(461);
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
		enterRule(_localctx, 66, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 20267881954017537L) != 0)) {
				{
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(464);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(465);
					singleExpression(0);
					}
					break;
				}
				}
				setState(470);
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
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
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
		enterRule(_localctx, 68, RULE_htmlAttribute);
		int _la;
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(Identifier);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(472);
					match(Assign);
					setState(473);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(OpenBracket);
				setState(477);
				match(Class);
				setState(478);
				match(Dot);
				setState(479);
				match(Identifier);
				setState(480);
				match(CloseBracket);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(481);
					match(Assign);
					setState(482);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				match(OpenParen);
				setState(486);
				match(Identifier);
				setState(487);
				match(CloseParen);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(488);
					match(Assign);
					setState(489);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				directive();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(493);
					match(Assign);
					setState(494);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(497);
				match(Class);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(498);
					match(Assign);
					setState(499);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(502);
				match(OpenBracket);
				setState(503);
				match(Identifier);
				setState(504);
				match(CloseBracket);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(505);
					match(Assign);
					setState(506);
					htmlAttributeValue();
					}
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
	public static class MustacheExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_MUSTACHE() { return getToken(AngularParser.OPEN_MUSTACHE, 0); }
		public TerminalNode CLOSE_MUSTACHE() { return getToken(AngularParser.CLOSE_MUSTACHE, 0); }
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
		enterRule(_localctx, 70, RULE_mustacheExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(OPEN_MUSTACHE);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 20267881954017537L) != 0)) {
				{
				setState(512);
				singleExpression(0);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(513);
					match(Comma);
					setState(514);
					singleExpression(0);
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(522);
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
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public List<TerminalNode> Qut() { return getTokens(AngularParser.Qut); }
		public TerminalNode Qut(int i) {
			return getToken(AngularParser.Qut, i);
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
		enterRule(_localctx, 72, RULE_htmlAttributeValue);
		int _la;
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(StringLiteral);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(OpenBrace);
				setState(526);
				singleExpression(0);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(527);
					match(Comma);
					setState(528);
					singleExpression(0);
					}
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(534);
				match(CloseBrace);
				}
				break;
			case Qut:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				match(Qut);
				setState(537);
				singleExpression(0);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(538);
					match(Comma);
					setState(539);
					singleExpression(0);
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(545);
				match(Qut);
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
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
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
		enterRule(_localctx, 74, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(OpenBracket);
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(550);
				match(BACKTICK);
				}
				break;
			}
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 20267881954017537L) != 0)) {
				{
				setState(553);
				singleExpression(0);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(554);
					match(Comma);
					setState(555);
					singleExpression(0);
					}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKTICK) {
				{
				setState(563);
				match(BACKTICK);
				}
			}

			setState(566);
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
	public static class ArrayCssContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<SingleExpressionCssContext> singleExpressionCss() {
			return getRuleContexts(SingleExpressionCssContext.class);
		}
		public SingleExpressionCssContext singleExpressionCss(int i) {
			return getRuleContext(SingleExpressionCssContext.class,i);
		}
		public ArrayCssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCssContext arrayCss() throws RecognitionException {
		ArrayCssContext _localctx = new ArrayCssContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayCss);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(OpenBracket);
			setState(569);
			match(BACKTICK);
			setState(573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(570);
					singleExpressionCss();
					}
					} 
				}
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(576);
			match(BACKTICK);
			setState(577);
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
		public List<TerminalNode> SemiColon() { return getTokens(AngularParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(AngularParser.SemiColon, i);
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
		enterRule(_localctx, 78, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(OpenBrace);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 20267881954017537L) != 0)) {
				{
				setState(580);
				propertyAssignment();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(581);
					match(Comma);
					setState(582);
					propertyAssignment();
					}
					}
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SemiColon) {
					{
					{
					setState(588);
					match(SemiColon);
					setState(589);
					propertyAssignment();
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(597);
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
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
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
		enterRule(_localctx, 80, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			singleExpression(0);
			setState(600);
			match(Colon);
			setState(601);
			singleExpression(0);
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(602);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public TerminalNode HexColor() { return getToken(AngularParser.HexColor, 0); }
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
		enterRule(_localctx, 82, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 34360786951L) != 0)) ) {
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
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0087\u0260\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0005\u0000W\b"+
		"\u0000\n\u0000\f\u0000Z\t\u0000\u0001\u0001\u0003\u0001]\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0005\u0002a\b\u0002\n\u0002\f\u0002d\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0003\u0003"+
		"\u0003l\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003q\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004w\b\u0004"+
		"\n\u0004\f\u0004z\t\u0004\u0003\u0004|\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0081\b\u0004\u0001\u0004\u0003\u0004\u0084\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u008b\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0090"+
		"\b\u0006\n\u0006\f\u0006\u0093\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009b\b\u0007\n\u0007"+
		"\f\u0007\u009e\t\u0007\u0003\u0007\u00a0\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0003\b\u00a5\b\b\u0001\b\u0001\b\u0001\b\u0005\b\u00aa\b\b\n"+
		"\b\f\b\u00ad\t\b\u0001\b\u0001\b\u0005\b\u00b1\b\b\n\b\f\b\u00b4\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00b9\b\b\n\b\f\b\u00bc\t\b\u0001\b\u0001\b"+
		"\u0003\b\u00c0\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0003\n\u00c7"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u00cc\b\n\n\n\f\n\u00cf\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0003\u000b\u00d4\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00d8\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00dc\b"+
		"\u000b\u0001\u000b\u0003\u000b\u00df\b\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00e4\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00e9\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00f6\b\u000e\n"+
		"\u000e\f\u000e\u00f9\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0103"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0109"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u012f\b\u000e\n\u000e\f\u000e\u0132\t\u000e\u0001\u000f"+
		"\u0003\u000f\u0135\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u013f\b\u0010"+
		"\n\u0010\f\u0010\u0142\t\u0010\u0003\u0010\u0144\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0151\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0155\b\u0013\n\u0013\f\u0013\u0158\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0166\b\u0015\n\u0015\f\u0015\u0169\t\u0015\u0001\u0015\u0003"+
		"\u0015\u016c\b\u0015\u0003\u0015\u016e\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0178\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0003\u001c\u0191\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u019a\b\u001d"+
		"\n\u001d\f\u001d\u019d\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01a3\b\u001e\u0001\u001f\u0004\u001f\u01a6\b\u001f"+
		"\u000b\u001f\f\u001f\u01a7\u0001 \u0001 \u0001 \u0003 \u01ad\b \u0001"+
		" \u0005 \u01b0\b \n \f \u01b3\t \u0001 \u0003 \u01b6\b \u0001 \u0001 "+
		"\u0003 \u01ba\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01c2"+
		"\b \u0001 \u0005 \u01c5\b \n \f \u01c8\t \u0001 \u0003 \u01cb\b \u0001"+
		" \u0001 \u0003 \u01cf\b \u0001!\u0001!\u0005!\u01d3\b!\n!\f!\u01d6\t!"+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u01db\b\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u01e4\b\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01eb\b\"\u0001\"\u0001\"\u0001\"\u0003\"\u01f0\b\""+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u01f5\b\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01fc\b\"\u0003\"\u01fe\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0005#\u0204\b#\n#\f#\u0207\t#\u0003#\u0209\b#\u0001#\u0001#\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0005$\u0212\b$\n$\f$\u0215\t$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0005$\u021d\b$\n$\f$\u0220\t$\u0001$\u0001"+
		"$\u0003$\u0224\b$\u0001%\u0001%\u0003%\u0228\b%\u0001%\u0001%\u0001%\u0005"+
		"%\u022d\b%\n%\f%\u0230\t%\u0003%\u0232\b%\u0001%\u0003%\u0235\b%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0005&\u023c\b&\n&\f&\u023f\t&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0248\b\'\n\'\f\'\u024b"+
		"\t\'\u0001\'\u0001\'\u0005\'\u024f\b\'\n\'\f\'\u0252\t\'\u0003\'\u0254"+
		"\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0003(\u025c\b(\u0001"+
		")\u0001)\u0001)\u0001\u023d\u0001\u001c*\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPR\u0000\u0002\u0001\u0000}~\u0003\u0000ceww\u0086\u0086\u02a4"+
		"\u0000T\u0001\u0000\u0000\u0000\u0002\\\u0001\u0000\u0000\u0000\u0004"+
		"b\u0001\u0000\u0000\u0000\u0006p\u0001\u0000\u0000\u0000\b\u0083\u0001"+
		"\u0000\u0000\u0000\n\u008a\u0001\u0000\u0000\u0000\f\u008c\u0001\u0000"+
		"\u0000\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u00a4\u0001\u0000"+
		"\u0000\u0000\u0012\u00c1\u0001\u0000\u0000\u0000\u0014\u00c6\u0001\u0000"+
		"\u0000\u0000\u0016\u00de\u0001\u0000\u0000\u0000\u0018\u00e0\u0001\u0000"+
		"\u0000\u0000\u001a\u00e8\u0001\u0000\u0000\u0000\u001c\u0108\u0001\u0000"+
		"\u0000\u0000\u001e\u0134\u0001\u0000\u0000\u0000 \u0139\u0001\u0000\u0000"+
		"\u0000\"\u0147\u0001\u0000\u0000\u0000$\u0149\u0001\u0000\u0000\u0000"+
		"&\u0152\u0001\u0000\u0000\u0000(\u015b\u0001\u0000\u0000\u0000*\u0161"+
		"\u0001\u0000\u0000\u0000,\u0177\u0001\u0000\u0000\u0000.\u0179\u0001\u0000"+
		"\u0000\u00000\u017d\u0001\u0000\u0000\u00002\u0181\u0001\u0000\u0000\u0000"+
		"4\u0185\u0001\u0000\u0000\u00006\u018b\u0001\u0000\u0000\u00008\u0190"+
		"\u0001\u0000\u0000\u0000:\u0196\u0001\u0000\u0000\u0000<\u01a2\u0001\u0000"+
		"\u0000\u0000>\u01a5\u0001\u0000\u0000\u0000@\u01ce\u0001\u0000\u0000\u0000"+
		"B\u01d4\u0001\u0000\u0000\u0000D\u01fd\u0001\u0000\u0000\u0000F\u01ff"+
		"\u0001\u0000\u0000\u0000H\u0223\u0001\u0000\u0000\u0000J\u0225\u0001\u0000"+
		"\u0000\u0000L\u0238\u0001\u0000\u0000\u0000N\u0243\u0001\u0000\u0000\u0000"+
		"P\u0257\u0001\u0000\u0000\u0000R\u025d\u0001\u0000\u0000\u0000TX\u0003"+
		"\u0004\u0002\u0000UW\u0003\n\u0005\u0000VU\u0001\u0000\u0000\u0000WZ\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y\u0001\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0005\u0014"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0003"+
		"\u0001\u0000\u0000\u0000^_\u0005j\u0000\u0000_a\u0003\u0006\u0003\u0000"+
		"`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\u0005\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ef\u0005e\u0000\u0000fq\u0003\u0002\u0001\u0000gi\u0005"+
		"x\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001"+
		"\u0000\u0000\u0000jl\u0003\b\u0004\u0000kj\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005a\u0000\u0000no\u0005"+
		"e\u0000\u0000oq\u0003\u0002\u0001\u0000pe\u0001\u0000\u0000\u0000ph\u0001"+
		"\u0000\u0000\u0000q\u0007\u0001\u0000\u0000\u0000r{\u0005\u0012\u0000"+
		"\u0000sx\u0005x\u0000\u0000tu\u0005\u0015\u0000\u0000uw\u0005x\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000{s\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u0084\u0005\u0013\u0000\u0000~\u0080\u0005\u0012\u0000"+
		"\u0000\u007f\u0081\u0005\b\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0005\u0013\u0000\u0000\u0083r\u0001\u0000\u0000\u0000\u0083"+
		"~\u0001\u0000\u0000\u0000\u0084\t\u0001\u0000\u0000\u0000\u0085\u008b"+
		"\u0003\u0014\n\u0000\u0086\u008b\u0003\u0010\b\u0000\u0087\u008b\u0003"+
		"(\u0014\u0000\u0088\u008b\u00038\u001c\u0000\u0089\u008b\u0003\f\u0006"+
		"\u0000\u008a\u0085\u0001\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000"+
		"\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u000b\u0001\u0000\u0000"+
		"\u0000\u008c\u0091\u0003\u001c\u000e\u0000\u008d\u008e\u0005\u0015\u0000"+
		"\u0000\u008e\u0090\u0003\u001c\u000e\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0002\u0001"+
		"\u0000\u0095\r\u0001\u0000\u0000\u0000\u0096\u009f\u0005P\u0000\u0000"+
		"\u0097\u009c\u0003\u001c\u000e\u0000\u0098\u0099\u0005\u0015\u0000\u0000"+
		"\u0099\u009b\u0003\u001c\u000e\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u0097\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0003\u0002\u0001\u0000\u00a2\u000f\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u0005\u0006\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005x\u0000\u0000\u00a7\u00ab\u0005\u0010\u0000\u0000\u00a8"+
		"\u00aa\u0003\u001c\u000e\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00b2\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0015\u0000\u0000\u00af"+
		"\u00b1\u0003\u001c\u000e\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0011\u0000\u0000\u00b6"+
		"\u00ba\u0005\u0012\u0000\u0000\u00b7\u00b9\u0003\n\u0005\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bf"+
		"\u0005\u0013\u0000\u0000\u00be\u00c0\u0003\u0012\t\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u0011\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005\u0006\u0000\u0000\u00c2\u00c3\u0005"+
		"x\u0000\u0000\u00c3\u00c4\u0003\u0002\u0001\u0000\u00c4\u0013\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c7\u0003\u0016\u000b\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cd\u0003\u0018\f\u0000\u00c9\u00ca\u0005\u0015\u0000"+
		"\u0000\u00ca\u00cc\u0003\u0018\f\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003\u0002\u0001\u0000"+
		"\u00d1\u0015\u0001\u0000\u0000\u0000\u00d2\u00d4\u0005\u0006\u0000\u0000"+
		"\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00df\u0005M\u0000\u0000\u00d6"+
		"\u00d8\u0005\u0006\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00df\u0005\u0007\u0000\u0000\u00da\u00dc\u0005\u0006\u0000\u0000\u00db"+
		"\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0005i\u0000\u0000\u00de\u00d3"+
		"\u0001\u0000\u0000\u0000\u00de\u00d7\u0001\u0000\u0000\u0000\u00de\u00db"+
		"\u0001\u0000\u0000\u0000\u00df\u0017\u0001\u0000\u0000\u0000\u00e0\u00e3"+
		"\u0003\u001a\r\u0000\u00e1\u00e2\u0005\u0016\u0000\u0000\u00e2\u00e4\u0003"+
		"\u001c\u000e\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u0019\u0001\u0000\u0000\u0000\u00e5\u00e9\u0003"+
		"J%\u0000\u00e6\u00e9\u0005x\u0000\u0000\u00e7\u00e9\u0005\u0087\u0000"+
		"\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u001b\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0006\u000e\uffff\uffff\u0000\u00eb\u0109\u0003R)\u0000"+
		"\u00ec\u0109\u0003J%\u0000\u00ed\u0109\u0003N\'\u0000\u00ee\u0109\u0003"+
		"F#\u0000\u00ef\u0109\u0003\u000e\u0007\u0000\u00f0\u0109\u0003>\u001f"+
		"\u0000\u00f1\u00f2\u0005\u0010\u0000\u0000\u00f2\u00f7\u0003\u001c\u000e"+
		"\u0000\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f4\u00f6\u0003\u001c\u000e"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\u0011\u0000\u0000\u00fb\u0109\u0001\u0000\u0000"+
		"\u0000\u00fc\u0109\u0005x\u0000\u0000\u00fd\u0109\u0005s\u0000\u0000\u00fe"+
		"\u00ff\u0005\u0012\u0000\u0000\u00ff\u0102\u0003\u001c\u000e\u0000\u0100"+
		"\u0101\u0005\u0010\u0000\u0000\u0101\u0103\u0005\u0011\u0000\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0013\u0000\u0000\u0105"+
		"\u0109\u0001\u0000\u0000\u0000\u0106\u0109\u0005X\u0000\u0000\u0107\u0109"+
		"\u0003\u001e\u000f\u0000\u0108\u00ea\u0001\u0000\u0000\u0000\u0108\u00ec"+
		"\u0001\u0000\u0000\u0000\u0108\u00ed\u0001\u0000\u0000\u0000\u0108\u00ee"+
		"\u0001\u0000\u0000\u0000\u0108\u00ef\u0001\u0000\u0000\u0000\u0108\u00f0"+
		"\u0001\u0000\u0000\u0000\u0108\u00f1\u0001\u0000\u0000\u0000\u0108\u00fc"+
		"\u0001\u0000\u0000\u0000\u0108\u00fd\u0001\u0000\u0000\u0000\u0108\u00fe"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u0130\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\n\u0013\u0000\u0000\u010b\u010c\u0005\u001b\u0000\u0000\u010c\u012f\u0003"+
		"\u001c\u000e\u0014\u010d\u010e\n\u0012\u0000\u0000\u010e\u010f\u0005\""+
		"\u0000\u0000\u010f\u012f\u0003\u001c\u000e\u0013\u0110\u0111\n\u0011\u0000"+
		"\u0000\u0111\u0112\u0005#\u0000\u0000\u0112\u012f\u0003\u001c\u000e\u0012"+
		"\u0113\u0114\n\u0010\u0000\u0000\u0114\u0115\u0005\u001e\u0000\u0000\u0115"+
		"\u012f\u0003\u001c\u000e\u0011\u0116\u0117\n\u000f\u0000\u0000\u0117\u0118"+
		"\u0005\u001f\u0000\u0000\u0118\u012f\u0003\u001c\u000e\u0010\u0119\u011a"+
		"\n\u000e\u0000\u0000\u011a\u011b\u0005\u0019\u0000\u0000\u011b\u012f\u0003"+
		"\u001c\u000e\u000f\u011c\u011d\n\r\u0000\u0000\u011d\u011e\u00055\u0000"+
		"\u0000\u011e\u012f\u0003\u001c\u000e\u000e\u011f\u0120\n\f\u0000\u0000"+
		"\u0120\u0121\u0005\u0017\u0000\u0000\u0121\u0122\u0003\u001c\u000e\u0000"+
		"\u0122\u0123\u0005\u0019\u0000\u0000\u0123\u0124\u0003\u001c\u000e\r\u0124"+
		"\u012f\u0001\u0000\u0000\u0000\u0125\u0126\n\u000b\u0000\u0000\u0126\u0127"+
		"\u0005\u0016\u0000\u0000\u0127\u012f\u0003\u001c\u000e\f\u0128\u0129\n"+
		"\n\u0000\u0000\u0129\u012f\u0003\u001c\u000e\u000b\u012a\u012b\n\u0005"+
		"\u0000\u0000\u012b\u012f\u0005\u001c\u0000\u0000\u012c\u012d\n\u0003\u0000"+
		"\u0000\u012d\u012f\u0005\u001d\u0000\u0000\u012e\u010a\u0001\u0000\u0000"+
		"\u0000\u012e\u010d\u0001\u0000\u0000\u0000\u012e\u0110\u0001\u0000\u0000"+
		"\u0000\u012e\u0113\u0001\u0000\u0000\u0000\u012e\u0116\u0001\u0000\u0000"+
		"\u0000\u012e\u0119\u0001\u0000\u0000\u0000\u012e\u011c\u0001\u0000\u0000"+
		"\u0000\u012e\u011f\u0001\u0000\u0000\u0000\u012e\u0125\u0001\u0000\u0000"+
		"\u0000\u012e\u0128\u0001\u0000\u0000\u0000\u012e\u012a\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u001d\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0133\u0135\u0005\u001b\u0000\u0000\u0134\u0133\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0005x\u0000\u0000\u0137\u0138\u0003N\'\u0000\u0138"+
		"\u001f\u0001\u0000\u0000\u0000\u0139\u013a\u0005x\u0000\u0000\u013a\u0143"+
		"\u0005\u0010\u0000\u0000\u013b\u0140\u0003\u001c\u000e\u0000\u013c\u013d"+
		"\u0005\u0015\u0000\u0000\u013d\u013f\u0003\u001c\u000e\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0144"+
		"\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u013b"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0011\u0000\u0000\u0146!\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0007\u0000\u0000\u0000\u0148#\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0005[\u0000\u0000\u014a\u014b\u0005\u0010\u0000"+
		"\u0000\u014b\u014c\u0003\u001c\u000e\u0000\u014c\u014d\u0005\u0011\u0000"+
		"\u0000\u014d\u0150\u0003&\u0013\u0000\u014e\u014f\u0005J\u0000\u0000\u014f"+
		"\u0151\u0003&\u0013\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151%\u0001\u0000\u0000\u0000\u0152\u0156\u0005"+
		"\u0012\u0000\u0000\u0153\u0155\u0003\n\u0005\u0000\u0154\u0153\u0001\u0000"+
		"\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000"+
		"\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0013"+
		"\u0000\u0000\u015a\'\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0003\u0000"+
		"\u0000\u015c\u015d\u0005\b\u0000\u0000\u015d\u015e\u0005\u0010\u0000\u0000"+
		"\u015e\u015f\u0003*\u0015\u0000\u015f\u0160\u0005\u0011\u0000\u0000\u0160"+
		")\u0001\u0000\u0000\u0000\u0161\u016d\u0005\u0012\u0000\u0000\u0162\u0167"+
		"\u0003,\u0016\u0000\u0163\u0164\u0005\u0015\u0000\u0000\u0164\u0166\u0003"+
		",\u0016\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000"+
		"\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000"+
		"\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000"+
		"\u0000\u0000\u016a\u016c\u0005\u0015\u0000\u0000\u016b\u016a\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000"+
		"\u0000\u0000\u016d\u0162\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0013"+
		"\u0000\u0000\u0170+\u0001\u0000\u0000\u0000\u0171\u0178\u0003.\u0017\u0000"+
		"\u0172\u0178\u00030\u0018\u0000\u0173\u0178\u00032\u0019\u0000\u0174\u0178"+
		"\u00034\u001a\u0000\u0175\u0178\u00036\u001b\u0000\u0176\u0178\u0003\u001e"+
		"\u000f\u0000\u0177\u0171\u0001\u0000\u0000\u0000\u0177\u0172\u0001\u0000"+
		"\u0000\u0000\u0177\u0173\u0001\u0000\u0000\u0000\u0177\u0174\u0001\u0000"+
		"\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0176\u0001\u0000"+
		"\u0000\u0000\u0178-\u0001\u0000\u0000\u0000\u0179\u017a\u0005\t\u0000"+
		"\u0000\u017a\u017b\u0005\u0019\u0000\u0000\u017b\u017c\u0005e\u0000\u0000"+
		"\u017c/\u0001\u0000\u0000\u0000\u017d\u017e\u0005\n\u0000\u0000\u017e"+
		"\u017f\u0005\u0019\u0000\u0000\u017f\u0180\u0005d\u0000\u0000\u01801\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0005\u000b\u0000\u0000\u0182\u0183\u0005"+
		"\u0019\u0000\u0000\u0183\u0184\u0003J%\u0000\u01843\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0005\f\u0000\u0000\u0186\u0187\u0005\u0019\u0000\u0000"+
		"\u0187\u0188\u0005\u0004\u0000\u0000\u0188\u0189\u0003>\u001f\u0000\u0189"+
		"\u018a\u0005\u0004\u0000\u0000\u018a5\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0005\r\u0000\u0000\u018c\u018d\u0005\u0019\u0000\u0000\u018d\u018e\u0003"+
		"J%\u0000\u018e7\u0001\u0000\u0000\u0000\u018f\u0191\u0005\u0006\u0000"+
		"\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0005\u0005\u0000"+
		"\u0000\u0193\u0194\u0005x\u0000\u0000\u0194\u0195\u0003:\u001d\u0000\u0195"+
		"9\u0001\u0000\u0000\u0000\u0196\u019b\u0005\u0012\u0000\u0000\u0197\u019a"+
		"\u0003\u001c\u000e\u0000\u0198\u019a\u0003\n\u0005\u0000\u0199\u0197\u0001"+
		"\u0000\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a\u019d\u0001"+
		"\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001"+
		"\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d\u019b\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0005\u0013\u0000\u0000\u019f;\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a3\u0003>\u001f\u0000\u01a1\u01a3\u0003\u001c\u000e"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a3=\u0001\u0000\u0000\u0000\u01a4\u01a6\u0003@ \u0000\u01a5"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8"+
		"?\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005*\u0000\u0000\u01aa\u01b1\u0005"+
		"x\u0000\u0000\u01ab\u01ad\u0005|\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b0\u0003D\"\u0000\u01af\u01ac\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b6\u0005|\u0000\u0000\u01b5"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0005+\u0000\u0000\u01b8\u01ba"+
		"\u0003B!\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\u0085"+
		"\u0000\u0000\u01bc\u01bd\u0005x\u0000\u0000\u01bd\u01cf\u0005+\u0000\u0000"+
		"\u01be\u01bf\u0005*\u0000\u0000\u01bf\u01c6\u0005x\u0000\u0000\u01c0\u01c2"+
		"\u0005|\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c5\u0003"+
		"D\"\u0000\u01c4\u01c1\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c9\u01cb\u0005|\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0005#\u0000\u0000\u01cd\u01cf\u0005+\u0000\u0000\u01ce"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ce\u01be\u0001\u0000\u0000\u0000\u01cf"+
		"A\u0001\u0000\u0000\u0000\u01d0\u01d3\u0003@ \u0000\u01d1\u01d3\u0003"+
		"\u001c\u000e\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5C\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0005x\u0000"+
		"\u0000\u01d8\u01d9\u0005\u0016\u0000\u0000\u01d9\u01db\u0003H$\u0000\u01da"+
		"\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db"+
		"\u01fe\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\u000e\u0000\u0000\u01dd"+
		"\u01de\u0005\u0005\u0000\u0000\u01de\u01df\u0005\u001b\u0000\u0000\u01df"+
		"\u01e0\u0005x\u0000\u0000\u01e0\u01e3\u0005\u000f\u0000\u0000\u01e1\u01e2"+
		"\u0005\u0016\u0000\u0000\u01e2\u01e4\u0003H$\u0000\u01e3\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01fe\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0005\u0010\u0000\u0000\u01e6\u01e7\u0005x\u0000"+
		"\u0000\u01e7\u01ea\u0005\u0011\u0000\u0000\u01e8\u01e9\u0005\u0016\u0000"+
		"\u0000\u01e9\u01eb\u0003H$\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0001\u0000\u0000\u0000\u01eb\u01fe\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ef\u0003\"\u0011\u0000\u01ed\u01ee\u0005\u0016\u0000\u0000\u01ee\u01f0"+
		"\u0003H$\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f0\u01fe\u0001\u0000\u0000\u0000\u01f1\u01f4\u0005\u0005"+
		"\u0000\u0000\u01f2\u01f3\u0005\u0016\u0000\u0000\u01f3\u01f5\u0003H$\u0000"+
		"\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f5\u01fe\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u000e\u0000\u0000"+
		"\u01f7\u01f8\u0005x\u0000\u0000\u01f8\u01fb\u0005\u000f\u0000\u0000\u01f9"+
		"\u01fa\u0005\u0016\u0000\u0000\u01fa\u01fc\u0003H$\u0000\u01fb\u01f9\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fd\u01d7\u0001\u0000\u0000\u0000\u01fd\u01dc\u0001"+
		"\u0000\u0000\u0000\u01fd\u01e5\u0001\u0000\u0000\u0000\u01fd\u01ec\u0001"+
		"\u0000\u0000\u0000\u01fd\u01f1\u0001\u0000\u0000\u0000\u01fd\u01f6\u0001"+
		"\u0000\u0000\u0000\u01feE\u0001\u0000\u0000\u0000\u01ff\u0208\u0005\u0083"+
		"\u0000\u0000\u0200\u0205\u0003\u001c\u000e\u0000\u0201\u0202\u0005\u0015"+
		"\u0000\u0000\u0202\u0204\u0003\u001c\u000e\u0000\u0203\u0201\u0001\u0000"+
		"\u0000\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0209\u0001\u0000"+
		"\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u0200\u0001\u0000"+
		"\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0005\u0084\u0000\u0000\u020bG\u0001\u0000\u0000"+
		"\u0000\u020c\u0224\u0005e\u0000\u0000\u020d\u020e\u0005\u0012\u0000\u0000"+
		"\u020e\u0213\u0003\u001c\u000e\u0000\u020f\u0210\u0005\u0015\u0000\u0000"+
		"\u0210\u0212\u0003\u001c\u000e\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0212\u0215\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000"+
		"\u0215\u0213\u0001\u0000\u0000\u0000\u0216\u0217\u0005\u0013\u0000\u0000"+
		"\u0217\u0224\u0001\u0000\u0000\u0000\u0218\u0219\u0005\u0082\u0000\u0000"+
		"\u0219\u021e\u0003\u001c\u000e\u0000\u021a\u021b\u0005\u0015\u0000\u0000"+
		"\u021b\u021d\u0003\u001c\u000e\u0000\u021c\u021a\u0001\u0000\u0000\u0000"+
		"\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0001\u0000\u0000\u0000"+
		"\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0222\u0005\u0082\u0000\u0000"+
		"\u0222\u0224\u0001\u0000\u0000\u0000\u0223\u020c\u0001\u0000\u0000\u0000"+
		"\u0223\u020d\u0001\u0000\u0000\u0000\u0223\u0218\u0001\u0000\u0000\u0000"+
		"\u0224I\u0001\u0000\u0000\u0000\u0225\u0227\u0005\u000e\u0000\u0000\u0226"+
		"\u0228\u0005\u0004\u0000\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0001\u0000\u0000\u0000\u0228\u0231\u0001\u0000\u0000\u0000\u0229"+
		"\u022e\u0003\u001c\u000e\u0000\u022a\u022b\u0005\u0015\u0000\u0000\u022b"+
		"\u022d\u0003\u001c\u000e\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022d"+
		"\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e"+
		"\u022f\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230"+
		"\u022e\u0001\u0000\u0000\u0000\u0231\u0229\u0001\u0000\u0000\u0000\u0231"+
		"\u0232\u0001\u0000\u0000\u0000\u0232\u0234\u0001\u0000\u0000\u0000\u0233"+
		"\u0235\u0005\u0004\u0000\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236"+
		"\u0237\u0005\u000f\u0000\u0000\u0237K\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0005\u000e\u0000\u0000\u0239\u023d\u0005\u0004\u0000\u0000\u023a\u023c"+
		"\u0003\u001e\u000f\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023c\u023f"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023d\u023b"+
		"\u0001\u0000\u0000\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u023d"+
		"\u0001\u0000\u0000\u0000\u0240\u0241\u0005\u0004\u0000\u0000\u0241\u0242"+
		"\u0005\u000f\u0000\u0000\u0242M\u0001\u0000\u0000\u0000\u0243\u0253\u0005"+
		"\u0012\u0000\u0000\u0244\u0249\u0003P(\u0000\u0245\u0246\u0005\u0015\u0000"+
		"\u0000\u0246\u0248\u0003P(\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0248"+
		"\u024b\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0001\u0000\u0000\u0000\u024a\u0250\u0001\u0000\u0000\u0000\u024b"+
		"\u0249\u0001\u0000\u0000\u0000\u024c\u024d\u0005\u0014\u0000\u0000\u024d"+
		"\u024f\u0003P(\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024f\u0252\u0001"+
		"\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250\u0251\u0001"+
		"\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250\u0001"+
		"\u0000\u0000\u0000\u0253\u0244\u0001\u0000\u0000\u0000\u0253\u0254\u0001"+
		"\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256\u0005"+
		"\u0013\u0000\u0000\u0256O\u0001\u0000\u0000\u0000\u0257\u0258\u0003\u001c"+
		"\u000e\u0000\u0258\u0259\u0005\u0019\u0000\u0000\u0259\u025b\u0003\u001c"+
		"\u000e\u0000\u025a\u025c\u0005\u0014\u0000\u0000\u025b\u025a\u0001\u0000"+
		"\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025cQ\u0001\u0000\u0000"+
		"\u0000\u025d\u025e\u0007\u0001\u0000\u0000\u025eS\u0001\u0000\u0000\u0000"+
		"MX\\bhkpx{\u0080\u0083\u008a\u0091\u009c\u009f\u00a4\u00ab\u00b2\u00ba"+
		"\u00bf\u00c6\u00cd\u00d3\u00d7\u00db\u00de\u00e3\u00e8\u00f7\u0102\u0108"+
		"\u012e\u0130\u0134\u0140\u0143\u0150\u0156\u0167\u016b\u016d\u0177\u0190"+
		"\u0199\u019b\u01a2\u01a7\u01ac\u01b1\u01b5\u01b9\u01c1\u01c6\u01ca\u01ce"+
		"\u01d2\u01d4\u01da\u01e3\u01ea\u01ef\u01f4\u01fb\u01fd\u0205\u0208\u0213"+
		"\u021e\u0223\u0227\u022e\u0231\u0234\u023d\u0249\u0250\u0253\u025b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}