package com.elf.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/**
	 * Generic class to read the data from property file or excel
	 * @author gunapal
	 */

	/**
	 * 	Used to read the data from property file
	 * @param key
	 * @return the String value of the key
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	 String value = p.getProperty(key);
	 return value;
	}
	/**
	 * Used to read the data from excel
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return String value of the excel
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return data;
	}
	public void setExcelData(String sheetname,int row,int cell,String setvalue) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(setvalue);
		FileOutputStream fos=new FileOutputStream("./data/TestScriptData.xlsx");
		wb.write(fos);
		wb.close();
	}
	
}
