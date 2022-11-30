package Lesson11Composition;

public class App {
    public static void main(String[] args) {

                                                                                     //1)
        // string это тоже класс
        String str = "Hello";
        String str1 = new String("Hello");

                                                                                    // 10)
        // Devid's address
        Address davidAddress = new Address ("12 Elm st", "Gotham city", State.NY, "10018");
        Person david = new Person(davidAddress,"David", "Attenboro", 1949 ); //вот я создал дэвида

                                                                                    // 11)
        // pull out Devid's address
        String streetAddressOfDavid = david.getAddress().getAddressLine1();
        System.out.println(streetAddressOfDavid);
        //мы делаем Chain цепочку. цепочка of getters. то есть когда мы write getaddress
        // мы вытаскиваем переменную типа address.
        //теперь нам из адреса надо вытащить адрес line 1. я делаю getAddressLine1

                                                                                    // 15)
        House house = new House (davidAddress,david,3,2,2020); //мы создали house

                                                                                     // 16)
        streetAddressOfDavid = house.getOwner().getAddress().getAddressLine1();
        //я хочу вытащить address из этого дома, а ну конечно я могу сразу напрямую адрес вытащить но я
        //допустим хочу вытащить через person:
        // streetAddressOfDavid = house.getOwner() --- у него возвращаемый тип person.
        //вот этот объект "house.getOwner()" целиком is person
        //streetAddressOfDavid = house.getOwner().getAddress() -- теперь вот у этой всей мешанины тип Address
        //streetAddressOfDavid = house.getOwner().getAddress().getAddressLine1(); --- теперь вот у этой всей мешанины тип String
        //вот такая вот взаимодействие классов называется "композицией"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //B настоящей жизни предметы состоят из других предметов.
        //"string" это тоже класс и мы с этим уже давно работаем.
        //такая вот такую взаимодействие классов называется "композицией".
        //то есть объекты создают из других объектов это нормально.
        //вы покупаете холодильник он состоит из корпусa, есть двери у него есть лампочки,
        // это все "объекты". объекты состоят из других объектов.

                                                                                         // 17)
        String zip = house.getAddress().getZip();
        zip = ((house.getOwner()).getAddress()).getZip();
        //каждый getter имеет
        //свой возвращаемый тип. то есть я как капусту его по листочку снимаю в конце у
        //меня кочерыжка string. каждый раз он другой объект превращается

                                                                                            // 18)
        // break it down by parts "композицией"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Person x = house.getOwner(); // this is a person
        Address y = x.getAddress();
        String z = y.getAddressLine1(); // эта цепочка сделано в one
    }
}

