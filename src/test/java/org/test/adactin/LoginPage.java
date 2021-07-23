package org.test.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement pwd;
	@FindBy(id="login")
	private WebElement submit;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
}