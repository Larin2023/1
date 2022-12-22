            package Lesson13WrapperClasseCollectinsArrayListReferencePrimitives;

            import java.util.ArrayList;

            public class App2 {

                //wrapper for array is called "Array List"

                public static void main(String[] args) {
// 6)
                    ArrayList<String> colors = new ArrayList<String>();// arrays of strings

                    colors.add("Red"); //we are adding items (colors) to array
                    System.out.println(colors);
                    System.out.println("we are adding items (colors) to array");

                    colors.add("Red");
                    colors.add("Green");
                    System.out.println(colors);
                    System.out.println("6-we are adding items (colors) to array");

                    System.out.println(colors.get(2)); //we are getting colors from array
                    System.out.println("6-we are getting colors from array");

                    colors.add("Blue");
                    colors.add("Pink");
                    // так как
                    //arraylist он класс в нем уже встроен "string", метод который может красиво
                    //распечатать его System.out.println, нам не нужно используйте array
                    System.out.println(colors);
                    System.out.println("______________________________");


                    //получить текущие размер array list?
                    //есть место для определения размера который так и называется "size()".
                    //выведет на размер -- 5 элементов
                    System.out.println(colors.size());
                    System.out.println("получить текущие размер array list");

                    //  как нам поменять значения
                    colors.set(3,"Red");
                    System.out.println(colors);
                    System.out.println("поменять значения");

                    colors.add("Green");

                    //добавить в требуемое место
                    colors.add(  1,"Green");
                    System.out.println(colors);  //in "array list" we can add -- этом преимущество.
                    // just "arrays" так не могут
                    System.out.println("добавить в требуемое место");

// 6a)
                    // we can add array to array
                    ArrayList<String>subcolors = new ArrayList<>();
                    subcolors.add("Cyan");
                    subcolors.add("Magenta");
                    colors.addAll(subcolors);
                    System.out.println(colors.size());
                    System.out.println("add array to array");

// 7)
                    // операция "добавить" - "add",
                    //  операция "set" это мы изменяем существующей, get мы получаем.
                    //  интересно что делает "set" дело в том что если вот у меня 0 Red,
                    //  я его сейчас хочу другим цветом сделать.
                    //  "colors.set(0,"Brown");"

                    // AND если я хочу сохранить тот элемент который раньше был я его могу поставить "oldValue" after string.
                    String oldValue = colors.set(0,"Brown");
                    System.out.println(oldValue);
                    //я Red окончательно не потеряли могу его сохранить в oldValue
                    System.out.println("сохранить тот элемент который раньше был в oldValue");
                    System.out.println(colors); // "Brown" become 0
                    System.out.println("7______________________________________");

// 8)
                    // хочу удалить index 1 (Green)
                    oldValue = colors.remove(1);
                    System.out.println(oldValue);
                    System.out.println(colors);

                    colors.remove("Green");  ///удаляется только 1 удаляется.  удаляется только первый.
                    System.out.println(colors);
                    System.out.println("8________удалить index 1 (Green)____________");

// 9)
                    // самая главная вещь это Итерация.
                    //Итерация точно такая же как with array:
                    // тип итерации это по for each:
                    for (String color: colors){
                        System.out.println(color);
                    }
                    System.out.println("________for each_________");

                    // второй тип итерации это по индексу
                    for (int i=0; i<colors.size();i++){
                        System.out.println(colors.get(i));
                    }
                    System.out.println("9_______по индексу_________");
                }
            }
            // GO TO ---------> App3