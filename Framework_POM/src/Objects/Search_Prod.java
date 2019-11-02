package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_Prod {

	WebDriver driver;
	By searchbox = By.id("search_string");
	By searchBTN = By.id("btnSearch");
	
	
	public Search_Prod(WebDriver driver) {
		
		this.driver = driver;
	}

	public boolean search(String prodName)
	{  
	   // Enter data in search box
	   WebDriverWait wait = new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchbox))).sendKeys(prodName);
       
       //Tap on search after entering prod name
       wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchBTN))).click();
	
      // When the page is loaded, verify whether the loaded result contains the name of product or not  
      String k  = driver.findElement(By.xpath("//*[@id=\"LST1\"]/div/div[1]/div[2]")).getText();
      boolean p = k.contains(prodName);
      return p;
     
	}
	
}
