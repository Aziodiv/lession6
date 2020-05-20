package Lession13;

import Lesson12.Pyramid;
import Lesson12.Sphere;
import data.Auto;
import data.Director;
import data.Employee;
import data.Shapes.SimpleCircle;
import data.Shapes.SimpleTriangle;
import enums.Color;
import sun.java2d.pipe.SpanShapeRenderer;

import java.sql.SQLOutput;

public class ClassWork {

    public static void main(String[] args) {
        String str1=new String("hello");
        String str2=new String("hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        Sphere sphere1= new Sphere(6);
        Sphere sphere2= new Sphere(6);
        Sphere sphere3= new Sphere(2);
        SimpleCircle simpleCircle=new SimpleCircle(9);

        System.out.println(sphere1.equals(sphere1));
        System.out.println(sphere1.equals(simpleCircle));
        System.out.println(sphere1.equals(sphere2));
        System.out.println(sphere1.equals(sphere3));


        System.out.println("sphere1=sphere2 "+ (sphere1==sphere2));
        System.out.println("sphere1.equals(sphere2)"+sphere1.equals(sphere2));


        Employee empl1=new Employee(35_000,new String("alexei"));
        Employee empl2=new Employee(35_000,new String("Ivan"));
        System.out.println(empl1.equals(empl2));
        System.out.println(empl1.equals(sphere1));

        Pyramid pir1 = new Pyramid(10,20,20);
        Pyramid pir2 = new Pyramid(10,20,30);
        System.out.println(pir1.equals(pir2));

        Auto auto1 = new Auto(Color.RED,2000,10_000);
        Auto auto2 = new Auto(Color.RED,2000,20_000);
        System.out.println(auto1.equals(auto2));
        Director dir1= new Director("Jorik","Dubov","KK");

        System.out.println(sphere1);
        System.out.println(empl1);
        System.out.println(dir1);
        System.out.println(auto1);

        System.out.println(sphere1);
        System.out.println(sphere1.hashCode());
        System.out.println(sphere2.hashCode());
        System.out.println(sphere3.hashCode());
    }

    SimpleTriangle triangle1 = new SimpleTriangle(5,6,7);
    SimpleTriangle triangle2 = new SimpleTriangle(5,6,7);

}
