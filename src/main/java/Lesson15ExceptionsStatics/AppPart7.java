            package Lesson15ExceptionsStatics;

            public class AppPart7 {
// 7)                //идея блока Finally. мы в block попадаем в любом случай.
                // произошел exception или не произошло мы попадаем в block finally.

                //произошел у нас трай кетч или нет
                //произошел нас exception или нет закрой базу данных

                public static void main(String[] args) {

                    int a = 5;
                    int b = 1;
                    int[] x = {1, 2};
                    System.out.println("Before try/catch");
                    try {
                        System.out.println("In the try catch");
                        int c = a / b;
                        x[1] = 9;
                        System.out.println("After exception");
                    } catch (ArithmeticException e) {
                        System.out.println("In the catch block");
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("In the second catch block");
            //            throw e;
                    } catch (Exception e) {
                        System.out.println("All exception block");
                    } finally {
                        System.out.println("In the finally");
                    }
                    System.out.println("After try/catch");
                }
            }
            // GO TO ---------> App1
