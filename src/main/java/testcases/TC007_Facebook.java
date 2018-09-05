package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC007_Facebook extends SeMethods {

	@Test
	public void facebook() throws InterruptedException {
		startApp("chrome", "https://www.facebook.com");
		WebElement eleemail = locateElement("id", "email");
		type(eleemail, "yaminiarul1998@gmail.com");
		WebElement elepassw = locateElement("id", "pass");
		type(elepassw, "indhuarul");
		WebElement elelogin = locateElement("xpath", "//input[@value='Log In']");
		click(elelogin);
		Thread.sleep(3000);
		WebElement elesearch = locateElement("xpath", "//input[@aria-label='Search']");
		type(elesearch, "testleaf");
		Thread.sleep(5000);
		WebElement elesearchicon = locateElement("xpath", "//button[@aria-label='Search']");
		click(elesearchicon);
		WebElement elelike = locateElement("xpath", "//button[contains(@class,'PageLikeButton')]");
		if(verifyExactText(elelike, "Like")) {
			click(elelike);
		} else {
			System.out.println("Already Liked");
		}
		Thread.sleep(5000);
		WebElement TestLeafElement= locateElement("xpath", "//div[text()='TestLeaf']");	
		click(TestLeafElement);
		verifyTitle("(66) TestLeaf - Home");
		WebElement elecounts = locateElement("xpath", "(//div[@class='clearfix _ikh'])[2]");
		System.out.println("The count is"+elecounts.getText());

}

}


		

	


