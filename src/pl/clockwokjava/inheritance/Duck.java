package pl.clockwokjava.inheritance;

public class Duck implements Swimming, Flying, Eating {

    public void swim() {
        System.out.println("Kaczka pływa");
    }

    public void fly() {
        System.out.println("Kaczka lata");
    }

    @Override
    public void eat() {

    }
}
