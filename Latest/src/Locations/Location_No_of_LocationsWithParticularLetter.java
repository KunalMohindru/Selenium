package Locations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Location_No_of_LocationsWithParticularLetter {

	public static void main(String[] args) throws InterruptedException {

		
		//Configuration of Chrome
		
				System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
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
				driver.findElement(By.name("city_ss")).sendKeys("De");
				
				Thread.sleep(5000);
				
				List <WebElement> loc = driver.findElements(By.xpath("/html/body/div[8]/ul"));
				System.out.println(loc.size());
				
		    //   Select loc = new Select (driver.findElement(By.xpath("/html/body/div[8]")));
		      // loc.selectByVisibleText("Dewas");
				
				/// Problem arises here
				////how to print all the location values
				
				/*
				
				
				WebDriverWait wait = new WebDriverWait(driver,120);
			//	String LocName = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[8]")))).getText();
			//	String LocName = driver.findElement(By.xpath("//div [@class = 'ui-autocomplete ui-menu ui-widget ui-corner-all cls-city as_ui-widget-content']")).getText();
				
//				System.out.println(LocName);
		    Select LocNamfme = new Select (wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[8]")))));		
		    LocNamfme.getOptions().size();
		    
		    
		   
		  int k;  
		    for (int i=0; i<k;i++)
		    {   LocNamfme.get(k).getText();
		    	}

		 LocNamfme.selectByIndex(2);

			*/
			}

		}


	