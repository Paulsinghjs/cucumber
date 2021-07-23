package org.test.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun {
	@Test
private void tc1() {
	System.out.println("1");

}
	@Test(retryAnalyzer=ManualRerun.class)
private void tc2() {	
		Assert.assertTrue(false);
	System.out.println("2");

}
	@Test
private void tc3() {
		System.out.println("3");
		

}
}
