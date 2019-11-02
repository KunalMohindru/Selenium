package PBR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PBR_Dashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Configuration of Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.indiamart.com/");

	//Login function 
		
		driver.findElement(By.xpath("//*[@id=\"user_sign_in\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999868769");
		driver.findElement(By.id("logintoidentify")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input [@templateid = '0401']"))).sendKeys("Parker Pen");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"buy_lead_gen_form1\"]")).click();
		
		driver.findElement(By.xpath("//input [@id = 't0401_submit']")).click();;
		


	}

}
