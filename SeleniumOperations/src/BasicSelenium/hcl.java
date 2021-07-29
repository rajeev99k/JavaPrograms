package BasicSelenium;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hcl 
{
	
	WebDriver driver;
	
	public void checkRepeatnumbers()
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits between 25 and 75");
		System.out.println("Entr the first digit");
		int a = sc.nextInt();
		System.out.println("Entr the second digit");
		int b = sc.nextInt();
		boolean result=false;
		
		if((a<25||b<25)||(a>75||b>75))
		{
			System.out.println("Out of range");
		}
		else
		{
			char[] as = Integer.toString(a).toCharArray();
			char[] bs = Integer.toString(b).toCharArray();
			
			outerloop:
			for(int i=0;i<as.length;i++)
			{
				for(int j=0;j<bs.length;j++ )
				{
					if(as[i]==bs[j])
					{
						result = true;
						break outerloop;
					}
				}
			}
			
			if(result)
				System.out.println("True");
			else
				System.out.println("False");
		}
		
		
	}
	
	
	
	public void checkNumbers()
	{
		int a,b;
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers between 25 and 75");
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		
		if((a<25)||(b<25)||(a>75)||(b>75))
		{
			System.out.println("Out of range");
		}
		else
		{
			char[] ca = Integer.toString(a).toCharArray();
			char[] cb = Integer.toString(b).toCharArray();
			
			outerloop:
			for(int i=0;i<ca.length;i++)
			{
				
				for(int j=0;j<cb.length;j++)
				{
					if(ca[i]==cb[j])
					{
						result = true;
						break outerloop;
					}
				}
			}
			
			if(result)
				System.out.println("True");
			else
				System.out.println("False");
		}
		
	}
	
	
	public void takeSS()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeev\\git\\YourLogoTest\\YourLogo\\src\\main\\java\\Config\\chromedriver.exe");
		driver = new ChromeDriver();
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File ssFIle = screenshot.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(ssFIle,"D:\\Screenshot.png");
	}
	
	
	public void set()
	{
		Set<String> snames = new HashSet<String>();
		
		snames.add("Rajeev");
		snames.add("ASrshd");
		
		for(String itr: snames)
		{
			System.out.println(itr);
		}
	}
	
	
	public static void main(String[] args)
	{
		/*String sample = "elephant";
		
		HashMap<Character,Integer> smap = new HashMap<Character, Integer>();
		char[] sarray =  sample.toCharArray();
		
		for(int i=0;i<sarray.length-1;i++)
		{
			if(smap.containsKey(sarray[i]))
			{
				int count = smap.get(sarray[i]);
				count++;
				smap.put(sarray[i], count);
			}
			
			else
				smap.put(sarray[i], 1);
		}
		
		
		for(Map.Entry<Character,Integer> entry : smap.entrySet())
		{
			if(entry.getKey().equals('e'))
			{
				System.out.println(entry.getKey() +"\t"+ entry.getValue());
			}
		}*/
		
		/*hcl hclobj = new hcl();
		//hclobj.checkRepeatnumbers();
		//hclobj.checkNumbers();
		//hclobj.set();
		
		String s1 = "Rajeev";
		String s2 = new String("Rajeev");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));*/
		
		String sample = "hcl";
		String reverse = "";

		for(int i=sample.length()-1;i>=0;i--)
		{
			reverse = reverse+sample.charAt(i);
		}

		System.out.println(reverse);
		
		String sample2 = "hcl";
		System.out.println(sample2.length());
	//	System.out.println(sample2.indexOf(str);
	}
}
