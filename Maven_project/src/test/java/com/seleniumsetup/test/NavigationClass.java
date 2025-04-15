package com.seleniumsetup.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationClass {
public static void main(String[] args) throws Exception {
	ChromeDriver cd = new ChromeDriver();
	String url="https://awesomeqa.com/ui/";
	cd.get(url);
	cd.manage().window().maximize();
	Thread.sleep(2000);
	String HomePage =cd.getTitle();
	System.out.println("The Home is "+HomePage);
	cd.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	Thread.sleep(4000);
	cd.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	String RegPage =cd.getTitle();
	System.out.println("The Registration Home is "+RegPage);
	Thread.sleep(2000);
	cd.navigate().back();
	String AgainBackToHomePage=cd.getTitle();
	System.out.println("Back to Home Page "+AgainBackToHomePage);
	if(HomePage.equalsIgnoreCase(AgainBackToHomePage)) {
		System.out.println("This TC is Passed");}
	
		else {
			System.out.println("This TC is Failed");
		}
	
	String Text=cd.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/span")).getText();
	System.out.println("The Phone number is "+""+Text);
	//cd.close();
	String CurrentURL=cd.getCurrentUrl();
	System.out.println("The current url is "+" "+CurrentURL);
	cd.close();
	}
}

