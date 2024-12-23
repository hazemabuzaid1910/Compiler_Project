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
    : (Identifier Comma)? '{' (Identifier ','?)* '}'
    ;


statment
    : variableStatement
    | functionDeclaration
    | componentDeclaration

    ;

expressionStatement : singleExpression (',' singleExpression)* eos ;

returnStatement : Return (singleExpression (',' singleExpression)*)? eos ;

functionDeclaration
    : Export? Function_ Identifier '(' singleExpression* (',' singleExpression)* ')' '{' statment* '}' exportStatement?
    ;

exportStatement
    : Export Identifier eos
    ;

variableStatement
    : varModifier variableDeclaration (',' variableDeclaration)* eos
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

singleExpression
    : literal
    | arrayLiteral
    | objectLiteral
    | functionCall
    | directive
    | ifStatement
    | returnStatement
    | htmlElements
    | Identifier
    | singleExpression Dot singleExpression
    | singleExpression Plus singleExpression
    | singleExpression Minus singleExpression
    | OpenParen singleExpression (Comma singleExpression)* CloseParen
    ;

functionCall
    : Identifier OpenParen (singleExpression (Comma singleExpression)*)? CloseParen
    ;

directive
    : '*ngIf' '=' singleExpression
    | '*ngFor' '=' singleExpression
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
    : Styles  Colon arrayLiteral
    ;


classDeclaration
    : Export? Class Identifier '{' classBody* '}'
    ;



classBody
    : variableStatement
    | functionDeclaration
    ;

templateStatement
    : htmlElements
    | singleExpression
    ;

htmlElements : htmlElement+ ;
htmlElement
    : '<' Identifier htmlAttribute* '>' htmlContent? CLOSE_TAG Identifier '>'
    | '<' Identifier htmlAttribute* '/' '>'
    ;
htmlContent : (htmlElement | mustacheExpression | singleExpression)* ;

htmlAttribute
    : Identifier (Assign htmlAttributeValue)?
    ;

mustacheExpression : OPEN_MUSTACHE singleExpression CLOSE_MUSTACHE ;

htmlAttributeValue
    : StringLiteral
    | mustacheExpression
    ;

arrayLiteral : '[' (singleExpression (',' singleExpression)*)? ']' ;

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
