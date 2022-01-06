package day38_excel_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	
	public static void main(String[] args) throws IOException {
		
		//Specifying where is the excel is located at
		File file = new File("./src/day38_excel_automation/Book1.xlsx");
		
		//we are opening the input stream
		FileInputStream input = new FileInputStream(file);
		
		//connecting to the excel workbook
		XSSFWorkbook book = new XSSFWorkbook(input);
		
		//connecting to a particular sheet within the workbook
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		//getting the number of utilized rows
		int numOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of utilized rows: " +  numOfRows);
		
		System.out.println("Ryan's Dept:" + sheet.getRow(1).getCell(2)); //IT
		
		//Please print Employess2
		System.out.println(sheet.getRow(2).getCell(0));
		
		String name = sheet.getRow(2).getCell(1).toString();
		System.out.println("Employee 2 name is: " + name);
		
		//Please print :
		//Ryan -> IT
		//Pete -> IT
		//Britney -> C-suite
		for(int row = 1; row < numOfRows; row++) {
			String firstName = sheet.getRow(row).getCell(1).toString();
			String department = sheet.getRow(row).getCell(2).toString();
			System.out.println(firstName + " --> " + department);
		}
		
		
		
		input.close();
		book.close();
	}

}
