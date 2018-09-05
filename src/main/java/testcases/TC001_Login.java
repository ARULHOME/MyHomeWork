package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.SeMethods;
@Test
public class TC001_Login extends SeMethods{
	
	
	@BeforeClass(groups= "common")
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
	@AfterClass(groups= "common")
	public void close()
	{
		driver.quit();
	}

}








