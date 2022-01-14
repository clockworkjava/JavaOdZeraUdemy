package pl.clockwokjava.exercises;

import java.util.Scanner;

public class SumIt {

    // zsumowac liczby calkowite podane przez uzytkownika
    // zapytajmy uzytkownika o ilosc liczb i stworzmy tablice
    // zapytajmy n-razy o konkretna liczbe
    // sumujmy wartosci w tablicy
    // wypiszmy wynik

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb, ktore chcesz zsumowac: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i = 0;i < numbers.length;i++) {
            System.out.print("Podaj liczbe: ");
            int tmp = scanner.nextInt();
            numbers[i] = tmp;
        }

        int sum = 0;

        for(int i : numbers) {
            sum += i;
        }

        System.out.println("Wynik sumowania to: " + sum);

    }
}
