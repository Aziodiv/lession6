package Lesson6;

import data.Animal;
import enums.Gender;

public class ClassWork {
    public static void main(String[] args) {
//// 0 eto cat
        Animal zebra = new Animal("gop", 20, "zebra", Gender.FEMALE);
        Animal kot = new Animal("barsik", 5, "kot", Gender.MALE);
        Animal pig = new Animal("hrju", 6, "svinka", Gender.MALE);
        Animal[] zoo = {zebra, kot, pig};
        Animal oldest = getOldestAnimal(zoo);
        //System.out.println(oldest);
    }

    public static Animal getOldestAnimal(Animal[] zoo) {
        int maxAgeIndex = 0;


        for (int j = 1; j < zoo.length; j++) {
            Animal maxAgeAnimal = zoo[maxAgeIndex];//max vozrast
            Animal current = zoo[j];   //tekuwee zivotnoe
            if (current.age > maxAgeAnimal.age) {

                maxAgeIndex = j;
            }

        }
        Animal oldestAnimal = zoo[maxAgeIndex];
        System.out.println("Max name: " + oldestAnimal.name);
        System.out.println("Max age: " + oldestAnimal.age);
        return oldestAnimal;
    }
}


