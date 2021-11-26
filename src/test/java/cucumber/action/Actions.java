package cucumber.action;

import org.openqa.selenium.WebDriver;
import site.ui.actions.base.BaseActions;
import site.ui.pom.google.GooglePage;


public class Actions extends BaseActions {

    public  GooglePage googlePage;

    public Actions(WebDriver driver) {
        super(driver);
        googlePage = new GooglePage(driver);
    }

    public void changeLanguagePage_RU() {
        googlePage.clickOnRussionLanguageButton();
    }

    public void changeLanguagePage_RO() {
        googlePage.clickOnRomanianLanguageButton();
    }
}
