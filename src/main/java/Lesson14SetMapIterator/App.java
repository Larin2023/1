package Lesson14SetMapIterator;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        // 1)
        //Hashset implements SET
        //в будущем так и будем делать мы не будем писать "хэштеги" будем просто писать "set"
        //        HashSet<String> cities = new HashSet<>();
        Set<String> cities = new HashSet<>();

        //      deference between "Set" and "Array List"?
        //      no индексов. "Set" is like мешок, то есть вы туда кладете
        //      и там порядка нету.

        cities.add("Washington");
        cities.add("NYC");
        System.out.println(cities);

        //B чём фишка "SET"? SET хранят только уникальные значения
        cities.add("NYC");  //у нас этого не получится потому что SET хранит только уникальные значения
        System.out.println(cities);
//       Advantage of SET:
//      a) надо вытащить только уникальные, или наоборот вам надо вытащить только повторы.
//      B таких случаях SET неоценимо потому что сет имеет только уникальные значения
//      b)   можно узнать есть ли это значение или нет
        System.out.println(cities.contains("LA")); // eсли какого-то города нету -- будет false


        //SET это такая структура хранит только уникальные вещи
        //eдинственный из кейсoB где мы можем использовать это. это задачей по интервью

        // 4)
        //итерация по SET очень просто:
        for (String x:cities){
            System.out.println(x);
        }
    }
}
