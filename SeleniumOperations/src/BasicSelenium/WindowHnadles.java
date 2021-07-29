package BasicSelenium;

import java.util.Set;

public class WindowHnadles 
{
	
	public void SwitchWindow(String url,String buttonxPath,String newwindowxpath)
	{
		FirstTestCase firstobj = new FirstTestCase();
		firstobj.launchbrowser(url);
		String mainwindowhandle = firstobj.GetWindowHandle();
		
		firstobj.objectclick(buttonxPath);
		Set<String> allwindowhandles = firstobj.getWindlowHandls();
		
		for(String iterator:allwindowhandles)
		{
			if(!iterator.equalsIgnoreCase(mainwindowhandle))
			{
				firstobj.SwithcWindowfunction(iterator);
			}
			
		}
		
		String newwindowtext = firstobj.GetText(newwindowxpath);
		System.out.println("New Window Text: " +newwindowtext);
		
		
		
	}

	public static void main(String[] args) 
	{
		//
		WindowHnadles handleobj = new WindowHnadles();
		handleobj.SwitchWindow("https://demoqa.com/browser-windows", "button[@id = 'windowButton']","//h1[@id='sampleHeading']");

	}

}
