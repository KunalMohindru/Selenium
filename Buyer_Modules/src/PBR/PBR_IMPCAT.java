package PBR;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PBR_IMPCAT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Configuration of Chrome
		
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver1.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://my.indiamart.com/");
			//	driver.manage().window().fullscreen();

		        //Login function 
				
				driver.findElement(By.xpath("//*[@id=\"user_sign_in\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999868769");
				driver.findElement(By.id("logintoidentify")).click();
				Thread.sleep(2000);

				
		        // Locate Explore All industries section
				
				WebElement ImpCat = driver.findElement(By.xpath("//div [@class = 'slwrapper']"));
               
			/* Get text from the all industries element and match the name with required category 	
				If name gets matched then tap on element otherwise press next button for more categories
				*/

				
				while(true)
				{
				String categories = ImpCat.getText();
				System.out.println(categories);
				if(categories.contains("Contractors"))
				{	WebDriverWait wait = new WebDriverWait(driver, 60);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"sldrulHM\"]/li[51]/a/div/span/img")))).click();
					break;
				}
				
				else 
					driver.findElement(By.xpath("//i [@class = 'next-i']")).click();
				Thread.sleep (2000);
				}	
				
		//Opening of new tab 	yha par panga hai	
				Set <String> window= driver.getWindowHandles();
			System.out.println(window);
	/*		  java.util.Iterator<String> iterate = window.iterator();
			String firstwindow = iterate.next();
			String secondwindow = iterate.next();
			driver.switchTo().window(secondwindow);
			Thread.sleep (2000);
		//	WebDriverWait wait = new WebDriverWait(driver, 50);
			System.out.println(driver.getCurrentUrl());
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[1]/ul[1]/li[1]/span/a[1]")))).click();
			
	*/	
			
			
			
	// yaar yeh isse toh switch kar rha window 		
			 java.util.Iterator<String> iterate = window.iterator();
				String firstwindow = iterate.next();
				String secondwindow = iterate.next();
				driver.switchTo().window(secondwindow);

				
		// but yeh wale se nahin
			String firstwindow = window.iterator().next();
			String secondwindow = window.iterator().next();
			driver.switchTo().window(secondwindow);
			Thread.sleep (2000);
			System.out.println(driver.getCurrentUrl());
	}
	
	
	

}
