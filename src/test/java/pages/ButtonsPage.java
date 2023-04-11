package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class ButtonsPage {
    private WebDriver driver;


    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;

    @FindBy(xpath = "(//a[@href='buttons.html'])")
    private WebElement buttonLink;

    @FindBy(css = "button#btn_one")
    private WebElement buttonOne;

    @FindBy(xpath = "//button[@id=\"btn_two\"]")
    private JavascriptExecutor buttonTwo;

    @FindBy(xpath = "//button[@id=\"btn_three\"]")
    private WebElement buttonThree;



    public void clickMenuButton() throws Throwable {
        Thread.sleep(5000);
        menuButton.click();
        System.out.println("Test");
    }

    public void clickLinkButtons () throws Throwable {
        Thread.sleep(3000);
        buttonLink.click();

    }
    public void clickBtnOne () throws Throwable {
        Thread.sleep(3000);
        buttonOne.click();
    }

    //JavaScriptExecutor click() method
    public void clickBtnTwo() throws Throwable {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.getElementById('btn_two').click()", buttonTwo);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", buttonTwo);

    }

    //Action Move & Click method
    public void clickBtnThree() throws Throwable {
        Actions action = new Actions (driver);
        action.click(buttonThree).build().perform();
    }


}
