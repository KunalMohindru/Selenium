import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Mouse_Hover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input [@title = 'Search']")).sendKeys("way2automation");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input [@value = 'Google Search'])[1]")))).click();
		driver.findElement(By.xpath("(//a [@href ='http://www.way2automation.com/'])[1]")).click();;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions hover = new Actions(driver);
		hover.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[8]/a"))).perform();
		
		
	}

}
