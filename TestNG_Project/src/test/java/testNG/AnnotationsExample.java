package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExample extends BaseClass {
	@Test(groups = { "sanity" })
	public void test1() {

		System.out.println("Inside test case1");
	}

	@Test
	// @Test(enabled=false)=usd to skip the particular TC
	public void test2() {
		System.out.println("Inside test case2");
	}

}
