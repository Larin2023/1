package helpersLesson10;
import EnumLesson10.BrowserTypeLesson10;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {
    // 5)
    public static WebDriver getDriver(BrowserTypeLesson10 browser) { // 7) we will put here a variable that would be chrome,firefox,etc.
        // 8)
//и здесь я вам покажу switch.
// switch это переключатель это if else,
// но когда у тебя много else,
// и зависимости от браузера можно выбирать
//разные решения.
        switch (browser) {
            // 9)
            case EDGE -> {
                return getEdgeDriver();
            }

            // 11)
            case OPERA -> {
                return getOperaDriver();
            }

////13)
            case FIREFOX -> {
                return getFirefoxDriver();
            }
            //16)
            default -> {
                return getChromeDriver();
//в остальных других случаях он называем дефолт мы выполним getChromeDriver

            }
        }
    }
    //17)
    private static WebDriver getChromeDriver() {
        //20)
        ChromeOptions options = new ChromeOptions();
        //в зависимости от дизайна,
        // сайт может меняться, но так как мы запускаем без головы
        // мы не можем контролировать размер окна.
        //мы можем запустить какой-то размер окна по умолчанию.
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        // 18)
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options); //21) I will put options here.
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
    private static WebDriver getOperaDriver() {
        WebDriverManager.operadriver().setup();
        return new OperaDriver();
    }


    //12)
    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}