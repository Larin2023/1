package simpleTestLessons3456;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SimpleTestLesson3 {
    // 1)
    //нужно закачать в наш проект chrome драйвер
    @Test
    public void udemySearch() throws InterruptedException { //6) "Thread.sleep(5000);" может вызвать exception, поэтому я добавлю "throws InterruptedException {" here.

        // 2)
        //поставте system property
        System.setProperty("web-driver.chrome.driver", "chromedriver");

        // 3) мы создаем web-driver
        WebDriver driver = new ChromeDriver();  // create the driver //левой части webdriver and справа драйвер
        // web-driver is интерфейс
        //веб-интерфейс web-driver содержит 13 абстрактных функций которые мы даже учить не будемю
        //смысла нету учить все

        // 4)
        driver.get("https://humans.net/");  // open the page

        // 7)
        //найдем элемент который называется searchField
        //веб-элементы это такой классб он тоже интерфейсб
        // который содержит информациюю
        //что можно сделать себе по элементам?
        // на него можно кликнуть, на него можно submitted,
        // на него может послать клавиши, его можно почистить например об элементе
        //уже какой-то тексте если мы хотим почистить по элементам,
        // вытащить текст из него.
        //теперь мне надо этот элемент web элемент найти черт, давайте откроем humans
        WebElement searchField = driver.findElement(By.xpath("(//*[@role='combobox'])"));


        // 8) теперь я хочу вот этот элемент отправить текст "cleaning"
        searchField.sendKeys("cleaning");


        // 9) дальше я должен нажать кнопку enter
        searchField.sendKeys(Keys.ENTER);

        // 5)
        Thread.sleep(5000);

        // 10) нам надо assert. теперь я должен найти веб элемент ""339 results for""
        WebElement result = driver.findElement(By.tagName("h2"));

        // 11) теперь я должен убедиться что tagName содержит 339 результатов
        Assert.assertEquals("339 results for",result.getText());

        Thread.sleep(5000);  // here we pause for 5 sec
        //sleep может вызвать exception поэтому я добавлю exception

        driver.quit(); // closed the page
    }
}

