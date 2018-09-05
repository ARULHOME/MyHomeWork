package week3.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TrainHWwork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("1234");
		driver.findElementById("userRegistrationForm:password").sendKeys("1234567");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("1234567");
		WebElement secqu = driver.findElementById("userRegistrationForm:securityQ");
		Select dd = new Select(secqu);
		dd.selectByVisibleText("What is your pet name?");
	   	driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("tom");
	   	WebElement prlan= driver.findElementById("userRegistrationForm:prelan");
	   	Select dd1 = new Select(prlan);
	   	dd1.selectByVisibleText("English");
	   	driver.findElementById("userRegistrationForm:firstName").sendKeys("ranjitha");
	   	driver.findElementById("userRegistrationForm:middleName").sendKeys("krishnan");
	   	driver.findElementById("userRegistrationForm:lastName").sendKeys("ranjithakrishnan");
	   	driver.findElementByXPath("//label[@for='userRegistrationForm:gender:1']").click();
		driver.findElementByXPath("//label[@for='userRegistrationForm:maritalStatus:1']").click();
		WebElement occu = driver.findElementById("userRegistrationForm:occupation");
		Select dd2 = new Select(occu);
		dd2.selectByVisibleText("Private");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("565437755");
		driver.findElementById("userRegistrationForm:idno").sendKeys("available");
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select dd3= new Select(country);
		dd3.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("abc@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("+91");
		WebElement nation = driver.findElementById("userRegistrationForm:nationalityId");
		Select dd4 = new Select(nation);
		dd4.selectByVisibleText("India");
		
		
		

	}

}


