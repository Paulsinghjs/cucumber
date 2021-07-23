package org.test.maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Report extends LibGlobal {
@BeforeClass
public void beforeClass() {
	browserConfig();
    openUrl("https://en-gb.facebook.com/");		
	maximizeBrowser();

}
@AfterClass
public void afterClass() {
	closeBrowser();

}

@Test
@Parameters({"userId","pwd"})
public void tc1(String userId,String pwd) throws Exception {
	Facebook f=new Facebook();		 			
	   type(f.getEmail(),userId);	
	  // getAttribute(f.getEmail());	
	   writeAttributeToExcel(f.getEmail(), "C:\\Users\\dell\\eclipse-workspace\\TestingMaven\\excel\\PSV Dura-Cretes.xlsx", "EmpDetails",7,9);		  
	   type(f.getPwd(),pwd);
	   click(f.getEnterButton());

}
}
