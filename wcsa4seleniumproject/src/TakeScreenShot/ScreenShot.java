package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.selenium.dev/downloads/");
	
	driver.findElement(By.xpath("//h1[.='Downloads']"));
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenShots/ScreenShot3.jpg");
	Files.copy(src, dest);
	
	
}
}
