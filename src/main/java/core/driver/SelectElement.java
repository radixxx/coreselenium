package core.driver;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class SelectElement extends Select {

    @Getter
    private WebElement locator;


    public SelectElement(WebElement element) {
        super(element);
        this.locator = element;
    }

    public String selectRandom() {
        int random = new Random().nextInt(this.getOptions().size());
        this.selectByIndex(random);
        return this.getFirstSelectedOption().getText();
    }

}
