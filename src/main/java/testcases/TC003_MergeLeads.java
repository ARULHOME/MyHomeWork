package testcases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC003_MergeLeads extends TC001_Login {

	@Test
	public void MergeLeads() throws InterruptedException, IOException {
		
		WebElement eleleads = locateElement("linktext", "Leads");
		click(eleleads);
		WebElement elemerge = locateElement("linktext", "Merge Leads");
		click(elemerge);
		WebElement eleimg = locateElement("xpath","//img[@src='/images/fieldlookup.gif']");
		click(eleimg);
		
		
		
		/*try {
			Set<String> elewind= driver.getWindowHandles();
			List<String> obj = new ArrayList<>();
			obj.addAll(elewind);
			driver.switchTo().window(obj.get(1));
			
			
			System.out.println("The window switched successfully");
		} catch (Exception e) {
			System.err.println("the window not found");
			e.printStackTrace();
		}
		*/
		
		WebElement eleleadid = locateElement("xpath", "//input[@name='id']");
		type(eleleadid, "10154");
		WebElement elefindleads = locateElement("xpath", "//button[text()='Find Leads']");
		click(elefindleads);
		Thread.sleep(2000);
		
		WebElement elefirstleadid = locateElement("xpath", "(//a[@class='linktext'])[1]");
		click(elefirstleadid);
		
		try {
			Set<String> eleswitch = driver.getWindowHandles();
			List<String> obj1 = new ArrayList<>();
			obj1.addAll(eleswitch);
			obj1.size();
			System.out.println("the window size is "+obj1.size());
			driver.switchTo().window(obj1.get(0));
			System.out.println(".kjfdbjkfdhal/ihle");
			
		} catch (NoSuchWindowException e) {
			System.err.println("the window not found");
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		WebElement eletolead = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
		click(eletolead);
		try {
			Set<String> eleswitch2 = driver.getWindowHandles();
			List<String> obj2 = new ArrayList<>();
			obj2.addAll(eleswitch2);
			
			driver.switchTo().window(obj2.get(1));
		} catch (NoSuchWindowException e) {
			System.err.println("the window not found");
			e.printStackTrace();
		}
		WebElement eleleadid2 = locateElement("xpath", "//input[@name='id']");
		type(eleleadid2, "10154");
		WebElement elefindleads2 = locateElement("xpath", "//button[text()='Find Leads']");
		click(elefindleads2);
		WebElement elelinktext2 = locateElement("xpath", "(//a[@class='linktext'])[1]");
		click(elelinktext2);
		
		WebElement elelinktext3 = locateElement("xpath", "(//a[@class='linktext'])[1]");
		click(elelinktext3);
		try {
			Set<String> eleswitch = driver.getWindowHandles();
			List<String> obj3 = new ArrayList<>();
			obj3.addAll(eleswitch);
			obj3.size();
			System.out.println("the window size is "+obj3.size());
			driver.switchTo().window(obj3.get(0));
			System.out.println(".kjfdbjkfdhal/ihle");
			
		} catch (NoSuchWindowException e) {
			System.err.println("the window not found");
			e.printStackTrace();
		}
		WebElement elebt = locateElement("xpath", "//a[@class='buttonDangerous']");
		click(elebt);
		driver.switchTo().alert().accept();
		System.out.println("alertaccepted");
		WebElement elefindleds = locateElement("xpath", "//a[text()='Find Leads']");
		click(elefindleds);
		WebElement eleid = locateElement("xpath", "//input[@name='id']");
		type(eleid, "10154");
		WebElement elefindleadslast = locateElement("xpath", "//button[text()='Find Leads']");
		click(elefindleadslast);
		File screenshotsAs = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("D:\\photos\\photos1.png");
		FileUtils.copyFile(screenshotsAs, desc);
		driver.close();
		

			
		
	}
}



	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

