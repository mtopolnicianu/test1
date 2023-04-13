package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TestStorePage extends BasePage {

    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;
    @FindBy(xpath = "//nav[@id='menu']/ul//a[@href='http://teststore.automationtesting.co.uk/']")
    private WebElement testStorePage;
    @FindBy(xpath = "//section[@id='content']/section/div/article[1]//img[@alt='Hummingbird printed t-shirt']")
    private WebElement hummingbirdTshirt;
    @FindBy(css = ".add-to-cart.btn.btn-primary")
    private WebElement hummingbirdTshirtAdded;

    public TestStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickMenuButton() {
        waitForElementToBeVisible(menuButton);
        menuButton.click();
        System.out.println("Test");
    }

    //    public void clickTestStorePage () {
//        waitForElementToBeVisible(testStorePage);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(testStorePage).click().perform();
    public void clickTestStorePage() {
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("scroll(0, 250)");

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", testStorePage);

    }

    public void assertTestStorePage() {
        WebElement contactUsOption = driver.findElement(By.cssSelector("div#contact-link > a"));
        Assert.assertEquals("Contact us", contactUsOption);
    }

    public void selectHummingbirdTshirt() {
        waitForElementToBeVisible(hummingbirdTshirt);
        hummingbirdTshirt.click();
    }

    public void addHummingbirdTshirt() {
        waitForElementToBeVisible(hummingbirdTshirtAdded);
        hummingbirdTshirtAdded.click();
    }

//    public void assertShoppingCartTotal(){
    //  waitForElementToBeVisible(hummingbirdTshirtAdded);
//        System.out.println(driver.findElement(By.cssSelector(".product-total > .value")).getText());
//    }

    public void assertShoppingCartTotal() {
        String total = driver.findElement(By.cssSelector(".product-total > .value")).getText();
        Assert.assertEquals("$26.11", total);
    }
}
