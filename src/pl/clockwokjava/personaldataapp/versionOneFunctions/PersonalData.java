package pl.clockwokjava.personaldataapp.versionOneFunctions;

import pl.clockwokjava.personaldataapp.Gender;

public class PersonalData {

    public static void main(String[] args) {

        String nameP1 = "Paweł";
        int ageP1 = 35;
        boolean marriedP1 = true;
        Gender genderP1 = Gender.MALE;

        String info = showPersonalData(nameP1, ageP1, marriedP1, genderP1);
        System.out.println(info);

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