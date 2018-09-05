package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeadHw {
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
	    driver.findElementByXPath("//a[text()='Find Leads']").click();
	    driver.findElementByXPath("//span[text()='Email']").click();
	    Thread.sleep(3000);
	    driver.findElementByXPath("//button[text()='Find Leads']").click();
	    driver.findElementByXPath("(//a[text()='Harry'])").getText();
	     driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	    driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
	    String title = driver.getTitle();
	    System.out.println(title);	
	    driver.findElementByXPath("//input[@value='Create Lead']").click();
		}

	

}
