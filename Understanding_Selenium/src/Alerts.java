import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
			
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 
	 // Using normally   
	  
	    driver.findElement(By.name("proceed")).click();
	    
	    /*   
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
*/

	//Using Explicit Wait
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	    System.out.println(alert.getText());
	    alert.accept();

	    
	}

}
