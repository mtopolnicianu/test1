package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.time.Duration;

public class LoaderPage extends BasePage {


    @FindBy(xpath = "//a[@href='loader.html']")
    private WebElement menuButton1;

    @FindBy(xpath = "//a[@href ='loader.html']")
    private WebElement loaderPage;


    @FindBy(id = "//button[@id=\"loaderBtn\"]")
    private WebElement clickMeButton;

    public LoaderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getClickMeButton() {
        return clickMeButton;
    }

    public WebElement getLoaderPage() {
        return loaderPage;
    }

    public WebElement getMenuButton1() {return menuButton1;

    }

    public void clickLoaderPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loaderPage.click();
    }

    public void clickMenuButton()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        menuButton1.click();
        System.out.println("Test");

    }

    public void clickTheButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", menuButton1);

    }

}