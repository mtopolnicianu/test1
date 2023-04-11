package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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
    private RadioButtonsPage radioButtonsPage;

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
        radioButtonsPage = PageFactory.initElements(driver, RadioButtonsPage.class);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;

    }

//    @After
//    public void after() {
//        driver.quit();
//    }

    @Given("I access the ([^\"]*) page$")
    public void accessPage(String link) {
        driver.get(link);
    }

    @When("^I click the menu button$")
    public void clickMenu() throws Throwable {
        homePage.clickMenuButton();
    }
    @When("^I click the menu button$")
    public void Menuclicked() throws Throwable {
        loaderPage.clickMenuButton();
    }

    @And("^I click the home page link$")
    public void gotoPage() throws Throwable {
        homePage.clickHomeButtonMenu();
    }

    @Then("^I access the \"Selenium Webdriver & Java\" link$")
    public void accessLink() throws Throwable {
        homePage.clickAccessLink();

    }

    @Then("^I should be redirected to the Cucumber BDD with Selenium & Java examples$")
    public void accessLink2() throws Throwable {
        homePage.clickAccessLink2();
    }

    @Then("^I should be redirected to the Selectors/Locator course page$")
    public void accessLink3() throws Throwable {
        Thread.sleep(6000);
        homePage.clickAccessLink3();
    }

    @When("^I click the menu button1$")
    public void menuButton1() throws Throwable {
        loaderPage.clickMenuButton();
        Thread.sleep(6000);
    }

    @Then("^I click on the \"Click me\" button on the loader page")
    public void clickMeButton() throws Throwable {
        loaderPage.clickTheButton();

    }


    @When("^I click the Menu button2$")
    public void clickMenuPrincipal() throws Throwable {
        buttonsPage.clickMenuButton();
    }

    @And("^I choose the Buttons link from the menu list$")
    public void gotoButtons() throws Throwable {
        buttonsPage.clickLinkButtons();
    }

    @Then("^I click on the first button from button page$")
    public void clickWebElementButton() throws Throwable {
        buttonsPage.clickBtnOne();
    }

    @And("^I click on the 'Contact us from test' link from the menu list$")
    public void clickContactForm() throws Throwable {
        contactFormsPage.clickContactUsForm();

    }

    @And("^I fill with all the information in the contact form  page$")
    public void enterDataofClient() throws Throwable {
        contactFormsPage.enterNameField();
        contactFormsPage.enterLastNameField();
        contactFormsPage.enterEmailAddressField();
        contactFormsPage.enterCommentsField();
    }

    @Then("^I click Submit the form$")
    public void clickOnSubmitButton() throws Throwable {
        contactFormsPage.pressSubmitButton();

    }


    @Then("^I click on the \"Button Two\" from button page$")
    public void clickOnButtonTwo() throws Throwable {
        buttonsPage.clickBtnTwo();
    }

    @Then("^I click on the Button Three from button page$")
    public void clickOnButtonThree() throws Throwable {
        buttonsPage.clickBtnThree();
    }

    //Scenarios for dropDopwn page
    @Given("^the user access the ([^\"]*) page$")
    public void linkMenu(String link) {
        driver.get(link);

    }

    @When("^the user clicked on the menu button$")
    public void clickMenuButton() throws Throwable {
        dropDownPage.clickDropDownPage();
    }

    @Then("^the user can choose one of the option from dropdown list$")
    public void dropDownList() throws Throwable {
        dropDownPage.selectAnOption();

    }

    @Then("^the user clicked on the \"one\" radio button from Radio Buttons list$")
    public void clickRadioButtonOne() throws Throwable {
        Thread.sleep(3000);
        radioButtonsPage.selectRadioButtonOne();
    }

    @Then("^the user clicked on the \"two\" radio button from Radio Buttons list$")
    public void clickRadioButtonTwo() throws Throwable {
        Thread.sleep(3000);
        radioButtonsPage.selectRadioButtonTwo();
    }
}







