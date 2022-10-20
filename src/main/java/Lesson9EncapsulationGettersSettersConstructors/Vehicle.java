package Lesson9EncapsulationGettersSettersConstructors;
public class Vehicle {

    // 7)
    private String make;
    private String brand;
    private int year;

    //я сделаю кучу сеттеров
    //но я не буду делать геттеры. я сделаю одну функцию print о которой все нам выведет

    public void setYear(int year){
        this.year = year;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setBrand(String brand){
        this.brand = brand;
        //"Privates" are not seen outside, but they are inside
        // "Private" and "public" are modifiers of access

    }
    public void printInfo() {
        System.out.println("Vehicle{" +
                "make='" + make + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}');
    }
}

