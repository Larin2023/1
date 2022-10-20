package Lesson10Inheritance;

public class Person {
    // 1)
    protected String name;
    protected String lastName;
    protected int year;
    //"протектор" точно так же не видно снаружи они как "Private" но они ведны из саб-классов "child классов"

    // 2) make constructor
    public Person(){
    }

    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //Getter не может быть void потому что он должен делать return

}


//    int x =5; // Setter x
//    int y = x; // Getter x - Setter for y

