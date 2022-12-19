

        package pageObjectTestsLesson8;
        import com.github.javafaker.Faker;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import pageObjects.LoginPage;
//import pageObjects.MainPage;
import pageObjectsLesson8.LoginPageLesson8;
import pageObjectsLesson8.MainPageLesson8;

//31)
        // PlaylistTestsLesson8 extends BaseTestLesson8
        public class PlaylistTestsLesson8 extends BaseTestLesson8{
//32)
        // I can get rid of this:
        //    private WebDriver driver;
        //    @BeforeMethod
        //    public void startUp(){
        //        WebDriverManager.chromedriver().setup();
        //        driver = new ChromeDriver();
        //
        //    }
        //    @AfterMethod
        //    public void tearDown() throws InterruptedException {
        //        Thread.sleep(3000);
        //        driver.quit();
        //    }
        // GO TO --------------------> BaseTest

        @Test
        public void playlistTest_createPlaylist_playlistCreated() {
// 2)
        // String playlistName = TestDataGenerator.getRandomString(7); // генерируется a random string длиной 7 символов
        // мы будем использовать эту случайную строку для создания плейлистов

//16)
        // to create readable names for playlist (download library FAKER):
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        // GO TO ----------> BasePage

        LoginPageLesson8 loginPageLesson8 = new LoginPageLesson8(driver);
        loginPageLesson8.open();
//37)
        // я убераю вот эту ерунду ("alexander.v.anderson@gmail.com","te$t$tudent") and replace it with (username, password);
        MainPageLesson8 mainPageLesson8 = loginPageLesson8.loginToAppLesson8(username, password);
        // 33) представьте завтра мне захочется другую email использовать. я язасунуть it in base test.

//3)
        // теперь я в эту функцию подаю плейлист который я сгенерировал playlistName
        //mainPageLesson8.createPlaylistLesson8(playlistName);  // this line is changing on step #14.
        // теперь мне надо этой функции дать реальное тело.
        // GO TO --------> MainPage

//11)
        // хочу чтобы вы вернули плейлист айди: I am adding: "String playlistId = "
        String playlistId = mainPageLesson8.createPlaylistLesson8(playlistName);
        // GO TO --------> MainPage

//14)
        // теперь мне надо новую функцию создать которая проверит если плейлист екзист
        Assert.assertTrue(mainPageLesson8.isPlaylistExistLesson8(playlistId,playlistName));
        // GO TO --------> MainPage
    }
}