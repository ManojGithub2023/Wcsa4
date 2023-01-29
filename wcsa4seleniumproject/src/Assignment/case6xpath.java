package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case6xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedg.driver", "./drivers.msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[.='₹10,499']")).click();
		driver.close();
		
		

		

	}

}
