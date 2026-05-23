package AprilBatch_day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.amazon.com");

        
        driver.manage().window().maximize();
        Thread.sleep(4000);

       
        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("iPhone 15");

        Thread.sleep(2000);

       
        driver.findElement(By.id("nav-search-submit-button"))
              .click();

        Thread.sleep(5000);

        
        System.out.println(driver.getTitle());

        
        driver.quit();
    }
}

