package Lesson7;

import data.Animal;
import enums.Gender;

public class Lession7a {
//Constants;

    public static final int DAYS_OF_A_WEEK = 6;
    public static final Animal LION =new Animal("lion",12,"lev", Gender.FEMALE);



    public static void main(String[] args) {
        Animal lion = new Animal("bob",20,"lev",Gender.MALE);



        System.out.println(DAYS_OF_A_WEEK);
        int weeks = 300 / DAYS_OF_A_WEEK;
    }

    public void myMeth() {
        System.out.println("hhh");
    }
}

