package Lesson11pageObjectsTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import Lesson11pageObjects.LoginPageFactoryLesson11;
import Lesson11pageObjects.MainPageLesson11;

public class LoginToAppFactoryLesson11 extends BaseTestLesson11 {
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
        Assert.assertTrue(mainPageLesson11.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        loginPageLesson11.loginToAppLesson11(username,password);
        Assert.assertTrue(loginPageLesson11.isErrorFrame());
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
        loginPageLesson11.loginToAppLesson11(username,password);
        Assert.assertTrue(loginPageLesson11.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened2(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
        Assert.assertTrue(mainPageLesson11.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame2(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        loginPageLesson11.loginToAppLesson11(username,password);
        Assert.assertTrue(loginPageLesson11.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened3(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
        Assert.assertTrue(mainPageLesson11.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame3(){
        LoginPageFactoryLesson11 loginPageLesson11 = new LoginPageFactoryLesson11(driver);
        loginPageLesson11.open(url);
        loginPageLesson11.loginToAppLesson11(username,password);
        Assert.assertTrue(loginPageLesson11.isErrorFrame());
    }
}