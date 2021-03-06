package stepdefinition.facebook;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.facebook.FacebookLandingPageWeb;
import framework.webPages.facebook.MessengerLoginPageWeb;
import framework.webPages.facebook.FacebookLoginPageWeb;
import org.testng.Assert;
import stepdefinition.SharedSD.SharedSD;

/**
 * Created by mohammadmuntakim.
 */
public class LoginSD {

    private FacebookLandingPageWeb homePage = new FacebookLandingPageWeb();
    private MessengerLoginPageWeb loginPage = new MessengerLoginPageWeb();
    private FacebookLoginPageWeb fbLoginPage = new FacebookLoginPageWeb();

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Facebook - Log In or Sign Up", "Invalid Home Page");
    }

    @When("^I enter (.+) into (username|password|firstname|lastname|mobile number|new password) text fields on home screen$")
    public void enterDataIntoTextFields(String anyText, String textFields) {


        switch (textFields) {
            case "username":
                homePage.enterEmail(anyText);
                break;
            case "password":
                homePage.enterPassword(anyText);
                break;
            case "firstname":
                homePage.enterFirstName(anyText);
                break;
            case "lastname":
                homePage.enterLastName(anyText);
                break;
            case "mobile number":
                homePage.enterMobileNumberOrEmail(anyText);
                break;
            case "new password":
                homePage.enterNewPassWord(anyText);
                break;
        }
    }

    @When("^I click on (login|create account) button on home screen$")
    public void clickOnLoginButton(String button) {

        switch (button) {
            case "login":
                homePage.clickLoginButton();
                break;
            case "create account":
                //Implement Create account object
                break;
        }
    }

    @Then("^I verify that i am an invalid login page$")
    public void verifyInvalidLoginPage() {
        Assert.assertEquals(loginPage.getPageTitle(), "Log Into Facebook");
    }

    @Then("^I verify invalid signup error message$")
    public void verifySignUpErrorMessage() {
        Assert.assertEquals(fbLoginPage.getErrorMessage(), "Invalid signup");
    }
}
