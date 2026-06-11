package mavenTest_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testCase3 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    
        driver.findElement(By.name("username")).sendKeys("ArkaDas1");
        driver.findElement(By.name("password")).sendKeys("Arka@123");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
        Thread.sleep(2000);
        System.out.println("Login Done");

   
        driver.findElement(By.xpath("//*[@id='leftPanel']/ul/li[3]/a")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("amount")).sendKeys("500");
        Thread.sleep(500);
        System.out.println("Amount Entered: 500");

        Select fromAccount = new Select(driver.findElement(By.id("fromAccountId")));
        fromAccount.selectByIndex(0);
      
        Select toAccount = new Select(driver.findElement(By.id("toAccountId")));
        toAccount.selectByIndex(0);
    
        driver.findElement(By.xpath("//*[@id='transferForm']/div[2]/input")).click();
        Thread.sleep(2000);
       

        
        String msg = driver.findElement(By.xpath("//*[@id='showResult']/h1")).getText();
        System.out.println("Result: " + msg);

   
        driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
        Thread.sleep(1000);
        

        driver.quit();
    }
}