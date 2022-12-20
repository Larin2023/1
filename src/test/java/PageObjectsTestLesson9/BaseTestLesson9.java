        package PageObjectsTestLesson9;
        import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

        public class BaseTestLesson9 {
        protected WebDriver driver; // 29) надо сделать WebDriver глобальным
        protected String username;
        protected String password;

        @BeforeMethod
        public void startUp() {
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