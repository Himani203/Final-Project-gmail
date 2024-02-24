package com.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {

@FindBy (xpath = "//*[@id=\"identifierId\"]") public WebElement email;
//@FindBy(name = "identifier")WebElement email;
@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button") public WebElement login;	
//@FindBy(id ="identifierNext")WebElement login;
@FindBy (xpath = "//*[@id='password']/div[1]/div/div[1]/input")public WebElement password;
//@FindBy(name = "passwd")WebElement password;
@FindBy (xpath="//*[@id=\"passwordNext\"]/div/button") public WebElement login1;
//@FindBy(id = "passwordNext")WebElement login1;
@FindBy (xpath = "//div[@class=\"LXRPh\"]/div[2]/div") public WebElement UserErrorMsg;
@FindBy (xpath = "//div[@class=\"CxRgyd\"]/div/div/div[2]/div[2]/span") public WebElement PassError;
@FindBy (xpath = "//div[@class='aeH']/div/div/div[2]/div/span/div/span/span[2]") public WebElement totalEmail;	
@FindBy(xpath= "//div[@class=\"Cr aqJ\"]/div/span/div/span/span[1]/span[2]") WebElement mail;
@FindBy(xpath = "//*[@class='yW']/span") WebElement Select;
@FindBy(xpath = "//*[@id=\":4\"]/div[2]/div[1]/div/div[2]/div[3]/div") WebElement Delete;

@FindBy (xpath = "//span[@class='CJ']") public WebElement more;
@FindBy (xpath = "//a[contains(@href,'https://mail.google.com/mail/u/0/#trash')]" ) public WebElement bin;

@FindBy(xpath ="//tbody/tr/td/div[1][contains(@role,'checkbox')]") WebElement selectfrom;
@FindBy (xpath = "//*[@id=\":1r\"]") public WebElement moveTo;
//@FindBy (xpath ="//*[@id=\":6d\"]") WebElement selectfrom;
@FindBy (xpath = "/html/body/div[27]/div/div[2]/input") public WebElement MtoBox;

@FindBy (xpath = "//a[contains(@href,'https://mail.google.com/mail/u/0/#inbox')]") public WebElement Inbox;
@FindBy (xpath = "//*[@id=\":4\"]/div[3]/div[1]/div/div[3]/div[1]/div") public WebElement UnRead;
@FindBy (xpath = "//*[@id=\":b\"]/div/div/div[2]/span/span[1]") public WebElement VerifyUnread;
@FindBy (xpath = "//*[@id=\":4\"]/div/div[1]/div[1]/div/div/div[3]/div[1]") public WebElement Read;
@FindBy (xpath = "//*[@id=\":b\"]/div/div/div[2]/span/span[1]") public WebElement VerifyRead;
@FindBy (xpath = "//*[@id=\":6i\"]") public WebElement Select1;

}
	