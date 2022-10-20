package Lesson11Composition;

public class App {
    public static void main(String[] args) {

        //1) string это тоже класс
        String str = "Hello";
        String str1 = new String("Hello");

        // 10) Devid's address
        Address davidAddress = new Address ("12 Elm st", "Gotham city", State.NY, "10018");
        Person david = new Person(davidAddress,"David", "Attenboro", 1949 );

        // 11) pull out Devid's address
        String streetAddressOfDavid = david.getAddress().getAddressLine1();
        System.out.println(streetAddressOfDavid);
        //мы делаем Chain цепочку цепочка гектаров. то есть когда мы делаем
        //get.address мы вытаскиваем переменную типа address.
        //теперь нам из адреса надо вытащить адрес line 1. я делаю getAddressLine1

        // 15)
        House house = new House (davidAddress,david,3,2,2020);
        //я хочу вытащить из этого дома, а ну конечно я могу сразу напрямую адрес вытащить но я
        //допустим хочу вытащить через person

        // 16)
        streetAddressOfDavid = house.getOwner().getAddress().getAddressLine1();
        //вот такая вот взаимодействие классов называется "композицией"!!!!!!!!!!!!!!!!!!!!

        // 17)
        String zip = house.getAddress().getZip();
        zip = ((house.getOwner()).getAddress()).getZip();
        //каждый getter имеет
        //свой возвращаемый тип. то есть я как капусту его по листочку снимаю в конце у
        //меня кочерыжка string. каждый раз он другой объект превращается

        // 18) break it down by parts
        Person x = house.getOwner();
        Address y = x.getAddress();
        String z = y.getAddressLine1();
    }
}

