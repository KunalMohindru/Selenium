package SendEnquiry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard_Get_Best_Price {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://my.indiamart.com/");
		
		//Login function 
		
		
		        WebDriverWait wait = new WebDriverWait(driver, 120);
		        driver.findElement(By.xpath("//*[@id=\"user_sign_in\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999868769");
				driver.findElement(By.id("logintoidentify")).click();
				Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("rec_item_mainnew")).findElement(By.xpath("//a [contains (@onclick, 'getquotes')]")))).click();
				

	}

}
