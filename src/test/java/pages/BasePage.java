package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriverWait wait;
    public WebDriver driver;


    public BasePage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForElementToBeClickable (WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}


