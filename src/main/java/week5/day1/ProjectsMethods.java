package week5.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class ProjectsMethods extends SeMethods {
	
		@Test(groups= "common")
		public void login() {
			startApp("chrome", "http://leaftaps.com/opentaps");
			WebElement eleUserName = locateElement("id", "username");
			type(eleUserName, "DemoSalesManager");
			WebElement elePassword = locateElement("id","password");
			type(elePassword, "crmsfa");
			WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleLogin);
			WebElement elecrmsfa = locateElement("linktext", "CRM/SFA");
			click(elecrmsfa);
			
			
		}
	}
