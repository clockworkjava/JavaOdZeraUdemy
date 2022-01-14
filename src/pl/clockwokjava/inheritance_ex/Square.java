package pl.clockwokjava.inheritance_ex;

public class Square extends Figure{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int calculateArea() {
        return this.side*this.side;
    }

}
