package methodOfwebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://laptop-0f05vlcn/login.do");
    Thread.sleep(2000);
    WebElement uasernameTextbox=driver.findElement(By.name("username"));
    uasernameTextbox.sendKeys("admin");
    System.out.println(uasernameTextbox);
    driver.close();	}

}
