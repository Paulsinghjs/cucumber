package org.test.adactin;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitTestReport {
public static void main(String[] args) {
	Result r=JUnitCore.runClasses(JunitTest.class,JunitTest.class);
	int failureCount = r.getFailureCount();
	System.out.println("FailureCount:"+failureCount);
	int ignoreCount = r.getIgnoreCount();
	System.out.println("IgnoreCount:"+ignoreCount);
	int runCount = r.getRunCount();
	System.out.println("RunCount:"+runCount);
	long runTime = r.getRunTime();
	System.out.println("RunTime:"+runTime);
	List<Failure> failures = r.getFailures();
	for (Failure failure : failures) {
		String message = failure.getMessage();
		System.out.println(message);
	}
}
}

