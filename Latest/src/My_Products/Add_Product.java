package My_Products;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Product {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://my.indiamart.com/");
		Thread.sleep(5000);
		
		//Login function 
		
				driver.findElement(By.xpath("//*[@id=\"user_sign_in\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999868769");
				driver.findElement(By.id("logintoidentify")).click();
				Thread.sleep(5000);
				
		// Tap on sell on IM
				
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("sellTool")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("passwordbtn1")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("usr_password")))).sendKeys("123456");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("signWP")))).click();
				
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("close_email")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("product_nav")))).click();
				
				Thread.sleep(4000);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"addProduct\"]/span")))).click();
	
		// Add Products		
				
				Thread.sleep(4000);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("item_name")))).sendKeys("Products12345");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"in_pc_item_fob_price\"]")))).sendKeys("100");				
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"in_pc_item_moq_unit_type\"]")))).sendKeys("Roll");	
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("save_add")))).click();
			
}
}