            package Lesson10Inheritance;

// 6)
                // create the class
// 19)
                // сейчас я сделаю Teacher детским классом по отношению k Person.
                //"extends Person{"
                public class Teacher  extends Person{
// 20)
                //    эти поля не нужны потому что я буду пользоваться их из персона
                //    private String name;
                //    private String lastName;
                //    private int year;
                private Subject subject;

// 7)
                // create a constructor
                public Teacher(String name, String lastName, int year, Subject subject) {
// 21)
                // эти поля не нужны потому что я буду пользоваться их из персона
                //        this.name = name;
                //        this.lastName = lastName;
                //        this.year = year;
// 22)
                // я вызову конструктор родительского класса
                    super(name,lastName,year);
                    this.subject = subject;
                }
// 8)
                // create a bunch of getters and setters
// 23)
                // getters and setters ненужны
                //    public String getName() {
                //        return name;
                //    }
                //
                //    public void setName(String name) {
                //        this.name = name;
                //    }
                    public String getLastName() {
                        return lastName;
                    }
                //
                //    public void setLastName(String lastName) {
                //        this.lastName = lastName;
                //    }
                //
                //    public int getYear() {
                //        return year;
                //    }
                //
                //    public void setYear(int year) {
                //        this.year = year;
                //    }
                //
                public Subject getSubject() {
                    return subject;
                }

                public void setSubject(Subject subject) {
                    this.subject = subject;
                }
            }
            // GO TO -------------> Student
//9)
            // inhabitants нам позволяет сделать наш код более сухими.

            //я хочу сделать класс person родительским классом,
            // по отношению студента и преподавателя.
            // GO TO ----------------> Person

