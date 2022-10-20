package Lesson12bInterfacePolymorphism;
public class Rectangle implements Shape{ //20)
    // 19)
    protected double length; // 31) make it protected чтобы его было видно.
    private double wide;

    // 24) constructor:
    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public void draw() {
        //21)
        System.out.println("I draw rectangle size = "+length+"*"+wide); // 30)
    }

    @Override
    public double getPerimeter() {
        return 2*(length+wide); // 22)

    }

    @Override
    public double getArea() {
        return length*wide; // 23)
    }
}
