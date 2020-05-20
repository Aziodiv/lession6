package Lesson12;

import java.sql.SQLOutput;

public class Sphere implements Figure {

    private double radius;


    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
       return  (4/3)*Math.PI*Math.pow(radius,3);
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }



}
