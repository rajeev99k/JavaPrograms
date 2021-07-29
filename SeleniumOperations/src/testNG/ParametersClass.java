package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersClass 
{
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"url","driver"})
	public void LaunchBrowser(String url)
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\Chrome_89\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
  @Test

  public void f() 
  {
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rk@yahoo.com");;
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
  }
  
  
  @AfterMethod
  public void QuitBrowser()
  {
	  driver.quit();
  }
}
