package mavenTest_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class testCase4 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

      
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        

     
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(2000);
      

      
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        Thread.sleep(2000);
     

       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Appy");
        driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("F");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Fizz");
        driver.findElement(By.xpath("//label[text()='Employee Id']/following::input[1]")).clear();
        driver.findElement(By.xpath("//label[text()='Employee Id']/following::input[1]")).sendKeys("123432");
        System.out.println("Employee Details Filled");

   
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        Thread.sleep(6000);
       

   
        driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
        Thread.sleep(4000);
       

     
        driver.findElement(By.xpath("(//button[normalize-space()='Save'])[2]")).click();
        Thread.sleep(4000);
      

     
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(2000);
     

      
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type for hints...']")));
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Appy");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
        Thread.sleep(4000);
        System.out.println("Search Done");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='oxd-table-body']//div[@role='row'][1]")));
        driver.findElement(By.xpath("//div[@class='oxd-table-body']//div[@role='row'][1]")).click();
        Thread.sleep(4000);
       

        
        driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
        Thread.sleep(4000);
    

        driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
        Thread.sleep(4000);
       

        driver.quit();
        
    }
}