package Lesson8;

import data.Car;
import data.Person;
import data.SimpleTriangle;
import data.Student;
import enums.Month;
import sun.nio.cs.ext.MacRoman;

public class ClassWork {


    public static void main(String[] args) {


        Month month1 = Month.JANUARY;
        Student student = new Student("Robert");

        Car car = new Car();

        Person person = new Person(40, "Robert");
        System.out.println("Age" + person.getAge());
        person.setAge(23);
        System.out.println("Age " + person.getAge() + " " + person.getFirstName());

        System.out.println("FirstName " + person.getFirstName());
        person.setFirstName("Jorik");
        System.out.println("FirstName " + person.getFirstName());


        SimpleTriangle simpleTriangle = new SimpleTriangle(5, 10, 6);
        System.out.println("perimetr=" + simpleTriangle.getPerimetr());
//vizov metodov PRACTICE


        Persons person4= new Persons();
        person4.setName("ZORIK ");
        person4.getName();
        person4.setAge(40);
        person4.getAge();
        System.out.println(person4.getName()+person4.getAge());
    }

}