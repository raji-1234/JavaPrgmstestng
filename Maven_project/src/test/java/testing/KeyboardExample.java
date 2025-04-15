package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardExample {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//enter Rajeshwari then ctrl a then delete then add rajeshwari choukimath
	WebElement Query = driver.findElement(By.name("q"));
	Query.sendKeys("Rajeshwari");
	Query.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	Query.sendKeys("Rajeshwari Choukimath");
}
}
