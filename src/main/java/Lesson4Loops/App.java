package Lesson4Loops;

public class App {

    public static void main(String[] args) {
        //LOOPS

        //в программировании нам надо повторить какую-то операцию определенное количество раз два раза 5 раз сто раз
        //как это сделать? например я должен вывести запись хай fife раза:
        //    System.out.println("Hey");
        //    System.out.println("Hey");
        //    System.out.println("Hey");
        //    System.out.println("Hey");
        //    System.out.println("Hey");
        //   главных основополагающих принципов программирования код должен быть драй
        // DRY - Do not repeat yourself
        // WET - write everything twice
        //раз я использовал копипаст мне надо этo менять в пяти разных местах
        //это понимаете
        //достаточно трудоемко поддерживать не сухой код становится труднее/
        // We use LOOPS
        // по-русски они назвались циклы.

// Loop FOR (with HEY):
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println("Hey");
        }
        //оператор = For:
        // 3 части
        //первое это инициализация int i = 0;
        // 2oe это условие i < 5   //  //условие (LOOP) выполняется пока это условие "true"
        // третье это итератор i = i + 1.


        //инициализация работает только один раз
        //когда мы заходим в циклы

        //и спрашиваем 5 меньше 5 = not это false и мы выходим from LOOP.
        //если true мы заходим in loop, если нет мы из него выходим.
        System.out.println("-------------------------------------");

// Loop FOR (with +i):
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println("Hi " + i);
        }
        System.out.println("-------------------------------------");




// Loop FOR (i++ the same as i=i+1):
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi " + i);
        }
        System.out.println("-------------------------------------");



        //все четные числа от 10 до 40
// "Even numbers" with loop FOR:
        for (int i = 10; i <= 40; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");


        //от 10 до 1
// Count down with loop FOR using "i--":
        // 0 не хотим включать:   i>0
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");


// Loop WHILE:
//        boolean xx = true;
//        while (xx) {
//            System.out.println("Hi");
//            xx = false;
//        }

        // Loop "DO WHILE":
        boolean xx = true;
        xx = false;
        do {
            System.out.println("hi");
        } while (xx);
        System.out.println("-------------------------------------");



        // loops working with Arrays to print all elements:
        int[] numbers = {2, 2, 3, 4, 2, 7, 8, 3000, 4, 6, 7, 3, 6, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("-------------------------------------");



        //последний элемент = nameofinteger.length  минус единицa
        // nameofinteger.length = the quantity of elements in Array

//        String[] colors = {"Red", "Red", "Blue", "Green"};
//        for (int i = 0; i < 4; i++) {
//            System.out.println(colors[i]);
//        }

        // "итерация" это когда вы чтото повторяете

        // print in reverse
        String[] fruits = {"Apple", "Apple", "Apple", "Mango", "Orange", "Tangerine"};
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }
        System.out.println("-------------------------------------");



        //есть всегда вероятность что вы выйдете из array.
        //поэтому специально для array придумали loop который называется "For Each"
// "FOR EACH" loop works only with arrays and works only on one direction:
        for (String v : fruits) {  //  в правой стороне после двоеточия вы put какой-то array
//            которую вы хотите пройти. что значит пройти? он говорит вот этой переменной "V"
//            я из Array "fruits"  по очереди
//            буду давать его значение. на каждой итерации я буду брать следующее значение.
//            то есть на 1 итерации он возьмет 1 знач., на второй итерации он возьмет
//            второе, на треть и 3 на 4 на 5.  с начала идя до конца.
//            !!!!!по очереди всегда в одном направлении!!!!
//            он не может идти как for вперед назад он может идти только в
//            одном направлении.
            System.out.println(v);
        }
        System.out.println("-------------------------------------");




        String[] colors = {"Red", "Red", "Blue", "Green"};
        for (String color : colors) {
            System.out.println(color);
        }
//            с правой стороны мы пишем это и которым мы хотим пройти с
//            левой стороны мы пишем переменную того типа.
//            если у нас colors это array из стрингов значит переменная будет string потому что мы получили вот
//            в эту переменную color я ее назову color
        System.out.println("-------------------------------------");


        // "modulus" operator returns the remainder of the two numbers after division:
        // int[] numbers = {2, 2, 3, 4, 2, 7, 8,3000, 4, 6, 7, 3, 6, 3};
        System.out.println(5 % 2);  // получается 2. и 1 в остатке
        System.out.println(20 % 2); //если 10 разделить на 2 получится 0
        //индексы здесь на for each и не нужны
        System.out.println("-------------------------------------");


        // to print only Even numbers with "FOR EACH"
        int[] numbers1 = {2, 2, 3, 4, 2, 7, 8, 3000, -1, 4, 6, 7, 3, 6, 3};
        for (int v1 : numbers1) {
            if (v1 % 2 == 0) {
                System.out.println(v1);
            }
        }
        System.out.println("-------------------------------------");


        // to print only NOT Even numbers with "FOR EACH"
        int[] numbers2 = {2, 2, 3, 4, 2, 7, 8, 3000, -1, 4, 6, 7, 3, 6, 3};
        for (int v2 : numbers2) {
            if (v2 % 2 == 1 || v2 % 2 == -1) {
                System.out.println(v2);
            }
        }
        System.out.println("-------------------------------------");


        // to print the MAX number using LOOP:
        //я его хочу найти максимальное число в этом ARRAY.
        //надо сравнивать с чем-то.
        //здесь идет название игра "король горы" кто самый большой у нас.
        //мы будем сравнивать с нулевым элементом ARRAY.
        //теперь мы начинаем сравнивать.
        //если V больше чем Max то у нас новый король горы.
        //теперь Max = V
        int[] numbers4 = {2, 2, 3, 4, 2, 7, 8, 3000, 4, 6, 7, 3, 6, 3};
        int max = numbers4[0]; //надо сравнивать с чем-то. //то есть в самом начале времен, самый большой это
        //нулевой элемент.
        for (int v : numbers4) {
            if (v > max) {  //если это правда то:
                        max = v;
            }
        }
        System.out.println(max);
        //начале времен макс равняется двум.
        // потом я захожу in Loop, и по очереди начинают проверять:
        // два больше 2 - false
        // два больше 2 - false
        // 3 больше двух - yes.
        // значит макс равняется теперь.
        // трем идем дальше
        //... теперь у нас новые герои - 3000. мы остановились.
        System.out.println("-------------------------------------");



        // to print the MIN number:
        int min = numbers[0];
        for (int v : numbers) {
            if (v < min) {
                min = v;
            }
        }
        System.out.println(min);
        System.out.println("-------------------------------------");


//Home Work
//выведите на экран индексы всех чисел где десятка(10)
        int[] numbers8 = {2, 2, 3, 10, 4, 10, 2, 7, 8, 3000, 4, 6, 7, 3, 6, 3};
        int index = 0;  //она сделала искусственный индекс
        for (int v5 : numbers8) {
            if (v5 == 10) {
                System.out.println(index);
            }
            index++;
        }
    }
}


