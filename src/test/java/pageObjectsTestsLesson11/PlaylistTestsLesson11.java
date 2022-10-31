package pageObjectsTestsLesson11;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTestsLesson11 extends BaseTest{
    @Test
    public void playlistTest_createPlaylist_playlistCreated() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test(enabled = false)
    public void playlistTest_renamePlaylist_playlistRenamed(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.ancient().hero();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,newName));
    }
    @Test
    public void playlistTest_createPlaylist_playlistCreated1() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test(enabled = false)
    public void playlistTest_renamePlaylist_playlistRenamed1(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.ancient().hero();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,newName));
    }
    @Test
    public void playlistTest_createPlaylist_playlistCreated2() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test(enabled = false)
    public void playlistTest_renamePlaylist_playlistRenamed2(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.ancient().hero();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,newName));
    }
    @Test
    public void playlistTest_createPlaylist_playlistCreated3() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test(enabled = false)
    public void playlistTest_renamePlaylist_playlistRenamed3(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.ancient().hero();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,newName));
    }
}