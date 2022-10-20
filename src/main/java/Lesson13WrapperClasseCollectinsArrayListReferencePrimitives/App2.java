package Lesson13WrapperClasseCollectinsArrayListReferencePrimitives;

import java.util.ArrayList;

public class App2 {

    //wrapper for array is called "Array List"

    public static void main(String[] args) {
        // 6)
        ArrayList<String> colors = new ArrayList<String>();// arrays of strings

        colors.add("Red"); //we are adding colors to array
        System.out.println(colors);
        colors.add("Red");
        colors.add("Green");
        System.out.println(colors);

        System.out.println(colors.get(2)); //we are getting colors from array

        colors.add("Blue");
        colors.add("Pink");
        // так как
        //arraylist он класс в нем уже встроен "string", метод который может красиво
        //распечатать его System.out.println, нам не нужно используйте array
        System.out.println(colors);

        //получить текущие размер array list?
        //есть место для определения размера который так и называется "size()".
        //выведет на размер -- 5 элементов
        System.out.println(colors.size());

        //  как нам поменять значения
        colors.set(3,"Red");
        System.out.println(colors);

        colors.add("Green");

        //добавить в требуемое место
        colors.add(  1,"Green");
        System.out.println(colors);  //in "array list" we can add -- этом преимущество.
        // just "arrays" так не могут

        // 6)
        // we can add array to array
        ArrayList<String>subcolors = new ArrayList<>();
        subcolors.add("Cyan");
        subcolors.add("Magenta");

        //операция set это мы изменяем существующей, get мы получаем
        colors.addAll(subcolors);
        System.out.println(colors.size());

        // 7)
        //если я хочу сохранить тот элемент который раньше был я его могу поставить "oldValue" after string.
        // то есть я его не выкину, его окончательно не потеряли могу его сохранить.
        //то есть даже когда я делаю set я могу его конечно потерять
        String oldValue = colors.set(0,"Brown");
        System.out.println(oldValue);

        // 8)
        System.out.println(colors);
        oldValue = colors.remove(1);
        System.out.println(oldValue);
        System.out.println(colors);


        colors.remove("Green");  ///удаляется только 1 удаляется
        System.out.println(colors);

        // 9)
        //операция точно такая же как with array:
        for (String color: colors){
            System.out.println(color);
        }

        for (int i=0; i<colors.size();i++){
            System.out.println(colors.get(i));
        }
    }
}