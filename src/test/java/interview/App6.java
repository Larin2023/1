package interview;
//видите все простые числа от одного до какого-то числа
public class App6 {
    public static void main(String[] args) {
                                                                                        //1)
        printPrimes(100);
    }
    //я делаю итерацию по всем числам начиная от двух и до bound.
    // и каждое число отправляю в новую функцию которая проверяет она prime или нет.
    // если она prime то возвращает true если нет то она возвращает files

                                                                                         //2)
    private static void printPrimes(int bound) {
        for (int i = 2; i <= bound; i++) {
            if (isPrime(i)) { //здесь я вызываю функцию которая считает простое число или нет
                System.out.println(i);  //если isPrime вернет true она должна распечатываться
            }
        }
    }
                                                                                         //3)
    //я должен проверить каждое конкретное число является ли оно prime
    //как проверяют является ли число простым? надо его делить на все числа начиная с 2
    private static boolean isPrime(int number) {
        for(int i = 2; i<number; i++) {
            if (number % i == 0) {// значит разлилась без остатка
                return false;
            }
        }
        return true;
    }
}