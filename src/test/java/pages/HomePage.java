package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {


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

    @FindBy(xpath = "//h1[@class=\"ud-heading-xl clp-lead__title clp-lead__title--small\"]")
    private WebElement seleniumWebDriverAndJavaLink;

    @FindBy(xpath = "//h1[@class=\"ud-heading-xl clp-lead__title clp-lead__title--small\"]")
    private WebElement cucumberBddSeleniumJavaCoursePage;

    @FindBy(xpath = "//h1[@class=\"ud-heading-xl clp-lead__title clp-lead__title--small\"]")
    private WebElement selectorsAndLocatorsPage;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickMenuButton() {
        waitForElementToBeClickable(menuButton);
        menuButton.click();
        System.out.println("Test");
    }

    public void clickHomeButtonMenu() {
        waitForElementToBeClickable(homePageButtonMenu);
        homePageButtonMenu.click();
    }

    public void clickAccessLink() {
        waitForElementToBeClickable(seleniumWebdriverJavaLink);
        seleniumWebdriverJavaLink.click();
    }

    public void clickAccessLink2() {
        waitForElementToBeVisible(cucumberBDDWithSeleniumJava);
        cucumberBDDWithSeleniumJava.click();
    }

    public void clickAccessLink3() {
        waitForElementToBeVisible(masteringSelectorsLocators);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()", masteringSelectorsLocators);
    }

    public void assertVerifyTheExamplesPage() {
        Assert.assertTrue(seleniumWebDriverAndJavaLink.isDisplayed());
    }

    public void assertVerifyTheSeleniumCourses() {
        Assert.assertTrue(cucumberBddSeleniumJavaCoursePage.isDisplayed());
    }

    public void assertVerifyTheSelectorsLocatorsCourses() {
        Assert.assertTrue(selectorsAndLocatorsPage.isDisplayed());
    }
}


