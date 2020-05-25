package Practice;

import exception.MyChException1;
import exception.MyCheckedExceptions;

public class StringBuilderBuffer {

    public static class ClassWork {
        public static void main(String[] args) {
            String str = "Mello";
            String strR = str.replace("M", "H");
            System.out.println(strR);

            System.out.println(strR);
            for (int i = 0; i < 10; i++) {
                str += "T";

            }
            System.out.println(str);
            StringBuilder stringBuilder = new StringBuilder("Hello");
            for (int i = 0; i < 10; i++) {
                stringBuilder.append("T");
                stringBuilder.reverse();
            }
            System.out.println(stringBuilder.toString());


            //syncronized methods!!!
            StringBuffer stringBuffer = new StringBuffer("Hello");


        }

    }
}
