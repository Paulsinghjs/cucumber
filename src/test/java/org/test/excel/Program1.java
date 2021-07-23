package org.test.excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program1 {
public static void main(String[] args) throws Exception {
	File f=new File("C:\\Users\\dell\\eclipse-workspace\\Maven\\excel\\PSV Dura-Cretes.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet sheet = w.getSheet("EmpDetails");	
	//To get the physical no of rows
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	System.out.println(physicalNumberOfRows);
	//To print all the values from all the rows
	for (int i = 0; i < physicalNumberOfRows; i++) {
		   Row row = sheet.getRow(i);	
    //To get the physical no of cells
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
    //System.out.println(physicalNumberOfCells); 
	  for (int j = 0; j <physicalNumberOfCells ; j++) {
			Cell cell = row.getCell(j);						
			System.out.println(cell);	
			
		}
	} 
	
}
}
