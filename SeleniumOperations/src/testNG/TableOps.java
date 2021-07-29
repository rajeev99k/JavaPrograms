package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicSelenium.FirstTestCase;

public class TableOps extends NewTest
{
	FirstTestCase firstobj = new FirstTestCase();
	
  @Test(groups = {"Finsys"},dependsOnMethods = {"GetPageTitle","Login"})
  public void z() 
  {
	  firstobj.objectclick("//*[.='DataGrid']");
	  System.out.println("Table Visible");
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Table TestCase Started");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Table TestCase Finished");
  }
  
  
}
