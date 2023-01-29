package mthodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get(
				"https://www.google.com/search?q=null+pointer+exception+in+java&rlz=1C1YTUH_enIN1014IN1014&oq=&aqs=chrome.4.35i39i362l8.129257936j0j7&sourceid=chrome&ie=UTF-8");

		 driver.findElement(By.linkText("https://docs.oracle.com")).click();
	}
}
