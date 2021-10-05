package core.manager.base;

import core.manager.DriverOptions;
import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;

    protected abstract void start();

    protected abstract void stop();

    protected abstract void createDriver(DriverOptions options);


    public WebDriver getDriver(){
        if(driver == null){
            start();
            createDriver(DriverOptions.INCOGNITO);
        }
        return driver;
    }


    public WebDriver getDriver(DriverOptions option) {
        if(driver == null){
            start();
            switch (option){
                case STANDART:
                    createDriver(DriverOptions.STANDART);
            }
        }
        return driver;
    }

    public void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
