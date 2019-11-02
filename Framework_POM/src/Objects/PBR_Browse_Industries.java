package Objects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


 public class PBR_Browse_Industries {
 
	 	
       WebDriver driver;

   //    Browse ByIndustry Section
       
     By BrowseByIndustrySection = By.xpath("//div [@class = 'slwrapper']");  
       
public PBR_Browse_Industries(WebDriver driver) {
		
		this.driver = driver;
}

	
	
public void BrowseByIndustry()
{ WebDriverWait wait = new WebDriverWait(driver,60);

  //Wait for the page to get loaded

	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
           
	WebElement ImpCat = driver.findElement(By.xpath("//div [@class = 'slwrapper']"));
    
	/* Get text from the all industries element and match the name with required category 	
		If name gets matched then tap on element otherwise press next button for more categories
		*/

		
		while(true)
		{
		String categories = ImpCat.getText();
		System.out.println(categories);
		if(categories.contains("Housewares & Supplies"))
		{	
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"sldrulHM\"]/li[15]/a")))).click();
			break;
		}
		
		else 
			driver.findElement(By.xpath("//i [@class = 'next-i']")).click();
		try {
			Thread.sleep (2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
// As we click on category,new tab gets opened		
		
		Set <String> handles = driver.getWindowHandles();
//		System.out.println(handles.size());
        Iterator<String> iter = handles.iterator();
		String window1 = iter.next();
//		System.out.println(window1);
		
		String window2 = iter.next();
//		System.out.println(window2);
		
	driver.switchTo().window(window2);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/ul[1]/li[1]/span/a[1]")))).click();
   System.out.println("-------Browse By Industry working fine--------");

// PBR form on ImpCat page 
	
	WebElement PBR_Impcat = driver.findElement(By.xpath("//*[@id=\"t0102_inlineBL\"]/div"));
	wait.until(ExpectedConditions.visibilityOf(PBR_Impcat.findElement(By.xpath("//*[@id=\"t0102_submit\"]")))).click(); 	 		
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"t0102_submit\"]")))).click(); 
  
	System.out.println("-------PBR-IMPCAT working fine--------");
}
}

