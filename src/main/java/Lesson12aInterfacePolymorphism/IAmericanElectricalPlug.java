            package Lesson12aInterfacePolymorphism;

            public interface IAmericanElectricalPlug {
// 1)
                // what the abstract class does as a whole
                // is kind of enforce and organize exactly what
                //every subclass of animal has to have,
                // For example: this animal class is saying "Hey! if you
                //want to create a new type of animal, it's
                //going to have an age, it's going to have
                //a name, and it has to be able to make noise.

                //difference between interface and abstract class:
                // - is that you can implement as
                //many interfaces as you want in java
                //there's no limit, but you can only extend one class.
                // - in interfaces if you declare any fields
                // inside an interface they are going to be static and
                // that means the same values apply to every
                //object in that class.

                // в интерфейсах есть только абстрактные методы.
                //https://www.youtube.com/watch?v=HvPlEJ3LHgE
                //абстрактные методы это метод у которого нету тело.

                // abstract class is a class you can't create objects from, but you can
                //absolutely make subclasses from
                //abstract class and create objects.

                //you don't need an abstract keyword in your methods every
                //method in an interface is assumed to be abstract. So you don't need this keyword.
                void americanPlug();
                int returnVoltage();

                int innerVoltage();
            }
            // GO TO --------> MyPrinter

