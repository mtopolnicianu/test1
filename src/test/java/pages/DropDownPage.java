package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;

    @FindBy(xpath = "//a[@href ='dropdown.html']")
    private WebElement dropDownPage;

    @FindBy(name = "cars")
    private WebElement menuItem;

    public void clickMenuButton() throws InterruptedException {
        Thread.sleep(5000);
        menuButton.click();
        System.out.println("Test");
    }

    public void clickDropDownPage() throws InterruptedException {
        Thread.sleep(3000);
        dropDownPage.click();
    }

    public void selectAnOption() throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(menuItem);
        select.selectByValue("honda");
        select.selectByVisibleText("Honda");


    }
}