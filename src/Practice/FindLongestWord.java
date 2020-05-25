package Practice;
//int countTokens() - используя текущий набор разделителей,
// определяет количество лексем, которые осталось разобрать
// и возвратить в качестве результата

//boolean hasМoreElements() - возвращает логическое значение true,
// если в символьной строке остается одна лексема или больше,
// а иначе - логиче­ское значение false

//boolean hasМoreTokens() - возвращает логическое значение true,
// если в символьной строке остается одна лексема или больше,
// а иначе - логиче­ское значение false

//Object nextElement() - возвращает следующую лексему в виде объекта типа Object

//String nextToken() - возвращает следующую лексему в виде объекта типа String

//String nextToken(String разделители) - возвращает следующую лексему в виде объекта типа Object
// и задает символьную строку разделителей в соответствии со значением параметра разделители

public class FindLongestWord {

    public static void main(String[] args) {
        String str1 = "privet kak dela u tebja, eto TESTIROVANIE";
        StartsAndEndsLetter(str1);
        System.out.println();
        System.out.println("[For] samoe korotkoe slovo: " +findLongestWordLength(str1));
        LongestWord(str1);
    }


    //For each POISK DLINNOGO SLOVA
    public static void LongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String str = " ";
        for (String word : words) {
            if (word.length() > str.length())
                str = word;
        }
        System.out.println("[For each] samoe dlinnoe slovo: "+ str);

    }


    ///poisk 4erez  FOR KOROTKOE  SLOVO//////
    public static String findLongestWordLength(String sentence) {

        String[] words = sentence.split(" ");
        String minLength = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < minLength.length()) {
                minLength = words[i];
            }
        }
        return minLength;
    }



    public static void StartsAndEndsLetter(String sentence) {
        String[] words = sentence.split(" ");
        String maxLenght = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("a")==maxLenght.startsWith("a"));

        }

    }

}


