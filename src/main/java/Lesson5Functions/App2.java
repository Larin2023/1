package Lesson5Functions;

public class App2 {

    public static void main(String[] args) {            //тут мы вызываем
        $$$$$("Mike"); //но у меня у этой функции есть параметр "String name"
        $$$$$("Irina");

        String xx = "Jack";
        $$$$$(xx);

        String ff ="FF";
        $$$$$(ff);

        CCC(5);

        VVV(1,1,3);
        VVV(5,10,20);
    }
    /////FUNCTION to print names
    public static void $$$$$(String name){                    //тут мы определяем
        System.out.println("Hello "+name);                    //вводим
    }
    // FUNCTION to calculate radius of circle
    public static void CCC(double radius){                    //тут мы определяем
        System.out.println("Circle length = "+ 3.14*2*radius);//вводим
    }
    public static void VVV(int a, int b, int c){              //тут мы определяем
        System.out.println(a+b+c);                            //вводим
    }
}
//функции могут быть с параметрами
// они могут работать чуть чуть по разному
//в зависимости от того какой мы подадим на вход параметр.
// то есть мы сюда когда определяем функцию мы говорим эта функция может взять один параметр типа string
// то есть эта функция Hello
//ждет что вы к ней засунете виде параметра string

//эта функция будет работать если мы в нее подадим параметры

