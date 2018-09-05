package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC004_DuplicateLead extends SeMethods {
	@Test
	public void DuplicateLead () {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement elecrmsfa = locateElement("linktext", "CRM/SFA");
		click(elecrmsfa);
		WebElement eleleads = locateElement("linktext", "Leads");
		click(eleleads);
		WebElement elefindld = locateElement("xpath", "//a[text()='Find Leads']");
		click(elefindld);
		WebElement eleemail = locateElement("xpath", "//span[text()='Email']");
		click(eleemail);
		WebElement eleemailadd = locateElement("name", "emailAddress");
		type(eleemailadd, "rahavi@gmail.com");
		WebElement elefindleads = locateElement("xpath", "//button[text()='Find Leads']");
		click(elefindleads);
		WebElement elelinktext = locateElement("xpath", "(//a[@class='linktext'])[4]");
		click(elelinktext);
		WebElement eleduplicatelead = locateElement("xpath", "//a[text()='Duplicate Lead']");
		click(eleduplicatelead);
		String title = driver.getTitle();
		System.out.println("title");
		verifyTitle("Duplicate Lead | opentaps CRM");
		WebElement elesubmitbt = locateElement("xpath", "//input[@name='submitButton']");
		click(elesubmitbt);
		closeBrowser();
		
		
		
		
		
		
}
}