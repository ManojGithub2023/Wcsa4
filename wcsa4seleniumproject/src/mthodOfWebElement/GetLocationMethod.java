package mthodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement downl = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Point poi = downl.getLocation();
		int xlocation = poi.getX();
		int ylocation = poi.getY();
		System.out.println("x= "+xlocation+" y= "+ylocation);
		driver.close();
	}

}
