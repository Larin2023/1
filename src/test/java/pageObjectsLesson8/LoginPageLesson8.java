    package pageObjectsLesson8;

    import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
    //import org.openqa.selenium.support.ui.WebDriverWait;

    //import java.time.Duration;

//23)
    // LoginPageLesson8 extends BasePageLesson8
    public class LoginPageLesson8 extends BasePageLesson8{

//24)
    // delete two lines:
    //    private WebDriver driver;
    //    private WebDriverWait wait;

    public LoginPageLesson8 (WebDriver driver) {
//25)
    // delete two lines:
    //        this.driver = driver;
    //        wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));// 26)

//26)
        super(driver);
    }
    // create new ------> BaseTest

    private WebElement getEmailField(){
        By emailBy = By.xpath("//*[@type='email']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        return driver.findElement(emailBy);
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("button"));
    }
    private WebElement getErrorFrame(){
        By errorBy = By.className("error");
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
        return driver.findElement(errorBy);
    }
    public MainPageLesson8 loginToAppLesson8(String username, String password){
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPageLesson8(driver);
    }

    public void open() {
        driver.get("https://bbb.testpro.io/");
    }

    public boolean isErrorFrame() {
        try {
            return getErrorFrame().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }
}