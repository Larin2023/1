package Lesson9EncapsulationGettersSettersConstructors;
public class Student {
    // 9)
    private String name;
    private String lastName;
    private int year;
    private String major;

    //Constructor is a method that construct class from name.
    //конструктор это специальная функция которая помогает инициализировать все
    //или не все поля класса. она может интересовать,a может вообще ничего социализировать.
    // Если в классе у нас не прописан
    //конструктор явно у нас все равно он есть. он дефолтный конструктор или пустой
    //конструктор он есть. но если мы прописали хоть один конструктор дефолтый
    //конструктор исчезает. и если мы хотим его использовать мы должны его явно
    //прописать.
    //конструктор имеет то же самое имя что и класс. конструктор нужен чтобы создавать объект.
    //может сразу все поля вставляют. может, не все. может ничего не инициализирует.
    //"Инициализация" переменной означает явное (или неявное) установление некоторого значения переменной.
    public Student(String name, String lastName, int year, String major) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.major = major;
    }

    // 11)
    public Student(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    // 14)_____________________________________
    public Student(){} /// default constructor
    //____________________________________________

    public void setMajor(String major){ // from 11)
        this.major = major;

        // 15) надо создать кучу сеттеров
    }
    public void setName(String name){
        this.name = name;

    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
