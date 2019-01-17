package exerciseRegEx.exercise11;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {
    String name;
    String surName;
    String email;
    int age;

    public Person(String name, String surName, String email, int age) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.age = age;
    }
}
