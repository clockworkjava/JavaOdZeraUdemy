package pl.clockwokjava.inheritance_ex;

public class Rectangle extends Figure {

    private int sideA;
    private int sideB;

    public Rectangle(int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }

    public int calculateArea() {
        return this.sideA * this.sideB;
    }
}
