package Lesson10Inheritance;

public class Person {
                                                    // 7) в классе person я
                                                    // должен променять private на protected
    protected String name;
    protected String lastName;
    protected int year;
    // "протектор" точно так же не видно снаружи они как "Private" но они ведны из саб-классов "child классов"
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
    // Getter не может быть void потому что он должен делать return
}
//    int x = 5; // Setter x
//    int y = x; // Getter x - Setter for y

                                                        // 15)
// родительский класс in Java называется Super класс

