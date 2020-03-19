package stepdefinition.facebook;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import framework.webPages.facebook.FacebookLandingPageWeb;

public class SignupSD {

    private FacebookLandingPageWeb homePage = new FacebookLandingPageWeb();

    @Then("^I verify gender (female|male) is selected$")
    public void genderValidation(String gender) {

        if (gender.equals("female")) {
            if (!homePage.isGenderFemaleSelected()) {
                homePage.selectGenderFemale();
            }
            Assert.assertTrue(homePage.isGenderFemaleSelected());
        } else if (gender.equals("male")) {
            if (!homePage.isGenderMaleSelected()) {
                homePage.selectGenderMale();
            }
            Assert.assertTrue(homePage.isGenderMaleSelected());


        }
    }
}
