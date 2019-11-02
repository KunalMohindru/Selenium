package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Objects.Enquiry_PDP;
import Objects.Login;
import Objects.Search_Prod;

public class TestCase {

	    public static WebDriver driver = null ;
	    
   //  Report
	    //public ExtentHtmlReporter htmlReporter;
	    public static ExtentReports extent;
	    public static ExtentTest test; 
	   
	@BeforeTest
	 public void setReport() {
		
		ExtentReports extent = new	ExtentReports("./reports/extent.html",true);
		extent.addSystemInfo("Automation Tester", "Kunal Mohindru");
		ExtentTest test = extent.startTest("TestName");
	
     }
	
/*	@AfterTest
	 public void endReport() {
		
		extent.flush();	
	 }
*/	
	    
	 @Test(priority=1, groups = "One launch")
	    public void setup(){
           
    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\1\\Latest\\chromedriver.exe");
   		
	        driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	        driver.get("https://my.indiamart.com/");
            }

    @Test(priority=1, groups = "One launch")

	    public void test_verifytitle()
	    {  
    	test = extent.startTest("Login Test");  // Reporting
    	
    	Login objLogin;  // Object of Login class

	    //Create Login Page object
	   
	    objLogin = new Login(driver);

	    //Verify login page title

	    String loginPageTitle = objLogin.getLoginTitle();

	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("indiamart"));
	    
	    objLogin.signin("9999868769");
	    
	    }	
	    
	/*    @Test(priority=2, groups = "One launch")
	     public void serch_result()
	    {   test = extent.startTest("Search Product Test");  // Reporting
	    	Search_Prod objSearch;
	    	objSearch = new Search_Prod(driver);
	    	boolean m = objSearch.search("Parker Pen");
	    	Assert.assertTrue(m);
	    }
	    
	    @Test (priority = 3, groups = "One launch")
	    public void enquiry()
	    {   test = extent.startTest("Enquiry Post Test");  // Reporting
	    	Enquiry_PDP objEnq; 
	    	objEnq = new Enquiry_PDP (driver);
	    	objEnq.postEnquiry();
	    	objEnq.VerifyOnMBR("Parker pen");
	    	
	    }
*/	    
	    @AfterMethod
	    public void teardown(ITestResult result) {
	     if (result.getStatus()==ITestResult.FAILURE) {
	    	 
	    } else if (result.getStatus()==ITestResult.SKIP) {
			
		} else if (result.getStatus()==ITestResult.SUCCESS) {
			
			String methodname = result.getMethod().getMethodName();
			
		}
	    	 
	    }
	   
}
