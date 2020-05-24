package Practice;

import java.util.StringTokenizer;

public class Fori {
    public static void main(String[] args) {
        String str1 = "mama mila ramu";
        System.out.println(wordsFromText(str1, "m"));

    }


    ///SLOVO NACINAETSA NA BUKVU
    public static int wordsFromText(String sentence, String startLetter) {
        int value = 0;
        String[] words = sentence.split(" ");///????
        for (int i = 0; i < words.length; i++) {
            String cureentWord = words[i];
            if (cureentWord.startsWith(startLetter)) {  ////slovo nacinaetsa =>>StartsWith  ///cointaints ==>Soderzit
                value++;
            }
        }
        return value;
    }


}
