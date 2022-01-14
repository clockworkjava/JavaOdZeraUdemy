package pl.clockwokjava.personaldataapp;

import java.util.Objects;

public class Person {

      private String name;
      private int age;
      private boolean married;
      private Gender gender;

      public Person(String name, int age, boolean married, Gender gender) {
            this.name = name;
            this.age = age;
            this.married = married;
            this.gender = gender;
      }

      public String showPersonalData() {
            String result = getDivider();
            result = result + "Name: " + this.name + "\n";
            result = result + "Age: " + this.age + "\n";
            result = result + "Married: " + this.married + "\n";
            result = result + "Gender: " + this.gender + "\n";
            return result;
      }

      private String getDivider() {
            return "-------------------------------------\n";
      }

      public String getName() {
            return this.name;
      }

      public void setName(String newName) {
            this.name = newName;
      }

      @Override
      public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", married=" + married +
                    ", gender=" + gender +
                    '}';
      }

      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && married == person.married && Objects.equals(name, person.name) && gender == person.gender;
      }

      @Override
      public int hashCode() {
            return Objects.hash(name, age, married, gender);
      }
}
