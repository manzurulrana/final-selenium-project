package stepdefinition.facebook;

import cucumber.api.java.en.Given;
import framework.webPages.facebook.FacebookLandingPageWeb;
import framework.webPages.facebook.MessengerLoginPageWeb;
import framework.webPages.facebook.MessengerPageWeb;
import org.testng.Assert;
import stepdefinition.SharedSD.SharedSD;

public class MessengerSD {

    private FacebookLandingPageWeb homePage = new FacebookLandingPageWeb();
    private MessengerPageWeb messengerPage = new MessengerPageWeb();
    private MessengerLoginPageWeb messengerLoginPage = new MessengerLoginPageWeb();

    @Given("^I am on messenger page$")
    public void setMessengerPage() {
        homePage.clickOnMessengerLink();
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.messenger.com/");
    }


}
