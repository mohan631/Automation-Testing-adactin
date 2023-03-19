package PageObjectManager;

import org.openqa.selenium.WebDriver;

import Baseclass.Baseclass;
import Locators.LoginPage;
import Locators.SearchPage;

public class PageObjectManager extends Baseclass{
//public WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	private LoginPage LoginPage;
	public LoginPage getLoginPage() {
		if (LoginPage==null) {
			LoginPage= new LoginPage(driver);
		}
		return LoginPage;
	}
	
	private SearchPage SearchPage;
	public SearchPage getSearchPage() {
		if (SearchPage==null) {
			SearchPage=new SearchPage(driver);
		}
		return SearchPage;
	}
	
}
