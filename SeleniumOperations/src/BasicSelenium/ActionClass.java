package BasicSelenium;

public class ActionClass 
{

	public void rightclick(String buttonxPath,String url,String dclickxPath)
	{
		FirstTestCase firstobj = new FirstTestCase();
		firstobj.launchbrowser(url);
		firstobj.Rightclick(buttonxPath);
		firstobj.DoubleClick(dclickxPath);
	}
	
	
	public void DragDrop(String url,String sourcexpath,String targetxpath)
	{
		FirstTestCase firstobj = new FirstTestCase();
		firstobj.launchbrowser(url);
		firstobj.DragDropusingxpath(sourcexpath, targetxpath);
		
	}
	
	public void Hover(String url,String menuxpath,String submenuxpath)
	{
		FirstTestCase firstobj = new FirstTestCase();
		firstobj.launchbrowser(url);
		firstobj.MouseHover(menuxpath);
		firstobj.MouseHover(submenuxpath);
		
	}
	
	public void MouseSlider(String url,String xPath,int x,int y)
	{
		FirstTestCase firstobj = new FirstTestCase();
		firstobj.launchbrowser(url);
		firstobj.MouseMover_Slider(xPath, x, y);
		//firstobj.objectclick(xPath);
		
	}
	
	public void CopyPaste(String url,String tagertxPath,String sourcexPath)
	{
		FirstTestCase firstobj = new FirstTestCase();
		firstobj.launchbrowser(url);
		firstobj.EnterText(sourcexPath, "Same as Current Address");
		firstobj.CtrlA(sourcexPath,tagertxPath);
		
		
	}
	
	public static void main(String[] args) 
	{
		
		ActionClass actionobj = new ActionClass();
		//actionobj.rightclick("//button[@id='rightClickBtn']", "http://demoqa.com/buttons", "//button[@id='doubleClickBtn']");
		//actionobj.DragDrop("https://demoqa.com/droppable/", "//div[@id='draggable']", "//div[@id='droppable']");
		//actionobj.Hover("https://demoqa.com/menu/#", "//a[.='Main Item 2']", "//a[.='SUB SUB LIST »']");
		//actionobj.MouseSlider("https://demoqa.com/slider/", "//input[@type = 'range']", 50, 0);
		actionobj.CopyPaste("https://demoqa.com/text-box", "//textarea[@id ='permanentAddress' ]", "//textarea[@placeholder='Current Address']");
		
		
		
		
		
	}

}
