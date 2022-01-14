package pl.clockwokjava.personaldataapp.versionTwoObject;

import pl.clockwokjava.personaldataapp.Gender;
import pl.clockwokjava.personaldataapp.Person;

public class PersonalDataObjectAsParam {

    public static void main(String[] args) {

        Person pawel = new Person("Paweł", 35, true, Gender.MALE);

        String info = showPersonalData(pawel);
        System.out.println(info);

        Person kinga = new Person("Kinga", 38, true, Gender.FEMALE);
        String otherInfo = showPersonalData(kinga);
        System.out.println(otherInfo);

        Person tomek = new Person("Tomek", 20, false, Gender.MALE);
        String anotherInfo = showPersonalData(tomek);
        System.out.println(anotherInfo);
    }

    public static String showPersonalData(Person person) {

        String result = "-------------------------------------\n";
//        result = result + "Name: " + person.name + "\n";
//        result = result + "Age: " + person.age + "\n";
//        result = result + "Married: " + person.married + "\n";
//        result = result + "Gender: " + person.gender + "\n";

        return result;
    }
}