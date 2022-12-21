        package Lesson9PageObjectsTest;
        import Lesson9PageObjects.LoginPageFactoryLesson9;
        import Lesson9PageObjects.MainPageLesson9;
        import org.testng.Assert;
        import org.testng.annotations.Test;


        public class LoginToAppFactoryLesson9 extends BaseTestLesson9 {
//7)
        @Test
        public void loginToApp_correctCredentials_successfulLogin(){
            LoginPageFactoryLesson9 loginPage = new LoginPageFactoryLesson9(driver);
            loginPage.open("https://bbb.testpro.io");
            MainPageLesson9 mainPageLesson9 = loginPage.loginToAppLesson9(username, password);
            Assert.assertTrue(mainPageLesson9.isMainPageLesson9());
    }
        @Test
        public void loginToApp_incorrectCredentials_failedLogin(){
            LoginPageFactoryLesson9 loginPageLesson9 = new LoginPageFactoryLesson9(driver);
//8)
            // I will put "https://bbb.testpro.io" here
            loginPageLesson9.open("https://bbb.testpro.io");
            loginPageLesson9.loginToAppLesson9(username, "wrongPassword");
            Assert.assertTrue(loginPageLesson9.isErrorFrame());
            // GO TO ------------> LoginPageFactoryLesson9
        }
}
