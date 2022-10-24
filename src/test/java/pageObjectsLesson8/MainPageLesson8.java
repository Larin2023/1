

package pageObjectsLesson8;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageLesson8 {
    private WebDriver driver;
    private WebDriverWait wait;
    public MainPageLesson8(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));
    }
    private WebElement getHomeButton(){
        By homeBy = By.className("logout");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        return driver.findElement(homeBy);
    }

    private WebElement getPlaylistById(String playlistId){
        return driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
    }
    private WebElement getEditPlaylistField(){ //11) я должен вытащить "Edit Field" куда мне надо вставить название плейлиста.
        return driver.findElement(By.xpath("//*[@name='name']"));
    }
    public boolean isMainPageLesson8() {
        try {
            return getHomeButton().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }
    private WebElement getNewPlaylistItem(){ // 9)
        return driver.findElement(By.xpath("//li[@data-testid='playlist-context-menu-create-simple']"));
    }
    // 5) сделаю getter
    private WebElement getPlusButton(){
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy); //6) I will do "return"
    }
    // 4)теперь мне надо дать реальное тело.
    public String createPlaylistLesson8(String playlistName) {
        // 7)
        String playlistId = "";
        getPlusButton().click(); // 8)
        getNewPlaylistItem().click(); //10
        getEditPlaylistField().sendKeys(playlistName); //12)
        getEditPlaylistField().sendKeys(Keys.RETURN); // 13) меня туда надо клавиш ENTER отправит
        //15) хочу чтобы вы вернули плейлист айди.
        //ID не сразу меняется. он меняется через миллисекунду
        // прежде чем отправлять URL мне надо дождаться пока не появится вот эта зеленая штучка
        //дрючка в правом углу:
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='success show']")));
        // 16) как мне вытащить четыре последних цифр ID.
        //для этого есть функции строк.
        //в данном случае я буду использовать функцию сплит. она переводит строку to ARRAY:
        //String url = driver.getCurrentUrl();
        //playlistId = url.split("/")[5];
        return driver.getCurrentUrl().split("/")[5];
    }

    // 18) to assert that playlist is created
    public boolean isPlaylistExistLesson8(String playlistId, String playlistName) {
        try{
            return driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']")).getText().equals(playlistName);
        } catch (NoSuchElementException xx){
            return false;
        }

    }

    public void renamePlaylistLesson8(String playlistId, String newName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = getPlaylistById(playlistId);
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        getEditPlaylistField().sendKeys(Keys.CONTROL+"a");
        getEditPlaylistField().sendKeys(newName);
        getEditPlaylistField().sendKeys(Keys.ENTER);
    }
}