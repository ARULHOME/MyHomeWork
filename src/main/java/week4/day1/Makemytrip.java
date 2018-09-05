package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			driver.findElementByXPath("//input[@id='hp-widget__sfrom']").clear();
			driver.findElementByXPath("//input[@id='hp-widget__sfrom']").sendKeys("MAA", Keys.TAB);
			Thread.sleep(2000);
			driver.findElementById("hp-widget__sTo").sendKeys("BLR", Keys.TAB);
			WebElement table = driver.findElementByXPath("//table[@class='ui-datepicker-calendar']");
			
			List<WebElement> tr = table.findElements(By.tagName("tr"));
			System.out.println(tr.size());
			
			
			List<WebElement> td = tr.get(3).findElements(By.tagName("td"));
			
			String text= td.get(6).getText();
			System.out.println(text);
			
			
			
		}
}
