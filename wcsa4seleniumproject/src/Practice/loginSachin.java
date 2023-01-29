package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class loginSachin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedg.driver", "./drivers.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("sachin tendulkar",Keys.ENTER);
		Thread.sleep(2000);
		//driver.switchTo().activeElement().sendKeys("king cobra",Keys.ENTER);
		driver.findElement(By.className("iUh30 qLRx3b tjvcx")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
