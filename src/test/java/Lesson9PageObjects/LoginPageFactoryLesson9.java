        package Lesson9PageObjects;

        import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

        public class LoginPageFactoryLesson9 {
// 1)
        //что такое steel элемент?
        // дело в том что, вы создали web страницу,
        //но сейчас на web странице очень много java скрипта, и вы нашли элемент,
        // но javascript на лету может менять web страницу, когда web страница на лету меняется,
        // меняются локаторы.
        // то есть, вы вот загрузилась web страницу. вы вроде нашли локатор,
        // но между тем местом пока вы его сохранили и тем
        //местом когда вы на него нажали, web страница поменялась,
        // и локатор стал steel. то есть он нашелся но к тому
        //времени пока страница поменялось он замерз.
        //steel элемент элемент это такой геморрой с которым надо бороться.
        // The stale element reference error is a WebDriver error that occurs because
        // the referenced web element is no longer attached to the DOM.
        private WebDriver driver;

// 9)
        // Make a constructor.
        public LoginPageFactoryLesson9(WebDriver driver) {
        this.driver = driver;
//11)
        // вместо одной PageFactory.initElements(driver, this);, мы делаем две сточки.
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10); // мы туда добавляем драйвер
        PageFactory.initElements(factory, this); // я подаю вот этот factory
        // AjaxElementLocatorFactory   работает по-другому,
            //теперь вам вообще вейтеров не надо.
            // он а инициализирует этот элемент только тогда когда мы его вызываем.
            // если его нет дома, он его ждет.
            // и это очень сильно помогает со steel элементами.
            // дело в том что со steel элементами, когда вы нашли их, то пока вы на него кликните он уже изменился.
            // а с AjaxElementLocatorFactory,
            //вы находите элемент только в тот момент когда вы его кликаете.

            // THE END

//10)
        // в конструкторе я делаю две вещи:
        // инициализирую элементы. то есть что когда PageFactory.initElements
        // он каждому этому элементу:  private WebElement email; private WebElement password; etc.
        // засовывает и значение.
        // но в новом случае это не работает.
        // PageFactory.initElements(driver, this);
    }

// 2)
        //здесь используется FindBy, это по-хорошему тоже самый getter
        //но все элементы хранятся в переменах.
        //@FindBy(css = "[type='email']")

        private WebElement email;

// 3)
        //@FindBy(xpath = "//*[@type='password']")
         private WebElement password;

// 4)
        @FindBy(tagName = "button")
        private WebElement loginButton;

// 5)
        //    @FindBy(className = "error");
        private WebElement error;

// 6)
        //    я просто скопирую из предыдущего урока
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
        // GO TO -----------> LoginToAppFactory
            }
        }
