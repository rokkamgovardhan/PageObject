package Model.util;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

public class BaseTest {
	
	public Driver d;
	ExtentReports report;
	@BeforeSuite(alwaysRun=true)
	public void beforeSuite() {
		System.out.println("Before Suite");
		report = new ExtentReports();
		report.attachReporter(new ExtentHtmlReporter("Extent-Test.html"));
	}
	@BeforeTest(alwaysRun=true)
	public void beforeTesert() {
		System.out.println("Before Test");
	}
	@BeforeClass(alwaysRun=true)
	public void beforeTest() {
		System.out.println("Before class");
	}
	ExtentTest Test;
	@BeforeMethod(alwaysRun=true)
	public void createDriver(Method con) {
		Test=report.createTest(con.getName());
		d = new Driver();
		d.createDriver();
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown(ITestResult result) {
		if(result.getStatus() == ITestResult.SUCCESS)
	    {
			Test.log(Status.PASS, "Passed");
	    }else {
	    	Test.log(Status.FAIL, "Failed");
	    }
		d.getDriver().quit();
		
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite(){
		System.out.println("after Suite");
		report.flush();
	}
	@AfterTest(alwaysRun=true)
	public void aftertest() {
		System.out.println("after Test");
	}
	@AfterClass(alwaysRun=true)
	public void afterclass() {
		System.out.println("after class");
	} 
}
