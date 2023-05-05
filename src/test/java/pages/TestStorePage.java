package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestStorePage extends BasePage {

    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;
    @FindBy(xpath = "//nav[@id='menu']/ul//a[@href='http://teststore.automationtesting.co.uk/']")
    private WebElement testStorePage;
    @FindBy(xpath = "//section[@id='content']/section/div/article[1]//img[@alt='Hummingbird printed t-shirt']")
    private WebElement firstItem;
    @FindBy(xpath = "//button[@class=\"btn btn-primary add-to-cart\"]")
    private WebElement firstItemAdded;
    @FindBy(xpath = "//h4[@id=\"myModalLabel\"]")
    private WebElement successfullyAddedToCartMessage;

    public TestStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickMenuButton() {
        waitForElementToBeVisible(menuButton);
        menuButton.click();
        System.out.println("Test");
    }

    public void clickTestStorePage() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", testStorePage);

    }

    public void assertTestStorePage() {
        WebElement contactUsOption = driver.findElement(By.cssSelector("div#contact-link > a"));
        Assert.assertEquals("Contact us", contactUsOption.getText());
    }

    public void selectFirstItemFromProducts() {
        waitForElementToBeVisible(firstItem);
        firstItem.click();
    }

    public void addFirstItemFromProducts() {
        firstItemAdded.click();
    }

    public void assertShoppingCartTotal() {
        Assert.assertTrue("The product was not added to the cart", successfullyAddedToCartMessage.getText().contains("Product successfully added to your shopping cart"));
    }
}
