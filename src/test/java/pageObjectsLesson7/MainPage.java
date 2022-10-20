package pageObjectsLesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//каждая страница это класс.
//к каждой страницы мы создаем отдельно класс.
// локаторы это getters.
//идея мы создаем класс который соответствует page:
// We create:
//    pageObjects
//        LoginPage
//        MainPage
//    pageObjectsTests
//        LoginToApp
//        PlaylistTest

// LoginPage=LoginToApp
// MainPage=PlaylistTest

//идея такая: мы делаем getters.
//getters это веб-элементы (функции, методы),
// это какие-то большие куски функционал, например целый логин мы объединяем в один метод.
// мы можем делать позитив логин мы можем делать негатив логин.

//подтверждаем что мы находимся на странице это какая-то boolean функция.

public class MainPage {
    //20)
    private WebDriver driver;
    private Wait<WebDriver> wait;

    //21)
    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 200);

    }
    //я жду пока элемент homeby будет показан.
// если он подсветился, значит я на моей странице - я возвращаю true.
// но если я не дождался у меня будет что? тайм-аут exception.
// если у меня тайм-аут exception я делаю ритер files.
    // 24)
    public boolean isMain() {
        By homeBy = By.className("home");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
    }
    public String createPlaylist(String playlistName){
        String playlistId = null;

        return playlistId;
    }
}
