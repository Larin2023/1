package pageObjectsTestsLesson11;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.LoginPageFactory;
import pageObjectsLesson11.LoginPageFactoryLesson11;
import pageObjectsLesson11.MainPageLesson11;

public class LoginToAppFactoryLesson11 extends BaseTestLesson11 {
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened(){
        LoginPageFactoryLesson11 loginPageFactoryLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageFactoryLesson11.open(url);
        MainPageLesson11 mainPageLesson11 = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPageLesson11.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPageFactoryLesson11 loginPageFactoryLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageFactoryLesson11.open(url);
        loginPageFactoryLesson11.loginToApp(username,password);
        Assert.assertTrue(loginPageFactoryLesson11.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened1(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
        Assert.assertTrue(mainPageLesson11.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame1(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        loginPageLesson11.loginToApp(username,password);
        Assert.assertTrue(loginPageLesson11.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened2(){
        LoginPageFactoryLesson11 loginPage = new LoginPageFactoryLesson11(driver);
        loginPage.open(url);
        MainPageLesson11 mainPageLesson11 = loginPageLessin11.loginToAppLesson11(username,password);
        Assert.assertTrue(mainPageLesson11.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame2(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        loginPageLesson11.loginToApp(username,password);
        Assert.assertTrue(loginPageLesson11.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened3(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
        Assert.assertTrue(mainPageLesson11.isMainPageLesson11());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame3(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        loginPageLesson11.loginToAppLesson11(username,password);
        Assert.assertTrue(loginPageLesson11.isErrorFrame());
    }
}