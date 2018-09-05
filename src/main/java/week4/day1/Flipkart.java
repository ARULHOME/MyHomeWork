package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement aa = driver.findElementByXPath("//span[text()='Electronics']");
		Actions bb=new Actions(driver);
		bb.moveToElement(aa).build().perform();
		bb.contextClick(aa).build().perform();
		driver.findElementByXPath("//input[@name='q']").sendKeys("Bags", Keys.ENTER);
		driver.findElementByXPath("//a[text()='Newport FKNPBB001BK 30 L Backpack']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<>(windowHandles);
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(1));
		
		driver.findElementByXPath("//button[text()='BUY NOW']").click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1=new ArrayList<>(windowHandles1);
		list.addAll(windowHandles1);
		driver.switchTo().window(list1.get(0));
		
		
	}

}
