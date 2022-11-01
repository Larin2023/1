package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//найди повторяющиеся цифры in array
public class App4 {
                                                                                         //1)
    public static void main(String[] args) {
                                                                                        //2)
        Integer[] arr = {10, 26, 6, 72, 9, 10, 45, 7, 77, 56, 46, 77, 3, 2, 2};
        // Set содержит только уникальные значения
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //мы делаем iteration через set
        for (int v : set) { //идея такая, я беру какое-то число из сета. 1oe например
            int count = 0;
            for (int n : arr) { // и потом сравниваю все числа in array.
                if (n == v) {
                    count++;////если число 1  раз то count у меня будет равняться всего единицы.
                }
            }
                                                                                          //3)
            if (count > 1) { //но если больше единицы значит оно повторяется. я должен:
                System.out.println(v);
            }
        }
    }
}
