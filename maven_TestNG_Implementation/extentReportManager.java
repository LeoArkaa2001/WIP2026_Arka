package maven_TestNG_Implementation;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportManager {

    public static ExtentReports getReportObject() {

        String path = System.getProperty("user.dir")
                + "/reports/index.html";

        ExtentSparkReporter reporter =
                new ExtentSparkReporter(path);

        reporter.config().setReportName("REST API Automation Report");

        reporter.config().setDocumentTitle("Automation Test Results");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(reporter);

        extent.setSystemInfo("Tester", "Arka");

        return extent;
    }
}