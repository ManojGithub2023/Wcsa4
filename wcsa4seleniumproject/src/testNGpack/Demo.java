package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void Demo() 
  {
	  //System.out.println("This is Demo class!!");
	  Reporter.log("This is method of Demo classs!!",true);
  }
  
  @Test
  public void Demo1()
  {
	  Reporter.log("This is Demo1 method!! ",true);
  }
  
  @Test
  public void Demo2() {
	  
	  int a = 23;
	  int b = 2;
	  int res = a/b;
	  Reporter.log("This is Demo2 method!!",true);
  }
}
