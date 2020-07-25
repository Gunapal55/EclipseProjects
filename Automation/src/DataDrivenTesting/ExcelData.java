package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//get java representative object of the physical file
		FileInputStream fis=new FileInputStream("C:\\Users\\Shwetha\\Desktop\\TestScriptData.xlsx");
		//open excel in read mode 
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet
         Sheet sheet = wb.getSheet("CreateCustomer");
         //get the control of the row 
         Row row = sheet.getRow(1);
//get the control of the sheet
         Cell cell = row.getCell(3);
         //get or read the string data
         String data = cell.getStringCellValue(); 
          System.out.println(data);
	}

}
