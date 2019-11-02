package Messages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Message_already_existing_contact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://my.indiamart.com/");
		
		//Login function 
		
		
		        WebDriverWait wait = new WebDriverWait(driver, 120);
		        driver.findElement(By.xpath("//*[@id=\"user_sign_in\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999868769");
				driver.findElement(By.id("logintoidentify")).click();
				Thread.sleep(5000);
			
		// Tap on Messages
				
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span [@class = 'nme']")))).click();
				
				Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"passwordbtn1\"]")))).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("usr_pass")))).sendKeys("123456");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"submtbtn\"]")))).click();
				Thread.sleep(5000);

		// Select contact for messages screen
				
				driver.findElement(By.id("fetch_list")).findElement(By.xpath("//li [contains(@onclick, 'Pawan')]")).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("massage-text")))).sendKeys("Hey! how are you");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"res-mob1\"]/div[4]/div[3]/div[2]/div[3]/div/div[3]/span")))).click();
				
	}

}
