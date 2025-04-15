package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	@BeforeTest(alwaysRun=true)
	public void BeforeTest1() {
		System.out.println("Before  Test");
	}
	@AfterTest(alwaysRun=true)
	public void AfterTest1() {
		System.out.println("After  Test");
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public void method1() {
		System.out.println("Inside Before  Method");
	}
	@AfterMethod(alwaysRun=true)
	public void method2() {
		System.out.println("Inside After  Method");
	}
	
	
	

}
