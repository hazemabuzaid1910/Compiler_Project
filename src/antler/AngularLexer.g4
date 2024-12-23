

lexer grammar AngularLexer;

MultiLineComment  : '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment : '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);
WS: [ \t\r\n]+ -> skip;
At                         : '@';
BACKTICK                   : '`';

Component                  : 'Component' ;
Selector                   : 'selector';
Standalone                 : 'standalone';
Imports                    : 'imports';
Template                   : 'template';
Styles                     : 'styles';
OpenBracket                : '[';
CloseBracket               : ']';
OpenParen                  : '(';
CloseParen                 : ')';
OpenBrace                  : '{';
CloseBrace                 : '}';
SemiColon                  : ';';
Comma                      : ',';
Assign                     : '=';
QuestionMark               : '?';
QuestionMarkDot            : '?.';
Colon                      : ':';
Ellipsis                   : '...';
Dot                        : '.';
PlusPlus                   : '++';
MinusMinus                 : '--';
Plus                       : '+';
Minus                      : '-';
BitNot                     : '~';
Not                        : '!';
Multiply                   : '*';
Divide                     : '/';
Modulus                    : '%';
NullCoalesce               : '??';
Hashtag                    : '#';
RightShiftArithmetic       : '>>';
LeftShiftArithmetic        : '<<';
RightShiftLogical          : '>>>';
LessThan                   : '<';
MoreThan                   : '>';
LessThanEquals             : '<=';
GreaterThanEquals          : '>=';
Equals_                    : '==';
NotEquals                  : '!=';
IdentityEquals             : '===';
IdentityNotEquals          : '!==';
BitAnd                     : '&';
BitXOr                     : '^';
BitOr                      : '|';
And                        : '&&';
Or                         : '||';
MultiplyAssign             : '*=';
DivideAssign               : '/=';
ModulusAssign              : '%=';
PlusAssign                 : '+=';
MinusAssign                : '-=';
LeftShiftArithmeticAssign  : '<<=';
RightShiftArithmeticAssign : '>>=';
RightShiftLogicalAssign    : '>>>=';
BitAndAssign               : '&=';
BitXorAssign               : '^=';
BitOrAssign                : '|=';
NullishCoalescingAssign    : '??=';
ARROW                      : '=>';
SinglQuat:'\'';
ReactCreatElement:'React.createElement';
Break      : 'break';
Do         : 'do';
Instanceof : 'instanceof';
Typeof     : 'typeof';
Case       : 'case';
Else       : 'else';
ElseIf     : 'else if';
New        : 'new';
Var        : 'var';
Let        : 'let';
Catch      : 'catch';
Finally    : 'finally';
Return     : 'return';
Void       : 'void';
Continue   : 'continue';
For        : 'for';
Switch     : 'switch';
While      : 'while';
Debugger   : 'debugger';
Function_  : 'function';
This       : 'this';
With       : 'with';
Default    : 'default';
If         : 'if';
Throw      : 'throw';
Delete     : 'delete';
In         : 'in';
Try        : 'try';
As         : 'as';
From       : 'from';
Of         : 'of';
NullLiteral: 'null';
BooleanLiteral: 'true' | 'false';
StringLiteral:
    ('"' DoubleStringCharacter* '"' | '\'' SingleStringCharacter* '\'')
;
/// Future Reserved Words
Src:'src';
Class   : 'class';
Enum    : 'enum';
Extends : 'extends';
Super   : 'super';
Const   : 'const';
Export  : 'export';
Import  : 'import';
Implements   : 'implements' ;
StrictLet    : 'let'        ;
Private      : 'private'    ;
Public       : 'public'     ;
Interface    : 'interface'  ;
Package      : 'package'   ;
Protected    : 'protected'  ;
Static       : 'static'     ;
Map:'map';
UseRef : 'useRef' ;
UseState : 'useState' ;
UseEffect: 'useEffect' ;
    Ws:  (' '|'\t'|'\r'? '\n') ->skip
    ;
DecimalLiteral:
    DecimalIntegerLiteral '.' [0-9] [0-9_]* ExponentPart?
    | '.' [0-9] [0-9_]* ExponentPart?
    | DecimalIntegerLiteral ExponentPart?
;

Identifier: IdentifierStart  IdentifierPart*;
TagName: TagNameStartChar TagNameChar*;
ID: [a-zA-Z]+;
Number : [0-9]+;

fragment ESC: '\\' (["\\/bfnrt] | UNICODE_ESCAPE);
fragment UNICODE_ESCAPE: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;
fragment HEX_DIGIT: [0-9a-fA-F] ;
fragment AttributeChar:
    '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
;
fragment TagNameStartChar:
    [a-zA-Z];

fragment TagNameChar:
    TagNameStartChar
    | '-'
    | '_'
//    | '.'
    | Digit;

fragment Digit: [0-9];

fragment AttributeChars: AttributeChar+ ' '?;

fragment HexChars: '#' [0-9a-fA-F]+;

fragment DecChars: [0-9]+ '%'?;

fragment DoubleQuoteString : '"' ~[<"]* '"';
fragment SingleQuoteString : '\'' ~[<']* '\'';
fragment DoubleStringCharacter: ~["\\] | '\\' EscapeSequence | LineContinuation;

fragment SingleStringCharacter: ~['\\] | '\\' EscapeSequence | LineContinuation;

fragment EscapeSequence:
    CharacterEscapeSequence
    | '0' // no digit ahead! TODO

;

fragment CharacterEscapeSequence: SingleEscapeCharacter | NonEscapeCharacter;
fragment SingleEscapeCharacter: ['"\\bfnrtv];

fragment NonEscapeCharacter: ~['"\\bfnrtv0-9xu\r\n];

fragment EscapeCharacter: SingleEscapeCharacter | [0-9] | [xu];

fragment LineContinuation: '\\' [\r\n\u2028\u2029];

fragment HexDigit: [_0-9a-fA-F];

fragment DecimalIntegerLiteral: '0' | [1-9] [0-9_]*;

fragment ExponentPart: [eE] [+-]? [0-9_]+;

fragment IdentifierPart: IdentifierStart | [\p{Mn}] | [\p{Nd}] | [\p{Pc}];

fragment IdentifierStart: [\p{L}] | [$_];
//fragment IdentifierStart: [\p{L}$] ~[:.];


fragment RegularExpressionFirstChar:
    ~[*\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
;

fragment RegularExpressionChar:
    ~[\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
;

fragment RegularExpressionClassChar: ~[\r\n\u2028\u2029\]\\] | RegularExpressionBackslashSequence;

fragment RegularExpressionBackslashSequence: '\\' ~[\r\n\u2028\u2029];

fragment CapitalLetter : [A-Z];

fragment Lowercase : [a-z];

NgIfDirective : '*ngIf' ;
NgForDirective : '*ngFor' ;
NgModule : 'NgModule' ;
Injectable : 'Injectable' ;
Pipe : 'Pipe' ;


OPEN_MUSTACHE : '{{' ;
CLOSE_MUSTACHE: '}}' ;
CLOSE_TAG     : '</' ;
// Keep other tokens from ReactLexer that are shared
