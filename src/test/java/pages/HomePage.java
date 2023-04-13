package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{


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

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void clickMenuButton()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        menuButton.click();
        System.out.println("Test");
    }

    public void clickHomeButtonMenu()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePageButtonMenu.click();
    }

    public void clickAccessLink()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        seleniumWebdriverJavaLink.click();
    }

    public void clickAccessLink2() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cucumberBDDWithSeleniumJava.click();
    }

    public void clickAccessLink3() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        masteringSelectorsLocators.click();
    }

}



