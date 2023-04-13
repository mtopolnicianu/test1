package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class ContactFormsPage extends BasePage {

    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;

    @FindBy(xpath = "//a[@href='contactForm.html']")
    private WebElement contactForm;

    @FindBy(css = "input[name='first_name']")
    private WebElement enterName;

    @FindBy(css = "input[name='last_name']")
    private WebElement enterLastName;

    @FindBy(css = "input[name='email']")
    private WebElement enterEmailAddress;

    @FindBy(css = "textarea[name='message']")
    private WebElement enterComments;

    @FindBy(css = "input[type='submit']")
    private WebElement submitButton;

    public ContactFormsPage(WebDriver driver) {
        super(driver);
    }

    public void clickMenuButton() {
        menuButton.click();
        System.out.println("Test");
    }

    public void clickContactUsForm() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        contactForm.click();

    }

    public void enterNameField() throws IOException {
        Properties prop = Utils.getPropertiesFile();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        enterName.sendKeys(prop.getProperty("firstName"));
    }

    public void enterLastNameField() throws IOException {
        Properties prop = Utils.getPropertiesFile();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        enterLastName.sendKeys(prop.getProperty("lastName"));
    }

    public void enterEmailAddressField() throws IOException {
        Properties prop = Utils.getPropertiesFile();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        enterEmailAddress.sendKeys(prop.getProperty("emailAddress"));
    }

    public void enterCommentsField() throws IOException {
        Properties prop = Utils.getPropertiesFile();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        enterComments.sendKeys(prop.getProperty("comments"));
    }

    public void pressSubmitButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        submitButton.click();
    }

}