package pl.clockwokjava.inheritance;

public class App {

    public static void main(String[] args) {

        Duck d = new Duck();

        showMeHowYouSwim(d);
        showMeHowYouEat(d);

        Swan s = new Swan();
        showMeHowYouSwim(s);
        showMeHowYouEat(s);

            Flying o = new Owl();

        Horse h = new Horse();
        showMeHowYouEat(h);
    }

    public static void showMeHowYouSwim(Swimming d) {
        d.swim();
    }

    public static void showMeHowYouEat(Eating a) {
        a.eat();
    }

}
