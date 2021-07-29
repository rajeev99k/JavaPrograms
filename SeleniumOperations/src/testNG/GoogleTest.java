package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GoogleTest extends testBase
{
	WebDriver driver;
	
 @BeforeMethod
 public void beforeMethod() 
 {
	 /*System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\Chrome_90\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
	 super.Initialization();
 }
	
	
  @Test(groups="Google")
  public void getTitle() 
  {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Google", "Not Displayed as expected");
	
	String color = driver.findElement(By.xpath("//button[@name = 'login']")).getCssValue("color");
	System.out.println(color);
  }
  
/*  @Test(priority=1,groups="Google")
  public void googlelogotest() 
  {
	boolean result = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	Assert.assertTrue(result, "Logo is displayed");
  }*/
  

  @AfterMethod
  public void teardown() 
  {
	  driver.quit();
  }

}
