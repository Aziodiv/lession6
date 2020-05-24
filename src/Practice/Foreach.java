package Practice;

public class Foreach {
    public static void main(String[] args) {
        String str1 = "privet";
        String str2 = ",kak ";
        String str3 = "dela ?";
        String str4 = "eto proverka, vsjo ok ";
        String[] strings = {str1,str2,str3};

        for (String string : strings) {
            System.out.print(string);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < strings.length ; i++) {
            System.out.println(strings[i]);
        }

    }


}
