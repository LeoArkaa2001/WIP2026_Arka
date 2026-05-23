package maven_TestNG_Implementation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class assignment_day24 {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys("Rahul Kumar");

        driver.findElement(By.id("userEmail"))
                .sendKeys("rahul@gmail.com");

        driver.findElement(By.id("currentAddress"))
                .sendKeys("Kolkata");

        driver.findElement(By.id("permanentAddress"))
                .sendKeys("West Bengal");

        WebElement submitBtn = driver.findElement(By.id("submit"));

        js.executeScript("arguments[0].scrollIntoView(true)", submitBtn);

        Thread.sleep(2000);

        submitBtn.click();

        Thread.sleep(2000);

        driver.get("https://demoqa.com/radio-button");

        WebElement yesRadio = driver.findElement(
                By.xpath("//label[@for='yesRadio']"));

        yesRadio.click();

        Thread.sleep(2000);

        driver.get("https://output.jsbin.com/osebed/2");

        WebElement fruits = driver.findElement(By.id("fruits"));

        Select listBox = new Select(fruits);

        listBox.selectByVisibleText("Banana");

        listBox.selectByVisibleText("Apple");

        Thread.sleep(2000);

        driver.get("https://demoqa.com/select-menu");

        WebElement dropdown = driver.findElement(
                By.id("oldSelectMenu"));

        Select select = new Select(dropdown);

        select.selectByVisibleText("Purple");

        Thread.sleep(2000);

        driver.get("https://demoqa.com/broken");

        WebElement image = driver.findElement(
                By.xpath("//img[contains(@src,'Toolsqa.jpg')]"));

        Boolean imageLoaded = (Boolean) js.executeScript(
                "return arguments[0].complete && "
                        + "typeof arguments[0].naturalWidth != 'undefined' && "
                        + "arguments[0].naturalWidth > 0",
                image);

        if (imageLoaded) {

            System.out.println("Image displayed successfully");

        } else {

            System.out.println("Broken image detected");
        }

        Thread.sleep(2000);

        driver.get("https://demoqa.com/checkbox");

        Thread.sleep(3000);

        JavascriptExecutor js2 = (JavascriptExecutor) driver;

        js2.executeScript("window.scrollBy(0,300)");

        WebElement checkbox = driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/span[4]/span[1]"));

        checkbox.click();

        System.out.println("Checkbox selected successfully");

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,500)");

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,-500)");

        Thread.sleep(2000);

        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);

        File dest = new File("C:\\Screenshots\\demoqa.png");

        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot captured successfully");

        Actions action = new Actions(driver);

        driver.get("https://demoqa.com/menu");

        WebElement menu = driver.findElement(
                By.xpath("//a[text()='Main Item 2']"));

        action.moveToElement(menu).perform();

        Thread.sleep(2000);

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickBtn = driver.findElement(
                By.id("doubleClickBtn"));

        action.doubleClick(doubleClickBtn).perform();

        Thread.sleep(2000);

        WebElement rightClickBtn = driver.findElement(
                By.id("rightClickBtn"));

        action.contextClick(rightClickBtn).perform();

        Thread.sleep(2000);

        driver.get("https://demoqa.com/droppable");

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver.findElement(By.id("droppable"));

        action.dragAndDrop(source, target).perform();

        Thread.sleep(2000);

        driver.get("https://demoqa.com/slider");

        WebElement slider = driver.findElement(
                By.xpath("//input[@type='range']"));

        action.clickAndHold(slider)
                .moveByOffset(50, 0)
                .release()
                .perform();

        Thread.sleep(2000);

        driver.get("https://demoqa.com/dynamic-properties");

        Thread.sleep(6000);

        WebElement dynamicBtn = driver.findElement(
                By.id("visibleAfter"));

        dynamicBtn.click();

        System.out.println("Dynamic button clicked");

        Thread.sleep(2000);

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();

        Alert alert1 = driver.switchTo().alert();

        System.out.println(alert1.getText());

        alert1.accept();

        Thread.sleep(2000);

        driver.findElement(By.id("confirmButton")).click();

        Alert alert2 = driver.switchTo().alert();

        System.out.println(alert2.getText());

        alert2.dismiss();

        Thread.sleep(2000);

        driver.findElement(By.id("promtButton")).click();

        Alert alert3 = driver.switchTo().alert();

        alert3.sendKeys("Automation Testing");

        alert3.accept();

        Thread.sleep(2000);

        driver.quit();

        System.out.println("Automation Completed Successfully");
    }
}