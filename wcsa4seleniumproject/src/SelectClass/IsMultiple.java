package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("file:///C:/Users/HP/OneDrive/Desktop/WCSA4/MultipleDropdown.html");

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='menu']"));
		Select sel = new Select(dropdown);
		boolean status = sel.isMultiple();
		System.out.println(status);
	}
}
