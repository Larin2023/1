            package Lesson7pageObjects;

            import org.openqa.selenium.By;
            import org.openqa.selenium.TimeoutException;
            import org.openqa.selenium.WebDriver;
            import org.openqa.selenium.WebElement;
            import org.openqa.selenium.support.ui.ExpectedConditions;
            import org.openqa.selenium.support.ui.Wait;
            import org.openqa.selenium.support.ui.WebDriverWait;
            import java.time.Duration;


            public class LoginPageLesson7 {
// 1)
                // идея токая, каждая страница это отдельно класс.
                // локаторы это геттеры.

                // мы создаем класс который соответствует странице.
                //каждая страница это класс.
            //к каждой страницы мы создаем отдельно класс.
            // локаторы это getters.
            //идея мы создаем класс который соответствует page:
            // We create:
            //    pageObjects
            //        LoginPage
            //        MainPage
            //    pageObjectsTests
            //        LoginToApp
            //        PlaylistTest

            // LoginPage=LoginToApp
            // MainPage=PlaylistTest

            //идея такая: мы делаем getters.
            //getters это веб-элементы (функции, методы),
            // это какие-то большие куски функционал, например целый логин мы объединяем в один метод.
            // мы можем делать позитив логин мы можем делать негатив логин.

            //подтверждаем что мы находимся на странице это какая-то boolean функция.

                private WebDriver driver;
                private Wait<WebDriver> wait;

                public LoginPageLesson7(WebDriver driver) {
                    this.driver = driver;
                    wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1));
                }
// 2)
                // у нас каждый элемент будет геттером, то есть как поля оно нас не интересны.
                // они интересны нам как геттеры.
                //
                // давайте создадим геттеры:

                // public WebElement getEmailField() { // we changed it to private

// 12)
            // we changed it to private
                private WebElement getEmailField() {  // то есть он мне должен возвращать веб элемент этот getter
                                                        // то есть когда я его вызвал он мне возвратит web элемент


// 5)
                // put a Waiter:
                    By emailBy = By.xpath("//*[@type='email']");

// 6)
                    wait.until(ExpectedConditions.invisibilityOfElementLocated(emailBy));
                    return driver.findElement(emailBy);
                }

// 3)
                 //    public WebElement getPasswordField() { // we changed it to private

// 13)
                // we changed it to private
                private WebElement getPasswordField() { // когда я вызвал этот getter он должен мне поле password возвращать.
                    return driver.findElement(By.xpath("[type='password']"));

                }
// 4)
                //  public WebElement getLoginButton(){  // we changed it to private

// 14)
                // we changed it to private
                private WebElement getLoginButton() {
                    return driver.findElement(By.tagName("button"));
                }

 // 7)
                // мне надо создать теперь метод который будет осуществлять логин. для логина мне надо подать username и password
                public MainPageLesson7 loginToAppLesson7(String username, String password) {
                    // я взял username и мне надо его отправить в email field

//18)
                    // так как открывается новая страница,
                    //надо исправить
                    //  public void loginToAppLesson7(String username, String password) {
                    // to
                    //  public MainPageLesson7 loginToAppLesson7(String username, String password) {
                    // я верну новую страницу, нового object.
                    // теперь она будет возвращять не void MainPageLesson7 которого у нас пока нет

// 8)
                    //---------------------------------
                    //        //по сути я два шага соединил в один шаг:
                    //     WebElement emailField = getEmailField();
                    //     emailField.....
                    //      вместо этого я просто напишу     getEmailField().sendKeys(username);
                    // -----------------------------------
// 9)
                    // я могу это всё в одной:
                    getEmailField().sendKeys(username); // отправяю username

// 10)
                    getPasswordField().sendKeys(password); // отправяю password
                    getLoginButton().click(); // нажать на кнопочку
// 11)
                    // вот эти гетеро использую внутри класса снаружи класса использовать не собираюсь.
                    //давай-ка я сделаю them private

//19)
                    return new MainPageLesson7(driver);  // она вернет объект класса mind page
                    // далее, создадим main page
                }

// 16)
                // мне надо еще один метод создать
                public void open() {
                    driver.get("https://bbb.testpro.io"); // открыть сайт
                }

// 25)
                // NEGATIVE TEST///////////////
                public boolean isError() {
                    By errorBy = By.className("error");
                    try {
                        wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
                        return isError();
                    } catch (TimeoutException err) {
                        return false;
                    }
                }
            }