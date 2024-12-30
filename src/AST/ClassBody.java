package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassBody {
    List<Statment> statments =new ArrayList<Statment>();
    List<Expression> expressions =new ArrayList<Expression>();

    public List<Statment> getStatments() {
        return statments;
    }

    public void setStatments(List<Statment> statments) {
        this.statments = statments;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" body Class = { ");
        if (statments != null) {
            for (Statment b : statments) {
                if (b != null) {
                    sb.append(b).append(",");
                }
            }
        }
        if (expressions != null) {
            for (Expression b : expressions) {
                if (b != null) {
                    sb.append(expressions).append(",");
                }
            }
        }
        sb.append(" } ").append('\n');
        return sb.toString();
    }
}
