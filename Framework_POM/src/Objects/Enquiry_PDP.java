package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Enquiry_PDP {
	
	WebDriver driver;

	//While posting PBR
	By Contact_Supplier = By.xpath("//*[contains(text(), 'Contact Supplier')]");
	By Next = By.xpath("//input [@value = 'Next']");
	By Cross = By.xpath("//*[@id=\"t0901_cls\"]");
	
	// For verification 
	
	By profile_name = By.xpath("//*[@id=\"lshead\"]");
	By home = By.xpath("//*[@id=\"sntid\"]/li[2]/a");
	By More_BTN= By.xpath("/html/body/div[3]/div/div/ul/li[5]/a");
	By Manage_Requirement = By.xpath("/html/body/div[3]/div/div/ul/li[5]/div/ul/li[1]/a");
	public Enquiry_PDP(WebDriver driver) {
		
		this.driver = driver;
	}


	public void postEnquiry(){ 
		WebDriverWait wait= new WebDriverWait (driver,20);
		
	//Tap on Contact Supplier button 
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(Contact_Supplier))).click();
	
	// Fill the PBR form	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(Next))).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(Next))).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	//Close the thank you screen    
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(Cross))).click();    
	}
	


	public void VerifyOnMBR(String prod) {
		
		//Tap on Profile name
		
		Actions hover = new Actions(driver);
		hover.moveToElement(driver.findElement(profile_name)).perform();
		WebDriverWait wait = new WebDriverWait(driver , 10);
		
		//Tap on Home
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(home))).click();

	    hover.moveToElement(driver.findElement(More_BTN)).perform();
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(Manage_Requirement))).click(); 
	
	    //Wait for OTP (enter manually)
	    
	    try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"check_verify1\"]")))).click();
	  
	  // On MBR screen verify the first card 

	    
	  WebElement post = driver.findElement(By.xpath("//*[@id=\"Listing1\"]"));
      String m = post.getText();
	  boolean b = m.contains(prod);

		  if( b== true);
		  System.out.println("Enquiry working fine");
		  	
	}

	
}
