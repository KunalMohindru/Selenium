import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_Lecture86 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
//calling chrome		
		
        driver.get("http://way2automation.com/way2auto_jquery/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//calling website       
         
      driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select")).sendKeys("Austria");     
      driver.findElement(By.name("name")).sendKeys("bablu");
      driver.findElement(By.xpath("(//input [@value = 'Submit'])[2]")).click();
	}
	}
