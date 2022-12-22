                package Lesson3simpleTest_4_5_6_;

                import org.openqa.selenium.*;
                import org.openqa.selenium.chrome.ChromeDriver;
                import org.openqa.selenium.support.ui.*;
                import org.testng.Assert;
                import org.testng.annotations.AfterMethod;
                import org.testng.annotations.BeforeMethod;
                import org.testng.annotations.Test;

                import java.time.Duration;
                //Synchronizations

// 1)
                // мы работаем с фронтэнд. некоторые элементы у нас подгружаются не сразу.
                // некоторые элементы появляются и исчезают не сразу.
                //допустим когда мы вводим неправильный пароль у нас появляется и исчезает элемент.
                //не постоянно интервал он никому не нужен и наш вопрос как с этим бороться?
                // с этим борется синхронизации.

                // вообще есть два вида синхронизации implicit wait and explicit wait.
                //implicit wait подразумевает неявное.
                // explicit wait = явное.
                // елементы через какое-то время появляется, через
                //какое-то время исчезают. то есть вот такие вещи мы хотим понять как с этим работать.

                //explicit wait ставится только там где нам надо ждать.
                // implicit wait ждет по чуть чуть но везде.

// 2)
                // уберем все thread слипы, они нам не нужны.

                public class simpleTestLesson6 {

                    private WebDriver driver;
// 4)
                // на этом уровне я создам новую переменную
                    private Wait<WebDriver> wait;
//12)
                // на этом уровне я создам новую переменную
                    private Wait<WebDriver> fluentWait;


                    @BeforeMethod  // annotation мы ставим перед какой-нибудь функции
                    public void starUp() throws InterruptedException {
                        System.setProperty("webdriver.chrome.driver", "chromedriver");
                        driver = new ChromeDriver();
                        driver.get("https://bbb.testpro.io/");

// 2)
                // (this implicit wait method is deprecated!!!!!!) после создания драйвера, мы должны установить implicit wait
                        // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
                        //я написал если элемента нету, жди его 10 секунд максимум, если 10
                        //секунд прошло элемент не появился значит скорее всего
                        //этого элемента нету.
                        //иногда implicit wait не работает. стрелы элемент есть еще другие и при них implicit wait не работает
                        //вторая проблема в том что он ждет каждый раз. он ждет каждый елемент. нам на самом деле надо дождаться только e-mail.
                        //и считается что он увеличивает время тестов.
                        // поэтому implicit wait в реальной жизни не используются.

// 3)
                        //explicit wait:
                        //2 types of explicit wait (Thread.sleep это один из видов explicit wait):
                        // Wait<WebDriver> wait and fluentWait
                        //лишние секунды мы убрали, теперь мы ждём ровно столько сколько нам надо.
                        //благодаря вот этой переменной "webdriverwait" ждем максимум 5 секунд через
                        //каждые 200 миллисекунд мы опрашиваем дом и мы ее ставим только в том месте где
                        //нам действительно надо ждать.
                        //если в Thread.sleep мы пишем 2 секунды. а вдруг элемент появился ну через пол секунды.
                        // значит полторы секунды мы ждем просто так. это неправильно. а если у нас тысячу тестов?
                        //умножить на полторы секунды сколько это будет?
                        //полторы тысячи секунд или 20 минут 25
                        //это много то есть 25 минут дополнительно.
                        wait = new WebDriverWait(driver,Duration.ofSeconds(5, 1));

// 11)
                //        // fluentWait
                //        принципе он работает абсолютно точно также как webdriver вы только у него другой синтаксис
// 13)
                        fluentWait = new FluentWait<>(driver)
                                .pollingEvery(Duration.ofMillis(200)) // это как sleepin
                                .withTimeout(Duration.ofSeconds(5)) //максимальное время которое готов wait
                                //я хочу игнорировать exception.
                                .ignoring(NoSuchElementException.class)  // не перепутайте используйте из класса :org.openqa.selenium
                                .ignoring(ElementClickInterceptedException.class)
                                .ignoring(ElementNotInteractableException.class)
                                .ignoring(StaleElementReferenceException.class);
                        driver.get("https://bbb.testpro.io/");

                    }
                    @AfterMethod
                    public void tearDown() throws InterruptedException {
                        System.out.println("In the after method - > Driver will be killed soon");
                        driver.quit();
                    }

                    @Test
                    public void loginToKoel_correctCredentials() {
// 5)
                        // код должен быть сухим давайте создадим новую переменную:
                        By emailBy = By.xpath("//*[@type='email']");

// 4)
                        // здесь я хочу ждать пока не появится e-mail и когда он только появится тогда я его сохраню.
                        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='email']")));

// 6)
                        // (explicit wait) и теперь вот этот e-mail я могу вот сюда отправить
                        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));

