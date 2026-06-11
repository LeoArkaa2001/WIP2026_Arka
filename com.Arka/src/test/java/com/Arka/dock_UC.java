package com.Arka;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dock_UC {

    public static void main(String[] args) {

        WebDriver driver = null;

        try {

            // Connect to Selenium Docker Container
            ChromeOptions options = new ChromeOptions();

            driver = new RemoteWebDriver(
                    new URL("http://selenium:4444/wd/hub"),
                    options);

            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Open OrangeHRM Demo Site
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Login
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            System.out.println("Login Successful");

            Thread.sleep(3000);

            // Navigate to PIM
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//span[text()='PIM']")));
            driver.findElement(By.xpath("//span[text()='PIM']")).click();

            System.out.println("Navigated to PIM");

            Thread.sleep(2000);

            // Add Employee
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Add']")));
            driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();

            System.out.println("Add Employee Page Opened");

            Thread.sleep(2000);

            // Employee Details
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@placeholder='First Name']")));

            driver.findElement(By.xpath("//input[@placeholder='First Name']"))
                    .sendKeys("Appy");

            driver.findElement(By.xpath("//input[@placeholder='Middle Name']"))
                    .sendKeys("F");

            driver.findElement(By.xpath("//input[@placeholder='Last Name']"))
                    .sendKeys("Fizz");

            driver.findElement(
                    By.xpath("//label[text()='Employee Id']/following::input[1]"))
                    .clear();

            driver.findElement(
                    By.xpath("//label[text()='Employee Id']/following::input[1]"))
                    .sendKeys("123432");

            System.out.println("Employee Details Filled");

            // Save Employee
            driver.findElement(
                    By.xpath("//button[normalize-space()='Save']"))
                    .click();

            System.out.println("Employee Saved");

            Thread.sleep(6000);

            // Personal Details Save
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("(//button[normalize-space()='Save'])[1]")));

            driver.findElement(
                    By.xpath("(//button[normalize-space()='Save'])[1]"))
                    .click();

            System.out.println("Personal Details Saved");

            Thread.sleep(4000);

            // Additional Save
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("(//button[normalize-space()='Save'])[2]")));

            driver.findElement(
                    By.xpath("(//button[normalize-space()='Save'])[2]"))
                    .click();

            System.out.println("Additional Details Saved");

            Thread.sleep(4000);

            // Back to PIM Search
            driver.findElement(By.xpath("//span[text()='PIM']")).click();

            Thread.sleep(2000);

            // Search Employee
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@placeholder='Type for hints...']")));

            driver.findElement(
                    By.xpath("//input[@placeholder='Type for hints...']"))
                    .sendKeys("Appy");

            Thread.sleep(3000);

            driver.findElement(
                    By.xpath("//button[normalize-space()='Search']"))
                    .click();

            System.out.println("Employee Search Completed");

            Thread.sleep(5000);

            // Select First Search Result
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@class='oxd-table-body']//div[@role='row'][1]")));

            driver.findElement(
                    By.xpath("//div[@class='oxd-table-body']//div[@role='row'][1]"))
                    .click();

            System.out.println("Employee Record Opened");

            Thread.sleep(4000);

            // Save Again
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("(//button[normalize-space()='Save'])[1]")));

            driver.findElement(
                    By.xpath("(//button[normalize-space()='Save'])[1]"))
                    .click();

            System.out.println("Employee Record Updated");

            Thread.sleep(4000);

            // Dashboard
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//span[text()='Dashboard']")));

            driver.findElement(
                    By.xpath("//span[text()='Dashboard']"))
                    .click();

            System.out.println("Dashboard Opened");

            Thread.sleep(4000);

            System.out.println("========== TEST EXECUTED SUCCESSFULLY ==========");

        } catch (Exception e) {

            System.out.println("Test Failed");
            e.printStackTrace();

        } finally {

            if (driver != null) {
                driver.quit();
            }

            System.out.println("Browser Closed");
        }
    }
}