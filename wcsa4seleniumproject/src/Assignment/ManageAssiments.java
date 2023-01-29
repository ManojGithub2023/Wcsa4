package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageAssiments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://drive.google.com/drive/folders/19gwPu4aTqYfL-tSkgdCEqTqY2iyGuUbj");
		Thread.sleep(2000);
		driver.close();

	}

}
