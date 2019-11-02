import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args)  {

		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.wikipedia.org/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// driver.findElement(By.id("searchLanguage")).sendKeys("English");
	
	Select selectobj1 = new Select(driver.findElement(By.id("searchLanguage")));
	selectobj1.selectByIndex(11);
	
	}
	
	
}
