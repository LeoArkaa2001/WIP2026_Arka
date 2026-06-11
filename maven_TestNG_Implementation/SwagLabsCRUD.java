package maven_TestNG_Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.URL;
import java.time.Duration;

public class SwagLabsCRUD {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        String hubHost = System.getenv("HUB_HOST");

        if (hubHost != null) {
            System.out.println("Running on Docker Grid: http://" + hubHost + ":4444/wd/hub");
            driver = new RemoteWebDriver(
                new URL("http://" + hubHost + ":4444/wd/hub"), options
            );
        } else {
            System.out.println("Running locally with ChromeDriver");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }

        // Wait up to 15 seconds for any element
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test(priority = 1)
    public void login() {
        driver.get("https://www.saucedemo.com");

        wait.until(ExpectedConditions
            .elementToBeClickable(By.id("user-name")))
            .sendKeys("standard_user");

        wait.until(ExpectedConditions
            .elementToBeClickable(By.id("password")))
            .sendKeys("secret_sauce");

        wait.until(ExpectedConditions
            .elementToBeClickable(By.id("login-button")))
            .click();

        // Wait until inventory page loads
        wait.until(ExpectedConditions
            .presenceOfElementLocated(By.className("inventory_list")));

        System.out.println("Login Successful");
    }

    @Test(priority = 2)
    public void create() {
        wait.until(ExpectedConditions
            .elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")))
            .click();

        // Wait until cart badge shows 1
        wait.until(ExpectedConditions
            .textToBe(By.className("shopping_cart_badge"), "1"));

        System.out.println("CREATE : Product Added To Cart");
    }

    @Test(priority = 3)
    public void read() {
        wait.until(ExpectedConditions
            .elementToBeClickable(By.className("shopping_cart_link")))
            .click();

        // Wait until cart page loads
        WebElement productName = wait.until(ExpectedConditions
            .presenceOfElementLocated(By.className("inventory_item_name")));

        System.out.println("READ : " + productName.getText());
    }

    @Test(priority = 4)
    public void update() {
        wait.until(ExpectedConditions
            .elementToBeClickable(By.id("continue-shopping")))
            .click();

        // Wait until back on inventory page
        wait.until(ExpectedConditions
            .presenceOfElementLocated(By.className("inventory_list")));

        wait.until(ExpectedConditions
            .elementToBeClickable(By.id("add-to-cart-sauce-labs-bike-light")))
            .click();

        // Wait until cart badge shows 2
        wait.until(ExpectedConditions
            .textToBe(By.className("shopping_cart_badge"), "2"));

        System.out.println("UPDATE : Cart Updated");
    }

    @Test(priority = 5)
    public void delete() {
        wait.until(ExpectedConditions
            .elementToBeClickable(By.className("shopping_cart_link")))
            .click();

        // Wait until cart page loads
        wait.until(ExpectedConditions
            .presenceOfElementLocated(By.id("remove-sauce-labs-backpack")));

        wait.until(ExpectedConditions
            .elementToBeClickable(By.id("remove-sauce-labs-backpack")))
            .click();

        // Wait until item is removed
        wait.until(ExpectedConditions
            .invisibilityOfElementLocated(By.id("remove-sauce-labs-backpack")));

        System.out.println("DELETE : Product Removed");
    }

    @AfterClass
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}