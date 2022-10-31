package pageObjectsLesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageLesson11 {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePageLesson11(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,200);
    }
}