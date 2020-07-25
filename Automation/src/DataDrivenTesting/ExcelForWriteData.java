package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelForWriteData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Automation\\data\\Testscripdatat.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
     	wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("failed");
		//get the java file object in the write mode
		FileOutputStream fos=new FileOutputStream("C:\\Automation\\data\\Testscripdatat.xlsx");
		//save the workbook in write mode
		wb.write(fos);
		wb.close();
	}
	
}
