            package interview;
            //найти остаток от числа но не используя оператор модусу
            public class App {
                public static void main (String[] args) {
// 2)
                    System.out.println(getRemainder1(100,30)); // давайте запустим

                }
// 1)
                public static int getRemainder1(int a, int b){ //  в качестве аргумента мы берем два числа
                    while (a>=b){ // пока а больше b, мы делаем следущею операцию:
                        a=a-b;
                    }
                    return a;
                }
            }

            //берешь от первого числа отнимаешь второе
            //до тех пор пока отнимаешь до остатка.