

package pageObjectTestsLesson8;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjectsLesson8.LoginPageLesson8;
import pageObjectsLesson8.MainPageLesson8;

public class PlaylistTestsLesson8 extends BaseTestLesson8{ //31)
    private WebDriver driver;
    //32) I can get rid of this.
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
    @Test
    public void playlistTest_createPlaylist_playlistCreated() {
        // 2)
//        String playlistName = TestDataGenerator.getRandomString(7);
        //19) to create readable names for playlist (download library FAKER):
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPageLesson8 loginPageLesson8 = new LoginPageLesson8(driver);
        loginPageLesson8.open();
        MainPageLesson8 mainPageLesson8 = loginPageLesson8.loginToAppLesson8("alexander.v.anderson@gmail.com","te$t$tudent");
        //mainPageLesson8.createPlaylistLesson8(playlistName);  // this line is changing on step #14.

        // 14) хочу чтобы вы вернули плейлист айди: I am adding: "String playlistId = "
        String playlistId = mainPageLesson8.createPlaylistLesson8(playlistName);

        // 17)
        Assert.assertTrue(mainPageLesson8.isPlaylistExistLesson8(playlistId,playlistName));

    }
    @Test
    public void playlistTest_renamePlaylist_playlistRenamed(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPageLesson8 loginPageLesson8 = new LoginPageLesson8(driver);
        loginPageLesson8.open();
        MainPageLesson8 mainPageLesson8 = loginPageLesson8.loginToAppLesson8("alexander.v.anderson@gmail.com","te$t$tudent");
        String playlistId = mainPageLesson8.createPlaylistLesson8(playlistName);

        String newName = faker.ancient().hero();
        mainPageLesson8.renamePlaylistLesson8(playlistId,newName);

        Assert.assertTrue(mainPageLesson8.isPlaylistExistLesson8(playlistId,newName));
    }
}