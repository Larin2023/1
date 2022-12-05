package Lesson13WrapperClasseCollectinsArrayListReferencePrimitives;

public class App1 {
    public static void main(String[] args) {

        //"Reference" type vs "Primitives"

                                                     // 2)
        int a = 5;
        int b = a;
        a = 10;
        System.out.println(b);
        //мы создаем новую переменную только при слове new.
        // мы выделяем новый кусок памяти когда мы говорим new.
        //если мы new не говорим новый кусок памяти не выделяется
        //"=" он не создает копию, он создает ссылку reference
        System.out.println("2-----------------------------------------------------");

                                                     // 4)
        Person p1 = new Person ("Anna");
        Person p2 = p1;

        p1.setName("Vika");
        System.out.println(p2.getName());
        System.out.println("4-----------------------------------------------------");

                                                     // 5)
        // все классы они reference
        // array the same
        int[]arr = {1,2,3};
        int[]brr = arr;  //я не создаю новую копию, я делаю ссылку на старую
        arr[0]=100;
        System.out.println(brr[0]);
        System.out.println("5-----------------------------------------------------");


        //единственный кто создает hard копия настоящую копию это "примитивы". все ослиным референсного типа.
        //единственный кто создает
        //hard копия настоящую копию это примитивыю.
        //все классы которые мы создаём: person, машина,
        // фрукты-овощи это все reference тип, оно не создает памяти
        //пока мы не используем волшебное слово "new".
    }
}