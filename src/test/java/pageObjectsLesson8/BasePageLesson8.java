package pageObjectsLesson8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePageLesson8 {

    // давайте зарефакторим на код. для этого создаем BasePage. и засунем туда наши вейтеры и наши драйверы.
    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    public BasePageLesson8(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));
    }
}