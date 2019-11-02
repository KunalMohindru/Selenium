import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	for (int i=1;i<=5;i++)
	{
driver.findElement(By.xpath("//blockquote[1]/form/input[" + i + "]")).click();
					
	}
	}

}
