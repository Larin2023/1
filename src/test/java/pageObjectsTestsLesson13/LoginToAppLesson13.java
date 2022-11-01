//package pageObjectsTestsLesson13;
//
////import listeners.MyRetry;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pageObjects.LoginPage;
//import pageObjects.MainPage;
//
//public class LoginToAppLesson13 extends BaseTest {
//                                                         //2)
//    private int count = 0;
//                                                    //5) только к определенному тесту
//    @Test(retryAnalyzer = MyRetry.class)
//                                                         // 1)
//    public void flakyTest(){ //6) flakyTest добавить куда в testng файл
//
//                                                         //3)
//        if(count<=2){
//            count++;
//            Assert.assertTrue(false);
//        }
//        Assert.assertTrue(true);
//    }
//
//    @Test
//    public void loginToApp_correctCredentials_successfulLogin(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        MainPage mainPage = loginPage.loginToApp(username, password);
//        Assert.assertTrue(mainPage.isMain());
//    }
//    @Test
//    public void loginToApp_incorrectCredentials_failedLogin(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        loginPage.loginToApp(username, "wrongPassword");
//        Assert.assertTrue(loginPage.isError());
//    }
//
//    @Test
//    public void loginToApp_correctCredentials_successfulLogin1(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        MainPage mainPage = loginPage.loginToApp(username, password);
//        Assert.assertTrue(mainPage.isMain());
//    }
//    @Test
//    public void loginToApp_incorrectCredentials_failedLogin1(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        loginPage.loginToApp(username, "wrongPassword");
//        Assert.assertTrue(loginPage.isError());
//    }
//
//    @Test
//    public void loginToApp_correctCredentials_successfulLogin2(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        MainPage mainPage = loginPage.loginToApp(username, password);
//        Assert.assertTrue(mainPage.isMain());
//    }
//    @Test
//    public void loginToApp_incorrectCredentials_failedLogin2(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        loginPage.loginToApp(username, "wrongPassword");
//        Assert.assertTrue(loginPage.isError());
//    }
//
//    @Test
//    public void loginToApp_correctCredentials_successfulLogin3(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        MainPage mainPage = loginPage.loginToApp(username, password);
//        Assert.assertTrue(mainPage.isMain());
//    }
//    @Test
//    public void loginToApp_incorrectCredentials_failedLogin3(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        loginPage.loginToApp(username, "wrongPassword");
//        Assert.assertTrue(loginPage.isError());
//    }
//}