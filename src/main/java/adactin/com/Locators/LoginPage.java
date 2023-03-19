package adactin.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adactin.com.Baseclass.Baseclass;

public class LoginPage extends Baseclass{

	public LoginPage(WebDriver cdriver) {
		this.driver=cdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "img[alt='AdactIn Group']")
	private WebElement Adactin_Logo;

	public WebElement getAdactin_Logo() {
		return Adactin_Logo;
	}
	
	@FindBy(id = "username")
	public WebElement Username;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id = "login")
	public WebElement login_btn;
	
	@FindBy(xpath = "//div[@class='auth_error']")
	public WebElement login_error_msg;
}
