package Visitor;
import AST.*;
import antler.AngularParser;
import antler.AngularParserBaseVisitor;

public class visitor  extends AngularParserBaseVisitor {
    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx){
        Program program = new Program();
        if(ctx.importStatement()!=null)
        {
            program.setImportStatement(visitImportStatement(ctx.importStatement()));
        }
        for (int i = 0; i < ctx.statment().size(); i++) {
            if (ctx.statment(i)!=null)
            {
                System.out.println(ctx.statment().size());
                program.getSourceElement().add(visitStatment(ctx.statment(i)));
            }
        }

        return program;

    }

    @Override
    public ImportStatmente visitImportStatement(AngularParser.ImportStatementContext ctx)
    { ImportStatmente importStatement = new ImportStatmente ();
        for (int i = 0; i < ctx.importFromBlock().size(); i++) {
            if (ctx.importFromBlock(i)!=null)
            {
                importStatement.getImportFromBlocks().add(visitImportFromBlock(ctx.importFromBlock(i)));
            }
        }
        return importStatement;

    }

    @Override
    public ImportFromBlock visitImportFromBlock(AngularParser.ImportFromBlockContext ctx)
    {
        ImportFromBlock importFromBlock = new ImportFromBlock () ;


        if (ctx.Identifier()!= null){
            importFromBlock.setIdentifier(ctx.Identifier().getText());}
        if (ctx.moduleItems()!=null)
        {
            importFromBlock.setModuleItems(visitModuleItems(ctx.moduleItems()));}

        if (ctx.StringLiteral()!= null){
            importFromBlock.setImportFrom(ctx.StringLiteral().getText());}

        return  importFromBlock;
    }

    @Override
    public ModuleItems visitModuleItems(AngularParser.ModuleItemsContext ctx) {
        ModuleItems moduleItems = new ModuleItems () ;

        if (ctx.Component()!= null)
            moduleItems.setComponent(ctx.Component().getText());

        if (ctx.Identifier(0)!= null)
            moduleItems.setIdentifier1(ctx.Identifier(0).getText());
        if (ctx.Identifier(1)!= null)
            moduleItems.setIdentifier2(ctx.Identifier(1).getText());
        return moduleItems ;
    }


    @Override
    public Statment visitStatment(AngularParser.StatmentContext ctx) {

        Statment statement= new Statment();
        if(ctx.functionDeclaration()!=null)
        {
            statement.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        if(ctx.variableStatement()!=null)
        {
            statement.setVariableStatement(visitVariableStatement(ctx.variableStatement()));
        }
        if(ctx.expressionStatement()!=null)
        {
            statement.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
        }
        if(ctx.componentDeclaration()!=null)
        {
            statement.setComponentDeclaration(visitComponentDeclaration(ctx.componentDeclaration()));
        }
        if(ctx.classDeclaration()!=null)
        {
            statement.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        }
        return statement;
    }


    @Override
    public ComponentDeclaration visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
ComponentDeclaration componentDeclaration=new ComponentDeclaration();
if(ctx.componentAttributes()!=null){
    componentDeclaration.setComponentAttributes(visitComponentAttributes(ctx.componentAttributes()));
}
return componentDeclaration;
    }

    @Override
    public Template visitTemplateDeclaration(AngularParser.TemplateDeclarationContext ctx) {
        Template template=new Template();
if(ctx.Template()!=null)
{
    template.setTemplate(ctx.Template().getText());
}
if(ctx.Colon()!=null){
    template.setColon(ctx.Colon().getText());
}
        if (ctx.htmlElements() != null) {
            template.setHtmlElementsNode(visitHtmlElements(ctx.htmlElements()));
        }
        return template;
    }

    @Override
    public ComponentAttributes visitComponentAttributes(AngularParser.ComponentAttributesContext ctx) {
ComponentAttributes componentAttributes=new ComponentAttributes();
if(ctx.templateDeclaration()!=null){
    componentAttributes.setTemplate(visitTemplateDeclaration(ctx.templateDeclaration()));
}
return componentAttributes;
    }
    @Override
    public HtmlElementsNode visitHtmlElements(AngularParser.HtmlElementsContext ctx) {
        HtmlElementsNode   htmlElementsNode= new HtmlElementsNode();
        for (int i = 0; i < ctx.htmlElement().size(); i++) {
            if (ctx.htmlElement(i) != null) {
                htmlElementsNode.getHtmlElements().add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        return htmlElementsNode;
    }

    @Override
    public HtmlElementNode visitHtmlElement(AngularParser.HtmlElementContext ctx)
    {
        HtmlElementNode htmlElementNode= new HtmlElementNode();
        if(ctx.Identifier(0)!= null)
        {
            htmlElementNode.setTagName(ctx.Identifier(0).getText());
        }
        for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
            if (ctx.htmlAttribute(i) != null) {
                htmlElementNode.getAttributes().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
            }

        }
        if (ctx.htmlContent()!=null)
        {
            htmlElementNode.setContent(visitHtmlContent(ctx.htmlContent()));
        }
        if(ctx.Identifier(1)!= null)
        {
            htmlElementNode.setTagNameClose(ctx.Identifier(1).getText());
        }
        return htmlElementNode;

    }
    @Override
    public HtmlAttributeNode visitHtmlAttribute(AngularParser.HtmlAttributeContext ctx) {
        HtmlAttributeNode htmlAttributeNode = new HtmlAttributeNode();

        if (ctx.Identifier()!=null ) {
            String attributeName = ctx.Identifier().getText();
            htmlAttributeNode.setAttributeName(attributeName);
            boolean attributeNameExists = false;
        }
        if (ctx.Class()!=null ) {
            String attributeName = ctx.Class().getText();
            htmlAttributeNode.setAttributeName(attributeName);
            boolean attributeNameExists = false;
        }
        if (ctx.Alt()!=null ) {
            String attributeName = ctx.Alt().getText();
            htmlAttributeNode.setAttributeName(attributeName);
            boolean attributeNameExists = false;
        }
        if (ctx.htmlAttributeValue()!= null) {
            htmlAttributeNode.setAttributeValue(visitHtmlAttributeValue(ctx.htmlAttributeValue()));
        }

        return htmlAttributeNode;
    }
    @Override
    public HtmlContentNode visitHtmlContent(AngularParser.HtmlContentContext ctx) {
        HtmlContentNode htmlContentNode= new HtmlContentNode();
        for (int i = 0; i < ctx.htmlElement().size(); i++) {
            if (ctx.htmlElement(i) != null) {
                htmlContentNode.getHtmlContent().add(visitHtmlElement(ctx.htmlElement(i)));
            }
        }
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                htmlContentNode.getExpContent().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        return  htmlContentNode;


    }
    @Override
    public HtmlAttributeValueNode visitHtmlAttributeValue(AngularParser.HtmlAttributeValueContext ctx) {
        HtmlAttributeValueNode htmlAttributeValueNode = new HtmlAttributeValueNode();

        if (ctx.StringLiteral() != null) {
            htmlAttributeValueNode.setValue(ctx.StringLiteral().getText());
        }

        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                htmlAttributeValueNode.getExpressions().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }

        return htmlAttributeValueNode;
    }


    @Override
    public Expression visitSingleExpression(AngularParser.SingleExpressionContext ctx) {
        Expression expression =new Expression();
        if (ctx.literal() != null) {
            expression.setLiteralExpression(visitLiteral(ctx.literal()));
            return expression;
        }
       else if (ctx.arrayLiteral() != null) {
            expression.setArrayLiteral( visitArrayLiteral(ctx.arrayLiteral()));
            return expression;
        } else if (ctx.objectLiteral() != null) {
            expression .setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
            return expression ;
        }
        else if (ctx.htmlElements() != null) {
            expression.setHtmlElementsNode(visitHtmlElements(ctx.htmlElements()));
            return expression;
        }
        else if (ctx.Identifier() != null) {
            expression.setIdentifier(ctx.Identifier().getText());

            return expression;
        }
        else if (ctx.singleExpression().size() == 2 && ctx.Dot() != null) {
            Expression left = visitSingleExpression(ctx.singleExpression(0));
            expression.setLeft(left);
            Expression right = visitSingleExpression(ctx.singleExpression(1));
            expression.setRight(right);
            return  expression ;
        }
        else if (ctx.singleExpression().size() == 2 && ctx.Assign() != null) {
            Expression left = visitSingleExpression(ctx.singleExpression(0));
            expression.setLeft(left);
            Expression right = visitSingleExpression(ctx.singleExpression(1));
            expression.setRight(right);
            return  expression ;
        }
        else if (ctx.singleExpression().size() == 2 && ctx.Colon() != null) {
            Expression left = visitSingleExpression(ctx.singleExpression(0));
            expression.setLeft(left);
            Expression right = visitSingleExpression(ctx.singleExpression(1));
            expression.setRight(right);
            return  expression ;
        }
        return expression;
    }
    @Override

    public LiteralExpression visitLiteral(AngularParser.LiteralContext ctx) {
        LiteralExpression literalExpression = new LiteralExpression();
        if (ctx.BooleanLiteral() != null) {
            literalExpression.setBooleanLiteral(Boolean.parseBoolean(ctx.BooleanLiteral().getText()));}
        else if (ctx.DecimalLiteral() != null) {
            literalExpression.setDecimalLiteral(Double.parseDouble(ctx.DecimalLiteral().getText()));}
        else if (ctx.StringLiteral() != null) {
            literalExpression.setStringLiteral(ctx.StringLiteral().getText());}

        else {
            literalExpression.setNullLiteral(null);}

        return literalExpression;
    }
    @Override
    public ObjectLiteral visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral();
        for (int i = 0; i < ctx.propertyAssignment().size(); i++) {
            if (ctx.propertyAssignment(i) != null) {
                objectLiteral.getProperties().add(visitPropertyAssignment(ctx.propertyAssignment(i)));
            }
        }
        return objectLiteral;

    }
    @Override
    public PropertyAssignment visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx) {
        PropertyAssignment propertyAssignment = new PropertyAssignment();
        if (ctx.singleExpression(0)!= null) {
            Expression key = visitSingleExpression(ctx.singleExpression(0));
            propertyAssignment.setKey(key);
        }
        if (ctx.singleExpression(1)!= null) {
            Expression value = visitSingleExpression(ctx.singleExpression(1));
            propertyAssignment.setValue(value);
        }
        return propertyAssignment;
    }

    @Override
    public ArrayLiteral visitArrayLiteral(AngularParser.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral = new ArrayLiteral();
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                arrayLiteral.getElements().add(visitSingleExpression(ctx.singleExpression(i)));

            }}
        return arrayLiteral;
    }
    @Override
    public FunctionDeclaration visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        if(ctx.Export()!=null)
        {
            functionDeclaration.setFunctionExport(ctx.Export().getText());
        }

        if(ctx.Identifier()!=null)
        {
            functionDeclaration.setFunctionName(ctx.Identifier().getText());

        }
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                functionDeclaration.getParameters().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }

        for (int i = 0; i < ctx.statment().size(); i++) {
            if (ctx.statment(i) != null) {
                functionDeclaration.getBody().add(visitStatment(ctx.statment(i)));
            }
        }
        if(ctx.exportStatement()!=null)
        {
            functionDeclaration.setEx(visitExportstatment(ctx.exportStatement()));
        }
        return functionDeclaration;

    }

    @Override
    public VariableStatement visitVariableStatement(AngularParser.VariableStatementContext ctx) {

        VariableStatement variableStatement = new VariableStatement();
        for (int i = 0; i < ctx.variableDeclaration().size(); i++) {
            if (ctx.variableDeclaration(i) != null) {
                variableStatement.getVariableDeclarations().add(visitVariableDeclaration(ctx.variableDeclaration(i)));
            }
        }
        return variableStatement;

    }
    @Override
    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        if (ctx.assignable() != null) {
            variableDeclaration.setAssignable(visitAssignable(ctx.assignable()));
        }
        if (ctx.singleExpression() != null) {
            variableDeclaration.setExp(visitSingleExpression(ctx.singleExpression()));
        }
        return variableDeclaration;
    }
    @Override
    public Assignable visitAssignable(AngularParser.AssignableContext ctx) {
        Assignable assignable = new Assignable();


        if (ctx.arrayLiteral() != null) {

            assignable.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));

        } else if (ctx.Identifier() != null) {
            assignable.setName(ctx.Identifier().getText());


        }

        return assignable;
    }
    @Override
    public ExpressionStatement visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        ExpressionStatement expressionStatement= new ExpressionStatement();
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {
                expressionStatement.getExpressions().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        return expressionStatement;

    }
    @Override
    public Export visitExportstatment(AngularParser.ExportStatementContext ctx) {
        Export export = new Export();
        if (ctx.Identifier() != null) {
            export.setIdentifier(ctx.Identifier().getText());
        }
        return export;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration=new ClassDeclaration();
if(ctx.Identifier()!=null) {
    classDeclaration.setClassName(ctx.Identifier().getText());
}
   if(ctx.classBody()!=null){
       classDeclaration.setClassBody(visitClassBody(ctx.classBody()));
   }

        return classDeclaration;
    }

    @Override
    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBody classBody=new ClassBody();
        for (int i = 0; i < ctx.singleExpression().size(); i++) {
            if (ctx.singleExpression(i) != null) {

                classBody.getExpressions().add(visitSingleExpression(ctx.singleExpression(i)));
            }
        }
        for (int i = 0; i < ctx.statment().size(); i++) {
            if (ctx.statment(i) != null) {

                classBody.getStatments().add(visitStatment(ctx.statment(i)));
            }
        }
        return classBody;
    }


}