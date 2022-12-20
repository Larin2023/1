        package PageObjectsLesson9;
        import org.openqa.selenium.*;
        import org.openqa.selenium.support.ui.ExpectedConditions;

        public class MainPageLesson9 extends BasePageLesson9 {
        public MainPageLesson9(WebDriver driver) {
        super(driver);
    }
        private WebElement getHomeButton() {
            By homeBy = By.className("logout");
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return driver.findElement(homeBy);
        }
        private WebElement getPlaylistById(String playlistId) {
            return driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        }
        private WebElement getPlaylistEditField() {
            return driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        }
        private WebElement getCreatePlaylistField() {
            return driver.findElement(By.xpath("//*[@name='name']"));
        }
        public boolean isMainPageLesson9() {
            try {
                return getHomeButton().isDisplayed();
            } catch (TimeoutException err) {
            return false;
        }
    }
        private WebElement getNewPlaylistItem() {
            return driver.findElement(By.xpath("//li[@data-testid='playlist-context-menu-create-simple']"));
        }
        private WebElement getPlusButton() {
            By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle create']");
            wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }
         public String createPlaylistLesson9(String playlistName) {
        String playlistId = "";
        getPlusButton().click();
        getNewPlaylistItem().click();
        getCreatePlaylistField().sendKeys(playlistName);
        getCreatePlaylistField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='success show']")));
        return driver.getCurrentUrl().split("/")[5];
    }
        private By getPlaylistBy(String playlistId) {
            return By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
        }
        public boolean isPlaylistExistLesson9(String playlistId, String playlistName) {
            try {
                return driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']")).getText().equals(playlistName);
            } catch (NoSuchElementException xx) {
                return false;
            }
        }
}