package maven_TestNG_Implementation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_1_day22 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Demo quiz site
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // Simulate quiz input (skin type)
        driver.findElement(By.name("my-text")).sendKeys("Oily Skin");

        // Simulate concern selection (checkbox/radio simulation)
        driver.findElement(By.id("my-check-1")).click();

        // Submit quiz
        driver.findElement(By.cssSelector("button")).click();

        Thread.sleep(2000);

        // Recommendation simulation
        System.out.println("Recommended Products:");

        System.out.println("1. Oil-Free Cleanser");
        System.out.println("2. Salicylic Acid Serum");
        System.out.println("3. Matte Sunscreen");

        driver.quit();
    }
}