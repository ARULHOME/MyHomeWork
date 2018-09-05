package week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();                
		driver.findElementById("createLeadForm_companyName").sendKeys("tcs");	
		driver.findElementById("createLeadForm_firstName").sendKeys("yamini");
		driver.findElementById("createLeadForm_lastName").sendKeys("arul");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd= new Select( source);
		dd.selectByVisibleText("Conference");
		WebElement marketing= driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1= new Select(marketing);
		dd1.selectByVisibleText("Car and Driver");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("lakshmi");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("viji");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Students");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Bsc cs");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("20000");
		WebElement Preferred = driver.findElementById("createLeadForm_currencyUomId");
		Select dd2= new Select(Preferred);
		dd2.selectByVisibleText("INR-indian Rupee");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dd3= new Select(industry);
		dd3.selectByVisibleText("Computer Software");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
