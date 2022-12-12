package Lesson12aInterfacePolymorphism;

    // 2)
    public class MyPrinter implements IAmericanElectricalPlug{
    // 5)
    private String brand;
    private String model;

    public MyPrinter(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void print(String xx) {
        System.out.println(brand + " " + model + " " + xx);
    }

    // 3)
    @Override
    public void americanPlug() {
        //4) I give them a real body
        System.out.println("I keep standard and can be used in theUSA");
    }

    @Override
    public int returnVoltage() {
        return 12;

        // 6) мы можем extended только один класс,
        //имплементировать мы можем многое интерфейсов

        //интерфейс имеет абстрактные функции
        //класс который имплементир интерфейс
        //должен дать реальные тела всем абстрактным функциям

        //интерфейс это такая структура java,
        //которая имеет только абстрактные функции.

        // что такое абстрактная функция эта
        //функция у которой нету тела

        //у нее есть вот она возвращаемый тип название и список аргументов

        //если метод хочет имплементировать интерфейс я должен дать реальные тела

        //web драйвер от интерфейс

        //интерфейс это скопище абстрактных абстрактных методов
    }

    @Override
    public int innerVoltage() {
        return 0;
    }
}