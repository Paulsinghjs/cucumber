package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends LibGlobal{
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="first_name")
	private WebElement firstName;
	@FindBy(name="last_name")
	private WebElement lastName;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="cc_num")
	private WebElement ccNum;
	@FindBy(name="cc_type")
	private WebElement ccType;
	@FindBy(name="cc_exp_month")
	private WebElement ccMonth;
	@FindBy(name="cc_exp_year")
	private WebElement ccYear;
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcMonth() {
		return ccMonth;
	}
	public WebElement getCcYear() {
		return ccYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	
}

