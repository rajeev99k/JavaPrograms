package Utilities;

import java.util.ArrayList;

import DataDriven.ExcelOps;

public class TestUtil 
{
	static ExcelOps excelreader;
	
	public static void getTedtData() throws Exception
	{
		ArrayList<Object[]> testdata = new ArrayList<Object[]>();
		
		try
		{
			excelreader = new ExcelOps("D:\\TestData\\TestData.xlsx");
		}
		
		catch(Exception e)
		{
			throw e;
		}
		
		
	}

}
