package WePortalMakerSide;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicDetailsPage {
	public static WebDriver driver;
	//public static Robot rb;
	public static void OpenBrowser() {
		driver= new ChromeDriver();
		driver.get("https://mobileappsuat.idfcfirstbank.com/sit/agency/test/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
public static void FirstPage() throws Exception {
	
	WebElement ManagerId = driver.findElement(By.name("User Id"));
	ManagerId.sendKeys("003HE000000ydUkYAI");
	WebElement AddMember = driver.findElement(By.id("Add Member"));
	AddMember.click();
	
	//Switch to iframe
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe")));
	Thread.sleep(5000);
	WebElement ProfilePic = driver.findElement(By.xpath("//img[@alt='Upload ProfilePic']"));
	ProfilePic.click();
	
	  // Delay to give time for the file upload element to become active
     Thread.sleep(2000);

 // Set clipboard content with the file path
 StringSelection ss = new StringSelection("C:\\Users\\Lenovo\\Desktop\\Sachin's Wedding\\Testing Pics\\male.jpg");
 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
 Robot rb= new Robot();
// Press and release Ctrl+V to paste the file path from the clipboard
 rb.keyPress(KeyEvent.VK_CONTROL);
 rb.keyPress(KeyEvent.VK_V);
 rb.delay(2000);
 rb.keyRelease(KeyEvent.VK_CONTROL);
 rb.keyRelease(KeyEvent.VK_V);

 // Delay after pasting
 rb.delay(2000);

 // Press and release Enter to confirm the file selection
 rb.keyPress(KeyEvent.VK_ENTER);
 rb.keyRelease(KeyEvent.VK_ENTER);
 
 
 
//Enter Firstname
WebElement FirstName = driver.findElement(By.id("firstName"));
FirstName.sendKeys("Rajeshwari");
//Enter Lastname
WebElement LastName = driver.findElement(By.id("lastName"));
LastName.sendKeys("Choukimath");
	//Se;lect the DOB
	WebElement Calender = driver.findElement(By.xpath("//img[@id='datePickerdateOfBirth']"));
	Calender.click();
	WebElement DOB = driver.findElement(By.xpath("//span[text()='OK']"));
	DOB.click();
	//Enter PhoineNumber
	WebElement PhoneNumber = driver.findElement(By.id("primaryContactNumber"));
	PhoneNumber.sendKeys("2234143256");
	//Enter Address
	WebElement Address = driver.findElement(By.id("address"));
	Address.sendKeys("MG Road 11th cross,Vidyagiri,Bagalkot");
	//Enter City
	WebElement City = driver.findElement(By.id("City"));
	City.sendKeys("Bagalkot");
	//Enter State
	WebElement State = driver.findElement(By.id("select-state"));
	State.click();
	
	WebElement SelectState = driver.findElement(By.id("ANDHRA PRADESH"));
	SelectState.click();
	//Enter State
	WebElement StateRegion = driver.findElement(By.id("select-region"));
	StateRegion.click();
			
	WebElement StateRegion1 = driver.findElement(By.id("SOUTH"));
	StateRegion1.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500);");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addressProofUpload")));

	//Enter addressProofUploadIcon
	WebElement AddressProof = driver.findElement(By.id("addressProofUpload"));
	AddressProof.click();
	WebElement Passport = driver.findElement(By.xpath("//span[text()='Passport']"));
	Passport.click();
	Thread.sleep(2000);
	WebElement UploadPassport = driver.findElement(By.xpath("//input[@type='file']/parent::div"));
	UploadPassport.click();
	Thread.sleep(2000);
	 StringSelection ss1 = new StringSelection("C:\\Users\\Lenovo\\Desktop\\Sachin's Wedding\\Testing Pics\\male.jpg");
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
	
     rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
     rb.delay(2000);
     rb.keyRelease(KeyEvent.VK_CONTROL);
     rb.keyRelease(KeyEvent.VK_V);

     // Delay after pasting
     rb.delay(2000);

     // Press and release Enter to confirm the file selection
     rb.keyPress(KeyEvent.VK_ENTER);
     rb.keyRelease(KeyEvent.VK_ENTER);
     
     
     
   //Enter idProofUpload
		WebElement AddressProof1 = driver.findElement(By.id("idProofUpload"));
		AddressProof1.click();
		WebElement Passport1 = driver.findElement(By.xpath("//span[text()='Voter ID card']"));
		Passport1.click();
		Thread.sleep(2000);
		WebElement UploadPassport1 = driver.findElement(By.xpath("//input[@type='file']/parent::div"));
		UploadPassport1.click();
		Thread.sleep(2000);
		 StringSelection ss2 = new StringSelection("C:\\Users\\Lenovo\\Desktop\\Sachin's Wedding\\Testing Pics\\male.jpg");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	     rb.delay(2000);
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);

	     // Delay after pasting
	     rb.delay(2000);

	     // Press and release Enter to confirm the file selection
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	     rb.delay(2000);

	     
	     WebElement NextButton = driver.findElement(By.id("nextBasicDetails"));
	     NextButton.click();
	     System.out.println("Basic Details Page Passed "+ " " + driver.getTitle());
}

public static void SecondPage() throws Exception {
	
	WebElement highestQualification = driver.findElement(By.id("highestQualificationCourseName"));
	highestQualification.sendKeys("BE");
	WebElement QualificationYear = driver.findElement(By.id("highestQualificationYear"));
	QualificationYear.sendKeys("2019");
	WebElement highestUpload = driver.findElement(By.id("highestQualificationUpload"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();",highestUpload);
	
	
	highestUpload.click();
	Thread.sleep(4000);
	Robot rb = new Robot();
	rb.delay(2000);
	StringSelection ss = new StringSelection("C:\\Users\\Lenovo\\Desktop\\Sachin's Wedding\\Testing Pics\\male.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	rb.delay(2000);
	rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.delay(2000);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);

    // Delay after pasting
    rb.delay(2000);

    // Press and release Enter to confirm the file selection
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    rb.delay(2000);

	
	//DRA Upload
	
	WebElement DRAUpload = driver.findElement(By.id("DRAUpload"));
	DRAUpload.click();
	Thread.sleep(2000);
	rb.delay(2000);
	StringSelection ss1 = new StringSelection("C:\\Users\\Lenovo\\Desktop\\Sachin's Wedding\\Testing Pics\\male.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.delay(2000);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);

    // Delay after pasting
    rb.delay(2000);

    // Press and release Enter to confirm the file selection
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    rb.delay(2000);

	
	
	WebElement CARDUpload = driver.findElement(By.id("ID_CARDUpload"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", CARDUpload);
	CARDUpload.click();
	StringSelection ss2 = new StringSelection("C:\\Users\\Lenovo\\Desktop\\Sachin's Wedding\\Testing Pics\\male.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.delay(2000);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);

    // Delay after pasting
    rb.delay(2000);

    // Press and release Enter to confirm the file selection
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    rb.delay(2000);
}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OpenBrowser();
		FirstPage();
		SecondPage();
	}

}
