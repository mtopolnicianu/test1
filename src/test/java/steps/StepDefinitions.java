package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;


public class StepDefinitions {
    private WebDriver driver;
    private HomePage homePage;
    private LoaderPage loaderPage;
    private ButtonsPage buttonsPage;
    private ContactFormsPage contactFormsPage;
    private DropDownPage dropDownPage;
    private DropRadioButtonsPage dropRadioButtonsPage;
    private TestStorePage testStorePage;

    @Before
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = PageFactory.initElements(driver, HomePage.class);
        loaderPage = PageFactory.initElements(driver, LoaderPage.class);
        buttonsPage = PageFactory.initElements(driver, ButtonsPage.class);
        contactFormsPage = PageFactory.initElements(driver, ContactFormsPage.class);
        dropDownPage = PageFactory.initElements(driver, DropDownPage.class);
        dropRadioButtonsPage = PageFactory.initElements(driver, DropRadioButtonsPage.class);
        testStorePage = PageFactory.initElements(driver, TestStorePage.class);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;

    }

    @After
    public void after() {
        driver.quit();
    }

    @Given("I access the ([^\"]*) page$")
    public void accessPage(String link) {
        driver.get(link);
    }

    @When("^I click the menu button$")
    public void clickMenu() {
        homePage.clickMenuButton();
    }

    @And("^I click the home page link$")
    public void gotoPage() {
        homePage.clickHomeButtonMenu();
    }

    @Then("^I access the \"Selenium Webdriver & Java\" link$")
    public void accessLink() {
        homePage.clickAccessLink();

    }

    @Then("^I should be redirected to the Cucumber BDD with Selenium & Java examples$")
    public void accessLink2() {
        homePage.clickAccessLink2();

    }

    @Then("^I should be redirected to the Selectors/Locator course page$")
    public void accessLink3() {
        homePage.clickAccessLink3();
    }

    @And("^I select the loader option from menu$")
    public void clickLoaderPageFromMenu (){
        loaderPage.clickLoaderPage();
    }
    @Then("^I click the \"Click me\" button$")
    public void pressClickOnClickMeButton (){
        loaderPage.clickTheButton();
    }

    @When("^I click the Menu button2$")
    public void clickMenuPrincipal() {
        buttonsPage.clickMenuButton();
    }

    @And("^I choose the Buttons link from the menu list$")
    public void gotoButtons() {
        buttonsPage.clickLinkButtons();
    }

    @Then("^I click on the first button from button page$")
    public void clickWebElementButton() {
        buttonsPage.clickBtnOne();
    }

    @And("^I click on the 'Contact us from test' link from the menu list$")
    public void clickContactForm() {
        contactFormsPage.clickContactUsForm();

    }

    @And("^I fill with all the information in the contact form  page$")
    public void enterDataOfClient() throws Throwable {
        contactFormsPage.enterNameField();
        contactFormsPage.enterLastNameField();
        contactFormsPage.enterEmailAddressField();
        contactFormsPage.enterCommentsField();
    }

    @Then("^I click Submit the form$")
    public void clickOnSubmitButton() {
        contactFormsPage.pressSubmitButton();

    }

    @Then("^I click on the \"Button Two\" from button page$")
    public void clickOnButtonTwo() {
        buttonsPage.clickBtnTwo();
    }

    @Then("^I click on the Button Three from button page$")
    public void clickOnButtonThree() {
        buttonsPage.clickBtnThree();
    }

    //Scenarios for dropDopwn page
    @Given("^the user access the ([^\"]*) page$")
    public void linkMenu(String link) {
        driver.get(link);

    }

    @When("^the user clicked on the menu button$")
    public void clickMenuButton() throws InterruptedException {
        dropDownPage.clickDropDownPage();
    }

    @Then("^the user can choose one of the option from dropdown list$")
    public void dropDownList() throws InterruptedException {
        dropDownPage.selectAnOption();

    }

    @Then("^the user clicked on the \"one\" radio button from Radio Buttons list$")
    public void clickRadioButtonOne() {
        dropDownPage.selectRadioButtonOne();
    }

    @Then("^the user clicked on the \"two\" radio button from Radio Buttons list$")
    public void clickRadioButtonTwo() {
        dropDownPage.selectRadioButtonTwo();
    }

    @And("^I verify that the confirmation message appeared$")
    public void iVerifyThatTheConfirmationMessageAppeared() {
        buttonsPage.assertMessageAppeared();
    }

    @And("^I verify that the confirmation message for button two appeared$")
    public void iVerifyThatTheConfirmationMessageForButtonTwoAppeared() {
        buttonsPage.assertMessageForButtonTwoAppeared();
    }

    @And("^I verify that the confirmation message for button one appeared$")
    public void iVerifyThatConfirmationMessageForButtonOneAppeared() {
        buttonsPage.assertMessageForButtonOneAppeared();
    }

    @And("^I verify that I am redirected to the confirmation message for submitted form$")
    public void verifyTheSubmittedConfirmationMessage() {
        WebElement submittedButton = driver.findElement(By.xpath("//div[@id='main']/div[@class='inner']//h3[.='Thank you for your mail!']"));
        Assert.assertEquals(true, submittedButton.isDisplayed());

    }

    @And("^I verify that the confirmation for loading completed appeared$")
    public void verifyLoadingCompleteConfirmationMessage() {
        loaderPage.assertLoadingCompleteAppeared();
    }

    @And("^I verify that I am redirected to the examples page$")
    public void verifyTheExamplesPage() {
        homePage.assertVerifyTheExamplesPage();

    }

    @And("^I verify that I am redirected to the Cucumber BDD with Selenium&Java examples page$")
    public void verifyCucumberBddCoursePage() {
        homePage.assertVerifyTheSeleniumCourses();
    }

    @And("^I verify that I am redirected to the Mastering Selectors/Locators page$")
    public void verifySelectorsLocatorsPage() {
        homePage.assertVerifyTheSelectorsLocatorsCourses();
    }

    @And("^I verify that the radio button one is selected after performing the action 'click'$")
    public void verifyRadioButtonOneIsSelected() {
        dropDownPage.assertRadioButtonOne();
    }

    @And("^I verify that the radio button two is selected after performing the action 'click'$")
    public void verifyRadioButtonTwoIsSelected() {
        dropDownPage.assertRadioButtonTwo();
    }

    @And("^I verify the selected option is displayed$")
    public void verifyTheSelection() {
        dropDownPage.assertDropDownMenu();
    }

    @Then("^I click to the testStore page$")
    public void testStoreLink() throws InterruptedException {
        testStorePage.clickTestStorePage();
    }

    @And("^I verify that the testStore page is it opened correctly$")
    public void verifyTestStorePage() {
        testStorePage.assertTestStorePage();
    }

    @And("^I select the hummingbird T-Shirt$")
    public void tShirtSelected() {
        testStorePage.selectHummingbirdTshirt();
    }

    @And("^I have added into my cart the t-shirt")
    public void tShirtAdded() throws InterruptedException {
        testStorePage.addHummingbirdTshirt();
    }

    @Then("^I verify the total product$")
    public void verifyTheTotalPriceFromShoppingCart() throws InterruptedException {
        testStorePage.assertShoppingCartTotal();
    }
}







