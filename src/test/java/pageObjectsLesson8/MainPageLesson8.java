

    package pageObjectsLesson8;

    import org.openqa.selenium.*;
    //import org.openqa.selenium.interactions.Actions;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    // import org.openqa.selenium.support.ui.WebDriverWait;

    //import java.time.Duration;

    public class MainPageLesson8 extends BasePageLesson8 {

//21)
    // засунем in BasePage. наши вейтеры и наши драйверы
    //    private WebDriver driver;
    //    private WebDriverWait wait;

    public MainPageLesson8(WebDriver driver) {
//20)
    //         I will move   wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1)); to BasePage
    //        this.driver = driver;
    //        wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));

//22)
        // я говорю, вызови конструктор родительского класса "super" и отправь туда драйвер.
        // что случится?
        // этот конструктор родительского класса "super" вызовет вот этого дяденьку ("this.driver = driver;" from BasePage)
        // который возьмет драйвер и создаст и water and web драйвер
        super(driver);
        // GO TO --------> LoginPage
    }
//24)
    // конструктор родительского класса "super(driver)" вы3овет вот этого дяденьку "this.driver = driver;
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

//9)
    // сделаю getter
    //    private WebElement getEditPlaylistField(){     // rename
    private WebElement getCreatePlaylistField() { // я должен вытащить "Edit Field" куда мне надо вставить название плейлиста.
        return driver.findElement(By.xpath("//*[@name='name']"));
    }

    public boolean isMainPageLesson8() {
        try {
            return getHomeButton().isDisplayed();
        } catch (TimeoutException err) {
            return false;
        }
    }

//7)
    // сделаю getter
    private WebElement getNewPlaylistItem() {     //должен выбрать новый плейлист
        return driver.findElement(By.xpath("//li[@data-testid='playlist-context-menu-create-simple']"));
    }

//4)
    // сделаю getter
    private WebElement getPlusButton() {
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle create']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
//5)
        // I will do "return"
        return driver.findElement(plusButtonBy);
    }
    public String createPlaylistLesson8(String playlistName) {
        String playlistId = "";

//6)
        getPlusButton().click(); // я нажал на эту кнопку

//8)
        getNewPlaylistItem().click();  // теперь мне надо на эту дяденьку начать

//10)
        // getEditPlaylistField().sendKeys(playlistName);
        // getEditPlaylistField().sendKeys(Keys.RETURN);
        // GO TO -------> PlaylistTestsLesson8

        getCreatePlaylistField().sendKeys(playlistName);
        getCreatePlaylistField().sendKeys(Keys.RETURN); // меня туда надо клавиш ENTER отправит

//12)
        // хочу чтобы вы вернули плейлист айди.
        // давайте распечатаем вот эту строку адреса.
        //ID не сразу меняется. он меняется через миллисекунду
        // прежде чем отправлять URL мне надо дождаться пока не появится вот эта зеленая штучка
        //дрючка в правом углу:
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='success show']")));
        System.out.println(driver.getCurrentUrl());

// 13)
        // как мне вытащить четыре последних цифр ID?
        //для этого есть функции строк.
        //в данном случае я буду использовать функцию сплит. она переводит строку to ARRAY:
        //String url = driver.getCurrentUrl();
        //playlistId = url.split("/")[5];
        return driver.getCurrentUrl().split("/")[5];
        // GO TO ---------> Playlist
    }

    private By getPlaylistBy(String playlistId) {
        return By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
    }

//15)
    // to assert that playlist is created
    public boolean isPlaylistExistLesson8(String playlistId, String playlistName) {
        try {
            return driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']")).getText().equals(playlistName);
            // я сюда вставлю вот такую ерунду + playlistId +
            //то есть у меня этот селектор будет
            //динамическим зависимости от того какой плейлиста я сюда подам он будет выглядеть по-другому
        } catch (NoSuchElementException xx) {
            return false;
            // GO TO ------------> PlaylistTests
             }
         }
    }


