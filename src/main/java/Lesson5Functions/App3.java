package Lesson5Functions;

public class App3 {

    public static void main(String[] args) {  //тут мы вызываем
            System.out.println(myMethod(3));

        // функций могут что-тo возвращать. то есть функция на самом деле это какие-то калькулятор.
        // функции которые ничего не возвращают мы их проходили сейчас это функции Void.
        // функции писали на экран но они ничего не возвращали.
        // что такое функция которая что-то возвращает
        // функция перед которой можно поставить равно (=), значит это что-то возвращает.

        //Definition and Usage:
        //The "void" keyword specifies that a method should not have a return value.
        //
        //More Examples
        //Tip: If you want a method to return a value, you can use a primitive data type (such as int, char, etc.)
        // instead of void, and use the "return" keyword inside the method:

        //это значит возвращает (return)?
        // это значит что перед ней она возвращает какой-то int.
        //        "int" xx = VVV(2, 8, 2);
        //        System.out.println(xx);
        //    public static "int" VVV(int a, int b, int c) {
        //        int summmma = a+b+c;
        //        return summmma;
        //теперь это значит что внутри xx, у меня будет хранится результат выполнения этой функции.
        // если я сейчас делаю sout xx
        //я тогда увижу что у меня вышло на экран

        int xx = VVV(2, 8, 2);
        System.out.println(xx);

        String result = WWW("rainy", "Washington");
        System.out.println(result);

        result = WWW("sunny", "Buffalo");
        System.out.println(result);

        result = WWW("nasty", "Seattle");
        System.out.println(result);

        System.out.println(WWW("beautiful", "Miami"));
    }
    static int myMethod(int x) {
        return 5 + x;
    }

    // RETURN FUNCTION is the one that has "=" sign:
    public static int VVV(int a, int b, int c) {  //тут мы определяем
        int summmma = a+b+c;
        return summmma;                              //тут мы возвращаем
    }

    // FUNCTION where we can put parameters. the Function will return them back.
    public static String WWW(String weather, String city) {
        return "Today in " + city + " is a " + weather + " weather";
    }
}
//в реальной жизни когда вы будете запускать программы,
// вы не будете запускать программ которые что-то на экран будут писать
// это сейчас мы пишем на экран чтобы вы сразу видели результат,
// но в реальной жизни вы не будете ничего на экран писать,
// но вам надо чтобы ваша функция работала.

//функция то какие то на самом деле механизмы
//эту функцию можно использовать с разными параметрами много раз.
