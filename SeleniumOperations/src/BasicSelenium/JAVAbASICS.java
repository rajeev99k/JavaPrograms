package BasicSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JAVAbASICS 
{
	
	public static void reversestring(String sample)
	{
		char chararray[] = sample.toCharArray();
		String reverse = "";
		/*int arraylength = chararray.length;
		System.out.println(arraylength);*/
		
		for(int i=chararray.length-1;i>=0;i--)
		{
			
			reverse = reverse+chararray[i];
		}
		
		System.out.println(reverse);
		
	}
	
	
	public static void Charoccurence(String samplestring)
	{
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		//int count = 0;
		
		for(char ch: samplestring.toCharArray())
		{
			if(map.containsKey(ch))
			{
				int count = map.get(ch);
				map.put(ch , ++count);
			}
			else
				map.put(ch, 1);
		}
		
		
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey() + ": "+ entry.getValue());
		}
		
	}
	
	
	public static void duplicatearrayvalues()
	{
		String[] sarray = {"Rajeev", "Such", "Sumanth", "Rajeev", "Varun", "Such", "Rajeev"};
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		
		for(String iterator: sarray)
		{
			if(map.containsKey(iterator))
			{ 
				int count = map.get(iterator);
				map.put(iterator, ++count);
			}
			
			else
				map.put(iterator, 1);
			
		}
		
		
		for(Map.Entry<String, Integer> entry: map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ ": "+ entry.getValue());
			}
				
			
		}
		
	}
	
	
	public static void printpattern(int row)
	{
		int mid = row/2;
		System.out.println(mid);
		
		for(int i=1;i<=mid+1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		for(int k=mid;k>=0;k--)
		{
			System.out.print("*");
		}
		System.out.println();
		
		
	}
	
	
	public static void fibonacci(int range)
	{
		int i=0;
		int j = 1;
		System.out.println(i);
		System.out.println(j);
		
		for(int k=0;k<range;k++)
		{
			
			int sum = i+j;
			i=j;
			j=sum;
			
			System.out.println(sum);
		}
		
	}
	
	public void Accept(Object obj)
	{
		System.out.println("Accept Object");
	}
	
	public void Accept(String str)
	{
		System.out.println("Accept String");
	}
	
	public void Accept(StringBuffer str)
	{
		System.out.println("Accept String");
	}
	
	public void findnumber(String sample)
	{
		char[] samplearray = sample.toCharArray();
		
		for(int i=0;i<samplearray.length;i++)
		{
			 int ascii = (int)samplearray[i];
			 if((ascii>=48&&ascii<=57))
			 {
				 System.out.println(samplearray[i]);
			 }
			 else
				 continue;
		}
		
	}
	
	public void Stringreverse(String sample)
	{
		String reverse="";
		
		char[] samplearray = sample.toCharArray();
		
		System.out.println(samplearray.length);
		
		for(int i=samplearray.length-1;i>=0;i--)
		{
			reverse = reverse+samplearray[i];
		}
		
		System.out.println(reverse);
	}
	
	
//	     *
//      ** 	
//	   ***
//    ****
	
	public void patternprinting()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	
	public void sortlist()
	{
		String[] list = {"Rajeev","Ram","Rahul","Sachin","Abhi"};
		
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("Rajeev");
		alist.add("Sachin");
		alist.add("Abhi");
		
		System.out.println("ArrayList Before sorting");
		for(String itr:alist)
		{
			System.out.print(itr+ " ");
		}
		
		System.out.println();
		
		Collections.sort(alist);
		System.out.println("ArrayList After sorting");
		for(String itr:alist)
		{
			System.out.print(itr+ " ");
		}
		
		System.out.println();
		
		System.out.println("Array Before sort");
		for(String itr:list)
		{
			System.out.print(itr+ " ");
		}
		
		System.out.println();
		Arrays.sort(list);
		
		System.out.println("Array After sort");
		for(String itr:list)
		{
			System.out.print(itr+ " ");
		}
		
		System.out.println();
		Set<String> stringset = new HashSet<String>();
		
		stringset.add("Rajeev");
		stringset.add("Sachin");
		stringset.add("Abhi");
		
		System.out.println("Hashset before sort");
		for(String itr:stringset)
		{
			System.out.print(itr+ " ");
		}
		
		
		
	}
	
	public void removechar(String sample, char c)
	{
		String finalstring = "";
		String substring = "";
		
		System.out.println(sample.replaceAll("a", ""));
		
	}
	
	public void split(String sample)
	{
		String[] splitstring = sample.split(",");
		
		for(String str:splitstring)
		{
			System.out.println(str);
		}
	}
	
	
	public void splitlist()
	{
		
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("Vineet");
		slist.add("Rajeev");
		slist.add("Dev");
		slist.add("Arshad");
		
		System.out.println("List Before Sorting");
		System.out.println(slist);
		
		int slistlenght = slist.size();
		
		for(int i=0;i<slistlenght-1;i++)
		{
			
			for(int j=i+1;j<slistlenght;j++)
			{
				
				if(slist.get(i).compareTo(slist.get(j))>0)
				{
					String temp = slist.get(i);
					slist.set(i, slist.get(j));
					slist.set(j, temp);
				}
					
			}
		}
		
		System.out.println("List after sorting");
		System.out.println(slist);
	}
	
	
	public void intarraysort()
	{
		int[] intarray = {99,88,77};
		
		System.out.println("Array before sort");
		for(int itr:intarray)
		{
			System.out.println(itr);
			
		}
		
		int intarraylength = intarray.length;
		System.out.println("Array Length: " +intarraylength);
		
		for(int i=0;i<intarraylength-1;i++)
		{
			for(int j=i+1;j<intarraylength;j++)
			{
				if(intarray[j]<intarray[i])
				{
					int temp = intarray[j];
					intarray[j]=intarray[i];
					intarray[i]=temp;
				}
			}
		}
		
		System.out.println("Array after sort");
		for(int itr:intarray)
		{
			System.out.println(itr);
			
		}
		
	}
	
	public void StringArraysort()
	{
		String[] sarray = {"Vineet","Arshad","Rajeev"};
		
		System.out.println("Array before sort");
		
		for(String itr:sarray)
		{
			System.out.println(itr);
			
		}
		
		int Stringarraylength = sarray.length;
		System.out.println("Array Length: " +Stringarraylength);
		
		for(int i=0;i<Stringarraylength-1;i++)
		{
			for(int j=i+1;j<Stringarraylength;j++)
			{
				if(sarray[i].compareTo(sarray[j])>1)
				{
					String temp = sarray[i];
					sarray[i] = sarray[j];
					sarray[j] = temp;
				}
			}
		}
		
System.out.println("Array after sort");
		
		for(String itr:sarray)
		{
			System.out.println(itr);
			
		}
		
		
	}
	
	public void reversestring_1()
	{
		String sample = "Cucumber Framework";
		String reverse = "";
		
		System.out.println("String Length : " + sample.length());
		
		for(int i=sample.length()-1;i>=0;i--)
		{
			reverse = reverse + sample.charAt(i);
		}
		
		System.out.println(reverse);
	}
	
	
	
	
	 

	public static void main(String[] args) 
	{
		
		JAVAbASICS.reversestring("Rajeev Kashyap N R");
		
		/*int inum = 10;
		long lnum = inum;
		
		int inum2 = (int)lnum;
		
		
		float fnum1 = 2.33f;
		double dnum1 = 5.4e8d;
		
		double dnum2 = fnum1;
		float fnum2 = (float) dnum1;*/
		 
		//JAVAbASICS.Charoccurence("Basavanahalli");
		//JAVAbASICS.duplicatearrayvalues();
		//JAVAbASICS.printpattern(5);
		//JAVAbASICS.fibonacci(10);
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int i = sc.nextInt();
		String name = sc.nextLine();*/
		
		//System.out.println(args[2]);
		
		JAVAbASICS jobj = new JAVAbASICS();
		JAVAbASICS jobj1 = new JAVAbASICS();
		//jobj.Accept(null);
		
		//System.out.println(2!=3);
		/*String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "xyz";
		String s4 = "xyz";
		String s5;
		int i6;*/
		//System.out.println(s1==s2);
		//System.out.println(s3.equals(s4));
		
		//System.out.println(jobj.equals(jobj1));
		//System.out.println(jobj);
		
		//jobj.findnumber("Sap1455ent");
		//jobj.Stringreverse("Sap1ent");
		//jobj.patternprinting();
		//jobj.sortlist();
		
		/*String s1 = "Rajeev";
		s1.concat(" Kashyap");
		System.out.println(s1);
		
		int num = 10;
		num++;
		System.out.println(num);*/
		
		//jobj.removechar("Rajeev Kashyap", 'a');
		//jobj.split("rajeev,lijo,");
		//jobj.splitlist();
		//jobj.intarraysort();
		//jobj.StringArraysort();
		jobj.reversestring_1();
		
	}
	
	
	
	

}
