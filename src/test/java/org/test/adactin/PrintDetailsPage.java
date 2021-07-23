package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintDetailsPage extends LibGlobal {
	public PrintDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("(//input[@type='text'])[16]"))
	private WebElement orderNo;
	
	public WebElement getOrderNo() {
		return orderNo;
	}
	
}
