package PageObjectTestLesson10;
import EnumLesson10.BrowserTypeLesson10;
import helpersLesson10.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//         мы написали всю нашу программу.
//         весь наш фреймворк для интерфейса web драйвер.
//         не для конкретного браузера, а для интерфейс
public class BaseTestLesson10 {
    protected WebDriver driver;
    protected String username;
    protected String password;

    @BeforeMethod
    public void starUp()
//            throws InterruptedException {
    {
        username = "koeluser06@testpro.io";
        password = "te$t$tudent";
        //19)
        driver = BrowserFactory.getDriver(BrowserTypeLesson10.CHROME); // we used this line to substitute all of these:
        // 1)
////        WebDriverManager » 5.3.0
////        Automated driver management and other helper features for Selenium WebDriver in Java
////https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.0
        // 2)
//        // System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); So we can delete Chrome driver
        // 3)
//        // this line will turn into this line:
//        WebDriverManager.chromedriver().setup();
        // 4) to create a driver
//        driver = new ChromeDriver();
//        // WebDriver is an interface
//19 I will

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        System.out.println("In the after method - > Driver will be killed soon");
        driver.quit();
    }
}
