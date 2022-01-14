package pl.clockwokjava.inheritance_ex;

public class App {

    public static void main(String[] args) {

        Figure rec = new Rectangle(4,3);
        Figure sqr = new Square(3);

        System.out.println(rec.calculateArea());
        System.out.println(sqr.calculateArea());

    }
}
