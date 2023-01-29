package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/HP/OneDrive/Desktop/WCSA4/Confirmationpopup.html");
		
		WebElement confirm = driver.findElement(By.xpath("//button[.='Click me! ']"));
		confirm.click();
		
		Alert con = driver.switchTo().alert();
		
		//to accept the pop up
		Thread.sleep(2000);
		con.accept();
		
		// to dismiss the pop up
		//con.dismiss();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
