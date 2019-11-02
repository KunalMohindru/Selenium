package PBR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PBR_through_Name_Profile {

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
				Thread.sleep(5000);
				
		Actions hover = new Actions(driver);
		hover.moveToElement(driver.findElement(By.xpath("//a [@class = 'rmv hrw anim zoomIn']"))).perform();
		WebDriverWait wait = new WebDriverWait(driver , 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"sntid\"]/li[3]/a")))).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"t0401prodtitle\"]")))).sendKeys("Cars");
		
		
		
		
		

	}

}
