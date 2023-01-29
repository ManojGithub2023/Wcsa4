package methodOfwebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(2000);

		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(4000);

		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));

		for (WebElement suggest:suggestions) {
			Object opt = suggest.getText();
			Thread.sleep(2000);
			System.out.println(opt);
			
		}
	}
}
