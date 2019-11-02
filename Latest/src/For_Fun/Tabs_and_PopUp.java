package For_Fun;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tabs_and_PopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
	    driver.get("https://www.hdfcbank.com/");
	    
	    WebDriverWait wait = new WebDriverWait (driver,20);
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img")))).click();
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("loginsubmit")))).click();
	    
	    Set <String> window = driver.getWindowHandles();
	    window.size();
	    
	    System.out.println(window.size());
	    java.util.Iterator<String> iter = window.iterator();
        String window_1 = iter.next();
        String window_2 = iter.next();
        System.out.println(window_1);
        System.out.println(window_2);
	    driver.switchTo().window(window_2); 
        
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")))).click();
	    
	    String st = wait.until(ExpectedConditions.alertIsPresent()).getText();
	    System.out.println(st);
	   
	    
	    
	    
	    
    

	    
	  /*  s
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Set<String> Handles = driver.getWindowHandles();
	    java.util.Iterator<String> iterate = Handles.iterator();
	    String first_window_id = iterate.next();
		  System.out.println("-----------first window------------");
		  System.out.println(first_window_id);
		
	    
	    driver.findElement(By.id("loginsubmit")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  
	  //2nd window  
	   Handles = driver.getWindowHandles();
	     iterate = Handles.iterator();
	     first_window_id = iterate.next();
	     String second_window_id = iterate.next();
		  System.out.println("-----------Second window------------");
		  System.out.println(first_window_id);
		  System.out.println(second_window_id);
		 
	 	 driver.switchTo().window(second_window_id);
	 	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	 
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"customertab1\"]/div[1]/div[1]/p[2]/strong/a/span")).click();
	

	  System.out.println("-----------Third window------------");
	  
	  Handles = driver.getWindowHandles();
	     iterate = Handles.iterator();
	     first_window_id = iterate.next();
	     second_window_id = iterate.next();
	     String third_window_id = iterate.next();
		 
		  System.out.println(first_window_id);
		  System.out.println(second_window_id);
		  System.out.println(third_window_id);
		  
		  driver.switchTo().window(third_window_id);
		  System.out.println(driver.getTitle());
	
	
	*/
	}
}


