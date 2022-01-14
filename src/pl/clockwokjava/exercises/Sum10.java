package pl.clockwokjava.exercises;

public class Sum10 {

    // zsumowac pierwsze 10 liczb calkowitych i wypisac kazdy etap sumowania na ekran,
    // w osobnej linii

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10 ; i++) {

            System.out.println(sum + "(sum) + " +  i + "(i)");

            sum = sum + i;

            System.out.println("Suma aktualna: " + sum);

            System.out.println("-----------------");
        }
    }


}
