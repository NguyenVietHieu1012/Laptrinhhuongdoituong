package Week8;
public class Numeral extends Expression {
    private int value;
    public Numeral(int value){
        this.value = value;
    }
    public Numeral(){}

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
