package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoaderPage {
    private WebDriver driver;


    @FindBy(xpath = "//a[@href='loader.html']")
    private WebElement menuButton1;

    @FindBy(xpath = "//a[@href ='loader.html']")
    private WebElement loaderPage;


    @FindBy(id = "//button[@id=\"loaderBtn\"]")
    private WebElement clickMeButton;

    public WebElement getClickMeButton() {
        return clickMeButton;
    }

    public void clickLoaderPage() throws InterruptedException {
        Thread.sleep(3000);
        loaderPage.click();
    }

    public void clickMenuButton() throws InterruptedException {
        Thread.sleep(3000);
        menuButton1.click();
        System.out.println("Test");
    }

    public void clickTheButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", clickMeButton);

    }

}