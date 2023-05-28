package package_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMasterClass {
	
	 @BeforeClass
	 public void beforeClass() {
	   System.out.println("This will execute before the Class");
	 }
	 
	 @AfterClass
	 public void afterClass() {
	   System.out.println("This will execute after the Class");
	 }
	 
	 @BeforeTest
	 public void beforeTest() {
	   System.out.println("This will execute before the Test");
	 }
	 
	 @AfterTest
	 public void afterTest() {
	   System.out.println("This will execute after the Test");
	 }
	 
	 @BeforeGroups
	 public void beforeGroups() {
		 System.out.println("Before Groups*********");
	 }
	 
	 @AfterGroups
	 public void afterGroups() {
		 System.out.println("After Groups**********");
	 }
	 
	 @Test(groups= {"Smoke","Sanity","Regression"}, priority=1, invocationCount=2)
	 public void testCase1() {
	   System.out.println("This is the A Normal Test Case1"); 
	 }
	 
	 @Test(groups="Smoke", timeOut=2)
	 public void testCase2() {
	   System.out.println("This is the A Normal Test Case2"); 
	 }
	 
	 @Test(groups="Sanity", description="this is just a description to this test method")
	 public void testCase() {
	   System.out.println("This is the A Normal Test Case"); 
	   Reporter.log("we are using default reporter class for logging purpose*******");
	 }
	 
	 @Test(dependsOnMethods = "test0", alwaysRun = true)
	 public void testCase0() {
	   System.out.println("This is the A Normal Test Case0"); 
	 }
	 
	 @Test(priority=0, dependsOnMethods = "testCase0")
	 public void test() {
	   System.out.println("This is the A Normal Test "); 
	 }
	 
	 @Test(groups="Regression", enabled=true)
	 public void test0() {
	   System.out.println("This is the A Normal Test0"); 
	 }
	 
	 @Test(dependsOnGroups = "Smoke")
	 public void test1() {
	   System.out.println("This is the A Normal Test1"); 
	 }
	 
	 @Test
	 public void test2() {
	   System.out.println("This is the A Normal Test2"); 
	   
	 }
	
	
	
	
	
}
