            package Lesson15ExceptionsStatics;

            public class AppPart2 {
                public static void main(String[] args) {

//2)                    //мы можем потенциально опасно код мы можем посадить в бокс
                    //"попробовать" сломается or нет.
                    // я его уложу внутрь блока "try".
                    // и если он сломается я это место хочу "catch" поймать.
                    //давайте запустим теперь этот код.
                    // и процесс завершился with exit 0.
                    // это значит что программа завершилась удачно.
                    // автор exception, часть автор exception
                    //тоже прошла успешно то есть вот этот раз
                    //напечаталась то есть даже я попытался
                    //разделить на ноль ничего плохого не случилось. почему? потому что я запустил
                    //код внутри кода try catch. внутрь кода try catch вы можете
                    //положить потенциально опасный код который сломается.

                    int a = 5;
                    int b = 0;
                    System.out.println("Before exception");
                    try {
                        int c = a / b;
                    } catch (ArithmeticException e) {                 // поймать
                        System.out.println(e.getMessage());
                    }
                    System.out.println("After exception");     //вы хотите проверить
                }
            }
            // GO TO ---------> AppPart3
