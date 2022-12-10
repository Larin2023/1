package unitTestingLesson1;

import org.testng.Assert;
import org.testng.annotations.Test;
import ticketsLesson1.TicketsLesson1;

        // 3
//testng позволяет нам писать аннотации "@Test"

//правила:
// я пишу юнит-тесты не классу,
// я опишу и не тесты всегда к функции.
// то есть я пишу unit-тест для метода не для класса.
// юнит-тесты пишутся для методов.
// юнит-тесты пишется для public методов.
// мы тестируем только один метод за раз.
// мы не можем тестировать несколько мы тестируем один метод
public class UnitTestLesson1 {
    @Test //testng позволяет нам писать аннотации, //нам отвечает за запуск из-за assert.

    //convention гласит, название теста вы делите на 3 части
    // первая часть это то что вы тестируете
    // я тестирую "ticketsTest"
    // второе это чем вы тестируетею я тестирую "infant"
    // третье это мой expected result "priceIsZero"
    //я ожидаю что цена будет 0.
    public void ticketsTest_infant_priceIsZero(){
        // Arrange - Given
        TicketsLesson1 infant = new TicketsLesson1(1,1000); //это я сделал начальный объект

        // Act - When
        double result = infant.getPrice(); //я делаю сколько стоит

        // Assert - Then
        Assert.assertEquals(result, 0.0); //я должен сравнить actual and expected resul я ожидаю что цена будет 0.
    }
    //Assert.assertEquals(result, 0.0) - это статическая функция куда я подаю два аргумента
    // два параметра и засовываю in assertEquals. assertEquals просто тупо их сравниваетю
    // и нам не надо создавать объект потому что это статическая функция

    //видите в левом нижнем углу написано что он прошел но нам надо знать, а работает ли наш тест,
    //и чтобы это проверить мы должны сделать так чтобы наш тест упал,
    // это называется "красная зона"

    @Test
    public void ticketsTest_child_priceIs50percent(){
        TicketsLesson1 child = new TicketsLesson1(8, 1000);
        double result = child.getPrice();
        Assert.assertEquals(result, 500.0);
    }
    @Test
    public void ticketsTest_adult_fullPrice(){
        TicketsLesson1 adult = new TicketsLesson1(18, 1000);
        double result = adult.getPrice();
        Assert.assertEquals(result,1000.0);
    }
    @Test
    public void ticketsTest_senior_priceIs80percent(){
        TicketsLesson1 senior = new TicketsLesson1(78, 1000);
        double result = senior.getPrice();
        Assert.assertEquals(result,800.0);
    }
}
// Selenium это библиотека. selenium вам дает возможность работы с браузером,
//управлять браузером.
//Selenium переводит команды Java в команды браузера.
// то есть управлять браузером можно при помощи Selenium.
// Tо есть наших Java сможет управлять
//браузером подключив selenium.