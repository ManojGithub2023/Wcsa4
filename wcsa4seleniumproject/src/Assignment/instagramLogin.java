package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instagramLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("kaka");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("kaka123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas']")).click();
		driver.close();
		

	}

}
