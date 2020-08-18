package com.Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Cell data = wb.getSheet("Actitime").getRow(1).getCell(1);
	String text = data.getStringCellValue();
	System.out.println(text);
	
}
}
