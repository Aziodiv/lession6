package Lesson8;


public class Persons {
    private String name;
    private int age;


    //setter
    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("PUSTOE IMJA");
        } else {
            name = username;
        }
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("error");
        } else {
            age = userAge;
        }
    }
    //getter

    public int getAge() {


        return age;

    }


    void setsNameAndAge(String username, int age) {
        name = username;
        age = age;
    }

    String nameTest() {
        name = "vova";
        return name;
    }


    int calculateYears() {
        int years = 65 - age;
        return years;
    }


    void speak() {
        System.out.println("menja zovut " + name + " mne " + age + " let");
    }

    void sayHello() {
        System.out.println("say hello");
    }

}


