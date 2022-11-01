package pageObjectsLesson11;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPageFactoryLesson11 {
    public LoginPageFactoryLesson11(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this);
    }
    private WebDriver driver;

    @FindBy(css = "[type='email']")
    private WebElement email;

    @FindBy(xpath = "//*[@type='password']")
    private WebElement password;

    @FindBy(tagName = "button")
    private WebElement loginButton;

    @FindBy(className = "error")
    private WebElement error;

    public void open(String url) {
        driver.get(url);
    }

    public boolean isErrorFrame() {
        try {
            return error.isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }
    public MainPageLesson11 loginToAppLesson11(String username, String password){
        email.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
        return new MainPageLesson11(driver);
    }
}
