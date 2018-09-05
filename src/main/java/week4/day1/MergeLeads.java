package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
    driver.manage().window().maximize();
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByXPath("//a[text()='Leads']").click();
	driver.findElementByXPath("//a[text()='Merge Leads']").click();
	driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
	
	
	Set<String> windowHandles = driver.getWindowHandles();
    List<String> obj = new ArrayList<>();
    obj.addAll(obj);
    driver.switchTo().window(obj.get(1));
    
    Thread.sleep(3000);
	driver.findElementByName("id").sendKeys("10037");
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.name("(10037")));
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
