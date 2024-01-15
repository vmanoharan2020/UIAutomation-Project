package extentReport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public static void main(String[] args) throws IOException {
		
		//ExtentHTMLReporter
		//ExtentReports
		//ExtentTest
		//MediaEntityBuilder
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		reporter.setAppendExisting(true);
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest test = extent.createTest("Login", "With +ive Credential");
		
		test.assignAuthor("veera");
		
		test.assignCategory("Smoke");
		
		 test.pass("login successfull",MediaEntityBuilder.createScreenCaptureFromPath("../snaps/apulas.jpg").build());
		 
		 test.pass("verify title fail");
		 
		 test.fail("verify content of checkbox");
		 
		 extent.flush();
		
		
	}

}
