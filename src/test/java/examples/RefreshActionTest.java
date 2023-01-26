package examples;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefreshActionTest extends BaseClassTest {

    @Test
    public void refreshWebPage() throws InterruptedException {
        // launching the url
        driver.get("https://testingwithsk.in/");

        // creating a JavaScriptExecutor reference
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // refresh the webpage using executeScript method
        js.executeScript("location.reload()");

        Thread.sleep(2000);
    }

}
