package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;

    @FindBy(xpath = "(//a[@href='index.html'])")
    private WebElement homePageButtonMenu;

    @FindBy(linkText = ("Selenium Webdriver & Java"))
    private WebElement seleniumWebdriverJavaLink;

    @FindBy(linkText = ("Cucumber BDD with Selenium & Java"))
    private WebElement cucumberBDDWithSeleniumJava;

    @FindBy(linkText = ("Mastering Selectors/Locators"))
    private WebElement masteringSelectorsLocators;



    public void clickMenuButton() throws InterruptedException {
        Thread.sleep(3000);
        menuButton.click();
        System.out.println("Test");
    }

    public void clickHomeButtonMenu() throws InterruptedException {
        Thread.sleep(3000);
        homePageButtonMenu.click();
    }

    public void clickAccessLink() throws InterruptedException {
        Thread.sleep(3000);
        seleniumWebdriverJavaLink.click();
    }

    public void clickAccessLink2() throws InterruptedException {
        Thread.sleep(3000);
        cucumberBDDWithSeleniumJava.click();
    }

    public void clickAccessLink3() throws InterruptedException {
        Thread.sleep(3000);
        masteringSelectorsLocators.click();
    }

}



