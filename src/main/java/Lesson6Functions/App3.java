package Lesson6Functions;

public class App3 {
    public static void main(String[] args) {
        double r = sum(1, 1.1);
// перегрузка имен функций

    }
    // 7) Signature
    /*
    public static String[] someName(String s1, int a1,double[] xx){
    ------------------------------------------------
    //       someName(String, int, double[]) - signature


//представьте нам надо сложить два числа и создать метод сумм

//    public static double sum1(int a, double b){
//        return a+b;
//    }
//    public static double sum2(double a, double b){
//        return a+b;
//
//    public static double sum3(double a, int b){
//            return a+b; ----- Name overloading
---------------------------------------------------------------------------
//сигнатуру функции берет название функции и
//типы и их параметров и количество.
//это кстати в качестве этого не берется возвращаемый тип.

// name-overloading вы можете использовать то же самое имя функции but you have to have another signature.
// а как может быть другой сигнатурой если имя тоже?
// вы будете играть с параметрами!!!!!!!

//  !!!! function overloading!!!!
    }
    someName(String, int, double[]) - Signature take Name and Types of its parameters

     */
    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, int b) {
        return a + b;
    }
    public static double sum(double a, double b) {  //Can cover everything!!!!!! It is enaf
        return a + b;
    }
    public static double sum(int a, double b) {
        return a + b;
    }

    //это будет работать. а все почему? дело в том что у всех этих четырех функции различных signature:
    //sum(int,int)
    //sum(double,int)
    //sum(double,double)
    //sum(int,double)
}
//самый распространенный пример function overloading:
//System.out.println
