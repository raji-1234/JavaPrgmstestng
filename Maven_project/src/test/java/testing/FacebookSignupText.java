package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement CreateAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateAcc.click();
		String Title1=driver.getTitle();
		System.out.println(Title1);
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("Rajeshwari");
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Lastname.sendKeys("Choukimath");
		
		// Find the select tag locator
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		
		// create the object for Select class and pass the locator in the constructor 
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("30");
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select ddMonth = new Select(Month);
		//ddMonth.selectByVisibleText("Sep");
		//ddMonth.selectByIndex(8);
		ddMonth.selectByValue("9");
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("1989");
		
		//Radio Button
//		WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
//		Female.click();
		
		//Dynamic Xpath
		String Gender= "Female";
		String genXPATH="//label[contains(text(),'"+Gender+"')]/input";
		WebElement GenderElement=driver.findElement(By.xpath(genXPATH));
		GenderElement.click();
		
		WebElement MobileOrEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		MobileOrEmail.sendKeys("2432465411");
		
		WebElement Password = driver.findElement(By.xpath("//input[@data-type='password']"));
		Password.sendKeys("242dffdgdggd");
		
		WebElement SignUp = driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		SignUp.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Error=driver.findElement(By.xpath("//div[@id='reg_error_inner']"));
		String ErrorMsg=Error.getText();
		System.out.println(ErrorMsg);
		
	}

}
