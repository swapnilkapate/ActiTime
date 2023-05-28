package package_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	
	@BeforeTest
	public void sys() {
		System.out.println("Before Test");
		Reporter.log("webdriver set successfully");
	}
	
	@BeforeMethod
	public void syy() {
		System.out.println("Before Method");
	}
	
	@Test
	public void sss() {
		System.out.println("In the Test");
		Reporter.log(",gug");
	}
	
	@Test
	public void sk() {
		System.out.println("Test case to fail");
		Assert.assertTrue(false); // forcefully failed test case
		System.out.println("After forcefully failed");
	}
	
	@AfterMethod
	public void ff(){
		System.out.println("After Method");
	}
	
	@AfterTest
	public void fgr() {
		System.out.println("After Test");
	}
	
}
