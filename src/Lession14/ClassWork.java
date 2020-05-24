package Lession14;

import org.w3c.dom.ls.LSOutput;

//Recursion:
public class ClassWork {

    public static void main(String[] args) {
        recursion(0);
        int fibo = getFibo(8);
        System.out.println(fibo);
        printNumber(5);


        //String

        String strPool1 = "TT";////POOL STROKE
        String strPool2 = "TT";

        //SSILKA           //OBJEKT
        String strHeap1 = new String("TT");    ////novii objekt v heap
        String strHeap2 = new String("TT");
        System.out.println(strPool1 == strPool2);
        System.out.println(strHeap1 == strHeap2);
        System.out.println(strHeap1.equals(strHeap2));

        System.out.println(strHeap1 + "Hello");
        System.out.println(strHeap1);

        String strHeapMutated = strHeap1 + "hello";
        System.out.println(strHeapMutated.startsWith("T"));

        //concat(): объединяет строки
        //valueOf(): преобразует объект в строковый вид
        //join(): соединяет строки с учетом разделителя
        //сompare(): сравнивает две строки
        //charAt(): возвращает символ строки по индексу
        //getChars(): возвращает группу символов
        //equals(): сравнивает строки с учетом регистра
        //equalsIgnoreCase(): сравнивает строки без учета регистра
        //regionMatches(): сравнивает подстроки в строках
        //indexOf(): находит индекс первого вхождения подстроки в строку
        //lastIndexOf(): находит индекс последнего вхождения подстроки в строку
        //startsWith(): определяет, начинается ли строка с подстроки
        //endsWith(): определяет, заканчивается ли строка на определенную подстроку
        //replace(): заменяет в строке одну подстроку на другую
        //trim(): удаляет начальные и конечные пробелы
        //substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
        //toLowerCase(): переводит все символы строки в нижний регистр
        //toUpperCase(): переводит все символы строки в верхний регистр

        String str = "we have a sentence sentence, find quantity of all Worlds that start from letter P";
        printUnique(str);
        System.out.println(getCountOfWorldsStartsFrom("W", "o"));

    }

    //iwwem slova nacinajuwiesja na Bukvu
    public static int getCountOfWorldsStartsFrom(String sentence, String startLetter) {
        int cnt = 0;
        String[] worlds = sentence.split("");
        for (int i = 0; i < worlds.length; i++) {
            String mut = worlds[i].toLowerCase();
            if (mut.startsWith(startLetter)) {
                cnt++;
            }
        }
        return cnt;
    }

    ///iwem unikalnie slova
    public static void printUnique(String sentence) {
        String replaced = sentence.replace(".", " ");
        replaced = replaced.replace(",", " ");
        replaced = replaced.replace(":", " ");
        replaced = replaced.replace(";", " ");
        String[] words = replaced.split(" ");
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            boolean unique = true;
            for (int j = i + 1; j < words.length; j++) {
                if (currentWord.equalsIgnoreCase(words[j])) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(words[i]);
            }
        }

    }


    //                    n-2       n-1        n
    // 1 2      3          4       5      6...
    // 0 1 1 2 3 5 ....

    //0123  n


    public static int getFibo(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return getFibo(n - 2) + getFibo(n - 1);
    }


    public static void recursion(int i) {
        System.out.println("i=" + i + "Basement");
        if (i == 5000) {
            return;
        }
        System.out.println("i=" + i + ",I am going dipper.....");
        recursion(++i);
    }


    public static void printNumber(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        int n1 = n - 1;
        printNumber(n1);
        System.out.println(n);
    }


    //String
    String strPool1 = "TT";
    String strPool2 = "TT";
    String strHeap1 = new String("TT");
    String strHeap2 = new String("TT");


}
