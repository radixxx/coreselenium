package core.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import core.manager.base.DriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeManager  extends DriverManager {

    private ChromeDriverService service;

    @Override
    protected void start() {
        if(service == null){
           try{
               WebDriverManager.chromedriver().setup();
               service = new ChromeDriverService.Builder()
                       .usingAnyFreePort()
                       .build();
               service.start();
           } catch (Exception e) {
               e.printStackTrace();
           }
        }

    }

    @Override
    protected void stop() {
        if(service != null && service.isRunning())
            service.stop();

    }

    @Override
    protected void createDriver(DriverOptions option) {
        ChromeOptions options = new ChromeOptions();
        if(option == DriverOptions.INCOGNITO){
            options.addArguments("incognito");
            driver = new ChromeDriver(service, options);
        }
        else if(option == DriverOptions.STANDART){
            driver = new ChromeDriver(service, options);
        }
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
}
