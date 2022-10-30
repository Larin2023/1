package PageObjectsTestLesson9;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// 27) create BaseTest
public class BaseTestLesson9 {
    protected WebDriver driver; // 29) надо сделать WebDriver глобальным

    // 33) дело в том что я использую эти user name и password везде.
    // но представьте завтра мне захочется другое использовать.
    // я хочу их тоже засунуть их в base test.
    protected String username;
    protected String password;

    @BeforeMethod
    public void startUp() {
        // 34)
        username = "alexander.v.anderson@gmail.com";
        password = "te$t$tudent";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}