// 7)
                        // и могу подправить его соответственно сюда:
                        // WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
                        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));

                        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
                        WebElement loginButton = driver.findElement(By.tagName("button"));

                        email.sendKeys("alexander.v.anderson@gmail.com");
                        password.sendKeys("te$t$tudent");
                        loginButton.click();

// 8)
                        // now we need to do it here (for not repeating the code)
                        By homeBy = By.cssSelector(".home");

// 10)
                        // (explicit wait) здесь я хочу ждать пока не появится e-mail и когда он только появится тогда я его сохраню.
                        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));

// 9)
                        // we take "By.cssSelector(".home")" from here
                        //WebElement home = driver.findElement(By.cssSelector(".error"));
                        WebElement home = driver.findElement(homeBy);
                        Assert.assertTrue(home.isDisplayed());
                    }

// 14)
                    // а здесь и мы будем использовать fluentWait
                    // негативный тест

                    @Test
                    public void loginToKoel_incorrectCredentials() {

// 15)
                        By emailBy = By.xpath("//*[@type='email']");
// 16)
                        fluentWait.until(x->x.findElement(emailBy).isDisplayed());
                        // мы ждем пока элемент будет Displayed.
                        //если вы поищите эту форму в интернете, для java очень трудно найти. эта форма я вытащил из c#.


                        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
                        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
                        WebElement loginButton = driver.findElement(By.tagName("button"));

                        email.sendKeys("alexander.v.anderson@gmail.com");

                        password.sendKeys("wrongPassword");
                        loginButton.click();

// 17)
                    // повторю вот для этого места
                        By errorBy = By.cssSelector(".error");
                        fluentWait.until(x->x.findElement(errorBy).isDisplayed());
                        WebElement home = driver.findElement(errorBy);
                        Assert.assertTrue(home.isDisplayed());
                    }
                    @Test
                    public void loginToKoel_createPlaylist() {
                        By emailBy = By.xpath("//*[@type='email']");
                        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));

// 18)
                    // we will put here "emailBy"
                        // WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
                        WebElement email = driver.findElement(emailBy);

                        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
                        WebElement loginButton = driver.findElement(By.tagName("button"));

                        email.sendKeys("alexander.v.anderson@gmail.com");
                        password.sendKeys("te$t$tudent");
                        loginButton.click();

// 20)
                        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle create']");
                        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));

// 19)
                    // я вот этот ""//*[@class='fa fa-plus-circle create']"" вытащил отдельный класс:
                        // WebElement plusButton = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle create']"));
                        WebElement plusButton = driver.findElement(plusButtonBy);

                        plusButton.click();
                        WebElement newPlaylist = driver.findElement(By.xpath("//li[@data-testid='playlist-context-menu-create-simple']"));
                        newPlaylist.click();
                        WebElement textField = driver.findElement(By.xpath("//*[@name='name']"));
                        textField.sendKeys("XXXX");
                        textField.sendKeys(Keys.RETURN);

// 20)
                    // я вот этот "//div[@class='success show']"вытащил отдельный класс:
                        //WebElement green = driver.findElement(By.xpath("//div[@class='success show']"));
                        By successBy = By.xpath("//div[@class='success show']");
                        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));

                        WebElement green = driver.findElement(successBy);
                        Assert.assertTrue(green.isDisplayed());
                    }
                }
                //Thread.sleep это один из видов explicit wait
                //если в Thread.sleep мы пишем 2 секунды. а вдруг элемент появился ну через пол секунды.
                // значит полторы секунды мы ждем просто так. это неправильно. а если у нас тысячу тестов?
                //умножить на полторы секунды сколько это будет?
                //полторы тысячи секунд или 20 минут 25
                //это много то есть 25 минут дополнительно.
