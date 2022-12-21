    package Lesson8pageObjects;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.support.ui.Wait;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import java.time.Duration;

    public class BasePageLesson8 {

//17)
    // давайте зарефакторим на код. для этого создаем BasePage. и засунем туда наши вейтеры и наши драйверы.
    // We will make them protected чтобы были видны везде.
    protected WebDriver driver;
    protected Wait<WebDriver> wait;
//18)
    // mainPage будет extended basePage

//19)
    // теперь я хочу создать конструктор
    public BasePageLesson8(WebDriver driver) {
        this.driver = driver;
        // GO TO --------> MainPage

//21)
        //Paste here:
        wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));
        // GO TO --------> MainPage
    }
}

