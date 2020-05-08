package Lesson8;

public class Person {

    private int age;
    private String firstName;

    public Person() {
    }

    public Person(int age, String firstName) {

        this.age = age;
        this.firstName = firstName;
    }

    public int getAge() {
        return this.age;
    }

    public void newAge (int newAge) {
        this.age = newAge;

    }

    public String getFirstName() {
        return this.firstName;

    }


    public void setAge(int newAge) {
        this.age = newAge;
    }
}

