package Lesson15ExceptionsStatics;

public class Person {
    // 1) For "Static" part of the class
    private String name;
    private String lastName;

    // 4)
    private static int x;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

        // 5)
        x=5;
    }

    // 2) я в этом классе создам статическую функцию
    public static void sayHello(){
        System.out.println("Hello "+x);  // 6) из статического метода,
        // я могу вызвать только статические функции методы.
    }
    // не статические методы могут
    //вызывать статические, но не наоборот

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}

