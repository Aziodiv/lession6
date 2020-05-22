package data.Shapes;


import data.Interfaces.Shape;

public class SimpleSquare implements Shape {

    private int a;

    public SimpleSquare(int a) {
        this.a = a;

    }

    public double getPerimetr() {
        //   System.out.println("hello SimpleSquare ");
        return 4 * a;
    }

    public double getArea() {
        //   System.out.println("hello SimpleSqure Area");
        return a * a;
    }

    @Override
    public void methFromParrent() {
        System.out.println("Square");

    }


}
