package pageObjectsTestsLesson7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

    // 28)
public class PlaylistTestsLesson7 {
    private WebDriver driver; //надо сделать WebDriver глобальным
    @BeforeMethod
    public void starUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        System.out.println("In the after method - > Driver will be killed soon");
        driver.quit();
    }
    @Test
    //29)
    public void playlistTests_createPlaylist_playlistCreated(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp("alexander.v.anderson@gmail.com", "te$t$tudent");
        mainPage.createPlaylist("XXXX");
    }
}
