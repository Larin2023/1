package Lesson15ExceptionsStatics;

public class Person {
    private String name;
    private String lastName;
    private static int x;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        x=5;
    }


    public static void sayHello(){
        System.out.println("Hello "+x);
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}

