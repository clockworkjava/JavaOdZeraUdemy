package pl.clockwokjava.inheritance;

public class Swan implements Flying, Eating, Swimming {

    public void swim() {
        System.out.println("Łabędź pływa");
    }

    public void fly() {
        System.out.println("Łabędź lata");
    }

    @Override
    public void eat() {

    }
}
