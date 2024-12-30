package AST;

public class HtmlAttributeNode  {
     String attributeName;
     HtmlAttributeValueNode attributeValue;


    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public HtmlAttributeValueNode getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(HtmlAttributeValueNode attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("attributeName : ");
        if (attributeName != null) {
           sb.append(attributeName   );
        }

        sb.append("   attributeValue : ");
        if (attributeValue != null) {
            sb.append(attributeValue );
        }

        return sb.toString();
    }
}
