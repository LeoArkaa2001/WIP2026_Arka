package maven_TestNG_Implementation;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAPI_test {

    ExtentReports extent;

    ExtentTest test;

    // ==================================================
    // BEFORE SUITE
    // ==================================================

    @BeforeSuite
    public void setupReport() {

        extent = extentReportManager.getReportObject();
    }

    // ==================================================
    // BEFORE EACH TEST
    // ==================================================

    @BeforeMethod
    public void startTest(Method method) {

        test = extent.createTest(method.getName());
    }

    // ==================================================
    // GET ALL USERS API
    // ==================================================

    @Test(priority = 1)
    public void getAllUsers() {

        test.info("Sending GET request to fetch all users");

        given()

        .when()
            .get("https://dummyjson.com/users")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("GET Users API Test Passed");
    }

    // ==================================================
    // GET SINGLE USER API
    // ==================================================

    @Test(priority = 2)
    public void getSingleUser() {

        test.info("Fetching single user");

        given()

        .when()
            .get("https://dummyjson.com/users/1")

        .then()
            .statusCode(200)
            .body("firstName", equalTo("Emily"))
            .log().all();

        test.pass("Single User API Test Passed");
    }

    // ==================================================
    // LOGIN USER API
    // ==================================================

    @Test(priority = 3)
    public void loginUser() {

        String requestBody = "{\n" +
                "  \"username\": \"emilys\",\n" +
                "  \"password\": \"emilyspass\",\n" +
                "  \"expiresInMins\": 30\n" +
                "}";

        test.info("Sending login POST request");

        given()

        .header("Content-Type", "application/json")
        .body(requestBody)

        .when()
            .post("https://dummyjson.com/user/login")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("Login API Test Passed");
    }

    // ==================================================
    // ADD USER API
    // ==================================================

    @Test(priority = 4)
    public void addUser() {

        String requestBody = "{\n" +
                "  \"firstName\": \"Arka\",\n" +
                "  \"lastName\": \"Roy\",\n" +
                "  \"age\": 25\n" +
                "}";

        test.info("Adding new user");

        given()

        .header("Content-Type", "application/json")
        .body(requestBody)

        .when()
            .post("https://dummyjson.com/users/add")

        .then()
            .statusCode(201)
            .log().all();

        test.pass("Add User API Test Passed");
    }

    // ==================================================
    // UPDATE USER API
    // ==================================================

    @Test(priority = 5)
    public void updateUser() {

        String requestBody = "{\n" +
                "  \"lastName\": \"Updated\"\n" +
                "}";

        test.info("Updating user details");

        given()

        .header("Content-Type", "application/json")
        .body(requestBody)

        .when()
            .put("https://dummyjson.com/users/2")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("Update User API Test Passed");
    }

    // ==================================================
    // DELETE USER API
    // ==================================================

    @Test(priority = 6)
    public void deleteUser() {

        test.info("Deleting user");

        given()

        .when()
            .delete("https://dummyjson.com/users/1")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("Delete User API Test Passed");
    }

    // ==================================================
    // AFTER EACH TEST
    // ==================================================

    @AfterMethod
    public void getResult(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            test.fail(result.getThrowable());

        } else if (result.getStatus() == ITestResult.SUCCESS) {

            test.pass("Test Passed");

        } else {

            test.skip("Test Skipped");
        }
    }

    // ==================================================
    // AFTER SUITE
    // ==================================================

    @AfterSuite
    public void tearDown() {

        extent.flush();

        System.out.println("Extent Report Generated Successfully");
    }
}