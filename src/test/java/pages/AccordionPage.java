//package pages;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class AccordionPage {
//
//    @FindBy(xpath = "//a[@href=\"#sidebar\"]")
//    private WebElement menuButton;
//
//    @FindBy(xpath = "//a[@href=\"accordion.html\"]")
//    private WebElement testAccordionPage;
//
//    @FindBy(css = ".accordion > div:nth-of-type(1)")
//    private WebElement platformPortabilityOptionOpened;
//
//    @FindBy(css = ".accordion > div:nth-of-type(1)")
//    private WebElement platformPortabilityOptionClosed;
//
//
//    public void clickMenuButton() {
//        menuButton.click();
//        System.out.println("Test");
//    }
//
//    public void selectAccordionOption() {
//        testAccordionPage.click();
//    }
//
//    public void extendedTextBySelectingThePlatformPortabilityOption() {
//        platformPortabilityOptionOpened.click();
//
//    }
//
//    public void closedTextBySelectingThePlatformPortabilityOption() {
//        platformPortabilityOptionClosed.click();
//
//    }
//}
