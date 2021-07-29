package BasicSelenium;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SecondTestCase 
{
	
	public void dropdownoperatons()
	{
		FirstTestCase firstobj = new FirstTestCase();
		firstobj.launchbrowser("https://demoqa.com/select-menu");
		List<WebElement> elementlist = firstobj.GetAllDropDownOptions("//select[@id = 'oldSelectMenu']");
		
		for(WebElement iterator:elementlist)
		{
			System.out.println(iterator.getText());
		}
		
		firstobj.SelectbyIndex("//select[@id = 'oldSelectMenu']", 4);
		firstobj.SelectbyVisibleText("//select[@id = 'oldSelectMenu']", "Red");
		
	}
	
	public static void main(String[] args)
	{
		
		//FirstTestCase obj = new FirstTestCase();
		/*obj.launchbrowser("https://www.demoqa.com/automation-practice-form");
		boolean selection =  obj.Selected("//input[@id='hobbies-checkbox-1']");
		System.out.println(selection);
		obj.waitmethod(10);
		System.out.println("Wait over");
		
		if(selection==false)
		{
			obj.SelectCheckboxx("//input[@id='hobbies-checkbox-1']");
			
		}
		*/
		
		SecondTestCase secobj = new SecondTestCase();
		secobj.dropdownoperatons();
		
		
	}
	
}
