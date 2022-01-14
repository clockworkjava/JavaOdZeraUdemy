package pl.clockwokjava.exercises;

public class Calculator {

    public static void main(String[] args) {

        double sumResult = sum(42, 3.4);
        System.out.println(sumResult);

        double subtractResult = subtract(42, 3.4);
        System.out.println(subtractResult);

        double multiplyResult = multiply(42, 3.4);
        System.out.println(multiplyResult);

        double divideResult = divide(42, 3.4);
        System.out.println(divideResult);


    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a-b;
    }

    public static double multiply(double a, double b) {
        return a*b;
    }

    public static double divide(double a, double b) {
        return a/b;
    }
}
