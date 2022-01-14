package pl.clockwokjava.exercises;

public class ToThePower {

    public static void main(String[] args) {

            System.out.println("n^2     n^3     n^4");
        for(int i = 1; i<6; i++) {
            int second = i*i;
            int third = second*i;
            int fourth = third*i;
            System.out.println(second+"     "+third+"     "+fourth);
        }

    }
}
