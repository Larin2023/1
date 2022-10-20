package Lesson12aInterfacePolymorphism;

    // 9)
public class MyDesktopLight implements IAmericanElectricalPlug, IBulbE27 {

    @Override
    public void americanPlug() {
        System.out.println("Hi! I'm keeping correct size for plug");

    }

    @Override
    public int returnVoltage() {
        return 0;
    }

    @Override
    public int innerVoltage() {
        return 5;
    }

    @Override
    public void keepE27() {
        System.out.println("Yep -> Correct size");
    }
}

//
//    @Override
//    public void americanPlug() {
            // 10)
//        System.out.println("Hi! I'm keeping correct size for plug");
//
//    }
//
//    @Override
//    public int returnVoltage() {
//          // 11)
//          return 5;
//    }
//
//    @Override
//    public void keepE27() {
//        System.out.println("Yep -> Correct size");
//    }
//}