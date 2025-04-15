package com.seleniumsetup.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new  EdgeDriver();
	String BaseURL = "https://awesomeqa.com/ui/";
	//FirefoxDriver f1 = new FirefoxDriver();
	driver.get(BaseURL);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String TitleOfThePage=driver.getTitle();
	System.out.println("The page title is =" + " " + TitleOfThePage);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.close();
}
}
