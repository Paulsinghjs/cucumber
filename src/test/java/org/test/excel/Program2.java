package org.test.excel;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program2 {
public static void main(String[] args) throws Exception {
File f=new File("C:\\Users\\dell\\eclipse-workspace\\Maven\\excel\\PSV Dura-Cretes.xlsx");
FileInputStream fin=new FileInputStream(f);
Workbook w=new XSSFWorkbook(fin);
Sheet sheet = w.getSheet("EmpDetails");			    
int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//System.out.println(physicalNumberOfRows);		
for (int i = 0; i < physicalNumberOfRows; i++) {
Row row = sheet.getRow(i);				 
int physicalNumberOfCells = row.getPhysicalNumberOfCells();			   
for (int j = 0; j <physicalNumberOfCells ; j++) {
	Cell cell = row.getCell(j);	
	int cellType = cell.getCellType();
	if (cellType==1) {
	String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);
	}
	else if (cellType==0) {
		if (DateUtil.isCellDateFormatted(cell)) {
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat simdate=new SimpleDateFormat("dd/MM/yy");
		String format = simdate.format(dateCellValue);
		System.out.println(format);
	      } 
		else {						
        long numericCellValue = (long) cell.getNumericCellValue();
		System.out.println(numericCellValue);
		  }
	}}System.out.println("____________________________________");
}}}

