package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ContactFormsPage extends BasePage{

    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;

    @FindBy(xpath = "//a[@href='contactForm.html']")
    private WebElement contactForm;

    @FindBy(css = "input[name='first_name']")
    private WebElement  enterName;

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

    public void clickMenuButton()  {
        menuButton.click();
        System.out.println("Test");
    }

    public void clickContactUsForm() throws InterruptedException {
        Thread.sleep(3000);
        contactForm.click();

    }
    public void enterNameField () throws InterruptedException, IOException {
        Properties prop = Utils.getPropertiesFile();
        Thread.sleep(3000);
       enterName.sendKeys(prop.getProperty("firstName"));
    }

    public void enterLastNameField () throws InterruptedException, IOException {
        Properties prop = Utils.getPropertiesFile();
        Thread.sleep(3000);
        enterLastName.sendKeys(prop.getProperty("lastName"));
    }

    public void enterEmailAddressField () throws InterruptedException, IOException {
        Properties prop = Utils.getPropertiesFile();
        Thread.sleep(3000);
        enterEmailAddress.sendKeys(prop.getProperty("emailAddress"));
    }

    public void enterCommentsField () throws InterruptedException, IOException {
        Properties prop = Utils.getPropertiesFile();
        Thread.sleep(3000);
        enterComments.sendKeys(prop.getProperty("comments"));
    }

    public void pressSubmitButton () throws InterruptedException {
        Thread.sleep(5000);
        submitButton.click();
    }

}