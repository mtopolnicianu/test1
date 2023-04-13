package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class DropRadioButtonsPage extends BasePage {


    @FindBy(xpath = "//input[@id=\"demo-priority-low\"]")
    private WebElement radioButtonOne;

    @FindBy(xpath = "//input[@id=\"demo-priority-normal\"]")
    private WebElement radioButtonTwo;

    public DropRadioButtonsPage(WebDriver driver) {
        super(driver);
    }

    public void selectRadioButtonOne()  {
        waitForElementToBeClickable(radioButtonOne);
        radioButtonOne.click();
        System.out.println(radioButtonOne.isSelected());

//        radioButtonOne.isDisplayed();
//        radioButtonOne.isEnabled();
//        radioButtonOne.isSelected();
//        radioButtonOne.getText();
//        System.out.println(radioButtonOne.getText());
    }

    public void selectRadioButtonTwo() {
        waitForElementToBeClickable(radioButtonTwo);
        radioButtonTwo.click();
        System.out.println(radioButtonTwo.isSelected());

    }
}
