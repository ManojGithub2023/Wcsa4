package JavaScriptExecutes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/WCSA4/disabled.html");
		
		
	}

}
