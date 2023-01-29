package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://pages.ebay.com/sellerinformation/news/sprupd16/view-item.html");
		
		driver.findElement(By.id("gh-ac")).sendKeys("titanic watch");
		driver.findElement(By.id("gh-btn")).click();
		
		driver.findElement(By.xpath("(//input[@class='checkbox__control'])[3]"));

	}

}
