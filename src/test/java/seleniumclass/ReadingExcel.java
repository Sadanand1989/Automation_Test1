package seleniumclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Specifiying the location
		File src = new File("C:\\Users\\singh\\eclipse-workspace\\seleniumclasses\\Excel1\\Test Sheet.xlsx");
// load file
		FileInputStream workbook = new FileInputStream(src);
		
	
		//load workbook
		XSSFWorkbook wb = new XSSFWorkbook(workbook);
		 //load sheet
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		
		
		
	}

}
