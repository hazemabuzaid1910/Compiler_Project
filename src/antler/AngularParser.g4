parser grammar AngularParser;

options {
  tokenVocab=AngularLexer;
}
program : importStatement statment* ;

eos : SemiColon? ;

importStatement : (Import importFromBlock)* ;
importFromBlock
    : StringLiteral eos
    | Identifier? moduleItems? From StringLiteral eos
    ;

moduleItems
    : '{' (Identifier (Comma Identifier)*)? '}'
    | '{' (Component )? '}'
    ;


statment
    : variableStatement
    | functionDeclaration
    | componentDeclaration
    | classDeclaration
    | expressionStatement
    ;

expressionStatement : singleExpression (',' singleExpression)* eos ;

returnStatement : Return (singleExpression (',' singleExpression)*)? eos ;

functionDeclaration
    : Export? Identifier '(' singleExpression* (',' singleExpression)* ')' '{' statment* '}' exportStatement?
    ;

exportStatement
    : Export Identifier eos
    ;

variableStatement
    : varModifier ? variableDeclaration (',' variableDeclaration)* eos
    ;

varModifier
    : Export? Var
    | Export? Let
    | Export? Const
    ;

variableDeclaration
    : assignable (Assign singleExpression)?
    ;

assignable : arrayLiteral | Identifier | ObjectLiteral ;

singleExpression:
        literal
        | arrayLiteral
        | objectLiteral
        |mustacheExpression
        |returnStatement
        | singleExpression Dot singleExpression
        | singleExpression Multiply singleExpression
        | singleExpression Divide singleExpression
        | singleExpression Plus singleExpression
        | singleExpression Minus singleExpression
        | singleExpression Colon singleExpression
        | singleExpression And singleExpression
        | singleExpression QuestionMark singleExpression Colon singleExpression
        | singleExpression Assign singleExpression
        | singleExpression singleExpression
        | htmlElements
        | OpenParen singleExpression (Comma singleExpression)*  CloseParen
        | Identifier
        | Map
        | singleExpression PlusPlus
        | OpenBrace singleExpression (OpenParen CloseParen)?CloseBrace
        | singleExpression MinusMinus
        | This
         ;

singleExpressionCss:
     Dot Identifier '{' (attributeCss ':' (DecimalLiteral ? Identifier ? StringLiteral?) ';')* '}'
;
attributeCss:
 Margin
|Margin_top
|Padding
|Color
|Border_color
|Box_shadow
|Flex
|Background_color
|Width
|Line_height
|Flex_direction
|Flex_wrap
|Gap
|Justify_content
|Display
;
functionCall
    : Identifier OpenParen (singleExpression (Comma singleExpression)*)? CloseParen
    ;

directive
    : '*ngIf' Assign singleExpression
    | '*ngFor' Assign singleExpression
    ;


ifStatement
    : If OpenParen singleExpression CloseParen statementBlock (Else statementBlock)?
    ;

statementBlock
    : '{' statment* '}'
    ;



componentDeclaration
    : At Component '(' componentAttributes ')'
    ;

componentAttributes
    : '{' selectorDeclaration? ','? standaloneDeclaration? ','? importsDeclaration? ','? templateDeclaration? ','? stylesDeclaration? '}'
    ;

selectorDeclaration
    : Selector Colon StringLiteral
    ;

standaloneDeclaration
    : Standalone Colon BooleanLiteral
    ;

importsDeclaration
    : Imports Colon arrayLiteral
    ;

templateDeclaration
    : Template Colon '`' htmlElements '`'
    ;

stylesDeclaration
    : Styles  Colon arrayCss
    ;


classDeclaration
    : Export? Class Identifier  classBody
    ;


classBody
    :'{' (singleExpression|statment )* '}'
    ;

templateStatement
    : htmlElements
    | singleExpression
    ;

htmlElements : htmlElement+ ;
htmlElement
    : '<' Identifier (WS? htmlAttribute)* WS? '>' htmlContent? CLOSE_TAG Identifier '>'
    | '<' Identifier (WS? htmlAttribute)* WS? '/' '>'
    ;

htmlContent : (htmlElement | mustacheExpression | singleExpression)* ;

htmlAttribute
    : Identifier (Assign htmlAttributeValue)?                  // Standard attributes
    | '[' Class Dot Identifier ']' (Assign htmlAttributeValue)?
    | '(' Identifier ')' (Assign htmlAttributeValue)?          // Angular event bindings
    | directive (Assign htmlAttributeValue)?
    | Class (Assign htmlAttributeValue)?
    | Alt (Assign htmlAttributeValue)?
    | '[' Src ']' (Assign htmlAttributeValue)?
    ;

mustacheExpression : OPEN_MUSTACHE singleExpression CLOSE_MUSTACHE ;

  htmlAttributeValue : StringLiteral
                     | '{'singleExpression (','  singleExpression)*'}' ;

arrayLiteral : '['  (singleExpression (',' singleExpression)*)?  ']'
             ;
arrayCss : '['  '`' (singleExpressionCss)*? '`' ']'
             ;
objectLiteral
    : '{' (propertyAssignment (',' propertyAssignment)*)? '}'
    ;

propertyAssignment
    : singleExpression ':' singleExpression
    ;

literal
    : NullLiteral
    | BooleanLiteral
    | StringLiteral
    | DecimalLiteral
    ;
