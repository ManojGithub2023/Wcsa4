package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedg.driver", "./drivers.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Selenium Server (Grid)']")).click();
		Thread.sleep(2000);
		//driver.close();

	}
}
