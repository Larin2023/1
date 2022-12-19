        package PageObjectsLesson9;

        import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

        public class BasePageLesson9 {

// 20)
        // давайте зарефакторим на код. для этого создаем BasePage. и засунем туда наши вейтеры и наши драйверы.
        // We will make them protected чтобы были видны везде.
        protected WebDriver driver;
        protected Wait<WebDriver> wait;

// 23)
        // теперь я хочу создать конструктор
        public BasePageLesson9(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));
        }
    }

