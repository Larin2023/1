            package Lesson15ExceptionsStatics;

            public class AppPart6 {
                public static void main(String[] args) {
// 6)                    //но если я хочу отлавливать all ошибки что очень хорошо я могу отлавливать эксепшен
                    //я могу сказать "catch (Exception e)" что такое catch (Exception e) на самом деле
                    //это дедушка любого exception

                    //иногда нам надо поймать ошибку. мы записали эту ошибку куда-то а
                    //потом я ее должен выкинуть заново.  я выкидываю эту ошибку дальше
                    //смотрите что получается я ее отловил но я ее выкинул дальше.


                    //try/catch эта система которая позволяет нам
                    //вылавливать exception-ы мы можем вылавливать разные эксепшен это нам пригодится в Selenium.
                    // потому что когда вы видите ищите элемент. элемент может быть не найден или элемент
                    //может быть недоступен или элемент может быть перекрыт другим элементам. и это все
                    //exception-ы мы будем с этими эксепшенами бороться. дальше то есть идея если у
                    //нас есть несколько exception of мы можем их вылавливать различных catch блоках
                    int a = 5;
                    int b = 1;
                    int[] x = {1, 2};
                    System.out.println("Before try/catch");
                    try {
                        System.out.println("In the try catch");
                        int c = a / b;
                        x[7] = 9;
                        System.out.println("After exception");
                    } catch (ArithmeticException e) {
                        System.out.println("In the catch block");
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("In the second catch block");
                        throw e;
                    } catch (Exception e) {
                    }
                }
            }
            // GO TO ---------> AppPart7

