package maven_TestNG_Implementation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class flightBooking_UC {

    @SuppressWarnings("unused")
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://phptravels.net/");

        

        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.id("page-loader")
        ));

       

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id='acknowledgeDemoWarning']")
        )).click();

      

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div[2]/div[3]/div/nav/button[2]")
        )).click();

        

        WebElement from = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@x-ref='fromInput']")
        ));

        from.sendKeys("Delhi");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(text(),'Delhi')]")
        )).click();

      
        WebElement to = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@x-ref='toInput']")
        ));

        to.sendKeys("Mumbai");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(text(),'Mumbai')]")
        )).click();


        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("flights_departure_date")
        ));

        date.click();

      
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[5]/td[5]/div")
        )).click();

       
        js.executeScript(
                "document.querySelector('.datepicker-overlay').style.display='none';"
        );

     

        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/form/div[3]/div[3]/button")
        ));

        searchBtn.click();

        System.out.println("Flight Search Clicked");

      

        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement results = fluentWait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {

                WebElement element = driver.findElement(
                        By.tagName("body")
                );

                if (element.getText().contains("Mumbai")
                        || element.getText().contains("Delhi")
                        || element.getText().contains("Flights")) {

                    return element;
                }

                return null;
            }
        });

        System.out.println("Flight Results Loaded Successfully");

        driver.quit();
    }
}