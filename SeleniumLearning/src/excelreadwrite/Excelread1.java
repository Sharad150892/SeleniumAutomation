package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread1 {
	
	public static void main(String[] args) throws IOException {
		
		//get path excel
		File path = new File("C:\\Selenium\\Velocity.xlsx");
		
		//load path
		FileInputStream load = new FileInputStream(path);
		
		//Workbook excel
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//sheet of excel
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		String data2 = sheet1.getRow(0).getCell(2).getStringCellValue();
		String data3 = sheet1.getRow(0).getCell(3).getStringCellValue();
		String data4 = sheet1.getRow(0).getCell(4).getStringCellValue();
		String data5 = sheet1.getRow(0).getCell(5).getStringCellValue();
		String data6 = sheet1.getRow(0).getCell(6).getStringCellValue();
		System.out.println(data1+", "+data2+", "+data3+", "+data4+", "+data5+", "+data6);
	}

}
