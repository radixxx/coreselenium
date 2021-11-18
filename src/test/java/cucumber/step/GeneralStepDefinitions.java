package cucumber.step;

import cucumber.action.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import site.ui.actions.base.BaseActions;
import site.ui.pom.google.GooglePage;
import utils.Config;

public class GeneralStepDefinitions {
    private WebDriver driver;
    protected Actions actions;
    protected GooglePage googlePage;

    @Given("navigate to page")
    public void navigateTo() {
        actions.navigate("https://www.google.com/");
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
