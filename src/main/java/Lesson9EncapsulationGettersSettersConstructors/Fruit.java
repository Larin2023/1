        package Lesson9EncapsulationGettersSettersConstructors;
        public class Fruit {
// 17)
            //я могу иметь много конструкторов. единственное отличие
            //если вы хотите иметь много конструкторов они должны подчиняться правилам overloading
            // their signature функции конструкторов должны быть разные. то есть
            //у них должны различаться
            //количества и типа аргументов. если у них не различается вы не сможете создавать

            //Let's create the full class
            private String name;
            public Fruit(String name){
                this.name = name;
            }
            public Fruit(){}
            public void setName(String name) {
                this.name = name;
            }
            public String getName(){
                return name;
            }
        }
        // GO TO --------> App1

