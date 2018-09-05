package week5.day1;

import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class LearnReports {


	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html= new ExtentHtmlReporter("./reports/result.html");

		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("TC002CreteLead", "Create a new lead");
		test.assignAuthor("yamini");
		test.assignCategory("smoke");
		test.pass("the data demosales manager entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img.png").build());
		test.pass("the data crmsfa entered successfully");
		test.pass("login is not clicked successfully");
		extent.flush();







	}

}
