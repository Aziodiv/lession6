package utils;

import data.Shape;

public class MyUtils {
    private MyUtils() {

    }

    public static double getAverage(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            //sum = sum + array[i];
            sum += array[i];
        }
        return sum / array.length;
    }
    public static void printForward(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printReverse(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static int getRandomFromRange(int left, int right) {
        return (int) (Math.random() * right - left) + left;
    }


    //Naimensii perimetr figuri v iz massiva

    public static void findMinPerimetr(Shape[]shapes){
        Shape minPerimetr = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            Shape current = shapes[i];
            if(current.getPerimetr()<minPerimetr.getPerimetr()){
                minPerimetr=current;
            }
        }
        System.out.println("min Perimetr: "+minPerimetr.getPerimetr());
    }

   //Naibolsaja  plowad  figuri

    public static  void findmaxArea(Shape[]shapes){
        Shape maxArea = shapes[0];
        for (int i = 0; i <shapes.length ; i++) {
            Shape current = shapes[i];
            if(current.getArea()>maxArea.getArea());
            maxArea=current;
        }
        System.out.println("max Area: "+ maxArea.getArea());
    }

    //Perimetr treugolnika
    public static double getPerimetrTriangle(double a, double b, double c)
    {//   System.out.println("hello Simple Triangle");
        return a + b + c;
    }

    //Plowad treugolnika
    public static double getAreaTriagle(double a, double b){
        //   System.out.println("hello SimpleTriangle area");
        return (a*b)/2;
    }
}



