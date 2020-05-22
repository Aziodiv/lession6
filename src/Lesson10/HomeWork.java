package Lesson10;


import data.Interfaces.Shape;
import data.Shapes.SimpleCircle;
import data.Shapes.SimpleSquare;
import data.Shapes.SimpleTriangle;

import static utils.MyUtils.*;

public class HomeWork {

    public static void main(String[] args) {
        SimpleTriangle triangle = new SimpleTriangle(10, 20, 30);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimetr: " + triangle.getPerimetr());

        SimpleSquare square = new SimpleSquare(20);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimetr: " + triangle.getPerimetr());

        Shape circle = new SimpleCircle(50);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimetr: " + circle.getPerimetr());

        Shape[] shapes2 = {triangle, square, circle};
        System.out.println("-=MAX AREA=-");
        findmaxArea(shapes2);
        System.out.println("-=MIN PERIMETR=-");
        findMinPerimetr(shapes2);
        System.out.println();


        //Prosto perimetr 1  treugolnika
        System.out.println("Perimetr otdelnogo treugolnika: " + getPerimetrTriangle(10, 50, 30));

        //Prosto plowad 1 treugolnika
        System.out.println("Plowad otdelnogo treugolnika: " + getAreaTriagle(10, 20));


    }

}
