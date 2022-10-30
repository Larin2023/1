package PageObjectsLesson9;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPageFactoryLesson9 {
    // 1)
    private WebDriver driver;

    // 9) Make a constructor.
    public LoginPageFactoryLesson9(WebDriver driver) {
        this.driver = driver;
        //10)
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this);
    }
//он помогает вам загружать элементы только
//когда мы пользуемся. то есть когда вот этот loginToApp запускаю вот здесь говорю e-mail, он в
//это время только сюда заходит ищет этот e-mail если его нет он ждет его 5 секунд.

    // 2)
    //что такое steel элемент?
// дело в том что вы создание страницу,
//но сейчас на странице очень много java скрипта, и вы нашли элемент,
// но javascript на лету может менять страницу, когда страница на лету меняется,
// меняются локаторы.
//здесь используется FindBy, это по-хорошему тоже самый getter
// но все элементы хранятся в переменах.
//The stale element reference error is a WebDriver error that occurs because
// the referenced web element is no longer attached to the DOM.

//    @FindBy(css = "[type='email']");
    private WebElement email;

    //3 )
//    @FindBy(xpath = "//*[@type='password']");
    private WebElement password;

    //4)
    @FindBy(tagName = "button")
    private WebElement loginButton;

    //5)
//    @FindBy(className = "error");
    private WebElement error;

    //6)
    public void open(String url) {
        driver.get(url);
    }
    public boolean isErrorFrame() {
        try {
            return error.isDisplayed();
        } catch (
                TimeoutException err) {
            return false;
        }
    }
        public MainPageLesson9 loginToAppLesson9 (String username, String password){
            email.sendKeys(username);
            this.password.sendKeys(password);
            loginButton.click();
            return new MainPageLesson9(driver);
        }
    }
