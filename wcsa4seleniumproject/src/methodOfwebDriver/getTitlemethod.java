package methodOfwebDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitlemethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		String TitleOfWabPage = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(TitleOfWabPage);	
		driver.close();
	}
}
