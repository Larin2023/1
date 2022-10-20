package Lesson12aInterfacePolymorphism;

public interface IAmericanElectricalPlug {
    // 1) в интерфейсах есть только абстрактные методы.
    //абстрактные методы это метод у которого нету тело
    void americanPlug();
    int returnVoltage();

    int innerVoltage();
}
