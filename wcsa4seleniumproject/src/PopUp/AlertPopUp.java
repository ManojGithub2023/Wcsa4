package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/HP/OneDrive/Desktop/WCSA4/Alertpopup.html");

		WebElement button = driver.findElement(By.xpath("//button[.='Click me! ']"));
		button.click();
		
		// now switch ur control to alert pop up
		Alert al = driver.switchTo().alert();
		
		// accept the Alert pop up
		Thread.sleep(2000);
		al.accept();
		
		// dismiss the alert pop up
		//al.dismiss();
		
		//text of alert pop up
		//String textOfalert = al.getText();
		//System.out.println(textOfalert);
		
		
		//al.sendKeys("admin");
		Thread.sleep(2000);
		driver.close();
	}

}
