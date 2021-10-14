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
import utils.Config;

import static utils.Config.SitePage;

public class StartPage extends BaseTest {

    private GoogleActions googleActions;

    @BeforeEach
    public void actionsInit(){
        googleActions = new GoogleActions(driverManager.getDriver());
    }

    @Test
    @DisplayName("Change language On Google page")
    public void changeLangOfPage(){
        Log.info("Change the language to russian on Google start page");
        googleActions.navigate(Config.SitePage);
        googleActions.changeLanguagePage_RU();
        googleActions.changeLanguagePage_RO();

        driverManager.quitDriver();
    }

}
