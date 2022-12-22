            package Lesson15ExceptionsStatics;
// 9)
            public class Person {
// 10)
            // For "Static" part of the class
                private String name;
                private String lastName;

// 17)
                private static int x;

// 11)
                public Person(String name, String lastName) {
                    this.name = name;
                    this.lastName = lastName;

// 18)
                    x=5;
                }

// 13)
            // я в этом классе создам статическую функцию
                public static void sayHello(){
                    // GO TO ---------> App1
// 18)
            // я его могу из статического метода вызвать,
                    System.out.println("Hello "+x);
                    // я могу вызвать только статические функции методы.
                }
                // не статические методы могут
                //вызывать статические, но не наоборот
    // THE END

// 12)
                public String getName() {
//15)
            //  могу вызвать из не статического метода
            // sayHello();
                    return name;
                }
                public String getLastName() {
                    return lastName;
                }
            }
            // GO TO ---------> App1

