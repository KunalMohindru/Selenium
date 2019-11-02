import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Right_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.google.com/");
        Actions rclick= new Actions(driver);
        rclick.contextClick(driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[2]/div/span"))).perform();;
        

	}

}
