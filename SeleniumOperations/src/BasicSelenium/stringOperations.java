package BasicSelenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class stringOperations 
{
	
	static int i = 1;
	
	public static void Palindrome1(String sample)
	{
		StringBuilder build = new StringBuilder();
		build.append(sample);
		build.reverse();
		String reverse = build.toString();
		
		if(sample.equalsIgnoreCase(reverse))
			System.out.println("Given String is palindrome");
		else
			System.out.println("Given String is not palindrome");
	}
	
	public static void Palindrome2(String sample)
	{
		String reverse = "";
		for(int i=sample.length()-1;i>=0;i--)
		{
			reverse = reverse+sample.charAt(i);
		}
		
		if(sample.equalsIgnoreCase(reverse))
			System.out.println("Given String is palindrome");
		else
			System.out.println("Given String is not palindrome");
			
	}
	
	public static void stringcase(String sample)
	{
		String ucase = sample.toUpperCase();
		String lcase = sample.toLowerCase();
		
		System.out.println("UpperCase: "+ucase);
		System.out.println("LowerCase: "+lcase);
	}
	
	public static void replace1(String sample)
	{
		String replacestring = sample.replace('e', 'i');
		System.out.println("Replaced String:"+ replacestring);
	}
	
	
	public static void index1(String sample)
	{
		String sub1 = sample.substring(4);
		System.out.println(sub1);
		
		
		String sub2 = sample.substring(1, 4);
		System.out.println(sub2);
		
		int index1 = sample.indexOf('e');
		System.out.println(index1);
		
		int index2 = sample.indexOf('a', 10);
		System.out.println(index2);
		
		int index3 = sample.lastIndexOf('a');
		System.out.println(index3);
	}
	
	public static void trimstring(String sample)
	{
		String finalstring = sample.trim();
		System.out.println("Final string after trim : "+ finalstring);
		
	}
	
	public static void match(String sample,String sub)
	{
		boolean result = sample.matches("(.*)"+sub+"(.*)");
		if(result)
			System.out.println("Substring is present");
		else
			System.out.println("Substring is not present");
	}
	
	
	public static void sortarray()
	{
		int[] iarray = {7676533,888,9,1};
		int iarraylength = iarray.length;
		
		System.out.println("Array Before Sort");
		
		for(int itr:iarray)
		{
			System.out.println(itr);
		}
		
		for(int i=0;i<iarraylength-1;i++)
		{
			for(int j=i+1;j<iarraylength;j++)
			{
				if(iarray[i]>iarray[j])
				{
					int temp = iarray[i];
					iarray[i] = iarray[j];
					iarray[j] = temp;
				}
			}
		}
		
	System.out.println("Array after Sort");
		
		for(int itr:iarray)
		{
			System.out.println(itr);
		}
	}
	
	
	public static void sortlist()
	{
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("Rajeev");
		slist.add("ZS");
		slist.add("TechM");
		
		int slistsize = slist.size();
		
		
		System.out.println("List before sort");
		for(String itr: slist)
		{
			System.out.println(itr);
		}
		
		
		for(int i=0;i<slistsize-1;i++)
		{
			for(int j=i+1;j<slistsize;j++)
			{
				if(slist.get(i).compareTo(slist.get(j))>1)
				{
					String temp = slist.get(i);
					slist.set(i, slist.get(j));
					slist.set(j, temp);
				}
			}
		}
		
		System.out.println("List after sort");
		for(String itr: slist)
		{
			System.out.println(itr);
		}
		
	}
	
	
	public static void findtop2()
	{
		int[] iarray = {987,888,9,1};
		int highest = 0,sechighest=0;
		int iarraylength = iarray.length;
		
		for(int i=0;i<iarraylength;i++)
		{
			if(iarray[i]>highest)
			{
				highest = iarray[i];
			}
			
		}
		
		for(int i=0;i<iarraylength;i++)
		{
		if(iarray[i]>sechighest)
		{
			if(iarray[i]==highest)
				continue;
			else
				sechighest = iarray[i];
		}
		}
		
		System.out.println("Highest = "+highest);
		System.out.println("Second Highest = "+sechighest);
	}
	
	
	public static void settry()
	{
		HashSet<String> hset = new HashSet<String>();
		hset.add("Rajeev");
		hset.add("Atharsh");
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
	public static void wordcount()
	{
		String sample = "My name name name is is Rajeev Rajeev";
		String[] sarray = sample.split(" ");
		HashMap<String, Integer> smap = new HashMap<String, Integer>();
		
		for(String itr: sarray)
		{
			if(smap.containsKey(itr))
			{
				int count = smap.get(itr);
				count++;
				smap.put(itr, count);
			}
			else
				smap.put(itr, 1);
		}
		
		for(Map.Entry<String, Integer> entry: smap.entrySet())
		{
			System.out.println("Key: "+entry.getKey());
			System.out.println("Value: "+entry.getValue());
			System.out.println();
		}
	}
	
	public static void charcount()
	{
		String sample = "My name is Rajeev";
		HashMap<Character, Integer> cmap = new HashMap<Character, Integer>();
		
		for(char itr:sample.toCharArray())
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
		
		for(Map.Entry<Character, Integer> entry: cmap.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
		}
	}
	
	
	public static void fibonacci()
	{
		 int a=0,b=1,sum=0;
		 System.out.println(a+"\n"+b);
		 
		 while(sum<=100)
		 {
			 sum = a+b;
			 a=b;
			 b=sum;
			 if(sum>100)
				 break;
			 System.out.println(sum);
		 }
		 
	}
	
	public static void findnumberinString()
	{
		String sample = "My name 1s Rajeev2 Kashyap99100";
		
		for(int i=0;i<sample.length();i++)
		{
			char ch = sample.charAt(i);
			if(ch>=48&&ch<=57)
			{
				System.out.println(ch);
			}
		}
	}
	
	public static void removechar()
	{
		String sample = "Rajeev is my name";
		
		String newString = sample.replace("my", "our");
		System.out.println(newString);
	}
	

	
//	*
//	**
//	***
//	****
	public static void pattern1()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	   *
//	  **
//	 ***
//	****
	public static void pattern2()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	

//	1
//	12
//	123
//	1234
	
	public static void pattern3()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
//	A
//	AB
//	ABC
//	ABCD
	
	public static void pattern4()
	{
		int ch = 65;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(ch+j));
			}
			
			System.out.println();
		}
	}
	
	
