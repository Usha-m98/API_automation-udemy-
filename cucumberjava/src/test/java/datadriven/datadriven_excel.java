package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriven_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./Excel/Testdata.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Data");
	    // String data = sh.getRow(1).getCell(2).getStringCellValue();
	    		 
	    //System.out.println(data);
	    
	    Cell create = sh.getRow(3).createCell(1);
	    create.setCellValue("divya123");
	    FileOutputStream fos=new FileOutputStream("./Excel/Testdata.xlsx");
	     wb.write(fos);
	     wb.close();
	}

}
