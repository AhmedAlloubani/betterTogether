package day40_excelpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecuteExcel {
	
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("./src/day40_excelpractice/Table2.xlsx");
		
		FileInputStream input = new FileInputStream(file);
		
		XSSFWorkbook table2 = new XSSFWorkbook(input);
		
		XSSFSheet sheet = table2.getSheet("Sheet1");
		
		input.close();
		table2.close();
	}

}
