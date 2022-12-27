            package Lesson10Inheritance;

            public class Person {
// 10)
            //   я хочу сделать класс person
            //   родительским классом по отношению студента и преподавателя.
            //   в классе person я
            //   должен променять private на protected.
                protected String name;
                protected String lastName;
                protected int year;
                // "протектор" точно так же не видно снаружи они как "Private" но они ведны из саб-классов "child классов"
                public Person(){
                }
                //person - по-хорошему является как бы родительским
                //классом, и для студента и для преподавателя, то есть концепция наследование.
            // GO TO ----------> Student



                public Person(String name, String lastName, int year) {
                    this.name = name;
                    this.lastName = lastName;
                    this.year = year;
                }

                public Person(String name, String lastName) {
                    this.name = name;
                    this.lastName = lastName;
                }
            }

