package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.simplilearn.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	// Tag Locator
			WebElement Header = driver.findElement(By.tagName("h1"));
			String HeaderVal = Header.getText();
			System.out.println(HeaderVal);
			
			
	//1 Link Text locator
	
	WebElement LinkText = driver.findElement(By.linkText("Login"));
	LinkText.click();
	String Title = driver.getTitle();
	System.out.println("The Tile of the page is = "+" "+ Title);
	//driver.navigate().back();
	//driver.close();
	
	// 2 Name Locator
	WebElement FirstName = driver.findElement(By.name("user_login"));
	FirstName.sendKeys("rajeshwari.404@gmail.com");
	
	// 3 Id Locator
	WebElement Password = driver.findElement(By.id("password"));
	Password.sendKeys("dadsgafdsg");
	
	// 4 Class Locator
	WebElement RememberMe = driver.findElement(By.className("rememberMe"));
	RememberMe.click();
	//driver.navigate().back();
	//
	WebElement LoginBtn = driver.findElement(By.name("btnlogin"));
	LoginBtn.click();
	
	// Print the error message
//	WebElement Error = driver.findElement(By.id("msg_box"));
//	String ErrorMsg = Error.getText();
//	System.out.println("Error message is " + ErrorMsg);

	//Get Current URL
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	
	// Partial Link Text Locator
	WebElement ForgotPwd = driver.findElement(By.partialLinkText("Forgot"));
	ForgotPwd.click();
}
}
