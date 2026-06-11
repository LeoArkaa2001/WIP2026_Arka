package maven_TestNG_Implementation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addToCart_UC {

    public static void main(String[] args) throws InterruptedException {

      
        WebDriver driver = new ChromeDriver();

    
        driver.manage().window().maximize();

       
        driver.get("https://www.saucedemo.com/");

      
        Thread.sleep(2000);

    
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

     
        Thread.sleep(2000);

      
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       
        WebElement addToCartButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("add-to-cart-sauce-labs-backpack")));

     
        Thread.sleep(2000);

    
        addToCartButton.click();

        System.out.println("Product added to cart successfully.");

      
        Thread.sleep(2000);

        
        driver.quit();
    }
}