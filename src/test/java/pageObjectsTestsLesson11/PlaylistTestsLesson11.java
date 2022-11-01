//package pageObjectsTestsLesson11;
//import com.github.javafaker.Faker;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pageObjectsLesson11.LoginPageLesson11;
//import pageObjectsLesson11.MainPageLesson11;
//
//public class PlaylistTestsLesson11 extends BaseTestLesson11 {
//    @Test
//    public void playlistTest_createPlaylist_playlistCreated() {
//        Faker faker = new Faker();
//        String playlistName = faker.funnyName().name();
//
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        String playlistId = mainPageLesson11.createPlaylist(playlistName);
//
//        Assert.assertTrue(mainPageLesson11.isPlaylistExist(playlistId,playlistName));
//    }
//    @Test(enabled = false)
//    public void playlistTest_renamePlaylist_playlistRenamed(){
//        Faker faker = new Faker();
//        String playlistName = faker.funnyName().name();
//
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        String playlistId = mainPageLesson11.createPlaylist(playlistName);
//
//        String newName = faker.ancient().hero();
//        mainPageLesson11.renamePlaylist(playlistId,newName);
//
//        Assert.assertTrue(mainPageLesson11.isPlaylistExist(playlistId,newName));
//    }
//    @Test
//    public void playlistTest_createPlaylist_playlistCreated1() {
//        Faker faker = new Faker();
//        String playlistName = faker.funnyName().name();
//
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        String playlistId = mainPageLesson11.createPlaylist(playlistName);
//
//        Assert.assertTrue(mainPageLesson11.isPlaylistExist(playlistId,playlistName));
//    }
//    @Test(enabled = false)
//    public void playlistTest_renamePlaylist_playlistRenamed1(){
//        Faker faker = new Faker();
//        String playlistName = faker.funnyName().name();
//
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        String playlistId = mainPageLesson11.createPlaylist(playlistName);
//
//        String newName = faker.ancient().hero();
//        mainPageLesson11.renamePlaylist(playlistId,newName);
//
//        Assert.assertTrue(mainPageLesson11.isPlaylistExist(playlistId,newName));
//    }
//    @Test
//    public void playlistTest_createPlaylist_playlistCreated2() {
//        Faker faker = new Faker();
//        String playlistName = faker.funnyName().name();
//
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        String playlistId = mainPageLesson11.createPlaylist(playlistName);
//
//        Assert.assertTrue(mainPageLesson11.isPlaylistExist(playlistId,playlistName));
//    }
//    @Test(enabled = false)
//    public void playlistTest_renamePlaylist_playlistRenamed2(){
//        Faker faker = new Faker();
//        String playlistName = faker.funnyName().name();
//
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        String playlistId = mainPageLesson11.createPlaylist(playlistName);
//
//        String newName = faker.ancient().hero();
//        mainPageLesson11.renamePlaylist(playlistId,newName);
//
//        Assert.assertTrue(mainPageLesson11.isPlaylistExist(playlistId,newName));
//    }
//    @Test
//    public void playlistTest_createPlaylist_playlistCreated3() {
//        Faker faker = new Faker();
//        String playlistName = faker.funnyName().name();
//
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        String playlistId = mainPageLesson11.createPlaylist(playlistName);
//
//        Assert.assertTrue(mainPageLesson11.isPlaylistExist(playlistId,playlistName));
//    }
//    @Test(enabled = false)
//    public void playlistTest_renamePlaylist_playlistRenamed3(){
//        Faker faker = new Faker();
//        String playlistName = faker.funnyName().name();
//
//        LoginPageLesson11 loginPageLesson11 = new LoginPageLesson11(driver);
//        loginPageLesson11.open(url);
//        MainPageLesson11 mainPageLesson11 = loginPageLesson11.loginToAppLesson11(username,password);
//        String playlistId = mainPageLesson11.createPlaylist(playlistName);
//
//        String newName = faker.ancient().hero();
//        mainPageLesson11.renamePlaylist(playlistId,newName);
//
//        Assert.assertTrue(mainPageLesson11.isPlaylistExist(playlistId,newName));
//    }
//}