package data.Shapes;

import data.Interfaces.Shape;


public class SimpleCircle implements Shape {
    private int radius;

    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    public double getPerimetr() {
     //   System.out.println("hello Simple SimpleCircle");
        return 2 * Math.PI * radius;
    }



    public double getArea(){
     //   System.out.println("hello Simple SimpleCircle Area ");
        return Math.PI * (radius * radius);

    }
    @Override
    public void methFromParrent() {
        System.out.println("Circle");
    }

    @Override
    public String toString() {
        return "SimpleCircle{" +
                "radius=" + radius +
                '}';
    }
}


