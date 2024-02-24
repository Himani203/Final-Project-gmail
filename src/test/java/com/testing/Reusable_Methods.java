package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Reusable_Methods {

	static WebDriver driver;
	
	public static void openBrowser() {
		
		/*
	    // Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TarakPatel\\eclipse-workspace\\Selenium_Automation_Project\\Project_Data\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		*/
		
	    String projectPath = System.getProperty("user.dir");
	    String chromeDriverPath = projectPath + "\\Project_Data\\Drivers\\chromedriver.exe";
	    
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
	    
	}
	
	public static void browserProperties() {
		
		// Browser Properties
		driver.manage().window().maximize(); // Maximize the browser
		driver.manage().deleteAllCookies(); // Delete cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS); // Give timeout to load the page
		
	}
	
	public static void openURL(String url) {
		
		// Open URL
		driver.get(url);
		System.out.println("Open Browser & Open URL...");
		
	}
	
	public static void closeBrowser() {
		
		// Close APP and Close Browser
		// driver.quit();	//It closes all the TABs of the Browser
		driver.close();	//It closes the current TAB of the Browser
		
	}
}
