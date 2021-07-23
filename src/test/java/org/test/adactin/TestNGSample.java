package org.test.adactin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample {
@BeforeClass
public void beforeClass() {
	System.out.println("Launch Browser");

}
@AfterClass
public void afterClass() {
	System.out.println("Close Browser");

}
@BeforeMethod
public void beforeMethod() {
	System.out.println("BeforeMethod");
}
@AfterMethod
public void afterMethod() {
	System.out.println("AfterMethod");
}

@Test(enabled=false)
public void tc1() {
	System.out.println("TestCase1");
}

@Test(priority=1)
public void tc2() {
	System.out.println("TestCase2");
}

//-ve values in priority will be taken first
@Test(priority=-1)
public void tc3() {
	System.out.println("TestCase3");
}

//If priority is not given it will take default value as 0
//InvocationCount is used to run the testcase more than one time
@Test(invocationCount=3)
public void tc4() {
	System.out.println("TestCase4");
}
}

