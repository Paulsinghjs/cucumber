package org.test.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends LibGlobal{
	public FacebookLogin() {
		PageFactory.initElements(driver,this);
	}
	@CacheLookup
    @FindBys({
    	@FindBy(id="email")
    	})
	public WebElement email;
	
    @CacheLookup
    @FindBys({
    	@FindBy(name="pass")
        })
	public WebElement pwd;
    
    @CacheLookup
    @FindBys({
    	@FindBy(name="login")
    	})
	public WebElement enterButton;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getEnterButton() {
		return enterButton;
	}
}

