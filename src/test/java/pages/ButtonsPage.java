package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage {


    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;

    @FindBy(xpath = "(//a[@href='buttons.html'])")
    private WebElement buttonLink;

    @FindBy(css = "button#btn_one")
    private WebElement buttonOne;

    @FindBy(css = "button#btn_two")
    private WebElement buttonTwo;

    @FindBy(css = "button#btn_three")
    private WebElement buttonThree;

    private static final String THIRD_BUTTON_CONFIRMATION_MESSAGE = "You clicked the third button!";
    private static final String SECOND_BUTTON_CONFIRMATION_MESSAGE = "You clicked the second button!";
    private static final String FIRST_BUTTON_CONFIRMATION_MESSAGE = "You clicked the first button!";

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }


    public void clickMenuButton() {
        waitForElementToBeVisible(menuButton);
        menuButton.click();
        System.out.println("Test");
    }

    public void clickLinkButtons() {
        waitForElementToBeVisible(buttonLink);
        buttonLink.click();

    }

    public void clickBtnOne() {
        waitForElementToBeVisible(buttonOne);
        buttonOne.click();
    }

    public void clickBtnTwo() {
        waitForElementToBeClickable(buttonTwo);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", buttonTwo);

    }

    public void clickBtnThree() {
        waitForElementToBeVisible(buttonThree);
        Actions action = new Actions(getDriver());
        action.click(buttonThree).build().perform();
    }

    public void assertMessageAppeared() {
        String confirmationMessage = getDriver().switchTo().alert().getText();
        Assert.assertEquals("The confirmation message was not displayed!", THIRD_BUTTON_CONFIRMATION_MESSAGE, confirmationMessage);
    }

    public void assertMessageForButtonTwoAppeared() {
        String confirmationMessageTwo = getDriver().switchTo().alert().getText();
        Assert.assertEquals("The confirmation message was not displayed for button two!", SECOND_BUTTON_CONFIRMATION_MESSAGE, confirmationMessageTwo);
    }

    public void assertMessageForButtonOneAppeared() {
        String confirmationMessageOne = getDriver().switchTo().alert().getText();
        Assert.assertEquals("The confirmation message was not displayed for button one!", FIRST_BUTTON_CONFIRMATION_MESSAGE, confirmationMessageOne);

    }
}

