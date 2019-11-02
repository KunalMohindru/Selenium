package SellOnIM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SellerTools {

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
		   
	Thread.sleep(10000);
	
				// Sell on IM 
				
				WebDriverWait wait = new WebDriverWait (driver, 150);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span [@id = 'sellTool']")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input [@id = 'passwordbtn1']")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("usr_password")))).sendKeys("123456");	
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("signWP")))).click();;
				
				
				
				
	}

}
