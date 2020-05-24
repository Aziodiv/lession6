package Practice;

public class For {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = new String[10];
        strings[1] = "kak dela";
        strings[2] = "u";
        strings[3] = "tebja dela";



        for (int i = 2; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
