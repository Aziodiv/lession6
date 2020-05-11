package data;

import enums.Gender;


public class Animal {

    public Animal(String name, int age, String kind, Gender gender) {

        this.name = name;
        this.age = age;
        this.kind = kind;
        this.gender = gender;
    }


    private String name;
    private String kind;
    private int age;
    private Gender gender;

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }


    public String getKind() {
        return this.kind;
    }

    //   public String  getGender(){
    //       return this.gender;
    //   }

    public void setKind(String newKind) {
        this.kind = newKind;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }


}


