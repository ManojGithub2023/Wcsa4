package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 {
	static WebDriver driver;
  @Test(description = "This Test Case is for SQL")
  public void sql() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("http://www.google.com");
	  driver.switchTo().activeElement().sendKeys("SQL");
	  Reporter.log("This is sql method!!");
  }
}