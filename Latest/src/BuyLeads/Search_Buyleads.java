package BuyLeads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_Buyleads {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://my.indiamart.com/");
		
		//Login function 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"user_sign_in\"]")))).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"mobile\"]")))).sendKeys("9999868769");
		driver.findElement(By.id("logintoidentify")).click();
		Thread.sleep(2000);
		

        Actions action = new Actions(driver);
        action.click(driver.findElement(By.xpath("//span [@id = 'hold']"))).perform();
        action.click(driver.findElement(By.xpath("//*[@id=\"bl\"]/a"))).perform();
        
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("search_string")))).sendKeys("Parker pen");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btnSearch")))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("passwordbtn1")))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("usr_password")))).sendKeys("123456");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("signWP")))).click();
        
        
        
		
	}

}
