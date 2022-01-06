package day40_excelpractice;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) {
		
		
		try {
		File file = new File("./src/day40_excelpractice/Table1.xlsx");
		
		FileInputStream input = new FileInputStream(file);
		
		XSSFWorkbook table = new XSSFWorkbook(input);
		
		XSSFSheet sheet = table.getSheet("Sheet1");
		
		int numOfRows = sheet.getPhysicalNumberOfRows();
		
		
		System.out.println("The number of rows is: " + numOfRows);
		
		
//		
//		for(int row = 1; row < numOfRows ; row++) {
//			String vigies = sheet.getRow(row).getCell(0).toString();
//			String fruit = sheet.getRow(row).getCell(1).toString();
//			System.out.println("Vegies in the table is: " + vigies + ", " + " the fruits in the table is: " + fruit);
//		}
		
		List<String> values = new ArrayList<String>();
	
		
		 Iterator<Row> rows = sheet.rowIterator();


	        while (rows.hasNext()) 
	        {

	            Row row = rows.next();

	            if (row.getRowNum() > 0) 
	            {

	                values.add(row.getCell(0).getStringCellValue());
	                values.add(row.getCell(1).getStringCellValue());
	                values.add(row.getCell(2).getStringCellValue());
	                values.add(row.getCell(3).getStringCellValue());

	            }
	            
		
	        }
	        System.out.println(values);
	       
	        
//	        Iterator<Row> rows1 = sheet.rowIterator();
//	        
//	        for (int row =1; row < numOfRows ; row++) {
//	        	for (int cell = 0; cell<values.size();cell++) {
//	        		
//	        	}
//	        }
		
		
		
		
		
		
		input.close();
		table.close();
		
	}catch (Exception e) {
		e.printStackTrace();
	}
		
		
		
		
		
		

}
	
	
	
	
	
	
	
	
	
	
}
