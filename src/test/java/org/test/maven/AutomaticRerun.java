package org.test.maven;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class AutomaticRerun implements IAnnotationTransformer{

public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		if (arg0.getRetryAnalyzer()==null) {
			arg0.setRetryAnalyzer(ManualRerun.class);
		}	
	}
}
