package examples;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CheckActionTest extends BaseClassTest {

    @Test
    public void checkWithoutLocate() throws InterruptedException {
        // launching the url
        driver.get("https://letcode.in/radio");

        // creating a JavaScriptExecutor reference
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // uncheck using executeScript method
        js.executeScript("document.getElementsByTagName('input').item(11).checked=false;");

        Thread.sleep(2000);

        // check using executeScript method
        js.executeScript("document.getElementsByTagName('input').item(11).checked=true;");
    }

    @Test
    public void checkWithLocate() throws InterruptedException {
        // launching the url
        driver.get("https://letcode.in/radio");

        // locating the web element using selenium command
        WebElement element = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        // creating a JavaScriptExecutor reference
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // uncheck using executeScript method
        js.executeScript("arguments[0].checked=false;", element);

        Thread.sleep(2000);

        // check using executeScript method
        js.executeScript("arguments[0].checked=true;", element);
    }

}
