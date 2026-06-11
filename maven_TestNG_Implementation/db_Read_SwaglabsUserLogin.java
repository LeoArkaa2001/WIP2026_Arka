package maven_TestNG_Implementation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class db_Read_SwaglabsUserLogin {

    static WebDriver driver;

    public static void main(String[] args) {

        try {

            Connection con = db_Connection.getConnection();
            
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM users");

            while (rs.next()) {

                String username = rs.getString("username");

                String password = rs.getString("password");

                WebDriverManager.chromedriver().setup();

                driver = new ChromeDriver();

                driver.get("https://www.saucedemo.com/");

                driver.manage().window().maximize();

                driver.findElement(By.id("user-name")).sendKeys(username);

                driver.findElement(By.id("password")).sendKeys(password);

                driver.findElement(By.id("login-button")).click();

                Thread.sleep(3000);

                System.out.println("Login Attempted With: " + username);

               
                driver.quit();
            }
         
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
