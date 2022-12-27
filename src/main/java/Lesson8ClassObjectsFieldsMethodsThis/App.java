        package Lesson8ClassObjectsFieldsMethodsThis;
        public class App {
            public static void main(String[] args) {
// 2)
        // здесь я создаю объект (object) person:
                Person david = new Person(); //дэвид это переменная //Person это класс который описывает объект
                david.name = "David";
                david.lastName = "Wilson";
                david.year = 1998;

// 3)
        // самое главное это волшебное слово new. в это время
                //выделяется память где будет храниться объект
                Person anna = new Person(); // "new" Creating memory
                anna.name = "Anna";
                anna.lastName = "Wilson";
                anna.year = 1999;
                System.out.println(david.lastName);
                // GO TO --------> Vehicle

// 5)
                Vehicle myCar = new Vehicle();
                myCar.color = "Pink";
                myCar.make = "Toyota";
                myCar.model = "Prius";

// 6)
                Vehicle myFriendsCar = new Vehicle();
                myFriendsCar.model = "6";
                myFriendsCar.make = "Mazda";
                myFriendsCar.color = "Silver";
                myFriendsCar.year = 2007;
                System.out.println(myFriendsCar.year);
                // GO TO --------> Vihicle


// 8)
                myCar.start();//обратите внимание буква "м" напротив старта это значит что метод
                myFriendsCar.start();

                myCar.beep();
                myFriendsCar.beep();
                //зависимости от того какой объек вызывает метод, beep будет различаться.
                //from the terminal:
                //ToyotaPrius started engine
                //Mazda6 started engine
                //Pink car made beep
                //Silver car made beep
                // GO TO --------> Person

//  10)
                anna.printInfo();
                //from terminal:
                //Name = Anna
                //last Name = Wilson
                //Year = 1999
                //Name = Anna
                //last Name = Wilson
                //Year = 1999

                // THE END
            }
        }
