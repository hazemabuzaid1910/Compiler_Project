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
		CLOSE_MUSTACHE=132, CLOSE_TAG=133, ObjectLiteral=134, Margin=135, Margin_top=136, 
		Padding=137, Color=138, Border_color=139, Box_shadow=140, Flex=141, Background_color=142, 
		Width=143, Line_height=144, Flex_direction=145, Flex_wrap=146, Gap=147, 
		Justify_content=148, Display=149;
	public static final int
		RULE_program = 0, RULE_eos = 1, RULE_importStatement = 2, RULE_importFromBlock = 3, 
		RULE_moduleItems = 4, RULE_statment = 5, RULE_expressionStatement = 6, 
		RULE_returnStatement = 7, RULE_functionDeclaration = 8, RULE_exportStatement = 9, 
		RULE_variableStatement = 10, RULE_varModifier = 11, RULE_variableDeclaration = 12, 
		RULE_assignable = 13, RULE_singleExpression = 14, RULE_singleExpressionCss = 15, 
		RULE_attributeCss = 16, RULE_functionCall = 17, RULE_directive = 18, RULE_ifStatement = 19, 
		RULE_statementBlock = 20, RULE_componentDeclaration = 21, RULE_componentAttributes = 22, 
		RULE_componentAttribute = 23, RULE_selectorDeclaration = 24, RULE_standaloneDeclaration = 25, 
		RULE_importsDeclaration = 26, RULE_templateDeclaration = 27, RULE_stylesDeclaration = 28, 
		RULE_classDeclaration = 29, RULE_classBody = 30, RULE_templateStatement = 31, 
		RULE_htmlElements = 32, RULE_htmlElement = 33, RULE_htmlContent = 34, 
		RULE_htmlAttribute = 35, RULE_mustacheExpression = 36, RULE_htmlAttributeValue = 37, 
		RULE_arrayLiteral = 38, RULE_arrayCss = 39, RULE_objectLiteral = 40, RULE_propertyAssignment = 41, 
		RULE_literal = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "eos", "importStatement", "importFromBlock", "moduleItems", 
			"statment", "expressionStatement", "returnStatement", "functionDeclaration", 
			"exportStatement", "variableStatement", "varModifier", "variableDeclaration", 
			"assignable", "singleExpression", "singleExpressionCss", "attributeCss", 
			"functionCall", "directive", "ifStatement", "statementBlock", "componentDeclaration", 
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
			"ObjectLiteral", "Margin", "Margin_top", "Padding", "Color", "Border_color", 
			"Box_shadow", "Flex", "Background_color", "Width", "Line_height", "Flex_direction", 
			"Flex_wrap", "Gap", "Justify_content", "Display"
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
			setState(86);
			importStatement();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181073128L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 162143055900575753L) != 0)) {
				{
				{
				setState(87);
				statment();
				}
				}
				setState(92);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(93);
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(96);
				match(Import);
				setState(97);
				importFromBlock();
				}
				}
				setState(102);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(StringLiteral);
				setState(104);
				eos();
				}
				break;
			case OpenBrace:
			case From:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(105);
					match(Identifier);
					}
				}

				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(108);
					moduleItems();
					}
				}

				setState(111);
				match(From);
				setState(112);
				match(StringLiteral);
				setState(113);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(OpenBrace);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(117);
					match(Identifier);
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(118);
						match(Comma);
						setState(119);
						match(Identifier);
						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(127);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(OpenBrace);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Component) {
					{
					setState(129);
					match(Component);
					}
				}

				setState(132);
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				componentDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
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
			setState(142);
			singleExpression(0);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(143);
				match(Comma);
				setState(144);
				singleExpression(0);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(152);
			match(Return);
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(153);
				singleExpression(0);
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(154);
						match(Comma);
						setState(155);
						singleExpression(0);
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			}
			setState(163);
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
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(165);
				match(Export);
				}
			}

			setState(168);
			match(Identifier);
			setState(169);
			match(OpenParen);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2253483444535553L) != 0)) {
				{
				{
				setState(170);
				singleExpression(0);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(176);
				match(Comma);
				setState(177);
				singleExpression(0);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(CloseParen);
			setState(184);
			match(OpenBrace);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181073128L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 162143055900575753L) != 0)) {
				{
				{
				setState(185);
				statment();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(CloseBrace);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(192);
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
			setState(195);
			match(Export);
			setState(196);
			match(Identifier);
			setState(197);
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
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export || _la==Let || _la==Var || _la==Const) {
				{
				setState(199);
				varModifier();
				}
			}

			setState(202);
			variableDeclaration();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(203);
				match(Comma);
				setState(204);
				variableDeclaration();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(212);
					match(Export);
					}
				}

				setState(215);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(216);
					match(Export);
					}
				}

				setState(219);
				match(Let);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(220);
					match(Export);
					}
				}

				setState(223);
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
			setState(226);
			assignable();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(227);
				match(Assign);
				setState(228);
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
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				arrayLiteral();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(Identifier);
				}
				break;
			case ObjectLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(237);
				literal();
				}
				break;
			case 2:
				{
				setState(238);
				arrayLiteral();
				}
				break;
			case 3:
				{
				setState(239);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(240);
				mustacheExpression();
				}
				break;
			case 5:
				{
				setState(241);
				returnStatement();
				}
				break;
			case 6:
				{
				setState(242);
				htmlElements();
				}
				break;
			case 7:
				{
				setState(243);
				match(OpenParen);
				setState(244);
				singleExpression(0);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(245);
					match(Comma);
					setState(246);
					singleExpression(0);
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(CloseParen);
				}
				break;
			case 8:
				{
				setState(254);
				match(Identifier);
				}
				break;
			case 9:
				{
				setState(255);
				match(Map);
				}
				break;
			case 10:
				{
				setState(256);
				match(OpenBrace);
				setState(257);
				singleExpression(0);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenParen) {
					{
					setState(258);
					match(OpenParen);
					setState(259);
					match(CloseParen);
					}
				}

				setState(262);
				match(CloseBrace);
				}
				break;
			case 11:
				{
				setState(264);
				match(This);
				}
				break;
			case 12:
				{
				setState(265);
				singleExpressionCss();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(268);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(269);
						match(Dot);
						setState(270);
						singleExpression(20);
						}
						break;
					case 2:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(271);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(272);
						match(Multiply);
						setState(273);
						singleExpression(19);
						}
						break;
					case 3:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(274);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(275);
						match(Divide);
						setState(276);
						singleExpression(18);
						}
						break;
					case 4:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(277);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(278);
						match(Plus);
						setState(279);
						singleExpression(17);
						}
						break;
					case 5:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(280);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(281);
						match(Minus);
						setState(282);
						singleExpression(16);
						}
						break;
					case 6:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(283);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(284);
						match(Colon);
						setState(285);
						singleExpression(15);
						}
						break;
					case 7:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(286);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(287);
						match(And);
						setState(288);
						singleExpression(14);
						}
						break;
					case 8:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(289);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(290);
						match(QuestionMark);
						setState(291);
						singleExpression(0);
						setState(292);
						match(Colon);
						setState(293);
						singleExpression(13);
						}
						break;
					case 9:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(295);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(296);
						match(Assign);
						setState(297);
						singleExpression(12);
						}
						break;
					case 10:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(298);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(299);
						singleExpression(11);
						}
						break;
					case 11:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(300);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(301);
						match(PlusPlus);
						}
						break;
					case 12:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(302);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(303);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(308);
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
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(Dot);
			setState(310);
			match(Identifier);
			setState(311);
			objectLiteral();
			setState(312);
			match(SemiColon);
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
	public static class AttributeCssContext extends ParserRuleContext {
		public TerminalNode Margin() { return getToken(AngularParser.Margin, 0); }
		public TerminalNode Margin_top() { return getToken(AngularParser.Margin_top, 0); }
		public TerminalNode Padding() { return getToken(AngularParser.Padding, 0); }
		public TerminalNode Color() { return getToken(AngularParser.Color, 0); }
		public TerminalNode Border_color() { return getToken(AngularParser.Border_color, 0); }
		public TerminalNode Box_shadow() { return getToken(AngularParser.Box_shadow, 0); }
		public TerminalNode Flex() { return getToken(AngularParser.Flex, 0); }
		public TerminalNode Background_color() { return getToken(AngularParser.Background_color, 0); }
		public TerminalNode Width() { return getToken(AngularParser.Width, 0); }
		public TerminalNode Line_height() { return getToken(AngularParser.Line_height, 0); }
		public TerminalNode Flex_direction() { return getToken(AngularParser.Flex_direction, 0); }
		public TerminalNode Flex_wrap() { return getToken(AngularParser.Flex_wrap, 0); }
		public TerminalNode Gap() { return getToken(AngularParser.Gap, 0); }
		public TerminalNode Justify_content() { return getToken(AngularParser.Justify_content, 0); }
		public TerminalNode Display() { return getToken(AngularParser.Display, 0); }
		public AttributeCssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeCss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributeCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributeCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributeCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeCssContext attributeCss() throws RecognitionException {
		AttributeCssContext _localctx = new AttributeCssContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attributeCss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & 32767L) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(Identifier);
			setState(317);
			match(OpenParen);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2253483444535553L) != 0)) {
				{
				setState(318);
				singleExpression(0);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(319);
					match(Comma);
					setState(320);
					singleExpression(0);
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(328);
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
		enterRule(_localctx, 36, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(If);
			setState(333);
			match(OpenParen);
			setState(334);
			singleExpression(0);
			setState(335);
			match(CloseParen);
			setState(336);
			statementBlock();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(337);
				match(Else);
				setState(338);
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
		enterRule(_localctx, 40, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(OpenBrace);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181073128L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 162143055900575753L) != 0)) {
				{
				{
				setState(342);
				statment();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
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
		enterRule(_localctx, 42, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(At);
			setState(351);
			match(Component);
			setState(352);
			match(OpenParen);
			setState(353);
			componentAttributes();
			setState(354);
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
		enterRule(_localctx, 44, RULE_componentAttributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(OpenBrace);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134233600L) != 0)) {
				{
				setState(357);
				componentAttribute();
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(358);
						match(Comma);
						setState(359);
						componentAttribute();
						}
						} 
					}
					setState(364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(365);
					match(Comma);
					}
				}

				}
			}

			setState(370);
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
		enterRule(_localctx, 46, RULE_componentAttribute);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Selector:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				selectorDeclaration();
				}
				break;
			case Standalone:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				standaloneDeclaration();
				}
				break;
			case Imports:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				importsDeclaration();
				}
				break;
			case Template:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				templateDeclaration();
				}
				break;
			case Styles:
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				stylesDeclaration();
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 6);
				{
				setState(377);
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
		enterRule(_localctx, 48, RULE_selectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(Selector);
			setState(381);
			match(Colon);
			setState(382);
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
		enterRule(_localctx, 50, RULE_standaloneDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(Standalone);
			setState(385);
			match(Colon);
			setState(386);
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
		enterRule(_localctx, 52, RULE_importsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(Imports);
			setState(389);
			match(Colon);
			setState(390);
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
		enterRule(_localctx, 54, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(Template);
			setState(393);
			match(Colon);
			setState(394);
			match(BACKTICK);
			setState(395);
			htmlElements();
			setState(396);
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
		enterRule(_localctx, 56, RULE_stylesDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(Styles);
			setState(399);
			match(Colon);
			setState(400);
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
		enterRule(_localctx, 58, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(402);
				match(Export);
				}
			}

			setState(405);
			match(Class);
			setState(406);
			match(Identifier);
			setState(407);
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
		enterRule(_localctx, 60, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(OpenBrace);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181073128L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 162143055900575753L) != 0)) {
				{
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(410);
					singleExpression(0);
					}
					break;
				case 2:
					{
					setState(411);
					statment();
					}
					break;
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
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
		enterRule(_localctx, 62, RULE_templateStatement);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				htmlElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
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
		enterRule(_localctx, 64, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(423);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(426); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 66, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(LessThan);
				setState(429);
				match(Identifier);
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(431);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(430);
							match(WS);
							}
						}

						setState(433);
						htmlAttribute();
						}
						} 
					}
					setState(438);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(439);
					match(WS);
					}
				}

				setState(442);
				match(MoreThan);
				setState(444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(443);
					htmlContent();
					}
					break;
				}
				setState(446);
				match(CLOSE_TAG);
				setState(447);
				match(Identifier);
				setState(448);
				match(MoreThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(LessThan);
				setState(450);
				match(Identifier);
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(452);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(451);
							match(WS);
							}
						}

						setState(454);
						htmlAttribute();
						}
						} 
					}
					setState(459);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(460);
					match(WS);
					}
				}

				setState(463);
				match(Divide);
				setState(464);
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
		enterRule(_localctx, 68, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2253483444535553L) != 0)) {
				{
				setState(469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(467);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(468);
					singleExpression(0);
					}
					break;
				}
				}
				setState(473);
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
		enterRule(_localctx, 70, RULE_htmlAttribute);
		int _la;
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(Identifier);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(475);
					match(Assign);
					setState(476);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(OpenBracket);
				setState(480);
				match(Class);
				setState(481);
				match(Dot);
				setState(482);
				match(Identifier);
				setState(483);
				match(CloseBracket);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(484);
					match(Assign);
					setState(485);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(OpenParen);
				setState(489);
				match(Identifier);
				setState(490);
				match(CloseParen);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(491);
					match(Assign);
					setState(492);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				directive();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(496);
					match(Assign);
					setState(497);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
				match(Class);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(501);
					match(Assign);
					setState(502);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(505);
				match(OpenBracket);
				setState(506);
				match(Identifier);
				setState(507);
				match(CloseBracket);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(508);
					match(Assign);
					setState(509);
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
		enterRule(_localctx, 72, RULE_mustacheExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(OPEN_MUSTACHE);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2253483444535553L) != 0)) {
				{
				setState(515);
				singleExpression(0);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(516);
					match(Comma);
					setState(517);
					singleExpression(0);
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(525);
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
		enterRule(_localctx, 74, RULE_htmlAttributeValue);
		int _la;
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(StringLiteral);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(OpenBrace);
				setState(529);
				singleExpression(0);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(530);
					match(Comma);
					setState(531);
					singleExpression(0);
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				match(CloseBrace);
				}
				break;
			case Qut:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				match(Qut);
				setState(540);
				singleExpression(0);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(541);
					match(Comma);
					setState(542);
					singleExpression(0);
					}
					}
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(548);
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
		enterRule(_localctx, 76, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(OpenBracket);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2253483444535553L) != 0)) {
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

			setState(563);
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
		enterRule(_localctx, 78, RULE_arrayCss);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(OpenBracket);
			setState(566);
			match(BACKTICK);
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(567);
					singleExpressionCss();
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(573);
			match(BACKTICK);
			setState(574);
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
		enterRule(_localctx, 80, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(OpenBrace);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181072896L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2253483444535553L) != 0)) {
				{
				setState(577);
				propertyAssignment();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(578);
					match(Comma);
					setState(579);
					propertyAssignment();
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(587);
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
		enterRule(_localctx, 82, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			singleExpression(0);
			setState(590);
			match(Colon);
			setState(591);
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
		enterRule(_localctx, 84, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 1048583L) != 0)) ) {
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
		"\u0004\u0001\u0095\u0254\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0005"+
		"\u0000Y\b\u0000\n\u0000\f\u0000\\\t\u0000\u0001\u0001\u0003\u0001_\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002c\b\u0002\n\u0002\f\u0002f\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003k\b\u0003\u0001\u0003"+
		"\u0003\u0003n\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"s\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"y\b\u0004\n\u0004\f\u0004|\t\u0004\u0003\u0004~\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0083\b\u0004\u0001\u0004\u0003\u0004\u0086"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u008d\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0092"+
		"\b\u0006\n\u0006\f\u0006\u0095\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009d\b\u0007\n\u0007"+
		"\f\u0007\u00a0\t\u0007\u0003\u0007\u00a2\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0003\b\u00a7\b\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ac\b\b\n"+
		"\b\f\b\u00af\t\b\u0001\b\u0001\b\u0005\b\u00b3\b\b\n\b\f\b\u00b6\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00bb\b\b\n\b\f\b\u00be\t\b\u0001\b\u0001\b"+
		"\u0003\b\u00c2\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0003\n\u00c9"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ce\b\n\n\n\f\n\u00d1\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0003\u000b\u00d6\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00da\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00de\b"+
		"\u000b\u0001\u000b\u0003\u000b\u00e1\b\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00e6\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00eb\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00f8\b\u000e\n"+
		"\u000e\f\u000e\u00fb\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0105"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010b"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0131\b\u000e\n\u000e\f\u000e\u0134\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0142\b\u0011\n\u0011\f\u0011\u0145\t\u0011\u0003\u0011\u0147\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0154\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0158\b\u0014\n\u0014"+
		"\f\u0014\u015b\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0169\b\u0016\n\u0016\f\u0016\u016c"+
		"\t\u0016\u0001\u0016\u0003\u0016\u016f\b\u0016\u0003\u0016\u0171\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u017b\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0003\u001d\u0194\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u019d\b\u001e\n\u001e\f\u001e\u01a0\t\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u01a6\b\u001f\u0001 \u0004"+
		" \u01a9\b \u000b \f \u01aa\u0001!\u0001!\u0001!\u0003!\u01b0\b!\u0001"+
		"!\u0005!\u01b3\b!\n!\f!\u01b6\t!\u0001!\u0003!\u01b9\b!\u0001!\u0001!"+
		"\u0003!\u01bd\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01c5"+
		"\b!\u0001!\u0005!\u01c8\b!\n!\f!\u01cb\t!\u0001!\u0003!\u01ce\b!\u0001"+
		"!\u0001!\u0003!\u01d2\b!\u0001\"\u0001\"\u0005\"\u01d6\b\"\n\"\f\"\u01d9"+
		"\t\"\u0001#\u0001#\u0001#\u0003#\u01de\b#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0001#\u0001#\u0003#\u01e7\b#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01ee\b#\u0001#\u0001#\u0001#\u0003#\u01f3\b#\u0001#\u0001#\u0001"+
		"#\u0003#\u01f8\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01ff\b#\u0003"+
		"#\u0201\b#\u0001$\u0001$\u0001$\u0001$\u0005$\u0207\b$\n$\f$\u020a\t$"+
		"\u0003$\u020c\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005"+
		"%\u0215\b%\n%\f%\u0218\t%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005"+
		"%\u0220\b%\n%\f%\u0223\t%\u0001%\u0001%\u0003%\u0227\b%\u0001&\u0001&"+
		"\u0001&\u0001&\u0005&\u022d\b&\n&\f&\u0230\t&\u0003&\u0232\b&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0005\'\u0239\b\'\n\'\f\'\u023c\t\'\u0001\'"+
		"\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0005(\u0245\b(\n(\f(\u0248"+
		"\t(\u0003(\u024a\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001\u023a\u0001\u001c+\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRT\u0000\u0003\u0001\u0000\u0087\u0095\u0001\u0000}~\u0002\u0000"+
		"ceww\u0292\u0000V\u0001\u0000\u0000\u0000\u0002^\u0001\u0000\u0000\u0000"+
		"\u0004d\u0001\u0000\u0000\u0000\u0006r\u0001\u0000\u0000\u0000\b\u0085"+
		"\u0001\u0000\u0000\u0000\n\u008c\u0001\u0000\u0000\u0000\f\u008e\u0001"+
		"\u0000\u0000\u0000\u000e\u0098\u0001\u0000\u0000\u0000\u0010\u00a6\u0001"+
		"\u0000\u0000\u0000\u0012\u00c3\u0001\u0000\u0000\u0000\u0014\u00c8\u0001"+
		"\u0000\u0000\u0000\u0016\u00e0\u0001\u0000\u0000\u0000\u0018\u00e2\u0001"+
		"\u0000\u0000\u0000\u001a\u00ea\u0001\u0000\u0000\u0000\u001c\u010a\u0001"+
		"\u0000\u0000\u0000\u001e\u0135\u0001\u0000\u0000\u0000 \u013a\u0001\u0000"+
		"\u0000\u0000\"\u013c\u0001\u0000\u0000\u0000$\u014a\u0001\u0000\u0000"+
		"\u0000&\u014c\u0001\u0000\u0000\u0000(\u0155\u0001\u0000\u0000\u0000*"+
		"\u015e\u0001\u0000\u0000\u0000,\u0164\u0001\u0000\u0000\u0000.\u017a\u0001"+
		"\u0000\u0000\u00000\u017c\u0001\u0000\u0000\u00002\u0180\u0001\u0000\u0000"+
		"\u00004\u0184\u0001\u0000\u0000\u00006\u0188\u0001\u0000\u0000\u00008"+
		"\u018e\u0001\u0000\u0000\u0000:\u0193\u0001\u0000\u0000\u0000<\u0199\u0001"+
		"\u0000\u0000\u0000>\u01a5\u0001\u0000\u0000\u0000@\u01a8\u0001\u0000\u0000"+
		"\u0000B\u01d1\u0001\u0000\u0000\u0000D\u01d7\u0001\u0000\u0000\u0000F"+
		"\u0200\u0001\u0000\u0000\u0000H\u0202\u0001\u0000\u0000\u0000J\u0226\u0001"+
		"\u0000\u0000\u0000L\u0228\u0001\u0000\u0000\u0000N\u0235\u0001\u0000\u0000"+
		"\u0000P\u0240\u0001\u0000\u0000\u0000R\u024d\u0001\u0000\u0000\u0000T"+
		"\u0251\u0001\u0000\u0000\u0000VZ\u0003\u0004\u0002\u0000WY\u0003\n\u0005"+
		"\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0001\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]_\u0005\u0014\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_\u0003\u0001\u0000\u0000\u0000`a\u0005"+
		"j\u0000\u0000ac\u0003\u0006\u0003\u0000b`\u0001\u0000\u0000\u0000cf\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"e\u0005\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005e\u0000"+
		"\u0000hs\u0003\u0002\u0001\u0000ik\u0005x\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000ln\u0003\b\u0004"+
		"\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000op\u0005a\u0000\u0000pq\u0005e\u0000\u0000qs\u0003\u0002\u0001"+
		"\u0000rg\u0001\u0000\u0000\u0000rj\u0001\u0000\u0000\u0000s\u0007\u0001"+
		"\u0000\u0000\u0000t}\u0005\u0012\u0000\u0000uz\u0005x\u0000\u0000vw\u0005"+
		"\u0015\u0000\u0000wy\u0005x\u0000\u0000xv\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}u\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0086\u0005\u0013\u0000\u0000\u0080\u0082\u0005\u0012\u0000\u0000\u0081"+
		"\u0083\u0005\b\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0005\u0013\u0000\u0000\u0085t\u0001\u0000\u0000\u0000\u0085\u0080\u0001"+
		"\u0000\u0000\u0000\u0086\t\u0001\u0000\u0000\u0000\u0087\u008d\u0003\u0014"+
		"\n\u0000\u0088\u008d\u0003\u0010\b\u0000\u0089\u008d\u0003*\u0015\u0000"+
		"\u008a\u008d\u0003:\u001d\u0000\u008b\u008d\u0003\f\u0006\u0000\u008c"+
		"\u0087\u0001\u0000\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008c"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u000b\u0001\u0000\u0000\u0000\u008e"+
		"\u0093\u0003\u001c\u000e\u0000\u008f\u0090\u0005\u0015\u0000\u0000\u0090"+
		"\u0092\u0003\u001c\u000e\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0002\u0001\u0000\u0097"+
		"\r\u0001\u0000\u0000\u0000\u0098\u00a1\u0005P\u0000\u0000\u0099\u009e"+
		"\u0003\u001c\u000e\u0000\u009a\u009b\u0005\u0015\u0000\u0000\u009b\u009d"+
		"\u0003\u001c\u000e\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u0099\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0003\u0002\u0001\u0000\u00a4\u000f\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0005\u0006\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005x\u0000\u0000\u00a9\u00ad\u0005\u0010\u0000\u0000\u00aa\u00ac\u0003"+
		"\u001c\u000e\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b4\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005\u0015\u0000\u0000\u00b1\u00b3\u0003"+
		"\u001c\u000e\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0005\u0011\u0000\u0000\u00b8\u00bc\u0005"+
		"\u0012\u0000\u0000\u00b9\u00bb\u0003\n\u0005\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005\u0013"+
		"\u0000\u0000\u00c0\u00c2\u0003\u0012\t\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u0011\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4\u00c5\u0005x\u0000\u0000"+
		"\u00c5\u00c6\u0003\u0002\u0001\u0000\u00c6\u0013\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c9\u0003\u0016\u000b\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cf\u0003\u0018\f\u0000\u00cb\u00cc\u0005\u0015\u0000\u0000\u00cc"+
		"\u00ce\u0003\u0018\f\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\u0002\u0001\u0000\u00d3\u0015"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005\u0006\u0000\u0000\u00d5\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00e1\u0005M\u0000\u0000\u00d8\u00da\u0005"+
		"\u0006\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00e1\u0005"+
		"\u0007\u0000\u0000\u00dc\u00de\u0005\u0006\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00e1\u0005i\u0000\u0000\u00e0\u00d5\u0001\u0000"+
		"\u0000\u0000\u00e0\u00d9\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e1\u0017\u0001\u0000\u0000\u0000\u00e2\u00e5\u0003\u001a"+
		"\r\u0000\u00e3\u00e4\u0005\u0016\u0000\u0000\u00e4\u00e6\u0003\u001c\u000e"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6\u0019\u0001\u0000\u0000\u0000\u00e7\u00eb\u0003L&\u0000\u00e8"+
		"\u00eb\u0005x\u0000\u0000\u00e9\u00eb\u0005\u0086\u0000\u0000\u00ea\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u001b\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0006\u000e\uffff\uffff\u0000\u00ed\u010b\u0003T*\u0000\u00ee\u010b\u0003"+
		"L&\u0000\u00ef\u010b\u0003P(\u0000\u00f0\u010b\u0003H$\u0000\u00f1\u010b"+
		"\u0003\u000e\u0007\u0000\u00f2\u010b\u0003@ \u0000\u00f3\u00f4\u0005\u0010"+
		"\u0000\u0000\u00f4\u00f9\u0003\u001c\u000e\u0000\u00f5\u00f6\u0005\u0015"+
		"\u0000\u0000\u00f6\u00f8\u0003\u001c\u000e\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0011"+
		"\u0000\u0000\u00fd\u010b\u0001\u0000\u0000\u0000\u00fe\u010b\u0005x\u0000"+
		"\u0000\u00ff\u010b\u0005s\u0000\u0000\u0100\u0101\u0005\u0012\u0000\u0000"+
		"\u0101\u0104\u0003\u001c\u000e\u0000\u0102\u0103\u0005\u0010\u0000\u0000"+
		"\u0103\u0105\u0005\u0011\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005\u0013\u0000\u0000\u0107\u010b\u0001\u0000\u0000\u0000"+
		"\u0108\u010b\u0005X\u0000\u0000\u0109\u010b\u0003\u001e\u000f\u0000\u010a"+
		"\u00ec\u0001\u0000\u0000\u0000\u010a\u00ee\u0001\u0000\u0000\u0000\u010a"+
		"\u00ef\u0001\u0000\u0000\u0000\u010a\u00f0\u0001\u0000\u0000\u0000\u010a"+
		"\u00f1\u0001\u0000\u0000\u0000\u010a\u00f2\u0001\u0000\u0000\u0000\u010a"+
		"\u00f3\u0001\u0000\u0000\u0000\u010a\u00fe\u0001\u0000\u0000\u0000\u010a"+
		"\u00ff\u0001\u0000\u0000\u0000\u010a\u0100\u0001\u0000\u0000\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u0132\u0001\u0000\u0000\u0000\u010c\u010d\n\u0013\u0000\u0000\u010d\u010e"+
		"\u0005\u001b\u0000\u0000\u010e\u0131\u0003\u001c\u000e\u0014\u010f\u0110"+
		"\n\u0012\u0000\u0000\u0110\u0111\u0005\"\u0000\u0000\u0111\u0131\u0003"+
		"\u001c\u000e\u0013\u0112\u0113\n\u0011\u0000\u0000\u0113\u0114\u0005#"+
		"\u0000\u0000\u0114\u0131\u0003\u001c\u000e\u0012\u0115\u0116\n\u0010\u0000"+
		"\u0000\u0116\u0117\u0005\u001e\u0000\u0000\u0117\u0131\u0003\u001c\u000e"+
		"\u0011\u0118\u0119\n\u000f\u0000\u0000\u0119\u011a\u0005\u001f\u0000\u0000"+
		"\u011a\u0131\u0003\u001c\u000e\u0010\u011b\u011c\n\u000e\u0000\u0000\u011c"+
		"\u011d\u0005\u0019\u0000\u0000\u011d\u0131\u0003\u001c\u000e\u000f\u011e"+
		"\u011f\n\r\u0000\u0000\u011f\u0120\u00055\u0000\u0000\u0120\u0131\u0003"+
		"\u001c\u000e\u000e\u0121\u0122\n\f\u0000\u0000\u0122\u0123\u0005\u0017"+
		"\u0000\u0000\u0123\u0124\u0003\u001c\u000e\u0000\u0124\u0125\u0005\u0019"+
		"\u0000\u0000\u0125\u0126\u0003\u001c\u000e\r\u0126\u0131\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\n\u000b\u0000\u0000\u0128\u0129\u0005\u0016\u0000\u0000"+
		"\u0129\u0131\u0003\u001c\u000e\f\u012a\u012b\n\n\u0000\u0000\u012b\u0131"+
		"\u0003\u001c\u000e\u000b\u012c\u012d\n\u0005\u0000\u0000\u012d\u0131\u0005"+
		"\u001c\u0000\u0000\u012e\u012f\n\u0003\u0000\u0000\u012f\u0131\u0005\u001d"+
		"\u0000\u0000\u0130\u010c\u0001\u0000\u0000\u0000\u0130\u010f\u0001\u0000"+
		"\u0000\u0000\u0130\u0112\u0001\u0000\u0000\u0000\u0130\u0115\u0001\u0000"+
		"\u0000\u0000\u0130\u0118\u0001\u0000\u0000\u0000\u0130\u011b\u0001\u0000"+
		"\u0000\u0000\u0130\u011e\u0001\u0000\u0000\u0000\u0130\u0121\u0001\u0000"+
		"\u0000\u0000\u0130\u0127\u0001\u0000\u0000\u0000\u0130\u012a\u0001\u0000"+
		"\u0000\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u001d\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u001b"+
		"\u0000\u0000\u0136\u0137\u0005x\u0000\u0000\u0137\u0138\u0003P(\u0000"+
		"\u0138\u0139\u0005\u0014\u0000\u0000\u0139\u001f\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0007\u0000\u0000\u0000\u013b!\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0005x\u0000\u0000\u013d\u0146\u0005\u0010\u0000\u0000\u013e\u0143"+
		"\u0003\u001c\u000e\u0000\u013f\u0140\u0005\u0015\u0000\u0000\u0140\u0142"+
		"\u0003\u001c\u000e\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0145"+
		"\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0146\u013e\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005\u0011\u0000\u0000\u0149#\u0001\u0000\u0000\u0000\u014a\u014b\u0007"+
		"\u0001\u0000\u0000\u014b%\u0001\u0000\u0000\u0000\u014c\u014d\u0005[\u0000"+
		"\u0000\u014d\u014e\u0005\u0010\u0000\u0000\u014e\u014f\u0003\u001c\u000e"+
		"\u0000\u014f\u0150\u0005\u0011\u0000\u0000\u0150\u0153\u0003(\u0014\u0000"+
		"\u0151\u0152\u0005J\u0000\u0000\u0152\u0154\u0003(\u0014\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\'\u0001"+
		"\u0000\u0000\u0000\u0155\u0159\u0005\u0012\u0000\u0000\u0156\u0158\u0003"+
		"\n\u0005\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000"+
		"\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0005\u0013\u0000\u0000\u015d)\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0005\u0003\u0000\u0000\u015f\u0160\u0005\b\u0000\u0000"+
		"\u0160\u0161\u0005\u0010\u0000\u0000\u0161\u0162\u0003,\u0016\u0000\u0162"+
		"\u0163\u0005\u0011\u0000\u0000\u0163+\u0001\u0000\u0000\u0000\u0164\u0170"+
		"\u0005\u0012\u0000\u0000\u0165\u016a\u0003.\u0017\u0000\u0166\u0167\u0005"+
		"\u0015\u0000\u0000\u0167\u0169\u0003.\u0017\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000"+
		"\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u016f\u0005\u0015"+
		"\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u0165\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0005\u0013\u0000\u0000\u0173-\u0001\u0000\u0000"+
		"\u0000\u0174\u017b\u00030\u0018\u0000\u0175\u017b\u00032\u0019\u0000\u0176"+
		"\u017b\u00034\u001a\u0000\u0177\u017b\u00036\u001b\u0000\u0178\u017b\u0003"+
		"8\u001c\u0000\u0179\u017b\u0003\u001e\u000f\u0000\u017a\u0174\u0001\u0000"+
		"\u0000\u0000\u017a\u0175\u0001\u0000\u0000\u0000\u017a\u0176\u0001\u0000"+
		"\u0000\u0000\u017a\u0177\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b/\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0005\t\u0000\u0000\u017d\u017e\u0005\u0019\u0000\u0000"+
		"\u017e\u017f\u0005e\u0000\u0000\u017f1\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0005\n\u0000\u0000\u0181\u0182\u0005\u0019\u0000\u0000\u0182\u0183\u0005"+
		"d\u0000\u0000\u01833\u0001\u0000\u0000\u0000\u0184\u0185\u0005\u000b\u0000"+
		"\u0000\u0185\u0186\u0005\u0019\u0000\u0000\u0186\u0187\u0003L&\u0000\u0187"+
		"5\u0001\u0000\u0000\u0000\u0188\u0189\u0005\f\u0000\u0000\u0189\u018a"+
		"\u0005\u0019\u0000\u0000\u018a\u018b\u0005\u0004\u0000\u0000\u018b\u018c"+
		"\u0003@ \u0000\u018c\u018d\u0005\u0004\u0000\u0000\u018d7\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0005\r\u0000\u0000\u018f\u0190\u0005\u0019\u0000"+
		"\u0000\u0190\u0191\u0003L&\u0000\u01919\u0001\u0000\u0000\u0000\u0192"+
		"\u0194\u0005\u0006\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0005\u0005\u0000\u0000\u0196\u0197\u0005x\u0000\u0000\u0197\u0198"+
		"\u0003<\u001e\u0000\u0198;\u0001\u0000\u0000\u0000\u0199\u019e\u0005\u0012"+
		"\u0000\u0000\u019a\u019d\u0003\u001c\u000e\u0000\u019b\u019d\u0003\n\u0005"+
		"\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000"+
		"\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0013\u0000"+
		"\u0000\u01a2=\u0001\u0000\u0000\u0000\u01a3\u01a6\u0003@ \u0000\u01a4"+
		"\u01a6\u0003\u001c\u000e\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a6?\u0001\u0000\u0000\u0000\u01a7\u01a9"+
		"\u0003B!\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01abA\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005*\u0000\u0000"+
		"\u01ad\u01b4\u0005x\u0000\u0000\u01ae\u01b0\u0005|\u0000\u0000\u01af\u01ae"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b3\u0003F#\u0000\u01b2\u01af\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b9\u0005|\u0000"+
		"\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0005+\u0000\u0000"+
		"\u01bb\u01bd\u0003D\"\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0005\u0085\u0000\u0000\u01bf\u01c0\u0005x\u0000\u0000\u01c0\u01d2"+
		"\u0005+\u0000\u0000\u01c1\u01c2\u0005*\u0000\u0000\u01c2\u01c9\u0005x"+
		"\u0000\u0000\u01c3\u01c5\u0005|\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c8\u0003F#\u0000\u01c7\u01c4\u0001\u0000\u0000\u0000\u01c8"+
		"\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb"+
		"\u01c9\u0001\u0000\u0000\u0000\u01cc\u01ce\u0005|\u0000\u0000\u01cd\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005#\u0000\u0000\u01d0\u01d2\u0005"+
		"+\u0000\u0000\u01d1\u01ac\u0001\u0000\u0000\u0000\u01d1\u01c1\u0001\u0000"+
		"\u0000\u0000\u01d2C\u0001\u0000\u0000\u0000\u01d3\u01d6\u0003B!\u0000"+
		"\u01d4\u01d6\u0003\u001c\u000e\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d8E\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da"+
		"\u01dd\u0005x\u0000\u0000\u01db\u01dc\u0005\u0016\u0000\u0000\u01dc\u01de"+
		"\u0003J%\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000"+
		"\u0000\u0000\u01de\u0201\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\u000e"+
		"\u0000\u0000\u01e0\u01e1\u0005\u0005\u0000\u0000\u01e1\u01e2\u0005\u001b"+
		"\u0000\u0000\u01e2\u01e3\u0005x\u0000\u0000\u01e3\u01e6\u0005\u000f\u0000"+
		"\u0000\u01e4\u01e5\u0005\u0016\u0000\u0000\u01e5\u01e7\u0003J%\u0000\u01e6"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"+
		"\u0201\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005\u0010\u0000\u0000\u01e9"+
		"\u01ea\u0005x\u0000\u0000\u01ea\u01ed\u0005\u0011\u0000\u0000\u01eb\u01ec"+
		"\u0005\u0016\u0000\u0000\u01ec\u01ee\u0003J%\u0000\u01ed\u01eb\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u0201\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f2\u0003$\u0012\u0000\u01f0\u01f1\u0005\u0016\u0000"+
		"\u0000\u01f1\u01f3\u0003J%\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f3\u0201\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f7\u0005\u0005\u0000\u0000\u01f5\u01f6\u0005\u0016\u0000\u0000\u01f6"+
		"\u01f8\u0003J%\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f8\u0201\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005"+
		"\u000e\u0000\u0000\u01fa\u01fb\u0005x\u0000\u0000\u01fb\u01fe\u0005\u000f"+
		"\u0000\u0000\u01fc\u01fd\u0005\u0016\u0000\u0000\u01fd\u01ff\u0003J%\u0000"+
		"\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000"+
		"\u01ff\u0201\u0001\u0000\u0000\u0000\u0200\u01da\u0001\u0000\u0000\u0000"+
		"\u0200\u01df\u0001\u0000\u0000\u0000\u0200\u01e8\u0001\u0000\u0000\u0000"+
		"\u0200\u01ef\u0001\u0000\u0000\u0000\u0200\u01f4\u0001\u0000\u0000\u0000"+
		"\u0200\u01f9\u0001\u0000\u0000\u0000\u0201G\u0001\u0000\u0000\u0000\u0202"+
		"\u020b\u0005\u0083\u0000\u0000\u0203\u0208\u0003\u001c\u000e\u0000\u0204"+
		"\u0205\u0005\u0015\u0000\u0000\u0205\u0207\u0003\u001c\u000e\u0000\u0206"+
		"\u0204\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208"+
		"\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209"+
		"\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b"+
		"\u0203\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c"+
		"\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0005\u0084\u0000\u0000\u020e"+
		"I\u0001\u0000\u0000\u0000\u020f\u0227\u0005e\u0000\u0000\u0210\u0211\u0005"+
		"\u0012\u0000\u0000\u0211\u0216\u0003\u001c\u000e\u0000\u0212\u0213\u0005"+
		"\u0015\u0000\u0000\u0213\u0215\u0003\u001c\u000e\u0000\u0214\u0212\u0001"+
		"\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0214\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0219\u0001"+
		"\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u021a\u0005"+
		"\u0013\u0000\u0000\u021a\u0227\u0001\u0000\u0000\u0000\u021b\u021c\u0005"+
		"\u0082\u0000\u0000\u021c\u0221\u0003\u001c\u000e\u0000\u021d\u021e\u0005"+
		"\u0015\u0000\u0000\u021e\u0220\u0003\u001c\u000e\u0000\u021f\u021d\u0001"+
		"\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u021f\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0224\u0001"+
		"\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0225\u0005"+
		"\u0082\u0000\u0000\u0225\u0227\u0001\u0000\u0000\u0000\u0226\u020f\u0001"+
		"\u0000\u0000\u0000\u0226\u0210\u0001\u0000\u0000\u0000\u0226\u021b\u0001"+
		"\u0000\u0000\u0000\u0227K\u0001\u0000\u0000\u0000\u0228\u0231\u0005\u000e"+
		"\u0000\u0000\u0229\u022e\u0003\u001c\u000e\u0000\u022a\u022b\u0005\u0015"+
		"\u0000\u0000\u022b\u022d\u0003\u001c\u000e\u0000\u022c\u022a\u0001\u0000"+
		"\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000"+
		"\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000"+
		"\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0229\u0001\u0000"+
		"\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0005\u000f\u0000\u0000\u0234M\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0005\u000e\u0000\u0000\u0236\u023a\u0005\u0004\u0000"+
		"\u0000\u0237\u0239\u0003\u001e\u000f\u0000\u0238\u0237\u0001\u0000\u0000"+
		"\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023d\u0001\u0000\u0000"+
		"\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u023e\u0005\u0004\u0000"+
		"\u0000\u023e\u023f\u0005\u000f\u0000\u0000\u023fO\u0001\u0000\u0000\u0000"+
		"\u0240\u0249\u0005\u0012\u0000\u0000\u0241\u0246\u0003R)\u0000\u0242\u0243"+
		"\u0005\u0015\u0000\u0000\u0243\u0245\u0003R)\u0000\u0244\u0242\u0001\u0000"+
		"\u0000\u0000\u0245\u0248\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000"+
		"\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u0241\u0001\u0000"+
		"\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000"+
		"\u0000\u0000\u024b\u024c\u0005\u0013\u0000\u0000\u024cQ\u0001\u0000\u0000"+
		"\u0000\u024d\u024e\u0003\u001c\u000e\u0000\u024e\u024f\u0005\u0019\u0000"+
		"\u0000\u024f\u0250\u0003\u001c\u000e\u0000\u0250S\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0007\u0002\u0000\u0000\u0252U\u0001\u0000\u0000\u0000HZ"+
		"^djmrz}\u0082\u0085\u008c\u0093\u009e\u00a1\u00a6\u00ad\u00b4\u00bc\u00c1"+
		"\u00c8\u00cf\u00d5\u00d9\u00dd\u00e0\u00e5\u00ea\u00f9\u0104\u010a\u0130"+
		"\u0132\u0143\u0146\u0153\u0159\u016a\u016e\u0170\u017a\u0193\u019c\u019e"+
		"\u01a5\u01aa\u01af\u01b4\u01b8\u01bc\u01c4\u01c9\u01cd\u01d1\u01d5\u01d7"+
		"\u01dd\u01e6\u01ed\u01f2\u01f7\u01fe\u0200\u0208\u020b\u0216\u0221\u0226"+
		"\u022e\u0231\u023a\u0246\u0249";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}