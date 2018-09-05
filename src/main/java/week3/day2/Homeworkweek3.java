package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Homeworkweek3 {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElementById("username").sendKeys("demosalesmanager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
		    driver.findElementByLinkText("CRM/SFA").click();
		    driver.findElementByXPath("//a[text()='Leads']").click();	
		    driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
		    driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("ranjitha");
		    
		   
		   
		    driver.findElementByXPath("//button[text()='Find Leads']").click();
		    Thread.sleep(3000);
		   driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		   String title = driver.getTitle();
		   System.out.println(title);
		  driver.findElementByXPath("//a[text()='Edit']").click();
		  driver.findElementById("updateLeadForm_companyName").clear();
		  driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		 driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		 driver.close();
		    
		    
		}

	}


