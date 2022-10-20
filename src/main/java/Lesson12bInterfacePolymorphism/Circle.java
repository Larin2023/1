package Lesson12bInterfacePolymorphism;

public class Circle implements Shape{

        //16)
    private double radius;

    public Circle(double v) {
    }

    // 15)
    @Override
    public void draw() {
        // 29)
        System.out.println("I draw circle with radius = "+radius);

    }

    @Override
    public double getPerimeter() {
        //17)
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() {
        //18)
        return Math.PI*radius*radius;
    }
}
