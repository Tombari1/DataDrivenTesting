package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BlueSkyCitadelForm {
     WebDriver driver;


    @Given("^I navigate to blueskycitadelform site$")
    //@Given("I navigate to blueskycitadelform site")
    public void i_navigate_to_blueskycitadelform_site()  {
        //STEP 2: set your system path
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        //STEP 3: Instantiate your firefox driver
        driver = new FirefoxDriver();

        //STEP 4: Navigate to url
        driver.get("http://blueskycitadel.com/");

    }

    @When("^I click on Automation Testing Form$")
    public void iClickOnAutomationTestingForm() {
        driver.findElement(By.linkText("Automation Testing Form")).click();

    }

    @And("^I enter the Single Line Text$")
    public void iEnterTheSingleLineText()  {
        driver.findElement(By.xpath("//*[@id=\"nf-field-135\"]")).sendKeys("My first line");

    }

    @And("^I click on the Home link$")
    public void iClickOnTheHomeLink() {
        driver.findElement(By.linkText("Home")).click();
    }

    @And("^I click on the About link$")
    public void iClickOnTheAboutLink() {
        driver.findElement(By.linkText("About")).click();

    }

    @And("^I click on some menu links$")
    public void iClickOnSomeMenuLinks() {
        driver.findElement(By.linkText("Events")).click();
        driver.findElement(By.linkText("Contact")).click();

    }

    @Then("^I close my window$")
    public void iCloseMyWindow() {
        driver.close();

    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() {
        driver.findElement(By.id("nf-field-124")).sendKeys("myblueskyemail@test.com");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        driver.findElement(By.name("nf-field-144")).sendKeys("MySecureBlueSkyCitadelPassword");
    }

    @And("^I click on the radio button$")
    public void iClickOnTheRadioButton() {
        driver.findElement(By.cssSelector("#nf-label-class-field-138-0")).click();
    }

    @And("^I refresh the page$")
    public void iRefreshThePage() {
        driver.navigate().refresh();
    }

    @And("^I get the url title$")
    public void iGetTheUrlTitle() {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

    }

    @And("^I get the url of the page$")
    public void iGetTheUrlOfThePage() {
        String myUrl = driver.getCurrentUrl();
        System.out.println(myUrl);
    }

    @And("^I get the page Source$")
    public void iGetThePageSource() {
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }

    @And("^I get the Window Handle$")
    public void iGetTheWindowHandle() {
        String pageHnadle = driver.getWindowHandle();
        System.out.println(pageHnadle);

    }

    @And("^I get the form page title$")
    public void iGetTheFormPageTitle() {
        String pageFormTitle = driver.findElement(By.className("entry-title")).getText();
        System.out.println(pageFormTitle);

    }

    @And("^I get the attribute of an element$")
    public void iGetTheAttributeOfAnElement() {
        String pageFormAttribute =  driver.findElement(By.className("entry-title")).getAttribute("class");
        System.out.println(pageFormAttribute);
    }

    @And("^I type the password$")
    public void iTypeThePassword() {
        driver.findElement(By.name("nf-field-144")).sendKeys("Mypassword");

    }

    @And("^I clear the Password$")
    public void iClearThePassword() {

        driver.findElement(By.name("nf-field-144")).clear();

    }

    @And("^I click on the submit button$")
    public void iClickOnTheSubmitButton() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-133-wrap\"]")).click();

    }

    @Then("^I navigate back to the previous page$")
    public void iNavigateBackToThePreviousPage() {
        driver.navigate().back();
    }

    @And("^I navigate to the next page using the forward button$")
    public void iNavigateToTheNextPageUsingTheForwardButton() {
        driver.navigate().forward();
    }

    @And("^the password error message is displayed$")
    public void thePasswordErrorMessageIsDisplayed() {

        String errorMessage = driver.findElement(By.cssSelector("#nf-form-errors-9 > nf-errors > nf-section > div")).getText();
        System.out.println(errorMessage);

        boolean isMessageDisplayed =  driver.findElement(By.cssSelector("#nf-form-errors-9 > nf-errors > nf-section > div")).isDisplayed();
        System.out.println(isMessageDisplayed);
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("nf-field-124")).sendKeys("myblueskyemail@test.com");
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String arg0) throws Throwable {
            driver.findElement(By.name("nf-field-144")).sendKeys("MySecureBlueSkyCitadelPassword");
        }

    @Then("^I get the outcome \"([^\"]*)\"$")
    public void iGetTheOutcome(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("nf-field-124")).sendKeys("myblueskyemail@test.com");
    }

    @And("^I click on Login/Register$")
    public void iClickOnLoginRegister() {
        driver.findElement(By.linkText("Register / Login")).click();


    }

    @And("^I click on Register now$")
    public void iClickOnRegisterNow() {
        driver.findElement(By.partialLinkText("Register now")).click();
    }

    @When("^I enter the username$")
    public void iEnterTheUsername() {
        driver.findElement(By.id("user_login")).sendKeys("MyUsername");

    }

    @And("^I enter the email address$")
    public void iEnterTheEmailAddress() {
        driver.findElement(By.id("user_email")).sendKeys("MyUsername");

    }

    @And("^I enter the password$")
    public void iEnterThePassword() {
        driver.findElement(By.id("user_pass")).sendKeys("MyUsername");

    }

    @And("^I confirm the password$")
    public void iConfirmThePassword() {
        driver.findElement(By.id("user_confirm_password")).sendKeys("MyUsername");

    }

    @Then("^I click on the submit$")
    public void iClickOnTheSubmit() {
        driver.findElement(By.cssSelector("#user-registration-form-1243 > form > div.ur-button-container > button")).click();
    }

    @When("^I enter the username \"([^\"]*)\"$")
    public void iEnterTheUsername(String username) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("user_login")).sendKeys(username);

    }

    @And("^I enter the email address \"([^\"]*)\"$")
    public void iEnterTheEmailAddress(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("user_email")).sendKeys(email);
    }

    @And("^I enter the password \"([^\"]*)\"$")
    public void iEnterThePassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("user_pass")).sendKeys(password);
    }

    @And("^I confirm the password \"([^\"]*)\"$")
    public void iConfirmThePassword(String confirmPassword) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("user_confirm_password")).sendKeys(confirmPassword);
    }

    @And("^I confirm an error message is displayed$")
    public void iConfirmAnErrorMessageIsDisplayed() {
        driver.findElement(By.className("user-registration-error")).isDisplayed();
    }

    @And("^I confirm that \"([^\"]*)\" is displayed$")
    public void iConfirmThatIsDisplayed(String message) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        String errorMessage = driver.findElement(By.className("user-registration-error")).getText();
       // Assert.assertTrue(errorMessage == message);
       // errorMessage.contains("Please enter a valid email address.");
      //  errorMessage.equals("Please enter a valid email address.");
      //  Assert.assertEquals(errorMessage, "Please enter a valid email address.");
        Assert.assertEquals(errorMessage, message);

    }
}
