package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	WebElement Table=driver.findElement(By.xpath("//table[@id='customers']"));
//	System.out.println(Table);
	
	List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	System.out.println("The no of Rows in the table is " + Rows.size());
	for(WebElement row:Rows) {
		System.out.println(row.getText());
	}
	List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	System.out.println("The no of Columns in the table is " + Columns.size());
	
	for(WebElement col:Columns) {
		System.out.println(col.getText());
	}
		//Find the county of the company Island Trading
	
	WebElement Country = driver.findElement(By.xpath("//td[text()='Island Trading']/following-sibling::td[2]"));
	System.out.println("The country for the company Island Trading is " + Country.getText());
	
	List<WebElement> HyperLinks = driver.findElements(By.xpath("//a"));
	System.out.println("The no of HyperLinks in this Page  is " + HyperLinks.size());
}
}
