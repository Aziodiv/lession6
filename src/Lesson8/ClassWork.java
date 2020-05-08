package Lesson8;

import data.Car;
import data.SimpleTriangle;
import data.Student;
import enums.Month;
import sun.java2d.pipe.SpanShapeRenderer;

public class ClassWork {

    public static void main(String[] args) {


    Month month1 = Month.JANUARY;
    Student student = new Student("Robert");

    Car car = new Car();

    Person person = new Person(40, "Robert");

        SimpleTriangle simpleTriangle = new SimpleTriangle(10,10,6);
        System.out.println("perimetr=" + simpleTriangle.get);


}

}
