package examples;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class GetTitleTest extends BaseClassTest {

    @Test
    public void getTitleOfPage() {
        // launching the url
        driver.get("https://testingwithsk.in/");

        // creating a JavaScriptExecutor reference
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // get the page title using executeScript method
        String title = js.executeScript("return document.title;").toString();

        System.out.println("Title - " + title);
    }

}
