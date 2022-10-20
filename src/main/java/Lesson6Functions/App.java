package Lesson6Functions;

public class App {
     // 2)
    public static void main(String[] args) {
        int [] arr1 = {1,4,1,-10,3,22,55,7,-90};
        int [] arr2 = {9};
        int [] arr3 = {-3,-6};

        int max1 = max(arr1);
        int max2 = max(arr2);
        int max3 = max(arr3);

        System.out.println("m1= " +max1+", m2= "+max2+", m3 = "+max3);
        //Result:
        //m1 = 55, m2 = 9, m3 = -3

        //мы прогнали три разных use case
        //котором а разные числа, в котором только одно число, и в котором отрицательные.

        //я могу подавать в качестве параметра подавать array

    }
    // 1) Function (Method) that would calculate max numbers in arrays
    public static int max(int[]arr){     //мы с вами договорились чтo мы будем вначале брать from array нулевое число и приравнивать его to максу
        int max = arr[0];
        for (int number :arr){
            if (number>max){
                max=number;
            }
        }
        return max;
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

