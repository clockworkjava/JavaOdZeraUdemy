package pl.clockwokjava.exercises;

public class Even {

    public static void main(String[] args) {

        int x = 89;
        System.out.println("Liczba " + x + " jest parzysta: " + isEven(89));
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
