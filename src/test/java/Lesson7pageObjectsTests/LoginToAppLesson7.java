            package Lesson7pageObjectsTests;

            import org.openqa.selenium.*;
            import org.openqa.selenium.chrome.ChromeDriver;
            import org.testng.Assert;
            import org.testng.annotations.AfterMethod;
            import org.testng.annotations.BeforeMethod;
            import org.testng.annotations.Test;
            import Lesson7pageObjects.LoginPageLesson7;
            import Lesson7pageObjects.MainPageLesson7;

            public class LoginToAppLesson7 {
// 15)
                private WebDriver driver; //надо сделать WebDriver глобальным
//18)
                @BeforeMethod
                public void starUp() throws InterruptedException {
                    System.setProperty("webdriver.chrome.driver", "chromedriver");
                    driver = new ChromeDriver();
                }
                @AfterMethod
                public void tearDown() throws InterruptedException {
                    System.out.println("In the after method - > Driver will be killed soon");
                    driver.quit();
                }

                ///мы не делаем нахождение трех элементов
                //у меня все прописанно в pageObject.
                // в старом случае мне пришлось бы ходить и менять.
                // теперь я иду в нашу функцию логина,меняю в одном месте.
                // это большое преимущество менять в одном месте.
                //я меняю локаторы где в getter один раз !!!
                // второе преимущество теперь наш тест не содержит вообще никакого selenium
                //в наших тестах остался чистота testng
                // all selemium lives in pageobjects

//17)
                ///////// POSITIVE TEST//
                @Test
                //тест состоит из 3 частей(здесь мы используем Snake case:
                //1. loginToApp. (название тестова класса)
                //2. correctCredentials (что я использую)
                //3. successfulLogin (expected result)
                public void loginToAppLesson7_correctCredentials_successfulLogin(){
                    LoginPageLesson7 loginPageLesson7 = new LoginPageLesson7(driver); // качестве аргумента я передаю туда драйвер
                    loginPageLesson7.open(); //это нам должно открыть страницу
                   // go to LoginPage

//22)
                    // я должен послать туда username и password
                    // я добавляю  MainPageLesson7 mainPageLesson7
                    // теперь когда я залогинился в апликэйшен мне вернуться объект типа MainPageLesson7
                    MainPageLesson7 mainPageLesson7 = loginPageLesson7.loginToAppLesson7("alexander.v.anderson@gmail.com", "te$t$tudent");
                    // теперь я нахожусь на моем пейдж. и что мне надо сделать?
                    // мне надо доказать что это main page при помощи класса Home.
                    // но перед этим мне нужно сделать Assert

//23)
                    Assert.assertTrue(mainPageLesson7.isMain()); //то есть mainPage вернет boolean
                }

                ///////// 26) NEGATIVE TEST/////////////////
                @Test
                public void loginToAppLesson7_incorrectCredentials_failedLogin(){
                    LoginPageLesson7 loginPageLesson7 = new LoginPageLesson7(driver);
                    loginPageLesson7.open();
                    loginPageLesson7.loginToAppLesson7("alexander.v.anderson@gmail.com", "wrongPassword");
                    Assert.assertTrue(loginPageLesson7.isError()); // он должен рернуть мне true
                }
            }
