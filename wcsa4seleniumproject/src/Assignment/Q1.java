package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	// how to handle child browser?
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		System.out.println("------------------------------------------");
		
		Set<String> allHandle = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String wh:allHandle) {
			System.out.println(wh);
			if(!parentHandle.equals(wh)) {
				driver.switchTo().window(wh).close();
			}
			else 
			{
		}
	}

}
	}
