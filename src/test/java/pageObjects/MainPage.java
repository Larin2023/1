package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));
    }
    private WebElement getHomeButton(){
        By homeBy = By.className("logout");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        return driver.findElement(homeBy);
    }

    public boolean isMainPage() {
        try {
            return getHomeButton().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }

    public String createPlaylist(String playlistName) {
        String playlistId="11";
        return playlistId;
    }

    public boolean isPlaylistExist(String playlistId, String playlistName) {
        return true;
    }
}