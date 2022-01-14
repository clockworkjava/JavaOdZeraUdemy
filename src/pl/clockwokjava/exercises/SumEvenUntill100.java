package pl.clockwokjava.exercises;

public class SumEvenUntill100 {

    // Zsumuj wszystkie liczby parzyste, zaczynajac od zera
    // tak dlugo az ich suma przekroczy 100
    // wypisz na ekran ostatnia liczbe parzysta jaka zostala dodana

    public static void main(String[] args) {

        int sum = 0;
        int currentEvenNumber = 0;

        while(sum<=100) {
            currentEvenNumber += 2; // currentEvenNumber = currentEvenNumber + 2
            sum += currentEvenNumber; // sum = sum + currentEvenNumber
        }

        System.out.println("Max even: " + currentEvenNumber);
        System.out.println(sum);

    }
}
