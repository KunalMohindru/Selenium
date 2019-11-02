package RecommendedProducts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recommended_Products_From_Delhi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Configuration of Chrome
		
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://my.indiamart.com/");

		     //Login function 
				
				driver.findElement(By.xpath("//*[@id=\"user_sign_in\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999868769");
				driver.findElement(By.id("logintoidentify")).click();
	
		// To rectify click error		
				Thread.sleep(10000);
		
		//Navigate to Recommended Products
				
				Actions scroll = new Actions(driver);
				WebElement recom = driver.findElement(By.xpath("//*[@id=\"recomcity\"]"));
				scroll.moveToElement(recom).perform();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
				
				

				}

}
