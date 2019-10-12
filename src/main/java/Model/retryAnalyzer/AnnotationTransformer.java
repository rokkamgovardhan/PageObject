package Model.retryAnalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.testng.IAnnotationTransformer;
import org.testng.IAnnotationTransformer2;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AnnotationTransformer implements IAnnotationTransformer2, IReporter{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(retryAnalyzer.class);
		if(testMethod.getName().equalsIgnoreCase("cbc")) {
			annotation.setInvocationCount(2);
			annotation.setThreadPoolSize(3);
			//annotation.setDataProvider("");
			annotation.setDescription("chnaged value at run time");
			
		}
		if(testMethod.getName().equalsIgnoreCase("runner")) {
			annotation.setDataProvider("abc");
		}
	}

	public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		// TODO Auto-generated method stub
		
	}

	public void transform(IDataProviderAnnotation annotation, Method method) {
		// TODO Auto-generated method stub
		if(method.getName().equalsIgnoreCase("data")) {
			annotation.setName("abc");
		}
		
		
	}

	public void transform(IFactoryAnnotation annotation, Method method) {
		// TODO Auto-generated method stub
		
	}
	ExtentReports report;
	
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		report = new ExtentReports();
		report.attachReporter(new ExtentHtmlReporter("ExtentTestNG.html"));
		  
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();
  
            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();
  
                buildTestNodes(context.getPassedTests(), Status.PASS);
                buildTestNodes(context.getFailedTests(), Status.FAIL);
                buildTestNodes(context.getSkippedTests(), Status.SKIP);
            }
        }
  
        report.flush();

	}

	private void buildTestNodes(IResultMap tests, Status status) {
        ExtentTest test;
  
        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                test = report.createTest(result.getMethod().getMethodName());
  
                for (String group : result.getMethod().getGroups())
                    test.assignCategory(group);
  
                String message = "Test " + status.toString().toLowerCase() + "ed";
  
                if (result.getThrowable() != null)
                    message = result.getThrowable().getMessage();
  
                test.log(status, message);
            }
        }
    }
}
