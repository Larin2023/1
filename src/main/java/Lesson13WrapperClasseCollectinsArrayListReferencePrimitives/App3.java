            package Lesson13WrapperClasseCollectinsArrayListReferencePrimitives;


            import java.util.ArrayList;
            import java.util.List;

            public class App3 {
                public static void main(String[] args) {
// 10)  /////////Collections
                    // коллекции это навороченные arrays с различными причудами
                    //ArrayList относится к коллекциям.
                    //https://lh5.googleusercontent.com/OECdGJI0_-x4B9w5ZpT01Zei0i-XROS1Mhzc3RHDQAYmtOATAfc3cptRBDsey5n8TB7U3Qcmmn2xlvdgfW6sXu7cW-W86a11sItWRi3ebOgDKp4LR7cQ9UgwiQOyWiXOmG7DLwTH

                    // с сегодняшнего дня вы будете писать так
                    //с левой стороны у вас обычно будет интерфейс, с правой стороны конкретный класс
                    List<String> fruits = new ArrayList<>();
                    fruits.add("Apple"); //добавить яблоко

                    //arraylist не работает с примитивами.
                    // array list работает с wrapper классами.
                    // то есть если мы хотим сделать arraylist мы должны использовать не int а Integer
                    //мы не можем использовать примитив здесь.
                    List<Integer> numbers = new ArrayList<Integer>(); // сделать ArrayList из чисел

// 11)
                    // list of person
                    List<Person> people = new ArrayList<>();
                    //to add:
                    Person oleg = new Person( "Oleg");
                    people.add(oleg);
                    //to add:
                    people.add(new Person (  "Anna")); //добавить еще человека
                    //to get:
                    System.out.println(people.get(1).getName()); // чиню гетры
                }
            }

            //90 процентов времени

            //которым вы будете работать с коллекциями вы будете работать with array листом
            // еще 10 процентов вы будете работать с hashmaps.
            //коллекции это навороченные arrays с различными причудами,
            // но из всех коллекций вы будете использовать arraylist
            // THE END