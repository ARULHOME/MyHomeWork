package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC005_EditLead extends TC001_Login {
	@Test(groups= "sanity")//(dependsOnMethods="testcases.TC005_EditLead.CreadLead()",priority=2)
	public void EditLead() throws InterruptedException, IOException {
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
		Thread.sleep(3000);
		WebElement elefirstname = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(elefirstname, "sibi");
		WebElement elefindleads = locateElement("xpath", "//button[text()='Find Leads']");
		click(elefindleads);
		WebElement elefirstlead = locateElement("xpath", "(//a[@class='linktext'])[4]");
		click(elefindleads);
		WebElement elefindleadsbt = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		click(elefindleadsbt);
		
		  String title = driver.getTitle();
	System.out.println(title);
		verifyTitle("View Lead | opentaps CRM");
		WebElement eleedit = locateElement("xpath", "//a[text()='Edit']");
		click(eleedit);
		WebElement elecomname = locateElement("id", "updateLeadForm_companyName");
		//clear(elecomname);
		type(elecomname, "software");
		WebElement elesubbt = locateElement("name", "submitButton");
		click(elesubbt);
		//closeBrowser();
		
}
}