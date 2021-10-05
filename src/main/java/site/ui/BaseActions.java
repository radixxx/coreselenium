package site.ui;

import core.logger.Log;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class BaseActions {

    private WebDriver driver;

    public BaseActions(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate(String url){
        Log.info("Navigating to [{}]", url);
        driver.navigate().to(url);
    }

    public void navigate(String ... urls){
        Arrays.asList(urls).forEach(this::navigate);
    }

}
