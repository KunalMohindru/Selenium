import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Element_present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	boolean k = driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed();	
	if (k = true)
		System.out.println("Present");
	else 
		System.out.println(" Not Present");
	}
	

}
