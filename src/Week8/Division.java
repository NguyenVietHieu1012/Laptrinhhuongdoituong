package Week8;

import java.lang.ArithmeticException;

public class Division extends  BinaryExpression{
    public Division(Expression left, Expression right) {
        super(left, right);
    }
    public String toString() {
        return null;
    }
    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}