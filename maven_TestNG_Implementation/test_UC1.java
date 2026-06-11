package maven_TestNG_Implementation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_UC1 {

    WebDriver driver;

    @Parameters("browser")

    @Test
    public void launchBrowser(String browserName) {

        if(browserName.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
        }

        else if(browserName.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();

            driver = new FirefoxDriver();
        }

        else if(browserName.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();

            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void tearDown() {

        driver.quit();
    }
}