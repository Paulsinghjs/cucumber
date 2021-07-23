package org.test.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program4 {
public static void main(String[] args) throws Exception {
	File f=new File("C:\\Users\\dell\\eclipse-workspace\\Maven\\excel\\PSV Dura-Cretes.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet sheet = w.getSheet("EmpDetails");
	Row row = sheet.getRow(3);
	Cell cell = row.getCell(3);
	String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);
	if (stringCellValue.equals("Delhi")) {
		cell.setCellValue("chennai");
	}
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
}
}
