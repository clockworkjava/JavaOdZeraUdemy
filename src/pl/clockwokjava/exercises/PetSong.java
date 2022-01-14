package pl.clockwokjava.exercises;

public class PetSong {

    public static void main(String[] args) {
        System.out.println(singASong("Tomek","psa"));
    }

    public static String singASong(String person, String pet) {
        return person + " ma " + pet;
    }
}

