package org.test.maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleReport1 extends Report1 {
@BeforeClass
public void beforeClass1() {
	browserConfig();
    openUrl("https://en-gb.facebook.com/");		
	maximizeBrowser();
	System.out.println("Beforeclass");

}
@AfterClass
public void afterClass1() {
	closeBrowser();
	System.out.println("AfterClass");

}
@Parameters({"userId","pwd"})
@Test
public void tc2(String userId,String pwd) throws Exception {
	Facebook f=new Facebook();		 			
	   type(f.getEmail(),userId);	
	  // getAttribute(f.getEmail());	
	   writeAttributeToExcel(f.getEmail(), "C:\\Users\\dell\\eclipse-workspace\\TestingMaven\\excel\\PSV Dura-Cretes.xlsx", "EmpDetails",8,9);		  
	   type(f.getPwd(),pwd);
	   click(f.getEnterButton());

}
}