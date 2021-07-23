package org.test.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1{
public static void main(String[] args) throws Exception {
	File f=new File("C:\\Users\\dell\\eclipse-workspace\\Maven\\excel\\Book1.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet createSheet = w.createSheet("studentform");
	Row createRow = createSheet.createRow(0);	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Maven\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	WebElement txt = driver.findElement(By.xpath("//label[text()='Name']"));
	String text = txt.getText();
	System.out.println(text);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue(text);
	WebElement txt1 = driver.findElement(By.xpath("//label[text()='Email']"));
	String text1 = txt1.getText();
	System.out.println(text1);
	Cell createCell1 = createRow.createCell(1);
	createCell1.setCellValue(text1);
	WebElement txt2 = driver.findElement(By.xpath("//div[text()='Gender']"));
	String text2 = txt2.getText();
	System.out.println(text2);
	Cell createCell2 = createRow.createCell(2);
	createCell2.setCellValue(text2);
	WebElement txt3 = driver.findElement(By.xpath("//label[text()='Mobile']"));
	String text3 = txt3.getText();
	System.out.println(text3);
	Cell createCell3 = createRow.createCell(3);
	createCell3.setCellValue(text3);
	WebElement txt4 = driver.findElement(By.xpath("//label[text()='Date of Birth']"));
	String text4 = txt4.getText();
	System.out.println(text4);
	Cell createCell4 = createRow.createCell(4);
	createCell4.setCellValue(text4);
	WebElement txt5 = driver.findElement(By.xpath("//label[text()='Subjects']"));
	String text5 = txt5.getText();
	System.out.println(text5);
	Cell createCell5 = createRow.createCell(5);
	createCell5.setCellValue(text5);
	WebElement txt6 = driver.findElement(By.xpath("//label[text()='Hobbies']"));
	String text6 = txt6.getText();
	System.out.println(text6);
	Cell createCell6 = createRow.createCell(6);
	createCell6.setCellValue(text6);
	WebElement txt7 = driver.findElement(By.xpath("//label[text()='Picture']"));
	String text7 = txt7.getText();
	System.out.println(text7);
	Cell createCell7 = createRow.createCell(7);
	createCell7.setCellValue(text7);
	WebElement txt8 = driver.findElement(By.xpath("//label[text()='Current Address']"));
	String text8 = txt8.getText();
	System.out.println(text8);
	Cell createCell8 = createRow.createCell(8);
	createCell8.setCellValue(text8);
	WebElement txt9 = driver.findElement(By.xpath("//label[text()='State and City']"));
	String text9 = txt9.getText();
	System.out.println(text9);
	Cell createCell9 = createRow.createCell(9);
	createCell9.setCellValue(text9);
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
	}
}

