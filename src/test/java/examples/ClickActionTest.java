package examples;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ClickActionTest extends BaseClassTest {

    @Test
    public void clickWithoutLocate() {
        // launching the url
        driver.get("https://letcode.in/buttons");

        // creating a JavaScriptExecutor reference
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // performing click operation using executeScript method
        js.executeScript("document.getElementById('home').click();");
    }

    @Test
    public void clickWithLocate() {
        // launching the url
        driver.get("https://letcode.in/buttons");

        // locating the web element using selenium command
        WebElement element = driver.findElement(By.id("home"));

        // creating a JavaScriptExecutor reference
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // performing click operation using executeScript method
        js.executeScript("arguments[0].click();", element);
    }

}
