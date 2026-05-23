package maven_TestNG_Implementation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class assignment_day25 {

    

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        return new Object[][] {

                {"admin", "admin123"},
                {"user", "user123"},
                {"test", "test123"}

        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        System.out.println("Login Test Executed");
        System.out.println("-------------------");
    }




    @Test(groups = {"smoke"})
    public void smokeTest1() {

        System.out.println("Smoke Test 1 Executed");
    }

    @Test(groups = {"smoke"})
    public void smokeTest2() {

        System.out.println("Smoke Test 2 Executed");
    }

    @Test(groups = {"regression"})
    public void regressionTest1() {

        System.out.println("Regression Test 1 Executed");
    }

    @Test(groups = {"regression"})
    public void regressionTest2() {

        System.out.println("Regression Test 2 Executed");
    }

}