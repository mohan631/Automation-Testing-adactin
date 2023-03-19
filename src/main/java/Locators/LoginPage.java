package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class LoginPage extends Baseclass{
//public WebDriver driver;

public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(css = "img[src='img/AdactIn_logo.png']")
public WebElement Adaction_logo;

@FindBy(id = "username")
public WebElement Username; 

@FindBy(id = "password")
public WebElement Password;

@FindBy(id="login")
public WebElement Login_btn;

@FindBy(xpath = "//div[@class='auth_error']")
public WebElement LoginError;
	
}
