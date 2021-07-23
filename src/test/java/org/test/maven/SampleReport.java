package org.test.maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class SampleReport extends LibGlobal {
@BeforeClass
public void beforeClass() {	
	browserConfig();
    openUrl("https://en-gb.facebook.com/");		
	maximizeBrowser();
	System.out.println("Beforeclass");
}
@AfterClass
public void afterClass() {
	closeBrowser();
	System.out.println("AfterClass");
}
@AfterMethod
public void afterMethod() throws Exception {
	Thread.sleep(5000);
	driver.navigate().refresh();
}
 
	@Test(dataProvider="details")
	public void tc1(String userId,String pwd) throws Exception {

		FacebookLogin f=new FacebookLogin();
		SoftAssert s=new SoftAssert();
		   type(f.getEmail(),userId);	
		   getAttribute(f.getEmail());
		   s.assertEquals(userId, "akil94@gmail.com","Incorrect userid -");
		   //Assert.assertEquals(userId, "paulsinghjs");
		  // writeAttributeToExcel(f.getEmail(), "C:\\Users\\dell\\eclipse-workspace\\TestingMaven\\excel\\PSV Dura-Cretes.xlsx", "EmpDetails",7,9);		  
		   type(f.getPwd(),pwd);
		   s.assertEquals(pwd,"8529846547","Incorrect pwd -");
		   click(f.getEnterButton());
           System.out.println("tc1");
           s.assertAll();
}
	@DataProvider(name="details")
	public Object [][] data() throws Exception {
		return new Object[][] {	
			
			{readFromExcel(1,4),readFromExcel(1,5)},
			{readFromExcel(2,4),readFromExcel(2,5)},
			{readFromExcel(3,4),readFromExcel(3,5)},
			{readFromExcel(4,4),readFromExcel(4,5)}		
		};		
	}
}
