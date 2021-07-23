package org.test.adactin;

import java.util.concurrent.TimeUnit;

public class AdactinBooking extends Adactin{
public static void main(String[] args) throws Exception {
	  login();
	  //hotelDetails();
	  searchHotel();
	  selectHotel();
	  //customerDetails();
	  bookHotel();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  printDetails();
}
}
