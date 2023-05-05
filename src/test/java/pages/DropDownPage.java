package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage{

    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;

    @FindBy(xpath = "//a[@href ='dropdown.html']")
    private WebElement dropDownPage;

    @FindBy(xpath = "//div[@id='main']/div[@class='inner']/div[1]//label[.='One']")
    private WebElement radioButtonOne;

    @FindBy(xpath = "//div[@id='main']/div[@class='inner']/div[1]//label[.='Two']")
    private WebElement radioButtonTwo;

    @FindBy(name = "cars")
    private WebElement menuItem;

    @FindBy(css = "input#demo-priority-low")
    private WebElement checkRadioButtonOne;

    @FindBy(css = "input#demo-priority-normal")
    private WebElement checkRadioButtonTwo;

    @FindBy(xpath = "//select[@id='cars']/option[@value='honda']")
    private WebElement menuItemOption;

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public void clickMenuButton() {
        waitForElementToBeVisible(menuButton);
        menuButton.click();
        System.out.println("Test");
    }

    public void clickDropDownPage() {
        waitForElementToBeVisible(dropDownPage);
        dropDownPage.click();
    }

    public void selectAnOption(){
        waitForElementToBeVisible(menuItem);
        Select select = new Select(menuItem);
        select.selectByVisibleText("Honda");

    }
    public void selectRadioButtonOne()  {
        waitForElementToBeVisible(radioButtonOne);
        radioButtonOne.click();
        System.out.println(radioButtonOne.isSelected());
        radioButtonOne.isDisplayed();
        radioButtonOne.isEnabled();
        radioButtonOne.isSelected();
        radioButtonOne.getText();
        System.out.println(radioButtonOne.getText());
    }

    public void selectRadioButtonTwo() {
        waitForElementToBeClickable(radioButtonTwo);
        radioButtonTwo.click();
        System.out.println(radioButtonTwo.isSelected());

    }

    public void assertRadioButtonOne(){
        radioButtonOne.click();
        waitForElementToBeVisible(radioButtonOne);
        Assert.assertTrue(checkRadioButtonOne.isSelected());
        System.out.println("Checkbox one is selected - Assert passed");
    }

    public void assertRadioButtonTwo(){
        radioButtonTwo.click();
        waitForElementToBeClickable(radioButtonTwo);
        Assert.assertTrue(checkRadioButtonTwo.isSelected());
        System.out.println("Checkbox two is selected - Assert passed");
    }
    public void assertDropDownMenu(){
        waitForElementToBeVisible(menuItemOption);
        Assert.assertTrue(menuItemOption.isSelected());
    }
}