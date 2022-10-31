package pageObjectsTestsLesson11;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;


public class LoginToAppLesson11 extends BaseTestLesson11 {
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        loginPage.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());
    }
}