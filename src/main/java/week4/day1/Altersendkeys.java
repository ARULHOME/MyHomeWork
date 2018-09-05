package week4.day1;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Altersendkeys {

	public static void main(String[] args) throws HeadlessException, AWTException ,IOException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
         js.executeScript("document.getElementById('email').value='vasanth';");
		 
		 js.executeScript("document.getElementById('pass').value= 'vasanth';");
		
		 
		 BufferedImage image =new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		 
		 ImageIO.write(image, "png", new File("D:\\photos\\fullscreen.png"));
	}

}
