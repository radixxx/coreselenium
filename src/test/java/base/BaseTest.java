package base;


import base.watcher.CustomTestWatcher;
import core.DriverManagerFactory;
import core.manager.base.DriverManager;
import core.manager.type.DriverType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(CustomTestWatcher.class)
public class BaseTest {
    protected DriverManager driverManager;
    //protected DbAccessor dbAccessor = DbAccessor.instance();

    @BeforeEach
    public void browserInit() {
        driverManager = DriverManagerFactory.instance(DriverType.CHROME);
    }

    @AfterEach
    public void browserClose() {
        driverManager.quitDriver();
    }

}
