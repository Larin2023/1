            package Lesson15ExceptionsStatics;

            public class AppPart4 {
                public static void main(String[] args) {
// 4)            //    catch блок срабатывает
            //    только тогда когда у нас происходит ошибка

                    // When we divide by 1, there is no mistake:
                    int a = 5;
                    int b = 1;
                    System.out.println("Before try/catch");
                    try {
                        System.out.println("In the try catch");
                        int c = a / b;
                        System.out.println("After exception");
                    } catch (ArithmeticException e) {
                        System.out.println("In the catch block");
                    }
                    System.out.println("After try/catch");
                }
            }
            //    catch блок срабатывает
            //    только тогда когда у нас происходит ошибка
            // GO TO ---------> AppPart5


