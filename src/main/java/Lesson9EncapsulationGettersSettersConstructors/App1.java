package Lesson9EncapsulationGettersSettersConstructors;

public class App1 {

    // 10)
    //когда все поля оптом заполнять. чтобы не по одному а оптом - можно.
    //для этого нам нужен "конструктор"
    public static void main(String[] args) {
        Student ann = new Student("Anna", "Jones", 2001, "Math");

        // 12)
        Student michael = new Student("Michael", "Roberts", 2000);


        // 13) я могу все вещи sam потом добавить
        //через сеттер
        Student samuel = new Student();
        // 16)
        samuel.setLastName("Dobson");
        samuel.setName("Samuel");

        // 18) Creating a Fruit
        Fruit apple = new Fruit( "Apple");
        Fruit peach = new Fruit();
        peach.setName("Peach");

        System.out.println(apple.getName());
        System.out.println(peach.getName());


        // 20) ENUM
        //они вас ограничивают но они дают вам совершить ошибку
        Colors car = Colors.RED;

    }
}
//инкапсуляция говорит что поля мы прячем они Private. а как тогда
//если мы их прячем как нам доступ организм? then we use Getter and Setter.

// конструктор облегчают знания объекта. просто это оптовые сектор.


//вокруг нас но существуют объекты и мы их описываем при помощи
// классов. в классах есть поля, в классах есть методы

