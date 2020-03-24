package framework.webPages.facebook;

import framework.webPages.BasePages.WebBasePage;
import org.openqa.selenium.By;

public class MessengerPageWeb extends WebBasePage {
    //locators
    private By signUpButton = By.id("loginbutton");

    //methods
    public MessengerLoginPageWeb clickOnSignUpButton(){
        clickOn(signUpButton);
        return new MessengerLoginPageWeb();
    }
}
