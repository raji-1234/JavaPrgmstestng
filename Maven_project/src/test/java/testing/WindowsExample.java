package testing;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Example  for New Tab
	
	WebElement TabButton = driver.findElement(By.xpath("//button[@id='tabButton']"));
	TabButton.click();
	//Set<String> Windows = driver.getWindowHandles();
	//List<String> AllWindows = new ArrayList<String>(Windows);
	//or
	List<String> AllWindows = new ArrayList<String>(driver.getWindowHandles());
	
	String Parent = AllWindows.get(0);
	String Child = AllWindows.get(1);
	driver.switchTo().window(Child);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement Header = driver.findElement(By.tagName("h1"));
	System.out.println("The Header of new Tab is "+ " " + Header.getText());
	
	// only close the current window
	driver.close();
	driver.switchTo().window(Parent);
			
	// this will close all the windows opened by selenium
	//driver.quit();

	//Example  for New Window
	WebElement WindowButton = driver.findElement(By.xpath("//button[@id='windowButton']"));
	WindowButton.click();
	AllWindows = new ArrayList<String>(driver.getWindowHandles());
	Parent = AllWindows.get(0);
	Child = AllWindows.get(1);
	driver.switchTo().window(Child);
	Header = driver.findElement(By.tagName("h1"));
	System.out.println("The Header of new Window is "+ " " +Header.getText());
	driver.close();
	driver.switchTo().window(Parent);
	
}
}
