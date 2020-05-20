package Lesson12;

import java.sql.SQLOutput;
import java.util.Objects;

public class Sphere implements Figure {

    private double radius;


    public Sphere(double radius) {
        this.radius = radius;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
if(object instanceof  Sphere){
    Sphere newObject = (Sphere) object;
    return this.radius == newObject.getRadius();
    }
   return false;

    }

    @Override
    public double getVolume() {
       return  (4/3)*Math.PI*Math.pow(radius,3);
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public String toString(){
        return "Shape with radius: "+ radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }


    //poslednee slovo pered cistkoi

    @Override
    protected void finalize() throws Throwable {
        System.out.println("buy buy");
    }
}
