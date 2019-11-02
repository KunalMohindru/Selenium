package Feedback;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Feedback_Dashboard {

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
   
        Thread.sleep(30000);
     
		Actions scroll  = new Actions(driver);
		WebElement feedback = driver.findElement(By.xpath("//*[@id=\"sag\"]/ul/li[2]/a[2]"));
		scroll.moveToElement(feedback).perform();
		feedback.click();
	
	// FeedBack Form
		
		driver.findElement(By.xpath("//input [@id = 'feedback-title']")).sendKeys("Feedback Title");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea [@id = 'feedback-desc']")).sendKeys("FeedBack Description");
		driver.findElement(By.xpath("//*[@id=\"feedback-form\"]/div[1]/div[4]/input")).click();
	
	}

}
