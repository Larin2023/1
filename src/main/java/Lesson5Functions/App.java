package Lesson5Functions;

public class App {


    // to avoid repeating the code we use FUNCTIONS.
    // Functions is like shortening:

    //когда мы подряд делаем мы используем loop.
    //иногда нам надо сделать это не подряд we use FUNCTIONS

    //    public static void main(String[] args) {

//        System.out.println("Today is Monday");
//        System.out.println("Hi, Students");
//        System.out.println("Let start out lesson");
//        System.out.println("Hope you are good today");
//
//        System.out.println("Today is Tuesday");
//        System.out.println("Hi, Students");
//        System.out.println("Let start out lesson");
//        System.out.println("Hope you are good today");
//
//        System.out.println("Today is Wednesday");
//        System.out.println("Hi, Students");
//        System.out.println("Let start out lesson");
//        System.out.println("Hope you are good today");
//
//        System.out.println("Today is Thursday");
//        System.out.println("Hi, Students");
//        System.out.println("Let start out lesson");
//        System.out.println("Hope you are good today");
//
//        System.out.println("Today is Friday");
//        System.out.println("Hi, Students");
//        System.out.println("Let start out lesson");
//        System.out.println("Hope you are good today");



    // FUNCTIONS:
    public static void main (String[]args){
        System.out.println("Today is Monday"); //а вот здесь я вызываю функцию
        hi();
        System.out.println("Today is Tuesday");
        hi();
        System.out.println("Today is Wednesday");
        hi();
        System.out.println("Today is Thursday");
        hi();
        System.out.println("Today is Friday");
        hi();
    }
    // я сделал рефакторинг кода. что такое рефакторинг когда вы
    //улучшаете код но результат будет точно таким же.


    // Here is how the function "hi" looks like (defenition):
    public static void hi () {
        System.out.println("Hi, Students");
        System.out.println("Let start out lesson");
        System.out.println("Hope you are good today");

        //теперь когда я вызываю функцию "hi" она печатает вот эти 3 строчки

        //функция это сокращение.
        //мы вынесли 3 строчки в отдельное место. и дали какой-то имя "hi".
        // теперь мы вызываем это имя хай, но когда мы вызываем это имя хай мы вызываем эту функцию и она
        //печатает эти три фразы.

    }
}
