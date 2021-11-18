package cucumber.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import site.ui.actions.base.BaseActions;
import site.ui.pom.google.GooglePage;

public class GeneralStepDefinitions {

    private GooglePage googlePage;
    private BaseActions baseActions;

    public GeneralStepDefinitions(WebDriver driver) {
        googlePage = new GooglePage(driver);
    }

    @Given("navigate to page")
    public void navigateTo() {
         this.baseActions.navigate();
    }

    @When("change page lang to RO")
    public void changeLanguagePage_RO() {
        googlePage.clickOnRomanianLanguageButton();
    }

    //@When("change page lang to RU")
    @Then("change page lang to RU")
    public void changeLanguagePage_RU() {
        googlePage.clickOnRussionLanguageButton();
    }

}
