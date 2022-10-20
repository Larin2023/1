package Lesson5Functions;

public class App3 {

    public static void main(String[] args) {


        // функций могут что-тo возвращать. то есть функция на самом деле это какие-то калькулятор.
        // функции которые ничего не возвращают мы их проходили сейчас это функции Void.
        // функции писали на экран но они ничего не возвращали.
        // что такое функция которая что-то возвращает
        // функция перед которой можно поставить равно (=), значит это что-то возвращает.

        //это значит возвращает (return)?
        // это значит что перед ней она возвращает какой-то int.
        //теперь это значит что внутри xx, у меня будет хранится результат выполнения этой функции.
        // если я сейчас делаю sout xx
        //я тогда увижу что у меня вышло на экран


        int xx = sumOfThreeNumbers(2, 8, 2);
        System.out.println(xx);

        String result = weather("rainy", "Washington");
        System.out.println(result);

        result = weather("sunny", "Buffalo");
        System.out.println(result);

        result = weather("nasty", "Seattle");
        System.out.println(result);

        System.out.println(weather("beautiful", "Miami"));

    }

    // RETURN FUNCTION is the one that has "=" sign:
    public static int sumOfThreeNumbers(int a1, int a2, int a3) {
        int summa = a1 + a2 + a3;
        return summa;
    }

    // FUNCTION where we can put parameters. the Function will return them back.
    public static String weather(String weather, String city) {
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
