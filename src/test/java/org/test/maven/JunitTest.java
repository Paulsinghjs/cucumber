package org.test.maven;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class JunitTest extends LibGlobal{
	@BeforeClass
public static void beforeClass() {
	    System.out.println("BeforeClass");
	browserConfig();
	openUrl("https://en-gb.facebook.com/");		
	maximizeBrowser();
}
	@AfterClass
public static void afterClass() {
		System.out.println("AfterClass");
	closeBrowser();	
}
	@Before
public void beforeMethod() {
		System.out.println("BeforeMethod");
    Date d=new Date();
    System.out.println(d);
}
	@After
public void afterMethod() {
		System.out.println("AfterMethod");
	Date d=new Date();
	System.out.println(d);
}
	@Test
public void tc1() throws Exception  {
		System.out.println("TestCase1");	
		Facebook f=new Facebook();
		Thread.sleep(3000);
		type(f.getEmail(),readFromExcel(1,2));	
		Thread.sleep(3000);
		type(f.getPwd(),readFromExcel(1,3));
		Thread.sleep(3000);
		click(f.getEnterButton());
}
	@Test
public void tc2() throws Exception {
		System.out.println("TestCase2");		
		Facebook f=new Facebook();
		Thread.sleep(3000);
		type(f.getEmail(),readFromExcel(2,2));	
		Thread.sleep(3000);
		type(f.getPwd(),readFromExcel(2,3));
		Thread.sleep(3000);
		click(f.getEnterButton());
}
	@Test
public void tc3() throws Exception {
		System.out.println("TestCase3");
		Facebook f=new Facebook();
		Thread.sleep(3000);
		type(f.getEmail(),readFromExcel(3,2));	
		Thread.sleep(3000);
		type(f.getPwd(),readFromExcel(3,3));
		Thread.sleep(3000);
		click(f.getEnterButton());
}
}