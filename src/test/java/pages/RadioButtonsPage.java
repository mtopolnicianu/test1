package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonsPage {

    private WebDriver driver;


    @FindBy(xpath = "//input[@id=\"demo-priority-low\"]")
    private WebElement radioButtonOne;

    @FindBy(xpath = "//input[@id=\"demo-priority-normal\"]")
    private WebElement radioButtonTwo;

    public void selectRadioButtonOne() throws Throwable {
        Thread.sleep(3000);
        radioButtonOne.click();
        System.out.println(radioButtonOne.isSelected());

//        radioButtonOne.isDisplayed();
//        radioButtonOne.isEnabled();
//        radioButtonOne.isSelected();
//        radioButtonOne.getText();
//        System.out.println(radioButtonOne.getText());
    }

    public void selectRadioButtonTwo() throws Throwable {
        Thread.sleep(3000);
        radioButtonTwo.click();
        System.out.println(radioButtonTwo.isSelected());

    }
}
