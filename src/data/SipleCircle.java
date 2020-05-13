package data;

public class SipleCircle extends Shape {
    private int radius;

    public SipleCircle(int radius) {
        this.radius = radius;
    }

    public double getPerimetr() {
        System.out.println("hello Simple SimpleCircle");
        return 2 * Math.PI * radius;
    }

}
