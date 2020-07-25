package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMultipleData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/TestScript.xlsx");
	Workbook wb =  WorkbookFactory.create(fis);
	int Rownum = wb.getSheet("InvalidLogin").getLastRowNum();
	for(int i=1;i<=Rownum;i++){
		String un = wb.getSheet("InvaliadLogin").getRow(i).getCell(0).toString();
		String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(1).toString();
	}
	
}
}
