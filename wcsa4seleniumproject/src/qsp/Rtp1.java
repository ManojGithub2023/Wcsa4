package qsp;

import java.util.Scanner;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner pp = new Scanner(System.in);
		System.out.println("enter the browser name");
		String browserValue = pp.nextLine();
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Thread.sleep(4000);
			driver.close();
		} else if (browserValue.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.msedge.driver", "E:\\EdgeDriver\\85\\msedgedriver.exe");

			driver = new EdgeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Thread.sleep(4000);
			driver.close();

		} else {
			System.out.println("enter valid browser name");
		}

	}

}
