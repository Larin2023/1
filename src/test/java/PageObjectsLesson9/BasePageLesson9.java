        package PageObjectsLesson9;

        import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
        public class BasePageLesson9 {
        protected WebDriver driver;
        protected Wait<WebDriver> wait;
        public BasePageLesson9(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));
        }
    }

