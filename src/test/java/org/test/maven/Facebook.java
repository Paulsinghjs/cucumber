package org.test.maven;

public class Facebook extends FacebookLogin {
	public static void main(String[] args) throws Exception  {
		browserConfig();
        openUrl("https://en-gb.facebook.com/");		
		maximizeBrowser();
		//object creation
		Facebook f=new Facebook();		 			
	   type(f.getEmail(),readFromExcel(1,2));	
	   getAttribute(f.getEmail());	
	   writeAttributeToExcel(f.getEmail(), "C:\\Users\\dell\\eclipse-workspace\\TestingMaven\\excel\\PSV Dura-Cretes.xlsx", "EmpDetails",9,9);		  
	   type(f.getPwd(),"pauljs007");
	   click(f.getEnterButton());
	    getCurrentUrl();
	    getTitle();
        closeBrowser();	
	}
}
