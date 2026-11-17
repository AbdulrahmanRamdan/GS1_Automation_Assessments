package pages;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }
    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }
    public  void scrollToElement(WebElement element) {

        JavascriptExecutor js =
                (JavascriptExecutor) getDriver();

        js.executeScript(
                "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});",
                element
        );
    }

    public void waitForVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(
                getDriver(),
                Duration.ofSeconds(20)
        );
         wait.until(ExpectedConditions.visibilityOf(element));
    }

    public  void waitForClickable (WebElement element){
        WebDriverWait wait = new WebDriverWait(
                getDriver(),
                Duration.ofSeconds(20)
        );
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public  void waitForClickableByLocator (By Loc){
        WebDriverWait wait = new WebDriverWait(
                getDriver(),
                Duration.ofSeconds(20)
        );
        wait.until(ExpectedConditions.elementToBeClickable(Loc));
    }

    public  void click(WebElement element){
        waitForClickable(element);
        element.click();
    }
    public  void sendkeys(WebElement element, String txt){
        waitForClickable(element);
        element.sendKeys(txt);
    }
    public String gettext(WebElement element){
        waitForClickable(element);
        return element.getText();
    }
}
