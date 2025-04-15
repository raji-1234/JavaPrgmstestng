package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsClassExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Src = driver.findElement(By.xpath("//div[text()='Drag me']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Src);
		WebElement Target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Src, Target).build().perform();
		
	}
	
}
