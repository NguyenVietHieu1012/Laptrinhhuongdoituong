package Week8;

public class Square extends Expression{
    Expression expression;
    public Square (Expression expression){
        this.expression = expression;
    }
    @Override
    public String toString() {
        return "(" + expression.toString() + ")^2";
    }

    @Override
    public double evaluate() {

        return expression.evaluate()* expression.evaluate();
    }
}
