package core;

import core.manager.ChromeManager;
import core.manager.base.DriverManager;
import core.manager.type.DriverType;

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
