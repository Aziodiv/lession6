package data;

import enums.Gender;

public class Animal {

    public Animal(String name, int age, String kind, Gender gender) {

        this.name = name;
        this.age = age;
        this.kind = kind;
        this.gender = gender;
    }

    private final String name;
    private final Gender gender;
    private String kind;
    private int age;

}
