package org.test.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program3 {
public static void main(String[] args) throws Exception {
	File f=new File("C:\\Users\\dell\\eclipse-workspace\\Maven\\excel\\PSV Dura-Cretes.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	//To create a new sheet and enter value in a cell
	Sheet createSheet = w.createSheet("salary");
	Row row = createSheet.createRow(1);
	//Cell createCell = row.createCell(1);
	//createCell.setCellValue("200000");
	Cell createCell1 = row.createCell(2);
	createCell1.setCellValue("24/06/1994");
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
}
}
