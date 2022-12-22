            package Lesson9EncapsulationGettersSettersConstructors;
            public class Person {

// 1)
                private String name;
                private String lastName;
                private int year;
                //правил инкапсуляции (security) говорит что поля класса не видно снаружи.
                // для этого мы помечаем их как private i.e You won't see them in AppLesson1 OBJECTS

                // But how do we get the access?
                //доступ к полям класса происходит через методы. то есть чтобы
                //дать значение полю, нам надо сделать
                //специальный метод. мы называем его сеттер
                //SETTER
                // access to Class Fields (to give definition) go through methods
                public void setName(String n)  {
                    name = n;
                }
                //если я хочу получить не имя мне надо
                //использовать другой специальный метод который называется:
                // GETTER
                public String getName() {
                    return name;
                }
                // Setter and Getter help to filter whatever we are typing
                ////////////////////////////////////////
                // GO TO --------> App


// 3)
                //int говорит что может быть любое число от минус 2 миллиардов до плюс 2 миллиардов
                //что не имеет значения в контексте года рождения.
                // если я сделаю -25 он сюда установится но это будет не правильно.
                //давайте я сделаю сеттер для year:
            //    public void setYear(int y){
            //        year = y;
            //    }
            //    public int getYear(){
            //        return year;
            //     }
                // GO TO --------> App

// 5)
            // я не могу так делать больше.
                //надо проверить это число перед тем как мы его сохраним перед тем как мы сделаем сет.
                // то есть установим нашу переменную.
                public void setYear(int y) {
                    if(y>2021 || y<1900){
                        throw new IllegalArgumentException("Wrong year");
                    }
                    year = y;
                }
                public int getYear() {
                    return year;


// 6)
                    // Using Getter with "This":
                    //public void setYear(int y) {
                    //        if(year>2021 || year<1900){
                    //            throw new IllegalArgumentException("Wrong year");
                    //        }
                    //        this.year = year;
                    //    }
                    // GO TO --------> Vehicle
                }
            }

