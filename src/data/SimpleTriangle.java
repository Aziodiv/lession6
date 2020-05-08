package data;

public class SimpleTriangle {

    private int a;
    private int b;
    private int c;



    public SimpleTriangle(int a, int b, int c) {
        if(a<=0||b<=0||c<=0){
            throw new IllegalArgumentException("invalid SIDES KOMB");
        }
        int ab= a+b;
        int bc = b+c;
        int ac = a+c;
        if (ab<c||bc<a||ac<b){

            throw new IllegalArgumentException("Invalid sides combination!");
        }



        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getPerimetr() {a+b+c
    }



    public int getA() {
        return a;

    }

    public void setA(int a) {
        sidesCheck(this.a,b,c);
        this.a = a;


    }

    public int getB() {
        return b;

    }

    public void setB(int b) {
        this.b = b;

    }
    public int getC() {
        return a;

    }

    public void setC(int c) {
        this.c = c;

    }

}
