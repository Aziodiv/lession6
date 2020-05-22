package Lession13;

import data.Worker;

import static utils.MyUtils.getRandomFromRange;

public class Pet {

    private int age;
    private Name name;
    private int weight;


    public Pet() {
        this(getRandomFromRange(1,20),Name.REKS,getRandomFromRange(1,100));
        checkAge();

    }

    public Pet(int age, Name name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        checkAge();
    }




    public int getAge() {
        return age;
    }

    public Name getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }




    ///CHECK AGE
    public static int MINAGE = 1;
    public static int MAXAGE = 20;

    private void checkAge() {
        if (age < MINAGE || age > MAXAGE) {
            throw new IllegalArgumentException("invalid age, age should be from 1 to 20 ");
        }
    }

    public String toString(){
        return "Pet name: "+name+", Pet age: "+age+", Pet weight: "+weight;
    }


    public Pet getPetQuantity() {
        Pet petQuanty = pets[0];
        int index = 1;
        for (int i = 0; i < workers.length; i++) {
            Worker worker = workers[i];
        }
    }






}
