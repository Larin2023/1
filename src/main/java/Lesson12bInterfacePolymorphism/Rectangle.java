            package Lesson12bInterfacePolymorphism;
//20)
            public class Rectangle implements Shape{
// 19)
// 31)
                // make it protected чтобы его было видно.
                protected double length;
                private double wide;
    // GO TO ---------> App

// 24)
                // constructor:
                public Rectangle(double length, double wide) {
                    this.length = length;
                    this.wide = wide;
                }

                @Override
                public void draw() {
                    // GO TO ---------> Square
//21)
// 30)
                    System.out.println("I draw rectangle size = "+length+"*"+wide);
                }

                @Override
                public double getPerimeter() {
// 22)
                    return 2*(length+wide);

                }

                @Override
                public double getArea() {
// 23)
                    return length*wide;
                }
            }
