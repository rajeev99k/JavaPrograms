package BasicSelenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableoperations 
{
	/*
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\Chrome_89\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();*/
		FirstTestCase firstobj = new FirstTestCase();
		
		
		public void fetchcellvalue()
		{
			firstobj.launchbrowser("http://localhost:90/finsys/login.html");
			firstobj.SetText("//input[@placeholder = 'Username']", "dummyfm");
			firstobj.SetText("//input[@placeholder = 'Password']", "passw0rd");
			firstobj.objectclick("//a[@onclick= 'return ValidateLogin()']");
			
			
			firstobj.objectclick("//*[.='DataGrid']");
			
			System.out.println("Table Row count = "+ firstobj.tablerowcount("//table[@class='datagrid-btable']"));
			System.out.println("Table Column count = "+ firstobj.tablecolcount("//table[@class='datagrid-btable']",1));
			String celldata = firstobj.GetCellValue("//table[@class='datagrid-btable']",3, 4);
			System.out.println("Cell Data: "+celldata);
			
			firstobj.GetCellIndex("//table[@class='datagrid-btable']", "Large");
			
		}
		
		public void PrintRowValues(String CellValue)
		{
			
			firstobj.launchbrowser("http://localhost:90/finsys/login.html");
			firstobj.SetText("//input[@placeholder = 'Username']", "dummyfm");
			firstobj.SetText("//input[@placeholder = 'Password']", "passw0rd");
			firstobj.objectclick("//a[@onclick= 'return ValidateLogin()']");
			
			
			firstobj.objectclick("//*[.='DataGrid']");
			
			int row = firstobj.tablerowcount("//table[@class='datagrid-btable']");
			int column = firstobj.tablecolcount("//table[@class='datagrid-btable']", 1);
			
			for(int i=0;i<row;i++)
			{
				String celldata = firstobj.GetCellValue("//table[@class='datagrid-btable']", i, 0);
				if(celldata.equalsIgnoreCase(CellValue))
				{
					for(int j=0;j<column;j++)
					{
						String CellCalue = firstobj.GetCellValue("//table[@class='datagrid-btable']", i, j);
						System.out.println(CellCalue+"\n");
					}
					
				}
				
			}
		}
		
		
		
		public void table(String xPath,int rownumber)
		{
			firstobj.launchbrowser("http://localhost:90/finsys/seleniumtask.htm");
			firstobj.objectclick("//a[.='Table']");
			WebElement element = firstobj.driver.findElement(By.xpath(xPath));
			int rownum = element.findElements(By.tagName("tr")).size();
			int colnum = element.findElements(By.tagName("tr")).get(rownumber).findElements(By.tagName("td")).size();
			//System.out.println(rownum+"\n"+colnum);
			
			HashMap<Integer,String[]> map = new HashMap<Integer,String[]>();
			
					
			for(int i=0;i<rownum;i++)
			{
				String[] rowdata = new String[colnum];
				for(int j=0;j<colnum;j++)
				{
					if(i==0)
					{
						int result = element.findElements(By.tagName("tr")).get(i).findElements(By.tagName("th")).size();
						//System.out.println(i+" "+result);
						if(result!=0)
						{
							String data = element.findElements(By.tagName("tr")).get(i).findElements(By.tagName("th")).get(j).getText();
							rowdata[j] = data;
						}
						
					}
					
					else
					{
						int result = element.findElements(By.tagName("tr")).get(i).findElements(By.tagName("td")).size();
						//System.out.println(i+" "+result);
						if(result!=0)
						{
							String data = element.findElements(By.tagName("tr")).get(i).findElements(By.tagName("td")).get(j).getText();
							rowdata[j] = data;
						}
					}
				}
				
				
				map.put(i, rowdata);
					
			}
			
			for(Map.Entry<Integer, String[]> entry:map.entrySet())
			{
				System.out.println(entry.getKey());
				
				String[] rowtabledata = entry.getValue();
				
				for(String itr: rowtabledata)
				{
					System.out.println(itr);
					
				}
			}
		}
	
	
	
	public static void main(String[] args) 
	{
		
		Tableoperations tableobj = new Tableoperations();
		//tableobj.fetchcellvalue();
		//tableobj.PrintRowValues("EST-13");
		tableobj.table("//table", 1);
	}

}
