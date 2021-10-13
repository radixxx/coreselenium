package core.driver;


import core.driver.manager.ChromeManager;
import core.driver.manager.base.DriverManager;
import core.driver.type.DriverType;

public class DriverManagerFactory {

    public static DriverManager instance(DriverType type){
        DriverManager driverManager = null; //!

        switch (type){
            default:
            case CHROME:
                driverManager = new ChromeManager();
                break;
            case FIREFOX:
               break;
        }

        return driverManager;
    }

}
