package org.test.excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program {
public static void main(String[] args) throws Exception {
	//To get a specific data from a cell present in a workbook
	File f=new File("C:\\Users\\dell\\eclipse-workspace\\TestingMaven\\excel\\PSV Dura-Cretes.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet sheet = w.getSheet("Customer Details");	
		Row row = sheet.getRow(2);	
		Cell cell = row.getCell(4);
		System.out.println(cell);		
	}		
}

