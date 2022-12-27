            package Lesson10Inheritance;

            public class App {
                public static void main(String[] args) {

            //чтобы код был сухим мы можем
            //использовать родительский класс "супер-класса" и мы можем его "extend" добавляя что-то дополнительно

// 16)
                    // давайте сделаем этого студента реальным
                    //что случилось сейчас? Look at the constructor (Student)
                    Student victor = new Student("Victor", "Gonzalez",1999, Subject.BIOLOGY);
// 17)
                    // я хочу вытащить Major
                    System.out.println(victor.getMajor());
                    System.out.println(victor.getLastName());
                    // когда я вызываю getMajor(), я вызываю метод класс student.
                    // потому что в классе student у меня есть getMajor().
                    // а как же вы скажете я смог сделать getLastName()???
                    // я использую гендер из родительского класса.
                    // почему??? да потому что я могу это делать.
                    // в этом и есть идея inhabitants.
                    // наследованию вы можете пользоваться полями и методами родительского класса

                    // почему они protect?
                    // они точно так же не видны снаружи они как прайвиды, но они видны из sub классов (child классов).
                    // вы должны делать protected  только в super классе.


// 18)
                    // Teacher он пока ещё не child класс по
                    //отношению к person
                    Teacher mrJones = new Teacher("Alex", "Jones", 1985, Subject.ACCOUNTING);
                    System.out.println(mrJones.getLastName());
                    System.out.println(mrJones.getSubject());
                    //сейчас я сделаю Teacher детским классом по отношению k Person
                    // GO TO -------------> Teacher

// 26)
                    // "массив констант"
                    Subject [] victorSubjects = {Subject.CS,Subject.MATH,Subject.BIOLOGY};
                    victor.setSubjects(victorSubjects); // setSubjects в качестве аргумента она берет array of Subjects [] with is "victorSubjects"
                }
            }
                    // THE END



            // я могу добавить
            //хоть сколько subclass (child).
            // subclass (child) - the class that inherits from another class
            // superclass (parent) - the class being inherited from

            // второй популярный вопрос: а можно ли наследовать
            //больше чем одного класса то есть можно ли одновременно расширять 2 3 4 класса --
            //ответ в Java нет.

            //Inheritance "наследование" это просто мы хотим использовать одни и те же методы. мы хотим чтобы наш
            //код был сухой

            // code сухой за счет того что
            // мы меняем в одном месте а изменяется везде.
            // в этом большое преимущество.
