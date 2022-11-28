package Lesson8ClassObjectsFieldsMethodsThis;


public class Person {
    // 1) Person это класс который описывает объект. (класс это чертеж)
    //описание какого-то объекта:
    public String name;
    public String lastName;
    public int year;
    //теперь давайте создадим этот объект. окей я иду в App


    // 9)
    public void printInfo(){      // "\n" moving text to the next line
        System.out.println("Name = "+name+"\nlast Name = "+lastName+"\nYear = "+year);
        // "this" means this variable belongs to my class
        System.out.println("Name = "+this.name+"\nlast Name = "+this.lastName+"\nYear = "+this.year);
        //"this" говорит что эта переменная "lastName" принадлежит этому классу

    }
}