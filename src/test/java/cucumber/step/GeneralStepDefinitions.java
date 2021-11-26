package cucumber.step;

import cucumber.action.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GeneralStepDefinitions {

    Hook hook;
    Actions actions;

    @Given("navigate to page")
    public void navigateTo() {
        hook.actions.navigate("https://www.google.com/");
    }

    @When("change page lang to RO")
    public void changeLanguagePage_RO() {
        actions.changeLanguagePage_RO();
    }

    @Then("change page lang to RU")
    public void changeLanguagePage_RU() {
        actions.changeLanguagePage_RU();
    }

}
