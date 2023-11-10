package Week8;

public class Main {
    public static void main(String[] args) {
        Numeral a = new Numeral(10);
        Numeral b = new Numeral(-3);
        Numeral c = new Numeral(4);
        Numeral d = new Numeral(3);
        Multiplication e = new Multiplication(c,d);
        Square f = new Square(a);
        Addition e2 = new Addition(f,b);
        Addition e3 = new Addition(e2,e);
        Square e4 = new Square(e3);
        System.out.println(e4.toString()+ "=" +e4.evaluate());
        Numeral a1 = new Numeral(8);
        Numeral a2 = new Numeral(0);
        Division z1 = new Division(a1,a2);
        System.out.println(z1.evaluate());
    }
}
