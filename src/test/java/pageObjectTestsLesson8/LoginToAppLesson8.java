    package pageObjectTestsLesson8;

    //import io.github.bonigarcia.wdm.WebDriverManager;
    //import org.openqa.selenium.WebDriver;
    //import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
    //import org.testng.annotations.AfterMethod;
    //import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.Test;
    //import pageObjects.LoginPage;
    //import pageObjects.MainPage;
    import pageObjectsLesson8.LoginPageLesson8;
    import pageObjectsLesson8.MainPageLesson8;

// 30)
    // LoginToAppLesson8 extends BaseTestLesson8
    public class LoginToAppLesson8 extends BaseTestLesson8{
    // GO TO ----------> PlaylistTest

    //    private WebDriver driver;
    //    @BeforeMethod
    //    public void startUp(){
    //        WebDriverManager.chromedriver().setup();
    //        driver = new ChromeDriver();
    //
    //    }
    //    @AfterMethod
    //    public void tearDown() throws InterruptedException {
    //        Thread.sleep(3000);
    //        driver.quit();
    //    }

    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened(){
        LoginPageLesson8 loginPageLesson8 = new LoginPageLesson8(driver);
        loginPageLesson8.open();
//35)
        // я убераю вот эту ерунду ("alexander.v.anderson@gmail.com","te$t$tudent") and replace it with (username, password);
        MainPageLesson8 mainPageLesson8 = loginPageLesson8.loginToAppLesson8(username, password);
        Assert.assertTrue(mainPageLesson8.isMainPageLesson8());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPageLesson8 loginPageLesson8 = new LoginPageLesson8(driver);
        loginPageLesson8.open();
// 36)
        // here replace it with username, but lease "wrongPassword"
        loginPageLesson8.loginToAppLesson8(username,"wrongPassword");
        Assert.assertTrue(loginPageLesson8.isErrorFrame());
        // GO TO -----------> PlaylistTest

    }
}