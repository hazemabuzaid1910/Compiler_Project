package AST;

import antler.AngularParser;

public class StyleContent {
    String Dot;
    String className;
    ObjectLiteral objectLiteral;

    public String getDot() {
        return Dot;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public void setDot(String dot) {
        Dot = dot;
    }

    @Override
    public String toString() {
     StringBuilder sb=new StringBuilder();
     sb.append("{class Css }").append("\n");
     if(Dot!=null){
         sb.append(Dot);
     }
        if(className!=null){
            sb.append("{class name}").append(className);
        }
        if(objectLiteral!=null){
            sb.append(objectLiteral);
        }

     return sb.toString();
    }
}
