import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindGmailElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser for selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com");
driver.manage().window().maximize();

WebElement k= driver.findElement(By.id("identifierId"));
k.sendKeys("kunal.mohindru@gmail.com");
WebElement button = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
button.click();
//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Password");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebDriverWait wait = new WebDriverWait(driver,5);
driver.findElement(By.name("password")).sendKeys("Password");
driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
System.out.println(driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div[2]/div[2]/content")).getText());
	}
	
}
