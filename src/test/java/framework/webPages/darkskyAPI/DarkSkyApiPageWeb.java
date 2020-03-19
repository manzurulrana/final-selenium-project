package framework.webPages.darkskyAPI;

import framework.webPages.BasePages.WebBasePage;
import org.openqa.selenium.By;

public class DarkSkyApiPageWeb extends WebBasePage {

    private By signUpButton = By.xpath("//a[@href='/dev/register' and text() ='Sign Up']");

    public DarkSkyRegistrationPageWeb clickOnSignUpButton() {
        clickOn(signUpButton);
        return new DarkSkyRegistrationPageWeb();
    }
}
