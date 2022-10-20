package Lesson8ClassObjectsFieldsMethodsThis;
public class Vehicle {
    // 4)
    public int year;
    public String make;
    public String model;
    public String color;

    // 7)  но помимо полей наши классы могут содержать методы то есть функции
    public void start(){
        System.out.println( make +""+ model+" started engine");
    }
    public void beep(){
        System.out.println(color+" car made beep");
    }
}

