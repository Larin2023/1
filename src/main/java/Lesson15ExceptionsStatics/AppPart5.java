            package Lesson15ExceptionsStatics;

            public class AppPart5 {
                public static void main(String[] args) {
// 5)                    //мы отлавливаем и
                    //эксепшен который называется арифметика exception. мы отлавливаем только catch
                    //арифметикой.  мы не отлавливать ArrayIndexOutOfBoundsException
                    //поэтому он остался не отловлен и то есть если я хочу его отловить я должен
                    //добавить еще один catch block. и сказать ArrayIndexOutOfBoundsException допустим тот же
                    int a = 5;
                    int b = 1;
                    int[] x = {1, 2};
                    System.out.println("Before try/catch");
                    try {
                        System.out.println("In the try catch");
                        int c = a / b;
                        x[7] = 9;
                        System.out.println("After exception");
                    } catch (ArithmeticException e) {                 // поймать
                        System.out.println("In the catch block");
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("In the second catch block");  //в Catch блок мы попадаем только когда
                        // у нас случился exception
                        System.out.println("After try/catch");
                    }
                }
            }
            // GO TO ---------> AppPart6