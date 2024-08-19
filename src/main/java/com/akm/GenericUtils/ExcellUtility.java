package com.akm.GenericUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellUtility {
	/**
	 * Read the excell data with row and column 
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream(IPathConstant.EXCELFILEPATH);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheetname);
		Row r = sh.getRow(rownum);
		Cell c = r.getCell(cellnum);
		String s = c.getStringCellValue();
		return s;
	}
	/**
	 * get excell data as per sheet name testcase ID and Header
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public String getExcelDataHeader(String sheetname,String tcId,String header) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream(IPathConstant.EXCELFILEPATH);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheetname);
		int lastRowNum = sh.getLastRowNum();
		int expectedRow=0;
		for(int i=0;i<lastRowNum;i++)
		{
			String testCaseID = sh.getRow(i).getCell(0).getStringCellValue();
			if(testCaseID.equals(tcId))
			{
				expectedRow=i;
				break;
			}
		}
		System.out.println(expectedRow);
		expectedRow--;
		
		int expectedCellnum=0;
		int lastCellNum = sh.getRow(expectedRow).getLastCellNum();
		for(int j=0;j<lastCellNum;j++)
		{
			String value = sh.getRow(expectedRow).getCell(j).getStringCellValue();
			if(value.equals(header))
			{
				expectedCellnum=j;
				break;
			}
		}
		String data=sh.getRow(expectedRow+1).getCell(expectedCellnum).getStringCellValue();
		
		return data;
		
	}

}
