package pageObjectTestsLesson8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// 27) create BaseTest
public class BaseTestLesson8 {
    protected WebDriver driver; // 29) надо сделать WebDriver глобальным

    // дело в том что я использую эти user name и password везде.
    // но представьте завтра мне захочется другое использовать.
    // я хочу их тоже засунуть их в base test.
    protected String username;
    protected String password;

    // 28) Paste
    @BeforeMethod
    public void starUp()
//            throws InterruptedException {
    {
        username = "alexander.v.anderson@gmail.com";
        password = "te$t$tudent";
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        System.out.println("In the after method - > Driver will be killed soon");
        driver.quit();
    }
}