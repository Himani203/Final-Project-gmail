package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test1{
  PageFile pf = new PageFile();
    
     @BeforeTest 
     public void beforeTest() throws Exception {
    	pf.openBrowser();
    	pf.openURL();
     }
     
     @Test (priority = 1)
     public void InvalidUser() throws InterruptedException{
     	pf.InvalidUser();
     }
     
     @Test (priority = 2)
     public void invalidPwd() throws InterruptedException{
     	pf.invalidPwd();
     }
     
    @Test (priority=3)
     public void GmailLogin() throws InterruptedException{
 	   pf.Gmail_Login();
     }
    
  @Test (priority=4)
    public void CountEmail() throws InterruptedException {
    	pf.countEmail();
    }
   
  @Test (priority =5 )
  public void TotalInboxEmail() throws InterruptedException{
  	   pf.totalInboxEmail();  
  }
     
  @Test (priority = 6)
  public void moveToTrash() throws InterruptedException{
  	 pf.moveToTrash();
  }
  
 @Test (priority = 7)
  public void MoveBackToInbox() throws InterruptedException{
     pf.moveBackToInbox(); 	
  }
  
  @Test (priority = 8)
  public void markAsUnread() throws InterruptedException{   
	 	pf.markAsUnread();
	 	pf.markAsRead();
  }
  
  
  @Test (priority = 9)
  public void markAsread() throws InterruptedException{   
	 	pf.markAsRead();
  }
  
  @AfterTest
  public void afterMethod() throws Exception {
		pf.closeBrowser();
		
	}
  
     }
