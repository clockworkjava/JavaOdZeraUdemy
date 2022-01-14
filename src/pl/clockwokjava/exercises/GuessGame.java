package pl.clockwokjava.exercises;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int roundLimit = 5;

        int target = random.nextInt(0, 101);

        for(int i = 0; i<roundLimit;i++) {

            System.out.println("Runda " + (i+1));
            System.out.print("Zgadnij liczbę: ");

            try {

                int guess = scanner.nextInt();

                if(guess < 0 || guess>100) {
                    throw new IllegalArgumentException("Wybrana liczba musi mieścić się w przedziale [0-100]");
                }

                if (target == guess) {
                    System.out.println("Gratuluje! Zwyciestwo!");
                    break;
                } else if (target < guess) {
                    System.out.println("Poszukiwana liczba jest mniejsza");
                } else {
                    System.out.println("Poszukiwana liczba jest wieksza");
                }
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzony tekst nie jest liczbą całkowitą. Utracono rundę.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Utracono rundę.");
            }
        }

        System.out.println("Koniec gry");
    }
}
