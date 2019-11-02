package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	WebDriver driver;
	
	By userName = By.xpath("//*[@id=\"mobilemy\"]");
    By SignInBtn = By.xpath("//*[@id=\"signInSubmitButton\"]");
	
	
// This function is called in test case class	

	public Login(WebDriver driver){

        this.driver = driver;
       
    }
	
   
//Get the title of Login Page
    
	public String getLoginTitle(){
 
 System.out.println(driver.getTitle());
 return driver.getTitle();

    }
	
//Set user name in textbox

    public void setUserName(String strUserName){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(userName))).sendKeys(strUserName);

    }
   
//Click on login button

    public void clickLogin(){

            driver.findElement(SignInBtn).click();

    }	

    public void signin(String strUserName) {
        
		//Fill user name
        this.setUserName(strUserName);


        //Click Login button
        this.clickLogin();     
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}

		}
 }

