import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class No_of_Elemts_Drop_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement websites = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]"));
	System.out.println(websites.findElements(By.tagName("a")));
	}
	
	
}
