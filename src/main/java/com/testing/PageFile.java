package com.testing;

import java.util.concurrent.TimeUnit;

import org.junit.rules.ErrorCollector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFile extends LocatorsFile implements DataFile{

	public WebDriver driver;
	public ErrorCollector error = new ErrorCollector();
	
	//Open Browser
	public void openBrowser() throws InterruptedException {
		
	    String projectPath = System.getProperty("user.dir");
	    String chromeDriverPath = projectPath + "\\Project_Data\\Drivers\\chromedriver.exe";
	    
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		
		//Setup Driver Property
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		PageFactory.initElements(driver, this);	

	}
	// Close Browser
	public void closeBrowser() {		
		driver.quit();
	}
	
	//Open Gmail Page
	public void openURL() throws Exception {	
		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(2000);
	}

	//Login with Invalid Id
	public void InvalidUser() throws InterruptedException{
		 email.sendKeys(invalid);
		//email.sendKeys("ankwfejgigmkdfm@gmail.com");
		login.sendKeys(Keys.ENTER);
		
		String ErrorMsg= UserErrorMsg.getText();
    	String gotMsg = "Couldn’t find your Google Account";
    	
    	if (ErrorMsg.equals(gotMsg)) {
    	    System.out.println("Error Msg is There");
    	} else {
    	    System.out.println("No Error Msg");
    	}
    	
    	Thread.sleep(2000);
    	driver.navigate().refresh();
		
	}
	

	 public void invalidPwd() throws InterruptedException {

		  
			//Enter valid user name
		    //email.sendKeys("hups3624@gmail.com");
			email.sendKeys(valid);
			login.sendKeys(Keys.ENTER);
	    	Thread.sleep(2000);
	    	
	    	//Enter invalid password
	    	password.sendKeys(invalidpass);
	    	login1.sendKeys(Keys.ENTER);
	    	Thread.sleep(2000);
	    	
	    	String PswError = PassError.getText();
	    	String expectedMsg = "Wrong password. Try again or click Forgot password to reset it.";
	  	

	    	if (PswError.equals(expectedMsg)) {
	    	    System.out.println("Password Error Msg is There");
	    	} else {
	    	    System.out.println("No Password Error Msg");
	    	}
	    	
	    	
	    	Thread.sleep(2000);
			
	    	 driver.navigate().refresh();
		}
	    
	
	// Login with correct credential
    public void Gmail_Login() throws InterruptedException {
	
	//Thread.sleep(000);		
	//email.sendKeys("hups3624@gmail.com");
    //login.click();		
    //Thread.sleep(000);
	//password.sendKeys("Krishna@2024");
    password.sendKeys(validpass);
    login1.click();
    
    }
   
  //Count emails on your first page of Inbox and print the count on console.
    
  public void countEmail() throws InterruptedException {
			
	  String totalEmail = mail.getText();
		System.out.println("Total emails in this page : " + totalEmail);
		
				
  }
  
  //Total Number of email in whole Inbox 
		 
 public void totalInboxEmail() throws InterruptedException {
			
			WebElement TotalEmail = totalEmail;
			System.out.println("Total emails = "+TotalEmail.getText());		
			
		}

 
 public void moveToTrash() throws InterruptedException {
	    
		Select.click();
		Thread.sleep(1000);
		System.out.println("Email opened");
		Delete.click();
		Thread.sleep(1000);
		System.out.println("Email Deleted");
		
		WebElement TotalEmail = totalEmail;
		System.out.println("Total emails after delete in inbox are = "+TotalEmail.getText());			
	 
	}
 
	 //WebElement checkBox;
 public void moveBackToInbox() throws InterruptedException {
	   
	    more.click();
	    Thread.sleep(1000);
	   
	    bin.click();
		Thread.sleep(1000);
		
        selectfrom.click();
        Thread.sleep(1000);
        
		moveTo.click();
	    Thread.sleep(1000);
		
	  
	    MtoBox.sendKeys("Inbox");
		Thread.sleep(1000);
		MtoBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	 
		
		Inbox.click();
		Thread.sleep(1000);


		WebElement TotalEmail = totalEmail;
		System.out.println("Total number of emails after getting back email from the Trash to InBox = "+TotalEmail.getText());		
		
 }	
  
 public void markAsUnread() throws InterruptedException {
		
	    Select.click();
		Thread.sleep(1000);
  
		UnRead.click();
		Thread.sleep(1000);
		
		//verify the msg
		
		String verifyUnread = VerifyUnread.getText();
    	String expectedMsg = "Conversation marked as unread.";
    	
    	if (verifyUnread.equals(expectedMsg)) {
    	    System.out.println("-------Test Pass --------(Msg is Unread)");
    	} else {
    	    System.out.println("--------Test Fail---------");
    	}
    	
 
 }
 
 
 public void markAsRead() throws InterruptedException {
	    
	    Select1.click();
		Thread.sleep(1000);
		
	   Read.click();
	   Thread.sleep(1000);
	 
	   String verifyRead = VerifyRead.getText();
       String expectedMsg = "Conversation marked as read.";
	   
       if (verifyRead.equals(expectedMsg)) {
   	    System.out.println("-------Test Pass --------(Msg is read)");
   	} else {
   	    System.out.println("--------Test Fail---------");
   	    
   	}
   	
	   
	   
 }
}
 

    

    
   
 