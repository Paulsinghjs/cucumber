package org.test.adactin;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest1 extends LibGlobal {
	@BeforeClass
	public static void beforeClass() {
			browserConfig();
			openUrl("http://www.adactin.com/HotelApp/");
			maximizeBrowser();
	}
		@AfterClass
	public static void afterClass() {
		    closeBrowser();
	}
		@Before
	public void beforeMethod() {
		   Date d=new Date();
		   System.out.println("Before");
		   System.out.println(d);
	}
		@After
	public void afterMethod() {
		   Date d=new Date();
		   System.out.println("After");
		   System.out.println(d);
		   navigateBack();
		   refresh();
	}	
		@Ignore
		@Test
	public void tc1() {
			LoginPage l=new LoginPage();
			type(l.getUsername(),"pauljs777");	
			type(l.getPwd(),"91JVG0" );	
			click(l.getSubmit());
	}	
		@Test
	public void tc2() {
			LoginPage l=new LoginPage();
			type(l.getUsername(),"Pauljs777");
			String attribute = getAttribute(l.getUsername());
			type(l.getPwd(),"91JVG0" );	
			click(l.getSubmit());
			Assert.assertEquals(attribute,"pauljs777");
	}		
		@Test
	public void tc3() {
			LoginPage l=new LoginPage();
			type(l.getUsername(),"pauljs777");
			type(l.getPwd(),"81JVG0" );	
			String attribute = getAttribute(l.getPwd());
			click(l.getSubmit());
			Assert.assertEquals("91JVG0",attribute);
	}
}

