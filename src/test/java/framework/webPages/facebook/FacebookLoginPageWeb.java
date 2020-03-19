package framework.webPages.facebook;

import framework.webPages.BasePages.WebBasePage;

import org.openqa.selenium.By;

public class FacebookLoginPageWeb extends WebBasePage {
    //Locators
    private By loginError = By.xpath("//a[text()='Forgot Password?']");
    private By incorrectPasswordErrorMessage = By.xpath("//div[starts-with(text(), 'The password')]");

    //Methods
    public String getErrorMessage() {

        return getTextFromElement(loginError);
    }

    public String getIncorrectPasswordErrorMessage(){

        return getTextFromElement(incorrectPasswordErrorMessage);
    }
}
