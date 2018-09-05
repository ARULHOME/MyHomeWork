package testcases;


	import org.testng.annotations.Test;
	import org.testng.annotations.Test;
	import org.testng.annotations.Test;
	import org.openqa.selenium.WebElement;

	import wdMethods.SeMethods;

	public class DeleteLead extends SeMethods{
		@Test(groups= "regression")//(dependsOnMethods="testcases. DeleteLead.EditLead()",priority=1)
		public void delete_lead()
		{
			System.out.println("delete Lead");
		startApp("chrome", "http://leaftaps.com/opentaps");

		WebElement eleUserName1 = locateElement("id", "username");
		type(eleUserName1, "DemoSalesManager");
		WebElement elePassword1 = locateElement("id","password");
		type(elePassword1, "crmsfa");
		WebElement eleLogin1 = locateElement("class","decorativeSubmit");
		click(eleLogin1);
		WebElement elink1=locateElement("linktext", "CRM/SFA");
		click(elink1);
		WebElement elink4=locateElement("linktext", "Leads");
		click(elink4);
	    WebElement elink2=locateElement("linktext", "Find Leads");
		click(elink2);
	    WebElement elink3=locateElement("xpath", "//span[text()='Phone']");
		click(elink3);
	    WebElement elink6=locateElement("xpath", "//input[@name='phoneNumber']");
	    type(elink6,"9791064364");
	    WebElement elink7=locateElement("xpath", "//button[text()='Find Leads']");
		click(elink7);
	    WebElement elink8=locateElement("xpath", "//table[@class='x-grid3-row-table']//tr//div//a");
	    String text=elink8.getText();
		click(elink8);
	    WebElement elink9=locateElement("linktext", "Delete");
		click(elink9);
	    WebElement elink10=locateElement("linktext", "Find Leads");
		click(elink10);
	    WebElement elink11=locateElement("xpath", "//input[@name='id']");
	    type(elink11,text);
	    WebElement elink12=locateElement("xpath", "//button[text()='Find Leads']");
		click(elink12);
	    boolean elink13=locateElement("xpath", "//div[text()='No records to display']").isDisplayed();
	    if(elink13==true)
	    {
	    	System.out.println("The Record is Deleted successfully");
	    }
	    else 
	    {
	    	System.out.println("The Record is not  Deleted successfully");
		
	    }
	    
		closeBrowser();
		
	    
	    }



		

}
