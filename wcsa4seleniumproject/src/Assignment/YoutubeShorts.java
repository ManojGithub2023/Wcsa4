package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeShorts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedg.driver", "./drivers.msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']")).click();
		Thread.sleep(2000);
		List<WebElement> nameOfShort = driver
				.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media'and(//span[@class='inline-metadata-item style-scope ytd-video-meta-block'])]/descendant::a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']"));
		Thread.sleep(2000);
		for (WebElement name : nameOfShort) {
			String p1 = name.getText();
			Thread.sleep(2000);
			System.out.println(p1);

		}
		//List<WebElement> views = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']/decendant::span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		//for(WebElement viewsOfShort:views) {
			//String p2 = viewsOfShort.getText();
		//	Thread.sleep(2000);
		//	System.out.println(p2);
		//}

	}
}
