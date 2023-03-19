package PageObjectManager;

import org.openqa.selenium.WebDriver;

import adactin.com.Baseclass.Baseclass;
import adactin.com.Locators.HomePage;
import adactin.com.Locators.LoginPage;

public class PageObjectManagar extends Baseclass{

	public PageObjectManagar(WebDriver driver) {
		this.driver=driver;
	}
	
	private LoginPage LoginPage;

	public LoginPage getLoginPage() {
		if (LoginPage==null) {
			LoginPage=new LoginPage(driver);
		}
		return LoginPage;
	}
	
	 HomePage HomePage;

	public HomePage getHomePage() {
		if (HomePage==null) {
			HomePage=new HomePage(driver);
		}
		return HomePage;
	}
	
	
	
}
