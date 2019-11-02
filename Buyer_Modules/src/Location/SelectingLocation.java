package Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingLocation {

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
				
		        // Search Product	
				
				driver.findElement(By.id("search_string")).sendKeys("Solar Panel");
				driver.findElement(By.id("btnSearch")).click();
				driver.findElement(By.xpath("//*[@id=\"topCity\"]/li[3]/a")).click();
				


	}

}
