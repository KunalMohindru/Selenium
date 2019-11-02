package For_Fun;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Tables {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\1\\chromedriver.exe");		
WebDriver driver = new ChromeDriver();
driver.get("http://demo.guru99.com/test/web-table-element.php");

List <WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
System.out.println(columns.size());

List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
System.out.println(rows.size());


for (int i=0;i<rows.size();i++)
{	
	List <WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[i]"));

	for (int j=0;i<columns.size();j++)
	System.out.println(col.get(j).getText());
System.out.println();
}
}
}
