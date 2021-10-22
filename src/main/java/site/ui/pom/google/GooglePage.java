package site.ui.pom.google;

import core.logger.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import site.ui.pom.BasePage;

public class GooglePage extends BasePage {

    private JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//a[contains(text(),'русский')]")
    private WebElement russianLangButton;

    @FindBy(xpath = "//a[contains(text(),'Română')]")
    private WebElement romanianLangButton;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRussionLanguageButton() {
        Log.info("Click on View Subscription Options link");
        //Wait.until(() -> russianLangButton.isDisplayed(), 1, 1);
        //wait.until(ExpectedConditions.visibilityOfElementLocated((By) russianLangButton));
        WebDriverWait wait = new WebDriverWait(driver,10);
        russianLangButton.click();
    }

    public void clickOnRomanianLanguageButton() {
        Log.info("Click on View Subscription Options link");
        WebDriverWait wait = new WebDriverWait(driver,10);
        romanianLangButton.click();
    }


}
