package Lession16;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {

//1. Write a Java program to create a new array list,
// add some colors (string) and print out the collection.
        System.out.println("1------------");
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");
        System.out.println(colors);

//2. Write a Java program to iterate through all elements in a array list.
        System.out.println("2-----------");
        for (int i = 0; i < colors.size(); i++) {
            String current = colors.get(i);
            System.out.println(current);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("3-----------");
//3. Write a Java program to insert an
// element into the array list at the first position.
        colors.add(0, "RED");
        System.out.println(colors);


        System.out.println("4-----------");
//4. Write a Java program to retrieve
// an element (at a specified index) from a given array list.
        int index = colors.indexOf("RED");
        System.out.println(+index);

        String element = colors.get(1);
        System.out.println(element);
        System.out.println("5------------------");

//5. Write a Java program to update specific array element by given element.
        System.out.println(colors);
        colors.set(2, "Blue");
        System.out.println(colors);
        System.out.println("6------------------");

//6. Write a Java program to remove the third element from a array list.
        colors.remove(3);
        System.out.println(colors);

        System.out.println("7------------------");
//7. Write a Java program to search an element in a array list
        if (colors.contains("Green")) {
            int current = colors.indexOf(1);

            System.out.println("COLOR - ok" + current);
        } else {
            System.out.println("COLOR - no");
        }
        System.out.println("8------------------");
//8.Write a Java program to sort a given array list
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors);

        System.out.println("9------------------");

//9. Write a Java program to copy one array list into another.

        List<String> colors2 = new ArrayList<>();
        colors2.add("MAGENTA");
        colors2.add("BLACK");
        System.out.println(colors2);
        Collections.copy(colors, colors2);
        System.out.println(colors);

        System.out.println("10------------------");
//10. Write a Java program to shuffle elements in a array list.
        Collections.shuffle(colors);
        System.out.println(colors);

        System.out.println("11------------------");
//11. Write a Java program to reverse elements in a array list.
        Collections.reverse(colors);
        System.out.println(colors);

        System.out.println("12------------------");
//12. Write a Java program to extract a portion of a array list
        List<String> sublist = colors.subList(0, 2);
        System.out.println(sublist);

        System.out.println("13------------------");
//13.  Write a Java program to compare two array lists.
        ArrayList<String> colorCompare = new ArrayList<>();
        colors.add("BLACK");
        colors.add("YELLOW");
        colors.add("MAGENTA");
        System.out.println(colors);
        colors2.add("BLACK");
        colors2.add("WHITE");
        colors2.add("MAGENTA");
        System.out.println(colors2);

        for (String color : colors)
            colorCompare.add(colors2.contains(colors) ? "Yes" : "No");
        System.out.println(colorCompare);

        System.out.println("14------------------");
//14. Write a Java program of swap two elements in an array list.
        System.out.println(colors);
        Collections.swap(colors, 0, 5);
        System.out.println(colors);
        //Swapping 1st(index 0) element with the 3rd(index 2) element

        // Collections.swap(colors, 0, 2);
        // System.out.println("Array list after swap:");
        //   for(String b: colors){
        //     System.out.println(b);
        // }
        System.out.println("15------------------");
//15. Write a Java program to join two array lists.
        ArrayList<String> join = new ArrayList<String>();
        join.addAll(colors);
        join.addAll(colors2);
        System.out.println("colors+colors2 join:" + join);

//16. Write a Java program to clone an array list to another array list.

        System.out.println("16------------------");
        ArrayList<String> newArray1 = new ArrayList<>();
        newArray1.add("YELLOW");
        newArray1.add("BLACK");
        newArray1.add("RED");

        ArrayList<String> newArray = (ArrayList<String>) newArray1.clone();
        System.out.println(newArray1);


        System.out.println("17------------------");
//17. Write a Java program to empty an array list.
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(emptyList);

        colors.removeAll(colors);
        System.out.println(colors);

//18. Write a Java program to test an array list is empty or not
        System.out.println("Colors: " + colors.isEmpty());
        System.out.println("Colors2: " + colors2.isEmpty());

    }
}
