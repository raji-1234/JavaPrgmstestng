package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginTest {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement Email = driver.findElement(By.id("email"));
	Email.sendKeys("rajeshwari.404@gmail.com");
	WebElement Pwd = driver.findElement(By.id("pass"));
	Pwd.sendKeys("rajeshwari");
	WebElement LoginBtn = driver.findElement(By.name("login"));
	LoginBtn.click();
}
}
