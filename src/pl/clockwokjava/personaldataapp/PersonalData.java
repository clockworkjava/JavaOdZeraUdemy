package pl.clockwokjava.personaldataapp;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class PersonalData {

        public static void main(String[] args) {

            List<Person> persons = new ArrayList<>();

            Person pawel = new Person("Paweł", 35, true, Gender.MALE);
            Person kinga = new Person("Kinga", 38, true, Gender.FEMALE);
            Person tomek = new Person("Tomek", 20, false, Gender.MALE);
            Person drugiTomek =  new Person("Tomek", 20, false, Gender.MALE);

            persons.add(pawel);
            persons.add(kinga);
            persons.add(tomek);
            persons.add(drugiTomek);

            List<String> txt = new ArrayList<>();

            for(Person p : persons) {
                txt.add(p.showPersonalData());
            }

            try {
//                Files.write(Path.of(Paths.get("").toAbsolutePath().toString(),"data.txt"), txt, Charset.defaultCharset());
                System.out.println("ODCZYT Z PLIKU");
                List<String> lines = Files.readAllLines(Path.of(Paths.get("").toAbsolutePath().toString(),"data.txt"));
                for(String line : lines) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }