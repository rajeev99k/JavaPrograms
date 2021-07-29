package BasicSelenium;


import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase 
{
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	String browserchoice = null;
	
	public FirstTestCase()
	{
		 
		System.out.println("Enter your browser choice\n ff for firefox \n ch for chrome \n ie for Internet Explorer");
		Scanner sc = new Scanner(System.in);
		browserchoice = sc.nextLine();
		System.out.println(browserchoice);
	
	}
		
	public void launchbrowser(String url)
	{
		
		
		if(browserchoice.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM TRAINING\\Delivery\\design phase\\FinsysProject\\AllDrivers\\geckodriver64bit.exe");
			 driver = new FirefoxDriver();
		}
		
		else if(browserchoice.equalsIgnoreCase("ch"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\Chrome_89\\chromedriver_win32\\chromedriver.exe"); 
			 driver = new ChromeDriver();
		}
		else if(browserchoice.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\IEDrivers\\IEDriverServer.exe"); 
			 driver = new InternetExplorerDriver();
		}
		
		else
		{
			System.out.println("Invalid Choice");
		}
		
		wait = new WebDriverWait(driver, 30);
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	
	
	public WebElement IsObjectExists(String xPath)
	{
		WebElement obj = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
		return obj;
	}
	
	public String PageTitle()
	{
		
		return driver.getTitle();
	}
	
	public String pageurl() 
	{
		
		return driver.getCurrentUrl();
	}
	
	public String PageSpucre()
	{
		
		return driver.getPageSource();
	}
	
	public void closebrowser()
	{
		
		driver.quit();
	}

	public void objectclick(String xPath)
	{ 
		WebElement obj = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
		obj.click();
	}
	
	
	public boolean Selected(String xPath)
	{
		WebElement obj = IsObjectExists(xPath);
		return obj.isSelected();
	}
	
	public void SelectCheckboxx(String XPath)
	{
		WebElement obj = IsObjectExists(XPath);
		obj.click();
	}
	
	public void waitmethod(int time)
	{
		
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void SelectbyIndex(String xPath,int index)
	{
		WebElement obj = IsObjectExists(xPath); 
		Select sel = new Select(obj);
		sel.selectByIndex(index);
		
	}
	
	public void SelectbyVisibleText(String xPath,String Visibletest)
	{
		WebElement obj = IsObjectExists(xPath); 
		Select sel = new Select(obj);
		sel.selectByVisibleText(Visibletest);
	}
	
	public List<WebElement> GetAllDropDownOptions(String xPath)
	{
		WebElement obj = IsObjectExists(xPath);
		Select sel = new Select(obj);
		List<WebElement> alloptions = sel.getOptions();
		return alloptions;
	}

	public String GetCellValue(String xpath,int rownum,int colnum)
	{
		WebElement obj = IsObjectExists(xpath);
		String cellvalue = obj.findElements(By.tagName("tr")).get(rownum).findElements(By.tagName("td")).get(colnum).getText();
		
		return cellvalue;
	}
	
	public int tablerowcount(String xPath)
	{
		
		WebElement obj = IsObjectExists(xPath);
		int rowcount = obj.findElements(By.tagName("tr")).size();
		return rowcount;
	}
	
	public int tablecolcount(String xPath, int rownum)
	{
		
		WebElement obj = IsObjectExists(xPath);
		int colcount = obj.findElements(By.tagName("tr")).get(rownum).findElements(By.tagName("td")).size();
		return colcount;
	}
	
	public void SetText(String xPath,String textvalue)
	{
		WebElement obj = IsObjectExists(xPath);
		obj.sendKeys(textvalue);
		
	}
	
	public String GetText(String xPath)
	{
		WebElement obj = IsObjectExists(xPath);
		return obj.getText();
	}
	
	
	public void GetCellIndex(String xPath,String text)
	{
		//WebElement obj = IsObjectExists(xPath);
		int rownum = tablerowcount(xPath);
		int colnum = tablecolcount(xPath, 1);
		
		for(int i=0;i<rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				String actualtext = GetCellValue(xPath, i, j);
				if(actualtext.equalsIgnoreCase(text))
				{
					System.out.println("Rownumber = "+i+" ColumnNumber = "+ j);
					break;
				}
				
				
			}
			
		}
		
	}
	
	
	public String GetWindowHandle()
	{
		String WindowHandle = driver.getWindowHandle();
		return WindowHandle;
	}
	
	public Set<String> getWindlowHandls()
	{
		Set<String> handles = driver.getWindowHandles();
		return handles;
		
	}
	
	public void SwithcWindowfunction(String WindowHandle)
	{
		driver.switchTo().window(WindowHandle);
		
	}
	
	
	public void Rightclick(String xPath)
	{
		WebElement obj = IsObjectExists(xPath);
		Actions act = new Actions(driver);
		act.contextClick(obj).perform();
	}

	public void DoubleClick(String xPath)
	{
		WebElement obj = IsObjectExists(xPath);
		Actions act = new Actions(driver);
		act.doubleClick(obj).perform();
		
	}
	
	public void DragDropusingxpath(String sourexpath,String targetxpath)
	{
		WebElement obj1 = IsObjectExists(sourexpath);
		WebElement obj2 = IsObjectExists(targetxpath);
		Actions act = new Actions(driver);
		
		act.dragAndDrop(obj1, obj2).perform();
	}
	
	
	public void MouseHover(String xPath)
	{
		WebElement obj = IsObjectExists(xPath);
		Actions act = new Actions(driver);
		
		act.moveToElement(obj).perform();
	}
	
	public void MouseMover_Slider(String xPath,int xoffset,int yoffset)
	{
		
		WebElement obj = IsObjectExists(xPath);
		Actions act = new Actions(driver);
		act.moveToElement(obj, xoffset, yoffset).perform();
		objectclick(xPath);
	}
	
	public void ContrlC(String xPath)
	{
		WebElement obj = IsObjectExists(xPath);
		Actions act = new Actions(driver);
		
		act.keyDown(obj, Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(obj,Keys.CONTROL);
		act.build().perform();
	}
	
	public void CtrlA(String sourcexPath,String targetxPath)
	{
		WebElement obj1 = IsObjectExists(sourcexPath);
		Actions act = new Actions(driver);
		
		act.keyDown(obj1, Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(obj1, Keys.CONTROL);
		act.build().perform();
		
		act.keyDown(obj1, Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(obj1,Keys.CONTROL);
		act.build().perform();
		
		WebElement obj2 = IsObjectExists(targetxPath);
		act.keyDown(obj2, Keys.CONTROL);
		act.sendKeys(obj2,"v");
		act.keyUp(obj2, Keys.CONTROL);
		act.build().perform();
	}
	
	public void CtrlV(String xPath)
	{
		WebElement obj = IsObjectExists(xPath);
		Actions act = new Actions(driver);
		
		act.keyDown(obj, Keys.CONTROL);
		act.sendKeys(obj,"v");
		act.keyUp(obj, Keys.CONTROL);
		act.build().perform();
	}
	
	public void EnterText(String xPath,String text)
	{
		
		WebElement obj = IsObjectExists(xPath);
		obj.sendKeys(text);
	}
	
	
/*	public void DrapDropusingOffset(String sourcexpath,String Targetxpath)
	{
		WebElement sourceobj = IsObjectExists(sourcexpath);
		WebElement targetobj = IsObjectExists(Targetxpath);
		
		Actions act = new Actions(driver);
		
		int sourcex = sourceobj.getLocation().getX();
		int sourcey = sourceobj.getLocation().getY();
		int targetx = sourceobj.getLocation().getX();
		int targety = sourceobj.getLocation().getY();
		
		act.dragAndDropBy(sourcexpath, sourcex-targetx, yOffset)
		
	}*/
	
	
	
	public static void main(String[] args) 
	{
		/*System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\Chrome_89\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		try
		{
		
		driver.get("http://localhost:90/finsys");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("dummyfm");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("passw0rd");
		driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']")).click();
		
		System.out.println("Login Successful");
		}
		
		catch(Exception e)
		{
			System.out.println("Login Unsuccessful");
			
		}*/
		
		
		FirstTestCase firstobj = new FirstTestCase();
		String sampleurl = "http://localhost:90/finsys";
		firstobj.launchbrowser(sampleurl);
		/*String PageTitle = firstobj.PageTitle();
		System.out.println("Page Title is "+PageTitle+" and page title length is "+PageTitle.length());
		
		String URL = firstobj.pageurl();
		if(URL.equalsIgnoreCase(sampleurl))
		{
			
			System.out.println("URL is as expected");
		}

		String pagesource = firstobj.PageSpucre();
		System.out.println("pageSource: "+pagesource+" and pagespurce length: "+ pagesource.length());*/
		WebElement element = firstobj.IsObjectExists("//input[@placeholder = 'Username']");
		element.sendKeys("dummyfm");
		
		//firstobj.closebrowser();
		
	}

}
