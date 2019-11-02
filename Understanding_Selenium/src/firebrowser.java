import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firebrowser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Sachdeva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   driver.get("https://www.indiamart.com/");
   System.out.println(driver.getTitle());
   driver.close();
	}

	
	
}
