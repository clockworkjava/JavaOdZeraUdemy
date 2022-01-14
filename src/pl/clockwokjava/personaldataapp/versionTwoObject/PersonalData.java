package pl.clockwokjava.personaldataapp.versionTwoObject;

import pl.clockwokjava.personaldataapp.Gender;
import pl.clockwokjava.personaldataapp.Person;

public class PersonalData {

    public static void main(String[] args) {

        Person pawel = new Person("Paweł", 35, true, Gender.MALE);

       // String info = showPersonalData(pawel.name, pawel.age, pawel.married, pawel.gender);
        System.out.println("");

        String nameP2 = "Kinga";
        int ageP2 = 38;
        boolean marriedP2 = true;
        Gender genderP2 = Gender.FEMALE;

        String otherInfo = showPersonalData(nameP2, ageP2, marriedP2, genderP2);
        System.out.println(otherInfo);

        String nameP3 = "Tomek";
        int ageP3 = 20;
        boolean marriedP3 = false;
        Gender genderP3 = Gender.MALE;

        String anotherInfo = showPersonalData(nameP3, ageP3, marriedP3, genderP3);
        System.out.println(anotherInfo);
    }

    public static String showPersonalData(String name, int age, boolean married, Gender gender) {

        String result = "-------------------------------------\n";
        result = result + "Name: " + name + "\n";
        result = result + "Age: " + age + "\n";
        result = result + "Married: " + married + "\n";
        result = result + "Gender: " + gender + "\n";

        return result;
    }
}