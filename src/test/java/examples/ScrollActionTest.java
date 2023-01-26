package examples;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollActionTest extends BaseClassTest {

    @Test
    public void scrollDown() throws InterruptedException {
        // launching the url
        driver.get("https://testingwithsk.in/");

        // creating a JavaScriptExecutor reference
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scroll using executeScript method
        js.executeScript("window.scrollTo(0, 1000);");

        Thread.sleep(2000);
    }

}
