package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.facebook.com/?stype=lo&jlou=AfcZkIpC9LoqLHDopqYYZMjhjs9sT_Umk3HE3RJqKwF12XvNh3bfqqa5Fn4K4WroQj3f_UuvV0GPe9e5z88PEKcN9_Hkhos4tEKOo7HsxU1aRg&smuh=12047&lh=Ac8vICOCDmSPpyYVfM0");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("manoj");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("manoj123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		driver.close();

	}

}
