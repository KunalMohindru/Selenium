package PBR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PBR_Get_Quotes_Dashboiard {

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
		
				
	     //Get Quotes word		
				
	
                WebDriverWait wait = new WebDriverWait(driver, 60);
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a [contains(@onclick, 'openBlFormMY')]")))).click();	
                
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input [@value = 'Submit']")))).click();
				
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input [@value = 'Next']")))).click();
	}
						
                
	

}
