package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoaderPage extends BasePage {


    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;

    @FindBy(linkText = "LOADER")
    private WebElement loaderPage;


    @FindBy(css = "button#loaderBtn")
    private WebElement clickMeButton;

    public LoaderPage(WebDriver driver) {
        super(driver);
    }
    private static final String LOADING_COMPLETED_CONFIRMATION = "And you have clicked the button!";

    public void clickMenuButton() {
        waitForElementToBeVisible(menuButton);
        menuButton.click();
        System.out.println("Test");
    }

    public void clickLoaderPage() {
        loaderPage.click();
    }

    public void clickTheButton() {
        waitForElementToBeVisible(clickMeButton);
        clickMeButton.click();

    }
    public void assertLoadingCompleteAppeared(){
        waitForElementToBeVisible(clickMeButton);
        String confirmationLoadingComplete = driver.findElement(By.cssSelector("p#p_wording")).getText();
        Assert.assertEquals("The confirmation message was not displayed!", LOADING_COMPLETED_CONFIRMATION, confirmationLoadingComplete);
    }


}
