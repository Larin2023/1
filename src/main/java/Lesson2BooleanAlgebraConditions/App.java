package Lesson2BooleanAlgebraConditions;

public class App {
    public static void main(String[] args) {

//Boolean algebra

        int age = 10;

    // Condition
        boolean condition = age >=21;

        if(age>=21) {
            System.out.println("You can buy beer");
        } else {
            System.out.println("No beer for you");
        }
        System.out.println("END");


        boolean xx = true;
        boolean xx1 = false;

        // 5>10 = false
        // 5>2 = true
        // 5>-100 = true
        // 10 < 500 = true
        // 10 < 6 = false
        // 10 > 10 = false
        // 10 >= 10 true
        // 10 == 100 = false
        // 10 != 100 = true

        // > bigger
        // < less
        // >= bigger or equal
        // < smaller or equal
        // == equal
        // != equal

        // Boolean algebra
        // && - logical AND
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false
        // 1 * 1 = 1
        // 1 * 0 = 0
        // 0 * 1 = 0
        // 0 * 0 = 0

        // || - logical OR
        // true || true = true
        // true || false = true
        // false || true  = true
        // false || false = false
        // 1 + 1 = 1
        // 1 + 0 = 1
        // 0 + 1 = 1
        // 0 + 0 = 0

        //  ! - inversion
        // true = !false
        // false = !true

        // Examples:
        boolean a1 = 5>2;
        System.out.println("a1 ="+a1);
        boolean a2 = 5>5 || 9>2;
        System.out.println("a2 ="+a2);
        boolean a3 = (5==5) && (5==6);
        System.out.println("a3 ="+a3);
        boolean a4 = (5==5) && (5!=6);
        System.out.println("a4 ="+a4);

    }
}
