package testcases;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import cucumber.api.java.it.Date;
import wdMethods.SeMethods;

public class TC008_ZoomCar extends SeMethods {
		@Test
		public void Zoomcar() throws InterruptedException {
		{
			startApp("chrome", "https://www.zoomcar.com/chennai");
			WebElement elesearch = locateElement("xpath", "//a[@title='Start your wonderful journey']");
			click(elesearch);
			WebElement elepickup = locateElement("xpath", "//div[@class='items']");
			click(elepickup);
			WebElement elenext = locateElement("xpath", "//button[text()='Next']");
			click(elenext);
			WebElement eledate = locateElement("xpath", "//div[@class='day']/*[1]");
			click(eledate);
			WebElement elenext2 = locateElement("xpath", "//button[text()='Next']");
			click(elenext2);
			WebElement eledone = locateElement("xpath", "//button[text()='Done']");
			click(eledone);
			Thread.sleep(3000);
			List<WebElement> prize = driver.findElements(By.className("price"));
			System.out.println(prize.size());
			List<String> car=new ArrayList<>();
			
			for (WebElement webElement : prize) {
				System.out.println(webElement.getText().toString().replaceAll("\\D", ""));
				
				car.add(webElement.getText().toString().replaceAll("\\D", ""));
			}
			
			String max = Collections.max(car);
			System.out.println(max);
			
			WebElement elehightolow = locateElement("xpath", "//div[text()=' Price: High to Low ']");
			click(elehightolow);
			Thread.sleep(2000);
			WebElement Brandname = locateElement("xpath", "//h3[text()='Hyundai Verna']");
			
			System.out.println(getText(Brandname));
			List<WebElement> totbname = driver.findElements(By.className("(//div[@class='car-layout'])[2]"));			
			System.out.println(totbname.size());
			
			for (WebElement webElement : totbname) {
				System.out.println(webElement.getText());
			}
			
			WebElement elebooknow = locateElement("xpath", "//button[text()='BOOK NOW']");
			click(elebooknow); 
			//driver.close();
			
		}
	
			
		}
	}


