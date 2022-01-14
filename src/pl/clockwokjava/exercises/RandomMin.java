package pl.clockwokjava.exercises;

import java.util.Random;

public class RandomMin {

    public static void main(String[] args) {
        // utworz tablice 5 elementowa int
        // wypelnij ja losowymi elementami
        // wypisz je na ekran
        // wybierz najmniejsza wartosc z tablicy, przypisz do zmiennej min i wypisz na ekran

        int[] randomArray = new int[7];
        Random r = new Random();

        for(int i = 0; i < randomArray.length;i++) {
            randomArray[i] = r.nextInt();
            System.out.print(" " + randomArray[i] + " ");
        }

        System.out.println("");

        int min = randomArray[0];

        for(int i = 0; i < randomArray.length; i++) {
            min = Math.min(min, randomArray[i]);
        }

        System.out.println("Najmniejszy element: " + min);

    }
}