//	****
//	***
//	**
//	*
	
	public static void pattern5()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	public static void primecheck(int number)
	{
		boolean prime = true;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				prime = false;
			    break;
			}
		}
		
		if(prime)
			System.out.println("Given Number "+number+" is a prime number");
		else
			System.out.println("Given Number "+number+" is NOT a prime number");
	}
	
	
	public static void switchtry(String choice)
	{
		
		switch(choice)
		{
		case "Orange":
			System.out.println("Orange");
			break;
		case "Banana":
			System.out.println("Banana");
			break;
		default:
			System.out.println("Invalid Choice");
				
		}
	}
	
	public static void recursion()
	{
		if(i<=100)
		{
			System.out.println(i);
			i++;
			recursion();
		}
	}
	
	
	public static void reversenumber()
	{
		int number = 4598;
		int reverse = 0;
		System.out.println(number);
		
		while(number!=0)
		{
			int digit = number%10;
			reverse= reverse*10+digit;
			number = number/10;
		}
		
		System.out.println(reverse);
	}
	
	public static void randomchar()
	{
		String sample = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random r = new Random();
		StringBuilder builder = new StringBuilder();
		
		for(int i=0;i<=5;i++)
		{
			int randomnum = r.nextInt(sample.length());
			char ch = sample.charAt(randomnum);
			builder.append(ch);
	
		}
		System.out.println(builder);
	}
	

	public static void main(String[] args) 
	{
		stringOperations.Palindrome1("Tenet");
		System.out.println("******************************");
		stringOperations.Palindrome2("Levely");
		System.out.println("******************************");
		stringOperations.stringcase("Rajeev Kashyap");
		System.out.println("******************************");
		stringOperations.replace1("Rajeev");
		System.out.println("******************************");
		stringOperations.index1("Rajeev Kashyap");
		System.out.println("******************************");
		stringOperations.trimstring("                 Trim this       String             ");
		System.out.println("******************************");
		stringOperations.match("Rajeev Kashyap", "eev K");
		System.out.println("******************************");
		stringOperations.sortarray();
		System.out.println("******************************");
		stringOperations.sortlist();
		System.out.println("******************************");
		stringOperations.findtop2();
		System.out.println("******************************");
		stringOperations.settry();
		System.out.println("******************************");
		stringOperations.wordcount();
		System.out.println("******************************");
		stringOperations.charcount();
		System.out.println("******************************");
		stringOperations.fibonacci();
		System.out.println("******************************");
		stringOperations.findnumberinString();
		System.out.println("******************************");
		stringOperations.removechar();
		System.out.println("******************************");
		stringOperations.pattern1(); 
		System.out.println("******************************");
		stringOperations.pattern2();
		System.out.println("******************************");
		stringOperations.pattern3();
		System.out.println("******************************");
		stringOperations.pattern4();
		System.out.println("******************************");
		stringOperations.primecheck(97);
		System.out.println("******************************");
		stringOperations.switchtry("Lemon");
		System.out.println("******************************");
		stringOperations.recursion();
		System.out.println("******************************");
		stringOperations.pattern5();
		System.out.println("******************************");
		stringOperations.reversenumber();
		
		stringOperations.randomchar();


	}

}
