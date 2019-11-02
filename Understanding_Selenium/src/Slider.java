import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slider {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		Actions slide = new Actions(driver);
		//WebDriverWait wait = new WebDriverWait (driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span [@style = 'left: 0%;']"))));
		WebElement source = driver.findElement(By.xpath("//span [@style = 'left: 0%;']"));
		WebElement target = driver.findElement(By.xpath("//span [@style = 'left: 100%;']"));
slide.dragAndDrop(source, target).perform();

//SYNCHRONISATION ISSUE
	}

}
