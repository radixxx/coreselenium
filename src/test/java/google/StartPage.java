package google;

import base.BaseTest;
import core.Wait;
import core.driver.manager.base.DriverManager;
import core.logger.Log;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import site.ui.actions.GoogleActions;

public class StartPage extends BaseTest {

    private GoogleActions googleActions;

    @BeforeEach
    public void actionsInit(){
        googleActions = new GoogleActions(driverManager.getDriver());
    }

    @Test
    @DisplayName("Change language Of Google page")
    public void changeLangOfPage(){
        Log.info("Change the langiage to russian on Google start page");
        googleActions.navigate("https://www.google.ru/");
        googleActions.changeLanguagePage_RU();
        googleActions.changeLanguagePage_RO();

        driverManager.quitDriver();
    }

}
