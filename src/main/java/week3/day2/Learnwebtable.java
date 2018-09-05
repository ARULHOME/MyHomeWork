package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnwebtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);
		boolean selected = driver.
				findElementById("chkSelectDateOnly").isSelected();
		// check CheckBox 
		if (selected) {
			driver.findElementById("chkSelectDateOnly").click();
		}
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		
		/*WebElement rows = table.findElement(By.tagName("tr"));
		System.out.println(rows);
		
		WebElement column = rows.findElement(By.tagName("td"));
		System.out.println(column);
		*/
		
		
		List<WebElement> tr = table.findElements(By.tagName("tr"));
		System.out.println(tr.size());
		for (WebElement webElement : tr) {
		
			System.out.println(webElement.getText());
		}
		
		System.out.println(tr.get(2).getText());
		
		List<WebElement> columns = tr.get(2).findElements(By.tagName("td"));
		
		
		String text2 = columns.get(4).getText();
		System.out.println(text2);
		
		List<WebElement> columns1 = tr.get(8).findElements(By.tagName("td"));
		String text3 = columns1.get(6).getText();
		System.out.println("8th row 6th column"+text3);
			
		List<WebElement> obj = tr.get(5).findElements(By.tagName("td"));
		String text4 = obj.get(2).getText();
		System.out.println("5th row 2nd column"+ "  "+text4);
		for (WebElement eachTr : tr) {
			String text = eachTr.findElements(By.tagName("td")).get(1).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(tr.size());
		WebElement firstRow = tr.get(0);
		List<WebElement> td = firstRow.findElements(By.tagName("td"));
		String text = td.get(1).getText();
		System.out.println(text);
		*/
		
		
		
		
		
		
		
		
		
		
		


		//WebElement ele = driver.findElementById("chkSelectDateOnly");


	}


}	





