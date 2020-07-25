package com.actitime.generics;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/** 
 * @author GUNAPAL P
 * @param key
 * @return
 * @throws IOException 
 */
public class FileLib {

	public String getPropertyValue(String Key) throws IOException{
		FileInputStream fis = new FileInputStream("./data/Commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String value = p.getProperty(Key);
		return value;
		
	}
	/**
	 * @param Sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws IOException 
	 */
	public String getExcelData(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{	

		FileInputStream fis=new FileInputStream("./data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheetname).getRow(row).getCell(cell).toString();
		return data;
	}
}
