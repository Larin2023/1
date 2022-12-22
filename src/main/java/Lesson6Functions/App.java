        package Lesson6Functions;

        public class App {
// 2)
            public static void main(String[] args) {
                int [] arrr1 = {1,4,1,-10,3,22,55,7,-90};
                int [] arrr2 = {9};
                int [] arrr3 = {-3,-6};

                int maxxx1 = MMM(arrr1);
                int maxxx2 = MMM(arrr2);
                int maxxx3 = MMM(arrr3);

                System.out.println("m1= " +maxxx1+", m2= "+maxxx2+", m3 = "+maxxx3);
                //Result:
                //m1 = 55, m2 = 9, m3 = -3

                //мы прогнали три разных use case
                //котором а разные числа, в котором только одно число, и в котором отрицательные.

                //я могу подавать в качестве параметра подавать array

            }
// 1)
            // Function (Method) that would calculate max numbers in arrays
            public static int MMM(int[]arrr){
                int mmmax = arrr[0]; //мы с вами договорились чтo мы будем вначале брать from array нулевое число и приравнивать его to максу
                for (int nnumber :arrr){
                    if (nnumber>mmmax){
                        mmmax=nnumber;
                    }
                }
                return mmmax;
            }
        }
        //вот эта функция она вычисляет
        // мне ее не надо писать 3 раза,я ее переиспользую.
        // я в нее подаю какой-то array of integers и она мне должна считать максимальное число в array

        /////////////////

        //скобы - это где переменная видна.
        // она видна в своем блоке ограничен колибейсами
        //она видна во всех блоках кода нежин, но она не видно
        //высше и в параллельно

