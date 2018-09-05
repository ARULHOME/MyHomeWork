package javapractice;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inerface {
	public interface Interface extends WebDriver,WebElement,SearchContext{

		public void rollno();
		
		public void studentid();
		
		
		public void studentname();
		
		public void village();
		
		
	}

}
