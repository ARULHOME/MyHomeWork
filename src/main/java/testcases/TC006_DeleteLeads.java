package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC006_DeleteLeads extends  TC001_Login {
	@Test
	public void DeleteLeads() throws InterruptedException {
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
		WebElement elephone = locateElement("xpath", "//span[text()='Phone']");
		click(elephone);
        WebElement elephonenumber= locateElement("name", "phoneNumber");
        type(elephonenumber, "962258666");
	    WebElement elefindleads = locateElement("xpath", "//button[text()='Find Leads']");
	    click(elefindleads);
	    WebElement eleleadid = locateElement("xpath", "//div[text()='Lead ID']/a");
	    click(eleleadid);
	    WebElement elelinktext = locateElement("xpath", "(//a[@class='linktext'])[4]");
	    click(elelinktext);
	    WebElement eledelete = locateElement("xpath", "//a[text()='Delete']");
	    click(eledelete);
	    WebElement elefindleads2 = locateElement("xpath", "//a[text()='Find Leads']");
		click(elefindleads2);
		WebElement eleenterleadid = locateElement("xpath", "//input[@name='id']");
		type(eleenterleadid, "10037");
		WebElement elefindleads3 = locateElement("xpath", "//button[text()='Find Leads']");
	    click(elefindleads3);
	    closeBrowser();
	} 
}