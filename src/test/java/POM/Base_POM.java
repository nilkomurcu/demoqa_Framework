package POM;
import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;

public class Base_POM {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));

    public void waitUntilLoading() {
        wait.until(
                ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar//mat-progress-bar"), 0));
    }

    public List<WebElement> waitUntilVisibleAllElement(List<WebElement> elementList) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

    public void waitUntilVisibleAndClickable(WebElement element) {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickFunction(WebElement element) {
        waitUntilVisibleAndClickable(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisibleAndClickable(element);
        element.sendKeys(value);
    }

    public void validationText(WebElement element, String text) {
        waitUntilVisibleAndClickable(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void clearFunction(WebElement element) {
        element.clear();
    }

    public void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}