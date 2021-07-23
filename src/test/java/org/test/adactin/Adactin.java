package org.test.adactin;

import java.util.concurrent.TimeUnit;


public class Adactin extends LibGlobal{
	
  public static void login() throws Exception {
	browserConfig();
	openUrl("http://www.adactin.com/HotelApp/");
	maximizeBrowser();
	LoginPage l=new LoginPage();
	type(l.getUsername(),"pauljs777");	
	type(l.getPwd(),"91JVG0" );	
	click(l.getSubmit());
  }
  public static void searchHotel() {
	  SearchHotelPage a=new SearchHotelPage();	  
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	  
	  selectByIndex(a.getLocation(),1);
	  getOptions(a.getLocation());	
	  selectByValue(a.getHotels(),"Hotel Sunshine");
	  getOptions(a.getHotels());	  
	  selectByIndex(a.getRoomType(), 2);
	  getOptions(a.getRoomType());	 
	  selectByValue(a.getRoomNos(), "2");
	  getOptions(a.getRoomNos());	  
	  type(a.getDate(), "30/06/2021");	  	  
	  //type(date1, "02/07/2021");
	  javaScriptType2(a.getDate1());	 
	  selectByIndex(a.getAdultRoom(), 2);
	  getOptions(a.getAdultRoom());	  
	  selectByIndex(a.getChildRoom(), 2);
	  getOptions(a.getChildRoom());	 
	  click(a.getSubmit());
}
  public static void selectHotel() {
	  SelectHotelPage s=new SelectHotelPage();  
	  click(s.getSelect());
	  click(s.getConfirm());

}
  public static void bookHotel() {
	  BookHotelPage b=new BookHotelPage();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  type(b.getFirstName(), "paul");
	  type(b.getLastName(), "singh");
	  type(b.getAddress(), "sydney hustonroad");
	  type(b.getCcNum(), "1459876325487924"); 
	  selectByIndex(b.getCcType(), 1);
	  selectByIndex(b.getCcMonth(), 3);  
	  selectByValue(b.getCcYear(), "2022");
	  type(b.getCvv(), "8542");
	  click(b.getBookNow());

}
  public static void printDetails() throws Exception {
	  PrintDetailsPage p=new PrintDetailsPage();
	  //getAttribute(p.getOrderNo());
	writeAttributeToExcel(p.getOrderNo(), "C:\\Users\\dell\\eclipse-workspace\\TestingMaven\\excel\\Adactin.xlsx", "OrderNo", 0, 0);
}
}


