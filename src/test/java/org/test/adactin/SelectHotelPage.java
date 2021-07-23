package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends LibGlobal {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement select;
	@FindBy(id="continue")
	private WebElement confirm;
	
	public WebElement getSelect() {
		return select;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	
}
