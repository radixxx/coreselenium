package site.ui.pom;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BasePage {

  protected WebDriver driver;
  private Actions actions;


  public BasePage(WebDriver driver) {
    this.driver = driver;
    actions = new Actions(driver);
    PageFactory.initElements(this.driver, this);
  }

  public void doubleClick(WebElement element) {
    actions.doubleClick(element).perform();
  }

  public void rightClick(WebElement element) {
    actions.contextClick(element).perform();
  }

  public void switchToNewTab() {
    List<String> windows = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(windows.get(windows.size() - 1));
  }

  public void waitUntilElementIsDisplayed(WebElement element, long time) {
    WebDriverWait wait = new WebDriverWait(driver, time);
    ExpectedCondition<Boolean> elementIsDisplayed = arg -> element.isDisplayed();
    wait.until(elementIsDisplayed);
  }

  public void waitUntilElementIsClickable(WebElement element, long time) {
    WebDriverWait wait = new WebDriverWait(driver, time);
    wait.until(ExpectedConditions.elementToBeClickable(element));
  }

  public void jsClick(WebElement element) {
    ((JavascriptExecutor) driver).executeScript("arguments[0].click:", element);
  }

  public void scrollToElement(WebElement element) {
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
  }

  public String getValue(WebElement element) {
    return element.getAttribute("value");
  }

  public void waitUntilFrameIsLoaded(long time) {
    WebDriverWait wait = new WebDriverWait(driver, time);
    wait.until(
        driver1 ->
            ((JavascriptExecutor) driver)
                .executeScript("return document.readyState")
                .equals("complete"));
  }

  public boolean exists(WebElement element) {
    try {
      return element.isDisplayed();
    } catch (WebDriverException e) {
      return false;
    }
  }

  public void switchToDefault() {
    driver.switchTo().defaultContent();
  }

  public void switchToFrame(String frame) {
    switchToDefault();
    driver.switchTo().frame(frame);
  }

  public void switchToFrame(WebElement frame) {
    switchToDefault();
    driver.switchTo().frame(frame);
  }

  public WebElement getElementByXpath(String xpath) {
    return driver.findElement(By.xpath(xpath));
  }


}
