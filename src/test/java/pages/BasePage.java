package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriverWait wait;
    public WebDriver driver;


    public BasePage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    }

    public WebDriver getDriver() {
        return driver;
    }

}
       // new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));



