package cucumber.step;

import base.BaseTest;
import cucumber.action.Actions;
import org.junit.jupiter.api.BeforeEach;

public class Hook extends BaseTest {

    Actions actions;

    @BeforeEach
    public void actionsInit(){
        actions = new Actions(driverManager.getDriver());
    }
}
