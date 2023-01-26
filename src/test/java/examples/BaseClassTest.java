package examples;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClassTest {

    public static WebDriver driver = null;

    @BeforeClass
    public static void setup() {
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } catch (Exception e) {
            throw new RuntimeException("error occurred while initializing the webdriver.");
        }
    }

    @AfterClass
    public static void tearDown() {
        try {
            driver.close();
        } catch (Exception e) {
            throw new RuntimeException("error occurred while closing the webdriver.");
        } finally {
            driver.quit();
        }
    }
}
