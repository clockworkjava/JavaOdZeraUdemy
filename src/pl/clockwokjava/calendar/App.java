package pl.clockwokjava.calendar;

public class App {

    public static void main(String[] args) {

        System.out.println(getMonth(-32));
        System.out.println(getMonth(32));
        System.out.println(getMonth(5));
        System.out.println(getMonth(12));

    }

    public static Month getMonth(int a) {

        if(a<1 || a>12) {
            return Month.UNKNOWN;
        }

        switch (a) {
            case 1: return Month.STYCZEN;
            case 2: return Month.LUTY;
            case 3: return Month.MARZEC;
            case 4: return Month.KWIECIEN;
            case 5: return Month.MAJ;
            case 6: return Month.CZERWIEC;
            case 7: return Month.LIPIEC;
            case 8: return Month.SIERPIEN;
            case 9: return Month.WRZESIEN;
            case 10: return Month.PAZDZIERNIK;
            case 11: return Month.LISTOPAD;
            case 12: return Month.GRUDZIEN;
            default: return Month.UNKNOWN;
        }

    }
}
