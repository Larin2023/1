        package Lesson6Functions;
// 8)
        // casting это когда мы переводим один пункт переменных в другую

        public class App4 {
            public static void main(String[] args) {
                int x = 7;//проблем нету,но если вы хоть захотите сделать наоборот. у нас проблема:
                // int z = y;   нельзя энту дать значения дабл. надо применить операцию кастинга.
                //нужно выкинуть дробную частью
                ////////////////////////////////////
                System.out.println("x="+x);
                double y = x;
                y+=0.2;
                System.out.println("y="+y);

                int z =(int)y;  // <----------------------------------CASTING
                System.out.println("z="+z);

            }
            // CASTING
            // When you want give "int" the id of "double"
            // the drobnaya part is going away
            //"int z =(int)y;"
            // Casting is not working every time
        }




        //идея катенька очень простая допустим у нас есть переменная int x равняется ну
        //допустим 5 7 если я захочу сделать дабл y равняется x
        //проблем нету то есть вы можете переменной типа дабл