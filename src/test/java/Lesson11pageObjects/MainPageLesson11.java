package Lesson11pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPageLesson11 extends BasePageLesson11{
    public MainPageLesson11(WebDriver driver) {
        super(driver);
    }
    private WebElement getHomeButton(){
        By homeBy = By.className("logout");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        return driver.findElement(homeBy);
    }
    private WebElement getPlaylistById(String playlistId){
        return driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
    }
    private WebElement getPlaylistEditField(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("[@type='text']")));
        return driver.findElement(By.xpath("//*[@type='text']"));
    }

    public boolean isMainPage() {
        try {
            return getHomeButton().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }
    private WebElement getNewPlaylistField(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='create']/input")));
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }
    private void clickPlusButton() {
        By plusButtonBy = By.cssSelector(".fa-plus-circle");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        for (int i=0;i<5;i++){
            try{
                Actions actions = new Actions(driver);
                actions.click(driver.findElement(plusButtonBy)).build().perform();
                driver.findElement(plusButtonBy).click();
                driver.findElement(By.xpath("//*[text()='New Playlist']")).click();
                return;
            } catch (ElementClickInterceptedException ignored){

            }
        }
    }

    public String createPlaylist(String playlistName) {
        clickPlusButton();
        getNewPlaylistField().sendKeys(playlistName);
        getNewPlaylistField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId, String playlistName) {
        try{
            return getPlaylistById(playlistId).getText().equals(playlistName);
        } catch (NoSuchElementException xx){
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = getPlaylistById(playlistId);
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).build().perform();
//        actions.doubleClick(playlist).build().perform();
        getPlaylistEditField().sendKeys(Keys.CONTROL+"a");
        getPlaylistEditField().sendKeys(newName);
        getPlaylistEditField().sendKeys(Keys.ENTER);
    }
}