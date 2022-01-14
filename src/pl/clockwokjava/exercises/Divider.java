package pl.clockwokjava.exercises;

import java.util.Random;

public class Divider {

    public static void main(String[] args) {

        // Wylosuj dwie liczby calkowite
        // a z zakresu 2 - 100
        // b z zakresu 0 - 100
        // Niech program losuje a i b tak dlugo, az wyszuka taka pare
        // gdzie a jest dzielnikiem b
        // tzn. b % a == 0
        // Na koniec programu, po wylosowaniu liczb spelniajacych warunek, wypisz je na ekran

        Random r = new Random();

        int a = r.nextInt(2,101);
        int b = r.nextInt(0,101);

        while(b % a != 0) {
            a = r.nextInt(2,101);
            b = r.nextInt(0,101);
        }

        System.out.println(" A = " + a + " jest dzielnikiem B = " + b);

    }
}
