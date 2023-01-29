package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedg.driver", "./drivers.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("manoj");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("manoj@123");
		Thread.sleep(2000);
		driver.close();

	}

}
