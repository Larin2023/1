package Lesson5Functions;

public class App2 {

    public static void main(String[] args) {
        hello("Mike"); //но у меня у этой функции есть параметр string name
        hello("Irina");
        String xx = "Jack";

        hello(xx);
        String ff ="FF";
        hello(ff);

        circleLength(5);
    }
    /////FUNCTION to print names
    public static void hello(String name){
        System.out.println("Hello "+name);
    }
    // FUNCTION to calculate radius of circle
    public static void circleLength(double radius){

        System.out.println("Circle length = "+ 3.14*radius);
    }
}
//функции могут быть с параметрами
// они могут работать чуть чуть по разному
//в зависимости от того какой мы подадим на вход параметр.
// то есть мы сюда когда определяем функцию мы говорим эта функция может взять один параметр типа string
// то есть эта функция Hello
//ждет что вы к ней засунете виде параметра string

//эта функция будет работать если мы в нее подадим параметры

