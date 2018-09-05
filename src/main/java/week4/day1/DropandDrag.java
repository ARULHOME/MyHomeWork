package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.findElementByXPath("//a[text()='Droppable']").click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement src = driver.findElementByXPath("//div[@id='draggable']/p");
		WebElement dest = driver.findElementByXPath("//div[@id='droppable']");
		
		
		Actions act=new Actions(driver);
	//	act.clickAndHold().dragAndDrop(src, dest).build().perform();
		act.clickAndHold().dragAndDropBy(src, 100, 200).build().perform();
		
		driver.switchTo().defaultContent();
		
		
	//	driver.switchTo().frame("0");
		
		

	}

}
