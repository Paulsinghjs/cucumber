package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends LibGlobal {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement location;
	@FindBy(xpath=("//select[@name='hotels']"))
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement roomNos;
	@FindBy(id="datepick_in")
	private WebElement date;
	@FindBy(id="datepick_out")
	private WebElement date1;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(xpath=("//input[@type='submit']"))
	private WebElement submit;
	//Getters
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getDate1() {
		return date1;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
}

