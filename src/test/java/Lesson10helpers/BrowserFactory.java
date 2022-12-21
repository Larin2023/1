        package Lesson10helpers;
        import Lesson10Enum.BrowserTypeLesson10;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

// 5)
        // Create the class BrowserFactory and public static WebDriver
        // в качестве аргумента я буду брать Enum.
        // Create Enum --------------> public enum BrowserTypeLesson10
        public class BrowserFactory {
// 7)
        // here we will put here a variable that would be chrome,firefox,etc.
        public static WebDriver getDriver(BrowserTypeLesson10 browser) {
// 8)
        //и здесь я вам покажу switch.
        // switch это переключатель это if else,
        // но когда у тебя много else,
        // и зависимости от браузера можно выбирать
        //разные решения.
        switch (browser) {
// 9)
            case EDGE -> { // эта функция будет возвращать webdriver
                return getEdgeDriver();
                //  я вызываю функцию который пока еще
                // нету я ее сейчас создан. go to 10)
            }

// 11)
        // case OPERA -> {
        // return getOperaDriver();
        //            }

//13)
            case FIREFOX -> {
                return getFirefoxDriver();
            }
//16)
            //в остальных других случаях он называем дефолт мы выполним getChromeDriver
            default -> {
                return getChromeDriver();

            }
        }
    }
//17)
        private static WebDriver getChromeDriver() {
        // GO TO ----------> BaseTest

//19)
        //  запускать браузер в режиме headless без головы
        ChromeOptions options = new ChromeOptions();
//20)
        //в зависимости от дизайна,
        // сайт может меняться, но так как мы запускаем без головы
        // мы не можем контролировать размер окна.
        //мы можем запустить какой-то размер окна по умолчанию.
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        // если мы окно откроем поменьше дизайн стал другим и у нас элементы не будут находиться,
        // для этого мы задаем размер окна

        WebDriverManager.chromedriver().setup();
// 21)
        // I will put options here.
        return new ChromeDriver(options);
    }

//14)
        private static WebDriver getFirefoxDriver() {
// 22)
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        //размер окна надо двух различных аргументах продавать
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
//15)
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(options);
    }

//10)
        //    private static WebDriver getOperaDriver() {
        //        WebDriverManager.operadriver().setup();
        //        return new OperaDriver();
        //    }
        //

//12)
            private static WebDriver getEdgeDriver() {
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }
        }