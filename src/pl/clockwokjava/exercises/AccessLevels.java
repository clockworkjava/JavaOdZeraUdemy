package pl.clockwokjava.exercises;

import pl.clockwokjava.personaldataapp.Gender;
import pl.clockwokjava.personaldataapp.Person;

public class AccessLevels {

    public void z() {
        Person p = new Person("xx", 32, false, Gender.MALE);
        System.out.println(p.getName());
        p.setName("yyy");
    }
}
