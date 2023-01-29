package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void Remo() {
	  Reporter.log("This is remo method!!",true);
  }
  
  @Test
  public void Remo1() {
	  Reporter.log("this is remo1 method",true);
  }
  
  @Test
  public void Remo2() {
	  Reporter.log("this is remo2 method!!",true);
  }
}
