package Payments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payments_MyProfile {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://my.indiamart.com/");
		
		//Login function 
		
		
		        WebDriverWait wait = new WebDriverWait(driver, 120);
		        driver.findElement(By.xpath("//*[@id=\"user_sign_in\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999868769");
				driver.findElement(By.id("logintoidentify")).click();
				Thread.sleep(2000);
				
		// Tap on My Profile and payments
				
				Actions hover = new Actions(driver);
				hover.click(driver.findElement(By.xpath("//*[@id=\"wel_name\"]/a"))).perform();
				driver.findElement(By.xpath("//*[@id=\"sntid\"]/li[6]/a")).click();
				
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input [@id = 'passwordbtn1']")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("usr_pass")))).sendKeys("123456");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"submtbtn\"]")))).click();
				
				Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cust_mobile")))).sendKeys("9650095201");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cust_product")))).sendKeys("Product");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cust_amount")))).sendKeys("100");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"tab-1\"]/div[4]/button")))).click();
				
				
		// Payment Gateway Screen
				
				Thread.sleep(20000);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cardnumber")))).sendKeys("12345678");


	}

}
