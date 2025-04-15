package swagLab_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swagLab_test.BaseClass;

public class LoginPage {
	WebDriver driver=BaseClass.driver; 
	
	//============================Locators=======================================
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement LoginButton;
	
	
	//==========================Methods=======================================
	
	//constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunction(String UserNameVal,String PasswordVal) {
		
		Username.sendKeys(UserNameVal);
		Password.sendKeys(PasswordVal);
		LoginButton.click();
	}
}
