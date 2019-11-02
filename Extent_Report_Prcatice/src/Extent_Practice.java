import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Practice {

	  public static ExtentReports extent;
	  public static ExtentTest test; 
	   
/*	@BeforeTest
	 public void setReport() {
		//ExtentReports extent = new	ExtentReports("./reports/extent.html",true)
		//(System.getProperty("user.dir")+"\\ExtentReportResults.html")
		ExtentReports extent = new	ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		extent.addSystemInfo("Automation Tester", "Kunal Mohindru");
		ExtentTest test = extent.startTest("TestName");

		System.out.println(extent);
		System.out.println(test);
   }
	
*/	
	@Test
	public void doLogin() {
		
		ExtentReports extent = new	ExtentReports(System.getProperty("user.dir")+"/test-output/old/STMExtentReport.html", true);
		extent.addSystemInfo("Automation Tester", "Kunal Mohindru");
		ExtentTest test = extent.startTest("TestName");
		extent.loadConfig((new File(System.getProperty("user.dir")+"\\extent-config.xml")));
        extent.addSystemInfo("Host Name", "Software testing Material");
		System.out.println(extent);
		
		System.out.println(test);
		
		test = extent.startTest("Login test");
		
		
		System.out.println(" Executing Login test");
		System.out.println(test);	
	    test.log(LogStatus.PASS, "Login successful");
	    System.out.println(test);	    

	}
	
/*	
	
	@Test (priority =2)
	public void doUserReg() {
		test = extent.startTest("UserReg test");
		System.out.println(" Executing UserReg test");
		test.log(LogStatus.PASS, "Login successful");
		System.out.println(test);
	}

	@Test (priority =3)
	public void isSkip() {
		test = extent.startTest("Skip test");
		System.out.println(" Executing Skip test");
		test.log(LogStatus.PASS, "Login successful");
		System.out.println(test);
	}
	
*/		
	@AfterMethod
	    public void teardown(ITestResult result) {
	     if (result.getStatus()==ITestResult.FAILURE) {
	    	
	    	 System.out.println("F0");
	    } else if (result.getStatus()==ITestResult.SKIP) {
			
	    	System.out.println("F1");
		} else if (result.getStatus()==ITestResult.SUCCESS) {
			
			System.out.println("F2");
			
		}
		
		extent.endTest(test);
	    }

	@AfterTest
	public void endreport(){
		extent.flush();
		extent.close();
		
	}
	
	    }
	
