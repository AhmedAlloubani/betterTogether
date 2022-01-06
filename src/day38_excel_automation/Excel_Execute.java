package day38_excel_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Execute {
	public static void main(String[] args) throws IOException {
		
		// Specifying where is the excel is located at
		File file = new File("./src/day38_excel_automation/Book2.xlsx");

		// we are opening the input stream
		FileInputStream input = new FileInputStream(file);

		// connecting to the excel workbook
		XSSFWorkbook book = new XSSFWorkbook(input);

		// connecting to a particular sheet within the workbook
		XSSFSheet sheet = book.getSheet("Sheet1");

		// getting the number of utilized rows
		int numOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of utilized rows: " + numOfRows);
		
		for (int row = 1; row < numOfRows; row++) {
			String action = sheet.getRow(row).getCell(0).toString();
			
			if(action.equals("Y")) {
				System.out.println(sheet.getRow(row).getCell(1));
			}
		}
	}

}
