package unitTestingLesson11;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tickets.Tickets;


public class UnitTestDataProviderLesson11 {

    // 12) можно сделать тест 1. для этого мы будем использовать дата провайдер
    @DataProvider (name = "tickets")
    public Object[][] getData(){
        return new Object[][]{ // Object это папа всех классов в джаве
                //четыре тест кейса
                {1,0.0,1000},
                {5,500.0,1000},
                {19,1000.0,1000},
                {68,800.0,1000}
        };
        //этот тест запустился четыре раза с разными параметрами
    }
    @Test (dataProvider = "tickets")
    public void ticketsTest_all_depends(int age, double price, int fare){
        Tickets adult = new Tickets(age, fare);
        double result = adult.getPrice();
        Assert.assertEquals(result,price);
    }
}
