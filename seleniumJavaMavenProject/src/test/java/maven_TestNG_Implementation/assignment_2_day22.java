package maven_TestNG_Implementation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment_2_day22 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open e-commerce demo site
        driver.get("https://www.demoblaze.com/index.html");

        // Click first product
        List<WebElement> products = driver.findElements(
                By.xpath("//div[@class='card h-100']//a"));

        products.get(0).click();

        Thread.sleep(2000);

        // Add to cart
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();

        // ✅ SAFE ALERT HANDLING (FIXED)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        // Go to cart
        driver.findElement(By.id("cartur")).click();

        Thread.sleep(2000);

        // Display cart items (filter simulation)
        List<WebElement> items = driver.findElements(
                By.xpath("//tr[@class='success']/td[2]"));

        System.out.println("Cart Products:");

        for (WebElement item : items) {
            System.out.println(item.getText());
        }

        // Recommendation system (simulation)
        System.out.println("\nCustomers also bought:");
        System.out.println("- Wireless Headphones");
        System.out.println("- Phone Case");
        System.out.println("- Power Bank");

        driver.quit();
    }
}