package pageObjectsTestsLesson11;

import enums.BrowserType;
import helpers.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String url;
    @Parameters({"url","username","password", "browser"})
    @BeforeMethod
    public void startUp(String url, String username, String password, String browser){
        BrowserType type = browser.equals("chrome") ? BrowserType.CHROME : BrowserType.FIREFOX;
        driver = BrowserFabric.getDriver(type);
        this.username = username;
        this.password = password;
        this.url = url;
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}