package pl.clockwokjava.exercises;

public class FooBar {


    public static void main(String[] args) {
        int x = 15;

        System.out.println(foobar(x));
    }

    public static String foobar(int x) {

        if((x % 5 == 0) && (x % 3 == 0) ) {
            return "foobar";
        } else if (x % 3 == 0) {
            return "foo";
        } else if (x % 5 == 0) {
            return "bar";
        }

        return "";

    }



}
