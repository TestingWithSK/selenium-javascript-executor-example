package examples;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TypeActionTest extends BaseClassTest {

    @Test
    public void typeWithoutLocate() {
        // launching the url
        driver.get("https://letcode.in/edit");

        // creating a JavaScriptExecutor reference
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // type values using executeScript method
        js.executeScript("document.getElementById('fullName').setAttribute('value', 'Shubham Kumar');");
    }

    @Test
    public void typeWithLocate() {
        // launching the url
        driver.get("https://letcode.in/edit");

        // locating the web element using selenium command
        WebElement element = driver.findElement(By.id("fullName"));

        // creating a JavaScriptExecutor reference
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // type values using executeScript method
        js.executeScript("arguments[0].value='Shubham Kumar';", element);
    }

}
