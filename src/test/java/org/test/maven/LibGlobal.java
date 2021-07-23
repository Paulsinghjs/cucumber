package org.test.maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions acc;

	public static void browserConfig() {	
		WebDriverManager.chromedriver().setup();	
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\TestingMaven\\Drivers\\chromedriver.exe");
	//driver = new ChromeDriver();
	}
	
	public static void openUrl(String url) {
		driver=new ChromeDriver();
		driver.get(url);
	}
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	public static void javaScriptRef() {
		js = (JavascriptExecutor) driver;
	}
	public static void javaScriptType(WebElement element) {
		js.executeScript("arguments[0].setAttribute('value','paul')",element);
	}
	public static void javaScriptGetAttribute(WebElement element) {
		Object attribute = js.executeScript("return arguments[0].getAttribute('value')",element);
        System.out.println(attribute);	
	}
	public static void scrollDown(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	public static void scrollUp(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(false)",element);
	}
	public static void takeScreenshot(String location) throws Exception, IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest=new File(location);
        FileUtils.copyFile(src, dest);
	}
	public static void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
        System.out.println(attribute);
		return attribute;
	}
	public static String getText(WebElement element) {
		String text = element.getText();
        System.out.println(text);
		return text;
	}
	public static void actionRef() {
		acc = new Actions(driver);
	}
	public static void moveToElement(WebElement element) {
		acc = new Actions(driver);
		acc.moveToElement(element).perform();
	}
	public static void doubleClick(WebElement element) {
		acc = new Actions(driver);
		acc.doubleClick(element).perform();
	}
	public static void contextClick(WebElement element) {
		acc = new Actions(driver);
		acc.contextClick(element).perform();
    }
	public static void dragAndDrop(WebElement source,WebElement target) {
		acc = new Actions(driver);
		acc.dragAndDrop(source, target).perform();
	}
	public static void selectByIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public static void selectByValue(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public static void selectByText(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public static void getFirstSelectedOption(WebElement element) {
		Select s=new Select(element);
		s.getFirstSelectedOption();
	}
	public static void getAllSelectedOption(WebElement element) {
		Select s=new Select(element);
		s.getAllSelectedOptions();
	}
	public static void deselectByIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.deselectByIndex(index);
	}
	public static void deselectByValue(WebElement element,String value) {
		Select s=new Select(element);
		s.deselectByValue(value);
	}
	public static void deselectByText(WebElement element,String text) {
		Select s=new Select(element);
		s.deselectByVisibleText(text);
	}
	public static void deselectAll(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
	}
	public static void getOptions(WebElement element) {
		Select s=new Select(element);
        s.getOptions();
	}
	public static void robotClass(int key) throws AWTException {
		Robot r=new Robot();
        r.keyPress(key);
        r.keyRelease(key);
	}
	public static void alertAccept() {
		Alert al=driver.switchTo().alert();
        al.accept();
	}
	public static void alertDismiss() {
		Alert al=driver.switchTo().alert();
        al.dismiss();
	}
	public static void windowsHandling(int i) {		
      Set<String> windowHandles = driver.getWindowHandles();
      List<String> allWindowsId=new LinkedList<String>();
      allWindowsId.addAll(windowHandles);
      driver.switchTo().window(allWindowsId.get(i));
	}
	public static void goToParentWindow() {
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
	}
	public static void switchToFrames(String idOrName) {
		driver.switchTo().frame(idOrName);
	}
	public static String readFromExcel(int row,int cell) throws Exception {
		File f=new File("C:\\\\Users\\\\dell\\\\eclipse-workspace\\\\TestingMaven\\\\excel\\\\PSV Dura-Cretes.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet("EmpDetails");
		Row row1 = sheet.getRow(row);
		Cell cell1 = row1.getCell(cell);
		String value = "";
		int cellType = cell1.getCellType();
		if (cellType==1) {
		value = cell1.getStringCellValue();
		//System.out.println(value);
		}
		else if (cellType==0) {
			if (DateUtil.isCellDateFormatted(cell1)) {
				Date dateCellValue = cell1.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("MM/dd/yyy");
			value = sim.format(dateCellValue);
			//System.out.println(value);
			} 
			else {
        long numericValue=(long) cell1.getNumericCellValue();
        value=String.valueOf(numericValue);
		//System.out.println(value);
			}
		}		
		return value;
	}
	public static void writeAttributeToExcel(WebElement element,String location,String sheetName,int row,int cell) throws Exception {
		File f=new File(location);
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet(sheetName);
		Row row1 = sheet.createRow(row);
		Cell cell1 = row1.createCell(cell);
		cell1.setCellValue(getAttribute(element));
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
	}
	public static void writeTextToExcel(WebElement element,String location,String sheetName,int row,int cell) throws Exception {
		File f=new File(location);
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet(sheetName);
		Row row1 = sheet.createRow(row);
		Cell cell1 = row1.createCell(cell);
		cell1.setCellValue(getText(element));
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
	}
}
