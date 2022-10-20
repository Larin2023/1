package tickets;

public class Tickets {

    // 1)

    //история такая, у нас есть авиакомпания, если пассажиру от 0 до 2 лет включительно,
// у него бесплатный ticket это infant.
// если пассажиру от 3 до 12 включительно лет, это child,
// у него 50 процентов.
// 13 и до 65 включительно это адалт, он платит полную цену.
// 66 и старший это сеньор он платит 80 процентов от цены билета.

    //мы создаем объект:
    private int age;
    private double basePrice;

    //теперь я создам конструктор который будет вот эти две вещи брать
    public Tickets(int age, double basePrice) {
        this.age = age;
        this.basePrice = basePrice;
    }
    //теперь я сделаю функцию get прайс
    // она  будет возвращать дабл значение.
    // это наш наша функция которая будет читать цену билета:
    public double getPrice(){
        if (age<=2){
            return 0;
        }
        if (age<13){
            return basePrice*0.5;
        }
        if (age>65){
            return basePrice*0.8;
        }
        return basePrice;
    }
}

//теперь нам надо написать функции unit-тест
