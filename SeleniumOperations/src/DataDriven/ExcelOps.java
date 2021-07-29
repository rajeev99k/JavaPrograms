package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOps 
{
	private XSSFWorkbook workbook;
	
	public ExcelOps(String Filepath) throws InvalidFormatException, IOException
	{
		File file = new File(Filepath);
		FileInputStream inputstream = new FileInputStream(file);
		workbook = new XSSFWorkbook(inputstream);
		
	}

	public String GetCellValueString(int sheetindex,int rownum,int cellnum)
	{
		XSSFSheet sheet = workbook.getSheetAt(sheetindex);
		String celldata = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		return celldata;
	}
	
	
	public double GetCellValueInt(int sheetindex,int rownum,int cellnum)
	{
		XSSFSheet sheet = workbook.getSheetAt(sheetindex);
		double celldata = sheet.getRow(rownum).getCell(cellnum).getNumericCellValue();
		
		return celldata;
	}
	
	public Date GetCellValueDate(int sheetindex,int rownum,int cellnum)
	{
		XSSFSheet sheet = workbook.getSheetAt(sheetindex);
		Date date =  sheet.getRow(rownum).getCell(cellnum).getDateCellValue();
		return date;
	}
	
	
	public int GetlastRow(int sheetindex)
	{
		XSSFSheet sheet = workbook.getSheetAt(sheetindex);
		return sheet.getLastRowNum();
	}
	
	
	public void GetExcelData(int sheetindex)
	{
		
		XSSFSheet sheet = workbook.getSheetAt(sheetindex);
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		ExcelOps excelobj = new ExcelOps("D:\\TestData\\TestData.xlsx");
		/*System.out.println(excelobj.GetCellValueString(0, 1, 0));
		System.out.println(excelobj.GetlastRow(0));*/
		
		//excelobj.GetExcelData(0);
		
		/*String correctnumber = "8.798765433e9".replaceAll(".", "") ;
		  System.out.println(correctnumber);*/
		
		

	}

}
