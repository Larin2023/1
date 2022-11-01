//package pageObjectsLesson12;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import javax.swing.*;
//
//public class MainPageLesson12 extends BasePage {
//    private static Logger logger = LogManager.getLogger(MainPageLesson12.class); // 2) I am using "org.apache.logging.log4j2
//    public MainPageLesson12(WebDriver driver) {
//        super(driver);
//    }
//
//    private WebElement getPlusButton() {
//        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle control create']");
//        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
//        return driver.findElement(plusButtonBy);
//    }
//
//    private WebElement getNewPlaylistItem() {
//        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
//    }
//
//    private WebElement getCreatePlaylistField() {
//        return driver.findElement(By.xpath("//*[@class='create=']/input"));
//    }
//
//    public boolean isMain() {
//        By homeBy = By.className("home");
//        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
//            return true;
//        } catch (TimeoutException xx) {
//                                                         //7)
//            logger.fatal("Wrong page");
//            return false;
//        }
//    }
//
//    public String createPlaylist(String playlistName) {
//                                                         //5)
//        logger.trace("in create playlist method");
//                                                        // 3)
//        logger.debug("Create Playlist with name -> "+playlistName);
//        getPlusButton().click();
//                                                        //6)
//        logger.trace("plus button clicked");
//        getNewPlaylistItem().click();
//        getCreatePlaylistField().sendKeys(playlistName);
//        getCreatePlaylistField().sendKeys(Keys.RETURN);
//        By successBy = By.xpath("//*[class='success show']");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
//        return driver.getCurrentUrl().split("/")[5];
//    }
//    private By getPlaylistBy(String playlistId) {
//        return By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
//    }
//    public boolean checkPlaylist(String playlistId, String playlistName) {
//
//        try {
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            By playlistBy = getPlaylistBy(playlistId);
//            WebElement playlist = driver.findElement(playlistBy);
//            js.executeScript("arguments[0].scrollIntoView();", playlist);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
//            String name = driver.findElement(playlistBy).getText();
//            return name.equals(playlistName);
//        } catch (TimeoutException c) {
//            return false;
//        }
//    }
//    public void renamePlaylist(String playlistId, String newPlaylistName) {
//                                                    //4)
//        logger.debug("Updating playlist id "+playlistId);
//        logger.debug("New playlist name = "+newPlaylistName);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        By playlistBy = getPlaylistBy(playlistId);
//        WebElement playlist = driver.findElement(playlistBy);
//        js.executeScript("arguments[0].scrollIntoView();", playlist);
//        Action actions = new Action(driver);
//        actions.doubleClick(playlist).perform();
//        WebElement editingField = getEditPlaylistField();
//        editingField.sendKeys(Keys.CONTROL+"A");
//        editingField.sendKeys(newPlaylistName);
//        editingField.sendKeys(Keys.RETURN);
//        try {
//            Thread.sleep(5000);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//    private WebElement getEditPlaylistField() {
//        By editBy = By.xpath("//*[@type='text']");
//        wait.until(ExpectedConditions.elementToBeClickable(editBy);
//        return   driver.findElement(editBy);
//    }
//}