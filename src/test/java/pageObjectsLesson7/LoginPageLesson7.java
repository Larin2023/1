package pageObjectsLesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageLesson7 {
    // 1)
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public LoginPageLesson7(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5, 1);

    }
    // 2) давайте создадим геттеры:

    // public WebElement getEmailField() {

        // 12)
      private WebElement getEmailField() {

        // 5) put a Waiter:
        By emailBy = By.xpath("//*[@type='email']");

        // 6)
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
        return driver.findElement(emailBy);
    }

    // 3)
//    public WebElement getPasswordField() {

    //  13)
    private WebElement getPasswordField() {
        return driver.findElement(By.xpath("//*[@type='password']"));

    }
        // 4)
//    public WebElement getLoginButton(){

        // 14)
        private WebElement getLoginButton() {
            return driver.findElement(By.tagName("button"));
        }

        // 7)
        public void loginToApp (String username, String password){

//    public MainPage loginToApp(String username, String password){

            // 8)
            //---------------------------------
            //        //по сути я два шага соединил в один шаг:
//     WebElement emailField = getEmailField();
//     emailField.sendKeys(username);
            // -----------------------------------
            // 9) я могу это всё в одной:
            getEmailField().sendKeys(username);

            // 10)
            getPasswordField().sendKeys(password);
            getLoginButton().click();
            // 11) вот эти гетеро использую внутри класса снаружи класса использовать не собираюсь.
            //давай-ка я сделаю them private


//        return new MainPage(driver);  // она вернет объект класса mind page
//    }
//    public void open(){
//        driver.get("https://bbb.testpro.io");
//    }
//    // NEGATIVE TEST
//    public boolean isError(){
//        By errorBy = By.className("error");
//        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
//            return true;
//        } catch (TimeoutException err){
//            return false;
        }
    }
