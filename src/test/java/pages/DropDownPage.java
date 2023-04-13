package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class DropDownPage extends BasePage{

    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;

    @FindBy(xpath = "//a[@href ='dropdown.html']")
    private WebElement dropDownPage;
    @FindBy(xpath = "//input[@id=\"demo-priority-low\"]")
    private WebElement radioButtonOne;
    @FindBy(xpath = "//input[@id=\"demo-priority-normal\"]")
    private WebElement radioButtonTwo;

    @FindBy(name = "cars")
    private WebElement menuItem;

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public void clickMenuButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        menuButton.click();
        System.out.println("Test");
    }

    public void clickDropDownPage() throws InterruptedException {
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#sidebar']"))));
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dropDownPage.click();
    }

    public void selectAnOption() throws InterruptedException {
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.name("cars"))));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select select = new Select(menuItem);
        select.selectByValue("honda");
        select.selectByVisibleText("Honda");


    }
    public void selectRadioButtonOne()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        radioButtonOne.click();
        System.out.println(radioButtonOne.isSelected());

//        radioButtonOne.isDisplayed();
//        radioButtonOne.isEnabled();
//        radioButtonOne.isSelected();
//        radioButtonOne.getText();
//        System.out.println(radioButtonOne.getText());
    }

    public void selectRadioButtonTwo() throws Throwable {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        radioButtonTwo.click();
        System.out.println(radioButtonTwo.isSelected());

    }
}