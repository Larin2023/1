package Lesson3Arrays;

public class App {

    public static void main(String[] args) {

        // квадратные скобки [] говорят что это array
        //у нас есть одна переменная и мы там храним много значений
        //ну представьте у нас есть ну допустим улица.
        //на улице 20 домов. качество дома и свой номер начиная 0 1 2
        //если вам надо пройти k десятому дому.
        // вы говорите я хочу к дому номер 10 то есть вы ставите адрес.
        // вот эта идея то есть у нас есть какая-то переменная.
        // давайте создадим переменную:

        // Array of colors
        String[] colors = {"Cyan","Green","Blue", "Brown", "Black", "Yellow", "Blue"};
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[3]);
        System.out.println(colors[6]);

        //[0]);
        //[1]);
        //[3]);
        //[6]);    ---- are "ELEMENTS" or "INDEX"

        //"Array" -- это такая переменная где под одним именем мы можем хранить много одинаковых
        //значений. и доступ к этим значением мы имеем через адрес или
        //мы его называем Index вот это в скобках это индекс переменной то есть вот у этой



        // Change "Blue" variable to "Red":
        colors[6]="Red";
        System.out.println(colors[6]);


        //а если я захочу сделать System.out.println(colors[10]);
        // Exception error (out of bounds):
        //exception --- такая ошибка в джаве которая говорит что в файле AppLesson1.main
        //вы допустили эксепшен. у вас вы пытаетесь сделать index 10
        //где всего 7 элементов вы делаете что то не то.
//        System.out.println(colors[10]);
        //"Exception in thread "main" java.lang. ArrayIndexOutOfBoundsException Create breakpoint : Index 10 out of bounds for length 7
        //at AppLesson1.main(AppLesson1.java:11)"

        // Fix the значение 56:
        int[]weekMaxTemperatures ={80,81,86,82,78,56,62};
        weekMaxTemperatures[5]=65;
        System.out.println(weekMaxTemperatures[5]);

        //Array of names:
        String[]names = {"John","David","Mary","Ann","John","Max","Ashley","Samantha","Rachel"};
        System.out.println(names[0]);

        // get LENGTH of array
        System.out.println(names.length);

        // get LAST element in array
        System.out.println(names[names.length-1]);
        System.out.println(colors[colors.length-1]);
        System.out.println(weekMaxTemperatures[weekMaxTemperatures.length-1]);

        //а что если я заранее не знаю какие значения I put in array.
        // могу ли я зарезервировать место а потом туда засунуть значение
        //можем.
       // я резервируя размер:  String[]fruits = new String[5];
        // здесь я просто зарезервировал место, там еще ничего нету
        //но место зарезервирована на пять человек
        // теперь я могу эти пять мест заполнить:
        // reserve ARRAY for putting elements (it should return: "Process finished with exit code 0")
        String[]fruits = new String[5];
        fruits[0] = "Banana";
        fruits[1] = "Apple";
        fruits[2] = "Apple";
        fruits[3] = "Pineapple";
        fruits[4] = "Peach"; // If you add one more fruit it would give an "Exception"

        // to print all elements:
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        System.out.println(fruits[4]);

        // change elements in existing array
        fruits[0] = "Mango";
        fruits[1] = "Mango";
        fruits[2] = "Mango";
        fruits[3] = "Mango";
        fruits[4] = "Mango";

        //у Array фиксированная длина вы не можете менять длину арея на лету.
        //то есть вы когда создали Array, он будет именно той длины который вы создали вы
        //не можете его уменьшать вы не можете его увеличивать физически

        // if the array (string) is empty it would  print "NULL":
        String[] vegies = new String[2];
        System.out.println(vegies[0]);

        // if the array (int) is empty it would  print "0":
        int[] xx = new int[1];
        System.out.println(xx[0]);

        // if the array (boolean) is empty it would  print "false":
        boolean[]x = {true,5>3,6==7,12>10};
        boolean[]b = new boolean[1];
        System.out.println(b[0]);

    }
}
