//package pageObjectsTestsLesson13;
//
////import listeners.GetScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.BrowserType;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
//
//
//public class BaseTestLesson13 {
//    protected WebDriver driver;
//    protected String username;
//    protected String password;
//    @Parameters({"username","password","browser"})
//    @BeforeMethod
//    public void starUp(String email, String password,String browser)
//    {
//        username = email;
//        this.password = password;
//        BrowserType browserType = browser.equals("chrome") ? BrowserType.CHROME : BrowserType.FIREFOX;
//        driver = BrowserFactory.getDriver(browserType);
//    }
//    @AfterMethod
//                                             //9) качестве аргумента должен подать iTestResult
//    public void tearDown(ITestResult iTestResult) throws InterruptedException {
//        if (iTestResult.getStatus()==iTestResult.FAILURE){
//            GetScreenshot.capture(driver,iTestResult.getName());
//        }
//        System.out.println("In the after method - > Driver will be killed soon");
//        driver.quit();
//    }
//}