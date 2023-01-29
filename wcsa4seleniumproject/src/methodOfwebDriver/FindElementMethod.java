package methodOfwebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=u3bw0eua68ny");
		

		Thread.sleep(2000);
		 WebElement usernameTextbox = driver.findElement(By.name("username"));
		 usernameTextbox.sendKeys("admin");
		 System.out.println(usernameTextbox);
		 driver.close();
	}
	
}
