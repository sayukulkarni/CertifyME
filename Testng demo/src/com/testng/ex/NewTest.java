package com.testng.ex;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test(enabled=false)
  public void test2() {
	  System.out.println("test2");
  }
  @Test
  public void test3() {
	  System.out.println("test3");
  }
 
 

 

 
 

}
