package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataMultipleloops {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//get last used row count
		int RowNum = wb.getSheet("InvalidLogin").getLastRowNum();
		short cellNum = wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
        for(int i=1;i<=RowNum;i++) {
        	for(int j=0;j<cellNum;j++) {
String un = wb.getSheet("InvalidLogin").getRow(i).getCell(j).toString();
        	System.out.println(un );
        	}
        }
	}

}
