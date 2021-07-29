package BasicSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class bambooRose 
{

	public static void filereader() throws IOException 
	{
		File file = new File("D:\\TestData\\exmaple1.txt");
		
		file.createNewFile();
		
		
		FileWriter writer = new FileWriter(file);
		
		writer.write("Initial try");
		writer.flush();
		writer.close();
		
		
		FileReader reader = new FileReader(file);
		char[] a = new char[50];
		reader.read(a);
		
		for(char ch:a)
		{
			System.out.print(ch);
		}
		
		reader.close();
	}
	
	
	public static void fetchexceldata() throws IOException
	{
		File file = new File("D:\\TestData\\TestData.xlsx");
		FileInputStream input = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(input);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowcount][colcount];
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				System.out.print(data[i][j]+ "\t");
			}
			
			System.out.println();
		}
		
		
		
	}
	
	
	
	public static void substringcheck(String sub)
	{
		String sample = "BambooRose Pvt Ltd";
		
		boolean result = sample.matches("(.*)"+sub+"(.*)");
		
		if(result)
			System.out.println("SubString "+sub+" exists");
		else
			System.out.println("SubString "+sub+" doesnot exists");
		 
	}
	
	
	public static void sortlist()
	{
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("Rajeev");
		slist.add("Sumanth");
		slist.add("Ashok");
		
		

		System.out.println("Before Sort");
		for(String itr: slist)
		{
			System.out.println(itr);
		}
		
		
		int listsize = slist.size();
		
		for(int i=0;i<listsize-1;i++)
		{
			for(int j=i+1;j<listsize;j++)
			{
				if(slist.get(i).compareTo(slist.get(j))>0)
				{
					String temp = slist.get(i);
					slist.set(i, slist.get(j));
					slist.set(j, temp);
				}
			}
		}
		
		
		System.out.println("After Sort");
		for(String itr: slist)
		{
			System.out.println(itr);
		}
		
	}
	
	
	public static void stringReverse()
	{
		String sample = "BambooRose Pvt Ltd";
		String reverse = "";
		
		for(int i=sample.length()-1;i>=0;i--)
		{
			reverse = reverse+sample.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		StringBuilder build = new StringBuilder();
		build.append(sample);
		build.reverse();
		String reverse1 = build.toString();
		System.out.println(reverse1);
	}
	
	
	public static void findtop2()
	{
		
		int[] iarray = {55,99,1211,987};
		int top = 0, second = 0;
		
		for(int itr : iarray)
		{
			if(itr>top)
			{
				top = itr;
			}
		}
		
		for(int itr : iarray)
		{
			if(itr>second)
			{
				if(itr==top)
					continue;
				else
					second = itr;
			}
		}
		
		System.out.println(top+"\t"+second);
		
	}
	
	
	public static void charcount()
	{
		String sample = "BambooRose Pvt Ltd";
		HashMap<Character, Integer> cmap = new HashMap<Character, Integer>();
		char[] carray = sample.toCharArray();
		
		for(char itr: carray)
		{
			if(cmap.containsKey(itr))
			{
				int count = cmap.get(itr);
				count++;
				cmap.put(itr, count);
			}
			else
				cmap.put(itr, 1);
		}
		
		for(Map.Entry<Character, Integer> entry:cmap.entrySet())
		{
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		
	Set<Character> sc = cmap.keySet();
	Iterator<Character> itr = sc.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	 
}
	
	public static void fileread() throws IOException
	{
		File file = new File("D:\\TestData\\example2.text");
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file);
		writer.write("BamboRose");
		writer.flush();
		writer.close();
		
		FileReader reader = new FileReader(file);
		char[] carray = new char[50];
		reader.read(carray);
		reader.close();
		
		for(char ch:carray)
		{
			System.out.print(ch);
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		/*bambooRose.filereader();
		System.out.println();
		bambooRose.fetchexceldata();*/
		
		
		/*String sample = "BambooRose Pvt Ltd";
		
		System.out.println(sample);
		System.out.println("Length :"+sample.length());
		System.out.println("Character at 6 : "+ sample.charAt(6));
		
		System.out.println("SubString from 4th position "+ sample.substring(4));
		System.out.println("SubString from 4th to 12th position "+ sample.substring(4,12));
		
		System.out.println("Index of oo: "+sample.indexOf("oo"));
		System.out.println("Index of t after 5th position: "+sample.indexOf("t",5));
		System.out.println("Last index of t: "+sample.lastIndexOf("t"));
		
		System.out.println("Replace o with i: "+sample.replace("o", "e"));
		
		bambooRose.substringcheck("RoseP");
		bambooRose.sortlist();
		bambooRose.stringReverse();
		bambooRose.findtop2();
		bambooRose.charcount(); 
		
		
		
		String str = "Rajeev";
		String str1 = new String("Rajeev");
		
		String result = str1.intern();
		System.out.println(result);
		
		long l1 = 555l;*/
		
		//bambooRose.fileread();
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss").format(new Date());
		System.out.println(timeStamp);
		
		
		
	}

}
