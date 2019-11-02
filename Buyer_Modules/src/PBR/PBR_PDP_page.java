package PBR;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PBR_PDP_page {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Configuration of Chrome
		
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://my.indiamart.com/");

		//Login function 
				
				driver.findElement(By.xpath("//*[@id=\"user_sign_in\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999868769");
				driver.findElement(By.id("logintoidentify")).click();
				Thread.sleep(2000);
				
				
		// Search product in the field
				
				
				
			    WebElement Search = driver.findElement(By.xpath("//input [@id = 'search_string']"));
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
         //Search.click();

			    Search.sendKeys("Parker Pen");
			    driver.findElement(By.xpath("//input [@value = 'Search']")).click();
				WebDriverWait wait = new WebDriverWait(driver, 5);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3 [@class ='lg']")))).click();
				
		// Handling windows
				
				
				
		//		loop me panga hai
				
				Set <String> window = driver.getWindowHandles();
				  Iterator <String> iter = window.iterator();
				String firstwindow = iter.next();
				System.out.println(firstwindow);
				String secondwindow = iter.next();
				System.out.println(secondwindow);
				driver.switchTo().window(secondwindow);
				
				

		

	}

}
