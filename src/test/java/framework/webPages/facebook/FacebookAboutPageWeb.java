package framework.webPages.facebook;

import framework.webPages.BasePages.WebBasePage;
import org.openqa.selenium.By;

public class FacebookAboutPageWeb extends WebBasePage {
    private By create_a_PageBtn = By.xpath("(//button[@type = 'submit'])[1]");

    public void clickOnCreate_A_PageBtn(){
        clickOn(create_a_PageBtn);
    }
}
