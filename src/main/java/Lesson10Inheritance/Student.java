            package Lesson10Inheritance;
// 11)
            // я должен сказать что
            //студент extended класс Person
            public class Student extends Person {
// 12)
            // we delete these lines to make the code dry.
            // these lines will be extended from Person class.
            // And leave only "private Subject major;"
// 13)
            //   когда я вызвал конструктор студента:
            //   я сюда передал имя name, lastName, year.
            //   передал в конструктор родительского класса Person.
            //   по сути мы используем person.
            //   мы просто расширили person, волшебное слово extends.

// 1)
            //  private String lastName;
            //  private int year;
            // GO TO ---------------->  Subject
// 3)
                private Subject major;

// 24)
            // "массив констант"
            // наш студент помимо major у него 4-5 предметов изучать
            // соответственно это будет какой-то Array of Subjects
                private Subject[] subjects;
// 25)
            // я сделаю для этого subjects:  setSubjects and getSubjects
                public void setSubjects(Subject[] subjects) {
                    this.subjects = subjects;
                }
                public Subject[] getSubjects() {
                    return subjects;
                }
            // GO TO -------------> App


// 4)
            // make a constructor
                public Student(String name, String lastName, int year, Subject major) {
// 14)
            // я могу вот эти три вещи отправляют
            // в конструктор родительского
            // класса конструктор супер-класса
            //        this.name = name;
            //        this.lastName = lastName;
            //        this.year = year; /// we can sent these to super (name,lastName, year);
                    super(name, lastName, year); //когда я говорю слово "супер" я отправляю туда name, lastName, year
                    this.major = major;
                }
// 15)
            // я удалю: setName, getName, getLastName, setLastName,
            // getYear, setYear. I don't need all of these потому что я буду
            //пользоваться setters and getters из родительского класса
            // with "super" method
            // GO TO -------------------> App

// 5)
            // create lots of getters and setters
            //public void setName(String name) {
            //        this.name = name;
            //        }
            //public String getName() {
            //        return name.toUpperCase();
            //        }
            //
            //public String getLastName() {
            //        return lastName;
            //        }
            //
            //public void setLastName(String lastName) {
            //        this.lastName = lastName;
            //        }

            //public int getYear() {
            //        return year;
            //        }
            //
            //public void setYear(int year) {
            //        this.year = year;
            //        }    ////////////////////I don't need all of these потому что я буду
            //пользоваться setters and getters из родительского класса

                public Subject getMajor() {
                    return major;
                }
                public void setMajor(Subject major) {
                    this.major = major;
                }
                public boolean getLastName() {
                    return false;
                }
            }
            // GO TO ---------------->   Teacher
