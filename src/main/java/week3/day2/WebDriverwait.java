package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverwait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Leads").click();
	    driver.findElementByLinkText("Find Leads").click();
	    WebDriverWait  wait= new  WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Findleads')] ")));
	    driver.findElementByClassName("x path").click();
	}
}


