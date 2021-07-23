package org.test.maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleReport2 extends Report2 {
@BeforeClass
public void beforeClass2() {
	browserConfig();
    openUrl("https://en-gb.facebook.com/");		
	maximizeBrowser();
	System.out.println("Beforeclass");

}
@AfterClass
public void afterClass2() {
	closeBrowser();
	System.out.println("AfterClass");

}
@Parameters({"userId","pwd"})
@Test
public void tc3(String userId,String pwd) throws Exception {
	Facebook f=new Facebook();		 			
	   type(f.getEmail(),userId);	
	  // getAttribute(f.getEmail());	
	   writeAttributeToExcel(f.getEmail(), "C:\\Users\\dell\\eclipse-workspace\\TestingMaven\\excel\\PSV Dura-Cretes.xlsx", "EmpDetails",9,9);		  
	   type(f.getPwd(),pwd);
	   click(f.getEnterButton());

}
}
