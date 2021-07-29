package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldPopulation 
{

	static WebDriver driver;
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\Chrome_90\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/");
		
		WorldPopulation.PrintPopulation("//div[@class='maincounter-number']");
	    
		
		
		driver.quit();
		
		
		
	} 
	
	
	public static void PrintPopulation(String xpath) throws InterruptedException
	{
		int count = 1;
		
		
		while(count<21)
		{
			System.out.println("Count = "+count);
			List<WebElement> poplist =  driver.findElements(By.xpath(xpath));
		
			for(WebElement el : poplist)
			{
				System.out.println(el.getText());
			}
			
			Thread.sleep(1000);
			count++;
		}
	}
	

}
