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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC002_CreadLead extends  TC001_Login {

		
		@Test//(groups = "smoke")
		public void CreadLead() {
			
			WebElement elecrle = locateElement("linktext", "Create Lead");
			click(elecrle);
			WebElement elecompanyname = locateElement("id", "createLeadForm_companyName");
			type(elecompanyname, "tcs");
			WebElement elefirstname = locateElement("id", "createLeadForm_firstName");
			type(elefirstname,  "yamini" );
			WebElement elelastname = locateElement("id", "createLeadForm_lastName");
			type(elelastname, "arul");
			WebElement elefirstnameloc = locateElement("id", "createLeadForm_firstNameLocal");
			type(elefirstnameloc,"lakshmi" );
			WebElement elelastnameloc = locateElement("id","createLeadForm_lastNameLocal");
			type(elelastnameloc, "priya");
			WebElement elecreateLeadForm_dataSourceId = locateElement("id", "createLeadForm_dataSourceId");
			selectDropDownUsingText(elecreateLeadForm_dataSourceId, "Other");
			WebElement elemarketing = locateElement("id", "createLeadForm_marketingCampaignId");
			selectDropDownUsingText(elemarketing,"Automobile");
			WebElement elephoneno = locateElement("id", "createLeadForm_primaryPhoneNumber");
			type(elephoneno, "9234648698");
			WebElement eleemailadd = locateElement("id","createLeadForm_primaryEmail");
			type(eleemailadd, "yaminiarul@gmail.com");
			WebElement elesubmit = locateElement("name","submitButton" );
			click(elesubmit);
			
		}
			/*@Test
			public void EditLead() throws InterruptedException {
			WebElement eleleads = locateElement("linktext", "Leads");
			click(eleleads);
			WebElement elefindld = locateElement("xpath", "//a[text()='Find Leads']");
			click(elefindld);
			Thread.sleep(3000);
			WebElement elefirstname = locateElement("xpath", "(//input[@name='firstName'])[3]");
			type(elefirstname, "Sarma");
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
			clear(elecomname);
			type(elecomname, "software");
			WebElement elesubbt = locateElement("name", "submitButton");
			click(elesubbt);*/
			
			
			
			
		
			
		//}

	
	}


