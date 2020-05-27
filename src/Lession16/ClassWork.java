package Lession16;

import data.Employee;
import data.Interfaces.Shape;
import data.Shapes.SimpleCircle;
import data.Shapes.SimpleSquare;
import data.Shapes.SimpleTriangle;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class ClassWork {
    public static void main(String[] args) {
        SimpleTriangle triangle = new SimpleTriangle(9, 10, 3);
        Employee employee = new Employee(55000, "Ivan");

        //Kollekcija , tip , ssilka,objekt
        ArrayList<Employee> arrayList = new ArrayList();


        System.out.println("arraylist.seze()=" + arrayList.size());
        //   arrayList.add(triangle);
        arrayList.add(employee);

        for (int i = 0; i <= 2; i++) {
            arrayList.add(employee);
        }


        System.out.println("arraylist.seze()=" + arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            final Employee employee1 = arrayList.get(1);
            employee1.getSalary();
            employee1.getName();
            System.out.println(arrayList.get(i));

        }


        arrayList.clear();
        System.out.println("arraylist.seze()=" + arrayList.size());


        List<Shape> shapes = new ArrayList(10);


        shapes.add(new SimpleTriangle(9, 10, 7));
        shapes.add(new SimpleTriangle(9, 10, 8));
        shapes.add(new SimpleTriangle(9, 10, 1));
        shapes.add(new SimpleSquare(8));
        shapes.add(new SimpleSquare(3));
        shapes.add(new SimpleSquare(2));
        shapes.add(new SimpleCircle(8));
        shapes.add(new SimpleCircle(2));
        shapes.add(new SimpleCircle(3));

        Shape maxPerim = getShapeWithMaxPerimetr(shapes);
        System.out.println("Max perimetr Shape: " + maxPerim);

        Shape minSquare = getShapeWithminSquare(shapes);
        System.out.println("Min Square Shape: " + minSquare);


        List<String> colors = new ArrayList<>();
        colors.add("GREEN");
        colors.add("WHITE");
        colors.add("PURPLE");
        System.out.println(colors);

        System.out.println("----------------------");
        //tip, tekusii element, kollekcija
        for (String color : colors) {
            System.out.println("color= " + color);
        }
        int i = 0;
        while (i < 10) {
            colors.add(0, "Green" + i);
            i++;
        }
        System.out.println(colors);
        System.out.println("------------------------");


        for (int j = 0; j < colors.size(); j++) {
            if (j % 2 == 0) {
                System.out.println(colors.get(j));
            }
        }

        System.out.println("---------------");


        for (int j = 0; j < colors.size(); j++) {
            String current = colors.get(j);
            if (colors.get(j).contains("R")) {
                colors.set(j, current.toLowerCase());
            }
        }
        System.out.println(colors);

        colors.remove(3);
        colors.remove(3);
        colors.remove(3);
        System.out.println(colors);
        System.out.println("---------------");


        int index = colors.indexOf("WHITE");
        System.out.println("WHITE index: " + index);


        List<String> list1 =new ArrayList<>();
        list1.add("A1");
        list1.add("B1");
        List<String>list2 = new ArrayList<>();
        list2.add("A2");
        list2.add("B2");
        list2.add("C2");

        Collections.copy(list2,list1);
        System.out.println("list1"+ list1);
        System.out.println("list2"+ list2);

        System.out.println("--------------");

        Collections.shuffle(colors);
        System.out.println(colors);


        System.out.println("--------------");

        Collections.reverse(colors);
        System.out.println(colors);


        System.out.println("------------Sets-------------");
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("B");
        System.out.println(set);

        String z = "z";
        if(set.contains(z)){

        }
        System.out.println(z);


        Set<String> treeSet=new TreeSet<>();
        Set<Employee> employees = new TreeSet<>();
        employees.add(employee);


    }

    public static Shape getShapeWithMaxPerimetr(List<Shape> shapesX) {
        Shape max = shapesX.get(0);
        for (int i = 0; i < shapesX.size(); i++) {
            Shape current = shapesX.get(i);
            if (shapesX.get(i).getPerimetr() > max.getPerimetr()) {
                max = current;

            }
        }
        return max;
    }

    public static Shape getShapeWithminSquare(List<Shape> shapesY) {
        Shape min = shapesY.get(0);
        for (int i = 0; i < shapesY.size(); i++) {
            Shape current = shapesY.get(i);
            if (shapesY.get(i).getArea() < min.getArea()) {
                min = current;
            }

        }
        return min;
    }

//Write a Java program to create a new array list, add some colors (string) and print out the collection.

    //Write a Java program to iterate through all elements in a array list.
    //Write a Java program to insert 10 element into the array list at the first position
    //Write a Java program to retrieve an element (at a specified index) from a given array list.
    //Write a Java program to update specific array element by given element
    //Write a Java program to remove the third element from a array list. Call it several times.
    //Write a Java program to search an element in a array list.
    //Write a Java program to copy one array list into another.
    //Write a Java program to shuffle elements in a array list.
    //Write a Java program to reverse elements in a array list.


}
