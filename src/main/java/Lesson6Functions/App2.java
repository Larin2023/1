package Lesson6Functions;

//  array может возвращать array

//создадим такую функцию которая будет
//брать array, а возвращать array из четных
//чисел которые были в первом array

public class App2 {public static void main(String[] args) {
    // 5)
    int[]arr1 = {1,3,4,4,6,7,8,8,0};  //я создал array,
    int[]res = getEven(arr1);   // я его подал в функцию get even   //res= result
    // эта функция возвращает мне тоже array of int(res)

    for (int v:res) { // iteration // я его итерирую
        System.out.println(v); //я предполагаю что у меня сейчас печатаются все четные
    }

    // 6) если у нас одно число:
    int[] arr2={5}; // Odd number
    res = getEven(arr2);
    for (int v:res){
        System.out.println(v);
    }
}
    // 3)  Give array and get array with Even numbers
    public static int[]getEven(int []a){
        int size=0;
        for (int number:a){
            if (number%2==0) {
                ++size;  //size+=1; // size++ / size=size+1
            }
        }
        // 4) небольшие сложности, потому что мы должны посчитать сколько у нас
        //четных чисел, допустим у нас будет 5 четных чисел потом мы должны создать
        //array именно этого размера - 5.
        // мы заранее не знаем сколько будет четных чисел,
        // поэтому нам надо нагонять цикл два раза.

        //когда я первый раз прошелся, я знаю сколько у меня четных чисел.
        //теперь я создаю новый array именно этого размера:
        int i=0;
        int[]evens=new int[size];
        for (int number : a){
            if (number%2==0) {
                evens[i++] = number; // if you put "++i" it would increase the element by 1 before the operation
                //здесь я имеет значение где стоит плюс плюс
            }
        }
        return evens;
    }
}