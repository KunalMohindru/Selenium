import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Lecture86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser for selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("way2automation.com");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
	    List <WebElement> links = driver.findElements(By.tagName("a"));
	    
	    System.out.println(links.size());
	   /* for (int i=1;i<= links.size();i++)
	    {
	    	System.out.println (links.get(i).getText());
	    }*/
	    for (WebElement i: links)
	    { System.out.println(i.getText());
	    }
	    }
	    	
	}


