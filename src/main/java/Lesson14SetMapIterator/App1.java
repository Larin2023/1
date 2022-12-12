package Lesson14SetMapIterator;

//Hashmap он имплементирует интерфейс.
//хранит два значения: ключ и значение ключ
//ключи всегда уникальные, значение -- нет

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        // 2) hashmap имплементирует интерфейс Map поэтому с левой стороны мы будем писать Map.
        // и здесь мы должны подать 2 класса. на подсказки вы видите "<K, V>"
        Map<String, String> capitals = new HashMap<>();
        // идея здесь такая что Hashmap это такая структура которая хранит два значения: ключ и значение.
        // идея в том что ключи всегда уникальные, а значение нет.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        // и когда мы добавляем что-то hashmap, мы используем другой глагол,
        // мы не используем add, мы используем "PUT" положить.
        // смысол в том что когда мы добавляем "add" мы добавляем в
        //определенное место. когда мы ложим "Put", у нас нет определенного места.
        capitals.put("Washington", "USA");
        //hashmap всегда рассчитывайте что это как мешок.
        // как SET,  там нет порядка.
        capitals.put("Berlin", "Germany");
        capitals.put("Tokyo", "Japan");
        System.out.println(capitals);

        capitals.put("Tokyo", "Narnia");
        System.out.println(capitals);   //у нас получится что токио равняется нарнии,
        // на печате, токио равняется Japan пропала. почему? потому что у нас могут
        //быть только уникальные ключи.
        // если я добавлю еще какую-то страну
        capitals.put("Bonn", "Germany");
        System.out.println(capitals);
        // идея в том что ключи должны быть уникальными.
        // ключ  это набор SETов.
        //Values могут повторяться.

        // если нам надо какой-то элемент достать, мы используем тот же метод как index.
        // вместо индекса у вас будет какой-то ключ.
        //to get Germany we gotta use the key "Bonn"
        // у нас не может быть двух чисел с одинаковым ключом в hashmap
        System.out.println(capitals.get("Bonn"));
        //same here:
        System.out.println(capitals.get("Tokyo"));
        
        // to replace:
        capitals.replace("Tokyo", "Japan");
        System.out.println(capitals);


        // 3)
        //как мы можем интеррировать через HashMap
        //три вида итерации через хэш map
// a)по ключам
//        for (String key: capitals.keySet()) {
//            System.out.println(key);
//        }
// b) по значение Values
//            for (String value: capitals.values()) {
//                System.out.println(value);
//            }
// c) по ключам and назначения
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // 5)
        //Hashmap может имитировать arraylist.
        // мы будем использовать в качестве ключей целые числа начиная с нуля
        //и ставлю их подряд это будет подобие arraylist
        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "Red");
        colors.put(1, "Red");
        colors.put(2, "Blue");
        colors.put(3, "Green");
        System.out.println(colors.get(1));

        //B девяносто девяти процентов случаев когда вы будете
        //использовать хэш map это будет <string, spring>
        //допустим если я сделал новый класс person он будет пустой,
        //и новый класс Pet он будет пустой.

        // 8)
        Map<pet,person> petLife = new HashMap<>();
        petLife.put(new pet(),new person());

        // если нам надо узнать размер мы будем использовать "size"
        System.out.println(petLife.size());
    }
}
