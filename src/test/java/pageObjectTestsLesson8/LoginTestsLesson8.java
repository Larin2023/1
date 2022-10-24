package pageObjectTestsLesson8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;


public class LoginTestsLesson8 {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp("alexander.v.anderson@gmail.com","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginToApp("alexander.v.anderson@gmail.com","wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());

    }
}