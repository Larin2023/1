package Lesson14SetMapIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        // 8)
        //первое нам надо вытащить итератор отсюда.

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("peach");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");

        Iterator<String> it = fruits. iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

//"итератор" это как указатель он при каждом
//тексте прыгает и указывает на новое значение

//когда вы увидите функцию next значит там "император"