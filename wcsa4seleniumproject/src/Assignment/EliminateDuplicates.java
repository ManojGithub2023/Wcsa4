package Assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javapr.Hashset;

public class EliminateDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/WCSA4/MultipleDropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropdown);
		// to get options of dropdown
		List<WebElement> alloptions = sel.getOptions();
		
		HashSet<String> s =new HashSet<String>();
		for(int i=0;i<alloptions.size();i++)
		{
			WebElement opts = alloptions.get(i);
			String value = opts.getText();
			
			s.add(value);
		}
		
		for(String options:s)
		{
		System.out.println(options);	
		}
		

	}

}
