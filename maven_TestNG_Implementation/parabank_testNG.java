package maven_TestNG_Implementation;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class parabank_testNG {

    ChromeDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        System.out.println("Browser launched");
    }

    @Test(priority = 1)
    public void loginTest() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        driver.findElement(By.name("username")).sendKeys("ArkaDas2");
        driver.findElement(By.name("password")).sendKeys("Arka@123");

        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Transfer Funds")));

        System.out.println("Login Successful");
    }

    @Test(priority = 2)
    public void transferFunds() {

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Transfer Funds")));
        driver.findElement(By.linkText("Transfer Funds")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
        driver.findElement(By.id("amount")).sendKeys("500");

        driver.findElement(By.xpath("//*[@id='transferForm']/div[2]/input")).click();

       
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("showResult")));

        WebElement resultBox = driver.findElement(By.id("showResult"));
        System.out.println("Transfer Result: " + resultBox.getText());
    }

    @AfterMethod
    public void afterEachTest() {
        System.out.println("Test method completed");
    }

    @AfterTest
    public void tearDown() {

        try {
            if (driver.findElements(By.linkText("Log Out")).size() > 0) {
                driver.findElement(By.linkText("Log Out")).click();
            }
        } catch (Exception e) {
            System.out.println("Logout skipped");
        }

        driver.quit();
        System.out.println("Browser closed");
    }
}