package Lesson9EncapsulationGettersSettersConstructors;

public class App {
    public static void main(String [] args) {
        // 2)
        Person david = new Person();
        david.setName("David");
        System.out.println(david.getName());

        // 4)
        david.setYear(-25);
        System.out.println(david.getYear());
        //по программе мы сделали все правильно потому что int может быть отрицательным числом,
        // но по смыслу мы совершили логическую ошибку.
        // год не может быть отрицательным.


    //RUN: Exception in thread "main" java.lang.IllegalArgumentException: Wrong year
    //	at Person.setYear(Person.java:26)
    //	at App.main(App.java:9)
    // Exception is an error "Out of bound"


        // 8)
    Vehicle myCar = new Vehicle();
        myCar.setBrand("Accent");
        myCar.setMake("Honda");
        myCar.setYear(1999);

    // You can get result because no "getters".(they are private)  Only way is this:
        myCar.printInfo();
        }
    }


