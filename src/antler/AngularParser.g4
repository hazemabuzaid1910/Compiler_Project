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
        | mustacheExpression
        | returnStatement
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
        |singleExpressionCss
         ;

singleExpressionCss:
     Dot Identifier objectLiteral ';'
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
    : '*ngIf'
    | '*ngFor'
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
    : '{' (componentAttribute (',' componentAttribute)* ','?)? '}'
    ;
componentAttribute
    : selectorDeclaration
    | standaloneDeclaration
    | importsDeclaration
    | templateDeclaration
    | stylesDeclaration
    | singleExpressionCss
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
    : Styles  Colon arrayLiteral
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

htmlContent : (htmlElement  |singleExpression)* ;

htmlAttribute
    : Identifier (Assign htmlAttributeValue)?
    | '[' Class Dot Identifier ']' (Assign htmlAttributeValue)?
    | '(' Identifier ')' (Assign htmlAttributeValue)?
    | directive (Assign htmlAttributeValue)?
    | Class (Assign htmlAttributeValue)?
    |'['Identifier']' (Assign htmlAttributeValue)?
    ;

mustacheExpression : '{{'  (singleExpression (',' singleExpression)*)?  '}}';

  htmlAttributeValue :StringLiteral
                     |  '{'singleExpression (','  singleExpression)* '}'
                     | Qut singleExpression (','  singleExpression)* Qut

                     ;

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



