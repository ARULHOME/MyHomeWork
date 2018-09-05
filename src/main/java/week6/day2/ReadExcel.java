package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	
	public static Object[][] getExcelData(String filename) throws IOException  {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/createlead.xlsx"); 
		XSSFSheet sheet = wbook.getSheet("createlead");
		 
		 int lastRowNum = sheet.getLastRowNum();
		 int lastCellNum = sheet.getRow(0).getLastCellNum();
		 Object[][] data = new Object[lastRowNum][lastCellNum];
		 for (int j=1; j<=lastRowNum; j++) {
			 XSSFRow row = sheet.getRow(1);
		 for (int i = 0; i < lastCellNum; i++) {
			XSSFCell cell = row.getCell(i);
			String stringCellValue = cell.getStringCellValue();
			data[j-i][i]=stringCellValue;
			System.out.println(stringCellValue);
		}
	}
wbook.close();
return data;
}
}