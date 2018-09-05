package wdMethods;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	public int i = 1;
	public RemoteWebDriver driver;
	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" Launched Successfully");
		} catch (WebDriverException e) {
			System.err.println("The Browser "+browser+" not Launched");
		} finally {
			takeSnap();
		}

	}

	
	public WebElement locateElement(String locator, String locValue) {
		try {
			switch(locator) {
			case "id"	 : return driver.findElementById(locValue);
			case "class" : return driver.findElementByClassName(locValue);
			case "xpath" : return driver.findElementByXPath(locValue);
			case "linktext"  : return driver.findElementByLinkText(locValue);
			case "name"     : return driver.findElementByName(locValue);
			case "src"     : return driver.findElementByXPath(locValue);
			
			}
		} catch (NoSuchElementException e) {
			System.err.println("The Element is not found");
		} catch (Exception e) {
			System.err.println("Unknow Exception ");
		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		
		return null;
	}

	
	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The data "+data+" is Entered Successfully");
		} catch (WebDriverException e) {
			System.out.println("The data "+data+" is Not Entered");
		}finally {
			takeSnap();
		}
	}

	
	public void clickWithNoSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element "+ele+" Clicked Successfully");
		} catch (Exception e) {
			System.err.println("The Element "+ele+"is not Clicked");
		}
	}
	
	
	@Override
	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element "+ele+" Clicked Successfully");
		} catch (WebDriverException e) {
		System.err.println("The Element "+ele+"is not Clicked");
		} 
	}
	

	public void clear(WebElement ele) {
		try {
			ele.clear();
			System.out.println("The Element "+ele+" Clicked Successfully");
		} catch (WebDriverException e) {
		System.err.println("The Element "+ele+"is not Clicked");
		} finally {
			takeSnap();
		}
	}

	@Override
	public String getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select dd = new Select(ele);
			dd.selectByVisibleText(value);
			System.out.println("The DropDown Is Selected with VisibleText "+value);
		} catch (Exception e) {
			System.err.println("The DropDown Is not Selected with VisibleText "+value);
		} finally {
			takeSnap();
		}

	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		new Select(ele).selectByIndex(index);
		System.out.println("");
		takeSnap();

	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		try {
			String title = driver.getTitle();
			if(title.equalsIgnoreCase(expectedTitle))
			{
				System.out.println("title verified");
					
			}else {
				
				System.out.println("title is wrong");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		try {
			if(ele.getText().equals(expectedText)) {
				System.out.println("The text "+ele.getText()+" is matched with "+expectedText);
			} else {
				System.out.println("text not match");
			}
			takeSnap();
		} catch (Exception e) {
			System.err.println("the text is not matched");
			e.printStackTrace();
		}finally
		
		{
			
			takeSnap();
			
		}
		return false;
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		if(ele.getText().contains(expectedText)) {
			System.out.println("The text "+ele.getText()+" is matched with "+expectedText);
		} else {
			System.out.println("text not match");
		}
		takeSnap();
	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

		if (ele.isSelected()) {
			
			System.out.println("the element selected successfully");
		};
	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		try {
			Set<String> allwindows = driver.getWindowHandles();
			List<String> winList = new ArrayList<String>();
			winList.addAll(allwindows);
			driver.switchTo().window(winList.get(index));
			System.out.println("the window switched successfully");
			takeSnap();
		} catch (NoSuchWindowException e) {

			System.err.println("the window not found");
			e.printStackTrace();
			throw new RuntimeException();
		}catch (WebDriverException e)
		
		{
			System.err.println("after throw done");
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(ele);
			System.out.println("");
			takeSnap();
		} catch (Exception e) {
			System.err.println("the frame not switched");
			e.printStackTrace();
		}
	}

	@Override
	public void acceptAlert() {

		try {
			driver.switchTo().alert().accept();
			System.out.println("alertaccepted");
			//takeSnap(); -
		} catch (Exception e) {
			System.err.println("the alert is not accepted");
			e.printStackTrace();
		}

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
		System.out.println("alertrejected");
	}

	@Override
	public String getAlertText() {
		String text = driver.switchTo().alert().getText();
		try {
			//String text = driver.switchTo().alert().getText();
			System.out.println("alerttextcaptured");
			return text;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return text;
		
	}

	
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.err.println("IOException");
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}
