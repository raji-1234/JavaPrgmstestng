package testing;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenshotExample {
	public static WebDriver driver;
	public static void methodSS() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Src = driver.findElement(By.xpath("//div[text()='Drag me']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Src);
		WebElement Target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Src, Target).build().perform();
		TakesScreenshot obj = (TakesScreenshot) driver;
		File Image = obj.getScreenshotAs(OutputType.FILE);
		File Target1 = new File("screenshot.png");
		FileUtils.copyFile(Image, Target1);
		
	}
	public static void main(String[] args) throws Exception {
		
		ScreenshotExample.methodSS();

}
}