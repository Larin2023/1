package interview;

import java.util.Arrays;
//надо найти анаграммы
//вы подаете 2 стринга и вы должны доказать это анаграмма или нет.

public class App5 {
                                                                            //2)
    public static void main(String[] args) {
        System.out.println(isAnagram("zzz3wwww", "zwzwzwzw"));
    }
                                                                             //1)
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length()!=word2.length()) {// если у двух слов разная длина они уже не анаграммы
            return false;
        }
        char[]w1=word1.toCharArray(); //теперь на надо сравнить два слова
        char[]w2=word2.toCharArray();// отсортировать по порядку и посмотреть отсортированные
        Arrays.sort(w1);
        Arrays.sort(w2);
        for (int i=0;i<w1.length;i++) {
            if (w1[i] != w2[1]) { //если w1i не равен w2i то (есть буквы разные) мы делаем:
                return false;
            }
        }
        //но если мы дошли до конца и все нормально:
        return true;
    }
}
