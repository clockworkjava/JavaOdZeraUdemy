package pl.clockwokjava.calendar;

public class Months {

    public static void main(String[] args) {
        // utworz tablice String o 12 elementow
        // jako wartosci tablicy przypisz nazwy miesiecy
        // wypisz wszystkie miesiace na ekran za pomoca petl for

        Month[] months = Month.values();

        for(Month month : months) {
            System.out.println(month);
        }



    }
}
