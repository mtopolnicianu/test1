package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoaderPage extends BasePage {


    @FindBy(xpath = "//a[@href='#sidebar']")
    private WebElement menuButton;

    @FindBy(xpath = "//a[@href=\"loader.html\"]")
    private WebElement loaderPage;


    @FindBy(xpath = "//button[@id=\"loaderBtn\"]")
    private WebElement clickMeButton;

    @FindBy(css = "p#p_wording")
    private WebElement confirmationLoadingComplete;

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
        Assert.assertTrue("The button was not clicked!",confirmationLoadingComplete.getText().contains("And you have clicked the button!"));
    }


}
