package Lesson12bInterfacePolymorphism;
    // 25)
public class Square extends Rectangle{
    // 26)
    public Square(double length) { // у квадрата все стороны равны значит мне не нужно вводить "double wide"
        super(length, length); //но конструктор супер-класса требует два параметра,
        // я отправляю что длина равняется ширине
    }
    // 27)
        // @Override
    public void draw(){
        System.out.println("I draw Square with side = "+length); //32

        // "overnight" я переписал метод в родительском классе
    }
}
