import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Link_frm_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      List <WebElement> websites=  driver.findElements(By.tagName("a"));
int k = websites.size();
for (int i=0; i<k;i++)
{   websites.get(k).getText();
	}
	}
}
