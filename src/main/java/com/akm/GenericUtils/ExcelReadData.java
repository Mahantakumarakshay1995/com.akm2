package com.akm.GenericUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadData 
{
	@Test
public void readexcellData() throws IOException 
{	
	//FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Data\\Testex.xlsx");
	FileInputStream fis=new FileInputStream(IPathConstant.EXCELFILEPATH);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet swb = wb.getSheetAt(0);
	 XSSFRow r=swb.getRow(2);
	 XSSFCell c = r.getCell(4);
	 String s = c.getStringCellValue();
	 System.out.println(s);
}
}
