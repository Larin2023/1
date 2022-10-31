package pageObjectsTestsLesson11;

import EnumLesson11.BrowserTypeLesson11;

import helpersLesson10.BrowserFactory;
import helpersLesson11.BrowserFabricLesson11;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTestLesson11 {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String url;
    @Parameters({"url","username","password", "browser"})
    @BeforeMethod
    public void startUp(String url, String username, String password, String browser){
        BrowserTypeLesson11 type = browser.equals("chrome") ? BrowserTypeLesson11.CHROME : BrowserTypeLesson11.FIREFOX;
        driver = BrowserFabricLesson11.getDriver(type);
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