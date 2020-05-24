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
        String str1 = "privet kak dela";
        System.out.println(LongestWord(str1));
        System.out.println(findLongestWordLength(str1));
    }


    ///For each//////
    public static int LongestWord(String sentence) {
        String[] words = sentence.split(" ");
        int length = 0;
//=>>
        for (String word : words) {
            if (length < word.length()) {
                length = word.length();
            }
        }
        return length;
    }

    ///poisk 4erez  FOR//////
    public static int findLongestWordLength(String sentence) {

        int maxLength = 0;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
            }
        }

        return maxLength;
    }

}
