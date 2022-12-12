package simpleTestLessons3456;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelLoginLesson4 {

     //  1) позетивный тест

    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException { // 5)
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //  2) мы создаем webdriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");

        // 12) нам надо подождать (страницы не успевает открываться)
        Thread.sleep(1000);

        // 6)
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        // 7)
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        // 8)
        //теперь надо голубую кнопку найти
        // ее можно найти просто по tagname потому что это единственный tag на странице
        WebElement loginButton = driver.findElement(By.tagName("button"));
        // 9)
        //теперь мне надо в имел отправить мой email
        email.sendKeys("alexander.v.anderson@gmail.com");
        // 10) put the password
        password.sendKeys("te$t$tudent");
        // 11) click the blue button
        loginButton.click();

        Thread.sleep(2000);

        // 13) последний штрих мы должны подтвердить что мы зашли на страницу
        WebElement home = driver.findElement(By.cssSelector(".home")); //*[@class = 'home active']
        // 14)
        Assert.assertTrue(home.isDisplayed()); //я должен сказать что внутри будет true. If it is displayed he вернет
        // вам boolion то есть если он дисплее он вернет true.

        Thread.sleep(5000);// 4) надо поставить add exception to метод signature
        driver.quit(); // 3)
    }

//    15) негативный тест


        @Test
        // 16) change to incorrect
        public void loginToKoel_incorrectCredentials () throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://bbb.testpro.io/");
            Thread.sleep(1000);
            WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
            WebElement password = driver.findElement(By.cssSelector("[type='password']"));
            WebElement loginButton = driver.findElement(By.tagName("button"));

            email.sendKeys("alexander.v.anderson@gmail.com");

            // 17) вместо пароля правильного пароля я отправляю какую bad password
            password.sendKeys("wrongPassword");
            loginButton.click();

            // 19) две секунды слишком много Thread.sleep(2000);
            Thread.sleep(500);

            /// 18) и я должен искать элемент css селектору "error"
            WebElement home = driver.findElement(By.cssSelector(".error")); //*[@class = 'home active']
            //надо поймать вот этот момент когда эта вещь горит

            Assert.assertTrue(home.isDisplayed()); //я должен сказать что внутри будет true. If it is displayed he вернет
            // вам boolion то есть если он дисплее он вернет true.

            Thread.sleep(5000);
            driver.quit();
        }
    }
