package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(2000);
		WebElement scr = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.dragAndDrop(scr, target).perform();
		Thread.sleep(5000);
		
	}

}
