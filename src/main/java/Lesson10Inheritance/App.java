package Lesson10Inheritance;

public class App {
    public static void main(String[] args) {

//чтобы код был сухим мы можем
//использовать родительский класс "супер-класса" и мы можем его "extend" добавляя что-то дополнительно

                                                                // 12) create new object.
        //что случилось сейчас? Look at the constructor (Student)
        Student victor = new Student("Victor", "Gonzalez",1999, Subject.BIOLOGY);
                                                                // 14)
        System.out.println(victor.getMajor());
        System.out.println(victor.getLastName());
        // когда я вызываю getMajor(), я вызываю метод класс student.
        // потому что в классе student у меня есть getMajor().
        // а как же вы скажете я смог сделать getLastName()???
        // я использую гендер из родительского класса.
        // почему??? да потому что я могу это делать.
        // в этом и есть идея inhabitants.
        // наследованию вы можете пользоваться полями и методами родительского класса

                                                                // 16)
        Teacher mrJones = new Teacher("Alex", "Jones", 1985, Subject.ACCOUNTING);
        System.out.println(mrJones.getLastName());
        System.out.println(mrJones.getSubject());
        //сейчас я сделаю Teacher детским классом по отношению k Person

                                                                // 28) "массив констант"
        Subject [] victorSubjects = {Subject.CS,Subject.MATH,Subject.BIOLOGY};
        victor.setSubjects(victorSubjects); // setSubjects в качестве аргумента она берет array of Subjects [] with is "victorSubjects"
    }
}


                                                                    // 22)
// я могу добавить
//хоть сколько sap классов
                                                                    // 23)
// второй популярный вопрос: а можно ли наследовать
//больше чем одного класса то есть можно ли одновременно расширять 2 3 4 класса --
//ответ в Java нет.
                                                                    // 24)
//Inheritance "наследование" это просто мы хотим использовать одни и те же методы. мы хотим чтобы наш
//код был сухой

                                                                    // 25)
// code сухой за счет того что
// мы меняем в одном месте а изменяется везде.
// в этом большое преимущество.
