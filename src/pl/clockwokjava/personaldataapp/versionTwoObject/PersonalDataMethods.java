package pl.clockwokjava.personaldataapp.versionTwoObject;

import pl.clockwokjava.personaldataapp.Gender;
import pl.clockwokjava.personaldataapp.Person;

public class PersonalDataMethods {

    public static void main(String[] args) {

        Person pawel = new Person("Paweł", 35, true, Gender.MALE);

        String info = pawel.showPersonalData();
        System.out.println(info);


        Person kinga = new Person("Kinga", 38, true, Gender.FEMALE);
        String otherInfo = kinga.showPersonalData();
        System.out.println(otherInfo);


        Person tomek = new Person("Tomek", 20, false, Gender.MALE);
        String anotherInfo = tomek.showPersonalData();
        System.out.println(anotherInfo);

    }

}