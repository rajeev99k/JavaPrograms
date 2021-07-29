package testNG;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import BasicSelenium.FirstTestCase;

public class NewTest 
{
	FirstTestCase firstobj = new FirstTestCase();
	
	
  @Test(priority = 0,groups = {"Finsys"})
  public void GetPageTitle() 
  {
	  firstobj.launchbrowser("http://localhost:90/finsys/login.html");
	  String title = firstobj.PageTitle();
	  System.out.println("Page Title: "+ title);
  }
  
  
  @Test(priority = 1, groups = {"Finsys"})
  public void Login()
  {
	  	firstobj.SetText("//input[@placeholder = 'Username']", "dummyfm");
		firstobj.SetText("//input[@placeholder = 'Password']", "passw0rd");
		firstobj.objectclick("//a[@onclick= 'return ValidateLogin()']");
		WebElement logoutbutton = firstobj.IsObjectExists("//a[@onclick='TerminateSession()']");
		if(logoutbutton.isDisplayed())
		{
			System.out.println("Login Successful");
			
		}
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Launching test in Chrome Browser");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Finished test in Chrome Browser");
  }

}
