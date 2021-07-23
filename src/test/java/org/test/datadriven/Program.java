package org.test.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program {
public static void main(String[] args) throws Exception {
File f=new File("C:\\Users\\dell\\eclipse-workspace\\Maven\\excel\\studentdetails.xlsx");
	FileInputStream fin=new FileInputStream(f);
Workbook w=new XSSFWorkbook(fin);
Sheet sheet = w.getSheet("Course Details");
//Total no of rows
int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
System.out.println("Rows:"+physicalNumberOfRows);
Row row = sheet.getRow(0);
//Total no of cells
int physicalNumberOfCells = row.getPhysicalNumberOfCells();
System.out.println("Cells:"+physicalNumberOfCells);
//To print all the values in excel
for (int i = 0; i <physicalNumberOfRows; i++) {
	Row rows = sheet.getRow(i);
	for (int j = 0; j < physicalNumberOfCells; j++) {
		Cell cell = rows.getCell(j);
		System.out.println(cell);	
	}System.out.println("_____________");	
}
//To create one row in the sheet
    Row createRow = sheet.createRow(11);
    Cell createCell = createRow.createCell(0);
    createCell.setCellValue("Dinesh");
	Cell createCell1 = createRow.createCell(1);
	createCell1.setCellValue("BBA");
FileOutputStream fout=new FileOutputStream(f);
w.write(fout);
}
}

