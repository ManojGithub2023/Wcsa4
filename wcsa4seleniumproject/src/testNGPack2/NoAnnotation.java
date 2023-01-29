package testNGPack2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotation {
  @Test
  public void test() {
	  Reporter.log("@Test Annotation",true);
  }
  
  @BeforeSuite
  public void beforerSuite() {
	  Reporter.log("@BeforeSuite Annotation",true);
  }
  @BeforeTest
  public void beforerTest() {
	  Reporter.log("@BeforeTest Annotation",true);
  }
  
  
  @BeforeMethod
  public void beforerMethod() {
	  Reporter.log("@BeforeMethod Annotation",true);
  }
  
  @BeforeClass
  public void beforerClass() {
	  Reporter.log("@BeforeClass Annotation",true);
  }
  
  @Test
  public void test1() {
	  Reporter.log("@Test2 Annotation",true);
  }
  
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("@AfterMethod Annotation",true);
  }
  
  @AfterClass
  public void afterClass() {
	  Reporter.log("@AfterClass Annotation",true);
  }
  
  @AfterTest
  public void afterTest() {
	  Reporter.log("@AfterTest Annotation",true);
  }
  
  @AfterSuite
  public void afterSuite() {
	  Reporter.log("@AfterSuite Annotation",true);
  }
  
}
