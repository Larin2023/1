package interview;
//найти остаток от числа но не используя оператор модусу
public class App {
    public static void main (String[] args) {
        System.out.println(getRemainder1(100,30));

    }
    public static int getRemainder1(int a, int b){
        while (a>=b){
            a=a-b;
        }
        return a;
    }
}
