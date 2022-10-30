package PageObjectsLesson9;


import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

//import java.time.Duration;

public class MainPageLesson9 extends BasePageLesson9 { //22) mainPage будет extended basePage

    // 21) засунем in BasePage. наши вейтеры и наши драйверы
//    private WebDriver driver;
//    private WebDriverWait wait;

    public MainPageLesson9(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));

        super(driver);
    }      //24) конструктор родительского класса "super(driver)" вы3овет вот этого дяденьку "this.driver = driver;
    //который возьмет драйвер и создаст waiter and webdriver. то есть мы как-то
    //уже почистили код от ненужных вещей.

    private WebElement getHomeButton() {
        By homeBy = By.className("logout");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        return driver.findElement(homeBy);
    }

    private WebElement getPlaylistById(String playlistId) {
        return driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
    }

    private WebElement getPlaylistEditField() {
        return driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
    }

    //    private WebElement getEditPlaylistField(){     // 39) rename
    private WebElement getCreatePlaylistField() { //11) я должен вытащить "Edit Field" куда мне надо вставить название плейлиста.
        return driver.findElement(By.xpath("//*[@name='name']"));
    }

    public boolean isMainPageLesson9() {
        try {
            return getHomeButton().isDisplayed();
        } catch (TimeoutException err) {
            return false;
        }
    }

    private WebElement getNewPlaylistItem() { // 9)
        return driver.findElement(By.xpath("//li[@data-testid='playlist-context-menu-create-simple']"));
    }

    // 5) сделаю getter
    private WebElement getPlusButton() {
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy); //6) I will do "return"
    }

    // 4)теперь мне надо дать реальное тело.
    public String createPlaylistLesson9(String playlistName) {
        // 7)
        String playlistId = "";
        getPlusButton().click(); // 8)
        getNewPlaylistItem().click(); //10
        getCreatePlaylistField().sendKeys(playlistName); //12)
        getCreatePlaylistField().sendKeys(Keys.RETURN); // 13) меня туда надо клавиш ENTER отправит
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

    // 38)
    private By getPlaylistBy(String playlistId) {
        return By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
    }

    // 18) to assert that playlist is created
    public boolean isPlaylistExistLesson9(String playlistId, String playlistName) {
        try {
            return driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']")).getText().equals(playlistName);
        } catch (NoSuchElementException xx) {
            return false;
        }
    }
}