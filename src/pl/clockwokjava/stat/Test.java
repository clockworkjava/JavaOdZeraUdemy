package pl.clockwokjava.stat;

public class Test {

    private int a;
    static int count = 0;

    public Test(){
        increaseCount();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void increaseCount() {
        count++;
    }
}
