import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard 

{
	

public static void main(String[] args) 

{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
	WebDriver driver = new ChromeDriver();
		
    driver.get("https://accounts.google.com");
    driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("Hem");
    driver.findElement(By.xpath("//*[@id=\"headingText\"]")).click();
    
 Actions ctrlA= new Actions(driver);   
 ctrlA.sendKeys(Keys.chord(Keys.CONTROL + "a")).perform();
 ctrlA.sendKeys(Keys.chord(Keys.CONTROL + "c")).perform(); 
 driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(Keys.chord(Keys.CONTROL + "v")); 

}

}
