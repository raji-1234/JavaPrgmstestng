package testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//alertButton
		WebElement Button1 = driver.findElement(By.id("alertButton"));
		Button1.click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		System.out.println("Clicked Ok Button");
		
		//timerAlertButton
		WebElement Button2 = driver.findElement(By.id("timerAlertButton"));
		Button2.click();
		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(8000);
		alt2.accept();
		
		//confirmButton
		WebElement Button3 = driver.findElement(By.id("confirmButton"));
		Button3.click();
		Alert alt3 = driver.switchTo().alert();
		Thread.sleep(2000);
		//alt3.accept();
		alt3.dismiss();
		
		//promtButton
		WebElement Button4 = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Button4);
		Button4.click();
		Alert alt4 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		alt4.sendKeys("Rajeshwari");
		Thread.sleep(2000);
		//alt4.accept();
		alt4.accept();
		
		
	}

}
