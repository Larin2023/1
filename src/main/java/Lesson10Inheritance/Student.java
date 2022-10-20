package Lesson10Inheritance;

public class Student extends Person {
    //    private String name;
//private int year;
    private Subject major;


    private Subject[] subjects;

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public Student(String name, String lastName, int year, Subject major) {
//        this.name = name;
//        this.lastName = lastName;
//        this.year = year; /// we can sent these to super (name,lastName, year);
        super(name, lastName, year);
        this.major = major;
    }
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