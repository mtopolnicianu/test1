package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


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


    public ButtonsPage(WebDriver driver) {
        super(driver);
    }


    public void clickMenuButton() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#sidebar']")));
        menuButton.click();
        System.out.println("Test");
    }

    public void clickLinkButtons() throws Throwable {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='buttons.html'])")));
        buttonLink.click();

    }

    public void clickBtnOne() throws Throwable {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#btn_one")));
        buttonOne.click();
    }

    //JavaScriptExecutor click() method
    public void clickBtnTwo() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"btn_two\"]")));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//  js.executeScript("document.getElementById('btn_two').click()", buttonTwo);

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", buttonTwo);

    }

    //Action Move & Click method
    public void clickBtnThree() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"btn_three\"]")));
        Actions action = new Actions(getDriver());
        action.click(buttonThree).build().perform();
    }


}
