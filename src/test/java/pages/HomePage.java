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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", masteringSelectorsLocators );
        masteringSelectorsLocators.click();
    }

    public void assertVerifyTheExamplesPage() {

        WebElement seleniumWebDriverAndJavaLink = driver.findElement(By.cssSelector(".ud-main-content-wrapper .header--gap-auth-button--vj50D:nth-child(8) span"));
        Assert.assertEquals(true, seleniumWebDriverAndJavaLink.isDisplayed());
    }

    public void assertVerifyTheSeleniumCourses() {
        WebElement cucumberBddSeleniumJavaCoursePage = driver.findElement(By.xpath("//body[@id='udemy']/div[@class='ud-main-content-wrapper']/div[1]//a[@href='https://www.udemy.com/join/signup-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2Fcourse%2Fcucumber-bdd-selenium-java-complete-automation-course%2F%3FcouponCode%3D9DCA359EA4A0BC9B7F1F']/span[.='Sign up']"));
        Assert.assertEquals(true, cucumberBddSeleniumJavaCoursePage.isDisplayed());
    }
    public void assertVerifyTheSelectorsLocatorsCourses() {

        WebElement selectorsAndLocatorsPage = driver.findElement(By.cssSelector(".ud-main-content-wrapper nav [class='ud-text-sm header--dropdown-button-text--2OxOV']"));
        Assert.assertEquals(true, selectorsAndLocatorsPage.isDisplayed());
    }
}


