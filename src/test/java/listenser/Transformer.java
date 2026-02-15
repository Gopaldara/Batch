package listenser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.IAnnotationTransformer;

public class Transformer implements IAnnotationTransformer {
	
	public void Transformer(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
