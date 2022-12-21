

        package Lesson10PageObjectTest;
        import com.github.javafaker.Faker;
        import org.testng.Assert;
        import org.testng.annotations.Test;
        import Lesson8pageObjects.LoginPageLesson8;
        import Lesson8pageObjects.MainPageLesson8;
        public class PlaylistTestsLesson10 extends BaseTestLesson10{
            @Test
            public void playlistTest_createPlaylist_playlistCreated() {
                Faker faker = new Faker();
                String playlistName = faker.funnyName().name();
                LoginPageLesson8 loginPageLesson8 = new LoginPageLesson8(driver);
                loginPageLesson8.open();
                MainPageLesson8 mainPageLesson8 = loginPageLesson8.loginToAppLesson8(username, password);
                String playlistId = mainPageLesson8.createPlaylistLesson8(playlistName);
                Assert.assertTrue(mainPageLesson8.isPlaylistExistLesson8(playlistId,playlistName));
            }
        }