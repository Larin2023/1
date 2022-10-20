package Lesson13WrapperClasseCollectinsArrayListReferencePrimitives;


import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        // 10)  /////////Collections
        //с левой стороны у вас обычно будет интерфейс, с правой стороны конкретный класс
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");

        //arraylist не работает с примитивами.
        // array list работает с wrapper классами.
        // то есть если мы хотим сделать arraylist мы должны использовать мне int а интеджер
        //мы не можем использовать примитив здесь.

        List<Integer> numbers = new ArrayList<Integer>();

        // 11)
        // list of person
        List<Person> people = new ArrayList<>();
        //to add:
        Person oleg = new Person( "Oleg");
        people.add(oleg);
        //to add:
        people.add(new Person (  "Anna"));
        //to get:
        System.out.println(people.get(1).getName());
    }
}

//90 процентов времени

//которым вы будете работать с коллекциями вы будете работать with array листом
// еще 10 процентов вы будете работать с hashmaps.
//коллекции это навороченные arrays с различными причудами,
// но из всех коллекций вы будете использовать arraylist