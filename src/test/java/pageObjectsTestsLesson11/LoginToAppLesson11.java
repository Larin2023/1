//package pageObjectsTestsLesson11;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pageObjectsLesson11.LoginPageLesson11;
//import pageObjectsLesson11.MainPageLesson11;
//
//
//
//public class LoginToAppLesson11 extends BaseTestLesson11 {
//    @Test
//    public void loginTest_loginWithCorrectCredentials_mainPageOpened(){
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        Assert.assertTrue(mainPageLesson11.isMainPage());
//    }
//    @Test
//    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        loginPageLesson11.loginToAppLesson11(username,"wrongPassword");
//        Assert.assertTrue(loginPageLesson11.isErrorFrame());
//    }
//    @Test
//    public void loginTest_loginWithCorrectCredentials_mainPageOpened1(){
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        Assert.assertTrue(mainPageLesson11.isMainPage());
//    }
//    @Test
//    public void loginTest_loginWithIncorrectCredentials_errorFrame1(){
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        loginPageLesson11.loginToAppLesson11(username,"wrongPassword");
//        Assert.assertTrue(loginPageLesson11.isErrorFrame());
//    }
//    @Test
//    public void loginTest_loginWithCorrectCredentials_mainPageOpened2(){
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        Assert.assertTrue(mainPageLesson11.isMainPage());
//    }
//    @Test
//    public void loginTest_loginWithIncorrectCredentials_errorFrame2(){
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        loginPageLesson11.loginToAppLesson11(username,"wrongPassword");
//        Assert.assertTrue(loginPageLesson11.isErrorFrame());
//    }
//    @Test
//    public void loginTest_loginWithCorrectCredentials_mainPageOpened3(){
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        Assert.assertTrue(mainPageLesson11.isMainPage());
//    }
//    @Test
//    public void loginTest_loginWithIncorrectCredentials_errorFrame3(){
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        loginPageLesson11.loginToAppLesson11(username,"wrongPassword");
//        Assert.assertTrue(loginPageLesson11.isErrorFrame());
//    }
//}