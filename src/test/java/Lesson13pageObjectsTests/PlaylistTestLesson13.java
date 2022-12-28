            //package pageObjectsTestsLesson13;
            //
            //import com.github.javafaker.Faker;
            //
            //import org.testng.Assert;
            //import org.testng.annotations.Test;
            //import pageObjects.LoginPage;
            //import pageObjects.MainPage;
            //
            //public class PlaylistTestLesson13 extends BaseTest{
            //    @Test
            //    public void playlistTests_createPlaylist_playlistCreated(){
            //        Faker faker = new Faker();
            //        String playlistName = faker.funnyName().name();
            //        System.out.println(playlistName);
            //        LoginPage loginPage = new LoginPage(driver);
            //        loginPage.open();
            //        MainPage mainPage = loginPage.loginToApp(username, password);
            //        String playlistId = mainPage.createPlaylist(playlistName);
            //        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
            //    }
            //    @Test
            //    public void playlistTests_renamePlaylist_playlistRename(){
            //        Faker faker = new Faker();
            //        String playlistName = faker.funnyName().name();
            //        System.out.println(playlistName);
            //        LoginPage loginPage = new LoginPage(driver);
            //        loginPage.open();
//10)
            //        давайте здесь я хочу уронить. подам неправильный пароль. 11
            //        MainPage mainPage = loginPage.loginToApp(username, password+"11");
            //          и у нас должен здесь появится новая папка скриншот если ее открою у меня есть скриншот.
            //        у нас генерируется автоматически report

            // THE END

            //        String playlistId = mainPage.createPlaylist(playlistName);
            //
            //        String newPlaylistName = faker.artist().name();
            //        mainPage.renamePlaylist(playlistId,newPlaylistName);
            //
            //        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
            //    }
            //    @Test
            //    public void playlistTests_createPlaylist_playlistCreated1(){
            //        Faker faker = new Faker();
            //        String playlistName = faker.funnyName().name();
            //        System.out.println(playlistName);
            //        LoginPage loginPage = new LoginPage(driver);
            //        loginPage.open();
            //        MainPage mainPage = loginPage.loginToApp(username, password);
            //        String playlistId = mainPage.createPlaylist(playlistName);
            //        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
            //    }
            //    @Test
            //    public void playlistTests_renamePlaylist_playlistRename1(){
            //        Faker faker = new Faker();
            //        String playlistName = faker.funnyName().name();
            //        System.out.println(playlistName);
            //        LoginPage loginPage = new LoginPage(driver);
            //        loginPage.open();
            //        MainPage mainPage = loginPage.loginToApp(username, password);
            //        String playlistId = mainPage.createPlaylist(playlistName);
            //
            //        String newPlaylistName = faker.artist().name();
            //        mainPage.renamePlaylist(playlistId,newPlaylistName);
            //
            //        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
            //    }
            //    @Test
            //    public void playlistTests_createPlaylist_playlistCreated2(){
            //        Faker faker = new Faker();
            //        String playlistName = faker.funnyName().name();
            //        System.out.println(playlistName);
            //        LoginPage loginPage = new LoginPage(driver);
            //        loginPage.open();
            //        MainPage mainPage = loginPage.loginToApp(username, password);
            //        String playlistId = mainPage.createPlaylist(playlistName);
            //        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
            //    }
            //    @Test
            //    public void playlistTests_renamePlaylist_playlistRename2(){
            //        Faker faker = new Faker();
            //        String playlistName = faker.funnyName().name();
            //        System.out.println(playlistName);
            //        LoginPage loginPage = new LoginPage(driver);
            //        loginPage.open();
            //        MainPage mainPage = loginPage.loginToApp(username, password);
            //        String playlistId = mainPage.createPlaylist(playlistName);
            //
            //        String newPlaylistName = faker.artist().name();
            //        mainPage.renamePlaylist(playlistId,newPlaylistName);
            //
            //        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
            //    }
            //    @Test
            //    public void playlistTests_createPlaylist_playlistCreated3(){
            //        Faker faker = new Faker();
            //        String playlistName = faker.funnyName().name();
            //        System.out.println(playlistName);
            //        LoginPage loginPage = new LoginPage(driver);
            //        loginPage.open();
            //        MainPage mainPage = loginPage.loginToApp(username, password);
            //        String playlistId = mainPage.createPlaylist(playlistName);
            //        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
            //    }
            //    @Test
            //    public void playlistTests_renamePlaylist_playlistRename3(){
            //        Faker faker = new Faker();
            //        String playlistName = faker.funnyName().name();
            //        System.out.println(playlistName);
            //        LoginPage loginPage = new LoginPage(driver);
            //        loginPage.open();
            //        MainPage mainPage = loginPage.loginToApp(username, password);
            //        String playlistId = mainPage.createPlaylist(playlistName);
            //
            //        String newPlaylistName = faker.artist().name();
            //        mainPage.renamePlaylist(playlistId,newPlaylistName);
            //
            //        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
            //    }
            //}