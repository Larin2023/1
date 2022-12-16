package pageObjectsLesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MainPageLesson7 {
    //20) мы его создадим точно также как и логин page.
    // я прямо из логин page скопирую
    private WebDriver driver;
    private Wait<WebDriver> wait;

    //21)
    // скопировал
    public MainPageLesson7(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10, 1));
    }

    //я жду пока элемент homeby будет показан.
// если он подсветился, значит я на моей странице - я возвращаю true.
// но если я не дождался у меня будет что? тайм-аут exception.
// если у меня тайм-аут exception я делаю ритер files.
    // 24)
    public boolean isMain() {

        By homeBy = By.className("home");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy)); // нам надо подождать пока этот элемент homeBy появится.
            // если этого элемента не будет то вот ExpectedConditions выкинет нам тайм аут exception.
            //  поэтому мы можем вот что сделать мы можем сделать здесь Try Catch block и засунуть
            //  wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            // в нутрь
            return true; // если мы его дождались то return true. если мы достигли этой точки значит элемент показан.
        } catch (TimeoutException xx) { // но если мы не дождались мы будем ловить catch тайм-аут exception
            return false; //появится false
        }
    }
    // 27) homework////////////////////
    public String createPlaylist(String playlistName){  // 30) add String
        String playlistId = null;

        return playlistId;
    }
}
