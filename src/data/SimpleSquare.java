package data;

public class SimpleSquare extends Shape {

    private int a;

    public SimpleSquare(int a){
        this.a=a;

    }
    public double getPerimetr(){
        System.out.println("hello Simple Square");
        return 4*a;
    }
}
