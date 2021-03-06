package data.Shapes;

import data.Interfaces.Shape;

public class SimpleTriangle implements Shape {

    private int a;
    private int b;
    private int c;

    public SimpleTriangle(int a, int b, int c) {
        sidesCheck(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    private void sidesCheck(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Invalid sides combination!");
        }

        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab < c || bc < a || ac < b) {
            throw new IllegalArgumentException("Invalid sides combination!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }


    ////PLOWAD
    public double getArea() {
        //   System.out.println("hello SimpleTriangle area");
        return (a * b) / 2;
    }


    //ZDES BIL TRIANGLE PERIMETR
    public double getPerimetr() {
        //   System.out.println("hello Simple Triangle");
        return a + b + c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        sidesCheck(a, this.b, this.c);
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


    @Override
    public void methFromParrent() {
        System.out.println("Triangle");
    }

    @Override
    public String toString() {
        return "SimpleTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
