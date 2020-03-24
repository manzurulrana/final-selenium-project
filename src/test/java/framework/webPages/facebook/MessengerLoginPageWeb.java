package framework.webPages.facebook;

import framework.webPages.BasePages.WebBasePage;
import org.openqa.selenium.By;

public class MessengerLoginPageWeb extends WebBasePage {
    //locators
    private By emailOrPhoneNumberErrorMessage = By.xpath("//div[contains(text(), 'Incorrect email or phone number')]");

    //methods
    public String getEmailOrPhoneNumberErrorMessage(){
        return getTextFromElement(emailOrPhoneNumberErrorMessage);
    }
}
