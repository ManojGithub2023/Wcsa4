package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.bluestone.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(2000);
		//switch control to frame
		
		driver.switchTo().frame("fc_widget");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();// clicking on chat box

	}

}
