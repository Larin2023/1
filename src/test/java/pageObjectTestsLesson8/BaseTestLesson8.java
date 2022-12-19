    package pageObjectTestsLesson8;

    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.AfterMethod;
    import org.testng.annotations.BeforeMethod;

// 27)
    // create BaseTest
    public class BaseTestLesson8 {
// 29)
    // надо сделать WebDriver protected
    protected WebDriver driver;
    // GO TO -------------------> LoginToAppLesson8

// 33)
    // дело в том что я использую эти user name и password везде.
    // но представьте завтра мне захочется другое использовать.
    // я хочу их тоже засунуть их в base test.
    protected String username;
    protected String password;

//28)
    // I copy from LoginToApp:
    @BeforeMethod
    public void startUp() {

// 34)
        // я их инициализрую:
        username = "alexander.v.anderson@gmail.com";
        password = "te$t$tudent";
        // GO TO --------> LoginToApp

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}