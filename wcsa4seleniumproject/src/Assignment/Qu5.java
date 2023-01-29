package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parentTitle = driver.getTitle();
		 Set<String> allHandle = driver.getWindowHandles();
		 {
			 for(String wh:allHandle) {
				 String currenttitle = driver.switchTo().window(wh).getTitle();
				 System.out.println(currenttitle);
				 if(!parentTitle.equals(currenttitle))
				 {
					 driver.manage().window().maximize();
				 }
				 
			 }
		 }
	}

}
