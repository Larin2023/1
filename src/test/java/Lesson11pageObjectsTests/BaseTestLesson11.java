            package Lesson11pageObjectsTests;

            import Lesson11Enum.BrowserTypeLesson11;
            import Lesson11helpers.BrowserFabricLesson11;
            import org.openqa.selenium.WebDriver;
            import org.testng.annotations.AfterMethod;
            import org.testng.annotations.BeforeMethod;
            import org.testng.annotations.Parameters;

            public class BaseTestLesson11 {
                protected WebDriver driver;
                protected String username;
                protected String password;
                protected String url;
// 11)
                // "url","username","password", "browser" должны совпадать с testng.xml
                @Parameters({"url","username","password", "browser"})
                @BeforeMethod
// 12)
                // сюда я подаю 3 стинга
                public void startUp(String url, String username, String password, String browser){
// 13)
                    // новый способ писать if,    else.
                    BrowserTypeLesson11 type = browser.equals("chrome") ? BrowserTypeLesson11.CHROME : BrowserTypeLesson11.FIREFOX;
// 14)
                    driver = BrowserFabricLesson11.getDriver(type);
                    this.username = username;
                    this.password = password;
                    this.url = url;
                }
                @AfterMethod
                public void tearDown() throws InterruptedException {
                    Thread.sleep(3000);
                    driver.quit();
                }
            }

// 15)
            // есть  два способа пропустить тесты. через testng или напрямую в файле
            // Check https://www.youtube.com/watch?v=XrXGGbVt8QU&list=PLJ20RFfBUakj_pqDKQOUzMLkmPncpy-BL&index=27
            // 39:27

            // GO TO ------> singleRun