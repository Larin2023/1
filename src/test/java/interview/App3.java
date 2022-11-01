package interview;
//у вас есть функция public static void fizzbuzz
// вам надо распечатать все цифры от нуля до этого числа.
// но если число делится на 3, вам надо напечатать вывести слова fizz
//если число делится на 5 то надо распечатать buzz
//если делится и на 3 и на 5 надо распечатать fizzbuzz

public class App3 {
    public static void main(String[] args) {
                                                                  //2)
        fizzbuzz(50);
    }
                                                                 //1)
    public static void fizzbuzz(int bound) {
        for (int i = 1; i < bound; i++) {
            if (i % 3 == 0 && i % 5 == 0) { //если i делить на 3 равняется нулю, и i делитель на 5 равняется нулю в этом случае мы пишем FizzBuzz
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
// если вы посчитаете 3 а потом 5 у вас уже (i % 3 == 0 && i % 5 == 0) не
//получится потому что вы уже FizzBuzz. то есть вот от от вас чего хотят видеть
