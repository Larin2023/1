package simpleTestLessons3456;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//код должен быть сухой.
//для того чтобы сделать код более сухим здесь нам помогает testng

public class simpleTestLesson5 {
    private WebDriver driver; // 3) webdriver который я создал здесь.
//    не будет видим. за его пределами он не виден.
//    надо сделать его  WebDriver глобальным

    // 1)
    @BeforeMethod  // annotation BeforeMethod мы ставим перед какой-нибудь функции
    public void starUp() throws InterruptedException {

    // 2)
    // I took this section from each test, and put it here:
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://bbb.testpro.io/");
//        Thread.sleep(1000);

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        Thread.sleep(1000);
    }
    // 4) что нам дает AfterMethod?
    //даже если тест упал, AfterMethod все
    //равно будет запущен то есть мы все равно закроем наш драйвер.
    @AfterMethod
    public void tearDown() throws InterruptedException {
        System.out.println("In the after method - > Driver will be killed soon"); // мы можем написать это чтобы проверить закроиться ли драйвер.
        Thread.sleep(1000);
        driver.quit();
    }

    // positive test

    @Test
    public void loginToKoel_correctCredentials() throws InterruptedException {

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("alexander.v.anderson@gmail.com");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(2000);

        WebElement home = driver.findElement(By.cssSelector(".home"));
        Assert.assertTrue(home.isDisplayed());
    }

//    негативный тест

    @Test
    public void loginToKoel_incorrectCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("alexander.v.anderson@gmail.com");

        password.sendKeys("wrongPassword");
        loginButton.click();

        Thread.sleep(500);

        WebElement home = driver.findElement(By.cssSelector(".error"));
        Assert.assertTrue(home.isDisplayed());
    }
    @Test
    public void loginToKoel_createPlaylist() throws InterruptedException {

        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("alexander.v.anderson@gmail.com");
        password.sendKeys("te$t$tudent");
        loginButton.click();

        Thread.sleep(2000);
        WebElement plusButton = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle create']"));
        plusButton.click();
        WebElement newPlaylist = driver.findElement(By.xpath("//li[@data-testid='playlist-context-menu-create-simple']"));
        newPlaylist.click();
        WebElement textField = driver.findElement(By.xpath("//*[@name='name']"));
        textField.sendKeys("XXXX");
        textField.sendKeys(Keys.RETURN);
        Thread.sleep(200);
        WebElement green = driver.findElement(By.xpath("//div[@class='success show']"));
        Assert.assertTrue(green.isDisplayed());
    }
}
