package PBR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBR_Search_Product {

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
		
		
// Search product in the field
		
	    WebElement Search = driver.findElement(By.xpath("//input [@id = 'search_string']"));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //Search.click();
        Search.sendKeys("Parker Pen");
		driver.findElement(By.xpath("//input [@value = 'Search']")).click();
		driver.findElement(By.xpath("//button [@id = 'dispid16930708348']")).click();
		driver.findElement(By.xpath("//input [@value = 'Next']")).click();
		driver.findElement(By.xpath("//input [@value = 'Next']")).click();
		
		
		

		

	}

}
