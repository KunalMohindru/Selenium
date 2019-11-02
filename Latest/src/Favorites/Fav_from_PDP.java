
package Favorites;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fav_from_PDP {

public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\1\\chromedriver.exe");
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
				
		//PDP page
				
				driver.findElement(By.xpath("//*[@id=\"LST1\"]/div/div[1]/div[2]/a[1]/h3")).click();	
				Set <String> window = driver.getWindowHandles();  
				Iterator<String> Iter = window.iterator(); 
				String firstwindow = Iter.next();
				String secondwindow = Iter.next();
				System.out.println(firstwindow);
				System.out.println(secondwindow);
				driver.switchTo().window(secondwindow);
         
		// Tap on Favorite button
				
				WebDriverWait Wait = new WebDriverWait (driver, 50);
                Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img [@alt = 'mark as favourite']")))).click();
	
    }

}
