            package Lesson12bInterfacePolymorphism;

// 13)
            public class App {
                        public static void main(String[] args) {
            // GO TO ---------> Shape

//28)
                            Circle c1 = new Circle(5.2);
            //        c1.draw();
            //        System.out.println(c1.getArea());
            //        System.out.println(c1.getPerimeter());

                            Rectangle r1 = new Rectangle(2.3, 3.3);
            //        r1.draw();
                            // GO TO ---------> Circle

// 32)
            //        System.out.println(r1.getArea());

// 33)
                            Square s1 = new Square(5);
            //        s1.draw();
            //        System.out.println(s1.getArea());
            //        System.out.println(s1.getPerimeter());


            //        Rectangle s2 = new Square(5);
            //        s1.draw();
            //        System.out.println(s1.getArea());
            //        System.out.println(s1.getPerimeter());

// 34)
                            Rectangle s2 = new Square(7);
                            Shape c2 = new Circle(5);
                            Shape r2 = new Rectangle(2, 3);
                            Shape s3 = new Square(8);

// 35)
                            Shape[] shapes = {c1, c2, r1, s2, s1, s2, s3};

// 36)
                            for (Shape shape : shapes) {
                                shape.draw();

                                //полиморфиз который говорит что метод из саб класса
                                //может переписать родительский или по естественный интерфейс
                            }
                        }
                    }
                    // THE END
