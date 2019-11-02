import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReSizable {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		Actions resize= new Actions(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\\\"resizable\\\"]/div[3]")))).click();
		WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		resize.dragAndDropBy(resizable, 300, 100).perform();
	
		//SYNCHRONISATION ISSUE
		
		
		
	}
	
}
