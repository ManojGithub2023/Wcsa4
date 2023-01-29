package readExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://laptop-0f05vlcn/login.do");
		Flib flib = new Flib();
		int rc = flib.rowCount("./Data/ActiTimeTestData.xlsx", "Sheet2");
		for (int i = 1; i <= rc; i++) {
			String username = flib.readExcelData("./Data/ActiTimeTestData.xlsx", "Sheet2", i, 0);
			String password = flib.readExcelData("./Data/ActiTimeTestData.xlsx", "Sheet2", i, 1);

			WebElement user = driver.findElement(By.name("username"));
			user.sendKeys(username);
			WebElement pass = driver.findElement(By.name("pwd"));
			pass.sendKeys(password);

			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(2000);

			driver.findElement(By.name("username")).clear();
		}
		
	}

}
