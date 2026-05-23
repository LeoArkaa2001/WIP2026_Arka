package AprilBatch_day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchBrowser_2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {

            
            driver.get("https://www.skill-assist.ai/wipro/auth");

          
            WebElement email = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']"))
            );
            email.sendKeys("mail.arkadasdinhata@gmail.com");

            WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
            password.sendKeys("User@123");

            driver.findElement(By.xpath("//button[@type='submit']")).click();

            System.out.println("Login successful");

          
            Thread.sleep(8000);

           
            WebElement progressTab = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//*[@id='radix-:ra:-trigger-progress']")
                    )
            );

            progressTab.click();

            System.out.println("Navigated to Progress tab");

            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}