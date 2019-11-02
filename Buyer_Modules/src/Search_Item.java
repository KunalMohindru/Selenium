import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Item {

	public static void main(String[] args)  {

		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.indiamart.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"user_sign_in\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999868769");
	driver.findElement(By.id("logintoidentify")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.id("search_string")).sendKeys("Parker pen");
	driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
	
	
	
	}
}

