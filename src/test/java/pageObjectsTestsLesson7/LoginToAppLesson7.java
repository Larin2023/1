package pageObjectsTestsLesson7;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjectsLesson7.LoginPageLesson7;
import pageObjectsLesson7.MainPage;

public class LoginToAppLesson7 {
    // 15)
    private WebDriver driver; //надо сделать WebDriver глобальным
    //18)
    @BeforeMethod
    public void starUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        System.out.println("In the after method - > Driver will be killed soon");
        driver.quit();
    }

    ///мы не делаем нахождение трех элементов
    //у меня все прописанно в pageObject.
    // в старом случае мне пришлось бы ходить и менять.
    // теперь я иду в нашу функцию логина,меняю в одном месте.
    // это большое преимущество менять в одном месте.
    //я меняю локаторы где в getter один раз !!!
    // второе преимущество теперь наш тест не содержит вообще никакого selenium
    //в наших тестах остался чистота testng
    // all selemium lives in pageobjects

    //17)
    ///////// POSITIVE TEST//
    @Test
    //тест состоит из 3 частей(здесь мы используем снейк кейс:
    //1. loginToApp. (название тестова класса)
    //2. correctCredentials (что я использую)
    //3. successfulLogin (expected result)
    public void loginToApp_correctCredentials_successfulLogin(){
        LoginPageLesson7 loginPageLesson7 = new LoginPageLesson7(driver);
        loginPageLesson7.open(); //это нам должно открыть страницу
        // я должен послать username и password

        //22)
        MainPage mainPage = loginPageLesson7.loginToAppLesson7("alexander.v.anderson@gmail.com", "te$t$tudent");
        //мне надо доказать что это main page

        //23)
        Assert.assertTrue(mainPage.isMain()); //то есть mainPage вернет boolean
    }

    ///////// 26) NEGATIVE TEST
    @Test
    public void loginToApp_incorrectCredentials_failedLogin(){
        LoginPageLesson7 loginPage = new LoginPageLesson7(driver);
        loginPage.open();
        loginPage.loginToApp("alexander.v.anderson@gmail.com", "wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
