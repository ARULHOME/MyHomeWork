package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		 driver.manage().window().maximize();
		 driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		 driver.findElementByXPath("//a[text()='Contact Us']").click();
		 
		 
		 Set<String> window= driver.getWindowHandles();
		 List<String> obj = new ArrayList<>();
		 obj.addAll(window);
		driver.switchTo().window(obj.get(1));
		
		
		String text = driver.findElementByXPath(" //b[text()='I-tickets/e-tickets : ']").getText();
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		System.out.println(title);
		System.out.println(text);
		 Set<String> window1= driver.getWindowHandles();
		 List<String> obj1 = new ArrayList<>();
		 obj.addAll(window1);
		driver.switchTo().window(obj1.get(0));
		
		// String window1 = driver.getWindowHandle();
		// System.out.println("window1");
		// Set<String> windows = driver.getWindowHandles();
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
