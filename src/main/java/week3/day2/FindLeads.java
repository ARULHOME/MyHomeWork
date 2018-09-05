package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeads {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	   driver.findElementByXPath("//a[text()='Leads']").click();

	   
	 //  String title = driver.getTitle();
	//   System.out.println(title);
	   
	    
	   // driver.findElement(By.linkText("Leads")).click();
	   
	   driver.findElementByXPath("//a[text()='Find Leads']").click();
	   driver.findElementByXPath("//button[@class='x-btn-text']").click();
	   driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	   driver.findElementByXPath("//a[text()='Merge Leads']").click();
	   driver.findElementByXPath("//img[@alt='Lookup']").click();
	    
	    
		}

	}


